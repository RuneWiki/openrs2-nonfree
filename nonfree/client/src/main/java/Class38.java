import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class38 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
	private int anInt1810;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "J")
	private long aLong105 = -1L;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt1806 = 0;

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "J")
	private long aLong108 = -1L;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "Lclient!u;")
	private final Class80 aClass80_4;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[B")
	private final byte[] aByteArray8;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!u;II)V")
	public Class38(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass80_4 = arg0;
		this.aLong107 = this.aLong106 = arg0.method2557();
		this.aLong109 = 0L;
		this.aByteArray10 = new byte[arg1];
		this.aByteArray8 = new byte[arg2];
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)J")
	public long method1153() {
		return this.aLong107;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	private void method1154() throws IOException {
		this.anInt1810 = 0;
		if (this.aLong109 != this.aLong104) {
			this.aClass80_4.method2558(this.aLong109);
			this.aLong104 = this.aLong109;
		}
		this.aLong105 = this.aLong109;
		while (this.anInt1810 < this.aByteArray10.length) {
			@Pc(58) int local58 = this.aClass80_4.method2559(this.aByteArray10, this.aByteArray10.length - this.anInt1810, this.anInt1810);
			if (local58 == -1) {
				break;
			}
			this.anInt1810 += local58;
			this.aLong104 += local58;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)V")
	public void method1155(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1159(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method1157() {
		return this.aClass80_4.method2560();
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
	public void method1158() throws IOException {
		this.method1160();
		this.aClass80_4.method2561();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[BI)V")
	public void method1159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong108 != -1L && this.aLong109 >= this.aLong108 && (long) this.anInt1806 + this.aLong108 >= this.aLong109 - -((long) arg1)) {
				Static184.method163(this.aByteArray8, (int) (this.aLong109 - this.aLong108), arg2, 0, arg1);
				this.aLong109 += arg1;
				return;
			}
			@Pc(89) long local89 = this.aLong109;
			@Pc(93) int local93 = arg1;
			@Pc(125) int local125;
			if (this.aLong109 >= this.aLong105 && (long) this.anInt1810 + this.aLong105 > this.aLong109) {
				local125 = (int) (this.aLong105 + (long) this.anInt1810 - this.aLong109);
				if (local125 > arg1) {
					local125 = arg1;
				}
				arg1 -= local125;
				Static184.method163(this.aByteArray10, (int) (this.aLong109 - this.aLong105), arg2, 0, local125);
				this.aLong109 += local125;
				arg0 = local125;
			}
			if (arg1 > this.aByteArray10.length) {
				this.aClass80_4.method2558(this.aLong109);
				this.aLong104 = this.aLong109;
				while (arg1 > 0) {
					local125 = this.aClass80_4.method2559(arg2, arg1, arg0);
					if (local125 == -1) {
						break;
					}
					this.aLong104 += local125;
					this.aLong109 += local125;
					arg1 -= local125;
					arg0 += local125;
				}
			} else if (arg1 > 0) {
				this.method1154();
				local125 = arg1;
				if (arg1 > this.anInt1810) {
					local125 = this.anInt1810;
				}
				arg1 -= local125;
				Static184.method163(this.aByteArray10, 0, arg2, arg0, local125);
				arg0 += local125;
				this.aLong109 += local125;
			}
			if (this.aLong108 != -1L) {
				if (this.aLong108 > this.aLong109 && arg1 > 0) {
					local125 = arg0 + (int) (this.aLong108 - this.aLong109);
					if (local125 > arg0 + arg1) {
						local125 = arg1 + arg0;
					}
					while (local125 > arg0) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong109++;
					}
				}
				@Pc(314) long local314 = -1L;
				if (local89 <= this.aLong108 && local89 + (long) local93 > this.aLong108) {
					local314 = this.aLong108;
				} else if (this.aLong108 <= local89 && local89 < this.aLong108 + (long) this.anInt1806) {
					local314 = local89;
				}
				@Pc(359) long local359 = -1L;
				if (this.aLong108 + (long) this.anInt1806 > local89 && this.aLong108 + (long) this.anInt1806 <= (long) local93 + local89) {
					local359 = this.aLong108 + (long) this.anInt1806;
				} else if (this.aLong108 < (long) local93 + local89 && (long) this.anInt1806 + this.aLong108 >= local89 - -((long) local93)) {
					local359 = local89 + (long) local93;
				}
				if (local314 > -1L && local359 > local314) {
					@Pc(440) int local440 = (int) (local359 - local314);
					Static184.method163(this.aByteArray8, (int) (local314 - this.aLong108), arg2, (int) (local314 - local89), local440);
					if (local359 > this.aLong109) {
						arg1 = (int) ((long) arg1 + this.aLong109 - local359);
						this.aLong109 = local359;
					}
				}
			}
		} catch (@Pc(482) IOException local482) {
			this.aLong104 = -1L;
			throw local482;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	private void method1160() throws IOException {
		if (this.aLong108 == -1L) {
			return;
		}
		@Pc(17) long local17 = -1L;
		@Pc(19) long local19 = -1L;
		if (this.aLong104 != this.aLong108) {
			this.aClass80_4.method2558(this.aLong108);
			this.aLong104 = this.aLong108;
		}
		this.aClass80_4.method2556(0, this.anInt1806, this.aByteArray8);
		if ((long) this.anInt1806 + this.aLong108 > this.aLong105 && (long) this.anInt1806 + this.aLong108 <= (long) this.anInt1810 + this.aLong105) {
			local19 = (long) this.anInt1806 + this.aLong108;
		} else if (this.aLong108 < this.aLong105 + (long) this.anInt1810 && (long) this.anInt1810 + this.aLong105 <= (long) this.anInt1806 + this.aLong108) {
			local19 = (long) this.anInt1810 + this.aLong105;
		}
		if (this.aLong105 <= this.aLong108 && this.aLong108 < (long) this.anInt1810 + this.aLong105) {
			local17 = this.aLong108;
		} else if (this.aLong108 <= this.aLong105 && this.aLong108 + (long) this.anInt1806 > this.aLong105) {
			local17 = this.aLong105;
		}
		this.aLong104 += this.anInt1806;
		if (this.aLong106 < this.aLong104) {
			this.aLong106 = this.aLong104;
		}
		if (local17 > -1L && local19 > local17) {
			@Pc(201) int local201 = (int) (local19 - local17);
			Static184.method163(this.aByteArray8, (int) (local17 - this.aLong108), this.aByteArray10, (int) (local17 - this.aLong105), local201);
		}
		this.aLong108 = -1L;
		this.anInt1806 = 0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(JB)V")
	public void method1161(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1157());
		}
		this.aLong109 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III[B)V")
	public void method1162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong107 < (long) arg0 + this.aLong109) {
				this.aLong107 = (long) arg0 + this.aLong109;
			}
			if (this.aLong108 != -1L && (this.aLong109 < this.aLong108 || this.aLong109 > (long) this.anInt1806 + this.aLong108)) {
				this.method1160();
			}
			if (this.aLong108 != -1L && (long) this.aByteArray8.length + this.aLong108 < (long) arg0 + this.aLong109) {
				@Pc(89) int local89 = (int) (this.aLong108 + (long) this.aByteArray8.length - this.aLong109);
				arg0 -= local89;
				Static184.method163(arg2, arg1, this.aByteArray8, (int) (this.aLong109 - this.aLong108), local89);
				arg1 += local89;
				this.aLong109 += local89;
				this.anInt1806 = this.aByteArray8.length;
				this.method1160();
			}
			if (this.aByteArray8.length < arg0) {
				if (this.aLong109 != this.aLong104) {
					this.aClass80_4.method2558(this.aLong109);
					this.aLong104 = this.aLong109;
				}
				@Pc(148) long local148 = -1L;
				this.aClass80_4.method2556(arg1, arg0, arg2);
				@Pc(157) long local157 = -1L;
				if (this.aLong109 >= this.aLong105 && (long) this.anInt1810 + this.aLong105 > this.aLong109) {
					local148 = this.aLong109;
				} else if (this.aLong105 >= this.aLong109 && this.aLong105 < this.aLong109 + (long) arg0) {
					local148 = this.aLong105;
				}
				if ((long) arg0 + this.aLong109 > this.aLong105 && (long) arg0 + this.aLong109 <= (long) this.anInt1810 + this.aLong105) {
					local157 = this.aLong109 + (long) arg0;
				} else if ((long) this.anInt1810 + this.aLong105 > this.aLong109 && (long) arg0 + this.aLong109 >= (long) this.anInt1810 + this.aLong105) {
					local157 = this.aLong105 + (long) this.anInt1810;
				}
				this.aLong104 += arg0;
				if (this.aLong106 < this.aLong104) {
					this.aLong106 = this.aLong104;
				}
				if (local148 > -1L && local148 < local157) {
					@Pc(304) int local304 = (int) (local157 - local148);
					Static184.method163(arg2, (int) ((long) arg1 + local148 - this.aLong109), this.aByteArray10, (int) (local148 - this.aLong105), local304);
				}
				this.aLong109 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong108 == -1L) {
					this.aLong108 = this.aLong109;
				}
				Static184.method163(arg2, arg1, this.aByteArray8, (int) (this.aLong109 - this.aLong108), arg0);
				this.aLong109 += arg0;
				if ((long) this.anInt1806 < this.aLong109 - this.aLong108) {
					this.anInt1806 = (int) (this.aLong109 - this.aLong108);
				}
			}
		} catch (@Pc(393) IOException local393) {
			this.aLong104 = -1L;
			throw local393;
		}
	}
}
