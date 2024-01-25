import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class184 {

	@OriginalMember(owner = "client!l", name = "l", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "I")
	private int anInt6419;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "I")
	private int anInt6416 = 0;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "J")
	private long aLong144 = -1L;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "J")
	private long aLong145 = -1L;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!so;")
	private final Class320 aClass320_1;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "J")
	private long aLong143;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "[B")
	private final byte[] aByteArray85;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[B")
	private final byte[] aByteArray86;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!so;II)V")
	public Class184(@OriginalArg(0) Class320 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass320_1 = arg0;
		this.aLong146 = this.aLong143 = arg0.method7910();
		this.aByteArray85 = new byte[arg2];
		this.aByteArray86 = new byte[arg1];
		this.aLong147 = 0L;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ[B)V")
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong146 < this.aLong147 + (long) arg1) {
				this.aLong146 = (long) arg1 + this.aLong147;
			}
			if (this.aLong145 != -1L && (this.aLong147 < this.aLong145 || (long) this.anInt6416 + this.aLong145 < this.aLong147)) {
				this.method5462();
			}
			if (this.aLong145 != -1L && this.aLong147 + (long) arg1 > (long) this.aByteArray85.length + this.aLong145) {
				@Pc(92) int local92 = (int) ((long) this.aByteArray85.length + this.aLong145 - this.aLong147);
				Static653.method7723(arg2, arg0, this.aByteArray85, (int) (this.aLong147 - this.aLong145), local92);
				arg0 += local92;
				arg1 -= local92;
				this.aLong147 += local92;
				this.anInt6416 = this.aByteArray85.length;
				this.method5462();
			}
			if (arg1 > this.aByteArray85.length) {
				if (this.aLong142 != this.aLong147) {
					this.aClass320_1.method7909(this.aLong147);
					this.aLong142 = this.aLong147;
				}
				this.aClass320_1.method7906(arg0, arg1, arg2);
				this.aLong142 += arg1;
				if (this.aLong142 > this.aLong143) {
					this.aLong143 = this.aLong142;
				}
				@Pc(183) long local183 = -1L;
				if (this.aLong147 >= this.aLong144 && this.aLong147 < this.aLong144 + (long) this.anInt6419) {
					local183 = this.aLong147;
				} else if (this.aLong144 >= this.aLong147 && this.aLong144 < this.aLong147 + (long) arg1) {
					local183 = this.aLong144;
				}
				@Pc(237) long local237 = -1L;
				if ((long) arg1 + this.aLong147 > this.aLong144 && (long) this.anInt6419 + this.aLong144 >= this.aLong147 + (long) arg1) {
					local237 = (long) arg1 + this.aLong147;
				} else if ((long) this.anInt6419 + this.aLong144 > this.aLong147 && (long) arg1 + this.aLong147 >= this.aLong144 + (long) this.anInt6419) {
					local237 = (long) this.anInt6419 + this.aLong144;
				}
				if (local183 > -1L && local237 > local183) {
					@Pc(315) int local315 = (int) (local237 - local183);
					Static653.method7723(arg2, (int) (local183 + (long) arg0 - this.aLong147), this.aByteArray86, (int) (local183 - this.aLong144), local315);
				}
				this.aLong147 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong145 == -1L) {
					this.aLong145 = this.aLong147;
				}
				Static653.method7723(arg2, arg0, this.aByteArray85, (int) (this.aLong147 - this.aLong145), arg1);
				this.aLong147 += arg1;
				if (this.aLong147 - this.aLong145 > (long) this.anInt6416) {
					this.anInt6416 = (int) (this.aLong147 - this.aLong145);
				}
			}
		} catch (@Pc(399) IOException local399) {
			this.aLong142 = -1L;
			throw local399;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[B)V")
	public void method5455(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method5459(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method5456() {
		return this.aClass320_1.method7908();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)J")
	public long method5458() {
		return this.aLong146;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[BII)V")
	public void method5459(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong145 != -1L && this.aLong145 <= this.aLong147 && (long) this.anInt6416 + this.aLong145 >= this.aLong147 - -((long) arg2)) {
				Static653.method7723(this.aByteArray85, (int) (this.aLong147 - this.aLong145), arg1, 0, arg2);
				this.aLong147 += arg2;
				return;
			}
			@Pc(84) long local84 = this.aLong147;
			@Pc(88) int local88 = arg2;
			@Pc(121) int local121;
			if (this.aLong147 >= this.aLong144 && this.aLong147 < this.aLong144 + (long) this.anInt6419) {
				local121 = (int) ((long) this.anInt6419 + this.aLong144 - this.aLong147);
				if (arg2 < local121) {
					local121 = arg2;
				}
				Static653.method7723(this.aByteArray86, (int) (this.aLong147 - this.aLong144), arg1, 0, local121);
				this.aLong147 += local121;
				arg2 -= local121;
				arg0 = local121;
			}
			if (arg2 > this.aByteArray86.length) {
				this.aClass320_1.method7909(this.aLong147);
				this.aLong142 = this.aLong147;
				while (arg2 > 0) {
					local121 = this.aClass320_1.method7904(arg1, arg0, arg2);
					if (local121 == -1) {
						break;
					}
					arg0 += local121;
					this.aLong142 += local121;
					this.aLong147 += local121;
					arg2 -= local121;
				}
			} else if (arg2 > 0) {
				this.method5463();
				local121 = arg2;
				if (arg2 > this.anInt6419) {
					local121 = this.anInt6419;
				}
				Static653.method7723(this.aByteArray86, 0, arg1, arg0, local121);
				arg0 += local121;
				this.aLong147 += local121;
				arg2 -= local121;
			}
			if (this.aLong145 != -1L) {
				if (this.aLong145 > this.aLong147 && arg2 > 0) {
					local121 = (int) (this.aLong145 - this.aLong147) + arg0;
					if (local121 > arg0 + arg2) {
						local121 = arg0 + arg2;
					}
					while (arg0 < local121) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong147++;
					}
				}
				@Pc(318) long local318 = -1L;
				if (local84 <= this.aLong145 && this.aLong145 < local84 + (long) local88) {
					local318 = this.aLong145;
				} else if (local84 >= this.aLong145 && this.aLong145 + (long) this.anInt6416 > local84) {
					local318 = local84;
				}
				@Pc(372) long local372 = -1L;
				if (local84 < (long) this.anInt6416 + this.aLong145 && (long) this.anInt6416 + this.aLong145 <= (long) local88 + local84) {
					local372 = this.aLong145 + (long) this.anInt6416;
				} else if (local84 + (long) local88 > this.aLong145 && local84 + (long) local88 <= (long) this.anInt6416 + this.aLong145) {
					local372 = local84 + (long) local88;
				}
				if (local318 > -1L && local372 > local318) {
					@Pc(464) int local464 = (int) (local372 - local318);
					Static653.method7723(this.aByteArray85, (int) (local318 - this.aLong145), arg1, (int) (local318 - local84), local464);
					if (this.aLong147 < local372) {
						arg2 = (int) ((long) arg2 + this.aLong147 - local372);
						this.aLong147 = local372;
					}
				}
			}
		} catch (@Pc(506) IOException local506) {
			this.aLong142 = -1L;
			throw local506;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(JB)V")
	public void method5460(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5456());
		}
		this.aLong147 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	public void method5461() throws IOException {
		this.method5462();
		this.aClass320_1.method7905();
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	private void method5462() throws IOException {
		if (this.aLong145 == -1L) {
			return;
		}
		if (this.aLong142 != this.aLong145) {
			this.aClass320_1.method7909(this.aLong145);
			this.aLong142 = this.aLong145;
		}
		this.aClass320_1.method7906(0, this.anInt6416, this.aByteArray85);
		this.aLong142 += this.anInt6416;
		if (this.aLong143 < this.aLong142) {
			this.aLong143 = this.aLong142;
		}
		@Pc(59) long local59 = -1L;
		@Pc(61) long local61 = -1L;
		if (this.aLong145 >= this.aLong144 && (long) this.anInt6419 + this.aLong144 > this.aLong145) {
			local59 = this.aLong145;
		} else if (this.aLong145 <= this.aLong144 && this.aLong145 + (long) this.anInt6416 > this.aLong144) {
			local59 = this.aLong144;
		}
		if (this.aLong144 < (long) this.anInt6416 + this.aLong145 && (long) this.anInt6416 + this.aLong145 <= (long) this.anInt6419 + this.aLong144) {
			local61 = this.aLong145 + (long) this.anInt6416;
		} else if (this.aLong144 + (long) this.anInt6419 > this.aLong145 && this.aLong144 + (long) this.anInt6419 <= (long) this.anInt6416 + this.aLong145) {
			local61 = (long) this.anInt6419 + this.aLong144;
		}
		if (local59 > -1L && local59 < local61) {
			@Pc(207) int local207 = (int) (local61 - local59);
			Static653.method7723(this.aByteArray85, (int) (local59 - this.aLong145), this.aByteArray86, (int) (local59 - this.aLong144), local207);
		}
		this.aLong145 = -1L;
		this.anInt6416 = 0;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
	private void method5463() throws IOException {
		this.anInt6419 = 0;
		if (this.aLong142 != this.aLong147) {
			this.aClass320_1.method7909(this.aLong147);
			this.aLong142 = this.aLong147;
		}
		this.aLong144 = this.aLong147;
		while (this.aByteArray86.length > this.anInt6419) {
			@Pc(45) int local45 = this.aByteArray86.length - this.anInt6419;
			if (local45 > 200000000) {
				local45 = 200000000;
			}
			@Pc(60) int local60 = this.aClass320_1.method7904(this.aByteArray86, this.anInt6419, local45);
			if (local60 == -1) {
				break;
			}
			this.anInt6419 += local60;
			this.aLong142 += local60;
		}
	}
}
