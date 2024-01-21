import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class35 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	private int anInt1523;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "J")
	private long aLong54 = -1L;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "J")
	private long aLong55 = -1L;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	private int anInt1525 = 0;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!pf;")
	private final Class63 aClass63_1;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "[B")
	private final byte[] aByteArray22;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "[B")
	private final byte[] aByteArray21;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!pf;II)V")
	public Class35(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass63_1 = arg0;
		this.aLong52 = this.aLong57 = arg0.method1380();
		this.aLong56 = 0L;
		this.aByteArray22 = new byte[arg1];
		this.aByteArray21 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([BI)V")
	public void method901(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method909(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)J")
	public long method904() {
		return this.aLong52;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	public void method906() throws IOException {
		this.method912();
		this.aClass63_1.method1379();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	private void method907() throws IOException {
		this.anInt1523 = 0;
		if (this.aLong56 != this.aLong53) {
			this.aClass63_1.method1382(this.aLong56);
			this.aLong53 = this.aLong56;
		}
		this.aLong55 = this.aLong56;
		while (this.anInt1523 < this.aByteArray22.length) {
			@Pc(46) int local46 = this.aClass63_1.method1383(this.anInt1523, this.aByteArray22.length - this.anInt1523, this.aByteArray22);
			if (local46 == -1) {
				break;
			}
			this.aLong53 += local46;
			this.anInt1523 += local46;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III[B)V")
	public void method908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong52 < (long) arg0 + this.aLong56) {
				this.aLong52 = (long) arg0 + this.aLong56;
			}
			if (this.aLong54 != -1L && (this.aLong56 < this.aLong54 || this.aLong54 + (long) this.anInt1525 < this.aLong56)) {
				this.method912();
			}
			if (this.aLong54 != -1L && (long) this.aByteArray21.length + this.aLong54 < this.aLong56 + (long) arg0) {
				@Pc(94) int local94 = (int) (this.aLong54 + (long) this.aByteArray21.length - this.aLong56);
				arg0 -= local94;
				Static140.method1345(arg2, arg1, this.aByteArray21, (int) (this.aLong56 - this.aLong54), local94);
				this.aLong56 += local94;
				this.anInt1525 = this.aByteArray21.length;
				arg1 += local94;
				this.method912();
			}
			if (this.aByteArray21.length < arg0) {
				@Pc(136) long local136 = -1L;
				@Pc(138) long local138 = -1L;
				if (this.aLong56 != this.aLong53) {
					this.aClass63_1.method1382(this.aLong56);
					this.aLong53 = this.aLong56;
				}
				this.aClass63_1.method1381(arg2, arg0, arg1);
				if (this.aLong55 <= this.aLong56 && (long) this.anInt1523 + this.aLong55 > this.aLong56) {
					local136 = this.aLong56;
				} else if (this.aLong56 <= this.aLong55 && this.aLong55 < this.aLong56 + (long) arg0) {
					local136 = this.aLong55;
				}
				if (this.aLong55 < this.aLong56 + (long) arg0 && this.aLong55 + (long) this.anInt1523 >= (long) arg0 + this.aLong56) {
					local138 = (long) arg0 + this.aLong56;
				} else if (this.aLong56 < (long) this.anInt1523 + this.aLong55 && (long) arg0 + this.aLong56 >= this.aLong55 + (long) this.anInt1523) {
					local138 = this.aLong55 + (long) this.anInt1523;
				}
				this.aLong53 += arg0;
				if (this.aLong53 > this.aLong57) {
					this.aLong57 = this.aLong53;
				}
				if (local136 > -1L && local138 > local136) {
					@Pc(320) int local320 = (int) (local138 - local136);
					Static140.method1345(arg2, (int) (local136 + (long) arg1 - this.aLong56), this.aByteArray22, (int) (local136 - this.aLong55), local320);
				}
				this.aLong56 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong54 == -1L) {
					this.aLong54 = this.aLong56;
				}
				Static140.method1345(arg2, arg1, this.aByteArray21, (int) (this.aLong56 - this.aLong54), arg0);
				this.aLong56 += arg0;
				if ((long) this.anInt1525 < this.aLong56 - this.aLong54) {
					this.anInt1525 = (int) (this.aLong56 - this.aLong54);
				}
			}
		} catch (@Pc(406) IOException local406) {
			this.aLong53 = -1L;
			throw local406;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III[B)V")
	public void method909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong54 != -1L && this.aLong56 >= this.aLong54 && (long) this.anInt1525 + this.aLong54 >= this.aLong56 - -((long) arg1)) {
				Static140.method1345(this.aByteArray21, (int) (this.aLong56 - this.aLong54), arg2, 0, arg1);
				this.aLong56 += arg1;
				return;
			}
			@Pc(75) long local75 = this.aLong56;
			@Pc(77) int local77 = arg1;
			@Pc(110) int local110;
			if (this.aLong55 <= this.aLong56 && this.aLong56 < (long) this.anInt1523 + this.aLong55) {
				local110 = (int) (this.aLong55 + (long) this.anInt1523 - this.aLong56);
				if (local110 > arg1) {
					local110 = arg1;
				}
				arg1 -= local110;
				Static140.method1345(this.aByteArray22, (int) (this.aLong56 - this.aLong55), arg2, 0, local110);
				this.aLong56 += local110;
				arg0 = local110;
			}
			if (arg1 > this.aByteArray22.length) {
				this.aClass63_1.method1382(this.aLong56);
				this.aLong53 = this.aLong56;
				while (arg1 > 0) {
					local110 = this.aClass63_1.method1383(arg0, arg1, arg2);
					if (local110 == -1) {
						break;
					}
					this.aLong56 += local110;
					this.aLong53 += local110;
					arg1 -= local110;
					arg0 += local110;
				}
			} else if (arg1 > 0) {
				this.method907();
				local110 = arg1;
				if (this.anInt1523 < arg1) {
					local110 = this.anInt1523;
				}
				Static140.method1345(this.aByteArray22, 0, arg2, arg0, local110);
				arg0 += local110;
				this.aLong56 += local110;
				arg1 -= local110;
			}
			if (this.aLong54 != -1L) {
				if (this.aLong56 < this.aLong54 && arg1 > 0) {
					local110 = arg0 + (int) (this.aLong54 - this.aLong56);
					if (local110 > arg0 + arg1) {
						local110 = arg1 + arg0;
					}
					while (arg0 < local110) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong56++;
					}
				}
				@Pc(300) long local300 = -1L;
				if (local75 <= this.aLong54 && this.aLong54 < local75 + (long) local77) {
					local300 = this.aLong54;
				} else if (this.aLong54 <= local75 && local75 < this.aLong54 + (long) this.anInt1525) {
					local300 = local75;
				}
				@Pc(345) long local345 = -1L;
				if (this.aLong54 + (long) this.anInt1525 > local75 && local75 + (long) local77 >= this.aLong54 + (long) this.anInt1525) {
					local345 = (long) this.anInt1525 + this.aLong54;
				} else if (this.aLong54 < (long) local77 + local75 && this.aLong54 + (long) this.anInt1525 >= local75 + (long) local77) {
					local345 = (long) local77 + local75;
				}
				if (local300 > -1L && local345 > local300) {
					@Pc(421) int local421 = (int) (local345 - local300);
					Static140.method1345(this.aByteArray21, (int) (local300 - this.aLong54), arg2, (int) (local300 - local75), local421);
					if (this.aLong56 < local345) {
						arg1 = (int) ((long) arg1 + this.aLong56 - local345);
						this.aLong56 = local345;
					}
				}
			}
		} catch (@Pc(469) IOException local469) {
			this.aLong53 = -1L;
			throw local469;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IJ)V")
	public void method910(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method911());
		}
		this.aLong56 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)Ljava/io/File;")
	private File method911() {
		return this.aClass63_1.method1384();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
	private void method912() throws IOException {
		if (this.aLong54 == -1L) {
			return;
		}
		if (this.aLong53 != this.aLong54) {
			this.aClass63_1.method1382(this.aLong54);
			this.aLong53 = this.aLong54;
		}
		@Pc(30) long local30 = -1L;
		@Pc(32) long local32 = -1L;
		this.aClass63_1.method1381(this.aByteArray21, this.anInt1525, 0);
		if (this.aLong55 < this.aLong54 + (long) this.anInt1525 && (long) this.anInt1523 + this.aLong55 >= (long) this.anInt1525 + this.aLong54) {
			local32 = (long) this.anInt1525 + this.aLong54;
		} else if (this.aLong55 + (long) this.anInt1523 > this.aLong54 && this.aLong54 + (long) this.anInt1525 >= this.aLong55 + (long) this.anInt1523) {
			local32 = this.aLong55 + (long) this.anInt1523;
		}
		if (this.aLong55 <= this.aLong54 && this.aLong55 + (long) this.anInt1523 > this.aLong54) {
			local30 = this.aLong54;
		} else if (this.aLong55 >= this.aLong54 && this.aLong55 < this.aLong54 + (long) this.anInt1525) {
			local30 = this.aLong55;
		}
		this.aLong53 += this.anInt1525;
		if (this.aLong53 > this.aLong57) {
			this.aLong57 = this.aLong53;
		}
		if (local30 > -1L && local32 > local30) {
			@Pc(209) int local209 = (int) (local32 - local30);
			Static140.method1345(this.aByteArray21, (int) (local30 - this.aLong54), this.aByteArray22, (int) (local30 - this.aLong55), local209);
		}
		this.anInt1525 = 0;
		this.aLong54 = -1L;
	}
}
