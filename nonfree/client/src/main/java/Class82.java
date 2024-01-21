import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class82 {

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt3321;

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "J")
	private long aLong103 = -1L;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "J")
	private long aLong104 = -1L;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
	private int anInt3326 = 0;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!pa;")
	private final Class75 aClass75_4;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "[B")
	private final byte[] aByteArray38;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "J")
	private long aLong105;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "[B")
	private final byte[] aByteArray37;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!pa;II)V")
	public Class82(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass75_4 = arg0;
		this.aLong102 = this.aLong106 = arg0.method2157();
		this.aByteArray38 = new byte[arg2];
		this.aLong105 = 0L;
		this.aByteArray37 = new byte[arg1];
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public void method2431() throws IOException {
		this.method2434();
		this.aClass75_4.method2153();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[B)V")
	public void method2432(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method2433(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BII)V")
	public void method2433(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong104 != -1L && this.aLong105 >= this.aLong104 && this.aLong105 + (long) arg1 <= (long) this.anInt3326 + this.aLong104) {
				Static218.method2016(this.aByteArray38, (int) (this.aLong105 - this.aLong104), arg0, 0, arg1);
				this.aLong105 += arg1;
				return;
			}
			@Pc(71) int local71 = arg1;
			@Pc(74) long local74 = this.aLong105;
			@Pc(104) int local104;
			if (this.aLong105 >= this.aLong103 && this.aLong105 < this.aLong103 + (long) this.anInt3321) {
				local104 = (int) ((long) this.anInt3321 + this.aLong103 - this.aLong105);
				if (arg1 < local104) {
					local104 = arg1;
				}
				arg1 -= local104;
				Static218.method2016(this.aByteArray37, (int) (this.aLong105 - this.aLong103), arg0, 0, local104);
				this.aLong105 += local104;
				arg2 = local104;
			}
			if (this.aByteArray37.length < arg1) {
				this.aClass75_4.method2155(this.aLong105);
				this.aLong107 = this.aLong105;
				while (arg1 > 0) {
					local104 = this.aClass75_4.method2156(arg2, arg0, arg1);
					if (local104 == -1) {
						break;
					}
					this.aLong105 += local104;
					this.aLong107 += local104;
					arg2 += local104;
					arg1 -= local104;
				}
			} else if (arg1 > 0) {
				this.method2438();
				local104 = arg1;
				if (arg1 > this.anInt3321) {
					local104 = this.anInt3321;
				}
				arg1 -= local104;
				Static218.method2016(this.aByteArray37, 0, arg0, arg2, local104);
				arg2 += local104;
				this.aLong105 += local104;
			}
			if (this.aLong104 != -1L) {
				if (this.aLong105 < this.aLong104 && arg1 > 0) {
					local104 = (int) (this.aLong104 - this.aLong105) + arg2;
					if (arg2 + arg1 < local104) {
						local104 = arg2 + arg1;
					}
					while (arg2 < local104) {
						arg0[arg2++] = 0;
						arg1--;
						this.aLong105++;
					}
				}
				@Pc(289) long local289 = -1L;
				@Pc(291) long local291 = -1L;
				if (local74 <= this.aLong104 && local74 + (long) local71 > this.aLong104) {
					local291 = this.aLong104;
				} else if (local74 >= this.aLong104 && this.aLong104 + (long) this.anInt3326 > local74) {
					local291 = local74;
				}
				if ((long) this.anInt3326 + this.aLong104 > local74 && (long) local71 + local74 >= this.aLong104 + (long) this.anInt3326) {
					local289 = (long) this.anInt3326 + this.aLong104;
				} else if (this.aLong104 < local74 + (long) local71 && local74 + (long) local71 <= (long) this.anInt3326 + this.aLong104) {
					local289 = (long) local71 + local74;
				}
				if (local291 > -1L && local289 > local291) {
					@Pc(406) int local406 = (int) (local289 - local291);
					Static218.method2016(this.aByteArray38, (int) (local291 - this.aLong104), arg0, (int) (local291 - local74), local406);
					if (this.aLong105 < local289) {
						arg1 = (int) ((long) arg1 + this.aLong105 - local289);
						this.aLong105 = local289;
					}
				}
			}
		} catch (@Pc(447) IOException local447) {
			this.aLong107 = -1L;
			throw local447;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	private void method2434() throws IOException {
		if (this.aLong104 == -1L) {
			return;
		}
		if (this.aLong107 != this.aLong104) {
			this.aClass75_4.method2155(this.aLong104);
			this.aLong107 = this.aLong104;
		}
		this.aClass75_4.method2158(this.anInt3326, 0, this.aByteArray38);
		this.aLong107 += this.anInt3326;
		@Pc(45) long local45 = -1L;
		@Pc(47) long local47 = -1L;
		if ((long) this.anInt3326 + this.aLong104 > this.aLong103 && this.aLong103 + (long) this.anInt3321 >= this.aLong104 + (long) this.anInt3326) {
			local47 = this.aLong104 + (long) this.anInt3326;
		} else if (this.aLong104 < this.aLong103 + (long) this.anInt3321 && (long) this.anInt3326 + this.aLong104 >= this.aLong103 - -((long) this.anInt3321)) {
			local47 = this.aLong103 + (long) this.anInt3321;
		}
		if (this.aLong104 >= this.aLong103 && this.aLong103 + (long) this.anInt3321 > this.aLong104) {
			local45 = this.aLong104;
		} else if (this.aLong104 <= this.aLong103 && this.aLong103 < this.aLong104 + (long) this.anInt3326) {
			local45 = this.aLong103;
		}
		if (this.aLong107 > this.aLong106) {
			this.aLong106 = this.aLong107;
		}
		if (local45 > -1L && local45 < local47) {
			@Pc(196) int local196 = (int) (local47 - local45);
			Static218.method2016(this.aByteArray38, (int) (local45 - this.aLong104), this.aByteArray37, (int) (local45 - this.aLong103), local196);
		}
		this.anInt3326 = 0;
		this.aLong104 = -1L;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method2436() {
		return this.aClass75_4.method2154();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([BIII)V")
	public void method2437(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong105 > this.aLong102) {
				this.aLong102 = (long) arg1 + this.aLong105;
			}
			if (this.aLong104 != -1L && (this.aLong105 < this.aLong104 || this.aLong105 > this.aLong104 + (long) this.anInt3326)) {
				this.method2434();
			}
			if (this.aLong104 != -1L && (long) this.aByteArray38.length + this.aLong104 < (long) arg1 + this.aLong105) {
				@Pc(93) int local93 = (int) (this.aLong104 + (long) this.aByteArray38.length - this.aLong105);
				arg1 -= local93;
				Static218.method2016(arg0, arg2, this.aByteArray38, (int) (this.aLong105 - this.aLong104), local93);
				arg2 += local93;
				this.aLong105 += local93;
				this.anInt3326 = this.aByteArray38.length;
				this.method2434();
			}
			if (this.aByteArray38.length < arg1) {
				if (this.aLong107 != this.aLong105) {
					this.aClass75_4.method2155(this.aLong105);
					this.aLong107 = this.aLong105;
				}
				@Pc(151) long local151 = -1L;
				@Pc(153) long local153 = -1L;
				this.aClass75_4.method2158(arg1, arg2, arg0);
				if (this.aLong103 <= this.aLong105 && this.aLong103 + (long) this.anInt3321 > this.aLong105) {
					local151 = this.aLong105;
				} else if (this.aLong103 >= this.aLong105 && this.aLong105 + (long) arg1 > this.aLong103) {
					local151 = this.aLong103;
				}
				this.aLong107 += arg1;
				if (this.aLong103 < this.aLong105 + (long) arg1 && this.aLong105 + (long) arg1 <= this.aLong103 - -((long) this.anInt3321)) {
					local153 = (long) arg1 + this.aLong105;
				} else if (this.aLong105 < this.aLong103 + (long) this.anInt3321 && (long) this.anInt3321 + this.aLong103 <= this.aLong105 + (long) arg1) {
					local153 = this.aLong103 + (long) this.anInt3321;
				}
				if (this.aLong107 > this.aLong106) {
					this.aLong106 = this.aLong107;
				}
				if (local151 > -1L && local153 > local151) {
					@Pc(317) int local317 = (int) (local153 - local151);
					Static218.method2016(arg0, (int) ((long) arg2 + local151 - this.aLong105), this.aByteArray37, (int) (local151 - this.aLong103), local317);
				}
				this.aLong105 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong104 == -1L) {
					this.aLong104 = this.aLong105;
				}
				Static218.method2016(arg0, arg2, this.aByteArray38, (int) (this.aLong105 - this.aLong104), arg1);
				this.aLong105 += arg1;
				if ((long) this.anInt3326 < this.aLong105 - this.aLong104) {
					this.anInt3326 = (int) (this.aLong105 - this.aLong104);
				}
			}
		} catch (@Pc(398) IOException local398) {
			this.aLong107 = -1L;
			throw local398;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	private void method2438() throws IOException {
		this.anInt3321 = 0;
		if (this.aLong105 != this.aLong107) {
			this.aClass75_4.method2155(this.aLong105);
			this.aLong107 = this.aLong105;
		}
		this.aLong103 = this.aLong105;
		while (this.aByteArray37.length > this.anInt3321) {
			@Pc(40) int local40 = this.aByteArray37.length - this.anInt3321;
			if (local40 > 200000000) {
				local40 = 200000000;
			}
			@Pc(55) int local55 = this.aClass75_4.method2156(this.anInt3321, this.aByteArray37, local40);
			if (local55 == -1) {
				break;
			}
			this.anInt3321 += local55;
			this.aLong107 += local55;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)V")
	public void method2441(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < (long) 0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2436());
		}
		this.aLong105 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)J")
	public long method2442() {
		return this.aLong102;
	}
}
