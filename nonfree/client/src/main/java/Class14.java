import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class14 {

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "J")
	private long aLong15 = -1L;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "J")
	private long aLong14 = -1L;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	private int anInt299 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "Lclient!ma;")
	private Class97 aClass97_1;

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!ma;II)V")
	public Class14(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass97_1 = arg0;
		this.aLong19 = this.aLong18 = arg0.method2932();
		this.aByteArray3 = new byte[arg1];
		this.aLong17 = 0L;
		this.aByteArray2 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[BII)V")
	public void method232(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong17 + (long) arg2 > this.aLong19) {
				this.aLong19 = this.aLong17 + (long) arg2;
			}
			if (this.aLong14 != -1L && (this.aLong17 < this.aLong14 || this.aLong17 > this.aLong14 + (long) this.anInt299)) {
				this.method234();
			}
			if (this.aLong14 != -1L && (long) arg2 + this.aLong17 > this.aLong14 + (long) this.aByteArray2.length) {
				@Pc(86) int local86 = (int) (this.aLong14 + (long) this.aByteArray2.length - this.aLong17);
				arg2 -= local86;
				Static302.method1372(arg0, arg1, this.aByteArray2, (int) (this.aLong17 - this.aLong14), local86);
				arg1 += local86;
				this.aLong17 += local86;
				this.anInt299 = this.aByteArray2.length;
				this.method234();
			}
			if (this.aByteArray2.length < arg2) {
				if (this.aLong16 != this.aLong17) {
					this.aClass97_1.method2933(this.aLong17);
					this.aLong16 = this.aLong17;
				}
				this.aClass97_1.method2930(arg2, arg1, arg0);
				this.aLong16 += arg2;
				if (this.aLong16 > this.aLong18) {
					this.aLong18 = this.aLong16;
				}
				@Pc(171) long local171 = -1L;
				if (this.aLong15 <= this.aLong17 && (long) this.anInt303 + this.aLong15 > this.aLong17) {
					local171 = this.aLong17;
				} else if (this.aLong17 <= this.aLong15 && this.aLong15 < this.aLong17 + (long) arg2) {
					local171 = this.aLong15;
				}
				@Pc(225) long local225 = -1L;
				if ((long) arg2 + this.aLong17 > this.aLong15 && this.aLong15 + (long) this.anInt303 >= this.aLong17 - -((long) arg2)) {
					local225 = this.aLong17 + (long) arg2;
				} else if (this.aLong15 + (long) this.anInt303 > this.aLong17 && this.aLong17 + (long) arg2 >= this.aLong15 - -((long) this.anInt303)) {
					local225 = (long) this.anInt303 + this.aLong15;
				}
				if (local171 > -1L && local225 > local171) {
					@Pc(321) int local321 = (int) (local225 - local171);
					Static302.method1372(arg0, (int) (local171 + (long) arg1 - this.aLong17), this.aByteArray3, (int) (local171 - this.aLong15), local321);
				}
				this.aLong17 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong14 == -1L) {
					this.aLong14 = this.aLong17;
				}
				Static302.method1372(arg0, arg1, this.aByteArray2, (int) (this.aLong17 - this.aLong14), arg2);
				this.aLong17 += arg2;
				if (this.aLong17 - this.aLong14 > (long) this.anInt299) {
					this.anInt299 = (int) (this.aLong17 - this.aLong14);
				}
			}
		} catch (@Pc(416) IOException local416) {
			this.aLong16 = -1L;
			throw local416;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	private void method233() throws IOException {
		this.anInt303 = 0;
		if (this.aLong17 != this.aLong16) {
			this.aClass97_1.method2933(this.aLong17);
			this.aLong16 = this.aLong17;
		}
		this.aLong15 = this.aLong17;
		while (this.anInt303 < this.aByteArray3.length) {
			@Pc(54) int local54 = this.aByteArray3.length - this.anInt303;
			if (local54 > 200000000) {
				local54 = 200000000;
			}
			@Pc(70) int local70 = this.aClass97_1.method2929(this.anInt303, local54, this.aByteArray3);
			if (local70 == -1) {
				break;
			}
			this.anInt303 += local70;
			this.aLong16 += local70;
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
	private void method234() throws IOException {
		if (this.aLong14 == -1L) {
			return;
		}
		if (this.aLong16 != this.aLong14) {
			this.aClass97_1.method2933(this.aLong14);
			this.aLong16 = this.aLong14;
		}
		@Pc(29) long local29 = -1L;
		this.aClass97_1.method2930(this.anInt299, 0, this.aByteArray2);
		@Pc(40) long local40 = -1L;
		if (this.aLong15 <= this.aLong14 && this.aLong14 < (long) this.anInt303 + this.aLong15) {
			local40 = this.aLong14;
		} else if (this.aLong14 <= this.aLong15 && this.aLong15 < (long) this.anInt299 + this.aLong14) {
			local40 = this.aLong15;
		}
		this.aLong16 += this.anInt299;
		if (this.aLong16 > this.aLong18) {
			this.aLong18 = this.aLong16;
		}
		if ((long) this.anInt299 + this.aLong14 > this.aLong15 && (long) this.anInt299 + this.aLong14 <= (long) this.anInt303 + this.aLong15) {
			local29 = this.aLong14 + (long) this.anInt299;
		} else if ((long) this.anInt303 + this.aLong15 > this.aLong14 && (long) this.anInt299 + this.aLong14 >= (long) this.anInt303 + this.aLong15) {
			local29 = this.aLong15 + (long) this.anInt303;
		}
		if (local40 > -1L && local40 < local29) {
			@Pc(201) int local201 = (int) (local29 - local40);
			Static302.method1372(this.aByteArray2, (int) (local40 - this.aLong14), this.aByteArray3, (int) (local40 - this.aLong15), local201);
		}
		this.anInt299 = 0;
		this.aLong14 = -1L;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[BI)V")
	public void method235(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong14 != -1L && this.aLong17 >= this.aLong14 && (long) arg0 + this.aLong17 <= this.aLong14 - -((long) this.anInt299)) {
				Static302.method1372(this.aByteArray2, (int) (this.aLong17 - this.aLong14), arg1, 0, arg0);
				this.aLong17 += arg0;
				return;
			}
			@Pc(85) long local85 = this.aLong17;
			@Pc(96) int local96 = arg0;
			@Pc(125) int local125;
			if (this.aLong15 <= this.aLong17 && (long) this.anInt303 + this.aLong15 > this.aLong17) {
				local125 = (int) ((long) this.anInt303 + this.aLong15 - this.aLong17);
				if (local125 > arg0) {
					local125 = arg0;
				}
				Static302.method1372(this.aByteArray3, (int) (this.aLong17 - this.aLong15), arg1, 0, local125);
				this.aLong17 += local125;
				arg0 -= local125;
				arg2 = local125;
			}
			if (this.aByteArray3.length < arg0) {
				this.aClass97_1.method2933(this.aLong17);
				this.aLong16 = this.aLong17;
				while (arg0 > 0) {
					local125 = this.aClass97_1.method2929(arg2, arg0, arg1);
					if (local125 == -1) {
						break;
					}
					this.aLong16 += local125;
					arg2 += local125;
					this.aLong17 += local125;
					arg0 -= local125;
				}
			} else if (arg0 > 0) {
				this.method233();
				local125 = arg0;
				if (this.anInt303 < arg0) {
					local125 = this.anInt303;
				}
				arg0 -= local125;
				Static302.method1372(this.aByteArray3, 0, arg1, arg2, local125);
				this.aLong17 += local125;
				arg2 += local125;
			}
			if (this.aLong14 != -1L) {
				if (this.aLong14 > this.aLong17 && arg0 > 0) {
					local125 = arg2 + (int) (this.aLong14 - this.aLong17);
					if (arg0 + arg2 < local125) {
						local125 = arg0 + arg2;
					}
					while (local125 > arg2) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong17++;
					}
				}
				@Pc(320) long local320 = -1L;
				if (this.aLong14 + (long) this.anInt299 > local85 && local85 + (long) local96 >= (long) this.anInt299 + this.aLong14) {
					local320 = (long) this.anInt299 + this.aLong14;
				} else if (local85 + (long) local96 > this.aLong14 && this.aLong14 + (long) this.anInt299 >= local85 - -((long) local96)) {
					local320 = (long) local96 + local85;
				}
				@Pc(384) long local384 = -1L;
				if (local85 <= this.aLong14 && this.aLong14 < local85 + (long) local96) {
					local384 = this.aLong14;
				} else if (local85 >= this.aLong14 && local85 < (long) this.anInt299 + this.aLong14) {
					local384 = local85;
				}
				if (local384 > -1L && local320 > local384) {
					@Pc(443) int local443 = (int) (local320 - local384);
					Static302.method1372(this.aByteArray2, (int) (local384 - this.aLong14), arg1, (int) (local384 - local85), local443);
					if (this.aLong17 < local320) {
						arg0 = (int) ((long) arg0 + this.aLong17 - local320);
						this.aLong17 = local320;
					}
				}
			}
		} catch (@Pc(482) IOException local482) {
			this.aLong16 = -1L;
			throw local482;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(JI)V")
	public void method236(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method239());
		}
		this.aLong17 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([BI)V")
	public void method238(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method235(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)Ljava/io/File;")
	private File method239() {
		return this.aClass97_1.method2928();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)J")
	public long method243() {
		return this.aLong19;
	}
}
