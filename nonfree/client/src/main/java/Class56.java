import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class56 {

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
	private int anInt2276;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "J")
	private long aLong83 = -1L;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	private int anInt2267 = 0;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "J")
	private long aLong88 = -1L;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!he;")
	private final Class31 aClass31_3;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "J")
	private long aLong82;

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "[B")
	private final byte[] aByteArray25;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "[B")
	private final byte[] aByteArray24;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!he;II)V")
	public Class56(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass31_3 = arg0;
		this.aLong82 = this.aLong84 = arg0.method801();
		this.aByteArray25 = new byte[arg2];
		this.aLong86 = 0L;
		this.aByteArray24 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([BBII)V")
	public void method1563(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong88 != -1L && this.aLong88 <= this.aLong86 && (long) this.anInt2267 + this.aLong88 >= (long) arg1 + this.aLong86) {
				Static127.method1745(this.aByteArray25, (int) (this.aLong86 - this.aLong88), arg0, 0, arg1);
				this.aLong86 += arg1;
				return;
			}
			@Pc(75) long local75 = this.aLong86;
			@Pc(77) int local77 = arg1;
			@Pc(108) int local108;
			if (this.aLong83 <= this.aLong86 && this.aLong83 + (long) this.anInt2276 > this.aLong86) {
				local108 = (int) ((long) this.anInt2276 + this.aLong83 - this.aLong86);
				if (arg1 < local108) {
					local108 = arg1;
				}
				Static127.method1745(this.aByteArray24, (int) (this.aLong86 - this.aLong83), arg0, 0, local108);
				arg1 -= local108;
				arg2 = local108;
				this.aLong86 += local108;
			}
			if (arg1 > this.aByteArray24.length) {
				this.aClass31_3.method803(this.aLong86);
				this.aLong87 = this.aLong86;
				while (arg1 > 0) {
					local108 = this.aClass31_3.method805(arg1, arg0, arg2);
					if (local108 == -1) {
						break;
					}
					arg1 -= local108;
					this.aLong86 += local108;
					this.aLong87 += local108;
					arg2 += local108;
				}
			} else if (arg1 > 0) {
				this.method1570();
				local108 = arg1;
				if (this.anInt2276 < arg1) {
					local108 = this.anInt2276;
				}
				Static127.method1745(this.aByteArray24, 0, arg0, arg2, local108);
				this.aLong86 += local108;
				arg2 += local108;
				arg1 -= local108;
			}
			if (this.aLong88 != -1L) {
				if (this.aLong88 > this.aLong86 && arg1 > 0) {
					local108 = arg2 + (int) (this.aLong88 - this.aLong86);
					if (local108 > arg1 + arg2) {
						local108 = arg2 + arg1;
					}
					while (arg2 < local108) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong86++;
					}
				}
				@Pc(300) long local300 = -1L;
				if (this.aLong88 >= local75 && local75 + (long) local77 > this.aLong88) {
					local300 = this.aLong88;
				} else if (this.aLong88 <= local75 && (long) this.anInt2267 + this.aLong88 > local75) {
					local300 = local75;
				}
				@Pc(344) long local344 = -1L;
				if (this.aLong88 + (long) this.anInt2267 > local75 && this.aLong88 + (long) this.anInt2267 <= (long) local77 + local75) {
					local344 = this.aLong88 + (long) this.anInt2267;
				} else if (local75 + (long) local77 > this.aLong88 && local75 + (long) local77 <= (long) this.anInt2267 + this.aLong88) {
					local344 = local75 + (long) local77;
				}
				if (local300 > -1L && local300 < local344) {
					@Pc(417) int local417 = (int) (local344 - local300);
					Static127.method1745(this.aByteArray25, (int) (local300 - this.aLong88), arg0, (int) (local300 - local75), local417);
					if (local344 > this.aLong86) {
						arg1 = (int) ((long) arg1 + this.aLong86 - local344);
						this.aLong86 = local344;
					}
				}
			}
		} catch (@Pc(452) IOException local452) {
			this.aLong87 = -1L;
			throw local452;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)J")
	public long method1564() {
		return this.aLong82;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IJ)V")
	public void method1565(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong86 = arg0;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	public void method1567() throws IOException {
		this.method1572();
		this.aClass31_3.method802();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[BI)V")
	public void method1568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong82 < this.aLong86 + (long) arg0) {
				this.aLong82 = (long) arg0 + this.aLong86;
			}
			if (this.aLong88 != -1L && (this.aLong88 > this.aLong86 || this.aLong86 > this.aLong88 + (long) this.anInt2267)) {
				this.method1572();
			}
			if (this.aLong88 != -1L && this.aLong86 + (long) arg0 > this.aLong88 + (long) this.aByteArray25.length) {
				@Pc(103) int local103 = (int) (this.aLong88 + (long) this.aByteArray25.length - this.aLong86);
				Static127.method1745(arg2, arg1, this.aByteArray25, (int) (this.aLong86 - this.aLong88), local103);
				this.aLong86 += local103;
				arg1 += local103;
				arg0 -= local103;
				this.anInt2267 = this.aByteArray25.length;
				this.method1572();
			}
			if (this.aByteArray25.length < arg0) {
				@Pc(150) long local150 = -1L;
				if (this.aLong87 != this.aLong86) {
					this.aClass31_3.method803(this.aLong86);
					this.aLong87 = this.aLong86;
				}
				this.aClass31_3.method800(arg0, arg2, arg1);
				@Pc(179) long local179 = -1L;
				this.aLong87 += arg0;
				if (this.aLong84 < this.aLong87) {
					this.aLong84 = this.aLong87;
				}
				if ((long) arg0 + this.aLong86 > this.aLong83 && this.aLong86 + (long) arg0 <= (long) this.anInt2276 + this.aLong83) {
					local179 = (long) arg0 + this.aLong86;
				} else if (this.aLong83 + (long) this.anInt2276 > this.aLong86 && (long) this.anInt2276 + this.aLong83 <= (long) arg0 + this.aLong86) {
					local179 = (long) this.anInt2276 + this.aLong83;
				}
				if (this.aLong86 >= this.aLong83 && this.aLong83 + (long) this.anInt2276 > this.aLong86) {
					local150 = this.aLong86;
				} else if (this.aLong86 <= this.aLong83 && this.aLong86 + (long) arg0 > this.aLong83) {
					local150 = this.aLong83;
				}
				if (local150 > -1L && local150 < local179) {
					@Pc(338) int local338 = (int) (local179 - local150);
					Static127.method1745(arg2, (int) (local150 + (long) arg1 - this.aLong86), this.aByteArray24, (int) (local150 - this.aLong83), local338);
				}
				this.aLong86 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong88 == -1L) {
					this.aLong88 = this.aLong86;
				}
				Static127.method1745(arg2, arg1, this.aByteArray25, (int) (this.aLong86 - this.aLong88), arg0);
				this.aLong86 += arg0;
				if ((long) this.anInt2267 < this.aLong86 - this.aLong88) {
					this.anInt2267 = (int) (this.aLong86 - this.aLong88);
				}
			}
		} catch (@Pc(424) IOException local424) {
			this.aLong87 = -1L;
			throw local424;
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	private void method1570() throws IOException {
		this.anInt2276 = 0;
		if (this.aLong86 != this.aLong87) {
			this.aClass31_3.method803(this.aLong86);
			this.aLong87 = this.aLong86;
		}
		this.aLong83 = this.aLong86;
		while (this.anInt2276 < this.aByteArray24.length) {
			@Pc(42) int local42 = this.aClass31_3.method805(this.aByteArray24.length - this.anInt2276, this.aByteArray24, this.anInt2276);
			if (local42 == -1) {
				break;
			}
			this.aLong87 += local42;
			this.anInt2276 += local42;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	private void method1572() throws IOException {
		if (this.aLong88 == -1L) {
			return;
		}
		if (this.aLong88 != this.aLong87) {
			this.aClass31_3.method803(this.aLong88);
			this.aLong87 = this.aLong88;
		}
		@Pc(37) long local37 = -1L;
		@Pc(39) long local39 = -1L;
		this.aClass31_3.method800(this.anInt2267, this.aByteArray25, 0);
		if (this.aLong83 < this.aLong88 + (long) this.anInt2267 && this.aLong88 + (long) this.anInt2267 <= this.aLong83 - -((long) this.anInt2276)) {
			local37 = this.aLong88 + (long) this.anInt2267;
		} else if (this.aLong88 < this.aLong83 + (long) this.anInt2276 && (long) this.anInt2276 + this.aLong83 <= this.aLong88 + (long) this.anInt2267) {
			local37 = this.aLong83 + (long) this.anInt2276;
		}
		this.aLong87 += this.anInt2267;
		if (this.aLong88 >= this.aLong83 && this.aLong88 < (long) this.anInt2276 + this.aLong83) {
			local39 = this.aLong88;
		} else if (this.aLong88 <= this.aLong83 && this.aLong83 < this.aLong88 + (long) this.anInt2267) {
			local39 = this.aLong83;
		}
		if (this.aLong84 < this.aLong87) {
			this.aLong84 = this.aLong87;
		}
		if (local39 > -1L && local37 > local39) {
			@Pc(214) int local214 = (int) (local37 - local39);
			Static127.method1745(this.aByteArray25, (int) (local39 - this.aLong88), this.aByteArray24, (int) (local39 - this.aLong83), local214);
		}
		this.aLong88 = -1L;
		this.anInt2267 = 0;
	}
}
