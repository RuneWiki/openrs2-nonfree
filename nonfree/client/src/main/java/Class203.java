import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class203 {

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
	private int anInt5328;

	@OriginalMember(owner = "client!kaa", name = "s", descriptor = "J")
	private long aLong180;

	@OriginalMember(owner = "client!kaa", name = "x", descriptor = "I")
	private int anInt5327 = 0;

	@OriginalMember(owner = "client!kaa", name = "r", descriptor = "J")
	private long aLong179 = -1L;

	@OriginalMember(owner = "client!kaa", name = "v", descriptor = "J")
	private long aLong182 = -1L;

	@OriginalMember(owner = "client!kaa", name = "k", descriptor = "Lclient!pga;")
	private final Class288 aClass288_4;

	@OriginalMember(owner = "client!kaa", name = "j", descriptor = "J")
	private long aLong181;

	@OriginalMember(owner = "client!kaa", name = "y", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!kaa", name = "u", descriptor = "[B")
	private final byte[] aByteArray50;

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "[B")
	private final byte[] aByteArray49;

	@OriginalMember(owner = "client!kaa", name = "t", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!pga;II)V")
	public Class203(@OriginalArg(0) Class288 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass288_4 = arg0;
		this.aLong178 = this.aLong181 = arg0.method6776();
		this.aByteArray50 = new byte[arg2];
		this.aByteArray49 = new byte[arg1];
		this.aLong177 = 0L;
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I[BII)V")
	public void method4765(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong179 != -1L && this.aLong179 <= this.aLong177 && (long) this.anInt5327 + this.aLong179 >= (long) arg2 + this.aLong177) {
				Static732.method6320(this.aByteArray50, (int) (this.aLong177 - this.aLong179), arg1, 0, arg2);
				this.aLong177 += (long) arg2;
				return;
			}
			@Pc(84) long local84 = this.aLong177;
			@Pc(88) int local88 = arg2;
			@Pc(122) int local122;
			if (this.aLong177 >= this.aLong182 && this.aLong177 < (long) this.anInt5328 + this.aLong182) {
				local122 = (int) ((long) this.anInt5328 + this.aLong182 - this.aLong177);
				if (local122 > arg2) {
					local122 = arg2;
				}
				Static732.method6320(this.aByteArray49, (int) (this.aLong177 - this.aLong182), arg1, 0, local122);
				arg2 -= local122;
				this.aLong177 += (long) local122;
				arg0 = local122;
			}
			if (this.aByteArray49.length < arg2) {
				this.aClass288_4.method6782(this.aLong177);
				this.aLong180 = this.aLong177;
				while (arg2 > 0) {
					local122 = this.aClass288_4.method6778(arg2, arg1, arg0);
					if (local122 == -1) {
						break;
					}
					arg0 += local122;
					this.aLong180 += (long) local122;
					arg2 -= local122;
					this.aLong177 += (long) local122;
				}
			} else if (arg2 > 0) {
				this.method4769();
				local122 = arg2;
				if (arg2 > this.anInt5328) {
					local122 = this.anInt5328;
				}
				Static732.method6320(this.aByteArray49, 0, arg1, arg0, local122);
				arg0 += local122;
				this.aLong177 += (long) local122;
				arg2 -= local122;
			}
			if (this.aLong179 != (long) -1) {
				if (this.aLong179 > this.aLong177 && arg2 > 0) {
					local122 = (int) (this.aLong179 - this.aLong177) + arg0;
					if (local122 > arg2 + arg0) {
						local122 = arg2 + arg0;
					}
					while (local122 > arg0) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong177++;
					}
				}
				@Pc(318) long local318 = -1L;
				@Pc(320) long local320 = -1L;
				if (this.aLong179 >= local84 && this.aLong179 < (long) local88 + local84) {
					local318 = this.aLong179;
				} else if (this.aLong179 <= local84 && local84 < (long) this.anInt5327 + this.aLong179) {
					local318 = local84;
				}
				if (this.aLong179 + (long) this.anInt5327 > local84 && (long) local88 + local84 >= this.aLong179 + (long) this.anInt5327) {
					local320 = (long) this.anInt5327 + this.aLong179;
				} else if (local84 + (long) local88 > this.aLong179 && (long) local88 + local84 <= this.aLong179 - -((long) this.anInt5327)) {
					local320 = local84 + (long) local88;
				}
				if (local318 > -1L && local318 < local320) {
					@Pc(465) int local465 = (int) (local320 - local318);
					Static732.method6320(this.aByteArray50, (int) (local318 - this.aLong179), arg1, (int) (local318 - local84), local465);
					if (this.aLong177 < local320) {
						arg2 = (int) ((long) arg2 + this.aLong177 - local320);
						this.aLong177 = local320;
					}
				}
			}
		} catch (@Pc(503) IOException local503) {
			this.aLong180 = -1L;
			throw local503;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[BII)V")
	public void method4766(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong178 < this.aLong177 + (long) arg0) {
				this.aLong178 = (long) arg0 + this.aLong177;
			}
			if (this.aLong179 != -1L && (this.aLong179 > this.aLong177 || this.aLong177 > this.aLong179 + (long) this.anInt5327)) {
				this.method4770();
			}
			if (this.aLong179 != -1L && this.aLong177 + (long) arg0 > (long) this.aByteArray50.length + this.aLong179) {
				@Pc(112) int local112 = (int) (this.aLong179 + (long) this.aByteArray50.length - this.aLong177);
				Static732.method6320(arg1, arg2, this.aByteArray50, (int) (this.aLong177 - this.aLong179), local112);
				arg2 += local112;
				this.aLong177 += (long) local112;
				arg0 -= local112;
				this.anInt5327 = this.aByteArray50.length;
				this.method4770();
			}
			if (arg0 > this.aByteArray50.length) {
				if (this.aLong177 != this.aLong180) {
					this.aClass288_4.method6782(this.aLong177);
					this.aLong180 = this.aLong177;
				}
				this.aClass288_4.method6777(arg1, arg2, arg0);
				this.aLong180 += (long) arg0;
				if (this.aLong181 < this.aLong180) {
					this.aLong181 = this.aLong180;
				}
				@Pc(213) long local213 = -1L;
				@Pc(215) long local215 = -1L;
				if (this.aLong177 >= this.aLong182 && this.aLong182 + (long) this.anInt5328 > this.aLong177) {
					local213 = this.aLong177;
				} else if (this.aLong177 <= this.aLong182 && this.aLong182 < (long) arg0 + this.aLong177) {
					local213 = this.aLong182;
				}
				if (this.aLong182 < this.aLong177 + (long) arg0 && this.aLong177 + (long) arg0 <= (long) this.anInt5328 + this.aLong182) {
					local215 = (long) arg0 + this.aLong177;
				} else if (this.aLong177 < this.aLong182 + (long) this.anInt5328 && (long) arg0 + this.aLong177 >= this.aLong182 - -((long) this.anInt5328)) {
					local215 = (long) this.anInt5328 + this.aLong182;
				}
				if (local213 > -1L && local215 > local213) {
					@Pc(360) int local360 = (int) (local215 - local213);
					Static732.method6320(arg1, (int) (local213 + (long) arg2 - this.aLong177), this.aByteArray49, (int) (local213 - this.aLong182), local360);
				}
				this.aLong177 += (long) arg0;
			} else if (arg0 > 0) {
				if (this.aLong179 == -1L) {
					this.aLong179 = this.aLong177;
				}
				Static732.method6320(arg1, arg2, this.aByteArray50, (int) (this.aLong177 - this.aLong179), arg0);
				this.aLong177 += (long) arg0;
				if ((long) this.anInt5327 < this.aLong177 - this.aLong179) {
					this.anInt5327 = (int) (this.aLong177 - this.aLong179);
				}
			}
		} catch (@Pc(453) IOException local453) {
			this.aLong180 = -1L;
			throw local453;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IJ)V")
	public void method4768(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4771());
		}
		this.aLong177 = arg0;
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)V")
	private void method4769() throws IOException {
		this.anInt5328 = 0;
		if (this.aLong180 != this.aLong177) {
			this.aClass288_4.method6782(this.aLong177);
			this.aLong180 = this.aLong177;
		}
		this.aLong182 = this.aLong177;
		while (this.aByteArray49.length > this.anInt5328) {
			@Pc(48) int local48 = this.aByteArray49.length - this.anInt5328;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(63) int local63 = this.aClass288_4.method6778(local48, this.aByteArray49, this.anInt5328);
			if (local63 == -1) {
				break;
			}
			this.aLong180 += (long) local63;
			this.anInt5328 += local63;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)V")
	private void method4770() throws IOException {
		if (this.aLong179 == -1L) {
			return;
		}
		if (this.aLong179 != this.aLong180) {
			this.aClass288_4.method6782(this.aLong179);
			this.aLong180 = this.aLong179;
		}
		this.aClass288_4.method6777(this.aByteArray50, 0, this.anInt5327);
		this.aLong180 += (long) this.anInt5327;
		if (this.aLong181 < this.aLong180) {
			this.aLong181 = this.aLong180;
		}
		@Pc(59) long local59 = -1L;
		@Pc(61) long local61 = -1L;
		if (this.aLong179 >= this.aLong182 && this.aLong179 < (long) this.anInt5328 + this.aLong182) {
			local59 = this.aLong179;
		} else if (this.aLong182 >= this.aLong179 && this.aLong179 + (long) this.anInt5327 > this.aLong182) {
			local59 = this.aLong182;
		}
		if (this.aLong182 < (long) this.anInt5327 + this.aLong179 && (long) this.anInt5328 + this.aLong182 >= this.aLong179 - -((long) this.anInt5327)) {
			local61 = (long) this.anInt5327 + this.aLong179;
		} else if (this.aLong182 + (long) this.anInt5328 > this.aLong179 && (long) this.anInt5328 + this.aLong182 <= this.aLong179 + (long) this.anInt5327) {
			local61 = (long) this.anInt5328 + this.aLong182;
		}
		if (local59 > -1L && local59 < local61) {
			@Pc(211) int local211 = (int) (local61 - local59);
			Static732.method6320(this.aByteArray50, (int) (local59 - this.aLong179), this.aByteArray49, (int) (local59 - this.aLong182), local211);
		}
		this.anInt5327 = 0;
		this.aLong179 = -1L;
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method4771() {
		return this.aClass288_4.method6779();
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)J")
	public long method4772() {
		return this.aLong178;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "([BI)V")
	public void method4773(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4765(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
	public void method4774() throws IOException {
		this.method4770();
		this.aClass288_4.method6780();
	}
}
