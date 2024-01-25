import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class85 {

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
	private int anInt2349;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
	private int anInt2347 = 0;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "J")
	private long aLong64 = -1L;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "J")
	private long aLong67 = -1L;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Lclient!sr;")
	private final Class224 aClass224_1;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "[B")
	private final byte[] aByteArray64;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "[B")
	private final byte[] aByteArray63;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!sr;II)V")
	public Class85(@OriginalArg(0) Class224 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass224_1 = arg0;
		this.aLong65 = this.aLong62 = arg0.method5144();
		this.aLong63 = 0L;
		this.aByteArray64 = new byte[arg1];
		this.aByteArray63 = new byte[arg2];
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	private void method1713() throws IOException {
		this.anInt2349 = 0;
		if (this.aLong63 != this.aLong66) {
			this.aClass224_1.method5143(this.aLong63);
			this.aLong66 = this.aLong63;
		}
		this.aLong67 = this.aLong63;
		while (this.anInt2349 < this.aByteArray64.length) {
			@Pc(44) int local44 = this.aByteArray64.length - this.anInt2349;
			if (local44 > 200000000) {
				local44 = 200000000;
			}
			@Pc(61) int local61 = this.aClass224_1.method5142(this.aByteArray64, this.anInt2349, local44);
			if (local61 == -1) {
				break;
			}
			this.aLong66 += local61;
			this.anInt2349 += local61;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([BB)V")
	public void method1714(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1717(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method1715() {
		return this.aClass224_1.method5139();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[BII)V")
	public void method1717(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong64 != -1L && this.aLong63 >= this.aLong64 && this.aLong64 + (long) this.anInt2347 >= this.aLong63 + (long) arg2) {
				Static459.method3348(this.aByteArray63, (int) (this.aLong63 - this.aLong64), arg1, 0, arg2);
				this.aLong63 += arg2;
				return;
			}
			@Pc(83) long local83 = this.aLong63;
			@Pc(87) int local87 = arg2;
			@Pc(117) int local117;
			if (this.aLong67 <= this.aLong63 && this.aLong67 + (long) this.anInt2349 > this.aLong63) {
				local117 = (int) ((long) this.anInt2349 + this.aLong67 - this.aLong63);
				if (local117 > arg2) {
					local117 = arg2;
				}
				Static459.method3348(this.aByteArray64, (int) (this.aLong63 - this.aLong67), arg1, 0, local117);
				arg2 -= local117;
				arg0 = local117;
				this.aLong63 += local117;
			}
			if (this.aByteArray64.length < arg2) {
				this.aClass224_1.method5143(this.aLong63);
				this.aLong66 = this.aLong63;
				while (arg2 > 0) {
					local117 = this.aClass224_1.method5142(arg1, arg0, arg2);
					if (local117 == -1) {
						break;
					}
					arg2 -= local117;
					arg0 += local117;
					this.aLong66 += local117;
					this.aLong63 += local117;
				}
			} else if (arg2 > 0) {
				this.method1713();
				local117 = arg2;
				if (arg2 > this.anInt2349) {
					local117 = this.anInt2349;
				}
				Static459.method3348(this.aByteArray64, 0, arg1, arg0, local117);
				arg2 -= local117;
				this.aLong63 += local117;
				arg0 += local117;
			}
			if (this.aLong64 != -1L) {
				if (this.aLong63 < this.aLong64 && arg2 > 0) {
					local117 = (int) (this.aLong64 - this.aLong63) + arg0;
					if (local117 > arg0 + arg2) {
						local117 = arg2 + arg0;
					}
					while (arg0 < local117) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong63++;
					}
				}
				@Pc(312) long local312 = -1L;
				if (this.aLong64 >= local83 && this.aLong64 < local83 + (long) local87) {
					local312 = this.aLong64;
				} else if (local83 >= this.aLong64 && local83 < (long) this.anInt2347 + this.aLong64) {
					local312 = local83;
				}
				@Pc(349) long local349 = -1L;
				if (local83 < (long) this.anInt2347 + this.aLong64 && this.aLong64 + (long) this.anInt2347 <= local83 - -((long) local87)) {
					local349 = (long) this.anInt2347 + this.aLong64;
				} else if (local83 + (long) local87 > this.aLong64 && (long) this.anInt2347 + this.aLong64 >= (long) local87 + local83) {
					local349 = (long) local87 + local83;
				}
				if (local312 > -1L && local312 < local349) {
					@Pc(428) int local428 = (int) (local349 - local312);
					Static459.method3348(this.aByteArray63, (int) (local312 - this.aLong64), arg1, (int) (local312 - local83), local428);
					if (local349 > this.aLong63) {
						arg2 = (int) ((long) arg2 + this.aLong63 - local349);
						this.aLong63 = local349;
					}
				}
			}
		} catch (@Pc(467) IOException local467) {
			this.aLong66 = -1L;
			throw local467;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
	private void method1719() throws IOException {
		if (this.aLong64 == -1L) {
			return;
		}
		if (this.aLong66 != this.aLong64) {
			this.aClass224_1.method5143(this.aLong64);
			this.aLong66 = this.aLong64;
		}
		this.aClass224_1.method5140(0, this.aByteArray63, this.anInt2347);
		this.aLong66 += this.anInt2347;
		if (this.aLong62 < this.aLong66) {
			this.aLong62 = this.aLong66;
		}
		@Pc(57) long local57 = -1L;
		if (this.aLong64 >= this.aLong67 && this.aLong64 < (long) this.anInt2349 + this.aLong67) {
			local57 = this.aLong64;
		} else if (this.aLong64 <= this.aLong67 && this.aLong64 + (long) this.anInt2347 > this.aLong67) {
			local57 = this.aLong67;
		}
		@Pc(107) long local107 = -1L;
		if (this.aLong64 + (long) this.anInt2347 > this.aLong67 && (long) this.anInt2347 + this.aLong64 <= (long) this.anInt2349 + this.aLong67) {
			local107 = (long) this.anInt2347 + this.aLong64;
		} else if ((long) this.anInt2349 + this.aLong67 > this.aLong64 && this.aLong67 + (long) this.anInt2349 <= (long) this.anInt2347 + this.aLong64) {
			local107 = (long) this.anInt2349 + this.aLong67;
		}
		if (local57 > -1L && local107 > local57) {
			@Pc(188) int local188 = (int) (local107 - local57);
			Static459.method3348(this.aByteArray63, (int) (local57 - this.aLong64), this.aByteArray64, (int) (local57 - this.aLong67), local188);
		}
		this.aLong64 = -1L;
		this.anInt2347 = 0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[BI)V")
	public void method1721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong63 > this.aLong65) {
				this.aLong65 = this.aLong63 + (long) arg0;
			}
			if (this.aLong64 != -1L && (this.aLong64 > this.aLong63 || this.aLong63 > this.aLong64 + (long) this.anInt2347)) {
				this.method1719();
			}
			if (this.aLong64 != -1L && this.aLong64 + (long) this.aByteArray63.length < (long) arg0 + this.aLong63) {
				@Pc(99) int local99 = (int) (this.aLong64 + (long) this.aByteArray63.length - this.aLong63);
				Static459.method3348(arg2, arg1, this.aByteArray63, (int) (this.aLong63 - this.aLong64), local99);
				arg1 += local99;
				this.aLong63 += local99;
				arg0 -= local99;
				this.anInt2347 = this.aByteArray63.length;
				this.method1719();
			}
			if (arg0 > this.aByteArray63.length) {
				if (this.aLong63 != this.aLong66) {
					this.aClass224_1.method5143(this.aLong63);
					this.aLong66 = this.aLong63;
				}
				this.aClass224_1.method5140(arg1, arg2, arg0);
				this.aLong66 += arg0;
				if (this.aLong66 > this.aLong62) {
					this.aLong62 = this.aLong66;
				}
				@Pc(190) long local190 = -1L;
				if (this.aLong67 <= this.aLong63 && (long) this.anInt2349 + this.aLong67 > this.aLong63) {
					local190 = this.aLong63;
				} else if (this.aLong67 >= this.aLong63 && (long) arg0 + this.aLong63 > this.aLong67) {
					local190 = this.aLong67;
				}
				@Pc(235) long local235 = -1L;
				if ((long) arg0 + this.aLong63 > this.aLong67 && (long) arg0 + this.aLong63 <= this.aLong67 + (long) this.anInt2349) {
					local235 = (long) arg0 + this.aLong63;
				} else if ((long) this.anInt2349 + this.aLong67 > this.aLong63 && (long) arg0 + this.aLong63 >= this.aLong67 - -((long) this.anInt2349)) {
					local235 = (long) this.anInt2349 + this.aLong67;
				}
				if (local190 > -1L && local235 > local190) {
					@Pc(322) int local322 = (int) (local235 - local190);
					Static459.method3348(arg2, (int) ((long) arg1 + local190 - this.aLong63), this.aByteArray64, (int) (local190 - this.aLong67), local322);
				}
				this.aLong63 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong64 == -1L) {
					this.aLong64 = this.aLong63;
				}
				Static459.method3348(arg2, arg1, this.aByteArray63, (int) (this.aLong63 - this.aLong64), arg0);
				this.aLong63 += arg0;
				if (this.aLong63 - this.aLong64 > (long) this.anInt2347) {
					this.anInt2347 = (int) (this.aLong63 - this.aLong64);
				}
			}
		} catch (@Pc(409) IOException local409) {
			this.aLong66 = -1L;
			throw local409;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(JI)V")
	public void method1722(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1715());
		}
		this.aLong63 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)J")
	public long method1724() {
		return this.aLong65;
	}
}
