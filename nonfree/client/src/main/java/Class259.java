import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class259 {

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	private int anInt7015;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "J")
	private long aLong306;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
	private int anInt7016 = 0;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "J")
	private long aLong305 = -1L;

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "J")
	private long aLong307 = -1L;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "Lclient!rg;")
	private final Class283 aClass283_4;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "J")
	private long aLong304;

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "J")
	private long aLong302;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "[B")
	private final byte[] aByteArray77;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "[B")
	private final byte[] aByteArray76;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "J")
	private long aLong303;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!rg;II)V")
	public Class259(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass283_4 = arg0;
		this.aLong302 = this.aLong304 = arg0.method6491();
		this.aByteArray77 = new byte[arg1];
		this.aByteArray76 = new byte[arg2];
		this.aLong303 = 0L;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	public void method5766() throws IOException {
		this.method5776();
		this.aClass283_4.method6494();
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method5768() {
		return this.aClass283_4.method6492();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[BII)V")
	public void method5769(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong307 != -1L && this.aLong307 <= this.aLong303 && (long) this.anInt7016 + this.aLong307 >= this.aLong303 - -((long) arg1)) {
				Static600.method3768(this.aByteArray76, (int) (this.aLong303 - this.aLong307), arg0, 0, arg1);
				this.aLong303 += arg1;
				return;
			}
			@Pc(73) long local73 = this.aLong303;
			@Pc(84) int local84 = arg1;
			@Pc(112) int local112;
			if (this.aLong305 <= this.aLong303 && this.aLong303 < (long) this.anInt7015 + this.aLong305) {
				local112 = (int) (this.aLong305 + (long) this.anInt7015 - this.aLong303);
				if (arg1 < local112) {
					local112 = arg1;
				}
				Static600.method3768(this.aByteArray77, (int) (this.aLong303 - this.aLong305), arg0, 0, local112);
				arg1 -= local112;
				this.aLong303 += local112;
				arg2 = local112;
			}
			if (arg1 > this.aByteArray77.length) {
				this.aClass283_4.method6488(this.aLong303);
				this.aLong306 = this.aLong303;
				while (arg1 > 0) {
					local112 = this.aClass283_4.method6490(arg1, arg2, arg0);
					if (local112 == -1) {
						break;
					}
					arg2 += local112;
					this.aLong303 += local112;
					this.aLong306 += local112;
					arg1 -= local112;
				}
			} else if (arg1 > 0) {
				this.method5770();
				local112 = arg1;
				if (this.anInt7015 < arg1) {
					local112 = this.anInt7015;
				}
				Static600.method3768(this.aByteArray77, 0, arg0, arg2, local112);
				arg1 -= local112;
				arg2 += local112;
				this.aLong303 += local112;
			}
			if (this.aLong307 != -1L) {
				if (this.aLong303 < this.aLong307 && arg1 > 0) {
					local112 = arg2 + (int) (this.aLong307 - this.aLong303);
					if (local112 > arg2 + arg1) {
						local112 = arg1 + arg2;
					}
					while (local112 > arg2) {
						arg0[arg2++] = 0;
						arg1--;
						this.aLong303++;
					}
				}
				@Pc(306) long local306 = -1L;
				if (this.aLong307 >= local73 && (long) local84 + local73 > this.aLong307) {
					local306 = this.aLong307;
				} else if (this.aLong307 <= local73 && local73 < (long) this.anInt7016 + this.aLong307) {
					local306 = local73;
				}
				@Pc(354) long local354 = -1L;
				if ((long) this.anInt7016 + this.aLong307 > local73 && (long) this.anInt7016 + this.aLong307 <= (long) local84 + local73) {
					local354 = this.aLong307 + (long) this.anInt7016;
				} else if (this.aLong307 < local73 + (long) local84 && (long) local84 + local73 <= this.aLong307 - -((long) this.anInt7016)) {
					local354 = local73 + (long) local84;
				}
				if (local306 > -1L && local354 > local306) {
					@Pc(437) int local437 = (int) (local354 - local306);
					Static600.method3768(this.aByteArray76, (int) (local306 - this.aLong307), arg0, (int) (local306 - local73), local437);
					if (local354 > this.aLong303) {
						arg1 = (int) ((long) arg1 + this.aLong303 - local354);
						this.aLong303 = local354;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong306 = -1L;
			throw local479;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	private void method5770() throws IOException {
		this.anInt7015 = 0;
		if (this.aLong303 != this.aLong306) {
			this.aClass283_4.method6488(this.aLong303);
			this.aLong306 = this.aLong303;
		}
		this.aLong305 = this.aLong303;
		while (this.aByteArray77.length > this.anInt7015) {
			@Pc(43) int local43 = this.aByteArray77.length - this.anInt7015;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(58) int local58 = this.aClass283_4.method6490(local43, this.anInt7015, this.aByteArray77);
			if (local58 == -1) {
				break;
			}
			this.anInt7015 += local58;
			this.aLong306 += local58;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III[B)V")
	public void method5772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong303 > this.aLong302) {
				this.aLong302 = this.aLong303 + (long) arg1;
			}
			if (this.aLong307 != -1L && (this.aLong303 < this.aLong307 || this.aLong307 + (long) this.anInt7016 < this.aLong303)) {
				this.method5776();
			}
			if (this.aLong307 != -1L && this.aLong307 + (long) this.aByteArray76.length < this.aLong303 + (long) arg1) {
				@Pc(92) int local92 = (int) ((long) this.aByteArray76.length + this.aLong307 - this.aLong303);
				Static600.method3768(arg2, arg0, this.aByteArray76, (int) (this.aLong303 - this.aLong307), local92);
				arg1 -= local92;
				arg0 += local92;
				this.aLong303 += local92;
				this.anInt7016 = this.aByteArray76.length;
				this.method5776();
			}
			if (this.aByteArray76.length < arg1) {
				if (this.aLong306 != this.aLong303) {
					this.aClass283_4.method6488(this.aLong303);
					this.aLong306 = this.aLong303;
				}
				this.aClass283_4.method6493(arg0, arg2, arg1);
				this.aLong306 += arg1;
				if (this.aLong304 < this.aLong306) {
					this.aLong304 = this.aLong306;
				}
				@Pc(191) long local191 = -1L;
				@Pc(193) long local193 = -1L;
				if (this.aLong303 >= this.aLong305 && this.aLong303 < this.aLong305 + (long) this.anInt7015) {
					local191 = this.aLong303;
				} else if (this.aLong303 <= this.aLong305 && this.aLong305 < (long) arg1 + this.aLong303) {
					local191 = this.aLong305;
				}
				if (this.aLong305 < (long) arg1 + this.aLong303 && (long) arg1 + this.aLong303 <= this.aLong305 + (long) this.anInt7015) {
					local193 = this.aLong303 + (long) arg1;
				} else if ((long) this.anInt7015 + this.aLong305 > this.aLong303 && (long) this.anInt7015 + this.aLong305 <= (long) arg1 + this.aLong303) {
					local193 = this.aLong305 + (long) this.anInt7015;
				}
				if (local191 > -1L && local191 < local193) {
					@Pc(329) int local329 = (int) (local193 - local191);
					Static600.method3768(arg2, (int) ((long) arg0 + local191 - this.aLong303), this.aByteArray77, (int) (local191 - this.aLong305), local329);
				}
				this.aLong303 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong307 == -1L) {
					this.aLong307 = this.aLong303;
				}
				Static600.method3768(arg2, arg0, this.aByteArray76, (int) (this.aLong303 - this.aLong307), arg1);
				this.aLong303 += arg1;
				if (this.aLong303 - this.aLong307 > (long) this.anInt7016) {
					this.anInt7016 = (int) (this.aLong303 - this.aLong307);
				}
			}
		} catch (@Pc(413) IOException local413) {
			this.aLong306 = -1L;
			throw local413;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([BB)V")
	public void method5773(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method5769(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IJ)V")
	public void method5774(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5768());
		}
		this.aLong303 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)J")
	public long method5775() {
		return this.aLong302;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	private void method5776() throws IOException {
		if (this.aLong307 == -1L) {
			return;
		}
		if (this.aLong306 != this.aLong307) {
			this.aClass283_4.method6488(this.aLong307);
			this.aLong306 = this.aLong307;
		}
		this.aClass283_4.method6493(0, this.aByteArray76, this.anInt7016);
		this.aLong306 += this.anInt7016;
		if (this.aLong304 < this.aLong306) {
			this.aLong304 = this.aLong306;
		}
		@Pc(69) long local69 = -1L;
		if (this.aLong307 >= this.aLong305 && this.aLong307 < this.aLong305 + (long) this.anInt7015) {
			local69 = this.aLong307;
		} else if (this.aLong305 >= this.aLong307 && this.aLong305 < (long) this.anInt7016 + this.aLong307) {
			local69 = this.aLong305;
		}
		@Pc(120) long local120 = -1L;
		if (this.aLong305 < (long) this.anInt7016 + this.aLong307 && (long) this.anInt7015 + this.aLong305 >= this.aLong307 + (long) this.anInt7016) {
			local120 = this.aLong307 + (long) this.anInt7016;
		} else if ((long) this.anInt7015 + this.aLong305 > this.aLong307 && this.aLong305 + (long) this.anInt7015 <= (long) this.anInt7016 + this.aLong307) {
			local120 = this.aLong305 + (long) this.anInt7015;
		}
		if (local69 > -1L && local120 > local69) {
			@Pc(212) int local212 = (int) (local120 - local69);
			Static600.method3768(this.aByteArray76, (int) (local69 - this.aLong307), this.aByteArray77, (int) (local69 - this.aLong305), local212);
		}
		this.anInt7016 = 0;
		this.aLong307 = -1L;
	}
}
