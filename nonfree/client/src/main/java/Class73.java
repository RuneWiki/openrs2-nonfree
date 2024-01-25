import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class73 {

	@OriginalMember(owner = "client!eba", name = "j", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
	private int anInt2337;

	@OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
	private int anInt2334 = 0;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "J")
	private long aLong60 = -1L;

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "J")
	private long aLong61 = -1L;

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "Lclient!kda;")
	private final Class171 aClass171_1;

	@OriginalMember(owner = "client!eba", name = "s", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!eba", name = "r", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "[B")
	private final byte[] aByteArray42;

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "[B")
	private final byte[] aByteArray41;

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!kda;II)V")
	public Class73(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass171_1 = arg0;
		this.aLong64 = this.aLong65 = arg0.method4935();
		this.aByteArray42 = new byte[arg2];
		this.aByteArray41 = new byte[arg1];
		this.aLong62 = 0L;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)J")
	public long method1961() {
		return this.aLong64;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
	private void method1962() throws IOException {
		if (this.aLong61 == -1L) {
			return;
		}
		if (this.aLong63 != this.aLong61) {
			this.aClass171_1.method4931(this.aLong61);
			this.aLong63 = this.aLong61;
		}
		this.aClass171_1.method4937(this.aByteArray42, 0, this.anInt2334);
		this.aLong63 += (long) this.anInt2334;
		if (this.aLong63 > this.aLong65) {
			this.aLong65 = this.aLong63;
		}
		@Pc(59) long local59 = -1L;
		if (this.aLong60 <= this.aLong61 && (long) this.anInt2337 + this.aLong60 > this.aLong61) {
			local59 = this.aLong61;
		} else if (this.aLong61 <= this.aLong60 && (long) this.anInt2334 + this.aLong61 > this.aLong60) {
			local59 = this.aLong60;
		}
		@Pc(117) long local117 = -1L;
		if ((long) this.anInt2334 + this.aLong61 > this.aLong60 && (long) this.anInt2334 + this.aLong61 <= (long) this.anInt2337 + this.aLong60) {
			local117 = this.aLong61 + (long) this.anInt2334;
		} else if (this.aLong61 < (long) this.anInt2337 + this.aLong60 && this.aLong61 + (long) this.anInt2334 >= this.aLong60 + (long) this.anInt2337) {
			local117 = (long) this.anInt2337 + this.aLong60;
		}
		if (local59 > -1L && local59 < local117) {
			@Pc(204) int local204 = (int) (local117 - local59);
			Static655.method5836(this.aByteArray42, (int) (local59 - this.aLong61), this.aByteArray41, (int) (local59 - this.aLong60), local204);
		}
		this.anInt2334 = 0;
		this.aLong61 = -1L;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(III[B)V")
	public void method1963(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong62 + (long) arg0 > this.aLong64) {
				this.aLong64 = this.aLong62 + (long) arg0;
			}
			if (this.aLong61 != -1L && (this.aLong61 > this.aLong62 || this.aLong62 > this.aLong61 + (long) this.anInt2334)) {
				this.method1962();
			}
			if (this.aLong61 != (long) -1 && (long) arg0 + this.aLong62 > this.aLong61 + (long) this.aByteArray42.length) {
				@Pc(85) int local85 = (int) ((long) this.aByteArray42.length + this.aLong61 - this.aLong62);
				Static655.method5836(arg2, arg1, this.aByteArray42, (int) (this.aLong62 - this.aLong61), local85);
				this.aLong62 += (long) local85;
				arg0 -= local85;
				arg1 += local85;
				this.anInt2334 = this.aByteArray42.length;
				this.method1962();
			}
			if (arg0 > this.aByteArray42.length) {
				if (this.aLong62 != this.aLong63) {
					this.aClass171_1.method4931(this.aLong62);
					this.aLong63 = this.aLong62;
				}
				this.aClass171_1.method4937(arg2, arg1, arg0);
				this.aLong63 += (long) arg0;
				if (this.aLong65 < this.aLong63) {
					this.aLong65 = this.aLong63;
				}
				@Pc(175) long local175 = -1L;
				@Pc(177) long local177 = -1L;
				if (this.aLong62 >= this.aLong60 && (long) this.anInt2337 + this.aLong60 > this.aLong62) {
					local175 = this.aLong62;
				} else if (this.aLong62 <= this.aLong60 && (long) arg0 + this.aLong62 > this.aLong60) {
					local175 = this.aLong60;
				}
				if (this.aLong60 < this.aLong62 + (long) arg0 && (long) this.anInt2337 + this.aLong60 >= this.aLong62 - -((long) arg0)) {
					local177 = this.aLong62 + (long) arg0;
				} else if (this.aLong62 < (long) this.anInt2337 + this.aLong60 && this.aLong60 + (long) this.anInt2337 <= this.aLong62 - -((long) arg0)) {
					local177 = this.aLong60 + (long) this.anInt2337;
				}
				if (local175 > -1L && local177 > local175) {
					@Pc(324) int local324 = (int) (local177 - local175);
					Static655.method5836(arg2, (int) (local175 + (long) arg1 - this.aLong62), this.aByteArray41, (int) (local175 - this.aLong60), local324);
				}
				this.aLong62 += (long) arg0;
			} else if (arg0 > 0) {
				if (this.aLong61 == -1L) {
					this.aLong61 = this.aLong62;
				}
				Static655.method5836(arg2, arg1, this.aByteArray42, (int) (this.aLong62 - this.aLong61), arg0);
				this.aLong62 += (long) arg0;
				if ((long) this.anInt2334 < this.aLong62 - this.aLong61) {
					this.anInt2334 = (int) (this.aLong62 - this.aLong61);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong63 = -1L;
			throw local404;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method1965() {
		return this.aClass171_1.method4936();
	}

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(I)V")
	public void method1966() throws IOException {
		this.method1962();
		this.aClass171_1.method4934();
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "([BB)V")
	public void method1967(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1971(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)V")
	private void method1969() throws IOException {
		this.anInt2337 = 0;
		if (this.aLong62 != this.aLong63) {
			this.aClass171_1.method4931(this.aLong62);
			this.aLong63 = this.aLong62;
		}
		this.aLong60 = this.aLong62;
		while (this.aByteArray41.length > this.anInt2337) {
			@Pc(46) int local46 = this.aByteArray41.length - this.anInt2337;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(63) int local63 = this.aClass171_1.method4930(this.aByteArray41, this.anInt2337, local46);
			if (local63 == -1) {
				break;
			}
			this.anInt2337 += local63;
			this.aLong63 += (long) local63;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IJ)V")
	public void method1970(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1965());
		}
		this.aLong62 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I[BII)V")
	public void method1971(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong61 != -1L && this.aLong61 <= this.aLong62 && this.aLong62 + (long) arg2 <= (long) this.anInt2334 + this.aLong61) {
				Static655.method5836(this.aByteArray42, (int) (this.aLong62 - this.aLong61), arg1, 0, arg2);
				this.aLong62 += (long) arg2;
				return;
			}
			@Pc(81) long local81 = this.aLong62;
			@Pc(85) int local85 = arg2;
			@Pc(119) int local119;
			if (this.aLong60 <= this.aLong62 && this.aLong62 < this.aLong60 + (long) this.anInt2337) {
				local119 = (int) ((long) this.anInt2337 + this.aLong60 - this.aLong62);
				if (local119 > arg2) {
					local119 = arg2;
				}
				Static655.method5836(this.aByteArray41, (int) (this.aLong62 - this.aLong60), arg1, 0, local119);
				arg2 -= local119;
				arg0 = local119;
				this.aLong62 += (long) local119;
			}
			if (arg2 > this.aByteArray41.length) {
				this.aClass171_1.method4931(this.aLong62);
				this.aLong63 = this.aLong62;
				while (arg2 > 0) {
					local119 = this.aClass171_1.method4930(arg1, arg0, arg2);
					if (local119 == -1) {
						break;
					}
					arg2 -= local119;
					arg0 += local119;
					this.aLong63 += (long) local119;
					this.aLong62 += (long) local119;
				}
			} else if (arg2 > 0) {
				this.method1969();
				local119 = arg2;
				if (arg2 > this.anInt2337) {
					local119 = this.anInt2337;
				}
				Static655.method5836(this.aByteArray41, 0, arg1, arg0, local119);
				arg0 += local119;
				this.aLong62 += (long) local119;
				arg2 -= local119;
			}
			if (this.aLong61 != -1L) {
				if (this.aLong62 < this.aLong61 && arg2 > 0) {
					local119 = (int) (this.aLong61 - this.aLong62) + arg0;
					if (arg2 + arg0 < local119) {
						local119 = arg0 + arg2;
					}
					while (arg0 < local119) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong62++;
					}
				}
				@Pc(307) long local307 = -1L;
				@Pc(309) long local309 = -1L;
				if (this.aLong61 >= local81 && local81 + (long) local85 > this.aLong61) {
					local307 = this.aLong61;
				} else if (this.aLong61 <= local81 && (long) this.anInt2334 + this.aLong61 > local81) {
					local307 = local81;
				}
				if (local81 < this.aLong61 + (long) this.anInt2334 && (long) this.anInt2334 + this.aLong61 <= local81 - -((long) local85)) {
					local309 = (long) this.anInt2334 + this.aLong61;
				} else if (this.aLong61 < (long) local85 + local81 && local81 + (long) local85 <= this.aLong61 - -((long) this.anInt2334)) {
					local309 = (long) local85 + local81;
				}
				if (local307 > -1L && local309 > local307) {
					@Pc(446) int local446 = (int) (local309 - local307);
					Static655.method5836(this.aByteArray42, (int) (local307 - this.aLong61), arg1, (int) (local307 - local81), local446);
					if (this.aLong62 < local309) {
						arg2 = (int) ((long) arg2 + this.aLong62 - local309);
						this.aLong62 = local309;
					}
				}
			}
		} catch (@Pc(488) IOException local488) {
			this.aLong63 = -1L;
			throw local488;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}
}
