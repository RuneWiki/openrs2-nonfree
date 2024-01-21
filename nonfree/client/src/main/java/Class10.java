import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class10 {

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	private int anInt305 = 0;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "J")
	private long aLong18 = -1L;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "J")
	private long aLong17 = -1L;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "Lclient!e;")
	private final Class18 aClass18_3;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "[B")
	private final byte[] aByteArray4;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!e;II)V")
	public Class10(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass18_3 = arg0;
		this.aLong15 = this.aLong13 = arg0.method477();
		this.aByteArray4 = new byte[arg2];
		this.aByteArray5 = new byte[arg1];
		this.aLong14 = 0L;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	private void method177() throws IOException {
		this.anInt302 = 0;
		if (this.aLong14 != this.aLong16) {
			this.aClass18_3.method481(this.aLong14);
			this.aLong16 = this.aLong14;
		}
		this.aLong17 = this.aLong14;
		while (this.aByteArray5.length > this.anInt302) {
			@Pc(50) int local50 = this.aClass18_3.method478(this.aByteArray5, this.aByteArray5.length - this.anInt302, this.anInt302);
			if (local50 == -1) {
				break;
			}
			this.aLong16 += local50;
			this.anInt302 += local50;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[BB)V")
	public void method178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong14 + (long) arg0 > this.aLong15) {
				this.aLong15 = this.aLong14 + (long) arg0;
			}
			if (this.aLong18 != -1L && (this.aLong18 > this.aLong14 || (long) this.anInt305 + this.aLong18 < this.aLong14)) {
				this.method179();
			}
			if (this.aLong18 != -1L && this.aLong18 + (long) this.aByteArray4.length < (long) arg0 + this.aLong14) {
				@Pc(94) int local94 = (int) (this.aLong18 + (long) this.aByteArray4.length - this.aLong14);
				Static127.method202(arg2, arg1, this.aByteArray4, (int) (this.aLong14 - this.aLong18), local94);
				this.aLong14 += local94;
				arg1 += local94;
				arg0 -= local94;
				this.anInt305 = this.aByteArray4.length;
				this.method179();
			}
			if (this.aByteArray4.length < arg0) {
				if (this.aLong16 != this.aLong14) {
					this.aClass18_3.method481(this.aLong14);
					this.aLong16 = this.aLong14;
				}
				@Pc(153) long local153 = -1L;
				this.aClass18_3.method479(arg1, arg0, arg2);
				this.aLong16 += arg0;
				@Pc(169) long local169 = -1L;
				if (this.aLong14 >= this.aLong17 && this.aLong14 < this.aLong17 + (long) this.anInt302) {
					local153 = this.aLong14;
				} else if (this.aLong14 <= this.aLong17 && this.aLong14 + (long) arg0 > this.aLong17) {
					local153 = this.aLong17;
				}
				if (this.aLong14 + (long) arg0 > this.aLong17 && this.aLong17 + (long) this.anInt302 >= (long) arg0 + this.aLong14) {
					local169 = (long) arg0 + this.aLong14;
				} else if ((long) this.anInt302 + this.aLong17 > this.aLong14 && this.aLong17 + (long) this.anInt302 <= (long) arg0 + this.aLong14) {
					local169 = this.aLong17 + (long) this.anInt302;
				}
				if (this.aLong16 > this.aLong13) {
					this.aLong13 = this.aLong16;
				}
				if (local153 > -1L && local169 > local153) {
					@Pc(317) int local317 = (int) (local169 - local153);
					Static127.method202(arg2, (int) (local153 + (long) arg1 - this.aLong14), this.aByteArray5, (int) (local153 - this.aLong17), local317);
				}
				this.aLong14 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong18 == -1L) {
					this.aLong18 = this.aLong14;
				}
				Static127.method202(arg2, arg1, this.aByteArray4, (int) (this.aLong14 - this.aLong18), arg0);
				this.aLong14 += arg0;
				if ((long) this.anInt305 < this.aLong14 - this.aLong18) {
					this.anInt305 = (int) (this.aLong14 - this.aLong18);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong16 = -1L;
			throw local404;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	private void method179() throws IOException {
		if (this.aLong18 == -1L) {
			return;
		}
		if (this.aLong18 != this.aLong16) {
			this.aClass18_3.method481(this.aLong18);
			this.aLong16 = this.aLong18;
		}
		this.aClass18_3.method479(0, this.anInt305, this.aByteArray4);
		this.aLong16 += this.anInt305;
		@Pc(54) long local54 = -1L;
		if (this.aLong16 > this.aLong13) {
			this.aLong13 = this.aLong16;
		}
		if (this.aLong18 + (long) this.anInt305 > this.aLong17 && (long) this.anInt302 + this.aLong17 >= (long) this.anInt305 + this.aLong18) {
			local54 = this.aLong18 + (long) this.anInt305;
		} else if ((long) this.anInt302 + this.aLong17 > this.aLong18 && (long) this.anInt302 + this.aLong17 <= (long) this.anInt305 + this.aLong18) {
			local54 = this.aLong17 + (long) this.anInt302;
		}
		@Pc(145) long local145 = -1L;
		if (this.aLong17 <= this.aLong18 && (long) this.anInt302 + this.aLong17 > this.aLong18) {
			local145 = this.aLong18;
		} else if (this.aLong18 <= this.aLong17 && this.aLong17 < this.aLong18 + (long) this.anInt305) {
			local145 = this.aLong17;
		}
		if (local145 > -1L && local54 > local145) {
			@Pc(213) int local213 = (int) (local54 - local145);
			Static127.method202(this.aByteArray4, (int) (local145 - this.aLong18), this.aByteArray5, (int) (local145 - this.aLong17), local213);
		}
		this.anInt305 = 0;
		this.aLong18 = -1L;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[BII)V")
	public void method182(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong18 != -1L && this.aLong14 >= this.aLong18 && this.aLong14 + (long) arg1 <= (long) this.anInt305 + this.aLong18) {
				Static127.method202(this.aByteArray4, (int) (this.aLong14 - this.aLong18), arg0, 0, arg1);
				this.aLong14 += arg1;
				return;
			}
			@Pc(77) long local77 = this.aLong14;
			@Pc(81) int local81 = arg1;
			@Pc(116) int local116;
			if (this.aLong14 >= this.aLong17 && this.aLong14 < (long) this.anInt302 + this.aLong17) {
				local116 = (int) (this.aLong17 + (long) this.anInt302 - this.aLong14);
				if (arg1 < local116) {
					local116 = arg1;
				}
				arg1 -= local116;
				Static127.method202(this.aByteArray5, (int) (this.aLong14 - this.aLong17), arg0, 0, local116);
				this.aLong14 += local116;
				arg2 = local116;
			}
			if (this.aByteArray5.length < arg1) {
				this.aClass18_3.method481(this.aLong14);
				this.aLong16 = this.aLong14;
				while (arg1 > 0) {
					local116 = this.aClass18_3.method478(arg0, arg1, arg2);
					if (local116 == -1) {
						break;
					}
					this.aLong14 += local116;
					arg1 -= local116;
					arg2 += local116;
					this.aLong16 += local116;
				}
			} else if (arg1 > 0) {
				local116 = arg1;
				this.method177();
				if (arg1 > this.anInt302) {
					local116 = this.anInt302;
				}
				arg1 -= local116;
				Static127.method202(this.aByteArray5, 0, arg0, arg2, local116);
				arg2 += local116;
				this.aLong14 += local116;
			}
			if (this.aLong18 != -1L) {
				if (this.aLong14 < this.aLong18 && arg1 > 0) {
					local116 = (int) (this.aLong18 - this.aLong14) + arg2;
					if (local116 > arg1 + arg2) {
						local116 = arg1 + arg2;
					}
					while (local116 > arg2) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong14++;
					}
				}
				@Pc(303) long local303 = -1L;
				if (local77 <= this.aLong18 && local77 + (long) local81 > this.aLong18) {
					local303 = this.aLong18;
				} else if (this.aLong18 <= local77 && local77 < this.aLong18 + (long) this.anInt305) {
					local303 = local77;
				}
				@Pc(352) long local352 = -1L;
				if (this.aLong18 + (long) this.anInt305 > local77 && (long) local81 + local77 >= this.aLong18 - -((long) this.anInt305)) {
					local352 = this.aLong18 + (long) this.anInt305;
				} else if ((long) local81 + local77 > this.aLong18 && local77 + (long) local81 <= this.aLong18 - -((long) this.anInt305)) {
					local352 = (long) local81 + local77;
				}
				if (local303 > -1L && local303 < local352) {
					@Pc(442) int local442 = (int) (local352 - local303);
					Static127.method202(this.aByteArray4, (int) (local303 - this.aLong18), arg0, (int) (local303 - local77), local442);
					if (local352 > this.aLong14) {
						arg1 = (int) ((long) arg1 + this.aLong14 - local352);
						this.aLong14 = local352;
					}
				}
			}
		} catch (@Pc(480) IOException local480) {
			this.aLong16 = -1L;
			throw local480;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)J")
	public long method183() {
		return this.aLong15;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
	public void method184() throws IOException {
		this.method179();
		this.aClass18_3.method482();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(JI)V")
	public void method185(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong14 = arg0;
		}
	}
}
