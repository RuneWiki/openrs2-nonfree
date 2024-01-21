import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class47 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	private int anInt1827;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	private int anInt1824 = 0;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "J")
	private long aLong59 = -1L;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "J")
	private long aLong61 = -1L;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "Lclient!da;")
	private final Class16 aClass16_3;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "[B")
	private final byte[] aByteArray18;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!da;II)V")
	public Class47(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass16_3 = arg0;
		this.aLong62 = this.aLong58 = arg0.method350();
		this.aByteArray17 = new byte[arg2];
		this.aByteArray18 = new byte[arg1];
		this.aLong57 = 0L;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI[BI)V")
	public void method1289(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong59 != -1L && this.aLong57 >= this.aLong59 && (long) arg2 + this.aLong57 <= (long) this.anInt1824 + this.aLong59) {
				Static122.method709(this.aByteArray17, (int) (this.aLong57 - this.aLong59), arg1, 0, arg2);
				this.aLong57 += arg2;
				return;
			}
			@Pc(76) int local76 = arg2;
			@Pc(83) long local83 = this.aLong57;
			@Pc(115) int local115;
			if (this.aLong57 >= this.aLong61 && this.aLong61 + (long) this.anInt1827 > this.aLong57) {
				local115 = (int) ((long) this.anInt1827 + this.aLong61 - this.aLong57);
				if (local115 > arg2) {
					local115 = arg2;
				}
				Static122.method709(this.aByteArray18, (int) (this.aLong57 - this.aLong61), arg1, 0, local115);
				this.aLong57 += local115;
				arg2 -= local115;
				arg0 = local115;
			}
			if (this.aByteArray18.length < arg2) {
				this.aClass16_3.method348(this.aLong57);
				this.aLong60 = this.aLong57;
				while (arg2 > 0) {
					local115 = this.aClass16_3.method347(arg2, arg1, arg0);
					if (local115 == -1) {
						break;
					}
					this.aLong60 += local115;
					arg2 -= local115;
					arg0 += local115;
					this.aLong57 += local115;
				}
			} else if (arg2 > 0) {
				this.method1300();
				local115 = arg2;
				if (this.anInt1827 < arg2) {
					local115 = this.anInt1827;
				}
				arg2 -= local115;
				Static122.method709(this.aByteArray18, 0, arg1, arg0, local115);
				arg0 += local115;
				this.aLong57 += local115;
			}
			if (this.aLong59 != -1L) {
				if (this.aLong59 > this.aLong57 && arg2 > 0) {
					local115 = arg0 + (int) (this.aLong59 - this.aLong57);
					if (arg0 + arg2 < local115) {
						local115 = arg0 + arg2;
					}
					while (local115 > arg0) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong57++;
					}
				}
				@Pc(303) long local303 = -1L;
				if (local83 <= this.aLong59 && this.aLong59 < (long) local76 + local83) {
					local303 = this.aLong59;
				} else if (local83 >= this.aLong59 && this.aLong59 + (long) this.anInt1824 > local83) {
					local303 = local83;
				}
				@Pc(355) long local355 = -1L;
				if (local83 < this.aLong59 + (long) this.anInt1824 && local83 + (long) local76 >= (long) this.anInt1824 + this.aLong59) {
					local355 = this.aLong59 + (long) this.anInt1824;
				} else if (local83 + (long) local76 > this.aLong59 && local83 + (long) local76 <= (long) this.anInt1824 + this.aLong59) {
					local355 = local83 + (long) local76;
				}
				if (local303 > -1L && local303 < local355) {
					@Pc(441) int local441 = (int) (local355 - local303);
					Static122.method709(this.aByteArray17, (int) (local303 - this.aLong59), arg1, (int) (local303 - local83), local441);
					if (local355 > this.aLong57) {
						arg2 = (int) ((long) arg2 + this.aLong57 - local355);
						this.aLong57 = local355;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong60 = -1L;
			throw local479;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)J")
	public long method1292() {
		return this.aLong62;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public void method1293() throws IOException {
		this.method1297();
		this.aClass16_3.method345();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJ)V")
	public void method1295(@OriginalArg(1) long arg0) {
		if (arg0 >= (long) 0) {
			this.aLong57 = arg0;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
	private void method1297() throws IOException {
		if (this.aLong59 == -1L) {
			return;
		}
		@Pc(16) long local16 = -1L;
		if (this.aLong59 != this.aLong60) {
			this.aClass16_3.method348(this.aLong59);
			this.aLong60 = this.aLong59;
		}
		@Pc(38) long local38 = -1L;
		this.aClass16_3.method349(this.aByteArray17, 0, this.anInt1824);
		if (this.aLong61 <= this.aLong59 && this.aLong61 + (long) this.anInt1827 > this.aLong59) {
			local16 = this.aLong59;
		} else if (this.aLong61 >= this.aLong59 && (long) this.anInt1824 + this.aLong59 > this.aLong61) {
			local16 = this.aLong61;
		}
		this.aLong60 += this.anInt1824;
		if (this.aLong60 > this.aLong58) {
			this.aLong58 = this.aLong60;
		}
		if ((long) this.anInt1824 + this.aLong59 > this.aLong61 && this.aLong59 + (long) this.anInt1824 <= this.aLong61 + (long) this.anInt1827) {
			local38 = this.aLong59 + (long) this.anInt1824;
		} else if (this.aLong59 < this.aLong61 + (long) this.anInt1827 && this.aLong59 + (long) this.anInt1824 >= (long) this.anInt1827 + this.aLong61) {
			local38 = (long) this.anInt1827 + this.aLong61;
		}
		if (local16 > -1L && local38 > local16) {
			@Pc(213) int local213 = (int) (local38 - local16);
			Static122.method709(this.aByteArray17, (int) (local16 - this.aLong59), this.aByteArray18, (int) (local16 - this.aLong61), local213);
		}
		this.aLong59 = -1L;
		this.anInt1824 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB[B)V")
	public void method1298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong62 < (long) arg0 + this.aLong57) {
				this.aLong62 = (long) arg0 + this.aLong57;
			}
			if (this.aLong59 != -1L && (this.aLong57 < this.aLong59 || this.aLong59 + (long) this.anInt1824 < this.aLong57)) {
				this.method1297();
			}
			if (this.aLong59 != -1L && (long) this.aByteArray17.length + this.aLong59 < this.aLong57 + (long) arg0) {
				@Pc(92) int local92 = (int) (this.aLong59 + (long) this.aByteArray17.length - this.aLong57);
				Static122.method709(arg2, arg1, this.aByteArray17, (int) (this.aLong57 - this.aLong59), local92);
				arg0 -= local92;
				this.aLong57 += local92;
				arg1 += local92;
				this.anInt1824 = this.aByteArray17.length;
				this.method1297();
			}
			if (arg0 > this.aByteArray17.length) {
				if (this.aLong57 != this.aLong60) {
					this.aClass16_3.method348(this.aLong57);
					this.aLong60 = this.aLong57;
				}
				this.aClass16_3.method349(arg2, arg1, arg0);
				this.aLong60 += arg0;
				if (this.aLong60 > this.aLong58) {
					this.aLong58 = this.aLong60;
				}
				@Pc(191) long local191 = -1L;
				@Pc(193) long local193 = -1L;
				if (this.aLong61 <= this.aLong57 && this.aLong57 < (long) this.anInt1827 + this.aLong61) {
					local191 = this.aLong57;
				} else if (this.aLong61 >= this.aLong57 && this.aLong57 + (long) arg0 > this.aLong61) {
					local191 = this.aLong61;
				}
				if (this.aLong57 + (long) arg0 > this.aLong61 && (long) arg0 + this.aLong57 <= (long) this.anInt1827 + this.aLong61) {
					local193 = (long) arg0 + this.aLong57;
				} else if (this.aLong57 < (long) this.anInt1827 + this.aLong61 && this.aLong61 + (long) this.anInt1827 <= (long) arg0 + this.aLong57) {
					local193 = (long) this.anInt1827 + this.aLong61;
				}
				if (local191 > -1L && local193 > local191) {
					@Pc(338) int local338 = (int) (local193 - local191);
					Static122.method709(arg2, (int) (local191 + (long) arg1 - this.aLong57), this.aByteArray18, (int) (local191 - this.aLong61), local338);
				}
				this.aLong57 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong59 == -1L) {
					this.aLong59 = this.aLong57;
				}
				Static122.method709(arg2, arg1, this.aByteArray17, (int) (this.aLong57 - this.aLong59), arg0);
				this.aLong57 += arg0;
				if (this.aLong57 - this.aLong59 > (long) this.anInt1824) {
					this.anInt1824 = (int) (this.aLong57 - this.aLong59);
				}
			}
		} catch (@Pc(419) IOException local419) {
			this.aLong60 = -1L;
			throw local419;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	private void method1300() throws IOException {
		this.anInt1827 = 0;
		if (this.aLong60 != this.aLong57) {
			this.aClass16_3.method348(this.aLong57);
			this.aLong60 = this.aLong57;
		}
		this.aLong61 = this.aLong57;
		while (this.anInt1827 < this.aByteArray18.length) {
			@Pc(54) int local54 = this.aClass16_3.method347(this.aByteArray18.length - this.anInt1827, this.aByteArray18, this.anInt1827);
			if (local54 == -1) {
				break;
			}
			this.aLong60 += local54;
			this.anInt1827 += local54;
		}
	}
}
