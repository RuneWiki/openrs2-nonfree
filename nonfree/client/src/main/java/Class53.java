import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class53 {

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	private int anInt2297;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "J")
	private long aLong61 = -1L;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
	private int anInt2300 = 0;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "J")
	private long aLong65 = -1L;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "Lclient!sa;")
	private final Class58 aClass58_3;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "[B")
	private final byte[] aByteArray21;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!sa;II)V")
	public Class53(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass58_3 = arg0;
		this.aLong62 = this.aLong63 = arg0.method1708();
		this.aByteArray20 = new byte[arg2];
		this.aByteArray21 = new byte[arg1];
		this.aLong66 = 0L;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BII)V")
	public void method1623(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong65 != -1L && this.aLong65 <= this.aLong66 && this.aLong66 + (long) arg2 <= (long) this.anInt2300 + this.aLong65) {
				Static114.method1154(this.aByteArray20, (int) (this.aLong66 - this.aLong65), arg1, 0, arg2);
				this.aLong66 += arg2;
				return;
			}
			@Pc(83) long local83 = this.aLong66;
			@Pc(85) int local85 = arg2;
			@Pc(126) int local126;
			if (this.aLong66 >= this.aLong61 && this.aLong61 + (long) this.anInt2297 > this.aLong66) {
				local126 = (int) (this.aLong61 + (long) this.anInt2297 - this.aLong66);
				if (local126 > arg2) {
					local126 = arg2;
				}
				arg2 -= local126;
				Static114.method1154(this.aByteArray21, (int) (this.aLong66 - this.aLong61), arg1, 0, local126);
				this.aLong66 += local126;
				arg0 = local126;
			}
			if (arg2 > this.aByteArray21.length) {
				this.aClass58_3.method1712(this.aLong66);
				this.aLong64 = this.aLong66;
				while (arg2 > 0) {
					local126 = this.aClass58_3.method1710(arg1, arg0, arg2);
					if (local126 == -1) {
						break;
					}
					arg0 += local126;
					arg2 -= local126;
					this.aLong64 += local126;
					this.aLong66 += local126;
				}
			} else if (arg2 > 0) {
				local126 = arg2;
				this.method1627();
				if (arg2 > this.anInt2297) {
					local126 = this.anInt2297;
				}
				Static114.method1154(this.aByteArray21, 0, arg1, arg0, local126);
				this.aLong66 += local126;
				arg2 -= local126;
				arg0 += local126;
			}
			if (this.aLong65 != -1L) {
				if (this.aLong66 < this.aLong65 && arg2 > 0) {
					local126 = arg0 + (int) (this.aLong65 - this.aLong66);
					if (arg0 + arg2 < local126) {
						local126 = arg0 + arg2;
					}
					while (arg0 < local126) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong66++;
					}
				}
				@Pc(318) long local318 = -1L;
				@Pc(320) long local320 = -1L;
				if (this.aLong65 >= local83 && this.aLong65 < (long) local85 + local83) {
					local320 = this.aLong65;
				} else if (this.aLong65 <= local83 && local83 < (long) this.anInt2300 + this.aLong65) {
					local320 = local83;
				}
				if (this.aLong65 + (long) this.anInt2300 > local83 && this.aLong65 + (long) this.anInt2300 <= (long) local85 + local83) {
					local318 = this.aLong65 + (long) this.anInt2300;
				} else if (local83 + (long) local85 > this.aLong65 && this.aLong65 + (long) this.anInt2300 >= (long) local85 + local83) {
					local318 = local83 + (long) local85;
				}
				if (local320 > -1L && local318 > local320) {
					@Pc(442) int local442 = (int) (local318 - local320);
					Static114.method1154(this.aByteArray20, (int) (local320 - this.aLong65), arg1, (int) (local320 - local83), local442);
					if (local318 > this.aLong66) {
						arg2 = (int) ((long) arg2 + this.aLong66 - local318);
						this.aLong66 = local318;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong64 = -1L;
			throw local479;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public void method1624() throws IOException {
		this.method1628();
		this.aClass58_3.method1709();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J")
	public long method1625() {
		return this.aLong62;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	private void method1627() throws IOException {
		this.anInt2297 = 0;
		if (this.aLong66 != this.aLong64) {
			this.aClass58_3.method1712(this.aLong66);
			this.aLong64 = this.aLong66;
		}
		this.aLong61 = this.aLong66;
		while (this.anInt2297 < this.aByteArray21.length) {
			@Pc(57) int local57 = this.aClass58_3.method1710(this.aByteArray21, this.anInt2297, this.aByteArray21.length - this.anInt2297);
			if (local57 == -1) {
				break;
			}
			this.anInt2297 += local57;
			this.aLong64 += local57;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	private void method1628() throws IOException {
		if (this.aLong65 == -1L) {
			return;
		}
		if (this.aLong65 != this.aLong64) {
			this.aClass58_3.method1712(this.aLong65);
			this.aLong64 = this.aLong65;
		}
		this.aClass58_3.method1713(0, this.aByteArray20, this.anInt2300);
		@Pc(47) long local47 = -1L;
		if (this.aLong65 + (long) this.anInt2300 > this.aLong61 && (long) this.anInt2297 + this.aLong61 >= this.aLong65 + (long) this.anInt2300) {
			local47 = (long) this.anInt2300 + this.aLong65;
		} else if ((long) this.anInt2297 + this.aLong61 > this.aLong65 && this.aLong65 + (long) this.anInt2300 >= (long) this.anInt2297 + this.aLong61) {
			local47 = this.aLong61 + (long) this.anInt2297;
		}
		@Pc(126) long local126 = -1L;
		if (this.aLong61 <= this.aLong65 && this.aLong65 < (long) this.anInt2297 + this.aLong61) {
			local126 = this.aLong65;
		} else if (this.aLong65 <= this.aLong61 && (long) this.anInt2300 + this.aLong65 > this.aLong61) {
			local126 = this.aLong61;
		}
		this.aLong64 += this.anInt2300;
		if (this.aLong64 > this.aLong63) {
			this.aLong63 = this.aLong64;
		}
		if (local126 > -1L && local126 < local47) {
			@Pc(213) int local213 = (int) (local47 - local126);
			Static114.method1154(this.aByteArray20, (int) (local126 - this.aLong65), this.aByteArray21, (int) (local126 - this.aLong61), local213);
		}
		this.anInt2300 = 0;
		this.aLong65 = -1L;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)V")
	public void method1630(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong66 = arg0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[BI)V")
	public void method1631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong66 + (long) arg0 > this.aLong62) {
				this.aLong62 = (long) arg0 + this.aLong66;
			}
			if (this.aLong65 != -1L && (this.aLong65 > this.aLong66 || this.aLong66 > this.aLong65 + (long) this.anInt2300)) {
				this.method1628();
			}
			if (this.aLong65 != -1L && this.aLong66 + (long) arg0 > (long) this.aByteArray20.length + this.aLong65) {
				@Pc(103) int local103 = (int) ((long) this.aByteArray20.length + this.aLong65 - this.aLong66);
				Static114.method1154(arg2, arg1, this.aByteArray20, (int) (this.aLong66 - this.aLong65), local103);
				arg1 += local103;
				this.aLong66 += local103;
				arg0 -= local103;
				this.anInt2300 = this.aByteArray20.length;
				this.method1628();
			}
			if (arg0 > this.aByteArray20.length) {
				@Pc(150) long local150 = -1L;
				@Pc(152) long local152 = -1L;
				if (this.aLong64 != this.aLong66) {
					this.aClass58_3.method1712(this.aLong66);
					this.aLong64 = this.aLong66;
				}
				this.aClass58_3.method1713(arg1, arg2, arg0);
				this.aLong64 += arg0;
				if (this.aLong64 > this.aLong63) {
					this.aLong63 = this.aLong64;
				}
				if (this.aLong61 <= this.aLong66 && this.aLong66 < (long) this.anInt2297 + this.aLong61) {
					local150 = this.aLong66;
				} else if (this.aLong61 >= this.aLong66 && this.aLong61 < (long) arg0 + this.aLong66) {
					local150 = this.aLong61;
				}
				if (this.aLong61 < (long) arg0 + this.aLong66 && this.aLong61 + (long) this.anInt2297 >= (long) arg0 + this.aLong66) {
					local152 = this.aLong66 + (long) arg0;
				} else if ((long) this.anInt2297 + this.aLong61 > this.aLong66 && this.aLong66 + (long) arg0 >= (long) this.anInt2297 + this.aLong61) {
					local152 = (long) this.anInt2297 + this.aLong61;
				}
				if (local150 > -1L && local150 < local152) {
					@Pc(328) int local328 = (int) (local152 - local150);
					Static114.method1154(arg2, (int) ((long) arg1 + local150 - this.aLong66), this.aByteArray21, (int) (local150 - this.aLong61), local328);
				}
				this.aLong66 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong65 == -1L) {
					this.aLong65 = this.aLong66;
				}
				Static114.method1154(arg2, arg1, this.aByteArray20, (int) (this.aLong66 - this.aLong65), arg0);
				this.aLong66 += arg0;
				if ((long) this.anInt2300 < this.aLong66 - this.aLong65) {
					this.anInt2300 = (int) (this.aLong66 - this.aLong65);
				}
			}
		} catch (@Pc(413) IOException local413) {
			this.aLong64 = -1L;
			throw local413;
		}
	}
}
