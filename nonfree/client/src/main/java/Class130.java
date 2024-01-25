import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class130 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	private int anInt3696;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "J")
	private long aLong108 = -1L;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "J")
	private long aLong110 = -1L;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	private int anInt3701 = 0;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!rv;")
	private final Class320 aClass320_4;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "[B")
	private final byte[] aByteArray27;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "[B")
	private final byte[] aByteArray26;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!rv;II)V")
	public Class130(@OriginalArg(0) Class320 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass320_4 = arg0;
		this.aLong107 = this.aLong106 = arg0.method7686();
		this.aByteArray27 = new byte[arg1];
		this.aByteArray26 = new byte[arg2];
		this.aLong109 = 0L;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIII)V")
	public void method3456(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong109 > this.aLong107) {
				this.aLong107 = (long) arg2 + this.aLong109;
			}
			if ((long) -1 != this.aLong110 && (this.aLong109 < this.aLong110 || this.aLong109 > this.aLong110 + (long) this.anInt3701)) {
				this.method3459();
			}
			if (this.aLong110 != -1L && (long) arg2 + this.aLong109 > (long) this.aByteArray26.length + this.aLong110) {
				@Pc(99) int local99 = (int) (this.aLong110 + (long) this.aByteArray26.length - this.aLong109);
				Static695.method5648(arg0, arg1, this.aByteArray26, (int) (this.aLong109 - this.aLong110), local99);
				arg2 -= local99;
				arg1 += local99;
				this.aLong109 += (long) local99;
				this.anInt3701 = this.aByteArray26.length;
				this.method3459();
			}
			if (arg2 > this.aByteArray26.length) {
				if (this.aLong109 != this.aLong111) {
					this.aClass320_4.method7687(this.aLong109);
					this.aLong111 = this.aLong109;
				}
				this.aClass320_4.method7688(arg2, arg0, arg1);
				this.aLong111 += (long) arg2;
				if (this.aLong111 > this.aLong106) {
					this.aLong106 = this.aLong111;
				}
				@Pc(196) long local196 = -1L;
				@Pc(198) long local198 = -1L;
				if (this.aLong109 >= this.aLong108 && this.aLong109 < this.aLong108 + (long) this.anInt3696) {
					local196 = this.aLong109;
				} else if (this.aLong109 <= this.aLong108 && this.aLong108 < (long) arg2 + this.aLong109) {
					local196 = this.aLong108;
				}
				if (this.aLong108 < this.aLong109 + (long) arg2 && this.aLong108 + (long) this.anInt3696 >= this.aLong109 - -((long) arg2)) {
					local198 = this.aLong109 + (long) arg2;
				} else if (this.aLong109 < this.aLong108 + (long) this.anInt3696 && this.aLong108 + (long) this.anInt3696 <= (long) arg2 + this.aLong109) {
					local198 = (long) this.anInt3696 + this.aLong108;
				}
				if (local196 > -1L && local198 > local196) {
					@Pc(347) int local347 = (int) (local198 - local196);
					Static695.method5648(arg0, (int) ((long) arg1 + local196 - this.aLong109), this.aByteArray27, (int) (local196 - this.aLong108), local347);
				}
				this.aLong109 += (long) arg2;
			} else if (arg2 > 0) {
				if (this.aLong110 == -1L) {
					this.aLong110 = this.aLong109;
				}
				Static695.method5648(arg0, arg1, this.aByteArray26, (int) (this.aLong109 - this.aLong110), arg2);
				this.aLong109 += (long) arg2;
				if (this.aLong109 - this.aLong110 > (long) this.anInt3701) {
					this.anInt3701 = (int) (this.aLong109 - this.aLong110);
				}
			}
		} catch (@Pc(439) IOException local439) {
			this.aLong111 = -1L;
			throw local439;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BB)V")
	public void method3457(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method3461(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public void method3458() throws IOException {
		this.method3459();
		this.aClass320_4.method7693();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	private void method3459() throws IOException {
		if (this.aLong110 == -1L) {
			return;
		}
		if (this.aLong110 != this.aLong111) {
			this.aClass320_4.method7687(this.aLong110);
			this.aLong111 = this.aLong110;
		}
		this.aClass320_4.method7688(this.anInt3701, this.aByteArray26, 0);
		this.aLong111 += (long) this.anInt3701;
		if (this.aLong111 > this.aLong106) {
			this.aLong106 = this.aLong111;
		}
		@Pc(65) long local65 = -1L;
		if (this.aLong108 <= this.aLong110 && (long) this.anInt3696 + this.aLong108 > this.aLong110) {
			local65 = this.aLong110;
		} else if (this.aLong110 <= this.aLong108 && (long) this.anInt3701 + this.aLong110 > this.aLong108) {
			local65 = this.aLong108;
		}
		@Pc(121) long local121 = -1L;
		if (this.aLong108 < (long) this.anInt3701 + this.aLong110 && this.aLong110 + (long) this.anInt3701 <= (long) this.anInt3696 + this.aLong108) {
			local121 = this.aLong110 + (long) this.anInt3701;
		} else if (this.aLong108 + (long) this.anInt3696 > this.aLong110 && (long) this.anInt3701 + this.aLong110 >= this.aLong108 + (long) this.anInt3696) {
			local121 = this.aLong108 + (long) this.anInt3696;
		}
		if (local65 > -1L && local65 < local121) {
			@Pc(214) int local214 = (int) (local121 - local65);
			Static695.method5648(this.aByteArray26, (int) (local65 - this.aLong110), this.aByteArray27, (int) (local65 - this.aLong108), local214);
		}
		this.aLong110 = -1L;
		this.anInt3701 = 0;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)Ljava/io/File;")
	private File method3460() {
		return this.aClass320_4.method7691();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[BI)V")
	public void method3461(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong110 != -1L && this.aLong110 <= this.aLong109 && this.aLong110 + (long) this.anInt3701 >= (long) arg0 + this.aLong109) {
				Static695.method5648(this.aByteArray26, (int) (this.aLong109 - this.aLong110), arg1, 0, arg0);
				this.aLong109 += (long) arg0;
				return;
			}
			@Pc(90) long local90 = this.aLong109;
			@Pc(94) int local94 = arg0;
			@Pc(129) int local129;
			if (this.aLong108 <= this.aLong109 && this.aLong109 < this.aLong108 + (long) this.anInt3696) {
				local129 = (int) ((long) this.anInt3696 + this.aLong108 - this.aLong109);
				if (local129 > arg0) {
					local129 = arg0;
				}
				Static695.method5648(this.aByteArray27, (int) (this.aLong109 - this.aLong108), arg1, 0, local129);
				arg2 = local129;
				this.aLong109 += (long) local129;
				arg0 -= local129;
			}
			if (this.aByteArray27.length < arg0) {
				this.aClass320_4.method7687(this.aLong109);
				this.aLong111 = this.aLong109;
				while (arg0 > 0) {
					local129 = this.aClass320_4.method7695(arg0, arg1, arg2);
					if (local129 == -1) {
						break;
					}
					this.aLong109 += (long) local129;
					arg0 -= local129;
					arg2 += local129;
					this.aLong111 += (long) local129;
				}
			} else if (arg0 > 0) {
				this.method3462();
				local129 = arg0;
				if (this.anInt3696 < arg0) {
					local129 = this.anInt3696;
				}
				Static695.method5648(this.aByteArray27, 0, arg1, arg2, local129);
				arg0 -= local129;
				this.aLong109 += (long) local129;
				arg2 += local129;
			}
			if (this.aLong110 != -1L) {
				if (this.aLong110 > this.aLong109 && arg0 > 0) {
					local129 = arg2 + (int) (this.aLong110 - this.aLong109);
					if (local129 > arg2 + arg0) {
						local129 = arg0 + arg2;
					}
					while (local129 > arg2) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong109++;
					}
				}
				@Pc(343) long local343 = -1L;
				@Pc(345) long local345 = -1L;
				if (local90 <= this.aLong110 && local90 + (long) local94 > this.aLong110) {
					local343 = this.aLong110;
				} else if (this.aLong110 <= local90 && local90 < this.aLong110 + (long) this.anInt3701) {
					local343 = local90;
				}
				if (local90 < (long) this.anInt3701 + this.aLong110 && (long) this.anInt3701 + this.aLong110 <= local90 + (long) local94) {
					local345 = (long) this.anInt3701 + this.aLong110;
				} else if (this.aLong110 < local90 + (long) local94 && local90 + (long) local94 <= (long) this.anInt3701 + this.aLong110) {
					local345 = local90 + (long) local94;
				}
				if (local343 > -1L && local343 < local345) {
					@Pc(485) int local485 = (int) (local345 - local343);
					Static695.method5648(this.aByteArray26, (int) (local343 - this.aLong110), arg1, (int) (local343 - local90), local485);
					if (this.aLong109 < local345) {
						arg0 = (int) ((long) arg0 + this.aLong109 - local345);
						this.aLong109 = local345;
					}
				}
			}
		} catch (@Pc(522) IOException local522) {
			this.aLong111 = -1L;
			throw local522;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	private void method3462() throws IOException {
		this.anInt3696 = 0;
		if (this.aLong109 != this.aLong111) {
			this.aClass320_4.method7687(this.aLong109);
			this.aLong111 = this.aLong109;
		}
		this.aLong108 = this.aLong109;
		while (this.aByteArray27.length > this.anInt3696) {
			@Pc(57) int local57 = this.aByteArray27.length - this.anInt3696;
			if (local57 > 200000000) {
				local57 = 200000000;
			}
			@Pc(72) int local72 = this.aClass320_4.method7695(local57, this.aByteArray27, this.anInt3696);
			if (local72 == -1) {
				break;
			}
			this.anInt3696 += local72;
			this.aLong111 += (long) local72;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)J")
	public long method3463() {
		return this.aLong107;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(JI)V")
	public void method3465(@OriginalArg(0) long arg0) throws IOException {
		if ((long) 0 > arg0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3460());
		}
		this.aLong109 = arg0;
	}
}
