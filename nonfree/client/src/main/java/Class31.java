import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class31 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
	private int anInt1085;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "J")
	private long aLong38 = -1L;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
	private int anInt1080 = 0;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "J")
	private long aLong39 = -1L;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Lclient!hm;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "J")
	private long aLong37;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!hm;II)V")
	public Class31(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass68_1 = arg0;
		this.aLong37 = this.aLong40 = arg0.method1821();
		this.aLong41 = 0L;
		this.aByteArray14 = new byte[arg2];
		this.aByteArray13 = new byte[arg1];
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)J")
	public long method944() {
		return this.aLong37;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method946() {
		return this.aClass68_1.method1822();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI[BI)V")
	public void method948(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong39 != -1L && this.aLong41 >= this.aLong39 && (long) arg0 + this.aLong41 <= this.aLong39 + (long) this.anInt1080) {
				Static317.method3199(this.aByteArray14, (int) (this.aLong41 - this.aLong39), arg1, 0, arg0);
				this.aLong41 += arg0;
				return;
			}
			@Pc(88) long local88 = this.aLong41;
			@Pc(90) int local90 = arg0;
			@Pc(124) int local124;
			if (this.aLong38 <= this.aLong41 && (long) this.anInt1085 + this.aLong38 > this.aLong41) {
				local124 = (int) ((long) this.anInt1085 + this.aLong38 - this.aLong41);
				if (arg0 < local124) {
					local124 = arg0;
				}
				Static317.method3199(this.aByteArray13, (int) (this.aLong41 - this.aLong38), arg1, 0, local124);
				this.aLong41 += local124;
				arg0 -= local124;
				arg2 = local124;
			}
			if (arg0 > this.aByteArray13.length) {
				this.aClass68_1.method1823(this.aLong41);
				this.aLong36 = this.aLong41;
				while (arg0 > 0) {
					local124 = this.aClass68_1.method1820(arg2, arg1, arg0);
					if (local124 == -1) {
						break;
					}
					this.aLong36 += local124;
					arg0 -= local124;
					arg2 += local124;
					this.aLong41 += local124;
				}
			} else if (arg0 > 0) {
				this.method950();
				local124 = arg0;
				if (arg0 > this.anInt1085) {
					local124 = this.anInt1085;
				}
				arg0 -= local124;
				Static317.method3199(this.aByteArray13, 0, arg1, arg2, local124);
				arg2 += local124;
				this.aLong41 += local124;
			}
			if (this.aLong39 != -1L) {
				if (this.aLong39 > this.aLong41 && arg0 > 0) {
					local124 = arg2 + (int) (this.aLong39 - this.aLong41);
					if (local124 > arg0 + arg2) {
						local124 = arg0 + arg2;
					}
					while (arg2 < local124) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong41++;
					}
				}
				@Pc(319) long local319 = -1L;
				@Pc(321) long local321 = -1L;
				if ((long) this.anInt1080 + this.aLong39 > local88 && (long) this.anInt1080 + this.aLong39 <= (long) local90 + local88) {
					local321 = this.aLong39 + (long) this.anInt1080;
				} else if ((long) local90 + local88 > this.aLong39 && (long) local90 + local88 <= this.aLong39 - -((long) this.anInt1080)) {
					local321 = (long) local90 + local88;
				}
				if (local88 <= this.aLong39 && local88 + (long) local90 > this.aLong39) {
					local319 = this.aLong39;
				} else if (local88 >= this.aLong39 && this.aLong39 + (long) this.anInt1080 > local88) {
					local319 = local88;
				}
				if (local319 > -1L && local319 < local321) {
					@Pc(442) int local442 = (int) (local321 - local319);
					Static317.method3199(this.aByteArray14, (int) (local319 - this.aLong39), arg1, (int) (local319 - local88), local442);
					if (local321 > this.aLong41) {
						arg0 = (int) ((long) arg0 + this.aLong41 - local321);
						this.aLong41 = local321;
					}
				}
			}
		} catch (@Pc(480) IOException local480) {
			this.aLong36 = -1L;
			throw local480;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
	private void method950() throws IOException {
		this.anInt1085 = 0;
		if (this.aLong36 != this.aLong41) {
			this.aClass68_1.method1823(this.aLong41);
			this.aLong36 = this.aLong41;
		}
		this.aLong38 = this.aLong41;
		while (this.aByteArray13.length > this.anInt1085) {
			@Pc(51) int local51 = this.aByteArray13.length - this.anInt1085;
			if (local51 > 200000000) {
				local51 = 200000000;
			}
			@Pc(67) int local67 = this.aClass68_1.method1820(this.anInt1085, this.aByteArray13, local51);
			if (local67 == -1) {
				break;
			}
			this.aLong36 += local67;
			this.anInt1085 += local67;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
	public void method952(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method946());
		}
		this.aLong41 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[B)V")
	public void method953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong37 < (long) arg1 + this.aLong41) {
				this.aLong37 = (long) arg1 + this.aLong41;
			}
			if (this.aLong39 != -1L && (this.aLong39 > this.aLong41 || this.aLong41 > (long) this.anInt1080 + this.aLong39)) {
				this.method958();
			}
			if (this.aLong39 != -1L && (long) this.aByteArray14.length + this.aLong39 < (long) arg1 + this.aLong41) {
				@Pc(92) int local92 = (int) ((long) this.aByteArray14.length + this.aLong39 - this.aLong41);
				arg1 -= local92;
				Static317.method3199(arg2, arg0, this.aByteArray14, (int) (this.aLong41 - this.aLong39), local92);
				this.aLong41 += local92;
				this.anInt1080 = this.aByteArray14.length;
				this.method958();
				arg0 += local92;
			}
			if (this.aByteArray14.length < arg1) {
				if (this.aLong36 != this.aLong41) {
					this.aClass68_1.method1823(this.aLong41);
					this.aLong36 = this.aLong41;
				}
				this.aClass68_1.method1819(arg1, arg0, arg2);
				this.aLong36 += arg1;
				if (this.aLong40 < this.aLong36) {
					this.aLong40 = this.aLong36;
				}
				@Pc(184) long local184 = -1L;
				@Pc(186) long local186 = -1L;
				if ((long) arg1 + this.aLong41 > this.aLong38 && this.aLong41 + (long) arg1 <= this.aLong38 + (long) this.anInt1085) {
					local186 = (long) arg1 + this.aLong41;
				} else if ((long) this.anInt1085 + this.aLong38 > this.aLong41 && (long) this.anInt1085 + this.aLong38 <= (long) arg1 + this.aLong41) {
					local186 = this.aLong38 + (long) this.anInt1085;
				}
				if (this.aLong41 >= this.aLong38 && this.aLong38 + (long) this.anInt1085 > this.aLong41) {
					local184 = this.aLong41;
				} else if (this.aLong41 <= this.aLong38 && this.aLong38 < (long) arg1 + this.aLong41) {
					local184 = this.aLong38;
				}
				if (local184 > -1L && local184 < local186) {
					@Pc(321) int local321 = (int) (local186 - local184);
					Static317.method3199(arg2, (int) ((long) arg0 + local184 - this.aLong41), this.aByteArray13, (int) (local184 - this.aLong38), local321);
				}
				this.aLong41 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong39 == -1L) {
					this.aLong39 = this.aLong41;
				}
				Static317.method3199(arg2, arg0, this.aByteArray14, (int) (this.aLong41 - this.aLong39), arg1);
				this.aLong41 += arg1;
				if ((long) this.anInt1080 < this.aLong41 - this.aLong39) {
					this.anInt1080 = (int) (this.aLong41 - this.aLong39);
				}
			}
		} catch (@Pc(408) IOException local408) {
			this.aLong36 = -1L;
			throw local408;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B[B)V")
	public void method957(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method948(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V")
	private void method958() throws IOException {
		if (this.aLong39 == -1L) {
			return;
		}
		@Pc(14) long local14 = -1L;
		if (this.aLong36 != this.aLong39) {
			this.aClass68_1.method1823(this.aLong39);
			this.aLong36 = this.aLong39;
		}
		@Pc(37) long local37 = -1L;
		this.aClass68_1.method1819(this.anInt1080, 0, this.aByteArray14);
		this.aLong36 += this.anInt1080;
		if (this.aLong38 <= this.aLong39 && this.aLong39 < this.aLong38 + (long) this.anInt1085) {
			local14 = this.aLong39;
		} else if (this.aLong38 >= this.aLong39 && this.aLong38 < (long) this.anInt1080 + this.aLong39) {
			local14 = this.aLong38;
		}
		if (this.aLong38 < this.aLong39 + (long) this.anInt1080 && this.aLong39 + (long) this.anInt1080 <= this.aLong38 - -((long) this.anInt1085)) {
			local37 = (long) this.anInt1080 + this.aLong39;
		} else if (this.aLong38 + (long) this.anInt1085 > this.aLong39 && (long) this.anInt1085 + this.aLong38 <= this.aLong39 + (long) this.anInt1080) {
			local37 = this.aLong38 + (long) this.anInt1085;
		}
		if (this.aLong36 > this.aLong40) {
			this.aLong40 = this.aLong36;
		}
		if (local14 > -1L && local37 > local14) {
			@Pc(207) int local207 = (int) (local37 - local14);
			Static317.method3199(this.aByteArray14, (int) (local14 - this.aLong39), this.aByteArray13, (int) (local14 - this.aLong38), local207);
		}
		this.aLong39 = -1L;
		this.anInt1080 = 0;
	}
}
