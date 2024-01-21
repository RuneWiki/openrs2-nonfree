import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class68 {

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	private int anInt2798;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "J")
	private long aLong93;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	private int anInt2800 = 0;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "J")
	private long aLong91 = -1L;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "J")
	private long aLong92 = -1L;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "Lclient!q;")
	private final Class48 aClass48_3;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "J")
	private long aLong95;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "J")
	private long aLong94;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "[B")
	private final byte[] aByteArray23;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "[B")
	private final byte[] aByteArray22;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!q;II)V")
	public Class68(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass48_3 = arg0;
		this.aLong94 = this.aLong95 = arg0.method1471();
		this.aByteArray23 = new byte[arg2];
		this.aByteArray22 = new byte[arg1];
		this.aLong90 = 0L;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IJ)V")
	public void method1808(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong90 = arg0;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)J")
	public long method1809() {
		return this.aLong94;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[B)V")
	public void method1810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong90 > this.aLong94) {
				this.aLong94 = (long) arg1 + this.aLong90;
			}
			if (this.aLong91 != -1L && (this.aLong90 < this.aLong91 || this.aLong90 > this.aLong91 + (long) this.anInt2800)) {
				this.method1816();
			}
			if (this.aLong91 != -1L && (long) arg1 + this.aLong90 > this.aLong91 + (long) this.aByteArray23.length) {
				@Pc(99) int local99 = (int) (this.aLong91 + (long) this.aByteArray23.length - this.aLong90);
				arg1 -= local99;
				Static116.method742(arg2, arg0, this.aByteArray23, (int) (this.aLong90 - this.aLong91), local99);
				this.aLong90 += local99;
				this.anInt2800 = this.aByteArray23.length;
				arg0 += local99;
				this.method1816();
			}
			if (this.aByteArray23.length < arg1) {
				if (this.aLong90 != this.aLong93) {
					this.aClass48_3.method1468(this.aLong90);
					this.aLong93 = this.aLong90;
				}
				this.aClass48_3.method1470(arg2, arg0, arg1);
				this.aLong93 += arg1;
				if (this.aLong93 > this.aLong95) {
					this.aLong95 = this.aLong93;
				}
				@Pc(190) long local190 = -1L;
				@Pc(192) long local192 = -1L;
				if (this.aLong90 >= this.aLong92 && this.aLong90 < (long) this.anInt2798 + this.aLong92) {
					local192 = this.aLong90;
				} else if (this.aLong92 >= this.aLong90 && this.aLong92 < this.aLong90 + (long) arg1) {
					local192 = this.aLong92;
				}
				if (this.aLong92 < this.aLong90 + (long) arg1 && (long) arg1 + this.aLong90 <= this.aLong92 - -((long) this.anInt2798)) {
					local190 = (long) arg1 + this.aLong90;
				} else if (this.aLong92 + (long) this.anInt2798 > this.aLong90 && (long) this.anInt2798 + this.aLong92 <= (long) arg1 + this.aLong90) {
					local190 = (long) this.anInt2798 + this.aLong92;
				}
				if (local192 > -1L && local190 > local192) {
					@Pc(325) int local325 = (int) (local190 - local192);
					Static116.method742(arg2, (int) ((long) arg0 + local192 - this.aLong90), this.aByteArray22, (int) (local192 - this.aLong92), local325);
				}
				this.aLong90 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong91 == -1L) {
					this.aLong91 = this.aLong90;
				}
				Static116.method742(arg2, arg0, this.aByteArray23, (int) (this.aLong90 - this.aLong91), arg1);
				this.aLong90 += arg1;
				if ((long) this.anInt2800 < this.aLong90 - this.aLong91) {
					this.anInt2800 = (int) (this.aLong90 - this.aLong91);
				}
			}
		} catch (@Pc(410) IOException local410) {
			this.aLong93 = -1L;
			throw local410;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBI[B)V")
	public void method1812(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong91 != -1L && this.aLong90 >= this.aLong91 && (long) arg1 + this.aLong90 <= (long) this.anInt2800 + this.aLong91) {
				Static116.method742(this.aByteArray23, (int) (this.aLong90 - this.aLong91), arg2, 0, arg1);
				this.aLong90 += arg1;
				return;
			}
			@Pc(78) int local78 = arg1;
			@Pc(81) long local81 = this.aLong90;
			@Pc(116) int local116;
			if (this.aLong92 <= this.aLong90 && (long) this.anInt2798 + this.aLong92 > this.aLong90) {
				local116 = (int) ((long) this.anInt2798 + this.aLong92 - this.aLong90);
				if (local116 > arg1) {
					local116 = arg1;
				}
				Static116.method742(this.aByteArray22, (int) (this.aLong90 - this.aLong92), arg2, 0, local116);
				arg0 = local116;
				this.aLong90 += local116;
				arg1 -= local116;
			}
			if (arg1 > this.aByteArray22.length) {
				this.aClass48_3.method1468(this.aLong90);
				this.aLong93 = this.aLong90;
				while (arg1 > 0) {
					local116 = this.aClass48_3.method1472(arg0, arg1, arg2);
					if (local116 == -1) {
						break;
					}
					this.aLong90 += local116;
					this.aLong93 += local116;
					arg0 += local116;
					arg1 -= local116;
				}
			} else if (arg1 > 0) {
				local116 = arg1;
				this.method1815();
				if (arg1 > this.anInt2798) {
					local116 = this.anInt2798;
				}
				Static116.method742(this.aByteArray22, 0, arg2, arg0, local116);
				this.aLong90 += local116;
				arg0 += local116;
				arg1 -= local116;
			}
			if (this.aLong91 != -1L) {
				if (this.aLong90 < this.aLong91 && arg1 > 0) {
					local116 = (int) (this.aLong91 - this.aLong90) + arg0;
					if (local116 > arg0 + arg1) {
						local116 = arg0 + arg1;
					}
					while (arg0 < local116) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong90++;
					}
				}
				@Pc(306) long local306 = -1L;
				if (this.aLong91 + (long) this.anInt2800 > local81 && (long) local78 + local81 >= this.aLong91 + (long) this.anInt2800) {
					local306 = (long) this.anInt2800 + this.aLong91;
				} else if (local81 + (long) local78 > this.aLong91 && (long) this.anInt2800 + this.aLong91 >= local81 - -((long) local78)) {
					local306 = (long) local78 + local81;
				}
				@Pc(378) long local378 = -1L;
				if (local81 <= this.aLong91 && (long) local78 + local81 > this.aLong91) {
					local378 = this.aLong91;
				} else if (this.aLong91 <= local81 && this.aLong91 + (long) this.anInt2800 > local81) {
					local378 = local81;
				}
				if (local378 > -1L && local378 < local306) {
					@Pc(443) int local443 = (int) (local306 - local378);
					Static116.method742(this.aByteArray23, (int) (local378 - this.aLong91), arg2, (int) (local378 - local81), local443);
					if (this.aLong90 < local306) {
						arg1 = (int) ((long) arg1 + this.aLong90 - local306);
						this.aLong90 = local306;
					}
				}
			}
		} catch (@Pc(486) IOException local486) {
			this.aLong93 = -1L;
			throw local486;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public void method1813() throws IOException {
		this.method1816();
		this.aClass48_3.method1469();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	private void method1815() throws IOException {
		this.anInt2798 = 0;
		if (this.aLong93 != this.aLong90) {
			this.aClass48_3.method1468(this.aLong90);
			this.aLong93 = this.aLong90;
		}
		this.aLong92 = this.aLong90;
		while (this.aByteArray22.length > this.anInt2798) {
			@Pc(53) int local53 = this.aClass48_3.method1472(this.anInt2798, this.aByteArray22.length - this.anInt2798, this.aByteArray22);
			if (local53 == -1) {
				break;
			}
			this.aLong93 += local53;
			this.anInt2798 += local53;
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	private void method1816() throws IOException {
		if (this.aLong91 == -1L) {
			return;
		}
		if (this.aLong93 != this.aLong91) {
			this.aClass48_3.method1468(this.aLong91);
			this.aLong93 = this.aLong91;
		}
		this.aClass48_3.method1470(this.aByteArray23, 0, this.anInt2800);
		this.aLong93 += this.anInt2800;
		if (this.aLong95 < this.aLong93) {
			this.aLong95 = this.aLong93;
		}
		@Pc(69) long local69 = -1L;
		if (this.aLong92 <= this.aLong91 && this.aLong91 < this.aLong92 + (long) this.anInt2798) {
			local69 = this.aLong91;
		} else if (this.aLong91 <= this.aLong92 && this.aLong91 + (long) this.anInt2800 > this.aLong92) {
			local69 = this.aLong92;
		}
		@Pc(116) long local116 = -1L;
		if ((long) this.anInt2800 + this.aLong91 > this.aLong92 && (long) this.anInt2798 + this.aLong92 >= this.aLong91 - -((long) this.anInt2800)) {
			local116 = this.aLong91 + (long) this.anInt2800;
		} else if ((long) this.anInt2798 + this.aLong92 > this.aLong91 && (long) this.anInt2800 + this.aLong91 >= this.aLong92 - -((long) this.anInt2798)) {
			local116 = (long) this.anInt2798 + this.aLong92;
		}
		if (local69 > -1L && local116 > local69) {
			@Pc(208) int local208 = (int) (local116 - local69);
			Static116.method742(this.aByteArray23, (int) (local69 - this.aLong91), this.aByteArray22, (int) (local69 - this.aLong92), local208);
		}
		this.anInt2800 = 0;
		this.aLong91 = -1L;
	}
}
