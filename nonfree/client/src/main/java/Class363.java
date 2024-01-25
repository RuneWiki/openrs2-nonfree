import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class363 {

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "J")
	private long aLong299;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
	private int anInt9617;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "J")
	private long aLong295 = -1L;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "J")
	private long aLong298 = -1L;

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
	private int anInt9621 = 0;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "Lclient!em;")
	private final Class91 aClass91_4;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "J")
	private long aLong297;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "J")
	private long aLong296;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "[B")
	private final byte[] aByteArray105;

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "[B")
	private final byte[] aByteArray106;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "J")
	private long aLong300;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!em;II)V")
	public Class363(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass91_4 = arg0;
		this.aLong296 = this.aLong297 = arg0.method1840();
		this.aByteArray105 = new byte[arg1];
		this.aByteArray106 = new byte[arg2];
		this.aLong300 = 0L;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
	private void method7836() throws IOException {
		if (this.aLong295 == -1L) {
			return;
		}
		if (this.aLong295 != this.aLong299) {
			this.aClass91_4.method1838(this.aLong295);
			this.aLong299 = this.aLong295;
		}
		this.aClass91_4.method1834(this.anInt9621, 0, this.aByteArray106);
		this.aLong299 += this.anInt9621;
		if (this.aLong297 < this.aLong299) {
			this.aLong297 = this.aLong299;
		}
		@Pc(53) long local53 = -1L;
		if (this.aLong295 >= this.aLong298 && this.aLong295 < this.aLong298 + (long) this.anInt9617) {
			local53 = this.aLong295;
		} else if (this.aLong295 <= this.aLong298 && this.aLong295 + (long) this.anInt9621 > this.aLong298) {
			local53 = this.aLong298;
		}
		@Pc(104) long local104 = -1L;
		if (this.aLong295 + (long) this.anInt9621 > this.aLong298 && this.aLong295 + (long) this.anInt9621 <= this.aLong298 - -((long) this.anInt9617)) {
			local104 = (long) this.anInt9621 + this.aLong295;
		} else if ((long) this.anInt9617 + this.aLong298 > this.aLong295 && (long) this.anInt9617 + this.aLong298 <= (long) this.anInt9621 + this.aLong295) {
			local104 = (long) this.anInt9617 + this.aLong298;
		}
		if (local53 > -1L && local53 < local104) {
			@Pc(186) int local186 = (int) (local104 - local53);
			Static598.method1173(this.aByteArray106, (int) (local53 - this.aLong295), this.aByteArray105, (int) (local53 - this.aLong298), local186);
		}
		this.aLong295 = -1L;
		this.anInt9621 = 0;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)V")
	private void method7838() throws IOException {
		this.anInt9617 = 0;
		if (this.aLong300 != this.aLong299) {
			this.aClass91_4.method1838(this.aLong300);
			this.aLong299 = this.aLong300;
		}
		this.aLong298 = this.aLong300;
		while (this.anInt9617 < this.aByteArray105.length) {
			@Pc(48) int local48 = this.aByteArray105.length - this.anInt9617;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass91_4.method1839(local48, this.anInt9617, this.aByteArray105);
			if (local65 == -1) {
				break;
			}
			this.anInt9617 += local65;
			this.aLong299 += local65;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)J")
	public long method7840() {
		return this.aLong296;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[B)V")
	public void method7841(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method7842(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[BI)V")
	public void method7842(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong295 != (long) -1 && this.aLong295 <= this.aLong300 && (long) this.anInt9621 + this.aLong295 >= (long) arg2 + this.aLong300) {
				Static598.method1173(this.aByteArray106, (int) (this.aLong300 - this.aLong295), arg1, 0, arg2);
				this.aLong300 += arg2;
				return;
			}
			@Pc(84) long local84 = this.aLong300;
			@Pc(88) int local88 = arg2;
			@Pc(120) int local120;
			if (this.aLong300 >= this.aLong298 && (long) this.anInt9617 + this.aLong298 > this.aLong300) {
				local120 = (int) ((long) this.anInt9617 + this.aLong298 - this.aLong300);
				if (arg2 < local120) {
					local120 = arg2;
				}
				Static598.method1173(this.aByteArray105, (int) (this.aLong300 - this.aLong298), arg1, 0, local120);
				arg0 = local120;
				this.aLong300 += local120;
				arg2 -= local120;
			}
			if (arg2 > this.aByteArray105.length) {
				this.aClass91_4.method1838(this.aLong300);
				this.aLong299 = this.aLong300;
				while (arg2 > 0) {
					local120 = this.aClass91_4.method1839(arg2, arg0, arg1);
					if (local120 == -1) {
						break;
					}
					arg2 -= local120;
					this.aLong299 += local120;
					this.aLong300 += local120;
					arg0 += local120;
				}
			} else if (arg2 > 0) {
				this.method7838();
				local120 = arg2;
				if (this.anInt9617 < arg2) {
					local120 = this.anInt9617;
				}
				Static598.method1173(this.aByteArray105, 0, arg1, arg0, local120);
				arg2 -= local120;
				arg0 += local120;
				this.aLong300 += local120;
			}
			if (this.aLong295 != -1L) {
				if (this.aLong300 < this.aLong295 && arg2 > 0) {
					local120 = arg0 + (int) (this.aLong295 - this.aLong300);
					if (arg2 + arg0 < local120) {
						local120 = arg2 + arg0;
					}
					while (arg0 < local120) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong300++;
					}
				}
				@Pc(318) long local318 = -1L;
				@Pc(320) long local320 = -1L;
				if (this.aLong295 >= local84 && local84 + (long) local88 > this.aLong295) {
					local318 = this.aLong295;
				} else if (this.aLong295 <= local84 && local84 < this.aLong295 + (long) this.anInt9621) {
					local318 = local84;
				}
				if ((long) this.anInt9621 + this.aLong295 > local84 && local84 + (long) local88 >= (long) this.anInt9621 + this.aLong295) {
					local320 = this.aLong295 + (long) this.anInt9621;
				} else if ((long) local88 + local84 > this.aLong295 && (long) local88 + local84 <= (long) this.anInt9621 + this.aLong295) {
					local320 = local84 + (long) local88;
				}
				if (local318 > -1L && local318 < local320) {
					@Pc(448) int local448 = (int) (local320 - local318);
					Static598.method1173(this.aByteArray106, (int) (local318 - this.aLong295), arg1, (int) (local318 - local84), local448);
					if (this.aLong300 < local320) {
						arg2 = (int) ((long) arg2 + this.aLong300 - local320);
						this.aLong300 = local320;
					}
				}
			}
		} catch (@Pc(485) IOException local485) {
			this.aLong299 = -1L;
			throw local485;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(JI)V")
	public void method7843(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method7846());
		}
		this.aLong300 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
	public void method7845() throws IOException {
		this.method7836();
		this.aClass91_4.method1833();
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)Ljava/io/File;")
	private File method7846() {
		return this.aClass91_4.method1837();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z[BII)V")
	public void method7847(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong300 + (long) arg2 > this.aLong296) {
				this.aLong296 = this.aLong300 + (long) arg2;
			}
			if (this.aLong295 != -1L && (this.aLong300 < this.aLong295 || this.aLong295 + (long) this.anInt9621 < this.aLong300)) {
				this.method7836();
			}
			if (this.aLong295 != -1L && this.aLong300 + (long) arg2 > this.aLong295 - -((long) this.aByteArray106.length)) {
				@Pc(90) int local90 = (int) (this.aLong295 + (long) this.aByteArray106.length - this.aLong300);
				Static598.method1173(arg0, arg1, this.aByteArray106, (int) (this.aLong300 - this.aLong295), local90);
				arg1 += local90;
				this.aLong300 += local90;
				arg2 -= local90;
				this.anInt9621 = this.aByteArray106.length;
				this.method7836();
			}
			if (arg2 > this.aByteArray106.length) {
				if (this.aLong299 != this.aLong300) {
					this.aClass91_4.method1838(this.aLong300);
					this.aLong299 = this.aLong300;
				}
				this.aClass91_4.method1834(arg2, arg1, arg0);
				this.aLong299 += arg2;
				if (this.aLong299 > this.aLong297) {
					this.aLong297 = this.aLong299;
				}
				@Pc(178) long local178 = -1L;
				@Pc(180) long local180 = -1L;
				if (this.aLong298 <= this.aLong300 && this.aLong300 < this.aLong298 + (long) this.anInt9617) {
					local178 = this.aLong300;
				} else if (this.aLong298 >= this.aLong300 && (long) arg2 + this.aLong300 > this.aLong298) {
					local178 = this.aLong298;
				}
				if ((long) arg2 + this.aLong300 > this.aLong298 && this.aLong298 + (long) this.anInt9617 >= this.aLong300 - -((long) arg2)) {
					local180 = (long) arg2 + this.aLong300;
				} else if ((long) this.anInt9617 + this.aLong298 > this.aLong300 && (long) arg2 + this.aLong300 >= (long) this.anInt9617 + this.aLong298) {
					local180 = (long) this.anInt9617 + this.aLong298;
				}
				if (local178 > -1L && local180 > local178) {
					@Pc(311) int local311 = (int) (local180 - local178);
					Static598.method1173(arg0, (int) (local178 + (long) arg1 - this.aLong300), this.aByteArray105, (int) (local178 - this.aLong298), local311);
				}
				this.aLong300 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong295 == -1L) {
					this.aLong295 = this.aLong300;
				}
				Static598.method1173(arg0, arg1, this.aByteArray106, (int) (this.aLong300 - this.aLong295), arg2);
				this.aLong300 += arg2;
				if ((long) this.anInt9621 < this.aLong300 - this.aLong295) {
					this.anInt9621 = (int) (this.aLong300 - this.aLong295);
				}
			}
		} catch (@Pc(391) IOException local391) {
			this.aLong299 = -1L;
			throw local391;
		}
	}
}
