import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class103 {

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
	private int anInt3137;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "J")
	private long aLong100 = -1L;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
	private int anInt3134 = 0;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "J")
	private long aLong101 = -1L;

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "Lclient!ve;")
	private final Class256 aClass256_1;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "J")
	private long aLong98;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "[B")
	private final byte[] aByteArray43;

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "[B")
	private final byte[] aByteArray44;

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!ve;II)V")
	public Class103(@OriginalArg(0) Class256 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass256_1 = arg0;
		this.aLong97 = this.aLong98 = arg0.method5389();
		this.aByteArray43 = new byte[arg2];
		this.aByteArray44 = new byte[arg1];
		this.aLong102 = 0L;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method2513() {
		return this.aClass256_1.method5390();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B[B)V")
	public void method2514(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method2521(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V")
	private void method2517() throws IOException {
		if (this.aLong100 == -1L) {
			return;
		}
		if (this.aLong100 != this.aLong99) {
			this.aClass256_1.method5386(this.aLong100);
			this.aLong99 = this.aLong100;
		}
		this.aClass256_1.method5391(this.aByteArray43, 0, this.anInt3134);
		this.aLong99 += this.anInt3134;
		if (this.aLong98 < this.aLong99) {
			this.aLong98 = this.aLong99;
		}
		@Pc(63) long local63 = -1L;
		if (this.aLong101 <= this.aLong100 && (long) this.anInt3137 + this.aLong101 > this.aLong100) {
			local63 = this.aLong100;
		} else if (this.aLong101 >= this.aLong100 && this.aLong100 + (long) this.anInt3134 > this.aLong101) {
			local63 = this.aLong101;
		}
		@Pc(109) long local109 = -1L;
		if ((long) this.anInt3134 + this.aLong100 > this.aLong101 && (long) this.anInt3137 + this.aLong101 >= (long) this.anInt3134 + this.aLong100) {
			local109 = this.aLong100 + (long) this.anInt3134;
		} else if ((long) this.anInt3137 + this.aLong101 > this.aLong100 && (long) this.anInt3134 + this.aLong100 >= (long) this.anInt3137 + this.aLong101) {
			local109 = this.aLong101 + (long) this.anInt3137;
		}
		if (local63 > -1L && local109 > local63) {
			@Pc(203) int local203 = (int) (local109 - local63);
			Static462.method4611(this.aByteArray43, (int) (local63 - this.aLong100), this.aByteArray44, (int) (local63 - this.aLong101), local203);
		}
		this.anInt3134 = 0;
		this.aLong100 = -1L;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([BZII)V")
	public void method2518(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong97 < (long) arg1 + this.aLong102) {
				this.aLong97 = (long) arg1 + this.aLong102;
			}
			if (this.aLong100 != -1L && (this.aLong100 > this.aLong102 || (long) this.anInt3134 + this.aLong100 < this.aLong102)) {
				this.method2517();
			}
			if (this.aLong100 != -1L && this.aLong100 + (long) this.aByteArray43.length < this.aLong102 + (long) arg1) {
				@Pc(91) int local91 = (int) ((long) this.aByteArray43.length + this.aLong100 - this.aLong102);
				Static462.method4611(arg0, arg2, this.aByteArray43, (int) (this.aLong102 - this.aLong100), local91);
				arg1 -= local91;
				this.aLong102 += local91;
				arg2 += local91;
				this.anInt3134 = this.aByteArray43.length;
				this.method2517();
			}
			if (this.aByteArray43.length < arg1) {
				if (this.aLong99 != this.aLong102) {
					this.aClass256_1.method5386(this.aLong102);
					this.aLong99 = this.aLong102;
				}
				this.aClass256_1.method5391(arg0, arg2, arg1);
				this.aLong99 += arg1;
				if (this.aLong99 > this.aLong98) {
					this.aLong98 = this.aLong99;
				}
				@Pc(186) long local186 = -1L;
				@Pc(188) long local188 = -1L;
				if (this.aLong101 <= this.aLong102 && this.aLong102 < this.aLong101 + (long) this.anInt3137) {
					local186 = this.aLong102;
				} else if (this.aLong102 <= this.aLong101 && this.aLong102 + (long) arg1 > this.aLong101) {
					local186 = this.aLong101;
				}
				if ((long) arg1 + this.aLong102 > this.aLong101 && this.aLong101 + (long) this.anInt3137 >= this.aLong102 - -((long) arg1)) {
					local188 = this.aLong102 + (long) arg1;
				} else if (this.aLong101 + (long) this.anInt3137 > this.aLong102 && (long) this.anInt3137 + this.aLong101 <= this.aLong102 + (long) arg1) {
					local188 = this.aLong101 + (long) this.anInt3137;
				}
				if (local186 > -1L && local188 > local186) {
					@Pc(321) int local321 = (int) (local188 - local186);
					Static462.method4611(arg0, (int) (local186 + (long) arg2 - this.aLong102), this.aByteArray44, (int) (local186 - this.aLong101), local321);
				}
				this.aLong102 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong100 == -1L) {
					this.aLong100 = this.aLong102;
				}
				Static462.method4611(arg0, arg2, this.aByteArray43, (int) (this.aLong102 - this.aLong100), arg1);
				this.aLong102 += arg1;
				if (this.aLong102 - this.aLong100 > (long) this.anInt3134) {
					this.anInt3134 = (int) (this.aLong102 - this.aLong100);
				}
			}
		} catch (@Pc(408) IOException local408) {
			this.aLong99 = -1L;
			throw local408;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IJ)V")
	public void method2519(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2513());
		}
		this.aLong102 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III[B)V")
	public void method2521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong100 != -1L && this.aLong100 <= this.aLong102 && this.aLong102 + (long) arg0 <= this.aLong100 - -((long) this.anInt3134)) {
				Static462.method4611(this.aByteArray43, (int) (this.aLong102 - this.aLong100), arg2, 0, arg0);
				this.aLong102 += arg0;
				return;
			}
			@Pc(81) long local81 = this.aLong102;
			@Pc(85) int local85 = arg0;
			@Pc(113) int local113;
			if (this.aLong102 >= this.aLong101 && this.aLong102 < (long) this.anInt3137 + this.aLong101) {
				local113 = (int) (this.aLong101 + (long) this.anInt3137 - this.aLong102);
				if (arg0 < local113) {
					local113 = arg0;
				}
				Static462.method4611(this.aByteArray44, (int) (this.aLong102 - this.aLong101), arg2, 0, local113);
				arg1 = local113;
				this.aLong102 += local113;
				arg0 -= local113;
			}
			if (arg0 > this.aByteArray44.length) {
				this.aClass256_1.method5386(this.aLong102);
				this.aLong99 = this.aLong102;
				while (arg0 > 0) {
					local113 = this.aClass256_1.method5387(arg1, arg0, arg2);
					if (local113 == -1) {
						break;
					}
					arg0 -= local113;
					arg1 += local113;
					this.aLong99 += local113;
					this.aLong102 += local113;
				}
			} else if (arg0 > 0) {
				this.method2523();
				local113 = arg0;
				if (arg0 > this.anInt3137) {
					local113 = this.anInt3137;
				}
				Static462.method4611(this.aByteArray44, 0, arg2, arg1, local113);
				arg0 -= local113;
				this.aLong102 += local113;
				arg1 += local113;
			}
			if (this.aLong100 != -1L) {
				if (this.aLong100 > this.aLong102 && arg0 > 0) {
					local113 = (int) (this.aLong100 - this.aLong102) + arg1;
					if (local113 > arg1 + arg0) {
						local113 = arg0 + arg1;
					}
					while (arg1 < local113) {
						arg2[arg1++] = 0;
						arg0--;
						this.aLong102++;
					}
				}
				@Pc(311) long local311 = -1L;
				@Pc(313) long local313 = -1L;
				if (local81 <= this.aLong100 && this.aLong100 < local81 + (long) local85) {
					local311 = this.aLong100;
				} else if (this.aLong100 <= local81 && local81 < (long) this.anInt3134 + this.aLong100) {
					local311 = local81;
				}
				if (local81 < (long) this.anInt3134 + this.aLong100 && (long) this.anInt3134 + this.aLong100 <= (long) local85 + local81) {
					local313 = this.aLong100 + (long) this.anInt3134;
				} else if (this.aLong100 < local81 + (long) local85 && this.aLong100 + (long) this.anInt3134 >= (long) local85 + local81) {
					local313 = (long) local85 + local81;
				}
				if (local311 > -1L && local311 < local313) {
					@Pc(426) int local426 = (int) (local313 - local311);
					Static462.method4611(this.aByteArray43, (int) (local311 - this.aLong100), arg2, (int) (local311 - local81), local426);
					if (local313 > this.aLong102) {
						arg0 = (int) ((long) arg0 + this.aLong102 - local313);
						this.aLong102 = local313;
					}
				}
			}
		} catch (@Pc(465) IOException local465) {
			this.aLong99 = -1L;
			throw local465;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)J")
	public long method2522() {
		return this.aLong97;
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V")
	private void method2523() throws IOException {
		this.anInt3137 = 0;
		if (this.aLong99 != this.aLong102) {
			this.aClass256_1.method5386(this.aLong102);
			this.aLong99 = this.aLong102;
		}
		this.aLong101 = this.aLong102;
		while (this.anInt3137 < this.aByteArray44.length) {
			@Pc(43) int local43 = this.aByteArray44.length - this.anInt3137;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(60) int local60 = this.aClass256_1.method5387(this.anInt3137, local43, this.aByteArray44);
			if (local60 == -1) {
				break;
			}
			this.anInt3137 += local60;
			this.aLong99 += local60;
		}
	}
}
