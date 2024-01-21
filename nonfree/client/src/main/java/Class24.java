import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class24 {

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	private int anInt824 = 0;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "J")
	private long aLong36 = -1L;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "J")
	private long aLong37 = -1L;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Lclient!af;")
	private final Class6 aClass6_3;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "[B")
	private final byte[] aByteArray4;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!af;II)V")
	public Class24(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass6_3 = arg0;
		this.aLong35 = this.aLong38 = arg0.method100();
		this.aByteArray5 = new byte[arg1];
		this.aByteArray4 = new byte[arg2];
		this.aLong39 = 0L;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	private void method591() throws IOException {
		this.anInt835 = 0;
		if (this.aLong40 != this.aLong39) {
			this.aClass6_3.method103(this.aLong39);
			this.aLong40 = this.aLong39;
		}
		this.aLong37 = this.aLong39;
		while (this.anInt835 < this.aByteArray5.length) {
			@Pc(52) int local52 = this.aClass6_3.method104(this.anInt835, this.aByteArray5, this.aByteArray5.length - this.anInt835);
			if (local52 == -1) {
				break;
			}
			this.anInt835 += local52;
			this.aLong40 += local52;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public void method592() throws IOException {
		this.method596();
		this.aClass6_3.method105();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[BB)V")
	public void method593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong36 != -1L && this.aLong36 <= this.aLong39 && (long) this.anInt824 + this.aLong36 >= this.aLong39 - -((long) arg1)) {
				Static133.method956(this.aByteArray4, (int) (this.aLong39 - this.aLong36), arg2, 0, arg1);
				this.aLong39 += arg1;
				return;
			}
			@Pc(73) long local73 = this.aLong39;
			@Pc(81) int local81 = arg1;
			@Pc(110) int local110;
			if (this.aLong39 >= this.aLong37 && this.aLong39 < this.aLong37 + (long) this.anInt835) {
				local110 = (int) ((long) this.anInt835 + this.aLong37 - this.aLong39);
				if (local110 > arg1) {
					local110 = arg1;
				}
				Static133.method956(this.aByteArray5, (int) (this.aLong39 - this.aLong37), arg2, 0, local110);
				arg1 -= local110;
				this.aLong39 += local110;
				arg0 = local110;
			}
			if (arg1 > this.aByteArray5.length) {
				this.aClass6_3.method103(this.aLong39);
				this.aLong40 = this.aLong39;
				while (arg1 > 0) {
					local110 = this.aClass6_3.method104(arg0, arg2, arg1);
					if (local110 == -1) {
						break;
					}
					arg0 += local110;
					this.aLong40 += local110;
					arg1 -= local110;
					this.aLong39 += local110;
				}
			} else if (arg1 > 0) {
				this.method591();
				local110 = arg1;
				if (arg1 > this.anInt835) {
					local110 = this.anInt835;
				}
				Static133.method956(this.aByteArray5, 0, arg2, arg0, local110);
				arg1 -= local110;
				this.aLong39 += local110;
				arg0 += local110;
			}
			if (this.aLong36 != -1L) {
				if (this.aLong36 > this.aLong39 && arg1 > 0) {
					local110 = (int) (this.aLong36 - this.aLong39) + arg0;
					if (local110 > arg1 + arg0) {
						local110 = arg0 + arg1;
					}
					while (arg0 < local110) {
						arg2[arg0++] = 0;
						this.aLong39++;
						arg1--;
					}
				}
				@Pc(303) long local303 = -1L;
				if ((long) this.anInt824 + this.aLong36 > local73 && (long) this.anInt824 + this.aLong36 <= local73 + (long) local81) {
					local303 = this.aLong36 + (long) this.anInt824;
				} else if ((long) local81 + local73 > this.aLong36 && local73 + (long) local81 <= this.aLong36 + (long) this.anInt824) {
					local303 = local73 + (long) local81;
				}
				@Pc(368) long local368 = -1L;
				if (local73 <= this.aLong36 && this.aLong36 < local73 + (long) local81) {
					local368 = this.aLong36;
				} else if (local73 >= this.aLong36 && this.aLong36 + (long) this.anInt824 > local73) {
					local368 = local73;
				}
				if (local368 > -1L && local368 < local303) {
					@Pc(426) int local426 = (int) (local303 - local368);
					Static133.method956(this.aByteArray4, (int) (local368 - this.aLong36), arg2, (int) (local368 - local73), local426);
					if (local303 > this.aLong39) {
						arg1 = (int) ((long) arg1 + this.aLong39 - local303);
						this.aLong39 = local303;
					}
				}
			}
		} catch (@Pc(463) IOException local463) {
			this.aLong40 = -1L;
			throw local463;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[BII)V")
	public void method595(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong35 < this.aLong39 + (long) arg0) {
				this.aLong35 = this.aLong39 + (long) arg0;
			}
			if (this.aLong36 != -1L && (this.aLong39 < this.aLong36 || this.aLong36 + (long) this.anInt824 < this.aLong39)) {
				this.method596();
			}
			if (this.aLong36 != -1L && (long) arg0 + this.aLong39 > this.aLong36 + (long) this.aByteArray4.length) {
				@Pc(98) int local98 = (int) (this.aLong36 + (long) this.aByteArray4.length - this.aLong39);
				arg0 -= local98;
				Static133.method956(arg1, arg2, this.aByteArray4, (int) (this.aLong39 - this.aLong36), local98);
				arg2 += local98;
				this.aLong39 += local98;
				this.anInt824 = this.aByteArray4.length;
				this.method596();
			}
			if (arg0 > this.aByteArray4.length) {
				@Pc(145) long local145 = -1L;
				if (this.aLong40 != this.aLong39) {
					this.aClass6_3.method103(this.aLong39);
					this.aLong40 = this.aLong39;
				}
				this.aClass6_3.method102(arg1, arg0, arg2);
				if (this.aLong37 <= this.aLong39 && this.aLong39 < this.aLong37 + (long) this.anInt835) {
					local145 = this.aLong39;
				} else if (this.aLong37 >= this.aLong39 && this.aLong37 < (long) arg0 + this.aLong39) {
					local145 = this.aLong37;
				}
				@Pc(218) long local218 = -1L;
				if (this.aLong37 < (long) arg0 + this.aLong39 && (long) arg0 + this.aLong39 <= this.aLong37 - -((long) this.anInt835)) {
					local218 = this.aLong39 + (long) arg0;
				} else if (this.aLong39 < (long) this.anInt835 + this.aLong37 && (long) arg0 + this.aLong39 >= (long) this.anInt835 + this.aLong37) {
					local218 = (long) this.anInt835 + this.aLong37;
				}
				this.aLong40 += arg0;
				if (this.aLong40 > this.aLong38) {
					this.aLong38 = this.aLong40;
				}
				if (local145 > -1L && local218 > local145) {
					@Pc(328) int local328 = (int) (local218 - local145);
					Static133.method956(arg1, (int) ((long) arg2 + local145 - this.aLong39), this.aByteArray5, (int) (local145 - this.aLong37), local328);
				}
				this.aLong39 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong36 == -1L) {
					this.aLong36 = this.aLong39;
				}
				Static133.method956(arg1, arg2, this.aByteArray4, (int) (this.aLong39 - this.aLong36), arg0);
				this.aLong39 += arg0;
				if ((long) this.anInt824 < this.aLong39 - this.aLong36) {
					this.anInt824 = (int) (this.aLong39 - this.aLong36);
				}
			}
		} catch (@Pc(412) IOException local412) {
			this.aLong40 = -1L;
			throw local412;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	private void method596() throws IOException {
		if (this.aLong36 == -1L) {
			return;
		}
		if (this.aLong40 != this.aLong36) {
			this.aClass6_3.method103(this.aLong36);
			this.aLong40 = this.aLong36;
		}
		@Pc(28) long local28 = -1L;
		this.aClass6_3.method102(this.aByteArray4, this.anInt824, 0);
		if (this.aLong37 <= this.aLong36 && this.aLong36 < this.aLong37 + (long) this.anInt835) {
			local28 = this.aLong36;
		} else if (this.aLong36 <= this.aLong37 && this.aLong37 < this.aLong36 + (long) this.anInt824) {
			local28 = this.aLong37;
		}
		@Pc(92) long local92 = -1L;
		this.aLong40 += this.anInt824;
		if (this.aLong38 < this.aLong40) {
			this.aLong38 = this.aLong40;
		}
		if ((long) this.anInt824 + this.aLong36 > this.aLong37 && (long) this.anInt824 + this.aLong36 <= this.aLong37 + (long) this.anInt835) {
			local92 = (long) this.anInt824 + this.aLong36;
		} else if (this.aLong36 < this.aLong37 + (long) this.anInt835 && this.aLong37 + (long) this.anInt835 <= this.aLong36 + (long) this.anInt824) {
			local92 = this.aLong37 + (long) this.anInt835;
		}
		if (local28 > -1L && local28 < local92) {
			@Pc(198) int local198 = (int) (local92 - local28);
			Static133.method956(this.aByteArray4, (int) (local28 - this.aLong36), this.aByteArray5, (int) (local28 - this.aLong37), local198);
		}
		this.aLong36 = -1L;
		this.anInt824 = 0;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)J")
	public long method598() {
		return this.aLong35;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JI)V")
	public void method599(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong39 = arg0;
		}
	}
}
