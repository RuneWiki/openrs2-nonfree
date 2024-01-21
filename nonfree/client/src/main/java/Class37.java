import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class37 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
	private int anInt1433;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	private int anInt1428 = 0;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "J")
	private long aLong64 = -1L;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "J")
	private long aLong68 = -1L;

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "Lclient!sa;")
	private final Class77 aClass77_1;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "[B")
	private final byte[] aByteArray19;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!sa;II)V")
	public Class37(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass77_1 = arg0;
		this.aLong67 = this.aLong65 = arg0.method2437();
		this.aByteArray20 = new byte[arg1];
		this.aByteArray19 = new byte[arg2];
		this.aLong66 = 0L;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	private void method1147() throws IOException {
		this.anInt1433 = 0;
		if (this.aLong66 != this.aLong63) {
			this.aClass77_1.method2435(this.aLong66);
			this.aLong63 = this.aLong66;
		}
		this.aLong68 = this.aLong66;
		while (this.aByteArray20.length > this.anInt1433) {
			@Pc(52) int local52 = this.aClass77_1.method2434(this.aByteArray20.length - this.anInt1433, this.aByteArray20, this.anInt1433);
			if (local52 == -1) {
				break;
			}
			this.aLong63 += local52;
			this.anInt1433 += local52;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III[B)V")
	public void method1149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong64 != -1L && this.aLong66 >= this.aLong64 && (long) this.anInt1428 + this.aLong64 >= this.aLong66 - -((long) arg1)) {
				Static191.method1826(this.aByteArray19, (int) (this.aLong66 - this.aLong64), arg2, 0, arg1);
				this.aLong66 += arg1;
				return;
			}
			@Pc(85) long local85 = this.aLong66;
			@Pc(89) int local89 = arg1;
			@Pc(118) int local118;
			if (this.aLong66 >= this.aLong68 && this.aLong68 + (long) this.anInt1433 > this.aLong66) {
				local118 = (int) ((long) this.anInt1433 + this.aLong68 - this.aLong66);
				if (arg1 < local118) {
					local118 = arg1;
				}
				arg1 -= local118;
				Static191.method1826(this.aByteArray20, (int) (this.aLong66 - this.aLong68), arg2, 0, local118);
				arg0 = local118;
				this.aLong66 += local118;
			}
			if (this.aByteArray20.length < arg1) {
				this.aClass77_1.method2435(this.aLong66);
				this.aLong63 = this.aLong66;
				while (arg1 > 0) {
					local118 = this.aClass77_1.method2434(arg1, arg2, arg0);
					if (local118 == -1) {
						break;
					}
					arg0 += local118;
					this.aLong66 += local118;
					arg1 -= local118;
					this.aLong63 += local118;
				}
			} else if (arg1 > 0) {
				this.method1147();
				local118 = arg1;
				if (this.anInt1433 < arg1) {
					local118 = this.anInt1433;
				}
				arg1 -= local118;
				Static191.method1826(this.aByteArray20, 0, arg2, arg0, local118);
				arg0 += local118;
				this.aLong66 += local118;
			}
			if (this.aLong64 != -1L) {
				if (this.aLong66 < this.aLong64 && arg1 > 0) {
					local118 = (int) (this.aLong64 - this.aLong66) + arg0;
					if (arg0 + arg1 < local118) {
						local118 = arg1 + arg0;
					}
					while (arg0 < local118) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong66++;
					}
				}
				@Pc(308) long local308 = -1L;
				if (this.aLong64 >= local85 && this.aLong64 < (long) local89 + local85) {
					local308 = this.aLong64;
				} else if (local85 >= this.aLong64 && (long) this.anInt1428 + this.aLong64 > local85) {
					local308 = local85;
				}
				@Pc(352) long local352 = -1L;
				if (this.aLong64 + (long) this.anInt1428 > local85 && local85 + (long) local89 >= (long) this.anInt1428 + this.aLong64) {
					local352 = (long) this.anInt1428 + this.aLong64;
				} else if (this.aLong64 < local85 + (long) local89 && this.aLong64 + (long) this.anInt1428 >= local85 - -((long) local89)) {
					local352 = local85 + (long) local89;
				}
				if (local308 > -1L && local352 > local308) {
					@Pc(446) int local446 = (int) (local352 - local308);
					Static191.method1826(this.aByteArray19, (int) (local308 - this.aLong64), arg2, (int) (local308 - local85), local446);
					if (this.aLong66 < local352) {
						arg1 = (int) ((long) arg1 + this.aLong66 - local352);
						this.aLong66 = local352;
					}
				}
			}
		} catch (@Pc(490) IOException local490) {
			this.aLong63 = -1L;
			throw local490;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public void method1150() throws IOException {
		this.method1160();
		this.aClass77_1.method2432();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([BZ)V")
	public void method1152(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1149(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)Ljava/io/File;")
	private File method1153() {
		return this.aClass77_1.method2436();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([BIBI)V")
	public void method1155(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong66 + (long) arg2 > this.aLong67) {
				this.aLong67 = (long) arg2 + this.aLong66;
			}
			if (this.aLong64 != -1L && (this.aLong64 > this.aLong66 || this.aLong66 > (long) this.anInt1428 + this.aLong64)) {
				this.method1160();
			}
			if (this.aLong64 != -1L && this.aLong64 + (long) this.aByteArray19.length < this.aLong66 - -((long) arg2)) {
				@Pc(93) int local93 = (int) (this.aLong64 + (long) this.aByteArray19.length - this.aLong66);
				Static191.method1826(arg0, arg1, this.aByteArray19, (int) (this.aLong66 - this.aLong64), local93);
				arg2 -= local93;
				arg1 += local93;
				this.aLong66 += local93;
				this.anInt1428 = this.aByteArray19.length;
				this.method1160();
			}
			if (this.aByteArray19.length < arg2) {
				@Pc(140) long local140 = -1L;
				@Pc(142) long local142 = -1L;
				if (this.aLong63 != this.aLong66) {
					this.aClass77_1.method2435(this.aLong66);
					this.aLong63 = this.aLong66;
				}
				this.aClass77_1.method2433(arg0, arg1, arg2);
				if (this.aLong68 < (long) arg2 + this.aLong66 && this.aLong68 + (long) this.anInt1433 >= this.aLong66 + (long) arg2) {
					local142 = this.aLong66 + (long) arg2;
				} else if (this.aLong68 + (long) this.anInt1433 > this.aLong66 && this.aLong66 + (long) arg2 >= this.aLong68 + (long) this.anInt1433) {
					local142 = (long) this.anInt1433 + this.aLong68;
				}
				this.aLong63 += arg2;
				if (this.aLong68 <= this.aLong66 && this.aLong66 < this.aLong68 + (long) this.anInt1433) {
					local140 = this.aLong66;
				} else if (this.aLong66 <= this.aLong68 && this.aLong68 < this.aLong66 + (long) arg2) {
					local140 = this.aLong68;
				}
				if (this.aLong63 > this.aLong65) {
					this.aLong65 = this.aLong63;
				}
				if (local140 > -1L && local142 > local140) {
					@Pc(311) int local311 = (int) (local142 - local140);
					Static191.method1826(arg0, (int) ((long) arg1 + local140 - this.aLong66), this.aByteArray20, (int) (local140 - this.aLong68), local311);
				}
				this.aLong66 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong64 == -1L) {
					this.aLong64 = this.aLong66;
				}
				Static191.method1826(arg0, arg1, this.aByteArray19, (int) (this.aLong66 - this.aLong64), arg2);
				this.aLong66 += arg2;
				if ((long) this.anInt1428 < this.aLong66 - this.aLong64) {
					this.anInt1428 = (int) (this.aLong66 - this.aLong64);
				}
			}
		} catch (@Pc(402) IOException local402) {
			this.aLong63 = -1L;
			throw local402;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)J")
	public long method1157() {
		return this.aLong67;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(JZ)V")
	public void method1158(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1153());
		}
		this.aLong66 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(B)V")
	private void method1160() throws IOException {
		if (this.aLong64 == -1L) {
			return;
		}
		@Pc(14) long local14 = -1L;
		@Pc(16) long local16 = -1L;
		if (this.aLong63 != this.aLong64) {
			this.aClass77_1.method2435(this.aLong64);
			this.aLong63 = this.aLong64;
		}
		this.aClass77_1.method2433(this.aByteArray19, 0, this.anInt1428);
		if (this.aLong68 < this.aLong64 + (long) this.anInt1428 && (long) this.anInt1433 + this.aLong68 >= this.aLong64 - -((long) this.anInt1428)) {
			local14 = this.aLong64 + (long) this.anInt1428;
		} else if ((long) this.anInt1433 + this.aLong68 > this.aLong64 && this.aLong68 + (long) this.anInt1433 <= this.aLong64 + (long) this.anInt1428) {
			local14 = this.aLong68 + (long) this.anInt1433;
		}
		if (this.aLong68 <= this.aLong64 && this.aLong64 < (long) this.anInt1433 + this.aLong68) {
			local16 = this.aLong64;
		} else if (this.aLong64 <= this.aLong68 && (long) this.anInt1428 + this.aLong64 > this.aLong68) {
			local16 = this.aLong68;
		}
		this.aLong63 += this.anInt1428;
		if (this.aLong63 > this.aLong65) {
			this.aLong65 = this.aLong63;
		}
		if (local16 > -1L && local14 > local16) {
			@Pc(199) int local199 = (int) (local14 - local16);
			Static191.method1826(this.aByteArray19, (int) (local16 - this.aLong64), this.aByteArray20, (int) (local16 - this.aLong68), local199);
		}
		this.aLong64 = -1L;
		this.anInt1428 = 0;
	}
}
