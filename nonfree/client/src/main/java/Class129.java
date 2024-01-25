import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class129 {

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "J")
	private long aLong127;

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
	private int anInt3719;

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
	private int anInt3713 = 0;

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "J")
	private long aLong129 = -1L;

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "J")
	private long aLong132 = -1L;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "Lclient!ih;")
	private final Class92 aClass92_1;

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "J")
	private long aLong128;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "J")
	private long aLong131;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "[B")
	private final byte[] aByteArray54;

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "[B")
	private final byte[] aByteArray55;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class129(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass92_1 = arg0;
		this.aLong130 = this.aLong128 = arg0.method2382();
		this.aLong131 = 0L;
		this.aByteArray54 = new byte[arg1];
		this.aByteArray55 = new byte[arg2];
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)J")
	public long method3357() {
		return this.aLong130;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
	private void method3361() throws IOException {
		if (this.aLong129 == -1L) {
			return;
		}
		if (this.aLong129 != this.aLong127) {
			this.aClass92_1.method2385(this.aLong129);
			this.aLong127 = this.aLong129;
		}
		this.aClass92_1.method2386(0, this.anInt3713, this.aByteArray55);
		this.aLong127 += this.anInt3713;
		if (this.aLong127 > this.aLong128) {
			this.aLong128 = this.aLong127;
		}
		@Pc(59) long local59 = -1L;
		@Pc(61) long local61 = -1L;
		if (this.aLong129 >= this.aLong132 && this.aLong132 + (long) this.anInt3719 > this.aLong129) {
			local59 = this.aLong129;
		} else if (this.aLong132 >= this.aLong129 && (long) this.anInt3713 + this.aLong129 > this.aLong132) {
			local59 = this.aLong132;
		}
		if ((long) this.anInt3713 + this.aLong129 > this.aLong132 && this.aLong132 + (long) this.anInt3719 >= this.aLong129 + (long) this.anInt3713) {
			local61 = (long) this.anInt3713 + this.aLong129;
		} else if (this.aLong129 < (long) this.anInt3719 + this.aLong132 && this.aLong129 + (long) this.anInt3713 >= this.aLong132 - -((long) this.anInt3719)) {
			local61 = (long) this.anInt3719 + this.aLong132;
		}
		if (local59 > -1L && local59 < local61) {
			@Pc(205) int local205 = (int) (local61 - local59);
			Static368.method5429(this.aByteArray55, (int) (local59 - this.aLong129), this.aByteArray54, (int) (local59 - this.aLong132), local205);
		}
		this.aLong129 = -1L;
		this.anInt3713 = 0;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)Ljava/io/File;")
	private File method3362() {
		return this.aClass92_1.method2383();
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
	private void method3363() throws IOException {
		this.anInt3719 = 0;
		if (this.aLong127 != this.aLong131) {
			this.aClass92_1.method2385(this.aLong131);
			this.aLong127 = this.aLong131;
		}
		this.aLong132 = this.aLong131;
		while (this.aByteArray54.length > this.anInt3719) {
			@Pc(43) int local43 = this.aByteArray54.length - this.anInt3719;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(60) int local60 = this.aClass92_1.method2384(this.aByteArray54, this.anInt3719, local43);
			if (local60 == -1) {
				break;
			}
			this.aLong127 += local60;
			this.anInt3719 += local60;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([BIII)V")
	public void method3364(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong129 != -1L && this.aLong131 >= this.aLong129 && (long) arg1 + this.aLong131 <= this.aLong129 + (long) this.anInt3713) {
				Static368.method5429(this.aByteArray55, (int) (this.aLong131 - this.aLong129), arg0, 0, arg1);
				this.aLong131 += arg1;
				return;
			}
			@Pc(88) long local88 = this.aLong131;
			@Pc(92) int local92 = arg1;
			@Pc(128) int local128;
			if (this.aLong131 >= this.aLong132 && this.aLong131 < (long) this.anInt3719 + this.aLong132) {
				local128 = (int) ((long) this.anInt3719 + this.aLong132 - this.aLong131);
				if (local128 > arg1) {
					local128 = arg1;
				}
				Static368.method5429(this.aByteArray54, (int) (this.aLong131 - this.aLong132), arg0, 0, local128);
				arg1 -= local128;
				this.aLong131 += local128;
				arg2 = local128;
			}
			if (this.aByteArray54.length < arg1) {
				this.aClass92_1.method2385(this.aLong131);
				this.aLong127 = this.aLong131;
				while (arg1 > 0) {
					local128 = this.aClass92_1.method2384(arg0, arg2, arg1);
					if (local128 == -1) {
						break;
					}
					arg1 -= local128;
					this.aLong127 += local128;
					arg2 += local128;
					this.aLong131 += local128;
				}
			} else if (arg1 > 0) {
				this.method3363();
				local128 = arg1;
				if (this.anInt3719 < arg1) {
					local128 = this.anInt3719;
				}
				Static368.method5429(this.aByteArray54, 0, arg0, arg2, local128);
				arg2 += local128;
				this.aLong131 += local128;
				arg1 -= local128;
			}
			if (this.aLong129 != -1L) {
				if (this.aLong129 > this.aLong131 && arg1 > 0) {
					local128 = (int) (this.aLong129 - this.aLong131) + arg2;
					if (arg1 + arg2 < local128) {
						local128 = arg1 + arg2;
					}
					while (arg2 < local128) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong131++;
					}
				}
				@Pc(318) long local318 = -1L;
				if (this.aLong129 >= local88 && local88 + (long) local92 > this.aLong129) {
					local318 = this.aLong129;
				} else if (local88 >= this.aLong129 && local88 < this.aLong129 + (long) this.anInt3713) {
					local318 = local88;
				}
				@Pc(364) long local364 = -1L;
				if (local88 < this.aLong129 + (long) this.anInt3713 && local88 + (long) local92 >= this.aLong129 - -((long) this.anInt3713)) {
					local364 = (long) this.anInt3713 + this.aLong129;
				} else if (this.aLong129 < (long) local92 + local88 && (long) this.anInt3713 + this.aLong129 >= (long) local92 + local88) {
					local364 = local88 + (long) local92;
				}
				if (local318 > -1L && local364 > local318) {
					@Pc(439) int local439 = (int) (local364 - local318);
					Static368.method5429(this.aByteArray55, (int) (local318 - this.aLong129), arg0, (int) (local318 - local88), local439);
					if (local364 > this.aLong131) {
						arg1 = (int) ((long) arg1 + this.aLong131 - local364);
						this.aLong131 = local364;
					}
				}
			}
		} catch (@Pc(476) IOException local476) {
			this.aLong127 = -1L;
			throw local476;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IJ)V")
	public void method3365(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3362());
		}
		this.aLong131 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[B)V")
	public void method3366(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method3364(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[BI)V")
	public void method3367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong131 + (long) arg1 > this.aLong130) {
				this.aLong130 = (long) arg1 + this.aLong131;
			}
			if (this.aLong129 != -1L && (this.aLong131 < this.aLong129 || this.aLong131 > (long) this.anInt3713 + this.aLong129)) {
				this.method3361();
			}
			if (this.aLong129 != -1L && this.aLong129 + (long) this.aByteArray55.length < this.aLong131 + (long) arg1) {
				@Pc(88) int local88 = (int) ((long) this.aByteArray55.length + this.aLong129 - this.aLong131);
				Static368.method5429(arg2, arg0, this.aByteArray55, (int) (this.aLong131 - this.aLong129), local88);
				arg0 += local88;
				arg1 -= local88;
				this.aLong131 += local88;
				this.anInt3713 = this.aByteArray55.length;
				this.method3361();
			}
			if (this.aByteArray55.length < arg1) {
				if (this.aLong127 != this.aLong131) {
					this.aClass92_1.method2385(this.aLong131);
					this.aLong127 = this.aLong131;
				}
				this.aClass92_1.method2386(arg0, arg1, arg2);
				this.aLong127 += arg1;
				if (this.aLong127 > this.aLong128) {
					this.aLong128 = this.aLong127;
				}
				@Pc(175) long local175 = -1L;
				@Pc(177) long local177 = -1L;
				if (this.aLong131 >= this.aLong132 && (long) this.anInt3719 + this.aLong132 > this.aLong131) {
					local175 = this.aLong131;
				} else if (this.aLong132 >= this.aLong131 && this.aLong131 + (long) arg1 > this.aLong132) {
					local175 = this.aLong132;
				}
				if (this.aLong132 < this.aLong131 + (long) arg1 && this.aLong131 + (long) arg1 <= this.aLong132 - -((long) this.anInt3719)) {
					local177 = this.aLong131 + (long) arg1;
				} else if (this.aLong131 < this.aLong132 + (long) this.anInt3719 && this.aLong131 + (long) arg1 >= this.aLong132 - -((long) this.anInt3719)) {
					local177 = this.aLong132 + (long) this.anInt3719;
				}
				if (local175 > -1L && local175 < local177) {
					@Pc(329) int local329 = (int) (local177 - local175);
					Static368.method5429(arg2, (int) ((long) arg0 + local175 - this.aLong131), this.aByteArray54, (int) (local175 - this.aLong132), local329);
				}
				this.aLong131 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong129 == -1L) {
					this.aLong129 = this.aLong131;
				}
				Static368.method5429(arg2, arg0, this.aByteArray55, (int) (this.aLong131 - this.aLong129), arg1);
				this.aLong131 += arg1;
				if (this.aLong131 - this.aLong129 > (long) this.anInt3713) {
					this.anInt3713 = (int) (this.aLong131 - this.aLong129);
				}
			}
		} catch (@Pc(417) IOException local417) {
			this.aLong127 = -1L;
			throw local417;
		}
	}
}
