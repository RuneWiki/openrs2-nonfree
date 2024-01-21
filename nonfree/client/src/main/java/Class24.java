import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class24 {

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "J")
	private long aLong32 = -1L;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "J")
	private long aLong33 = -1L;

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
	private int anInt828 = 0;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "Lclient!o;")
	private final Class53 aClass53_3;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "[B")
	private final byte[] aByteArray6;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!o;II)V")
	public Class24(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass53_3 = arg0;
		this.aLong29 = this.aLong30 = arg0.method1171();
		this.aByteArray5 = new byte[arg1];
		this.aByteArray6 = new byte[arg2];
		this.aLong34 = 0L;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	private void method552() throws IOException {
		if (this.aLong33 == -1L) {
			return;
		}
		if (this.aLong33 != this.aLong31) {
			this.aClass53_3.method1176(this.aLong33);
			this.aLong31 = this.aLong33;
		}
		this.aClass53_3.method1173(0, this.anInt828, this.aByteArray6);
		@Pc(37) long local37 = -1L;
		if (this.aLong32 <= this.aLong33 && (long) this.anInt830 + this.aLong32 > this.aLong33) {
			local37 = this.aLong33;
		} else if (this.aLong33 <= this.aLong32 && this.aLong32 < this.aLong33 + (long) this.anInt828) {
			local37 = this.aLong32;
		}
		this.aLong31 += this.anInt828;
		@Pc(91) long local91 = -1L;
		if (this.aLong31 > this.aLong30) {
			this.aLong30 = this.aLong31;
		}
		if (this.aLong33 + (long) this.anInt828 > this.aLong32 && (long) this.anInt830 + this.aLong32 >= (long) this.anInt828 + this.aLong33) {
			local91 = this.aLong33 + (long) this.anInt828;
		} else if (this.aLong33 < (long) this.anInt830 + this.aLong32 && (long) this.anInt828 + this.aLong33 >= this.aLong32 + (long) this.anInt830) {
			local91 = (long) this.anInt830 + this.aLong32;
		}
		if (local37 > -1L && local37 < local91) {
			@Pc(188) int local188 = (int) (local91 - local37);
			Static116.method551(this.aByteArray6, (int) (local37 - this.aLong33), this.aByteArray5, (int) (local37 - this.aLong32), local188);
		}
		this.aLong33 = -1L;
		this.anInt828 = 0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IJ)V")
	public void method554(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong34 = arg0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)J")
	public long method555() {
		return this.aLong29;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	private void method557() throws IOException {
		this.anInt830 = 0;
		if (this.aLong34 != this.aLong31) {
			this.aClass53_3.method1176(this.aLong34);
			this.aLong31 = this.aLong34;
		}
		this.aLong32 = this.aLong34;
		while (this.aByteArray5.length > this.anInt830) {
			@Pc(50) int local50 = this.aClass53_3.method1174(this.anInt830, this.aByteArray5, this.aByteArray5.length - this.anInt830);
			if (local50 == -1) {
				break;
			}
			this.aLong31 += local50;
			this.anInt830 += local50;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BI)V")
	public void method560(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong34 + (long) arg2 > this.aLong29) {
				this.aLong29 = (long) arg2 + this.aLong34;
			}
			if (this.aLong33 != -1L && (this.aLong33 > this.aLong34 || this.aLong34 > this.aLong33 + (long) this.anInt828)) {
				this.method552();
			}
			if (this.aLong33 != -1L && this.aLong33 + (long) this.aByteArray6.length < (long) arg2 + this.aLong34) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray6.length + this.aLong33 - this.aLong34);
				Static116.method551(arg1, arg0, this.aByteArray6, (int) (this.aLong34 - this.aLong33), local100);
				this.aLong34 += local100;
				arg0 += local100;
				this.anInt828 = this.aByteArray6.length;
				this.method552();
				arg2 -= local100;
			}
			if (arg2 > this.aByteArray6.length) {
				if (this.aLong31 != this.aLong34) {
					this.aClass53_3.method1176(this.aLong34);
					this.aLong31 = this.aLong34;
				}
				@Pc(159) long local159 = -1L;
				this.aClass53_3.method1173(arg0, arg2, arg1);
				this.aLong31 += arg2;
				if (this.aLong30 < this.aLong31) {
					this.aLong30 = this.aLong31;
				}
				@Pc(185) long local185 = -1L;
				if (this.aLong34 >= this.aLong32 && this.aLong32 + (long) this.anInt830 > this.aLong34) {
					local159 = this.aLong34;
				} else if (this.aLong32 >= this.aLong34 && this.aLong32 < (long) arg2 + this.aLong34) {
					local159 = this.aLong32;
				}
				if ((long) arg2 + this.aLong34 > this.aLong32 && (long) this.anInt830 + this.aLong32 >= (long) arg2 + this.aLong34) {
					local185 = this.aLong34 + (long) arg2;
				} else if (this.aLong34 < (long) this.anInt830 + this.aLong32 && (long) arg2 + this.aLong34 >= this.aLong32 + (long) this.anInt830) {
					local185 = (long) this.anInt830 + this.aLong32;
				}
				if (local159 > -1L && local185 > local159) {
					@Pc(311) int local311 = (int) (local185 - local159);
					Static116.method551(arg1, (int) ((long) arg0 + local159 - this.aLong34), this.aByteArray5, (int) (local159 - this.aLong32), local311);
				}
				this.aLong34 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong33 == -1L) {
					this.aLong33 = this.aLong34;
				}
				Static116.method551(arg1, arg0, this.aByteArray6, (int) (this.aLong34 - this.aLong33), arg2);
				this.aLong34 += arg2;
				if (this.aLong34 - this.aLong33 > (long) this.anInt828) {
					this.anInt828 = (int) (this.aLong34 - this.aLong33);
				}
			}
		} catch (@Pc(393) IOException local393) {
			this.aLong31 = -1L;
			throw local393;
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	public void method562() throws IOException {
		this.method552();
		this.aClass53_3.method1175();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB[BI)V")
	public void method564(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong33 != -1L && this.aLong34 >= this.aLong33 && (long) arg0 + this.aLong34 <= (long) this.anInt828 + this.aLong33) {
				Static116.method551(this.aByteArray6, (int) (this.aLong34 - this.aLong33), arg1, 0, arg0);
				this.aLong34 += arg0;
				return;
			}
			@Pc(78) long local78 = this.aLong34;
			@Pc(82) int local82 = arg0;
			@Pc(118) int local118;
			if (this.aLong34 >= this.aLong32 && this.aLong32 + (long) this.anInt830 > this.aLong34) {
				local118 = (int) (this.aLong32 + (long) this.anInt830 - this.aLong34);
				if (arg0 < local118) {
					local118 = arg0;
				}
				Static116.method551(this.aByteArray5, (int) (this.aLong34 - this.aLong32), arg1, 0, local118);
				arg2 = local118;
				arg0 -= local118;
				this.aLong34 += local118;
			}
			if (arg0 > this.aByteArray5.length) {
				this.aClass53_3.method1176(this.aLong34);
				this.aLong31 = this.aLong34;
				while (arg0 > 0) {
					local118 = this.aClass53_3.method1174(arg2, arg1, arg0);
					if (local118 == -1) {
						break;
					}
					this.aLong34 += local118;
					arg0 -= local118;
					arg2 += local118;
					this.aLong31 += local118;
				}
			} else if (arg0 > 0) {
				this.method557();
				local118 = arg0;
				if (this.anInt830 < arg0) {
					local118 = this.anInt830;
				}
				Static116.method551(this.aByteArray5, 0, arg1, arg2, local118);
				arg0 -= local118;
				arg2 += local118;
				this.aLong34 += local118;
			}
			if (this.aLong33 != -1L) {
				if (this.aLong34 < this.aLong33 && arg0 > 0) {
					local118 = arg2 + (int) (this.aLong33 - this.aLong34);
					if (local118 > arg0 + arg2) {
						local118 = arg0 + arg2;
					}
					while (arg2 < local118) {
						arg1[arg2++] = 0;
						arg0--;
						this.aLong34++;
					}
				}
				@Pc(302) long local302 = -1L;
				if (this.aLong33 >= local78 && this.aLong33 < (long) local82 + local78) {
					local302 = this.aLong33;
				} else if (this.aLong33 <= local78 && local78 < (long) this.anInt828 + this.aLong33) {
					local302 = local78;
				}
				@Pc(346) long local346 = -1L;
				if (local78 < this.aLong33 + (long) this.anInt828 && (long) local82 + local78 >= this.aLong33 + (long) this.anInt828) {
					local346 = (long) this.anInt828 + this.aLong33;
				} else if (local78 + (long) local82 > this.aLong33 && local78 + (long) local82 <= this.aLong33 + (long) this.anInt828) {
					local346 = local78 + (long) local82;
				}
				if (local302 > -1L && local346 > local302) {
					@Pc(432) int local432 = (int) (local346 - local302);
					Static116.method551(this.aByteArray6, (int) (local302 - this.aLong33), arg1, (int) (local302 - local78), local432);
					if (local346 > this.aLong34) {
						arg0 = (int) ((long) arg0 + this.aLong34 - local346);
						this.aLong34 = local346;
					}
				}
			}
		} catch (@Pc(474) IOException local474) {
			this.aLong31 = -1L;
			throw local474;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}
}
