import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class57 {

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
	private int anInt1782;

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
	private int anInt1772 = 0;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "J")
	private long aLong64 = -1L;

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "J")
	private long aLong65 = -1L;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "Lclient!dd;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!dd;II)V")
	public Class57(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass35_4 = arg0;
		this.aLong66 = this.aLong67 = arg0.method778();
		this.aByteArray9 = new byte[arg1];
		this.aLong68 = 0L;
		this.aByteArray10 = new byte[arg2];
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
	private void method1339() throws IOException {
		this.anInt1782 = 0;
		if (this.aLong69 != this.aLong68) {
			this.aClass35_4.method781(this.aLong68);
			this.aLong69 = this.aLong68;
		}
		this.aLong64 = this.aLong68;
		while (this.anInt1782 < this.aByteArray9.length) {
			@Pc(43) int local43 = this.aByteArray9.length - this.anInt1782;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(60) int local60 = this.aClass35_4.method783(local43, this.aByteArray9, this.anInt1782);
			if (local60 == -1) {
				break;
			}
			this.anInt1782 += local60;
			this.aLong69 += local60;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	private void method1341() throws IOException {
		if (this.aLong65 == -1L) {
			return;
		}
		if (this.aLong65 != this.aLong69) {
			this.aClass35_4.method781(this.aLong65);
			this.aLong69 = this.aLong65;
		}
		@Pc(36) long local36 = -1L;
		this.aClass35_4.method782(0, this.anInt1772, this.aByteArray10);
		this.aLong69 += this.anInt1772;
		if (this.aLong67 < this.aLong69) {
			this.aLong67 = this.aLong69;
		}
		if (this.aLong64 <= this.aLong65 && this.aLong65 < (long) this.anInt1782 + this.aLong64) {
			local36 = this.aLong65;
		} else if (this.aLong64 >= this.aLong65 && this.aLong64 < this.aLong65 + (long) this.anInt1772) {
			local36 = this.aLong64;
		}
		@Pc(112) long local112 = -1L;
		if ((long) this.anInt1772 + this.aLong65 > this.aLong64 && (long) this.anInt1772 + this.aLong65 <= (long) this.anInt1782 + this.aLong64) {
			local112 = (long) this.anInt1772 + this.aLong65;
		} else if ((long) this.anInt1782 + this.aLong64 > this.aLong65 && this.aLong65 + (long) this.anInt1772 >= (long) this.anInt1782 + this.aLong64) {
			local112 = (long) this.anInt1782 + this.aLong64;
		}
		if (local36 > -1L && local112 > local36) {
			@Pc(195) int local195 = (int) (local112 - local36);
			Static301.method502(this.aByteArray10, (int) (local36 - this.aLong65), this.aByteArray9, (int) (local36 - this.aLong64), local195);
		}
		this.anInt1772 = 0;
		this.aLong65 = -1L;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)Ljava/io/File;")
	private File method1342() {
		return this.aClass35_4.method780();
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([BI)V")
	public void method1343(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1350(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI[BI)V")
	public void method1344(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong68 > this.aLong66) {
				this.aLong66 = (long) arg0 + this.aLong68;
			}
			if (this.aLong65 != -1L && (this.aLong68 < this.aLong65 || (long) this.anInt1772 + this.aLong65 < this.aLong68)) {
				this.method1341();
			}
			if (this.aLong65 != -1L && this.aLong68 + (long) arg0 > (long) this.aByteArray10.length + this.aLong65) {
				@Pc(94) int local94 = (int) (this.aLong65 + (long) this.aByteArray10.length - this.aLong68);
				arg0 -= local94;
				Static301.method502(arg1, arg2, this.aByteArray10, (int) (this.aLong68 - this.aLong65), local94);
				arg2 += local94;
				this.aLong68 += local94;
				this.anInt1772 = this.aByteArray10.length;
				this.method1341();
			}
			if (this.aByteArray10.length < arg0) {
				if (this.aLong69 != this.aLong68) {
					this.aClass35_4.method781(this.aLong68);
					this.aLong69 = this.aLong68;
				}
				@Pc(157) long local157 = -1L;
				this.aClass35_4.method782(arg2, arg0, arg1);
				if (this.aLong68 + (long) arg0 > this.aLong64 && (long) arg0 + this.aLong68 <= this.aLong64 - -((long) this.anInt1782)) {
					local157 = this.aLong68 + (long) arg0;
				} else if (this.aLong68 < this.aLong64 + (long) this.anInt1782 && this.aLong64 + (long) this.anInt1782 <= (long) arg0 + this.aLong68) {
					local157 = (long) this.anInt1782 + this.aLong64;
				}
				@Pc(243) long local243 = -1L;
				if (this.aLong64 <= this.aLong68 && (long) this.anInt1782 + this.aLong64 > this.aLong68) {
					local243 = this.aLong68;
				} else if (this.aLong68 <= this.aLong64 && this.aLong64 < (long) arg0 + this.aLong68) {
					local243 = this.aLong64;
				}
				this.aLong69 += arg0;
				if (this.aLong67 < this.aLong69) {
					this.aLong67 = this.aLong69;
				}
				if (local243 > -1L && local243 < local157) {
					@Pc(329) int local329 = (int) (local157 - local243);
					Static301.method502(arg1, (int) (local243 + (long) arg2 - this.aLong68), this.aByteArray9, (int) (local243 - this.aLong64), local329);
				}
				this.aLong68 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong65 == -1L) {
					this.aLong65 = this.aLong68;
				}
				Static301.method502(arg1, arg2, this.aByteArray10, (int) (this.aLong68 - this.aLong65), arg0);
				this.aLong68 += arg0;
				if (this.aLong68 - this.aLong65 > (long) this.anInt1772) {
					this.anInt1772 = (int) (this.aLong68 - this.aLong65);
				}
			}
		} catch (@Pc(421) IOException local421) {
			this.aLong69 = -1L;
			throw local421;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(JB)V")
	public void method1347(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1342());
		}
		this.aLong68 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II[BI)V")
	public void method1350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong65 != -1L && this.aLong65 <= this.aLong68 && (long) this.anInt1772 + this.aLong65 >= (long) arg1 + this.aLong68) {
				Static301.method502(this.aByteArray10, (int) (this.aLong68 - this.aLong65), arg2, 0, arg1);
				this.aLong68 += arg1;
				return;
			}
			@Pc(86) long local86 = this.aLong68;
			@Pc(90) int local90 = arg1;
			@Pc(123) int local123;
			if (this.aLong64 <= this.aLong68 && this.aLong68 < this.aLong64 + (long) this.anInt1782) {
				local123 = (int) ((long) this.anInt1782 + this.aLong64 - this.aLong68);
				if (arg1 < local123) {
					local123 = arg1;
				}
				arg1 -= local123;
				Static301.method502(this.aByteArray9, (int) (this.aLong68 - this.aLong64), arg2, 0, local123);
				arg0 = local123;
				this.aLong68 += local123;
			}
			if (this.aByteArray9.length < arg1) {
				this.aClass35_4.method781(this.aLong68);
				this.aLong69 = this.aLong68;
				while (arg1 > 0) {
					local123 = this.aClass35_4.method783(arg1, arg2, arg0);
					if (local123 == -1) {
						break;
					}
					this.aLong68 += local123;
					this.aLong69 += local123;
					arg0 += local123;
					arg1 -= local123;
				}
			} else if (arg1 > 0) {
				this.method1339();
				local123 = arg1;
				if (this.anInt1782 < arg1) {
					local123 = this.anInt1782;
				}
				Static301.method502(this.aByteArray9, 0, arg2, arg0, local123);
				arg1 -= local123;
				arg0 += local123;
				this.aLong68 += local123;
			}
			if (this.aLong65 != -1L) {
				if (this.aLong65 > this.aLong68 && arg1 > 0) {
					local123 = (int) (this.aLong65 - this.aLong68) + arg0;
					if (local123 > arg0 + arg1) {
						local123 = arg0 + arg1;
					}
					while (arg0 < local123) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong68++;
					}
				}
				@Pc(332) long local332 = -1L;
				if (this.aLong65 >= local86 && this.aLong65 < local86 + (long) local90) {
					local332 = this.aLong65;
				} else if (local86 >= this.aLong65 && local86 < (long) this.anInt1772 + this.aLong65) {
					local332 = local86;
				}
				@Pc(374) long local374 = -1L;
				if (local86 < this.aLong65 + (long) this.anInt1772 && (long) this.anInt1772 + this.aLong65 <= (long) local90 + local86) {
					local374 = this.aLong65 + (long) this.anInt1772;
				} else if (this.aLong65 < local86 + (long) local90 && (long) this.anInt1772 + this.aLong65 >= (long) local90 + local86) {
					local374 = (long) local90 + local86;
				}
				if (local332 > -1L && local374 > local332) {
					@Pc(447) int local447 = (int) (local374 - local332);
					Static301.method502(this.aByteArray10, (int) (local332 - this.aLong65), arg2, (int) (local332 - local86), local447);
					if (this.aLong68 < local374) {
						arg1 = (int) ((long) arg1 + this.aLong68 - local374);
						this.aLong68 = local374;
					}
				}
			}
		} catch (@Pc(486) IOException local486) {
			this.aLong69 = -1L;
			throw local486;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)J")
	public long method1351() {
		return this.aLong66;
	}
}
