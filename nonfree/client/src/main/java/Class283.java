import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class283 {

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "J")
	private long aLong223;

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
	private int anInt8379;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "J")
	private long aLong224 = -1L;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
	private int anInt8372 = 0;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "J")
	private long aLong225 = -1L;

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "Lclient!wc;")
	private final Class354 aClass354_1;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "J")
	private long aLong228;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "J")
	private long aLong227;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "[B")
	private final byte[] aByteArray78;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "[B")
	private final byte[] aByteArray79;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "J")
	private long aLong226;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!wc;II)V")
	public Class283(@OriginalArg(0) Class354 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass354_1 = arg0;
		this.aLong227 = this.aLong228 = arg0.method8081();
		this.aByteArray78 = new byte[arg2];
		this.aByteArray79 = new byte[arg1];
		this.aLong226 = 0L;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II[BI)V")
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong224 != -1L && this.aLong226 >= this.aLong224 && (long) this.anInt8372 + this.aLong224 >= (long) arg0 + this.aLong226) {
				Static599.method3060(this.aByteArray78, (int) (this.aLong226 - this.aLong224), arg1, 0, arg0);
				this.aLong226 += arg0;
				return;
			}
			@Pc(78) long local78 = this.aLong226;
			@Pc(82) int local82 = arg0;
			@Pc(114) int local114;
			if (this.aLong225 <= this.aLong226 && this.aLong226 < (long) this.anInt8379 + this.aLong225) {
				local114 = (int) (this.aLong225 + (long) this.anInt8379 - this.aLong226);
				if (local114 > arg0) {
					local114 = arg0;
				}
				Static599.method3060(this.aByteArray79, (int) (this.aLong226 - this.aLong225), arg1, 0, local114);
				arg2 = local114;
				this.aLong226 += local114;
				arg0 -= local114;
			}
			if (this.aByteArray79.length < arg0) {
				this.aClass354_1.method8084(this.aLong226);
				this.aLong223 = this.aLong226;
				while (arg0 > 0) {
					local114 = this.aClass354_1.method8083(arg0, arg1, arg2);
					if (local114 == -1) {
						break;
					}
					arg0 -= local114;
					this.aLong226 += local114;
					arg2 += local114;
					this.aLong223 += local114;
				}
			} else if (arg0 > 0) {
				this.method6491();
				local114 = arg0;
				if (arg0 > this.anInt8379) {
					local114 = this.anInt8379;
				}
				Static599.method3060(this.aByteArray79, 0, arg1, arg2, local114);
				arg0 -= local114;
				arg2 += local114;
				this.aLong226 += local114;
			}
			if (this.aLong224 != -1L) {
				if (this.aLong224 > this.aLong226 && arg0 > 0) {
					local114 = arg2 + (int) (this.aLong224 - this.aLong226);
					if (arg2 + arg0 < local114) {
						local114 = arg0 + arg2;
					}
					while (local114 > arg2) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong226++;
					}
				}
				@Pc(305) long local305 = -1L;
				@Pc(307) long local307 = -1L;
				if (local78 <= this.aLong224 && this.aLong224 < local78 + (long) local82) {
					local305 = this.aLong224;
				} else if (local78 >= this.aLong224 && local78 < (long) this.anInt8372 + this.aLong224) {
					local305 = local78;
				}
				if ((long) this.anInt8372 + this.aLong224 > local78 && this.aLong224 + (long) this.anInt8372 <= (long) local82 + local78) {
					local307 = this.aLong224 + (long) this.anInt8372;
				} else if (this.aLong224 < local78 + (long) local82 && (long) local82 + local78 <= (long) this.anInt8372 + this.aLong224) {
					local307 = (long) local82 + local78;
				}
				if (local305 > -1L && local305 < local307) {
					@Pc(439) int local439 = (int) (local307 - local305);
					Static599.method3060(this.aByteArray78, (int) (local305 - this.aLong224), arg1, (int) (local305 - local78), local439);
					if (this.aLong226 < local307) {
						arg0 = (int) ((long) arg0 + this.aLong226 - local307);
						this.aLong226 = local307;
					}
				}
			}
		} catch (@Pc(480) IOException local480) {
			this.aLong223 = -1L;
			throw local480;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public void method6485() throws IOException {
		this.method6492();
		this.aClass354_1.method8089();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[BBI)V")
	public void method6486(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong227 < (long) arg0 + this.aLong226) {
				this.aLong227 = this.aLong226 + (long) arg0;
			}
			if (this.aLong224 != -1L && (this.aLong224 > this.aLong226 || this.aLong226 > this.aLong224 + (long) this.anInt8372)) {
				this.method6492();
			}
			if (this.aLong224 != -1L && this.aLong224 + (long) this.aByteArray78.length < this.aLong226 - -((long) arg0)) {
				@Pc(104) int local104 = (int) ((long) this.aByteArray78.length + this.aLong224 - this.aLong226);
				Static599.method3060(arg1, arg2, this.aByteArray78, (int) (this.aLong226 - this.aLong224), local104);
				arg0 -= local104;
				this.aLong226 += local104;
				arg2 += local104;
				this.anInt8372 = this.aByteArray78.length;
				this.method6492();
			}
			if (this.aByteArray78.length < arg0) {
				if (this.aLong223 != this.aLong226) {
					this.aClass354_1.method8084(this.aLong226);
					this.aLong223 = this.aLong226;
				}
				this.aClass354_1.method8086(arg1, arg0, arg2);
				this.aLong223 += arg0;
				if (this.aLong223 > this.aLong228) {
					this.aLong228 = this.aLong223;
				}
				@Pc(195) long local195 = -1L;
				@Pc(197) long local197 = -1L;
				if (this.aLong225 <= this.aLong226 && this.aLong225 + (long) this.anInt8379 > this.aLong226) {
					local195 = this.aLong226;
				} else if (this.aLong225 >= this.aLong226 && this.aLong225 < (long) arg0 + this.aLong226) {
					local195 = this.aLong225;
				}
				if (this.aLong226 + (long) arg0 > this.aLong225 && (long) arg0 + this.aLong226 <= this.aLong225 - -((long) this.anInt8379)) {
					local197 = this.aLong226 + (long) arg0;
				} else if (this.aLong225 + (long) this.anInt8379 > this.aLong226 && this.aLong226 + (long) arg0 >= (long) this.anInt8379 + this.aLong225) {
					local197 = (long) this.anInt8379 + this.aLong225;
				}
				if (local195 > -1L && local197 > local195) {
					@Pc(320) int local320 = (int) (local197 - local195);
					Static599.method3060(arg1, (int) (local195 + (long) arg2 - this.aLong226), this.aByteArray79, (int) (local195 - this.aLong225), local320);
				}
				this.aLong226 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong224 == -1L) {
					this.aLong224 = this.aLong226;
				}
				Static599.method3060(arg1, arg2, this.aByteArray78, (int) (this.aLong226 - this.aLong224), arg0);
				this.aLong226 += arg0;
				if (this.aLong226 - this.aLong224 > (long) this.anInt8372) {
					this.anInt8372 = (int) (this.aLong226 - this.aLong224);
				}
			}
		} catch (@Pc(406) IOException local406) {
			this.aLong223 = -1L;
			throw local406;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[B)V")
	public void method6487(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method6484(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6488() {
		return this.aClass354_1.method8087();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IJ)V")
	public void method6489(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method6488());
		}
		this.aLong226 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)J")
	public long method6490() {
		return this.aLong227;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	private void method6491() throws IOException {
		this.anInt8379 = 0;
		if (this.aLong226 != this.aLong223) {
			this.aClass354_1.method8084(this.aLong226);
			this.aLong223 = this.aLong226;
		}
		this.aLong225 = this.aLong226;
		while (this.aByteArray79.length > this.anInt8379) {
			@Pc(38) int local38 = this.aByteArray79.length - this.anInt8379;
			if (local38 > 200000000) {
				local38 = 200000000;
			}
			@Pc(55) int local55 = this.aClass354_1.method8083(local38, this.aByteArray79, this.anInt8379);
			if (local55 == -1) {
				break;
			}
			this.aLong223 += local55;
			this.anInt8379 += local55;
		}
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
	private void method6492() throws IOException {
		if (this.aLong224 == -1L) {
			return;
		}
		if (this.aLong224 != this.aLong223) {
			this.aClass354_1.method8084(this.aLong224);
			this.aLong223 = this.aLong224;
		}
		this.aClass354_1.method8086(this.aByteArray78, this.anInt8372, 0);
		this.aLong223 += this.anInt8372;
		if (this.aLong228 < this.aLong223) {
			this.aLong228 = this.aLong223;
		}
		@Pc(57) long local57 = -1L;
		if (this.aLong224 >= this.aLong225 && this.aLong224 < this.aLong225 + (long) this.anInt8379) {
			local57 = this.aLong224;
		} else if (this.aLong225 >= this.aLong224 && this.aLong225 < (long) this.anInt8372 + this.aLong224) {
			local57 = this.aLong225;
		}
		@Pc(107) long local107 = -1L;
		if (this.aLong225 < this.aLong224 + (long) this.anInt8372 && this.aLong224 + (long) this.anInt8372 <= this.aLong225 + (long) this.anInt8379) {
			local107 = (long) this.anInt8372 + this.aLong224;
		} else if ((long) this.anInt8379 + this.aLong225 > this.aLong224 && (long) this.anInt8372 + this.aLong224 >= this.aLong225 - -((long) this.anInt8379)) {
			local107 = this.aLong225 + (long) this.anInt8379;
		}
		if (local57 > -1L && local57 < local107) {
			@Pc(198) int local198 = (int) (local107 - local57);
			Static599.method3060(this.aByteArray78, (int) (local57 - this.aLong224), this.aByteArray79, (int) (local57 - this.aLong225), local198);
		}
		this.aLong224 = -1L;
		this.anInt8372 = 0;
	}
}
