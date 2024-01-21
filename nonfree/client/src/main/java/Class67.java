import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class67 {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	private int anInt2776;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "J")
	private long aLong98 = -1L;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private int anInt2771 = 0;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "J")
	private long aLong103 = -1L;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!mg;")
	private final Class56 aClass56_1;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "[B")
	private final byte[] aByteArray22;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "[B")
	private final byte[] aByteArray21;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!mg;II)V")
	public Class67(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass56_1 = arg0;
		this.aLong100 = this.aLong102 = arg0.method1780();
		this.aLong101 = 0L;
		this.aByteArray22 = new byte[arg1];
		this.aByteArray21 = new byte[arg2];
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)V")
	public void method2168(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2175());
		}
		this.aLong101 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z[B)V")
	public void method2170(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method2172(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public void method2171() throws IOException {
		this.method2177();
		this.aClass56_1.method1784();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI[BI)V")
	public void method2172(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong98 != -1L && this.aLong101 >= this.aLong98 && this.aLong98 + (long) this.anInt2771 >= this.aLong101 + (long) arg0) {
				Static190.method1388(this.aByteArray21, (int) (this.aLong101 - this.aLong98), arg1, 0, arg0);
				this.aLong101 += arg0;
				return;
			}
			@Pc(77) long local77 = this.aLong101;
			@Pc(81) int local81 = arg0;
			@Pc(113) int local113;
			if (this.aLong103 <= this.aLong101 && (long) this.anInt2776 + this.aLong103 > this.aLong101) {
				local113 = (int) (this.aLong103 + (long) this.anInt2776 - this.aLong101);
				if (arg0 < local113) {
					local113 = arg0;
				}
				Static190.method1388(this.aByteArray22, (int) (this.aLong101 - this.aLong103), arg1, 0, local113);
				this.aLong101 += local113;
				arg0 -= local113;
				arg2 = local113;
			}
			if (arg0 > this.aByteArray22.length) {
				this.aClass56_1.method1783(this.aLong101);
				this.aLong99 = this.aLong101;
				while (arg0 > 0) {
					local113 = this.aClass56_1.method1779(arg2, arg1, arg0);
					if (local113 == -1) {
						break;
					}
					this.aLong99 += local113;
					this.aLong101 += local113;
					arg0 -= local113;
					arg2 += local113;
				}
			} else if (arg0 > 0) {
				this.method2178();
				local113 = arg0;
				if (arg0 > this.anInt2776) {
					local113 = this.anInt2776;
				}
				Static190.method1388(this.aByteArray22, 0, arg1, arg2, local113);
				arg2 += local113;
				this.aLong101 += local113;
				arg0 -= local113;
			}
			if (this.aLong98 != -1L) {
				if (this.aLong101 < this.aLong98 && arg0 > 0) {
					local113 = (int) (this.aLong98 - this.aLong101) + arg2;
					if (local113 > arg0 + arg2) {
						local113 = arg0 + arg2;
					}
					while (arg2 < local113) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong101++;
					}
				}
				@Pc(300) long local300 = -1L;
				if (local77 <= this.aLong98 && this.aLong98 < local77 + (long) local81) {
					local300 = this.aLong98;
				} else if (local77 >= this.aLong98 && local77 < (long) this.anInt2771 + this.aLong98) {
					local300 = local77;
				}
				@Pc(349) long local349 = -1L;
				if (this.aLong98 + (long) this.anInt2771 > local77 && (long) this.anInt2771 + this.aLong98 <= (long) local81 + local77) {
					local349 = this.aLong98 + (long) this.anInt2771;
				} else if (local77 + (long) local81 > this.aLong98 && (long) this.anInt2771 + this.aLong98 >= (long) local81 + local77) {
					local349 = local77 + (long) local81;
				}
				if (local300 > -1L && local349 > local300) {
					@Pc(428) int local428 = (int) (local349 - local300);
					Static190.method1388(this.aByteArray21, (int) (local300 - this.aLong98), arg1, (int) (local300 - local77), local428);
					if (local349 > this.aLong101) {
						arg0 = (int) ((long) arg0 + this.aLong101 - local349);
						this.aLong101 = local349;
					}
				}
			}
		} catch (@Pc(467) IOException local467) {
			this.aLong99 = -1L;
			throw local467;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBI[B)V")
	public void method2174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong100 < (long) arg1 + this.aLong101) {
				this.aLong100 = this.aLong101 + (long) arg1;
			}
			if (this.aLong98 != -1L && (this.aLong98 > this.aLong101 || this.aLong101 > this.aLong98 + (long) this.anInt2771)) {
				this.method2177();
			}
			if (this.aLong98 != -1L && this.aLong98 + (long) this.aByteArray21.length < this.aLong101 - -((long) arg1)) {
				@Pc(103) int local103 = (int) ((long) this.aByteArray21.length + this.aLong98 - this.aLong101);
				arg1 -= local103;
				Static190.method1388(arg2, arg0, this.aByteArray21, (int) (this.aLong101 - this.aLong98), local103);
				this.aLong101 += local103;
				arg0 += local103;
				this.anInt2771 = this.aByteArray21.length;
				this.method2177();
			}
			if (arg1 > this.aByteArray21.length) {
				if (this.aLong99 != this.aLong101) {
					this.aClass56_1.method1783(this.aLong101);
					this.aLong99 = this.aLong101;
				}
				@Pc(166) long local166 = -1L;
				this.aClass56_1.method1781(arg2, arg0, arg1);
				@Pc(175) long local175 = -1L;
				if ((long) arg1 + this.aLong101 > this.aLong103 && this.aLong101 + (long) arg1 <= this.aLong103 - -((long) this.anInt2776)) {
					local166 = this.aLong101 + (long) arg1;
				} else if ((long) this.anInt2776 + this.aLong103 > this.aLong101 && (long) arg1 + this.aLong101 >= (long) this.anInt2776 + this.aLong103) {
					local166 = (long) this.anInt2776 + this.aLong103;
				}
				if (this.aLong101 >= this.aLong103 && this.aLong101 < (long) this.anInt2776 + this.aLong103) {
					local175 = this.aLong101;
				} else if (this.aLong101 <= this.aLong103 && this.aLong103 < this.aLong101 + (long) arg1) {
					local175 = this.aLong103;
				}
				this.aLong99 += arg1;
				if (this.aLong102 < this.aLong99) {
					this.aLong102 = this.aLong99;
				}
				if (local175 > -1L && local175 < local166) {
					@Pc(334) int local334 = (int) (local166 - local175);
					Static190.method1388(arg2, (int) ((long) arg0 + local175 - this.aLong101), this.aByteArray22, (int) (local175 - this.aLong103), local334);
				}
				this.aLong101 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong98 == -1L) {
					this.aLong98 = this.aLong101;
				}
				Static190.method1388(arg2, arg0, this.aByteArray21, (int) (this.aLong101 - this.aLong98), arg1);
				this.aLong101 += arg1;
				if ((long) this.anInt2771 < this.aLong101 - this.aLong98) {
					this.anInt2771 = (int) (this.aLong101 - this.aLong98);
				}
			}
		} catch (@Pc(424) IOException local424) {
			this.aLong99 = -1L;
			throw local424;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)Ljava/io/File;")
	private File method2175() {
		return this.aClass56_1.method1782();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)J")
	public long method2176() {
		return this.aLong100;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	private void method2177() throws IOException {
		if (this.aLong98 == -1L) {
			return;
		}
		if (this.aLong98 != this.aLong99) {
			this.aClass56_1.method1783(this.aLong98);
			this.aLong99 = this.aLong98;
		}
		@Pc(42) long local42 = -1L;
		@Pc(44) long local44 = -1L;
		this.aClass56_1.method1781(this.aByteArray21, 0, this.anInt2771);
		this.aLong99 += this.anInt2771;
		if (this.aLong103 <= this.aLong98 && this.aLong98 < this.aLong103 + (long) this.anInt2776) {
			local44 = this.aLong98;
		} else if (this.aLong98 <= this.aLong103 && this.aLong103 < (long) this.anInt2771 + this.aLong98) {
			local44 = this.aLong103;
		}
		if (this.aLong98 + (long) this.anInt2771 > this.aLong103 && this.aLong103 + (long) this.anInt2776 >= (long) this.anInt2771 + this.aLong98) {
			local42 = this.aLong98 + (long) this.anInt2771;
		} else if (this.aLong103 + (long) this.anInt2776 > this.aLong98 && (long) this.anInt2776 + this.aLong103 <= this.aLong98 + (long) this.anInt2771) {
			local42 = this.aLong103 + (long) this.anInt2776;
		}
		if (this.aLong102 < this.aLong99) {
			this.aLong102 = this.aLong99;
		}
		if (local44 > -1L && local44 < local42) {
			@Pc(204) int local204 = (int) (local42 - local44);
			Static190.method1388(this.aByteArray21, (int) (local44 - this.aLong98), this.aByteArray22, (int) (local44 - this.aLong103), local204);
		}
		this.anInt2771 = 0;
		this.aLong98 = -1L;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	private void method2178() throws IOException {
		this.anInt2776 = 0;
		if (this.aLong99 != this.aLong101) {
			this.aClass56_1.method1783(this.aLong101);
			this.aLong99 = this.aLong101;
		}
		this.aLong103 = this.aLong101;
		while (this.aByteArray22.length > this.anInt2776) {
			@Pc(54) int local54 = this.aClass56_1.method1779(this.anInt2776, this.aByteArray22, this.aByteArray22.length - this.anInt2776);
			if (local54 == -1) {
				break;
			}
			this.anInt2776 += local54;
			this.aLong99 += local54;
		}
	}
}
