import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cka")
public final class Class62 {

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "I")
	private int anInt1184;

	@OriginalMember(owner = "client!cka", name = "q", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!cka", name = "o", descriptor = "J")
	private long aLong49 = -1L;

	@OriginalMember(owner = "client!cka", name = "n", descriptor = "J")
	private long aLong51 = -1L;

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
	private int anInt1192 = 0;

	@OriginalMember(owner = "client!cka", name = "r", descriptor = "Lclient!lm;")
	private final Class223 aClass223_1;

	@OriginalMember(owner = "client!cka", name = "e", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!cka", name = "j", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "[B")
	private final byte[] aByteArray18;

	@OriginalMember(owner = "client!cka", name = "t", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!cka", name = "h", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lclient!lm;II)V")
	public Class62(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass223_1 = arg0;
		this.aLong47 = this.aLong48 = arg0.method5090();
		this.aByteArray18 = new byte[arg1];
		this.aByteArray17 = new byte[arg2];
		this.aLong50 = 0L;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method1155() {
		return this.aClass223_1.method5088();
	}

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "(B)V")
	public void method1156() throws IOException {
		this.method1164();
		this.aClass223_1.method5092();
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "([BI)V")
	public void method1158(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1162(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)J")
	public long method1159() {
		return this.aLong47;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IJ)V")
	public void method1160(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1155());
		}
		this.aLong50 = arg0;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(III[B)V")
	public void method1161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong47 < (long) arg1 + this.aLong50) {
				this.aLong47 = (long) arg1 + this.aLong50;
			}
			if (this.aLong51 != -1L && (this.aLong50 < this.aLong51 || this.aLong51 + (long) this.anInt1192 < this.aLong50)) {
				this.method1164();
			}
			if (this.aLong51 != -1L && (long) this.aByteArray17.length + this.aLong51 < this.aLong50 + (long) arg1) {
				@Pc(88) int local88 = (int) ((long) this.aByteArray17.length + this.aLong51 - this.aLong50);
				Static693.method8320(arg2, arg0, this.aByteArray17, (int) (this.aLong50 - this.aLong51), local88);
				arg0 += local88;
				this.aLong50 += (long) local88;
				arg1 -= local88;
				this.anInt1192 = this.aByteArray17.length;
				this.method1164();
			}
			if (this.aByteArray17.length < arg1) {
				if (this.aLong50 != this.aLong52) {
					this.aClass223_1.method5089(this.aLong50);
					this.aLong52 = this.aLong50;
				}
				this.aClass223_1.method5093(arg1, arg0, arg2);
				this.aLong52 += (long) arg1;
				if (this.aLong48 < this.aLong52) {
					this.aLong48 = this.aLong52;
				}
				@Pc(188) long local188 = -1L;
				if (this.aLong50 >= this.aLong49 && this.aLong50 < (long) this.anInt1184 + this.aLong49) {
					local188 = this.aLong50;
				} else if (this.aLong50 <= this.aLong49 && this.aLong49 < (long) arg1 + this.aLong50) {
					local188 = this.aLong49;
				}
				@Pc(239) long local239 = -1L;
				if ((long) arg1 + this.aLong50 > this.aLong49 && (long) arg1 + this.aLong50 <= (long) this.anInt1184 + this.aLong49) {
					local239 = (long) arg1 + this.aLong50;
				} else if (this.aLong49 + (long) this.anInt1184 > this.aLong50 && (long) this.anInt1184 + this.aLong49 <= this.aLong50 + (long) arg1) {
					local239 = this.aLong49 + (long) this.anInt1184;
				}
				if (local188 > -1L && local188 < local239) {
					@Pc(335) int local335 = (int) (local239 - local188);
					Static693.method8320(arg2, (int) (local188 + (long) arg0 - this.aLong50), this.aByteArray18, (int) (local188 - this.aLong49), local335);
				}
				this.aLong50 += (long) arg1;
			} else if (arg1 > 0) {
				if (this.aLong51 == -1L) {
					this.aLong51 = this.aLong50;
				}
				Static693.method8320(arg2, arg0, this.aByteArray17, (int) (this.aLong50 - this.aLong51), arg1);
				this.aLong50 += (long) arg1;
				if (this.aLong50 - this.aLong51 > (long) this.anInt1192) {
					this.anInt1192 = (int) (this.aLong50 - this.aLong51);
				}
			}
		} catch (@Pc(437) IOException local437) {
			this.aLong52 = -1L;
			throw local437;
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "([BIII)V")
	public void method1162(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong51 != -1L && this.aLong50 >= this.aLong51 && this.aLong50 + (long) arg2 <= this.aLong51 + (long) this.anInt1192) {
				Static693.method8320(this.aByteArray17, (int) (this.aLong50 - this.aLong51), arg0, 0, arg2);
				this.aLong50 += (long) arg2;
				return;
			}
			@Pc(86) long local86 = this.aLong50;
			@Pc(90) int local90 = arg2;
			@Pc(125) int local125;
			if (this.aLong50 >= this.aLong49 && this.aLong50 < this.aLong49 + (long) this.anInt1184) {
				local125 = (int) (this.aLong49 + (long) this.anInt1184 - this.aLong50);
				if (arg2 < local125) {
					local125 = arg2;
				}
				Static693.method8320(this.aByteArray18, (int) (this.aLong50 - this.aLong49), arg0, 0, local125);
				this.aLong50 += (long) local125;
				arg2 -= local125;
				arg1 = local125;
			}
			if (arg2 > this.aByteArray18.length) {
				this.aClass223_1.method5089(this.aLong50);
				this.aLong52 = this.aLong50;
				while (arg2 > 0) {
					local125 = this.aClass223_1.method5087(arg1, arg2, arg0);
					if (local125 == -1) {
						break;
					}
					arg2 -= local125;
					this.aLong52 += (long) local125;
					this.aLong50 += (long) local125;
					arg1 += local125;
				}
			} else if (arg2 > 0) {
				this.method1163();
				local125 = arg2;
				if (arg2 > this.anInt1184) {
					local125 = this.anInt1184;
				}
				Static693.method8320(this.aByteArray18, 0, arg0, arg1, local125);
				this.aLong50 += (long) local125;
				arg2 -= local125;
				arg1 += local125;
			}
			if (this.aLong51 != -1L) {
				if (this.aLong50 < this.aLong51 && arg2 > 0) {
					local125 = arg1 + (int) (this.aLong51 - this.aLong50);
					if (arg1 + arg2 < local125) {
						local125 = arg2 + arg1;
					}
					while (arg1 < local125) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong50++;
					}
				}
				@Pc(325) long local325 = -1L;
				@Pc(327) long local327 = -1L;
				if (local86 <= this.aLong51 && (long) local90 + local86 > this.aLong51) {
					local325 = this.aLong51;
				} else if (this.aLong51 <= local86 && local86 < this.aLong51 + (long) this.anInt1192) {
					local325 = local86;
				}
				if (local86 < this.aLong51 + (long) this.anInt1192 && (long) this.anInt1192 + this.aLong51 <= local86 - -((long) local90)) {
					local327 = (long) this.anInt1192 + this.aLong51;
				} else if (local86 + (long) local90 > this.aLong51 && this.aLong51 + (long) this.anInt1192 >= (long) local90 + local86) {
					local327 = local86 + (long) local90;
				}
				if (local325 > -1L && local325 < local327) {
					@Pc(465) int local465 = (int) (local327 - local325);
					Static693.method8320(this.aByteArray17, (int) (local325 - this.aLong51), arg0, (int) (local325 - local86), local465);
					if (local327 > this.aLong50) {
						arg2 = (int) ((long) arg2 + this.aLong50 - local327);
						this.aLong50 = local327;
					}
				}
			}
		} catch (@Pc(507) IOException local507) {
			this.aLong52 = -1L;
			throw local507;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)V")
	private void method1163() throws IOException {
		this.anInt1184 = 0;
		if (this.aLong50 != this.aLong52) {
			this.aClass223_1.method5089(this.aLong50);
			this.aLong52 = this.aLong50;
		}
		this.aLong49 = this.aLong50;
		while (this.aByteArray18.length > this.anInt1184) {
			@Pc(45) int local45 = this.aByteArray18.length - this.anInt1184;
			if (local45 > 200000000) {
				local45 = 200000000;
			}
			@Pc(60) int local60 = this.aClass223_1.method5087(this.anInt1184, local45, this.aByteArray18);
			if (local60 == -1) {
				break;
			}
			this.anInt1184 += local60;
			this.aLong52 += (long) local60;
		}
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(B)V")
	private void method1164() throws IOException {
		if (this.aLong51 == -1L) {
			return;
		}
		if (this.aLong52 != this.aLong51) {
			this.aClass223_1.method5089(this.aLong51);
			this.aLong52 = this.aLong51;
		}
		this.aClass223_1.method5093(this.anInt1192, 0, this.aByteArray17);
		this.aLong52 += (long) this.anInt1192;
		if (this.aLong52 > this.aLong48) {
			this.aLong48 = this.aLong52;
		}
		@Pc(63) long local63 = -1L;
		if (this.aLong51 >= this.aLong49 && this.aLong51 < (long) this.anInt1184 + this.aLong49) {
			local63 = this.aLong51;
		} else if (this.aLong51 <= this.aLong49 && (long) this.anInt1192 + this.aLong51 > this.aLong49) {
			local63 = this.aLong49;
		}
		@Pc(119) long local119 = -1L;
		if ((long) this.anInt1192 + this.aLong51 > this.aLong49 && (long) this.anInt1184 + this.aLong49 >= this.aLong51 - -((long) this.anInt1192)) {
			local119 = (long) this.anInt1192 + this.aLong51;
		} else if (this.aLong51 < this.aLong49 + (long) this.anInt1184 && this.aLong51 + (long) this.anInt1192 >= (long) this.anInt1184 + this.aLong49) {
			local119 = this.aLong49 + (long) this.anInt1184;
		}
		if (local63 > -1L && local63 < local119) {
			@Pc(221) int local221 = (int) (local119 - local63);
			Static693.method8320(this.aByteArray17, (int) (local63 - this.aLong51), this.aByteArray18, (int) (local63 - this.aLong49), local221);
		}
		this.anInt1192 = 0;
		this.aLong51 = -1L;
	}
}
