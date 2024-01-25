import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class151 {

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "J")
	private long aLong108;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
	private int anInt4304;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "J")
	private long aLong106 = -1L;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "J")
	private long aLong107 = -1L;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
	private int anInt4307 = 0;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "Lclient!vm;")
	private final Class373 aClass373_1;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "J")
	private long aLong105;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "[B")
	private final byte[] aByteArray36;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "[B")
	private final byte[] aByteArray37;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!vm;II)V")
	public Class151(@OriginalArg(0) Class373 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass373_1 = arg0;
		this.aLong110 = this.aLong105 = arg0.method8635();
		this.aByteArray36 = new byte[arg1];
		this.aLong109 = 0L;
		this.aByteArray37 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
	private void method3645() throws IOException {
		this.anInt4304 = 0;
		if (this.aLong109 != this.aLong108) {
			this.aClass373_1.method8644(this.aLong109);
			this.aLong108 = this.aLong109;
		}
		this.aLong107 = this.aLong109;
		while (this.aByteArray36.length > this.anInt4304) {
			@Pc(39) int local39 = this.aByteArray36.length - this.anInt4304;
			if (local39 > 200000000) {
				local39 = 200000000;
			}
			@Pc(54) int local54 = this.aClass373_1.method8637(local39, this.aByteArray36, this.anInt4304);
			if (local54 == -1) {
				break;
			}
			this.anInt4304 += local54;
			this.aLong108 += (long) local54;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([BB)V")
	public void method3646(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method3647(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([BIII)V")
	public void method3647(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong106 != -1L && this.aLong109 >= this.aLong106 && (long) arg1 + this.aLong109 <= this.aLong106 + (long) this.anInt4307) {
				Static686.method4972(this.aByteArray37, (int) (this.aLong109 - this.aLong106), arg0, 0, arg1);
				this.aLong109 += (long) arg1;
				return;
			}
			@Pc(83) long local83 = this.aLong109;
			@Pc(87) int local87 = arg1;
			@Pc(118) int local118;
			if (this.aLong109 >= this.aLong107 && this.aLong109 < (long) this.anInt4304 + this.aLong107) {
				local118 = (int) (this.aLong107 + (long) this.anInt4304 - this.aLong109);
				if (arg1 < local118) {
					local118 = arg1;
				}
				Static686.method4972(this.aByteArray36, (int) (this.aLong109 - this.aLong107), arg0, 0, local118);
				arg2 = local118;
				arg1 -= local118;
				this.aLong109 += (long) local118;
			}
			if (arg1 > this.aByteArray36.length) {
				this.aClass373_1.method8644(this.aLong109);
				this.aLong108 = this.aLong109;
				while (arg1 > 0) {
					local118 = this.aClass373_1.method8637(arg1, arg0, arg2);
					if (local118 == -1) {
						break;
					}
					this.aLong109 += (long) local118;
					this.aLong108 += (long) local118;
					arg1 -= local118;
					arg2 += local118;
				}
			} else if (arg1 > 0) {
				this.method3645();
				local118 = arg1;
				if (this.anInt4304 < arg1) {
					local118 = this.anInt4304;
				}
				Static686.method4972(this.aByteArray36, 0, arg0, arg2, local118);
				arg1 -= local118;
				arg2 += local118;
				this.aLong109 += (long) local118;
			}
			if (this.aLong106 != -1L) {
				if (this.aLong106 > this.aLong109 && arg1 > 0) {
					local118 = arg2 + (int) (this.aLong106 - this.aLong109);
					if (arg1 + arg2 < local118) {
						local118 = arg1 + arg2;
					}
					while (local118 > arg2) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong109++;
					}
				}
				@Pc(302) long local302 = -1L;
				if (this.aLong106 >= local83 && this.aLong106 < local83 + (long) local87) {
					local302 = this.aLong106;
				} else if (this.aLong106 <= local83 && this.aLong106 + (long) this.anInt4307 > local83) {
					local302 = local83;
				}
				@Pc(341) long local341 = -1L;
				if (local83 < (long) this.anInt4307 + this.aLong106 && (long) this.anInt4307 + this.aLong106 <= (long) local87 + local83) {
					local341 = this.aLong106 + (long) this.anInt4307;
				} else if ((long) local87 + local83 > this.aLong106 && (long) local87 + local83 <= this.aLong106 - -((long) this.anInt4307)) {
					local341 = local83 + (long) local87;
				}
				if (local302 > -1L && local341 > local302) {
					@Pc(420) int local420 = (int) (local341 - local302);
					Static686.method4972(this.aByteArray37, (int) (local302 - this.aLong106), arg0, (int) (local302 - local83), local420);
					if (local341 > this.aLong109) {
						arg1 = (int) ((long) arg1 + this.aLong109 - local341);
						this.aLong109 = local341;
					}
				}
			}
		} catch (@Pc(457) IOException local457) {
			this.aLong108 = -1L;
			throw local457;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	public void method3648() throws IOException {
		this.method3653();
		this.aClass373_1.method8641();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(JZ)V")
	public void method3649(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3651());
		}
		this.aLong109 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II[BI)V")
	public void method3650(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong109 + (long) arg2 > this.aLong110) {
				this.aLong110 = this.aLong109 + (long) arg2;
			}
			if (this.aLong106 != -1L && (this.aLong109 < this.aLong106 || this.aLong109 > this.aLong106 + (long) this.anInt4307)) {
				this.method3653();
			}
			if (this.aLong106 != -1L && this.aLong106 + (long) this.aByteArray37.length < (long) arg2 + this.aLong109) {
				@Pc(90) int local90 = (int) (this.aLong106 + (long) this.aByteArray37.length - this.aLong109);
				Static686.method4972(arg1, arg0, this.aByteArray37, (int) (this.aLong109 - this.aLong106), local90);
				arg2 -= local90;
				this.aLong109 += (long) local90;
				arg0 += local90;
				this.anInt4307 = this.aByteArray37.length;
				this.method3653();
			}
			if (arg2 > this.aByteArray37.length) {
				if (this.aLong108 != this.aLong109) {
					this.aClass373_1.method8644(this.aLong109);
					this.aLong108 = this.aLong109;
				}
				this.aClass373_1.method8638(arg1, arg2, arg0);
				this.aLong108 += (long) arg2;
				if (this.aLong108 > this.aLong105) {
					this.aLong105 = this.aLong108;
				}
				@Pc(177) long local177 = -1L;
				if (this.aLong109 >= this.aLong107 && this.aLong107 + (long) this.anInt4304 > this.aLong109) {
					local177 = this.aLong109;
				} else if (this.aLong109 <= this.aLong107 && this.aLong109 + (long) arg2 > this.aLong107) {
					local177 = this.aLong107;
				}
				@Pc(226) long local226 = -1L;
				if (this.aLong109 + (long) arg2 > this.aLong107 && this.aLong109 + (long) arg2 <= (long) this.anInt4304 + this.aLong107) {
					local226 = this.aLong109 + (long) arg2;
				} else if (this.aLong109 < (long) this.anInt4304 + this.aLong107 && this.aLong109 + (long) arg2 >= this.aLong107 - -((long) this.anInt4304)) {
					local226 = this.aLong107 + (long) this.anInt4304;
				}
				if (local177 > -1L && local177 < local226) {
					@Pc(316) int local316 = (int) (local226 - local177);
					Static686.method4972(arg1, (int) ((long) arg0 + local177 - this.aLong109), this.aByteArray36, (int) (local177 - this.aLong107), local316);
				}
				this.aLong109 += (long) arg2;
			} else if (arg2 > 0) {
				if (this.aLong106 == -1L) {
					this.aLong106 = this.aLong109;
				}
				Static686.method4972(arg1, arg0, this.aByteArray37, (int) (this.aLong109 - this.aLong106), arg2);
				this.aLong109 += (long) arg2;
				if (this.aLong109 - this.aLong106 > (long) this.anInt4307) {
					this.anInt4307 = (int) (this.aLong109 - this.aLong106);
				}
			}
		} catch (@Pc(407) IOException local407) {
			this.aLong108 = -1L;
			throw local407;
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method3651() {
		return this.aClass373_1.method8640();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
	private void method3653() throws IOException {
		if (this.aLong106 == -1L) {
			return;
		}
		if (this.aLong106 != this.aLong108) {
			this.aClass373_1.method8644(this.aLong106);
			this.aLong108 = this.aLong106;
		}
		this.aClass373_1.method8638(this.aByteArray37, this.anInt4307, 0);
		this.aLong108 += (long) this.anInt4307;
		if (this.aLong105 < this.aLong108) {
			this.aLong105 = this.aLong108;
		}
		@Pc(66) long local66 = -1L;
		@Pc(68) long local68 = -1L;
		if (this.aLong106 >= this.aLong107 && this.aLong106 < this.aLong107 + (long) this.anInt4304) {
			local66 = this.aLong106;
		} else if (this.aLong107 >= this.aLong106 && this.aLong107 < (long) this.anInt4307 + this.aLong106) {
			local66 = this.aLong107;
		}
		if ((long) this.anInt4307 + this.aLong106 > this.aLong107 && (long) this.anInt4307 + this.aLong106 <= this.aLong107 - -((long) this.anInt4304)) {
			local68 = this.aLong106 + (long) this.anInt4307;
		} else if ((long) this.anInt4304 + this.aLong107 > this.aLong106 && this.aLong107 + (long) this.anInt4304 <= this.aLong106 - -((long) this.anInt4307)) {
			local68 = this.aLong107 + (long) this.anInt4304;
		}
		if (local66 > -1L && local68 > local66) {
			@Pc(202) int local202 = (int) (local68 - local66);
			Static686.method4972(this.aByteArray37, (int) (local66 - this.aLong106), this.aByteArray36, (int) (local66 - this.aLong107), local202);
		}
		this.aLong106 = -1L;
		this.anInt4307 = 0;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)J")
	public long method3654() {
		return this.aLong110;
	}
}
