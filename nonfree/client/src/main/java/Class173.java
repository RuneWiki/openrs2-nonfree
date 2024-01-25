import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class173 {

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	private int anInt4905;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	private int anInt4903 = 0;

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "J")
	private long aLong148 = -1L;

	@OriginalMember(owner = "client!jk", name = "z", descriptor = "J")
	private long aLong150 = -1L;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "Lclient!jn;")
	private final Class175 aClass175_4;

	@OriginalMember(owner = "client!jk", name = "y", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "[B")
	private final byte[] aByteArray56;

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "[B")
	private final byte[] aByteArray57;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!jn;II)V")
	public Class173(@OriginalArg(0) Class175 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass175_4 = arg0;
		this.aLong145 = this.aLong149 = arg0.method4458();
		this.aLong147 = 0L;
		this.aByteArray56 = new byte[arg2];
		this.aByteArray57 = new byte[arg1];
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)J")
	public long method4417() {
		return this.aLong145;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIZ[B)V")
	public void method4418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong145 < this.aLong147 + (long) arg1) {
				this.aLong145 = this.aLong147 + (long) arg1;
			}
			if (this.aLong150 != -1L && (this.aLong147 < this.aLong150 || this.aLong150 + (long) this.anInt4903 < this.aLong147)) {
				this.method4428();
			}
			if (this.aLong150 != -1L && this.aLong147 + (long) arg1 > this.aLong150 - -((long) this.aByteArray56.length)) {
				@Pc(93) int local93 = (int) ((long) this.aByteArray56.length + this.aLong150 - this.aLong147);
				Static653.method6858(arg2, arg0, this.aByteArray56, (int) (this.aLong147 - this.aLong150), local93);
				arg1 -= local93;
				arg0 += local93;
				this.aLong147 += local93;
				this.anInt4903 = this.aByteArray56.length;
				this.method4428();
			}
			if (arg1 > this.aByteArray56.length) {
				if (this.aLong146 != this.aLong147) {
					this.aClass175_4.method4460(this.aLong147);
					this.aLong146 = this.aLong147;
				}
				this.aClass175_4.method4464(arg1, arg0, arg2);
				this.aLong146 += arg1;
				if (this.aLong146 > this.aLong149) {
					this.aLong149 = this.aLong146;
				}
				@Pc(179) long local179 = -1L;
				@Pc(181) long local181 = -1L;
				if (this.aLong147 >= this.aLong148 && this.aLong148 + (long) this.anInt4905 > this.aLong147) {
					local179 = this.aLong147;
				} else if (this.aLong147 <= this.aLong148 && this.aLong148 < this.aLong147 + (long) arg1) {
					local179 = this.aLong148;
				}
				if (this.aLong147 + (long) arg1 > this.aLong148 && this.aLong148 + (long) this.anInt4905 >= this.aLong147 + (long) arg1) {
					local181 = (long) arg1 + this.aLong147;
				} else if (this.aLong147 < (long) this.anInt4905 + this.aLong148 && (long) arg1 + this.aLong147 >= this.aLong148 + (long) this.anInt4905) {
					local181 = (long) this.anInt4905 + this.aLong148;
				}
				if (local179 > -1L && local181 > local179) {
					@Pc(310) int local310 = (int) (local181 - local179);
					Static653.method6858(arg2, (int) (local179 + (long) arg0 - this.aLong147), this.aByteArray57, (int) (local179 - this.aLong148), local310);
				}
				this.aLong147 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong150 == -1L) {
					this.aLong150 = this.aLong147;
				}
				Static653.method6858(arg2, arg0, this.aByteArray56, (int) (this.aLong147 - this.aLong150), arg1);
				this.aLong147 += arg1;
				if (this.aLong147 - this.aLong150 > (long) this.anInt4903) {
					this.anInt4903 = (int) (this.aLong147 - this.aLong150);
				}
			}
		} catch (@Pc(394) IOException local394) {
			this.aLong146 = -1L;
			throw local394;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "([BI)V")
	public void method4419(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4431(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IJ)V")
	public void method4421(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4427());
		}
		this.aLong147 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	private void method4422() throws IOException {
		this.anInt4905 = 0;
		if (this.aLong146 != this.aLong147) {
			this.aClass175_4.method4460(this.aLong147);
			this.aLong146 = this.aLong147;
		}
		this.aLong148 = this.aLong147;
		while (this.anInt4905 < this.aByteArray57.length) {
			@Pc(45) int local45 = this.aByteArray57.length - this.anInt4905;
			if (local45 > 200000000) {
				local45 = 200000000;
			}
			@Pc(60) int local60 = this.aClass175_4.method4466(local45, this.anInt4905, this.aByteArray57);
			if (local60 == -1) {
				break;
			}
			this.anInt4905 += local60;
			this.aLong146 += local60;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
	public void method4425() throws IOException {
		this.method4428();
		this.aClass175_4.method4462();
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method4427() {
		return this.aClass175_4.method4463();
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V")
	private void method4428() throws IOException {
		if (this.aLong150 == -1L) {
			return;
		}
		if (this.aLong146 != this.aLong150) {
			this.aClass175_4.method4460(this.aLong150);
			this.aLong146 = this.aLong150;
		}
		this.aClass175_4.method4464(this.anInt4903, 0, this.aByteArray56);
		this.aLong146 += this.anInt4903;
		if (this.aLong146 > this.aLong149) {
			this.aLong149 = this.aLong146;
		}
		@Pc(57) long local57 = -1L;
		@Pc(59) long local59 = -1L;
		if (this.aLong150 >= this.aLong148 && this.aLong150 < this.aLong148 + (long) this.anInt4905) {
			local57 = this.aLong150;
		} else if (this.aLong150 <= this.aLong148 && this.aLong148 < (long) this.anInt4903 + this.aLong150) {
			local57 = this.aLong148;
		}
		if ((long) this.anInt4903 + this.aLong150 > this.aLong148 && this.aLong150 + (long) this.anInt4903 <= this.aLong148 - -((long) this.anInt4905)) {
			local59 = (long) this.anInt4903 + this.aLong150;
		} else if ((long) this.anInt4905 + this.aLong148 > this.aLong150 && (long) this.anInt4905 + this.aLong148 <= (long) this.anInt4903 + this.aLong150) {
			local59 = this.aLong148 + (long) this.anInt4905;
		}
		if (local57 > -1L && local57 < local59) {
			@Pc(199) int local199 = (int) (local59 - local57);
			Static653.method6858(this.aByteArray56, (int) (local57 - this.aLong150), this.aByteArray57, (int) (local57 - this.aLong148), local199);
		}
		this.aLong150 = -1L;
		this.anInt4903 = 0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III[B)V")
	public void method4431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if ((long) -1 != this.aLong150 && this.aLong150 <= this.aLong147 && (long) arg0 + this.aLong147 <= this.aLong150 - -((long) this.anInt4903)) {
				Static653.method6858(this.aByteArray56, (int) (this.aLong147 - this.aLong150), arg2, 0, arg0);
				this.aLong147 += arg0;
				return;
			}
			@Pc(76) long local76 = this.aLong147;
			@Pc(80) int local80 = arg0;
			@Pc(113) int local113;
			if (this.aLong148 <= this.aLong147 && this.aLong147 < (long) this.anInt4905 + this.aLong148) {
				local113 = (int) ((long) this.anInt4905 + this.aLong148 - this.aLong147);
				if (local113 > arg0) {
					local113 = arg0;
				}
				Static653.method6858(this.aByteArray57, (int) (this.aLong147 - this.aLong148), arg2, 0, local113);
				this.aLong147 += local113;
				arg1 = local113;
				arg0 -= local113;
			}
			if (this.aByteArray57.length < arg0) {
				this.aClass175_4.method4460(this.aLong147);
				this.aLong146 = this.aLong147;
				while (arg0 > 0) {
					local113 = this.aClass175_4.method4466(arg0, arg1, arg2);
					if (local113 == -1) {
						break;
					}
					this.aLong146 += local113;
					this.aLong147 += local113;
					arg1 += local113;
					arg0 -= local113;
				}
			} else if (arg0 > 0) {
				this.method4422();
				local113 = arg0;
				if (this.anInt4905 < arg0) {
					local113 = this.anInt4905;
				}
				Static653.method6858(this.aByteArray57, 0, arg2, arg1, local113);
				this.aLong147 += local113;
				arg1 += local113;
				arg0 -= local113;
			}
			if (this.aLong150 != -1L) {
				if (this.aLong150 > this.aLong147 && arg0 > 0) {
					local113 = arg1 + (int) (this.aLong150 - this.aLong147);
					if (local113 > arg0 + arg1) {
						local113 = arg0 + arg1;
					}
					while (arg1 < local113) {
						arg2[arg1++] = 0;
						arg0--;
						this.aLong147++;
					}
				}
				@Pc(294) long local294 = -1L;
				if (local76 <= this.aLong150 && this.aLong150 < local76 + (long) local80) {
					local294 = this.aLong150;
				} else if (this.aLong150 <= local76 && local76 < this.aLong150 + (long) this.anInt4903) {
					local294 = local76;
				}
				@Pc(330) long local330 = -1L;
				if (this.aLong150 + (long) this.anInt4903 > local76 && (long) this.anInt4903 + this.aLong150 <= (long) local80 + local76) {
					local330 = this.aLong150 + (long) this.anInt4903;
				} else if (this.aLong150 < (long) local80 + local76 && local76 + (long) local80 <= this.aLong150 + (long) this.anInt4903) {
					local330 = local76 + (long) local80;
				}
				if (local294 > -1L && local294 < local330) {
					@Pc(408) int local408 = (int) (local330 - local294);
					Static653.method6858(this.aByteArray56, (int) (local294 - this.aLong150), arg2, (int) (local294 - local76), local408);
					if (local330 > this.aLong147) {
						arg0 = (int) ((long) arg0 + this.aLong147 - local330);
						this.aLong147 = local330;
					}
				}
			}
		} catch (@Pc(446) IOException local446) {
			this.aLong146 = -1L;
			throw local446;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}
}
