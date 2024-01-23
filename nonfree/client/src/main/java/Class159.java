import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class159 {

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	private int anInt5169;

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "J")
	private long aLong203 = -1L;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	private int anInt5163 = 0;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "J")
	private long aLong206 = -1L;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!he;")
	private Class70 aClass70_1;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "J")
	private long aLong202;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "J")
	private long aLong204;

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!he;II)V")
	public Class159(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass70_1 = arg0;
		this.aLong204 = this.aLong202 = arg0.method1686();
		this.aByteArray71 = new byte[arg2];
		this.aByteArray70 = new byte[arg1];
		this.aLong205 = 0L;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)J")
	public long method4235() {
		return this.aLong204;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	private void method4238() throws IOException {
		this.anInt5169 = 0;
		if (this.aLong207 != this.aLong205) {
			this.aClass70_1.method1690(this.aLong205);
			this.aLong207 = this.aLong205;
		}
		this.aLong206 = this.aLong205;
		while (this.aByteArray70.length > this.anInt5169) {
			@Pc(54) int local54 = this.aByteArray70.length - this.anInt5169;
			if (local54 > 200000000) {
				local54 = 200000000;
			}
			@Pc(72) int local72 = this.aClass70_1.method1689(local54, this.anInt5169, this.aByteArray70);
			if (local72 == -1) {
				break;
			}
			this.anInt5169 += local72;
			this.aLong207 += local72;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III[B)V")
	public void method4239(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong204 < this.aLong205 + (long) arg0) {
				this.aLong204 = (long) arg0 + this.aLong205;
			}
			if (this.aLong203 != -1L && (this.aLong205 < this.aLong203 || this.aLong205 > this.aLong203 + (long) this.anInt5163)) {
				this.method4246();
			}
			if (this.aLong203 != -1L && (long) this.aByteArray71.length + this.aLong203 < this.aLong205 + (long) arg0) {
				@Pc(91) int local91 = (int) (this.aLong203 + (long) this.aByteArray71.length - this.aLong205);
				arg0 -= local91;
				Static326.method4270(arg2, arg1, this.aByteArray71, (int) (this.aLong205 - this.aLong203), local91);
				this.aLong205 += local91;
				this.anInt5163 = this.aByteArray71.length;
				arg1 += local91;
				this.method4246();
			}
			if (this.aByteArray71.length < arg0) {
				if (this.aLong207 != this.aLong205) {
					this.aClass70_1.method1690(this.aLong205);
					this.aLong207 = this.aLong205;
				}
				this.aClass70_1.method1688(arg2, arg0, arg1);
				this.aLong207 += arg0;
				@Pc(166) long local166 = -1L;
				if (this.aLong207 > this.aLong202) {
					this.aLong202 = this.aLong207;
				}
				if (this.aLong206 <= this.aLong205 && this.aLong205 < this.aLong206 + (long) this.anInt5169) {
					local166 = this.aLong205;
				} else if (this.aLong205 <= this.aLong206 && this.aLong206 < this.aLong205 + (long) arg0) {
					local166 = this.aLong206;
				}
				@Pc(231) long local231 = -1L;
				if ((long) arg0 + this.aLong205 > this.aLong206 && (long) arg0 + this.aLong205 <= (long) this.anInt5169 + this.aLong206) {
					local231 = this.aLong205 + (long) arg0;
				} else if (this.aLong206 + (long) this.anInt5169 > this.aLong205 && (long) this.anInt5169 + this.aLong206 <= (long) arg0 + this.aLong205) {
					local231 = (long) this.anInt5169 + this.aLong206;
				}
				if (local166 > -1L && local231 > local166) {
					@Pc(321) int local321 = (int) (local231 - local166);
					Static326.method4270(arg2, (int) (local166 + (long) arg1 - this.aLong205), this.aByteArray70, (int) (local166 - this.aLong206), local321);
				}
				this.aLong205 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong203 == -1L) {
					this.aLong203 = this.aLong205;
				}
				Static326.method4270(arg2, arg1, this.aByteArray71, (int) (this.aLong205 - this.aLong203), arg0);
				this.aLong205 += arg0;
				if ((long) this.anInt5163 < this.aLong205 - this.aLong203) {
					this.anInt5163 = (int) (this.aLong205 - this.aLong203);
				}
			}
		} catch (@Pc(406) IOException local406) {
			this.aLong207 = -1L;
			throw local406;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([BI)V")
	public void method4240(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4242(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Ljava/io/File;")
	private File method4241() {
		return this.aClass70_1.method1691();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([BIII)V")
	public void method4242(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong203 != -1L && this.aLong203 <= this.aLong205 && this.aLong205 + (long) arg1 <= (long) this.anInt5163 + this.aLong203) {
				Static326.method4270(this.aByteArray71, (int) (this.aLong205 - this.aLong203), arg0, 0, arg1);
				this.aLong205 += arg1;
				return;
			}
			@Pc(71) long local71 = this.aLong205;
			@Pc(75) int local75 = arg1;
			@Pc(112) int local112;
			if (this.aLong205 >= this.aLong206 && this.aLong206 + (long) this.anInt5169 > this.aLong205) {
				local112 = (int) (this.aLong206 + (long) this.anInt5169 - this.aLong205);
				if (local112 > arg1) {
					local112 = arg1;
				}
				Static326.method4270(this.aByteArray70, (int) (this.aLong205 - this.aLong206), arg0, 0, local112);
				arg2 = local112;
				this.aLong205 += local112;
				arg1 -= local112;
			}
			if (this.aByteArray70.length < arg1) {
				this.aClass70_1.method1690(this.aLong205);
				this.aLong207 = this.aLong205;
				while (arg1 > 0) {
					local112 = this.aClass70_1.method1689(arg1, arg2, arg0);
					if (local112 == -1) {
						break;
					}
					this.aLong205 += local112;
					arg1 -= local112;
					arg2 += local112;
					this.aLong207 += local112;
				}
			} else if (arg1 > 0) {
				this.method4238();
				local112 = arg1;
				if (this.anInt5169 < arg1) {
					local112 = this.anInt5169;
				}
				Static326.method4270(this.aByteArray70, 0, arg0, arg2, local112);
				arg1 -= local112;
				arg2 += local112;
				this.aLong205 += local112;
			}
			if (this.aLong203 != -1L) {
				if (this.aLong205 < this.aLong203 && arg1 > 0) {
					local112 = arg2 + (int) (this.aLong203 - this.aLong205);
					if (local112 > arg2 + arg1) {
						local112 = arg2 + arg1;
					}
					while (local112 > arg2) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong205++;
					}
				}
				@Pc(321) long local321 = -1L;
				if (local71 <= this.aLong203 && this.aLong203 < local71 + (long) local75) {
					local321 = this.aLong203;
				} else if (local71 >= this.aLong203 && (long) this.anInt5163 + this.aLong203 > local71) {
					local321 = local71;
				}
				@Pc(362) long local362 = -1L;
				if ((long) this.anInt5163 + this.aLong203 > local71 && (long) this.anInt5163 + this.aLong203 <= (long) local75 + local71) {
					local362 = this.aLong203 + (long) this.anInt5163;
				} else if ((long) local75 + local71 > this.aLong203 && local71 + (long) local75 <= (long) this.anInt5163 + this.aLong203) {
					local362 = local71 + (long) local75;
				}
				if (local321 > -1L && local362 > local321) {
					@Pc(430) int local430 = (int) (local362 - local321);
					Static326.method4270(this.aByteArray71, (int) (local321 - this.aLong203), arg0, (int) (local321 - local71), local430);
					if (local362 > this.aLong205) {
						arg1 = (int) ((long) arg1 + this.aLong205 - local362);
						this.aLong205 = local362;
					}
				}
			}
		} catch (@Pc(469) IOException local469) {
			this.aLong207 = -1L;
			throw local469;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(JI)V")
	public void method4243(@OriginalArg(0) long arg0) throws IOException {
		if ((long) 0 > arg0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4241());
		}
		this.aLong205 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
	private void method4246() throws IOException {
		if (this.aLong203 == -1L) {
			return;
		}
		if (this.aLong207 != this.aLong203) {
			this.aClass70_1.method1690(this.aLong203);
			this.aLong207 = this.aLong203;
		}
		this.aClass70_1.method1688(this.aByteArray71, this.anInt5163, 0);
		@Pc(39) long local39 = -1L;
		@Pc(41) long local41 = -1L;
		if (this.aLong206 <= this.aLong203 && this.aLong206 + (long) this.anInt5169 > this.aLong203) {
			local39 = this.aLong203;
		} else if (this.aLong203 <= this.aLong206 && (long) this.anInt5163 + this.aLong203 > this.aLong206) {
			local39 = this.aLong206;
		}
		if (this.aLong206 < this.aLong203 + (long) this.anInt5163 && this.aLong203 + (long) this.anInt5163 <= this.aLong206 - -((long) this.anInt5169)) {
			local41 = this.aLong203 + (long) this.anInt5163;
		} else if ((long) this.anInt5169 + this.aLong206 > this.aLong203 && (long) this.anInt5163 + this.aLong203 >= this.aLong206 - -((long) this.anInt5169)) {
			local41 = (long) this.anInt5169 + this.aLong206;
		}
		this.aLong207 += this.anInt5163;
		if (this.aLong207 > this.aLong202) {
			this.aLong202 = this.aLong207;
		}
		if (local39 > -1L && local39 < local41) {
			@Pc(206) int local206 = (int) (local41 - local39);
			Static326.method4270(this.aByteArray71, (int) (local39 - this.aLong203), this.aByteArray70, (int) (local39 - this.aLong206), local206);
		}
		this.anInt5163 = 0;
		this.aLong203 = -1L;
	}
}
