import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class68 {

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	private int anInt2289;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "J")
	private long aLong75 = -1L;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
	private int anInt2282 = 0;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "J")
	private long aLong79 = -1L;

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "Lclient!on;")
	private Class132 aClass132_1;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!on;II)V")
	public Class68(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass132_1 = arg0;
		this.aLong76 = this.aLong78 = arg0.method3354();
		this.aByteArray25 = new byte[arg2];
		this.aByteArray26 = new byte[arg1];
		this.aLong80 = 0L;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method1972() {
		return this.aClass132_1.method3355();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IJ)V")
	public void method1973(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1972());
		}
		this.aLong80 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[BII)V")
	public void method1974(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong79 != -1L && this.aLong79 <= this.aLong80 && this.aLong80 + (long) arg2 <= (long) this.anInt2282 + this.aLong79) {
				Static319.method1766(this.aByteArray25, (int) (this.aLong80 - this.aLong79), arg0, 0, arg2);
				this.aLong80 += arg2;
				return;
			}
			@Pc(88) int local88 = arg2;
			@Pc(91) long local91 = this.aLong80;
			@Pc(128) int local128;
			if (this.aLong80 >= this.aLong75 && (long) this.anInt2289 + this.aLong75 > this.aLong80) {
				local128 = (int) (this.aLong75 + (long) this.anInt2289 - this.aLong80);
				if (arg2 < local128) {
					local128 = arg2;
				}
				arg2 -= local128;
				Static319.method1766(this.aByteArray26, (int) (this.aLong80 - this.aLong75), arg0, 0, local128);
				this.aLong80 += local128;
				arg1 = local128;
			}
			if (arg2 > this.aByteArray26.length) {
				this.aClass132_1.method3353(this.aLong80);
				this.aLong77 = this.aLong80;
				while (arg2 > 0) {
					local128 = this.aClass132_1.method3351(arg2, arg0, arg1);
					if (local128 == -1) {
						break;
					}
					this.aLong77 += local128;
					this.aLong80 += local128;
					arg2 -= local128;
					arg1 += local128;
				}
			} else if (arg2 > 0) {
				local128 = arg2;
				this.method1976();
				if (this.anInt2289 < arg2) {
					local128 = this.anInt2289;
				}
				arg2 -= local128;
				Static319.method1766(this.aByteArray26, 0, arg0, arg1, local128);
				this.aLong80 += local128;
				arg1 += local128;
			}
			if (this.aLong79 != -1L) {
				if (this.aLong80 < this.aLong79 && arg2 > 0) {
					local128 = (int) (this.aLong79 - this.aLong80) + arg1;
					if (arg2 + arg1 < local128) {
						local128 = arg2 + arg1;
					}
					while (arg1 < local128) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong80++;
					}
				}
				@Pc(324) long local324 = -1L;
				if (this.aLong79 >= local91 && (long) local88 + local91 > this.aLong79) {
					local324 = this.aLong79;
				} else if (this.aLong79 <= local91 && this.aLong79 + (long) this.anInt2282 > local91) {
					local324 = local91;
				}
				@Pc(366) long local366 = -1L;
				if ((long) this.anInt2282 + this.aLong79 > local91 && (long) this.anInt2282 + this.aLong79 <= local91 - -((long) local88)) {
					local366 = (long) this.anInt2282 + this.aLong79;
				} else if (this.aLong79 < local91 + (long) local88 && this.aLong79 + (long) this.anInt2282 >= (long) local88 + local91) {
					local366 = (long) local88 + local91;
				}
				if (local324 > -1L && local366 > local324) {
					@Pc(449) int local449 = (int) (local366 - local324);
					Static319.method1766(this.aByteArray25, (int) (local324 - this.aLong79), arg0, (int) (local324 - local91), local449);
					if (this.aLong80 < local366) {
						arg2 = (int) ((long) arg2 + this.aLong80 - local366);
						this.aLong80 = local366;
					}
				}
			}
		} catch (@Pc(491) IOException local491) {
			this.aLong77 = -1L;
			throw local491;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([BI)V")
	public void method1975(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1974(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	private void method1976() throws IOException {
		this.anInt2289 = 0;
		if (this.aLong77 != this.aLong80) {
			this.aClass132_1.method3353(this.aLong80);
			this.aLong77 = this.aLong80;
		}
		this.aLong75 = this.aLong80;
		while (this.aByteArray26.length > this.anInt2289) {
			@Pc(50) int local50 = this.aByteArray26.length - this.anInt2289;
			if (local50 > 200000000) {
				local50 = 200000000;
			}
			@Pc(67) int local67 = this.aClass132_1.method3351(local50, this.aByteArray26, this.anInt2289);
			if (local67 == -1) {
				break;
			}
			this.aLong77 += local67;
			this.anInt2289 += local67;
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	private void method1977() throws IOException {
		if (this.aLong79 == -1L) {
			return;
		}
		if (this.aLong77 != this.aLong79) {
			this.aClass132_1.method3353(this.aLong79);
			this.aLong77 = this.aLong79;
		}
		this.aClass132_1.method3352(this.aByteArray25, this.anInt2282, 0);
		@Pc(46) long local46 = -1L;
		if (this.aLong79 >= this.aLong75 && (long) this.anInt2289 + this.aLong75 > this.aLong79) {
			local46 = this.aLong79;
		} else if (this.aLong75 >= this.aLong79 && this.aLong75 < this.aLong79 + (long) this.anInt2282) {
			local46 = this.aLong75;
		}
		this.aLong77 += this.anInt2282;
		@Pc(109) long local109 = -1L;
		if (this.aLong77 > this.aLong78) {
			this.aLong78 = this.aLong77;
		}
		if (this.aLong79 + (long) this.anInt2282 > this.aLong75 && (long) this.anInt2289 + this.aLong75 >= this.aLong79 - -((long) this.anInt2282)) {
			local109 = (long) this.anInt2282 + this.aLong79;
		} else if (this.aLong75 + (long) this.anInt2289 > this.aLong79 && this.aLong79 + (long) this.anInt2282 >= this.aLong75 - -((long) this.anInt2289)) {
			local109 = this.aLong75 + (long) this.anInt2289;
		}
		if (local46 > -1L && local109 > local46) {
			@Pc(217) int local217 = (int) (local109 - local46);
			Static319.method1766(this.aByteArray25, (int) (local46 - this.aLong79), this.aByteArray26, (int) (local46 - this.aLong75), local217);
		}
		this.aLong79 = -1L;
		this.anInt2282 = 0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[BI)V")
	public void method1978(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong80 > this.aLong76) {
				this.aLong76 = (long) arg2 + this.aLong80;
			}
			if (this.aLong79 != -1L && (this.aLong80 < this.aLong79 || this.aLong79 + (long) this.anInt2282 < this.aLong80)) {
				this.method1977();
			}
			if (this.aLong79 != -1L && (long) this.aByteArray25.length + this.aLong79 < (long) arg2 + this.aLong80) {
				@Pc(94) int local94 = (int) (this.aLong79 + (long) this.aByteArray25.length - this.aLong80);
				Static319.method1766(arg1, arg0, this.aByteArray25, (int) (this.aLong80 - this.aLong79), local94);
				arg0 += local94;
				this.aLong80 += local94;
				this.anInt2282 = this.aByteArray25.length;
				arg2 -= local94;
				this.method1977();
			}
			if (this.aByteArray25.length < arg2) {
				@Pc(138) long local138 = -1L;
				@Pc(140) long local140 = -1L;
				if (this.aLong77 != this.aLong80) {
					this.aClass132_1.method3353(this.aLong80);
					this.aLong77 = this.aLong80;
				}
				this.aClass132_1.method3352(arg1, arg2, arg0);
				if (this.aLong80 >= this.aLong75 && this.aLong80 < (long) this.anInt2289 + this.aLong75) {
					local138 = this.aLong80;
				} else if (this.aLong75 >= this.aLong80 && this.aLong80 + (long) arg2 > this.aLong75) {
					local138 = this.aLong75;
				}
				this.aLong77 += arg2;
				if (this.aLong78 < this.aLong77) {
					this.aLong78 = this.aLong77;
				}
				if (this.aLong75 < (long) arg2 + this.aLong80 && (long) this.anInt2289 + this.aLong75 >= (long) arg2 + this.aLong80) {
					local140 = (long) arg2 + this.aLong80;
				} else if ((long) this.anInt2289 + this.aLong75 > this.aLong80 && this.aLong80 + (long) arg2 >= (long) this.anInt2289 + this.aLong75) {
					local140 = (long) this.anInt2289 + this.aLong75;
				}
				if (local138 > -1L && local140 > local138) {
					@Pc(338) int local338 = (int) (local140 - local138);
					Static319.method1766(arg1, (int) (local138 + (long) arg0 - this.aLong80), this.aByteArray26, (int) (local138 - this.aLong75), local338);
				}
				this.aLong80 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong79 == -1L) {
					this.aLong79 = this.aLong80;
				}
				Static319.method1766(arg1, arg0, this.aByteArray25, (int) (this.aLong80 - this.aLong79), arg2);
				this.aLong80 += arg2;
				if (this.aLong80 - this.aLong79 > (long) this.anInt2282) {
					this.anInt2282 = (int) (this.aLong80 - this.aLong79);
				}
			}
		} catch (@Pc(429) IOException local429) {
			this.aLong77 = -1L;
			throw local429;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)J")
	public long method1980() {
		return this.aLong76;
	}
}
