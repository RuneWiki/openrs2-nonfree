import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class137 {

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
	private int anInt4232;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "J")
	private long aLong148 = -1L;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "J")
	private long aLong152 = -1L;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
	private int anInt4233 = 0;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!fk;")
	private Class50 aClass50_1;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!fk;II)V")
	public Class137(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass50_1 = arg0;
		this.aLong151 = this.aLong150 = arg0.method1252();
		this.aByteArray61 = new byte[arg1];
		this.aLong153 = 0L;
		this.aByteArray60 = new byte[arg2];
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(JB)V")
	public void method3389(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3397());
		}
		this.aLong153 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	private void method3391() throws IOException {
		this.anInt4232 = 0;
		if (this.aLong153 != this.aLong149) {
			this.aClass50_1.method1255(this.aLong153);
			this.aLong149 = this.aLong153;
		}
		this.aLong152 = this.aLong153;
		while (this.aByteArray61.length > this.anInt4232) {
			@Pc(54) int local54 = this.aByteArray61.length - this.anInt4232;
			if (local54 > 200000000) {
				local54 = 200000000;
			}
			@Pc(72) int local72 = this.aClass50_1.method1250(local54, this.aByteArray61, this.anInt4232);
			if (local72 == -1) {
				break;
			}
			this.aLong149 += local72;
			this.anInt4232 += local72;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZI[B)V")
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong148 != -1L && this.aLong153 >= this.aLong148 && (long) arg1 + this.aLong153 <= this.aLong148 + (long) this.anInt4233) {
				Static307.method3244(this.aByteArray60, (int) (this.aLong153 - this.aLong148), arg2, 0, arg1);
				this.aLong153 += arg1;
				return;
			}
			@Pc(78) long local78 = this.aLong153;
			@Pc(80) int local80 = arg1;
			@Pc(115) int local115;
			if (this.aLong153 >= this.aLong152 && this.aLong152 + (long) this.anInt4232 > this.aLong153) {
				local115 = (int) (this.aLong152 + (long) this.anInt4232 - this.aLong153);
				if (arg1 < local115) {
					local115 = arg1;
				}
				Static307.method3244(this.aByteArray61, (int) (this.aLong153 - this.aLong152), arg2, 0, local115);
				arg0 = local115;
				this.aLong153 += local115;
				arg1 -= local115;
			}
			if (this.aByteArray61.length < arg1) {
				this.aClass50_1.method1255(this.aLong153);
				this.aLong149 = this.aLong153;
				while (arg1 > 0) {
					local115 = this.aClass50_1.method1250(arg1, arg2, arg0);
					if (local115 == -1) {
						break;
					}
					arg0 += local115;
					this.aLong149 += local115;
					this.aLong153 += local115;
					arg1 -= local115;
				}
			} else if (arg1 > 0) {
				this.method3391();
				local115 = arg1;
				if (arg1 > this.anInt4232) {
					local115 = this.anInt4232;
				}
				arg1 -= local115;
				Static307.method3244(this.aByteArray61, 0, arg2, arg0, local115);
				arg0 += local115;
				this.aLong153 += local115;
			}
			if (this.aLong148 != -1L) {
				if (this.aLong148 > this.aLong153 && arg1 > 0) {
					local115 = arg0 + (int) (this.aLong148 - this.aLong153);
					if (local115 > arg1 + arg0) {
						local115 = arg0 + arg1;
					}
					while (local115 > arg0) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong153++;
					}
				}
				@Pc(325) long local325 = -1L;
				if (local78 <= this.aLong148 && local78 + (long) local80 > this.aLong148) {
					local325 = this.aLong148;
				} else if (this.aLong148 <= local78 && local78 < (long) this.anInt4233 + this.aLong148) {
					local325 = local78;
				}
				@Pc(362) long local362 = -1L;
				if ((long) this.anInt4233 + this.aLong148 > local78 && local78 + (long) local80 >= (long) this.anInt4233 + this.aLong148) {
					local362 = this.aLong148 + (long) this.anInt4233;
				} else if (this.aLong148 < (long) local80 + local78 && local78 + (long) local80 <= this.aLong148 - -((long) this.anInt4233)) {
					local362 = local78 + (long) local80;
				}
				if (local325 > -1L && local325 < local362) {
					@Pc(440) int local440 = (int) (local362 - local325);
					Static307.method3244(this.aByteArray60, (int) (local325 - this.aLong148), arg2, (int) (local325 - local78), local440);
					if (local362 > this.aLong153) {
						arg1 = (int) ((long) arg1 + this.aLong153 - local362);
						this.aLong153 = local362;
					}
				}
			}
		} catch (@Pc(481) IOException local481) {
			this.aLong149 = -1L;
			throw local481;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)J")
	public long method3394() {
		return this.aLong151;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([BI)V")
	public void method3395(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method3393(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V")
	private void method3396() throws IOException {
		if (this.aLong148 == -1L) {
			return;
		}
		if (this.aLong148 != this.aLong149) {
			this.aClass50_1.method1255(this.aLong148);
			this.aLong149 = this.aLong148;
		}
		this.aClass50_1.method1251(this.aByteArray60, 0, this.anInt4233);
		this.aLong149 += this.anInt4233;
		@Pc(52) long local52 = -1L;
		if (this.aLong152 <= this.aLong148 && this.aLong148 < (long) this.anInt4232 + this.aLong152) {
			local52 = this.aLong148;
		} else if (this.aLong148 <= this.aLong152 && this.aLong152 < this.aLong148 + (long) this.anInt4233) {
			local52 = this.aLong152;
		}
		if (this.aLong150 < this.aLong149) {
			this.aLong150 = this.aLong149;
		}
		@Pc(121) long local121 = -1L;
		if (this.aLong152 < this.aLong148 + (long) this.anInt4233 && (long) this.anInt4233 + this.aLong148 <= (long) this.anInt4232 + this.aLong152) {
			local121 = this.aLong148 + (long) this.anInt4233;
		} else if (this.aLong152 + (long) this.anInt4232 > this.aLong148 && this.aLong148 + (long) this.anInt4233 >= this.aLong152 + (long) this.anInt4232) {
			local121 = this.aLong152 + (long) this.anInt4232;
		}
		if (local52 > -1L && local121 > local52) {
			@Pc(208) int local208 = (int) (local121 - local52);
			Static307.method3244(this.aByteArray60, (int) (local52 - this.aLong148), this.aByteArray61, (int) (local52 - this.aLong152), local208);
		}
		this.anInt4233 = 0;
		this.aLong148 = -1L;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(Z)Ljava/io/File;")
	private File method3397() {
		return this.aClass50_1.method1253();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([BIBI)V")
	public void method3398(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong153 + (long) arg1 > this.aLong151) {
				this.aLong151 = this.aLong153 + (long) arg1;
			}
			if (this.aLong148 != -1L && (this.aLong148 > this.aLong153 || this.aLong148 + (long) this.anInt4233 < this.aLong153)) {
				this.method3396();
			}
			if (this.aLong148 != -1L && (long) arg1 + this.aLong153 > this.aLong148 + (long) this.aByteArray60.length) {
				@Pc(91) int local91 = (int) (this.aLong148 + (long) this.aByteArray60.length - this.aLong153);
				arg1 -= local91;
				Static307.method3244(arg0, arg2, this.aByteArray60, (int) (this.aLong153 - this.aLong148), local91);
				this.aLong153 += local91;
				arg2 += local91;
				this.anInt4233 = this.aByteArray60.length;
				this.method3396();
			}
			if (this.aByteArray60.length < arg1) {
				if (this.aLong153 != this.aLong149) {
					this.aClass50_1.method1255(this.aLong153);
					this.aLong149 = this.aLong153;
				}
				this.aClass50_1.method1251(arg0, arg2, arg1);
				this.aLong149 += arg1;
				if (this.aLong149 > this.aLong150) {
					this.aLong150 = this.aLong149;
				}
				@Pc(183) long local183 = -1L;
				@Pc(185) long local185 = -1L;
				if (this.aLong153 >= this.aLong152 && this.aLong153 < (long) this.anInt4232 + this.aLong152) {
					local183 = this.aLong153;
				} else if (this.aLong153 <= this.aLong152 && this.aLong152 < (long) arg1 + this.aLong153) {
					local183 = this.aLong152;
				}
				if (this.aLong153 + (long) arg1 > this.aLong152 && (long) this.anInt4232 + this.aLong152 >= (long) arg1 + this.aLong153) {
					local185 = this.aLong153 + (long) arg1;
				} else if (this.aLong152 + (long) this.anInt4232 > this.aLong153 && (long) arg1 + this.aLong153 >= this.aLong152 + (long) this.anInt4232) {
					local185 = (long) this.anInt4232 + this.aLong152;
				}
				if (local183 > -1L && local185 > local183) {
					@Pc(311) int local311 = (int) (local185 - local183);
					Static307.method3244(arg0, (int) (local183 + (long) arg2 - this.aLong153), this.aByteArray61, (int) (local183 - this.aLong152), local311);
				}
				this.aLong153 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong148 == -1L) {
					this.aLong148 = this.aLong153;
				}
				Static307.method3244(arg0, arg2, this.aByteArray60, (int) (this.aLong153 - this.aLong148), arg1);
				this.aLong153 += arg1;
				if (this.aLong153 - this.aLong148 > (long) this.anInt4233) {
					this.anInt4233 = (int) (this.aLong153 - this.aLong148);
				}
			}
		} catch (@Pc(397) IOException local397) {
			this.aLong149 = -1L;
			throw local397;
		}
	}
}
