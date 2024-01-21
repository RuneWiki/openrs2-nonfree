import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class61 {

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	private int anInt3028;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	private int anInt3026 = 0;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "J")
	private long aLong102 = -1L;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "J")
	private long aLong105 = -1L;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Lclient!id;")
	private final Class29 aClass29_3;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[B")
	private final byte[] aByteArray15;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[B")
	private final byte[] aByteArray16;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!id;II)V")
	public Class61(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass29_3 = arg0;
		this.aLong103 = this.aLong106 = arg0.method909();
		this.aLong104 = 0L;
		this.aByteArray15 = new byte[arg1];
		this.aByteArray16 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)J")
	public long method1948() {
		return this.aLong103;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(JI)V")
	public void method1949(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong104 = arg0;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	private void method1951() throws IOException {
		this.anInt3028 = 0;
		if (this.aLong104 != this.aLong107) {
			this.aClass29_3.method908(this.aLong104);
			this.aLong107 = this.aLong104;
		}
		this.aLong105 = this.aLong104;
		while (this.anInt3028 < this.aByteArray15.length) {
			@Pc(55) int local55 = this.aClass29_3.method910(this.aByteArray15.length - this.anInt3028, this.aByteArray15, this.anInt3028);
			if (local55 == -1) {
				break;
			}
			this.anInt3028 += local55;
			this.aLong107 += local55;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[BI)V")
	public void method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong103 < (long) arg1 + this.aLong104) {
				this.aLong103 = (long) arg1 + this.aLong104;
			}
			if (this.aLong102 != -1L && (this.aLong102 > this.aLong104 || this.aLong104 > this.aLong102 + (long) this.anInt3026)) {
				this.method1956();
			}
			if (this.aLong102 != -1L && (long) this.aByteArray16.length + this.aLong102 < (long) arg1 + this.aLong104) {
				@Pc(89) int local89 = (int) ((long) this.aByteArray16.length + this.aLong102 - this.aLong104);
				arg1 -= local89;
				Static120.method1341(arg2, arg0, this.aByteArray16, (int) (this.aLong104 - this.aLong102), local89);
				this.aLong104 += local89;
				this.anInt3026 = this.aByteArray16.length;
				this.method1956();
				arg0 += local89;
			}
			if (arg1 > this.aByteArray16.length) {
				if (this.aLong107 != this.aLong104) {
					this.aClass29_3.method908(this.aLong104);
					this.aLong107 = this.aLong104;
				}
				this.aClass29_3.method913(arg2, arg0, arg1);
				this.aLong107 += arg1;
				if (this.aLong107 > this.aLong106) {
					this.aLong106 = this.aLong107;
				}
				@Pc(176) long local176 = -1L;
				@Pc(178) long local178 = -1L;
				if (this.aLong105 <= this.aLong104 && (long) this.anInt3028 + this.aLong105 > this.aLong104) {
					local178 = this.aLong104;
				} else if (this.aLong105 >= this.aLong104 && this.aLong105 < this.aLong104 + (long) arg1) {
					local178 = this.aLong105;
				}
				if (this.aLong105 < (long) arg1 + this.aLong104 && (long) arg1 + this.aLong104 <= this.aLong105 + (long) this.anInt3028) {
					local176 = (long) arg1 + this.aLong104;
				} else if ((long) this.anInt3028 + this.aLong105 > this.aLong104 && this.aLong105 + (long) this.anInt3028 <= this.aLong104 + (long) arg1) {
					local176 = (long) this.anInt3028 + this.aLong105;
				}
				if (local178 > -1L && local176 > local178) {
					@Pc(307) int local307 = (int) (local176 - local178);
					Static120.method1341(arg2, (int) ((long) arg0 + local178 - this.aLong104), this.aByteArray15, (int) (local178 - this.aLong105), local307);
				}
				this.aLong104 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong102 == -1L) {
					this.aLong102 = this.aLong104;
				}
				Static120.method1341(arg2, arg0, this.aByteArray16, (int) (this.aLong104 - this.aLong102), arg1);
				this.aLong104 += arg1;
				if (this.aLong104 - this.aLong102 > (long) this.anInt3026) {
					this.anInt3026 = (int) (this.aLong104 - this.aLong102);
				}
			}
		} catch (@Pc(392) IOException local392) {
			this.aLong107 = -1L;
			throw local392;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[BII)V")
	public void method1953(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong102 != -1L && this.aLong104 >= this.aLong102 && this.aLong102 + (long) this.anInt3026 >= this.aLong104 - -((long) arg0)) {
				Static120.method1341(this.aByteArray16, (int) (this.aLong104 - this.aLong102), arg1, 0, arg0);
				this.aLong104 += arg0;
				return;
			}
			@Pc(86) int local86 = arg0;
			@Pc(89) long local89 = this.aLong104;
			@Pc(122) int local122;
			if (this.aLong104 >= this.aLong105 && this.aLong104 < (long) this.anInt3028 + this.aLong105) {
				local122 = (int) ((long) this.anInt3028 + this.aLong105 - this.aLong104);
				if (local122 > arg0) {
					local122 = arg0;
				}
				Static120.method1341(this.aByteArray15, (int) (this.aLong104 - this.aLong105), arg1, 0, local122);
				arg2 = local122;
				this.aLong104 += local122;
				arg0 -= local122;
			}
			if (arg0 > this.aByteArray15.length) {
				this.aClass29_3.method908(this.aLong104);
				this.aLong107 = this.aLong104;
				while (arg0 > 0) {
					local122 = this.aClass29_3.method910(arg0, arg1, arg2);
					if (local122 == -1) {
						break;
					}
					arg2 += local122;
					this.aLong104 += local122;
					this.aLong107 += local122;
					arg0 -= local122;
				}
			} else if (arg0 > 0) {
				this.method1951();
				local122 = arg0;
				if (arg0 > this.anInt3028) {
					local122 = this.anInt3028;
				}
				Static120.method1341(this.aByteArray15, 0, arg1, arg2, local122);
				this.aLong104 += local122;
				arg2 += local122;
				arg0 -= local122;
			}
			if (this.aLong102 != -1L) {
				if (this.aLong104 < this.aLong102 && arg0 > 0) {
					local122 = (int) (this.aLong102 - this.aLong104) + arg2;
					if (local122 > arg2 + arg0) {
						local122 = arg2 + arg0;
					}
					while (arg2 < local122) {
						arg1[arg2++] = 0;
						this.aLong104++;
						arg0--;
					}
				}
				@Pc(320) long local320 = -1L;
				if (local89 < this.aLong102 + (long) this.anInt3026 && this.aLong102 + (long) this.anInt3026 <= (long) local86 + local89) {
					local320 = (long) this.anInt3026 + this.aLong102;
				} else if ((long) local86 + local89 > this.aLong102 && (long) local86 + local89 <= (long) this.anInt3026 + this.aLong102) {
					local320 = local89 + (long) local86;
				}
				@Pc(383) long local383 = -1L;
				if (local89 <= this.aLong102 && this.aLong102 < local89 + (long) local86) {
					local383 = this.aLong102;
				} else if (local89 >= this.aLong102 && local89 < this.aLong102 + (long) this.anInt3026) {
					local383 = local89;
				}
				if (local383 > -1L && local320 > local383) {
					@Pc(442) int local442 = (int) (local320 - local383);
					Static120.method1341(this.aByteArray16, (int) (local383 - this.aLong102), arg1, (int) (local383 - local89), local442);
					if (local320 > this.aLong104) {
						arg0 = (int) ((long) arg0 + this.aLong104 - local320);
						this.aLong104 = local320;
					}
				}
			}
		} catch (@Pc(484) IOException local484) {
			this.aLong107 = -1L;
			throw local484;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
	public void method1955() throws IOException {
		this.method1956();
		this.aClass29_3.method912();
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V")
	private void method1956() throws IOException {
		if (this.aLong102 == -1L) {
			return;
		}
		if (this.aLong107 != this.aLong102) {
			this.aClass29_3.method908(this.aLong102);
			this.aLong107 = this.aLong102;
		}
		@Pc(30) long local30 = -1L;
		this.aClass29_3.method913(this.aByteArray16, 0, this.anInt3026);
		if ((long) this.anInt3026 + this.aLong102 > this.aLong105 && (long) this.anInt3026 + this.aLong102 <= this.aLong105 + (long) this.anInt3028) {
			local30 = this.aLong102 + (long) this.anInt3026;
		} else if ((long) this.anInt3028 + this.aLong105 > this.aLong102 && (long) this.anInt3026 + this.aLong102 >= this.aLong105 + (long) this.anInt3028) {
			local30 = (long) this.anInt3028 + this.aLong105;
		}
		this.aLong107 += this.anInt3026;
		@Pc(113) long local113 = -1L;
		if (this.aLong106 < this.aLong107) {
			this.aLong106 = this.aLong107;
		}
		if (this.aLong105 <= this.aLong102 && this.aLong105 + (long) this.anInt3028 > this.aLong102) {
			local113 = this.aLong102;
		} else if (this.aLong105 >= this.aLong102 && this.aLong105 < this.aLong102 + (long) this.anInt3026) {
			local113 = this.aLong105;
		}
		if (local113 > -1L && local30 > local113) {
			@Pc(182) int local182 = (int) (local30 - local113);
			Static120.method1341(this.aByteArray16, (int) (local113 - this.aLong102), this.aByteArray15, (int) (local113 - this.aLong105), local182);
		}
		this.aLong102 = -1L;
		this.anInt3026 = 0;
	}
}
