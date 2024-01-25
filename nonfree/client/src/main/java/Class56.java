import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class56 {

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
	private int anInt1304;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
	private int anInt1301 = 0;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "J")
	private long aLong45 = -1L;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "J")
	private long aLong44 = -1L;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "Lclient!baa;")
	private final Class23 aClass23_1;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "[B")
	private final byte[] aByteArray18;

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!baa;II)V")
	public Class56(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass23_1 = arg0;
		this.aLong46 = this.aLong42 = arg0.method498();
		this.aLong47 = 0L;
		this.aByteArray18 = new byte[arg1];
		this.aByteArray17 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([BI)V")
	public void method1122(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1131(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(JB)V")
	public void method1123(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1125());
		}
		this.aLong47 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	private void method1124() throws IOException {
		if (this.aLong45 == -1L) {
			return;
		}
		if (this.aLong43 != this.aLong45) {
			this.aClass23_1.method499(this.aLong45);
			this.aLong43 = this.aLong45;
		}
		this.aClass23_1.method496(0, this.aByteArray17, this.anInt1301);
		this.aLong43 += this.anInt1301;
		if (this.aLong42 < this.aLong43) {
			this.aLong42 = this.aLong43;
		}
		@Pc(65) long local65 = -1L;
		if (this.aLong44 <= this.aLong45 && this.aLong45 < (long) this.anInt1304 + this.aLong44) {
			local65 = this.aLong45;
		} else if (this.aLong44 >= this.aLong45 && this.aLong44 < this.aLong45 + (long) this.anInt1301) {
			local65 = this.aLong44;
		}
		@Pc(116) long local116 = -1L;
		if (this.aLong45 + (long) this.anInt1301 > this.aLong44 && this.aLong45 + (long) this.anInt1301 <= this.aLong44 - -((long) this.anInt1304)) {
			local116 = (long) this.anInt1301 + this.aLong45;
		} else if (this.aLong44 + (long) this.anInt1304 > this.aLong45 && this.aLong44 + (long) this.anInt1304 <= this.aLong45 + (long) this.anInt1301) {
			local116 = this.aLong44 + (long) this.anInt1304;
		}
		if (local65 > -1L && local116 > local65) {
			@Pc(199) int local199 = (int) (local116 - local65);
			Static602.method1586(this.aByteArray17, (int) (local65 - this.aLong45), this.aByteArray18, (int) (local65 - this.aLong44), local199);
		}
		this.anInt1301 = 0;
		this.aLong45 = -1L;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method1125() {
		return this.aClass23_1.method493();
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
	public void method1126() throws IOException {
		this.method1124();
		this.aClass23_1.method495();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[BI)V")
	public void method1127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong46 < (long) arg0 + this.aLong47) {
				this.aLong46 = (long) arg0 + this.aLong47;
			}
			if (this.aLong45 != -1L && (this.aLong47 < this.aLong45 || (long) this.anInt1301 + this.aLong45 < this.aLong47)) {
				this.method1124();
			}
			if (this.aLong45 != -1L && this.aLong45 + (long) this.aByteArray17.length < this.aLong47 + (long) arg0) {
				@Pc(95) int local95 = (int) (this.aLong45 + (long) this.aByteArray17.length - this.aLong47);
				Static602.method1586(arg2, arg1, this.aByteArray17, (int) (this.aLong47 - this.aLong45), local95);
				arg1 += local95;
				arg0 -= local95;
				this.aLong47 += local95;
				this.anInt1301 = this.aByteArray17.length;
				this.method1124();
			}
			if (arg0 > this.aByteArray17.length) {
				if (this.aLong43 != this.aLong47) {
					this.aClass23_1.method499(this.aLong47);
					this.aLong43 = this.aLong47;
				}
				this.aClass23_1.method496(arg1, arg2, arg0);
				this.aLong43 += arg0;
				if (this.aLong42 < this.aLong43) {
					this.aLong42 = this.aLong43;
				}
				@Pc(184) long local184 = -1L;
				@Pc(186) long local186 = -1L;
				if (this.aLong47 >= this.aLong44 && (long) this.anInt1304 + this.aLong44 > this.aLong47) {
					local184 = this.aLong47;
				} else if (this.aLong44 >= this.aLong47 && this.aLong47 + (long) arg0 > this.aLong44) {
					local184 = this.aLong44;
				}
				if (this.aLong44 < this.aLong47 + (long) arg0 && (long) arg0 + this.aLong47 <= this.aLong44 + (long) this.anInt1304) {
					local186 = (long) arg0 + this.aLong47;
				} else if ((long) this.anInt1304 + this.aLong44 > this.aLong47 && (long) arg0 + this.aLong47 >= (long) this.anInt1304 + this.aLong44) {
					local186 = this.aLong44 + (long) this.anInt1304;
				}
				if (local184 > -1L && local184 < local186) {
					@Pc(317) int local317 = (int) (local186 - local184);
					Static602.method1586(arg2, (int) (local184 + (long) arg1 - this.aLong47), this.aByteArray18, (int) (local184 - this.aLong44), local317);
				}
				this.aLong47 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong45 == -1L) {
					this.aLong45 = this.aLong47;
				}
				Static602.method1586(arg2, arg1, this.aByteArray17, (int) (this.aLong47 - this.aLong45), arg0);
				this.aLong47 += arg0;
				if (this.aLong47 - this.aLong45 > (long) this.anInt1301) {
					this.anInt1301 = (int) (this.aLong47 - this.aLong45);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong43 = -1L;
			throw local404;
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)J")
	public long method1129() {
		return this.aLong46;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
	private void method1130() throws IOException {
		this.anInt1304 = 0;
		if (this.aLong47 != this.aLong43) {
			this.aClass23_1.method499(this.aLong47);
			this.aLong43 = this.aLong47;
		}
		this.aLong44 = this.aLong47;
		while (this.aByteArray18.length > this.anInt1304) {
			@Pc(45) int local45 = this.aByteArray18.length - this.anInt1304;
			if (local45 > 200000000) {
				local45 = 200000000;
			}
			@Pc(60) int local60 = this.aClass23_1.method492(local45, this.anInt1304, this.aByteArray18);
			if (local60 == -1) {
				break;
			}
			this.anInt1304 += local60;
			this.aLong43 += local60;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[BIB)V")
	public void method1131(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong45 != -1L && this.aLong45 <= this.aLong47 && (long) arg0 + this.aLong47 <= (long) this.anInt1301 + this.aLong45) {
				Static602.method1586(this.aByteArray17, (int) (this.aLong47 - this.aLong45), arg1, 0, arg0);
				this.aLong47 += arg0;
				return;
			}
			@Pc(82) long local82 = this.aLong47;
			@Pc(86) int local86 = arg0;
			@Pc(122) int local122;
			if (this.aLong47 >= this.aLong44 && (long) this.anInt1304 + this.aLong44 > this.aLong47) {
				local122 = (int) ((long) this.anInt1304 + this.aLong44 - this.aLong47);
				if (local122 > arg0) {
					local122 = arg0;
				}
				Static602.method1586(this.aByteArray18, (int) (this.aLong47 - this.aLong44), arg1, 0, local122);
				arg0 -= local122;
				arg2 = local122;
				this.aLong47 += local122;
			}
			if (this.aByteArray18.length < arg0) {
				this.aClass23_1.method499(this.aLong47);
				this.aLong43 = this.aLong47;
				while (arg0 > 0) {
					local122 = this.aClass23_1.method492(arg0, arg2, arg1);
					if (local122 == -1) {
						break;
					}
					this.aLong43 += local122;
					arg2 += local122;
					this.aLong47 += local122;
					arg0 -= local122;
				}
			} else if (arg0 > 0) {
				this.method1130();
				local122 = arg0;
				if (this.anInt1304 < arg0) {
					local122 = this.anInt1304;
				}
				Static602.method1586(this.aByteArray18, 0, arg1, arg2, local122);
				this.aLong47 += local122;
				arg2 += local122;
				arg0 -= local122;
			}
			if (this.aLong45 != -1L) {
				if (this.aLong47 < this.aLong45 && arg0 > 0) {
					local122 = (int) (this.aLong45 - this.aLong47) + arg2;
					if (local122 > arg0 + arg2) {
						local122 = arg2 + arg0;
					}
					while (arg2 < local122) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong47++;
					}
				}
				@Pc(314) long local314 = -1L;
				if (local82 <= this.aLong45 && this.aLong45 < (long) local86 + local82) {
					local314 = this.aLong45;
				} else if (this.aLong45 <= local82 && local82 < this.aLong45 + (long) this.anInt1301) {
					local314 = local82;
				}
				@Pc(362) long local362 = -1L;
				if (this.aLong45 + (long) this.anInt1301 > local82 && this.aLong45 + (long) this.anInt1301 <= (long) local86 + local82) {
					local362 = this.aLong45 + (long) this.anInt1301;
				} else if (local82 + (long) local86 > this.aLong45 && (long) this.anInt1301 + this.aLong45 >= (long) local86 + local82) {
					local362 = (long) local86 + local82;
				}
				if (local314 > -1L && local314 < local362) {
					@Pc(448) int local448 = (int) (local362 - local314);
					Static602.method1586(this.aByteArray17, (int) (local314 - this.aLong45), arg1, (int) (local314 - local82), local448);
					if (local362 > this.aLong47) {
						arg0 = (int) ((long) arg0 + this.aLong47 - local362);
						this.aLong47 = local362;
					}
				}
			}
		} catch (@Pc(486) IOException local486) {
			this.aLong43 = -1L;
			throw local486;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}
}
