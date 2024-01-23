import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class193 {

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "[J")
	public static long[] aLongArray10 = new long[256];

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
	private int anInt6213;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "J")
	private long aLong241;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	private int anInt6212 = 0;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "J")
	private long aLong242 = -1L;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "J")
	private long aLong245 = -1L;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "Lclient!af;")
	private Class5 aClass5_4;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "J")
	private long aLong240;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "J")
	private long aLong244;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "J")
	private long aLong243;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "[B")
	private byte[] aByteArray75;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(12) long local12 = (long) local4;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 0x1;
				}
			}
			aLongArray10[local4] = local12;
		}
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!af;II)V")
	public Class193(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass5_4 = arg0;
		this.aLong244 = this.aLong240 = arg0.method208();
		this.aLong243 = 0L;
		this.aByteArray76 = new byte[arg2];
		this.aByteArray75 = new byte[arg1];
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method4695() {
		return this.aClass5_4.method207();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([BB)V")
	public void method4696(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4701(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(JB)V")
	public void method4697(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4695());
		}
		this.aLong243 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI[BI)V")
	public void method4699(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong244 < (long) arg2 + this.aLong243) {
				this.aLong244 = this.aLong243 + (long) arg2;
			}
			if (this.aLong245 != -1L && (this.aLong243 < this.aLong245 || (long) this.anInt6212 + this.aLong245 < this.aLong243)) {
				this.method4703();
			}
			if (this.aLong245 != -1L && this.aLong245 + (long) this.aByteArray76.length < (long) arg2 + this.aLong243) {
				@Pc(97) int local97 = (int) (this.aLong245 + (long) this.aByteArray76.length - this.aLong243);
				Static319.method1419(arg1, arg0, this.aByteArray76, (int) (this.aLong243 - this.aLong245), local97);
				arg2 -= local97;
				arg0 += local97;
				this.aLong243 += local97;
				this.anInt6212 = this.aByteArray76.length;
				this.method4703();
			}
			if (this.aByteArray76.length < arg2) {
				if (this.aLong243 != this.aLong241) {
					this.aClass5_4.method210(this.aLong243);
					this.aLong241 = this.aLong243;
				}
				this.aClass5_4.method212(arg2, arg1, arg0);
				@Pc(169) long local169 = -1L;
				this.aLong241 += arg2;
				@Pc(178) long local178 = -1L;
				if (this.aLong243 >= this.aLong242 && (long) this.anInt6213 + this.aLong242 > this.aLong243) {
					local169 = this.aLong243;
				} else if (this.aLong243 <= this.aLong242 && this.aLong242 < (long) arg2 + this.aLong243) {
					local169 = this.aLong242;
				}
				if ((long) arg2 + this.aLong243 > this.aLong242 && (long) arg2 + this.aLong243 <= (long) this.anInt6213 + this.aLong242) {
					local178 = (long) arg2 + this.aLong243;
				} else if ((long) this.anInt6213 + this.aLong242 > this.aLong243 && this.aLong242 + (long) this.anInt6213 <= this.aLong243 - -((long) arg2)) {
					local178 = this.aLong242 + (long) this.anInt6213;
				}
				if (this.aLong240 < this.aLong241) {
					this.aLong240 = this.aLong241;
				}
				if (local169 > -1L && local169 < local178) {
					@Pc(317) int local317 = (int) (local178 - local169);
					Static319.method1419(arg1, (int) (local169 + (long) arg0 - this.aLong243), this.aByteArray75, (int) (local169 - this.aLong242), local317);
				}
				this.aLong243 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong245 == -1L) {
					this.aLong245 = this.aLong243;
				}
				Static319.method1419(arg1, arg0, this.aByteArray76, (int) (this.aLong243 - this.aLong245), arg2);
				this.aLong243 += arg2;
				if ((long) this.anInt6212 < this.aLong243 - this.aLong245) {
					this.anInt6212 = (int) (this.aLong243 - this.aLong245);
				}
			}
		} catch (@Pc(403) IOException local403) {
			this.aLong241 = -1L;
			throw local403;
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)J")
	public long method4700() {
		return this.aLong244;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[BII)V")
	public void method4701(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong245 != -1L && this.aLong243 >= this.aLong245 && (long) arg1 + this.aLong243 <= (long) this.anInt6212 + this.aLong245) {
				Static319.method1419(this.aByteArray76, (int) (this.aLong243 - this.aLong245), arg0, 0, arg1);
				this.aLong243 += arg1;
				return;
			}
			@Pc(84) long local84 = this.aLong243;
			@Pc(88) int local88 = arg1;
			@Pc(116) int local116;
			if (this.aLong243 >= this.aLong242 && this.aLong243 < this.aLong242 + (long) this.anInt6213) {
				local116 = (int) (this.aLong242 + (long) this.anInt6213 - this.aLong243);
				if (arg1 < local116) {
					local116 = arg1;
				}
				Static319.method1419(this.aByteArray75, (int) (this.aLong243 - this.aLong242), arg0, 0, local116);
				arg1 -= local116;
				this.aLong243 += local116;
				arg2 = local116;
			}
			if (this.aByteArray75.length < arg1) {
				this.aClass5_4.method210(this.aLong243);
				this.aLong241 = this.aLong243;
				while (arg1 > 0) {
					local116 = this.aClass5_4.method211(arg0, arg2, arg1);
					if (local116 == -1) {
						break;
					}
					this.aLong241 += local116;
					arg2 += local116;
					this.aLong243 += local116;
					arg1 -= local116;
				}
			} else if (arg1 > 0) {
				local116 = arg1;
				this.method4702();
				if (this.anInt6213 < arg1) {
					local116 = this.anInt6213;
				}
				Static319.method1419(this.aByteArray75, 0, arg0, arg2, local116);
				this.aLong243 += local116;
				arg1 -= local116;
				arg2 += local116;
			}
			if (this.aLong245 != -1L) {
				if (this.aLong243 < this.aLong245 && arg1 > 0) {
					local116 = (int) (this.aLong245 - this.aLong243) + arg2;
					if (local116 > arg1 + arg2) {
						local116 = arg1 + arg2;
					}
					while (local116 > arg2) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong243++;
					}
				}
				@Pc(312) long local312 = -1L;
				@Pc(314) long local314 = -1L;
				if (local84 < (long) this.anInt6212 + this.aLong245 && (long) local88 + local84 >= (long) this.anInt6212 + this.aLong245) {
					local314 = (long) this.anInt6212 + this.aLong245;
				} else if (this.aLong245 < (long) local88 + local84 && local84 + (long) local88 <= this.aLong245 - -((long) this.anInt6212)) {
					local314 = local84 + (long) local88;
				}
				if (local84 <= this.aLong245 && this.aLong245 < local84 + (long) local88) {
					local312 = this.aLong245;
				} else if (local84 >= this.aLong245 && this.aLong245 + (long) this.anInt6212 > local84) {
					local312 = local84;
				}
				if (local312 > -1L && local312 < local314) {
					@Pc(438) int local438 = (int) (local314 - local312);
					Static319.method1419(this.aByteArray76, (int) (local312 - this.aLong245), arg0, (int) (local312 - local84), local438);
					if (local314 > this.aLong243) {
						arg1 = (int) ((long) arg1 + this.aLong243 - local314);
						this.aLong243 = local314;
					}
				}
			}
		} catch (@Pc(480) IOException local480) {
			this.aLong241 = -1L;
			throw local480;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
	private void method4702() throws IOException {
		this.anInt6213 = 0;
		if (this.aLong243 != this.aLong241) {
			this.aClass5_4.method210(this.aLong243);
			this.aLong241 = this.aLong243;
		}
		this.aLong242 = this.aLong243;
		while (this.aByteArray75.length > this.anInt6213) {
			@Pc(50) int local50 = this.aByteArray75.length - this.anInt6213;
			if (local50 > 200000000) {
				local50 = 200000000;
			}
			@Pc(65) int local65 = this.aClass5_4.method211(this.aByteArray75, this.anInt6213, local50);
			if (local65 == -1) {
				break;
			}
			this.aLong241 += local65;
			this.anInt6213 += local65;
		}
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
	private void method4703() throws IOException {
		if (this.aLong245 == -1L) {
			return;
		}
		if (this.aLong241 != this.aLong245) {
			this.aClass5_4.method210(this.aLong245);
			this.aLong241 = this.aLong245;
		}
		this.aClass5_4.method212(this.anInt6212, this.aByteArray76, 0);
		this.aLong241 += this.anInt6212;
		@Pc(42) long local42 = -1L;
		if (this.aLong241 > this.aLong240) {
			this.aLong240 = this.aLong241;
		}
		@Pc(54) long local54 = -1L;
		if (this.aLong242 < (long) this.anInt6212 + this.aLong245 && (long) this.anInt6213 + this.aLong242 >= (long) this.anInt6212 + this.aLong245) {
			local42 = (long) this.anInt6212 + this.aLong245;
		} else if (this.aLong245 < (long) this.anInt6213 + this.aLong242 && this.aLong242 + (long) this.anInt6213 <= (long) this.anInt6212 + this.aLong245) {
			local42 = this.aLong242 + (long) this.anInt6213;
		}
		if (this.aLong245 >= this.aLong242 && (long) this.anInt6213 + this.aLong242 > this.aLong245) {
			local54 = this.aLong245;
		} else if (this.aLong242 >= this.aLong245 && this.aLong242 < (long) this.anInt6212 + this.aLong245) {
			local54 = this.aLong242;
		}
		if (local54 > -1L && local54 < local42) {
			@Pc(185) int local185 = (int) (local42 - local54);
			Static319.method1419(this.aByteArray76, (int) (local54 - this.aLong245), this.aByteArray75, (int) (local54 - this.aLong242), local185);
		}
		this.aLong245 = -1L;
		this.anInt6212 = 0;
	}
}
