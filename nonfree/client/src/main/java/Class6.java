import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class6 {

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "J")
	private long aLong16 = -1L;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt360 = 0;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "J")
	private long aLong17 = -1L;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "Lclient!ec;")
	private final Class23 aClass23_1;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "[B")
	private final byte[] aByteArray7;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "[B")
	private final byte[] aByteArray6;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!ec;II)V")
	public Class6(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass23_1 = arg0;
		this.aLong12 = this.aLong14 = arg0.method661();
		this.aByteArray7 = new byte[arg1];
		this.aLong13 = 0L;
		this.aByteArray6 = new byte[arg2];
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([BI)V")
	public void method283(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method290(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public void method284() throws IOException {
		this.method293();
		this.aClass23_1.method662();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)J")
	public long method285() {
		return this.aLong12;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method286() {
		return this.aClass23_1.method659();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZI[B)V")
	public void method287(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong12 < this.aLong13 + (long) arg0) {
				this.aLong12 = this.aLong13 + (long) arg0;
			}
			if (this.aLong16 != -1L && (this.aLong13 < this.aLong16 || (long) this.anInt360 + this.aLong16 < this.aLong13)) {
				this.method293();
			}
			if (this.aLong16 != -1L && (long) arg0 + this.aLong13 > (long) this.aByteArray6.length + this.aLong16) {
				@Pc(89) int local89 = (int) ((long) this.aByteArray6.length + this.aLong16 - this.aLong13);
				Static184.method1309(arg2, arg1, this.aByteArray6, (int) (this.aLong13 - this.aLong16), local89);
				arg0 -= local89;
				arg1 += local89;
				this.aLong13 += local89;
				this.anInt360 = this.aByteArray6.length;
				this.method293();
			}
			if (arg0 > this.aByteArray6.length) {
				if (this.aLong15 != this.aLong13) {
					this.aClass23_1.method658(this.aLong13);
					this.aLong15 = this.aLong13;
				}
				this.aClass23_1.method663(arg1, arg0, arg2);
				this.aLong15 += arg0;
				if (this.aLong15 > this.aLong14) {
					this.aLong14 = this.aLong15;
				}
				@Pc(176) long local176 = -1L;
				@Pc(178) long local178 = -1L;
				if (this.aLong17 < this.aLong13 + (long) arg0 && this.aLong17 + (long) this.anInt359 >= (long) arg0 + this.aLong13) {
					local176 = (long) arg0 + this.aLong13;
				} else if ((long) this.anInt359 + this.aLong17 > this.aLong13 && (long) arg0 + this.aLong13 >= this.aLong17 - -((long) this.anInt359)) {
					local176 = this.aLong17 + (long) this.anInt359;
				}
				if (this.aLong13 >= this.aLong17 && this.aLong17 + (long) this.anInt359 > this.aLong13) {
					local178 = this.aLong13;
				} else if (this.aLong17 >= this.aLong13 && (long) arg0 + this.aLong13 > this.aLong17) {
					local178 = this.aLong17;
				}
				if (local178 > -1L && local178 < local176) {
					@Pc(304) int local304 = (int) (local176 - local178);
					Static184.method1309(arg2, (int) (local178 + (long) arg1 - this.aLong13), this.aByteArray7, (int) (local178 - this.aLong17), local304);
				}
				this.aLong13 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong16 == -1L) {
					this.aLong16 = this.aLong13;
				}
				Static184.method1309(arg2, arg1, this.aByteArray6, (int) (this.aLong13 - this.aLong16), arg0);
				this.aLong13 += arg0;
				if (this.aLong13 - this.aLong16 > (long) this.anInt360) {
					this.anInt360 = (int) (this.aLong13 - this.aLong16);
				}
			}
		} catch (@Pc(392) IOException local392) {
			this.aLong15 = -1L;
			throw local392;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[BII)V")
	public void method290(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong16 != -1L && this.aLong16 <= this.aLong13 && (long) this.anInt360 + this.aLong16 >= (long) arg2 + this.aLong13) {
				Static184.method1309(this.aByteArray6, (int) (this.aLong13 - this.aLong16), arg1, 0, arg2);
				this.aLong13 += arg2;
				return;
			}
			@Pc(82) long local82 = this.aLong13;
			@Pc(86) int local86 = arg2;
			@Pc(123) int local123;
			if (this.aLong17 <= this.aLong13 && this.aLong17 + (long) this.anInt359 > this.aLong13) {
				local123 = (int) (this.aLong17 + (long) this.anInt359 - this.aLong13);
				if (arg2 < local123) {
					local123 = arg2;
				}
				arg2 -= local123;
				Static184.method1309(this.aByteArray7, (int) (this.aLong13 - this.aLong17), arg1, 0, local123);
				this.aLong13 += local123;
				arg0 = local123;
			}
			if (this.aByteArray7.length < arg2) {
				this.aClass23_1.method658(this.aLong13);
				this.aLong15 = this.aLong13;
				while (arg2 > 0) {
					local123 = this.aClass23_1.method660(arg1, arg2, arg0);
					if (local123 == -1) {
						break;
					}
					this.aLong13 += local123;
					arg2 -= local123;
					this.aLong15 += local123;
					arg0 += local123;
				}
			} else if (arg2 > 0) {
				this.method291();
				local123 = arg2;
				if (this.anInt359 < arg2) {
					local123 = this.anInt359;
				}
				arg2 -= local123;
				Static184.method1309(this.aByteArray7, 0, arg1, arg0, local123);
				arg0 += local123;
				this.aLong13 += local123;
			}
			if (this.aLong16 != -1L) {
				if (this.aLong13 < this.aLong16 && arg2 > 0) {
					local123 = (int) (this.aLong16 - this.aLong13) + arg0;
					if (arg0 + arg2 < local123) {
						local123 = arg2 + arg0;
					}
					while (arg0 < local123) {
						arg1[arg0++] = 0;
						this.aLong13++;
						arg2--;
					}
				}
				@Pc(314) long local314 = -1L;
				@Pc(316) long local316 = -1L;
				if ((long) this.anInt360 + this.aLong16 > local82 && (long) local86 + local82 >= (long) this.anInt360 + this.aLong16) {
					local316 = this.aLong16 + (long) this.anInt360;
				} else if ((long) local86 + local82 > this.aLong16 && (long) local86 + local82 <= this.aLong16 + (long) this.anInt360) {
					local316 = (long) local86 + local82;
				}
				if (this.aLong16 >= local82 && local82 + (long) local86 > this.aLong16) {
					local314 = this.aLong16;
				} else if (local82 >= this.aLong16 && this.aLong16 + (long) this.anInt360 > local82) {
					local314 = local82;
				}
				if (local314 > -1L && local314 < local316) {
					@Pc(447) int local447 = (int) (local316 - local314);
					Static184.method1309(this.aByteArray6, (int) (local314 - this.aLong16), arg1, (int) (local314 - local82), local447);
					if (local316 > this.aLong13) {
						arg2 = (int) ((long) arg2 + this.aLong13 - local316);
						this.aLong13 = local316;
					}
				}
			}
		} catch (@Pc(489) IOException local489) {
			this.aLong15 = -1L;
			throw local489;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
	private void method291() throws IOException {
		this.anInt359 = 0;
		if (this.aLong13 != this.aLong15) {
			this.aClass23_1.method658(this.aLong13);
			this.aLong15 = this.aLong13;
		}
		this.aLong17 = this.aLong13;
		while (this.aByteArray7.length > this.anInt359) {
			@Pc(52) int local52 = this.aClass23_1.method660(this.aByteArray7, this.aByteArray7.length - this.anInt359, this.anInt359);
			if (local52 == -1) {
				break;
			}
			this.aLong15 += local52;
			this.anInt359 += local52;
		}
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
	private void method293() throws IOException {
		if (this.aLong16 == (long) -1) {
			return;
		}
		if (this.aLong15 != this.aLong16) {
			this.aClass23_1.method658(this.aLong16);
			this.aLong15 = this.aLong16;
		}
		this.aClass23_1.method663(0, this.anInt360, this.aByteArray6);
		this.aLong15 += this.anInt360;
		if (this.aLong14 < this.aLong15) {
			this.aLong14 = this.aLong15;
		}
		@Pc(56) long local56 = -1L;
		@Pc(58) long local58 = -1L;
		if (this.aLong17 < this.aLong16 + (long) this.anInt360 && (long) this.anInt359 + this.aLong17 >= this.aLong16 - -((long) this.anInt360)) {
			local56 = (long) this.anInt360 + this.aLong16;
		} else if (this.aLong16 < this.aLong17 + (long) this.anInt359 && this.aLong16 + (long) this.anInt360 >= this.aLong17 + (long) this.anInt359) {
			local56 = (long) this.anInt359 + this.aLong17;
		}
		if (this.aLong17 <= this.aLong16 && this.aLong16 < (long) this.anInt359 + this.aLong17) {
			local58 = this.aLong16;
		} else if (this.aLong17 >= this.aLong16 && (long) this.anInt360 + this.aLong16 > this.aLong17) {
			local58 = this.aLong17;
		}
		if (local58 > -1L && local58 < local56) {
			@Pc(202) int local202 = (int) (local56 - local58);
			Static184.method1309(this.aByteArray6, (int) (local58 - this.aLong16), this.aByteArray7, (int) (local58 - this.aLong17), local202);
		}
		this.aLong16 = -1L;
		this.anInt360 = 0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(JB)V")
	public void method295(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method286());
		}
		this.aLong13 = arg0;
	}
}
