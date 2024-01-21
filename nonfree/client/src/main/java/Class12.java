import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class12 {

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "J")
	private long aLong37;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "J")
	private long aLong36 = -1L;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
	private int anInt400 = 0;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "J")
	private long aLong38 = -1L;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "Lclient!bc;")
	private final Class9 aClass9_1;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "[B")
	private final byte[] aByteArray3;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "[B")
	private final byte[] aByteArray4;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!bc;II)V")
	public Class12(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass9_1 = arg0;
		this.aLong34 = this.aLong35 = arg0.method245();
		this.aLong39 = 0L;
		this.aByteArray3 = new byte[arg1];
		this.aByteArray4 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
	public void method349() throws IOException {
		this.method352();
		this.aClass9_1.method243();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI[B)V")
	public void method350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong38 != -1L && this.aLong38 <= this.aLong39 && (long) this.anInt400 + this.aLong38 >= this.aLong39 + (long) arg0) {
				Static132.method848(this.aByteArray4, (int) (this.aLong39 - this.aLong38), arg2, 0, arg0);
				this.aLong39 += arg0;
				return;
			}
			@Pc(88) long local88 = this.aLong39;
			@Pc(90) int local90 = arg0;
			@Pc(120) int local120;
			if (this.aLong39 >= this.aLong36 && (long) this.anInt398 + this.aLong36 > this.aLong39) {
				local120 = (int) (this.aLong36 + (long) this.anInt398 - this.aLong39);
				if (local120 > arg0) {
					local120 = arg0;
				}
				arg0 -= local120;
				Static132.method848(this.aByteArray3, (int) (this.aLong39 - this.aLong36), arg2, 0, local120);
				arg1 = local120;
				this.aLong39 += local120;
			}
			if (this.aByteArray3.length < arg0) {
				this.aClass9_1.method241(this.aLong39);
				this.aLong37 = this.aLong39;
				while (arg0 > 0) {
					local120 = this.aClass9_1.method242(arg0, arg1, arg2);
					if (local120 == -1) {
						break;
					}
					this.aLong39 += local120;
					arg0 -= local120;
					this.aLong37 += local120;
					arg1 += local120;
				}
			} else if (arg0 > 0) {
				this.method353();
				local120 = arg0;
				if (arg0 > this.anInt398) {
					local120 = this.anInt398;
				}
				Static132.method848(this.aByteArray3, 0, arg2, arg1, local120);
				arg0 -= local120;
				arg1 += local120;
				this.aLong39 += local120;
			}
			if (this.aLong38 != -1L) {
				if (this.aLong39 < this.aLong38 && arg0 > 0) {
					local120 = arg1 + (int) (this.aLong38 - this.aLong39);
					if (arg1 + arg0 < local120) {
						local120 = arg0 + arg1;
					}
					while (local120 > arg1) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong39++;
					}
				}
				@Pc(314) long local314 = -1L;
				@Pc(316) long local316 = -1L;
				if (local88 <= this.aLong38 && local88 + (long) local90 > this.aLong38) {
					local314 = this.aLong38;
				} else if (local88 >= this.aLong38 && local88 < this.aLong38 + (long) this.anInt400) {
					local314 = local88;
				}
				if (local88 < this.aLong38 + (long) this.anInt400 && this.aLong38 + (long) this.anInt400 <= local88 - -((long) local90)) {
					local316 = this.aLong38 + (long) this.anInt400;
				} else if (this.aLong38 < (long) local90 + local88 && this.aLong38 + (long) this.anInt400 >= local88 + (long) local90) {
					local316 = (long) local90 + local88;
				}
				if (local314 > -1L && local314 < local316) {
					@Pc(424) int local424 = (int) (local316 - local314);
					Static132.method848(this.aByteArray4, (int) (local314 - this.aLong38), arg2, (int) (local314 - local88), local424);
					if (this.aLong39 < local316) {
						arg0 = (int) ((long) arg0 + this.aLong39 - local316);
						this.aLong39 = local316;
					}
				}
			}
		} catch (@Pc(464) IOException local464) {
			this.aLong37 = -1L;
			throw local464;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	private void method352() throws IOException {
		if (this.aLong38 == -1L) {
			return;
		}
		if (this.aLong37 != this.aLong38) {
			this.aClass9_1.method241(this.aLong38);
			this.aLong37 = this.aLong38;
		}
		@Pc(28) long local28 = -1L;
		@Pc(30) long local30 = -1L;
		this.aClass9_1.method246(this.anInt400, 0, this.aByteArray4);
		if (this.aLong36 < this.aLong38 + (long) this.anInt400 && (long) this.anInt398 + this.aLong36 >= this.aLong38 - -((long) this.anInt400)) {
			local30 = this.aLong38 + (long) this.anInt400;
		} else if (this.aLong38 < this.aLong36 + (long) this.anInt398 && (long) this.anInt400 + this.aLong38 >= (long) this.anInt398 + this.aLong36) {
			local30 = (long) this.anInt398 + this.aLong36;
		}
		if (this.aLong36 <= this.aLong38 && this.aLong38 < this.aLong36 + (long) this.anInt398) {
			local28 = this.aLong38;
		} else if (this.aLong38 <= this.aLong36 && this.aLong36 < this.aLong38 + (long) this.anInt400) {
			local28 = this.aLong36;
		}
		this.aLong37 += this.anInt400;
		if (this.aLong35 < this.aLong37) {
			this.aLong35 = this.aLong37;
		}
		if (local28 > -1L && local28 < local30) {
			@Pc(199) int local199 = (int) (local30 - local28);
			Static132.method848(this.aByteArray4, (int) (local28 - this.aLong38), this.aByteArray3, (int) (local28 - this.aLong36), local199);
		}
		this.aLong38 = -1L;
		this.anInt400 = 0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	private void method353() throws IOException {
		this.anInt398 = 0;
		if (this.aLong39 != this.aLong37) {
			this.aClass9_1.method241(this.aLong39);
			this.aLong37 = this.aLong39;
		}
		this.aLong36 = this.aLong39;
		while (this.anInt398 < this.aByteArray3.length) {
			@Pc(55) int local55 = this.aClass9_1.method242(this.aByteArray3.length - this.anInt398, this.anInt398, this.aByteArray3);
			if (local55 == -1) {
				break;
			}
			this.anInt398 += local55;
			this.aLong37 += local55;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([BBII)V")
	public void method354(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong34 < this.aLong39 + (long) arg1) {
				this.aLong34 = (long) arg1 + this.aLong39;
			}
			if (this.aLong38 != -1L && (this.aLong39 < this.aLong38 || (long) this.anInt400 + this.aLong38 < this.aLong39)) {
				this.method352();
			}
			if (this.aLong38 != -1L && this.aLong38 + (long) this.aByteArray4.length < (long) arg1 + this.aLong39) {
				@Pc(92) int local92 = (int) ((long) this.aByteArray4.length + this.aLong38 - this.aLong39);
				arg1 -= local92;
				Static132.method848(arg0, arg2, this.aByteArray4, (int) (this.aLong39 - this.aLong38), local92);
				arg2 += local92;
				this.aLong39 += local92;
				this.anInt400 = this.aByteArray4.length;
				this.method352();
			}
			if (this.aByteArray4.length < arg1) {
				if (this.aLong39 != this.aLong37) {
					this.aClass9_1.method241(this.aLong39);
					this.aLong37 = this.aLong39;
				}
				this.aClass9_1.method246(arg1, arg2, arg0);
				this.aLong37 += arg1;
				if (this.aLong37 > this.aLong35) {
					this.aLong35 = this.aLong37;
				}
				@Pc(183) long local183 = -1L;
				if (this.aLong39 >= this.aLong36 && this.aLong39 < (long) this.anInt398 + this.aLong36) {
					local183 = this.aLong39;
				} else if (this.aLong39 <= this.aLong36 && this.aLong39 + (long) arg1 > this.aLong36) {
					local183 = this.aLong36;
				}
				@Pc(237) long local237 = -1L;
				if (this.aLong39 + (long) arg1 > this.aLong36 && this.aLong36 + (long) this.anInt398 >= this.aLong39 + (long) arg1) {
					local237 = this.aLong39 + (long) arg1;
				} else if (this.aLong39 < this.aLong36 + (long) this.anInt398 && this.aLong39 + (long) arg1 >= this.aLong36 + (long) this.anInt398) {
					local237 = this.aLong36 + (long) this.anInt398;
				}
				if (local183 > -1L && local237 > local183) {
					@Pc(317) int local317 = (int) (local237 - local183);
					Static132.method848(arg0, (int) ((long) arg2 + local183 - this.aLong39), this.aByteArray3, (int) (local183 - this.aLong36), local317);
				}
				this.aLong39 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong38 == -1L) {
					this.aLong38 = this.aLong39;
				}
				Static132.method848(arg0, arg2, this.aByteArray4, (int) (this.aLong39 - this.aLong38), arg1);
				this.aLong39 += arg1;
				if (this.aLong39 - this.aLong38 > (long) this.anInt400) {
					this.anInt400 = (int) (this.aLong39 - this.aLong38);
				}
			}
		} catch (@Pc(402) IOException local402) {
			this.aLong37 = -1L;
			throw local402;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)J")
	public long method356() {
		return this.aLong34;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BJ)V")
	public void method357(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong39 = arg0;
		}
	}
}
