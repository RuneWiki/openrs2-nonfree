import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class152 {

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
	private int anInt4119;

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "J")
	private long aLong106 = -1L;

	@OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
	private int anInt4120 = 0;

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "J")
	private long aLong110 = -1L;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "Lclient!ro;")
	private final Class312 aClass312_4;

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "J")
	private long aLong108;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "[B")
	private final byte[] aByteArray35;

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "[B")
	private final byte[] aByteArray36;

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!ro;II)V")
	public Class152(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass312_4 = arg0;
		this.aLong108 = this.aLong111 = arg0.method6844();
		this.aByteArray35 = new byte[arg1];
		this.aByteArray36 = new byte[arg2];
		this.aLong109 = 0L;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	public void method3498() throws IOException {
		this.method3508();
		this.aClass312_4.method6838();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([BBII)V")
	public void method3499(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong108 < this.aLong109 + (long) arg1) {
				this.aLong108 = this.aLong109 + (long) arg1;
			}
			if (this.aLong110 != -1L && (this.aLong110 > this.aLong109 || this.aLong110 + (long) this.anInt4120 < this.aLong109)) {
				this.method3508();
			}
			if (this.aLong110 != -1L && (long) arg1 + this.aLong109 > this.aLong110 - -((long) this.aByteArray36.length)) {
				@Pc(95) int local95 = (int) (this.aLong110 + (long) this.aByteArray36.length - this.aLong109);
				Static681.method4034(arg0, arg2, this.aByteArray36, (int) (this.aLong109 - this.aLong110), local95);
				this.aLong109 += (long) local95;
				arg1 -= local95;
				arg2 += local95;
				this.anInt4120 = this.aByteArray36.length;
				this.method3508();
			}
			if (arg1 > this.aByteArray36.length) {
				if (this.aLong109 != this.aLong107) {
					this.aClass312_4.method6841(this.aLong109);
					this.aLong107 = this.aLong109;
				}
				this.aClass312_4.method6840(arg1, arg2, arg0);
				this.aLong107 += (long) arg1;
				if (this.aLong111 < this.aLong107) {
					this.aLong111 = this.aLong107;
				}
				@Pc(186) long local186 = -1L;
				if (this.aLong109 >= this.aLong106 && this.aLong109 < this.aLong106 + (long) this.anInt4119) {
					local186 = this.aLong109;
				} else if (this.aLong106 >= this.aLong109 && this.aLong106 < (long) arg1 + this.aLong109) {
					local186 = this.aLong106;
				}
				@Pc(232) long local232 = -1L;
				if (this.aLong109 + (long) arg1 > this.aLong106 && (long) arg1 + this.aLong109 <= this.aLong106 - -((long) this.anInt4119)) {
					local232 = this.aLong109 + (long) arg1;
				} else if ((long) this.anInt4119 + this.aLong106 > this.aLong109 && (long) this.anInt4119 + this.aLong106 <= (long) arg1 + this.aLong109) {
					local232 = this.aLong106 + (long) this.anInt4119;
				}
				if (local186 > -1L && local186 < local232) {
					@Pc(324) int local324 = (int) (local232 - local186);
					Static681.method4034(arg0, (int) ((long) arg2 + local186 - this.aLong109), this.aByteArray35, (int) (local186 - this.aLong106), local324);
				}
				this.aLong109 += (long) arg1;
			} else if (arg1 > 0) {
				if (this.aLong110 == -1L) {
					this.aLong110 = this.aLong109;
				}
				Static681.method4034(arg0, arg2, this.aByteArray36, (int) (this.aLong109 - this.aLong110), arg1);
				this.aLong109 += (long) arg1;
				if (this.aLong109 - this.aLong110 > (long) this.anInt4120) {
					this.anInt4120 = (int) (this.aLong109 - this.aLong110);
				}
			}
		} catch (@Pc(421) IOException local421) {
			this.aLong107 = -1L;
			throw local421;
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method3500() {
		return this.aClass312_4.method6842();
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V")
	private void method3502() throws IOException {
		this.anInt4119 = 0;
		if (this.aLong107 != this.aLong109) {
			this.aClass312_4.method6841(this.aLong109);
			this.aLong107 = this.aLong109;
		}
		this.aLong106 = this.aLong109;
		while (this.aByteArray35.length > this.anInt4119) {
			@Pc(47) int local47 = this.aByteArray35.length - this.anInt4119;
			if (local47 > 200000000) {
				local47 = 200000000;
			}
			@Pc(66) int local66 = this.aClass312_4.method6839(local47, this.anInt4119, this.aByteArray35);
			if (local66 == -1) {
				break;
			}
			this.aLong107 += (long) local66;
			this.anInt4119 += local66;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([BI)V")
	public void method3504(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method3505(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II[BZ)V")
	public void method3505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg0 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong110 != -1L && this.aLong109 >= this.aLong110 && this.aLong110 + (long) this.anInt4120 >= (long) arg0 + this.aLong109) {
				Static681.method4034(this.aByteArray36, (int) (this.aLong109 - this.aLong110), arg2, 0, arg0);
				this.aLong109 += (long) arg0;
				return;
			}
			@Pc(73) long local73 = this.aLong109;
			@Pc(77) int local77 = arg0;
			@Pc(106) int local106;
			if (this.aLong109 >= this.aLong106 && this.aLong109 < this.aLong106 + (long) this.anInt4119) {
				local106 = (int) ((long) this.anInt4119 + this.aLong106 - this.aLong109);
				if (local106 > arg0) {
					local106 = arg0;
				}
				Static681.method4034(this.aByteArray35, (int) (this.aLong109 - this.aLong106), arg2, 0, local106);
				arg0 -= local106;
				this.aLong109 += (long) local106;
				arg1 = local106;
			}
			if (arg0 > this.aByteArray35.length) {
				this.aClass312_4.method6841(this.aLong109);
				this.aLong107 = this.aLong109;
				while (arg0 > 0) {
					local106 = this.aClass312_4.method6839(arg0, arg1, arg2);
					if (local106 == -1) {
						break;
					}
					arg1 += local106;
					arg0 -= local106;
					this.aLong109 += (long) local106;
					this.aLong107 += (long) local106;
				}
			} else if (arg0 > 0) {
				this.method3502();
				local106 = arg0;
				if (this.anInt4119 < arg0) {
					local106 = this.anInt4119;
				}
				Static681.method4034(this.aByteArray35, 0, arg2, arg1, local106);
				this.aLong109 += (long) local106;
				arg1 += local106;
				arg0 -= local106;
			}
			if (this.aLong110 != -1L) {
				if (this.aLong110 > this.aLong109 && arg0 > 0) {
					local106 = (int) (this.aLong110 - this.aLong109) + arg1;
					if (arg1 + arg0 < local106) {
						local106 = arg0 + arg1;
					}
					while (arg1 < local106) {
						arg2[arg1++] = 0;
						arg0--;
						this.aLong109++;
					}
				}
				@Pc(299) long local299 = -1L;
				if (local73 <= this.aLong110 && (long) local77 + local73 > this.aLong110) {
					local299 = this.aLong110;
				} else if (local73 >= this.aLong110 && local73 < (long) this.anInt4120 + this.aLong110) {
					local299 = local73;
				}
				@Pc(343) long local343 = -1L;
				if (local73 < (long) this.anInt4120 + this.aLong110 && local73 + (long) local77 >= (long) this.anInt4120 + this.aLong110) {
					local343 = this.aLong110 + (long) this.anInt4120;
				} else if (local73 + (long) local77 > this.aLong110 && (long) local77 + local73 <= (long) this.anInt4120 + this.aLong110) {
					local343 = local73 + (long) local77;
				}
				if (local299 > -1L && local343 > local299) {
					@Pc(422) int local422 = (int) (local343 - local299);
					Static681.method4034(this.aByteArray36, (int) (local299 - this.aLong110), arg2, (int) (local299 - local73), local422);
					if (local343 > this.aLong109) {
						arg0 = (int) ((long) arg0 + this.aLong109 - local343);
						this.aLong109 = local343;
					}
				}
			}
		} catch (@Pc(460) IOException local460) {
			this.aLong107 = -1L;
			throw local460;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IJ)V")
	public void method3506(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3500());
		}
		this.aLong109 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)J")
	public long method3507() {
		return this.aLong108;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
	private void method3508() throws IOException {
		if (this.aLong110 == -1L) {
			return;
		}
		if (this.aLong110 != this.aLong107) {
			this.aClass312_4.method6841(this.aLong110);
			this.aLong107 = this.aLong110;
		}
		this.aClass312_4.method6840(this.anInt4120, 0, this.aByteArray36);
		this.aLong107 += (long) this.anInt4120;
		if (this.aLong107 > this.aLong111) {
			this.aLong111 = this.aLong107;
		}
		@Pc(65) long local65 = -1L;
		@Pc(67) long local67 = -1L;
		if (this.aLong106 <= this.aLong110 && this.aLong110 < this.aLong106 + (long) this.anInt4119) {
			local65 = this.aLong110;
		} else if (this.aLong106 >= this.aLong110 && (long) this.anInt4120 + this.aLong110 > this.aLong106) {
			local65 = this.aLong106;
		}
		if (this.aLong106 < (long) this.anInt4120 + this.aLong110 && this.aLong106 + (long) this.anInt4119 >= this.aLong110 + (long) this.anInt4120) {
			local67 = (long) this.anInt4120 + this.aLong110;
		} else if (this.aLong110 < (long) this.anInt4119 + this.aLong106 && (long) this.anInt4120 + this.aLong110 >= this.aLong106 + (long) this.anInt4119) {
			local67 = this.aLong106 + (long) this.anInt4119;
		}
		if (local65 > -1L && local67 > local65) {
			@Pc(213) int local213 = (int) (local67 - local65);
			Static681.method4034(this.aByteArray36, (int) (local65 - this.aLong110), this.aByteArray35, (int) (local65 - this.aLong106), local213);
		}
		this.anInt4120 = 0;
		this.aLong110 = -1L;
	}
}
