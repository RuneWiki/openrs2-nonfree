import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class59 {

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
	private int anInt2221;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "J")
	private long aLong83 = -1L;

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "J")
	private long aLong88 = -1L;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
	private int anInt2223 = 0;

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "Lclient!nn;")
	private Class115 aClass115_1;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!nn;II)V")
	public Class59(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass115_1 = arg0;
		this.aLong85 = this.aLong87 = arg0.method3062();
		this.aLong86 = 0L;
		this.aByteArray35 = new byte[arg1];
		this.aByteArray36 = new byte[arg2];
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)J")
	public long method1754() {
		return this.aLong85;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BJ)V")
	public void method1757(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1764());
		}
		this.aLong86 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	private void method1760() throws IOException {
		this.anInt2221 = 0;
		if (this.aLong86 != this.aLong84) {
			this.aClass115_1.method3065(this.aLong86);
			this.aLong84 = this.aLong86;
		}
		this.aLong88 = this.aLong86;
		while (this.anInt2221 < this.aByteArray35.length) {
			@Pc(48) int local48 = this.aByteArray35.length - this.anInt2221;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(63) int local63 = this.aClass115_1.method3064(local48, this.anInt2221, this.aByteArray35);
			if (local63 == -1) {
				break;
			}
			this.anInt2221 += local63;
			this.aLong84 += local63;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB[BI)V")
	public void method1761(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong83 != -1L && this.aLong83 <= this.aLong86 && (long) this.anInt2223 + this.aLong83 >= this.aLong86 - -((long) arg2)) {
				Static304.method2609(this.aByteArray36, (int) (this.aLong86 - this.aLong83), arg1, 0, arg2);
				this.aLong86 += arg2;
				return;
			}
			@Pc(89) int local89 = arg2;
			@Pc(92) long local92 = this.aLong86;
			@Pc(130) int local130;
			if (this.aLong86 >= this.aLong88 && this.aLong86 < this.aLong88 + (long) this.anInt2221) {
				local130 = (int) (this.aLong88 + (long) this.anInt2221 - this.aLong86);
				if (arg2 < local130) {
					local130 = arg2;
				}
				Static304.method2609(this.aByteArray35, (int) (this.aLong86 - this.aLong88), arg1, 0, local130);
				arg2 -= local130;
				this.aLong86 += local130;
				arg0 = local130;
			}
			if (this.aByteArray35.length < arg2) {
				this.aClass115_1.method3065(this.aLong86);
				this.aLong84 = this.aLong86;
				while (arg2 > 0) {
					local130 = this.aClass115_1.method3064(arg2, arg0, arg1);
					if (local130 == -1) {
						break;
					}
					arg0 += local130;
					arg2 -= local130;
					this.aLong86 += local130;
					this.aLong84 += local130;
				}
			} else if (arg2 > 0) {
				this.method1760();
				local130 = arg2;
				if (arg2 > this.anInt2221) {
					local130 = this.anInt2221;
				}
				arg2 -= local130;
				Static304.method2609(this.aByteArray35, 0, arg1, arg0, local130);
				this.aLong86 += local130;
				arg0 += local130;
			}
			if (this.aLong83 != -1L) {
				if (this.aLong86 < this.aLong83 && arg2 > 0) {
					local130 = (int) (this.aLong83 - this.aLong86) + arg0;
					if (local130 > arg2 + arg0) {
						local130 = arg0 + arg2;
					}
					while (arg0 < local130) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong86++;
					}
				}
				@Pc(331) long local331 = -1L;
				if ((long) this.anInt2223 + this.aLong83 > local92 && (long) this.anInt2223 + this.aLong83 <= local92 + (long) local89) {
					local331 = (long) this.anInt2223 + this.aLong83;
				} else if ((long) local89 + local92 > this.aLong83 && (long) this.anInt2223 + this.aLong83 >= (long) local89 + local92) {
					local331 = local92 + (long) local89;
				}
				@Pc(394) long local394 = -1L;
				if (this.aLong83 >= local92 && this.aLong83 < local92 + (long) local89) {
					local394 = this.aLong83;
				} else if (this.aLong83 <= local92 && local92 < (long) this.anInt2223 + this.aLong83) {
					local394 = local92;
				}
				if (local394 > -1L && local394 < local331) {
					@Pc(458) int local458 = (int) (local331 - local394);
					Static304.method2609(this.aByteArray36, (int) (local394 - this.aLong83), arg1, (int) (local394 - local92), local458);
					if (local331 > this.aLong86) {
						arg2 = (int) ((long) arg2 + this.aLong86 - local331);
						this.aLong86 = local331;
					}
				}
			}
		} catch (@Pc(495) IOException local495) {
			this.aLong84 = -1L;
			throw local495;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
	private void method1762() throws IOException {
		if (this.aLong83 == -1L) {
			return;
		}
		if (this.aLong84 != this.aLong83) {
			this.aClass115_1.method3065(this.aLong83);
			this.aLong84 = this.aLong83;
		}
		@Pc(36) long local36 = -1L;
		this.aClass115_1.method3061(0, this.anInt2223, this.aByteArray36);
		if (this.aLong88 <= this.aLong83 && (long) this.anInt2221 + this.aLong88 > this.aLong83) {
			local36 = this.aLong83;
		} else if (this.aLong88 >= this.aLong83 && this.aLong88 < this.aLong83 + (long) this.anInt2223) {
			local36 = this.aLong88;
		}
		@Pc(96) long local96 = -1L;
		this.aLong84 += this.anInt2223;
		if (this.aLong84 > this.aLong87) {
			this.aLong87 = this.aLong84;
		}
		if (this.aLong83 + (long) this.anInt2223 > this.aLong88 && this.aLong88 + (long) this.anInt2221 >= (long) this.anInt2223 + this.aLong83) {
			local96 = (long) this.anInt2223 + this.aLong83;
		} else if (this.aLong88 + (long) this.anInt2221 > this.aLong83 && this.aLong83 + (long) this.anInt2223 >= this.aLong88 + (long) this.anInt2221) {
			local96 = (long) this.anInt2221 + this.aLong88;
		}
		if (local36 > -1L && local96 > local36) {
			@Pc(203) int local203 = (int) (local96 - local36);
			Static304.method2609(this.aByteArray36, (int) (local36 - this.aLong83), this.aByteArray35, (int) (local36 - this.aLong88), local203);
		}
		this.anInt2223 = 0;
		this.aLong83 = -1L;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[B)V")
	public void method1763(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong85 < this.aLong86 + (long) arg1) {
				this.aLong85 = this.aLong86 + (long) arg1;
			}
			if (this.aLong83 != -1L && (this.aLong83 > this.aLong86 || this.aLong83 + (long) this.anInt2223 < this.aLong86)) {
				this.method1762();
			}
			if (this.aLong83 != -1L && this.aLong86 + (long) arg1 > (long) this.aByteArray36.length + this.aLong83) {
				@Pc(96) int local96 = (int) (this.aLong83 + (long) this.aByteArray36.length - this.aLong86);
				arg1 -= local96;
				Static304.method2609(arg2, arg0, this.aByteArray36, (int) (this.aLong86 - this.aLong83), local96);
				this.aLong86 += local96;
				arg0 += local96;
				this.anInt2223 = this.aByteArray36.length;
				this.method1762();
			}
			if (arg1 > this.aByteArray36.length) {
				if (this.aLong86 != this.aLong84) {
					this.aClass115_1.method3065(this.aLong86);
					this.aLong84 = this.aLong86;
				}
				this.aClass115_1.method3061(arg0, arg1, arg2);
				this.aLong84 += arg1;
				if (this.aLong84 > this.aLong87) {
					this.aLong87 = this.aLong84;
				}
				@Pc(188) long local188 = -1L;
				@Pc(190) long local190 = -1L;
				if (this.aLong88 < (long) arg1 + this.aLong86 && this.aLong86 + (long) arg1 <= (long) this.anInt2221 + this.aLong88) {
					local188 = this.aLong86 + (long) arg1;
				} else if (this.aLong88 + (long) this.anInt2221 > this.aLong86 && (long) arg1 + this.aLong86 >= this.aLong88 - -((long) this.anInt2221)) {
					local188 = (long) this.anInt2221 + this.aLong88;
				}
				if (this.aLong86 >= this.aLong88 && this.aLong86 < (long) this.anInt2221 + this.aLong88) {
					local190 = this.aLong86;
				} else if (this.aLong88 >= this.aLong86 && this.aLong88 < this.aLong86 + (long) arg1) {
					local190 = this.aLong88;
				}
				if (local190 > -1L && local188 > local190) {
					@Pc(317) int local317 = (int) (local188 - local190);
					Static304.method2609(arg2, (int) ((long) arg0 + local190 - this.aLong86), this.aByteArray35, (int) (local190 - this.aLong88), local317);
				}
				this.aLong86 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong83 == -1L) {
					this.aLong83 = this.aLong86;
				}
				Static304.method2609(arg2, arg0, this.aByteArray36, (int) (this.aLong86 - this.aLong83), arg1);
				this.aLong86 += arg1;
				if (this.aLong86 - this.aLong83 > (long) this.anInt2223) {
					this.anInt2223 = (int) (this.aLong86 - this.aLong83);
				}
			}
		} catch (@Pc(407) IOException local407) {
			this.aLong84 = -1L;
			throw local407;
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method1764() {
		return this.aClass115_1.method3063();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z[B)V")
	public void method1765(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1761(0, arg0, arg0.length);
	}
}
