import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class29 {

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	private int anInt1162;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
	private int anInt1165 = 0;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "J")
	private long aLong42 = -1L;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "J")
	private long aLong41 = -1L;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Lclient!ia;")
	private final Class32 aClass32_1;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "[B")
	private final byte[] aByteArray51;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "J")
	private long aLong37;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "[B")
	private final byte[] aByteArray50;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ia;II)V")
	public Class29(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass32_1 = arg0;
		this.aLong39 = this.aLong40 = arg0.method859();
		this.aByteArray51 = new byte[arg2];
		this.aLong37 = 0L;
		this.aByteArray50 = new byte[arg1];
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	private void method807() throws IOException {
		this.anInt1162 = 0;
		if (this.aLong37 != this.aLong38) {
			this.aClass32_1.method857(this.aLong37);
			this.aLong38 = this.aLong37;
		}
		this.aLong41 = this.aLong37;
		while (this.aByteArray50.length > this.anInt1162) {
			@Pc(54) int local54 = this.aClass32_1.method855(this.aByteArray50.length - this.anInt1162, this.aByteArray50, this.anInt1162);
			if (local54 == -1) {
				break;
			}
			this.anInt1162 += local54;
			this.aLong38 += local54;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)J")
	public long method808() {
		return this.aLong39;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III[B)V")
	public void method809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong39 < this.aLong37 + (long) arg1) {
				this.aLong39 = this.aLong37 + (long) arg1;
			}
			if (this.aLong42 != -1L && (this.aLong37 < this.aLong42 || this.aLong37 > this.aLong42 + (long) this.anInt1165)) {
				this.method811();
			}
			if (this.aLong42 != -1L && this.aLong42 + (long) this.aByteArray51.length < (long) arg1 + this.aLong37) {
				@Pc(90) int local90 = (int) ((long) this.aByteArray51.length + this.aLong42 - this.aLong37);
				Static135.method1053(arg2, arg0, this.aByteArray51, (int) (this.aLong37 - this.aLong42), local90);
				arg1 -= local90;
				arg0 += local90;
				this.aLong37 += local90;
				this.anInt1165 = this.aByteArray51.length;
				this.method811();
			}
			if (arg1 > this.aByteArray51.length) {
				if (this.aLong37 != this.aLong38) {
					this.aClass32_1.method857(this.aLong37);
					this.aLong38 = this.aLong37;
				}
				@Pc(159) long local159 = -1L;
				this.aClass32_1.method856(arg0, arg2, arg1);
				this.aLong38 += arg1;
				if (this.aLong41 <= this.aLong37 && this.aLong37 < this.aLong41 + (long) this.anInt1162) {
					local159 = this.aLong37;
				} else if (this.aLong37 <= this.aLong41 && this.aLong41 < this.aLong37 + (long) arg1) {
					local159 = this.aLong41;
				}
				if (this.aLong38 > this.aLong40) {
					this.aLong40 = this.aLong38;
				}
				@Pc(228) long local228 = -1L;
				if (this.aLong37 + (long) arg1 > this.aLong41 && this.aLong37 + (long) arg1 <= (long) this.anInt1162 + this.aLong41) {
					local228 = (long) arg1 + this.aLong37;
				} else if (this.aLong37 < (long) this.anInt1162 + this.aLong41 && (long) arg1 + this.aLong37 >= (long) this.anInt1162 + this.aLong41) {
					local228 = (long) this.anInt1162 + this.aLong41;
				}
				if (local159 > -1L && local228 > local159) {
					@Pc(321) int local321 = (int) (local228 - local159);
					Static135.method1053(arg2, (int) ((long) arg0 + local159 - this.aLong37), this.aByteArray50, (int) (local159 - this.aLong41), local321);
				}
				this.aLong37 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong42 == -1L) {
					this.aLong42 = this.aLong37;
				}
				Static135.method1053(arg2, arg0, this.aByteArray51, (int) (this.aLong37 - this.aLong42), arg1);
				this.aLong37 += arg1;
				if ((long) this.anInt1165 < this.aLong37 - this.aLong42) {
					this.anInt1165 = (int) (this.aLong37 - this.aLong42);
				}
			}
		} catch (@Pc(411) IOException local411) {
			this.aLong38 = -1L;
			throw local411;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	private void method811() throws IOException {
		if (this.aLong42 == -1L) {
			return;
		}
		if (this.aLong38 != this.aLong42) {
			this.aClass32_1.method857(this.aLong42);
			this.aLong38 = this.aLong42;
		}
		this.aClass32_1.method856(0, this.aByteArray51, this.anInt1165);
		@Pc(45) long local45 = -1L;
		@Pc(47) long local47 = -1L;
		if (this.aLong41 <= this.aLong42 && this.aLong42 < (long) this.anInt1162 + this.aLong41) {
			local45 = this.aLong42;
		} else if (this.aLong41 >= this.aLong42 && this.aLong42 + (long) this.anInt1165 > this.aLong41) {
			local45 = this.aLong41;
		}
		if (this.aLong41 < this.aLong42 + (long) this.anInt1165 && this.aLong41 + (long) this.anInt1162 >= this.aLong42 + (long) this.anInt1165) {
			local47 = this.aLong42 + (long) this.anInt1165;
		} else if (this.aLong41 + (long) this.anInt1162 > this.aLong42 && this.aLong42 + (long) this.anInt1165 >= this.aLong41 - -((long) this.anInt1162)) {
			local47 = (long) this.anInt1162 + this.aLong41;
		}
		this.aLong38 += this.anInt1165;
		if (this.aLong38 > this.aLong40) {
			this.aLong40 = this.aLong38;
		}
		if (local45 > -1L && local47 > local45) {
			@Pc(202) int local202 = (int) (local47 - local45);
			Static135.method1053(this.aByteArray51, (int) (local45 - this.aLong42), this.aByteArray50, (int) (local45 - this.aLong41), local202);
		}
		this.anInt1165 = 0;
		this.aLong42 = -1L;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI[B)V")
	public void method814(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong42 != -1L && this.aLong42 <= this.aLong37 && (long) this.anInt1165 + this.aLong42 >= (long) arg1 + this.aLong37) {
				Static135.method1053(this.aByteArray51, (int) (this.aLong37 - this.aLong42), arg2, 0, arg1);
				this.aLong37 += arg1;
				return;
			}
			@Pc(80) long local80 = this.aLong37;
			@Pc(82) int local82 = arg1;
			@Pc(121) int local121;
			if (this.aLong37 >= this.aLong41 && (long) this.anInt1162 + this.aLong41 > this.aLong37) {
				local121 = (int) ((long) this.anInt1162 + this.aLong41 - this.aLong37);
				if (local121 > arg1) {
					local121 = arg1;
				}
				arg1 -= local121;
				Static135.method1053(this.aByteArray50, (int) (this.aLong37 - this.aLong41), arg2, 0, local121);
				arg0 = local121;
				this.aLong37 += local121;
			}
			if (this.aByteArray50.length < arg1) {
				this.aClass32_1.method857(this.aLong37);
				this.aLong38 = this.aLong37;
				while (arg1 > 0) {
					local121 = this.aClass32_1.method855(arg1, arg2, arg0);
					if (local121 == -1) {
						break;
					}
					arg0 += local121;
					this.aLong37 += local121;
					arg1 -= local121;
					this.aLong38 += local121;
				}
			} else if (arg1 > 0) {
				this.method807();
				local121 = arg1;
				if (this.anInt1162 < arg1) {
					local121 = this.anInt1162;
				}
				arg1 -= local121;
				Static135.method1053(this.aByteArray50, 0, arg2, arg0, local121);
				arg0 += local121;
				this.aLong37 += local121;
			}
			if (this.aLong42 != -1L) {
				if (this.aLong37 < this.aLong42 && arg1 > 0) {
					local121 = (int) (this.aLong42 - this.aLong37) + arg0;
					if (arg0 + arg1 < local121) {
						local121 = arg0 + arg1;
					}
					while (arg0 < local121) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong37++;
					}
				}
				@Pc(306) long local306 = -1L;
				@Pc(308) long local308 = -1L;
				if ((long) this.anInt1165 + this.aLong42 > local80 && this.aLong42 + (long) this.anInt1165 <= local80 + (long) local82) {
					local308 = this.aLong42 + (long) this.anInt1165;
				} else if (this.aLong42 < (long) local82 + local80 && this.aLong42 + (long) this.anInt1165 >= (long) local82 + local80) {
					local308 = local80 + (long) local82;
				}
				if (this.aLong42 >= local80 && this.aLong42 < (long) local82 + local80) {
					local306 = this.aLong42;
				} else if (local80 >= this.aLong42 && this.aLong42 + (long) this.anInt1165 > local80) {
					local306 = local80;
				}
				if (local306 > -1L && local306 < local308) {
					@Pc(434) int local434 = (int) (local308 - local306);
					Static135.method1053(this.aByteArray51, (int) (local306 - this.aLong42), arg2, (int) (local306 - local80), local434);
					if (local308 > this.aLong37) {
						arg1 = (int) ((long) arg1 + this.aLong37 - local308);
						this.aLong37 = local308;
					}
				}
			}
		} catch (@Pc(471) IOException local471) {
			this.aLong38 = -1L;
			throw local471;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
	public void method815() throws IOException {
		this.method811();
		this.aClass32_1.method858();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(JI)V")
	public void method816(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong37 = arg0;
		}
	}
}
