import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class134 {

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
	private int anInt3634;

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "J")
	private long aLong96;

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
	private int anInt3636 = 0;

	@OriginalMember(owner = "client!hca", name = "i", descriptor = "J")
	private long aLong94 = -1L;

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "J")
	private long aLong93 = -1L;

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "Lclient!vba;")
	private final Class337 aClass337_1;

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "J")
	private long aLong95;

	@OriginalMember(owner = "client!hca", name = "t", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "[B")
	private final byte[] aByteArray49;

	@OriginalMember(owner = "client!hca", name = "y", descriptor = "[B")
	private final byte[] aByteArray50;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lclient!vba;II)V")
	public Class134(@OriginalArg(0) Class337 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass337_1 = arg0;
		this.aLong95 = this.aLong92 = arg0.method7969();
		this.aLong97 = 0L;
		this.aByteArray49 = new byte[arg2];
		this.aByteArray50 = new byte[arg1];
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
	private void method3238() throws IOException {
		this.anInt3634 = 0;
		if (this.aLong96 != this.aLong97) {
			this.aClass337_1.method7962(this.aLong97);
			this.aLong96 = this.aLong97;
		}
		this.aLong94 = this.aLong97;
		while (this.anInt3634 < this.aByteArray50.length) {
			@Pc(44) int local44 = this.aByteArray50.length - this.anInt3634;
			if (local44 > 200000000) {
				local44 = 200000000;
			}
			@Pc(61) int local61 = this.aClass337_1.method7964(this.anInt3634, local44, this.aByteArray50);
			if (local61 == -1) {
				break;
			}
			this.anInt3634 += local61;
			this.aLong96 += local61;
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method3239() {
		return this.aClass337_1.method7968();
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BJ)V")
	public void method3241(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3239());
		}
		this.aLong97 = arg0;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "([BIIZ)V")
	public void method3243(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong93 != -1L && this.aLong93 <= this.aLong97 && this.aLong93 + (long) this.anInt3636 >= this.aLong97 - -((long) arg2)) {
				Static597.method3730(this.aByteArray49, (int) (this.aLong97 - this.aLong93), arg0, 0, arg2);
				this.aLong97 += arg2;
				return;
			}
			@Pc(77) long local77 = this.aLong97;
			@Pc(81) int local81 = arg2;
			@Pc(113) int local113;
			if (this.aLong97 >= this.aLong94 && this.aLong97 < (long) this.anInt3634 + this.aLong94) {
				local113 = (int) (this.aLong94 + (long) this.anInt3634 - this.aLong97);
				if (local113 > arg2) {
					local113 = arg2;
				}
				Static597.method3730(this.aByteArray50, (int) (this.aLong97 - this.aLong94), arg0, 0, local113);
				this.aLong97 += local113;
				arg1 = local113;
				arg2 -= local113;
			}
			if (this.aByteArray50.length < arg2) {
				this.aClass337_1.method7962(this.aLong97);
				this.aLong96 = this.aLong97;
				while (arg2 > 0) {
					local113 = this.aClass337_1.method7964(arg1, arg2, arg0);
					if (local113 == -1) {
						break;
					}
					this.aLong97 += local113;
					arg1 += local113;
					this.aLong96 += local113;
					arg2 -= local113;
				}
			} else if (arg2 > 0) {
				this.method3238();
				local113 = arg2;
				if (this.anInt3634 < arg2) {
					local113 = this.anInt3634;
				}
				Static597.method3730(this.aByteArray50, 0, arg0, arg1, local113);
				arg1 += local113;
				arg2 -= local113;
				this.aLong97 += local113;
			}
			if (this.aLong93 != -1L) {
				if (this.aLong93 > this.aLong97 && arg2 > 0) {
					local113 = arg1 + (int) (this.aLong93 - this.aLong97);
					if (arg1 + arg2 < local113) {
						local113 = arg1 + arg2;
					}
					while (local113 > arg1) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong97++;
					}
				}
				@Pc(316) long local316 = -1L;
				if (local77 <= this.aLong93 && this.aLong93 < (long) local81 + local77) {
					local316 = this.aLong93;
				} else if (local77 >= this.aLong93 && local77 < (long) this.anInt3636 + this.aLong93) {
					local316 = local77;
				}
				@Pc(364) long local364 = -1L;
				if (local77 < this.aLong93 + (long) this.anInt3636 && this.aLong93 + (long) this.anInt3636 <= local77 - -((long) local81)) {
					local364 = (long) this.anInt3636 + this.aLong93;
				} else if ((long) local81 + local77 > this.aLong93 && local77 + (long) local81 <= (long) this.anInt3636 + this.aLong93) {
					local364 = local77 + (long) local81;
				}
				if (local316 > -1L && local364 > local316) {
					@Pc(439) int local439 = (int) (local364 - local316);
					Static597.method3730(this.aByteArray49, (int) (local316 - this.aLong93), arg0, (int) (local316 - local77), local439);
					if (this.aLong97 < local364) {
						arg2 = (int) ((long) arg2 + this.aLong97 - local364);
						this.aLong97 = local364;
					}
				}
			}
		} catch (@Pc(478) IOException local478) {
			this.aLong96 = -1L;
			throw local478;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)J")
	public long method3244() {
		return this.aLong95;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III[B)V")
	public void method3245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong97 + (long) arg0 > this.aLong95) {
				this.aLong95 = this.aLong97 + (long) arg0;
			}
			if (this.aLong93 != -1L && (this.aLong97 < this.aLong93 || this.aLong93 + (long) this.anInt3636 < this.aLong97)) {
				this.method3249();
			}
			if (this.aLong93 != -1L && this.aLong97 + (long) arg0 > (long) this.aByteArray49.length + this.aLong93) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray49.length + this.aLong93 - this.aLong97);
				Static597.method3730(arg2, arg1, this.aByteArray49, (int) (this.aLong97 - this.aLong93), local100);
				arg1 += local100;
				this.aLong97 += local100;
				arg0 -= local100;
				this.anInt3636 = this.aByteArray49.length;
				this.method3249();
			}
			if (this.aByteArray49.length < arg0) {
				if (this.aLong97 != this.aLong96) {
					this.aClass337_1.method7962(this.aLong97);
					this.aLong96 = this.aLong97;
				}
				this.aClass337_1.method7965(arg1, arg2, arg0);
				this.aLong96 += arg0;
				if (this.aLong92 < this.aLong96) {
					this.aLong92 = this.aLong96;
				}
				@Pc(185) long local185 = -1L;
				@Pc(187) long local187 = -1L;
				if (this.aLong97 >= this.aLong94 && (long) this.anInt3634 + this.aLong94 > this.aLong97) {
					local185 = this.aLong97;
				} else if (this.aLong94 >= this.aLong97 && this.aLong97 + (long) arg0 > this.aLong94) {
					local185 = this.aLong94;
				}
				if ((long) arg0 + this.aLong97 > this.aLong94 && (long) this.anInt3634 + this.aLong94 >= (long) arg0 + this.aLong97) {
					local187 = (long) arg0 + this.aLong97;
				} else if ((long) this.anInt3634 + this.aLong94 > this.aLong97 && (long) this.anInt3634 + this.aLong94 <= (long) arg0 + this.aLong97) {
					local187 = this.aLong94 + (long) this.anInt3634;
				}
				if (local185 > -1L && local187 > local185) {
					@Pc(316) int local316 = (int) (local187 - local185);
					Static597.method3730(arg2, (int) ((long) arg1 + local185 - this.aLong97), this.aByteArray50, (int) (local185 - this.aLong94), local316);
				}
				this.aLong97 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong93 == -1L) {
					this.aLong93 = this.aLong97;
				}
				Static597.method3730(arg2, arg1, this.aByteArray49, (int) (this.aLong97 - this.aLong93), arg0);
				this.aLong97 += arg0;
				if (this.aLong97 - this.aLong93 > (long) this.anInt3636) {
					this.anInt3636 = (int) (this.aLong97 - this.aLong93);
				}
			}
		} catch (@Pc(402) IOException local402) {
			this.aLong96 = -1L;
			throw local402;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z[B)V")
	public void method3247(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method3243(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)V")
	public void method3248() throws IOException {
		this.method3249();
		this.aClass337_1.method7966();
	}

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)V")
	private void method3249() throws IOException {
		if (this.aLong93 == (long) -1) {
			return;
		}
		if (this.aLong93 != this.aLong96) {
			this.aClass337_1.method7962(this.aLong93);
			this.aLong96 = this.aLong93;
		}
		this.aClass337_1.method7965(0, this.aByteArray49, this.anInt3636);
		this.aLong96 += this.anInt3636;
		if (this.aLong92 < this.aLong96) {
			this.aLong92 = this.aLong96;
		}
		@Pc(54) long local54 = -1L;
		if (this.aLong94 <= this.aLong93 && this.aLong93 < (long) this.anInt3634 + this.aLong94) {
			local54 = this.aLong93;
		} else if (this.aLong94 >= this.aLong93 && this.aLong94 < this.aLong93 + (long) this.anInt3636) {
			local54 = this.aLong94;
		}
		@Pc(109) long local109 = -1L;
		if ((long) this.anInt3636 + this.aLong93 > this.aLong94 && this.aLong93 + (long) this.anInt3636 <= this.aLong94 - -((long) this.anInt3634)) {
			local109 = (long) this.anInt3636 + this.aLong93;
		} else if (this.aLong94 + (long) this.anInt3634 > this.aLong93 && this.aLong94 + (long) this.anInt3634 <= this.aLong93 + (long) this.anInt3636) {
			local109 = this.aLong94 + (long) this.anInt3634;
		}
		if (local54 > -1L && local109 > local54) {
			@Pc(206) int local206 = (int) (local109 - local54);
			Static597.method3730(this.aByteArray49, (int) (local54 - this.aLong93), this.aByteArray50, (int) (local54 - this.aLong94), local206);
		}
		this.anInt3636 = 0;
		this.aLong93 = -1L;
	}
}
