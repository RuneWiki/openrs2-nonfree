import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class240 {

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "J")
	private long aLong195;

	@OriginalMember(owner = "client!ofa", name = "s", descriptor = "I")
	private int anInt7428;

	@OriginalMember(owner = "client!ofa", name = "q", descriptor = "J")
	private long aLong199 = -1L;

	@OriginalMember(owner = "client!ofa", name = "m", descriptor = "J")
	private long aLong198 = -1L;

	@OriginalMember(owner = "client!ofa", name = "v", descriptor = "I")
	private int anInt7430 = 0;

	@OriginalMember(owner = "client!ofa", name = "k", descriptor = "Lclient!vl;")
	private final Class360 aClass360_4;

	@OriginalMember(owner = "client!ofa", name = "i", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!ofa", name = "t", descriptor = "J")
	private long aLong200;

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "[B")
	private final byte[] aByteArray63;

	@OriginalMember(owner = "client!ofa", name = "j", descriptor = "[B")
	private final byte[] aByteArray64;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lclient!vl;II)V")
	public Class240(@OriginalArg(0) Class360 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass360_4 = arg0;
		this.aLong196 = this.aLong197 = arg0.method8357();
		this.aLong200 = 0L;
		this.aByteArray63 = new byte[arg1];
		this.aByteArray64 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "([BI)V")
	public void method6268(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method6275(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)V")
	public void method6269() throws IOException {
		this.method6271();
		this.aClass360_4.method8359();
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method6270() {
		return this.aClass360_4.method8355();
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V")
	private void method6271() throws IOException {
		if (this.aLong198 == (long) -1) {
			return;
		}
		if (this.aLong198 != this.aLong195) {
			this.aClass360_4.method8356(this.aLong198);
			this.aLong195 = this.aLong198;
		}
		this.aClass360_4.method8361(this.aByteArray64, 0, this.anInt7430);
		this.aLong195 += (long) this.anInt7430;
		if (this.aLong195 > this.aLong197) {
			this.aLong197 = this.aLong195;
		}
		@Pc(56) long local56 = -1L;
		if (this.aLong199 <= this.aLong198 && this.aLong198 < (long) this.anInt7428 + this.aLong199) {
			local56 = this.aLong198;
		} else if (this.aLong198 <= this.aLong199 && this.aLong199 < (long) this.anInt7430 + this.aLong198) {
			local56 = this.aLong199;
		}
		@Pc(106) long local106 = -1L;
		if ((long) this.anInt7430 + this.aLong198 > this.aLong199 && this.aLong198 + (long) this.anInt7430 <= this.aLong199 + (long) this.anInt7428) {
			local106 = (long) this.anInt7430 + this.aLong198;
		} else if (this.aLong198 < this.aLong199 + (long) this.anInt7428 && (long) this.anInt7430 + this.aLong198 >= this.aLong199 + (long) this.anInt7428) {
			local106 = (long) this.anInt7428 + this.aLong199;
		}
		if (local56 > -1L && local56 < local106) {
			@Pc(198) int local198 = (int) (local106 - local56);
			Static653.method6537(this.aByteArray64, (int) (local56 - this.aLong198), this.aByteArray63, (int) (local56 - this.aLong199), local198);
		}
		this.anInt7430 = 0;
		this.aLong198 = -1L;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(JI)V")
	public void method6272(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method6270());
		}
		this.aLong200 = arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)J")
	public long method6273() {
		return this.aLong196;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I[BII)V")
	public void method6275(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong198 != -1L && this.aLong198 <= this.aLong200 && (long) arg2 + this.aLong200 <= this.aLong198 - -((long) this.anInt7430)) {
				Static653.method6537(this.aByteArray64, (int) (this.aLong200 - this.aLong198), arg1, 0, arg2);
				this.aLong200 += (long) arg2;
				return;
			}
			@Pc(85) long local85 = this.aLong200;
			@Pc(89) int local89 = arg2;
			@Pc(125) int local125;
			if (this.aLong200 >= this.aLong199 && (long) this.anInt7428 + this.aLong199 > this.aLong200) {
				local125 = (int) ((long) this.anInt7428 + this.aLong199 - this.aLong200);
				if (arg2 < local125) {
					local125 = arg2;
				}
				Static653.method6537(this.aByteArray63, (int) (this.aLong200 - this.aLong199), arg1, 0, local125);
				arg0 = local125;
				this.aLong200 += (long) local125;
				arg2 -= local125;
			}
			if (arg2 > this.aByteArray63.length) {
				this.aClass360_4.method8356(this.aLong200);
				this.aLong195 = this.aLong200;
				while (arg2 > 0) {
					local125 = this.aClass360_4.method8358(arg2, arg0, arg1);
					if (local125 == -1) {
						break;
					}
					arg0 += local125;
					this.aLong195 += (long) local125;
					arg2 -= local125;
					this.aLong200 += (long) local125;
				}
			} else if (arg2 > 0) {
				this.method6276();
				local125 = arg2;
				if (this.anInt7428 < arg2) {
					local125 = this.anInt7428;
				}
				Static653.method6537(this.aByteArray63, 0, arg1, arg0, local125);
				arg0 += local125;
				arg2 -= local125;
				this.aLong200 += (long) local125;
			}
			if (this.aLong198 != -1L) {
				if (this.aLong200 < this.aLong198 && arg2 > 0) {
					local125 = (int) (this.aLong198 - this.aLong200) + arg0;
					if (local125 > arg2 + arg0) {
						local125 = arg2 + arg0;
					}
					while (arg0 < local125) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong200++;
					}
				}
				@Pc(312) long local312 = -1L;
				if (local85 <= this.aLong198 && local85 + (long) local89 > this.aLong198) {
					local312 = this.aLong198;
				} else if (local85 >= this.aLong198 && local85 < (long) this.anInt7430 + this.aLong198) {
					local312 = local85;
				}
				@Pc(352) long local352 = -1L;
				if (local85 < this.aLong198 + (long) this.anInt7430 && (long) this.anInt7430 + this.aLong198 <= local85 + (long) local89) {
					local352 = this.aLong198 + (long) this.anInt7430;
				} else if (local85 + (long) local89 > this.aLong198 && local85 + (long) local89 <= (long) this.anInt7430 + this.aLong198) {
					local352 = (long) local89 + local85;
				}
				if (local312 > -1L && local312 < local352) {
					@Pc(430) int local430 = (int) (local352 - local312);
					Static653.method6537(this.aByteArray64, (int) (local312 - this.aLong198), arg1, (int) (local312 - local85), local430);
					if (local352 > this.aLong200) {
						arg2 = (int) ((long) arg2 + this.aLong200 - local352);
						this.aLong200 = local352;
					}
				}
			}
		} catch (@Pc(467) IOException local467) {
			this.aLong195 = -1L;
			throw local467;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(B)V")
	private void method6276() throws IOException {
		this.anInt7428 = 0;
		if (this.aLong195 != this.aLong200) {
			this.aClass360_4.method8356(this.aLong200);
			this.aLong195 = this.aLong200;
		}
		this.aLong199 = this.aLong200;
		while (this.anInt7428 < this.aByteArray63.length) {
			@Pc(49) int local49 = this.aByteArray63.length - this.anInt7428;
			if (local49 > 200000000) {
				local49 = 200000000;
			}
			@Pc(64) int local64 = this.aClass360_4.method8358(local49, this.anInt7428, this.aByteArray63);
			if (local64 == -1) {
				break;
			}
			this.aLong195 += (long) local64;
			this.anInt7428 += local64;
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III[B)V")
	public void method6278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong200 > this.aLong196) {
				this.aLong196 = this.aLong200 + (long) arg0;
			}
			if (this.aLong198 != -1L && (this.aLong200 < this.aLong198 || this.aLong200 > (long) this.anInt7430 + this.aLong198)) {
				this.method6271();
			}
			if (this.aLong198 != (long) -1 && this.aLong198 + (long) this.aByteArray64.length < this.aLong200 + (long) arg0) {
				@Pc(93) int local93 = (int) ((long) this.aByteArray64.length + this.aLong198 - this.aLong200);
				Static653.method6537(arg2, arg1, this.aByteArray64, (int) (this.aLong200 - this.aLong198), local93);
				this.aLong200 += (long) local93;
				arg1 += local93;
				arg0 -= local93;
				this.anInt7430 = this.aByteArray64.length;
				this.method6271();
			}
			if (arg0 > this.aByteArray64.length) {
				if (this.aLong200 != this.aLong195) {
					this.aClass360_4.method8356(this.aLong200);
					this.aLong195 = this.aLong200;
				}
				this.aClass360_4.method8361(arg2, arg1, arg0);
				this.aLong195 += (long) arg0;
				if (this.aLong197 < this.aLong195) {
					this.aLong197 = this.aLong195;
				}
				@Pc(185) long local185 = -1L;
				@Pc(187) long local187 = -1L;
				if (this.aLong199 <= this.aLong200 && this.aLong199 + (long) this.anInt7428 > this.aLong200) {
					local185 = this.aLong200;
				} else if (this.aLong199 >= this.aLong200 && (long) arg0 + this.aLong200 > this.aLong199) {
					local185 = this.aLong199;
				}
				if (this.aLong199 < this.aLong200 + (long) arg0 && (long) this.anInt7428 + this.aLong199 >= this.aLong200 + (long) arg0) {
					local187 = (long) arg0 + this.aLong200;
				} else if (this.aLong200 < (long) this.anInt7428 + this.aLong199 && this.aLong199 + (long) this.anInt7428 <= this.aLong200 + (long) arg0) {
					local187 = this.aLong199 + (long) this.anInt7428;
				}
				if (local185 > -1L && local187 > local185) {
					@Pc(319) int local319 = (int) (local187 - local185);
					Static653.method6537(arg2, (int) (local185 + (long) arg1 - this.aLong200), this.aByteArray63, (int) (local185 - this.aLong199), local319);
				}
				this.aLong200 += (long) arg0;
			} else if (arg0 > 0) {
				if (this.aLong198 == -1L) {
					this.aLong198 = this.aLong200;
				}
				Static653.method6537(arg2, arg1, this.aByteArray64, (int) (this.aLong200 - this.aLong198), arg0);
				this.aLong200 += (long) arg0;
				if ((long) this.anInt7430 < this.aLong200 - this.aLong198) {
					this.anInt7430 = (int) (this.aLong200 - this.aLong198);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong195 = -1L;
			throw local404;
		}
	}
}
