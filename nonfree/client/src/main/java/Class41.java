import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class41 {

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	private int anInt2055;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	private int anInt2056 = 0;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "J")
	private long aLong72 = -1L;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "J")
	private long aLong74 = -1L;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!ed;")
	private final Class19 aClass19_1;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "J")
	private long aLong70;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "[B")
	private final byte[] aByteArray55;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "[B")
	private final byte[] aByteArray56;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!ed;II)V")
	public Class41(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass19_1 = arg0;
		this.aLong69 = this.aLong70 = arg0.method658();
		this.aLong71 = 0L;
		this.aByteArray55 = new byte[arg2];
		this.aByteArray56 = new byte[arg1];
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(JI)V")
	public void method1337(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong71 = arg0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIII)V")
	public void method1339(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong69 < (long) arg2 + this.aLong71) {
				this.aLong69 = (long) arg2 + this.aLong71;
			}
			if (this.aLong74 != -1L && (this.aLong71 < this.aLong74 || this.aLong71 > (long) this.anInt2056 + this.aLong74)) {
				this.method1347();
			}
			if (this.aLong74 != -1L && this.aLong71 + (long) arg2 > (long) this.aByteArray55.length + this.aLong74) {
				@Pc(99) int local99 = (int) ((long) this.aByteArray55.length + this.aLong74 - this.aLong71);
				arg2 -= local99;
				Static135.method1705(arg0, arg1, this.aByteArray55, (int) (this.aLong71 - this.aLong74), local99);
				this.aLong71 += local99;
				this.anInt2056 = this.aByteArray55.length;
				this.method1347();
				arg1 += local99;
			}
			if (arg2 > this.aByteArray55.length) {
				if (this.aLong71 != this.aLong73) {
					this.aClass19_1.method657(this.aLong71);
					this.aLong73 = this.aLong71;
				}
				this.aClass19_1.method660(arg1, arg0, arg2);
				@Pc(169) long local169 = -1L;
				if (this.aLong71 >= this.aLong72 && this.aLong72 + (long) this.anInt2055 > this.aLong71) {
					local169 = this.aLong71;
				} else if (this.aLong71 <= this.aLong72 && (long) arg2 + this.aLong71 > this.aLong72) {
					local169 = this.aLong72;
				}
				@Pc(223) long local223 = -1L;
				this.aLong73 += arg2;
				if ((long) arg2 + this.aLong71 > this.aLong72 && (long) arg2 + this.aLong71 <= (long) this.anInt2055 + this.aLong72) {
					local223 = (long) arg2 + this.aLong71;
				} else if ((long) this.anInt2055 + this.aLong72 > this.aLong71 && (long) arg2 + this.aLong71 >= this.aLong72 + (long) this.anInt2055) {
					local223 = this.aLong72 + (long) this.anInt2055;
				}
				if (this.aLong70 < this.aLong73) {
					this.aLong70 = this.aLong73;
				}
				if (local169 > -1L && local169 < local223) {
					@Pc(329) int local329 = (int) (local223 - local169);
					Static135.method1705(arg0, (int) (local169 + (long) arg1 - this.aLong71), this.aByteArray56, (int) (local169 - this.aLong72), local329);
				}
				this.aLong71 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong74 == -1L) {
					this.aLong74 = this.aLong71;
				}
				Static135.method1705(arg0, arg1, this.aByteArray55, (int) (this.aLong71 - this.aLong74), arg2);
				this.aLong71 += arg2;
				if (this.aLong71 - this.aLong74 > (long) this.anInt2056) {
					this.anInt2056 = (int) (this.aLong71 - this.aLong74);
				}
			}
		} catch (@Pc(411) IOException local411) {
			this.aLong73 = -1L;
			throw local411;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	private void method1343() throws IOException {
		this.anInt2055 = 0;
		if (this.aLong71 != this.aLong73) {
			this.aClass19_1.method657(this.aLong71);
			this.aLong73 = this.aLong71;
		}
		this.aLong72 = this.aLong71;
		while (this.anInt2055 < this.aByteArray56.length) {
			@Pc(54) int local54 = this.aClass19_1.method656(this.anInt2055, this.aByteArray56, this.aByteArray56.length - this.anInt2055);
			if (local54 == -1) {
				break;
			}
			this.anInt2055 += local54;
			this.aLong73 += local54;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIIB)V")
	public void method1345(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong74 != -1L && this.aLong74 <= this.aLong71 && this.aLong74 + (long) this.anInt2056 >= this.aLong71 - -((long) arg2)) {
				Static135.method1705(this.aByteArray55, (int) (this.aLong71 - this.aLong74), arg0, 0, arg2);
				this.aLong71 += arg2;
				return;
			}
			@Pc(87) long local87 = this.aLong71;
			@Pc(91) int local91 = arg2;
			@Pc(124) int local124;
			if (this.aLong72 <= this.aLong71 && (long) this.anInt2055 + this.aLong72 > this.aLong71) {
				local124 = (int) ((long) this.anInt2055 + this.aLong72 - this.aLong71);
				if (local124 > arg2) {
					local124 = arg2;
				}
				Static135.method1705(this.aByteArray56, (int) (this.aLong71 - this.aLong72), arg0, 0, local124);
				this.aLong71 += local124;
				arg1 = local124;
				arg2 -= local124;
			}
			if (arg2 > this.aByteArray56.length) {
				this.aClass19_1.method657(this.aLong71);
				this.aLong73 = this.aLong71;
				while (arg2 > 0) {
					local124 = this.aClass19_1.method656(arg1, arg0, arg2);
					if (local124 == -1) {
						break;
					}
					arg1 += local124;
					this.aLong73 += local124;
					this.aLong71 += local124;
					arg2 -= local124;
				}
			} else if (arg2 > 0) {
				local124 = arg2;
				this.method1343();
				if (arg2 > this.anInt2055) {
					local124 = this.anInt2055;
				}
				Static135.method1705(this.aByteArray56, 0, arg0, arg1, local124);
				arg2 -= local124;
				this.aLong71 += local124;
				arg1 += local124;
			}
			if (this.aLong74 != -1L) {
				if (this.aLong71 < this.aLong74 && arg2 > 0) {
					local124 = arg1 + (int) (this.aLong74 - this.aLong71);
					if (arg1 + arg2 < local124) {
						local124 = arg2 + arg1;
					}
					while (local124 > arg1) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong71++;
					}
				}
				@Pc(317) long local317 = -1L;
				if (this.aLong74 + (long) this.anInt2056 > local87 && local87 + (long) local91 >= (long) this.anInt2056 + this.aLong74) {
					local317 = this.aLong74 + (long) this.anInt2056;
				} else if (local87 + (long) local91 > this.aLong74 && this.aLong74 + (long) this.anInt2056 >= local87 + (long) local91) {
					local317 = local87 + (long) local91;
				}
				@Pc(379) long local379 = -1L;
				if (this.aLong74 >= local87 && local87 + (long) local91 > this.aLong74) {
					local379 = this.aLong74;
				} else if (this.aLong74 <= local87 && (long) this.anInt2056 + this.aLong74 > local87) {
					local379 = local87;
				}
				if (local379 > -1L && local317 > local379) {
					@Pc(438) int local438 = (int) (local317 - local379);
					Static135.method1705(this.aByteArray55, (int) (local379 - this.aLong74), arg0, (int) (local379 - local87), local438);
					if (this.aLong71 < local317) {
						arg2 = (int) ((long) arg2 + this.aLong71 - local317);
						this.aLong71 = local317;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong73 = -1L;
			throw local479;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	private void method1347() throws IOException {
		if (this.aLong74 == -1L) {
			return;
		}
		if (this.aLong74 != this.aLong73) {
			this.aClass19_1.method657(this.aLong74);
			this.aLong73 = this.aLong74;
		}
		@Pc(28) long local28 = -1L;
		this.aClass19_1.method660(0, this.aByteArray55, this.anInt2056);
		@Pc(39) long local39 = -1L;
		if (this.aLong72 <= this.aLong74 && this.aLong74 < (long) this.anInt2055 + this.aLong72) {
			local28 = this.aLong74;
		} else if (this.aLong74 <= this.aLong72 && (long) this.anInt2056 + this.aLong74 > this.aLong72) {
			local28 = this.aLong72;
		}
		this.aLong73 += this.anInt2056;
		if ((long) this.anInt2056 + this.aLong74 > this.aLong72 && (long) this.anInt2055 + this.aLong72 >= this.aLong74 - -((long) this.anInt2056)) {
			local39 = (long) this.anInt2056 + this.aLong74;
		} else if (this.aLong74 < (long) this.anInt2055 + this.aLong72 && (long) this.anInt2056 + this.aLong74 >= (long) this.anInt2055 + this.aLong72) {
			local39 = this.aLong72 + (long) this.anInt2055;
		}
		if (this.aLong73 > this.aLong70) {
			this.aLong70 = this.aLong73;
		}
		if (local28 > -1L && local39 > local28) {
			@Pc(198) int local198 = (int) (local39 - local28);
			Static135.method1705(this.aByteArray55, (int) (local28 - this.aLong74), this.aByteArray56, (int) (local28 - this.aLong72), local198);
		}
		this.aLong74 = -1L;
		this.anInt2056 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public void method1348() throws IOException {
		this.method1347();
		this.aClass19_1.method659();
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)J")
	public long method1349() {
		return this.aLong69;
	}
}
