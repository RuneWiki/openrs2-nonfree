import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class16 {

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
	private int anInt805;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
	private int anInt807 = 0;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "J")
	private long aLong28 = -1L;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "J")
	private long aLong32 = -1L;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Lclient!pc;")
	private final Class64 aClass64_1;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!pc;II)V")
	public Class16(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass64_1 = arg0;
		this.aLong31 = this.aLong29 = arg0.method1385();
		this.aByteArray1 = new byte[arg1];
		this.aByteArray2 = new byte[arg2];
		this.aLong30 = 0L;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB[BI)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong30 + (long) arg0 > this.aLong31) {
				this.aLong31 = (long) arg0 + this.aLong30;
			}
			if (this.aLong28 != -1L && (this.aLong30 < this.aLong28 || this.aLong28 + (long) this.anInt807 < this.aLong30)) {
				this.method429();
			}
			if (this.aLong28 != -1L && (long) arg0 + this.aLong30 > (long) this.aByteArray2.length + this.aLong28) {
				@Pc(101) int local101 = (int) ((long) this.aByteArray2.length + this.aLong28 - this.aLong30);
				Static136.method700(arg1, arg2, this.aByteArray2, (int) (this.aLong30 - this.aLong28), local101);
				arg2 += local101;
				arg0 -= local101;
				this.aLong30 += local101;
				this.anInt807 = this.aByteArray2.length;
				this.method429();
			}
			if (arg0 > this.aByteArray2.length) {
				@Pc(148) long local148 = -1L;
				@Pc(150) long local150 = -1L;
				if (this.aLong27 != this.aLong30) {
					this.aClass64_1.method1382(this.aLong30);
					this.aLong27 = this.aLong30;
				}
				this.aClass64_1.method1381(arg2, arg1, arg0);
				this.aLong27 += arg0;
				if (this.aLong30 + (long) arg0 > this.aLong32 && (long) arg0 + this.aLong30 <= this.aLong32 + (long) this.anInt805) {
					local150 = this.aLong30 + (long) arg0;
				} else if (this.aLong30 < this.aLong32 + (long) this.anInt805 && (long) arg0 + this.aLong30 >= this.aLong32 - -((long) this.anInt805)) {
					local150 = this.aLong32 + (long) this.anInt805;
				}
				if (this.aLong27 > this.aLong29) {
					this.aLong29 = this.aLong27;
				}
				if (this.aLong30 >= this.aLong32 && this.aLong30 < (long) this.anInt805 + this.aLong32) {
					local148 = this.aLong30;
				} else if (this.aLong32 >= this.aLong30 && (long) arg0 + this.aLong30 > this.aLong32) {
					local148 = this.aLong32;
				}
				if (local148 > -1L && local150 > local148) {
					@Pc(330) int local330 = (int) (local150 - local148);
					Static136.method700(arg1, (int) ((long) arg2 + local148 - this.aLong30), this.aByteArray1, (int) (local148 - this.aLong32), local330);
				}
				this.aLong30 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong28 == -1L) {
					this.aLong28 = this.aLong30;
				}
				Static136.method700(arg1, arg2, this.aByteArray2, (int) (this.aLong30 - this.aLong28), arg0);
				this.aLong30 += arg0;
				if (this.aLong30 - this.aLong28 > (long) this.anInt807) {
					this.anInt807 = (int) (this.aLong30 - this.aLong28);
				}
			}
		} catch (@Pc(415) IOException local415) {
			this.aLong27 = -1L;
			throw local415;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)J")
	public long method428() {
		return this.aLong31;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	private void method429() throws IOException {
		if (this.aLong28 == -1L) {
			return;
		}
		if (this.aLong27 != this.aLong28) {
			this.aClass64_1.method1382(this.aLong28);
			this.aLong27 = this.aLong28;
		}
		this.aClass64_1.method1381(0, this.aByteArray2, this.anInt807);
		this.aLong27 += this.anInt807;
		@Pc(53) long local53 = -1L;
		if (this.aLong28 >= this.aLong32 && this.aLong28 < this.aLong32 + (long) this.anInt805) {
			local53 = this.aLong28;
		} else if (this.aLong28 <= this.aLong32 && this.aLong32 < this.aLong28 + (long) this.anInt807) {
			local53 = this.aLong32;
		}
		if (this.aLong27 > this.aLong29) {
			this.aLong29 = this.aLong27;
		}
		@Pc(118) long local118 = -1L;
		if (this.aLong32 < this.aLong28 + (long) this.anInt807 && (long) this.anInt807 + this.aLong28 <= (long) this.anInt805 + this.aLong32) {
			local118 = (long) this.anInt807 + this.aLong28;
		} else if (this.aLong28 < (long) this.anInt805 + this.aLong32 && (long) this.anInt805 + this.aLong32 <= (long) this.anInt807 + this.aLong28) {
			local118 = this.aLong32 + (long) this.anInt805;
		}
		if (local53 > -1L && local53 < local118) {
			@Pc(215) int local215 = (int) (local118 - local53);
			Static136.method700(this.aByteArray2, (int) (local53 - this.aLong28), this.aByteArray1, (int) (local53 - this.aLong32), local215);
		}
		this.anInt807 = 0;
		this.aLong28 = -1L;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
	public void method430() throws IOException {
		this.method429();
		this.aClass64_1.method1384();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
	public void method431(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method433());
		}
		this.aLong30 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([BIII)V")
	public void method432(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong28 != -1L && this.aLong30 >= this.aLong28 && this.aLong30 + (long) arg2 <= this.aLong28 - -((long) this.anInt807)) {
				Static136.method700(this.aByteArray2, (int) (this.aLong30 - this.aLong28), arg0, 0, arg2);
				this.aLong30 += arg2;
				return;
			}
			@Pc(78) long local78 = this.aLong30;
			@Pc(82) int local82 = arg2;
			@Pc(118) int local118;
			if (this.aLong30 >= this.aLong32 && (long) this.anInt805 + this.aLong32 > this.aLong30) {
				local118 = (int) ((long) this.anInt805 + this.aLong32 - this.aLong30);
				if (arg2 < local118) {
					local118 = arg2;
				}
				arg2 -= local118;
				Static136.method700(this.aByteArray1, (int) (this.aLong30 - this.aLong32), arg0, 0, local118);
				this.aLong30 += local118;
				arg1 = local118;
			}
			if (this.aByteArray1.length < arg2) {
				this.aClass64_1.method1382(this.aLong30);
				this.aLong27 = this.aLong30;
				while (arg2 > 0) {
					local118 = this.aClass64_1.method1383(arg0, arg2, arg1);
					if (local118 == -1) {
						break;
					}
					arg2 -= local118;
					arg1 += local118;
					this.aLong27 += local118;
					this.aLong30 += local118;
				}
			} else if (arg2 > 0) {
				this.method435();
				local118 = arg2;
				if (arg2 > this.anInt805) {
					local118 = this.anInt805;
				}
				arg2 -= local118;
				Static136.method700(this.aByteArray1, 0, arg0, arg1, local118);
				this.aLong30 += local118;
				arg1 += local118;
			}
			if (this.aLong28 != -1L) {
				if (this.aLong28 > this.aLong30 && arg2 > 0) {
					local118 = (int) (this.aLong28 - this.aLong30) + arg1;
					if (local118 > arg2 + arg1) {
						local118 = arg2 + arg1;
					}
					while (arg1 < local118) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong30++;
					}
				}
				@Pc(319) long local319 = -1L;
				@Pc(321) long local321 = -1L;
				if ((long) this.anInt807 + this.aLong28 > local78 && local78 + (long) local82 >= this.aLong28 - -((long) this.anInt807)) {
					local321 = this.aLong28 + (long) this.anInt807;
				} else if (this.aLong28 < local78 + (long) local82 && local78 + (long) local82 <= (long) this.anInt807 + this.aLong28) {
					local321 = local78 + (long) local82;
				}
				if (this.aLong28 >= local78 && this.aLong28 < (long) local82 + local78) {
					local319 = this.aLong28;
				} else if (local78 >= this.aLong28 && this.aLong28 + (long) this.anInt807 > local78) {
					local319 = local78;
				}
				if (local319 > -1L && local319 < local321) {
					@Pc(445) int local445 = (int) (local321 - local319);
					Static136.method700(this.aByteArray2, (int) (local319 - this.aLong28), arg0, (int) (local319 - local78), local445);
					if (local321 > this.aLong30) {
						arg2 = (int) ((long) arg2 + this.aLong30 - local321);
						this.aLong30 = local321;
					}
				}
			}
		} catch (@Pc(486) IOException local486) {
			this.aLong27 = -1L;
			throw local486;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)Ljava/io/File;")
	private File method433() {
		return this.aClass64_1.method1386();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([BB)V")
	public void method434(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method432(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	private void method435() throws IOException {
		this.anInt805 = 0;
		if (this.aLong27 != this.aLong30) {
			this.aClass64_1.method1382(this.aLong30);
			this.aLong27 = this.aLong30;
		}
		this.aLong32 = this.aLong30;
		while (this.anInt805 < this.aByteArray1.length) {
			@Pc(54) int local54 = this.aClass64_1.method1383(this.aByteArray1, this.aByteArray1.length - this.anInt805, this.anInt805);
			if (local54 == -1) {
				break;
			}
			this.anInt805 += local54;
			this.aLong27 += local54;
		}
	}
}
