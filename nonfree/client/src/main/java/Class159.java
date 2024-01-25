import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class159 {

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
	private int anInt4770;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "J")
	private long aLong150 = -1L;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
	private int anInt4777 = 0;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "J")
	private long aLong152 = -1L;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "Lclient!kr;")
	private final Class137 aClass137_1;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "[B")
	private final byte[] aByteArray61;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "[B")
	private final byte[] aByteArray62;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!kr;II)V")
	public Class159(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass137_1 = arg0;
		this.aLong149 = this.aLong154 = arg0.method3703();
		this.aByteArray61 = new byte[arg1];
		this.aLong153 = 0L;
		this.aByteArray62 = new byte[arg2];
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)J")
	public long method4063() {
		return this.aLong149;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	private void method4064() throws IOException {
		this.anInt4770 = 0;
		if (this.aLong151 != this.aLong153) {
			this.aClass137_1.method3705(this.aLong153);
			this.aLong151 = this.aLong153;
		}
		this.aLong152 = this.aLong153;
		while (this.aByteArray61.length > this.anInt4770) {
			@Pc(46) int local46 = this.aByteArray61.length - this.anInt4770;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(61) int local61 = this.aClass137_1.method3704(this.aByteArray61, local46, this.anInt4770);
			if (local61 == -1) {
				break;
			}
			this.anInt4770 += local61;
			this.aLong151 += local61;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI[B)V")
	public void method4066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong153 + (long) arg1 > this.aLong149) {
				this.aLong149 = (long) arg1 + this.aLong153;
			}
			if (this.aLong150 != -1L && (this.aLong153 < this.aLong150 || this.aLong150 + (long) this.anInt4777 < this.aLong153)) {
				this.method4071();
			}
			if (this.aLong150 != -1L && this.aLong153 + (long) arg1 > (long) this.aByteArray62.length + this.aLong150) {
				@Pc(97) int local97 = (int) ((long) this.aByteArray62.length + this.aLong150 - this.aLong153);
				Static474.method3327(arg2, arg0, this.aByteArray62, (int) (this.aLong153 - this.aLong150), local97);
				arg1 -= local97;
				this.aLong153 += local97;
				arg0 += local97;
				this.anInt4777 = this.aByteArray62.length;
				this.method4071();
			}
			if (this.aByteArray62.length < arg1) {
				if (this.aLong151 != this.aLong153) {
					this.aClass137_1.method3705(this.aLong153);
					this.aLong151 = this.aLong153;
				}
				this.aClass137_1.method3706(arg2, arg1, arg0);
				this.aLong151 += arg1;
				if (this.aLong151 > this.aLong154) {
					this.aLong154 = this.aLong151;
				}
				@Pc(188) long local188 = -1L;
				if (this.aLong153 >= this.aLong152 && this.aLong153 < (long) this.anInt4770 + this.aLong152) {
					local188 = this.aLong153;
				} else if (this.aLong153 <= this.aLong152 && this.aLong152 < this.aLong153 + (long) arg1) {
					local188 = this.aLong152;
				}
				@Pc(242) long local242 = -1L;
				if (this.aLong153 + (long) arg1 > this.aLong152 && (long) arg1 + this.aLong153 <= (long) this.anInt4770 + this.aLong152) {
					local242 = (long) arg1 + this.aLong153;
				} else if ((long) this.anInt4770 + this.aLong152 > this.aLong153 && (long) arg1 + this.aLong153 >= this.aLong152 - -((long) this.anInt4770)) {
					local242 = (long) this.anInt4770 + this.aLong152;
				}
				if (local188 > -1L && local242 > local188) {
					@Pc(326) int local326 = (int) (local242 - local188);
					Static474.method3327(arg2, (int) (local188 + (long) arg0 - this.aLong153), this.aByteArray61, (int) (local188 - this.aLong152), local326);
				}
				this.aLong153 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong150 == -1L) {
					this.aLong150 = this.aLong153;
				}
				Static474.method3327(arg2, arg0, this.aByteArray62, (int) (this.aLong153 - this.aLong150), arg1);
				this.aLong153 += arg1;
				if (this.aLong153 - this.aLong150 > (long) this.anInt4777) {
					this.anInt4777 = (int) (this.aLong153 - this.aLong150);
				}
			}
		} catch (@Pc(419) IOException local419) {
			this.aLong151 = -1L;
			throw local419;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IJ)V")
	public void method4067(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4069());
		}
		this.aLong153 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[BII)V")
	public void method4068(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong150 != -1L && this.aLong153 >= this.aLong150 && this.aLong150 + (long) this.anInt4777 >= this.aLong153 - -((long) arg2)) {
				Static474.method3327(this.aByteArray62, (int) (this.aLong153 - this.aLong150), arg1, 0, arg2);
				this.aLong153 += arg2;
				return;
			}
			@Pc(81) long local81 = this.aLong153;
			@Pc(85) int local85 = arg2;
			@Pc(114) int local114;
			if (this.aLong153 >= this.aLong152 && (long) this.anInt4770 + this.aLong152 > this.aLong153) {
				local114 = (int) (this.aLong152 + (long) this.anInt4770 - this.aLong153);
				if (local114 > arg2) {
					local114 = arg2;
				}
				Static474.method3327(this.aByteArray61, (int) (this.aLong153 - this.aLong152), arg1, 0, local114);
				this.aLong153 += local114;
				arg0 = local114;
				arg2 -= local114;
			}
			if (this.aByteArray61.length < arg2) {
				this.aClass137_1.method3705(this.aLong153);
				this.aLong151 = this.aLong153;
				while (arg2 > 0) {
					local114 = this.aClass137_1.method3704(arg1, arg2, arg0);
					if (local114 == -1) {
						break;
					}
					this.aLong151 += local114;
					this.aLong153 += local114;
					arg0 += local114;
					arg2 -= local114;
				}
			} else if (arg2 > 0) {
				this.method4064();
				local114 = arg2;
				if (this.anInt4770 < arg2) {
					local114 = this.anInt4770;
				}
				Static474.method3327(this.aByteArray61, 0, arg1, arg0, local114);
				arg0 += local114;
				arg2 -= local114;
				this.aLong153 += local114;
			}
			if (this.aLong150 != -1L) {
				if (this.aLong153 < this.aLong150 && arg2 > 0) {
					local114 = arg0 + (int) (this.aLong150 - this.aLong153);
					if (arg2 + arg0 < local114) {
						local114 = arg0 + arg2;
					}
					while (arg0 < local114) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong153++;
					}
				}
				@Pc(306) long local306 = -1L;
				if (this.aLong150 >= local81 && this.aLong150 < local81 + (long) local85) {
					local306 = this.aLong150;
				} else if (local81 >= this.aLong150 && local81 < this.aLong150 + (long) this.anInt4777) {
					local306 = local81;
				}
				@Pc(350) long local350 = -1L;
				if (local81 < (long) this.anInt4777 + this.aLong150 && (long) local85 + local81 >= this.aLong150 - -((long) this.anInt4777)) {
					local350 = this.aLong150 + (long) this.anInt4777;
				} else if ((long) local85 + local81 > this.aLong150 && this.aLong150 + (long) this.anInt4777 >= local81 - -((long) local85)) {
					local350 = local81 + (long) local85;
				}
				if (local306 > -1L && local306 < local350) {
					@Pc(433) int local433 = (int) (local350 - local306);
					Static474.method3327(this.aByteArray62, (int) (local306 - this.aLong150), arg1, (int) (local306 - local81), local433);
					if (local350 > this.aLong153) {
						arg2 = (int) ((long) arg2 + this.aLong153 - local350);
						this.aLong153 = local350;
					}
				}
			}
		} catch (@Pc(475) IOException local475) {
			this.aLong151 = -1L;
			throw local475;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method4069() {
		return this.aClass137_1.method3707();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([BB)V")
	public void method4070(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4068(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	private void method4071() throws IOException {
		if (this.aLong150 == -1L) {
			return;
		}
		if (this.aLong150 != this.aLong151) {
			this.aClass137_1.method3705(this.aLong150);
			this.aLong151 = this.aLong150;
		}
		this.aClass137_1.method3706(this.aByteArray62, this.anInt4777, 0);
		this.aLong151 += this.anInt4777;
		if (this.aLong151 > this.aLong154) {
			this.aLong154 = this.aLong151;
		}
		@Pc(67) long local67 = -1L;
		if (this.aLong150 >= this.aLong152 && this.aLong150 < (long) this.anInt4770 + this.aLong152) {
			local67 = this.aLong150;
		} else if (this.aLong152 >= this.aLong150 && (long) this.anInt4777 + this.aLong150 > this.aLong152) {
			local67 = this.aLong152;
		}
		@Pc(121) long local121 = -1L;
		if ((long) this.anInt4777 + this.aLong150 > this.aLong152 && (long) this.anInt4777 + this.aLong150 <= (long) this.anInt4770 + this.aLong152) {
			local121 = (long) this.anInt4777 + this.aLong150;
		} else if ((long) this.anInt4770 + this.aLong152 > this.aLong150 && (long) this.anInt4770 + this.aLong152 <= (long) this.anInt4777 + this.aLong150) {
			local121 = (long) this.anInt4770 + this.aLong152;
		}
		if (local67 > -1L && local67 < local121) {
			@Pc(205) int local205 = (int) (local121 - local67);
			Static474.method3327(this.aByteArray62, (int) (local67 - this.aLong150), this.aByteArray61, (int) (local67 - this.aLong152), local205);
		}
		this.anInt4777 = 0;
		this.aLong150 = -1L;
	}
}
