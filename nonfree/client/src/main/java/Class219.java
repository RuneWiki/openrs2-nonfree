import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class219 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	private int anInt6150;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "J")
	private long aLong191;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	private int anInt6149 = 0;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "J")
	private long aLong188 = -1L;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "J")
	private long aLong186 = -1L;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!hh;")
	private final Class98 aClass98_4;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "J")
	private long aLong190;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "J")
	private long aLong189;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "[B")
	private final byte[] aByteArray82;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[B")
	private final byte[] aByteArray83;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "J")
	private long aLong187;

	static {
		new Class119("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!hh;II)V")
	public Class219(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass98_4 = arg0;
		this.aLong189 = this.aLong190 = arg0.method2225();
		this.aByteArray82 = new byte[arg2];
		this.aByteArray83 = new byte[arg1];
		this.aLong187 = 0L;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IJ)V")
	public void method4836(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4846());
		}
		this.aLong187 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([BIBI)V")
	public void method4837(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong186 != -1L && this.aLong186 <= this.aLong187 && (long) this.anInt6149 + this.aLong186 >= (long) arg1 + this.aLong187) {
				Static468.method5036(this.aByteArray82, (int) (this.aLong187 - this.aLong186), arg0, 0, arg1);
				this.aLong187 += arg1;
				return;
			}
			@Pc(70) long local70 = this.aLong187;
			@Pc(74) int local74 = arg1;
			@Pc(109) int local109;
			if (this.aLong187 >= this.aLong188 && this.aLong187 < this.aLong188 + (long) this.anInt6150) {
				local109 = (int) (this.aLong188 + (long) this.anInt6150 - this.aLong187);
				if (local109 > arg1) {
					local109 = arg1;
				}
				Static468.method5036(this.aByteArray83, (int) (this.aLong187 - this.aLong188), arg0, 0, local109);
				arg2 = local109;
				this.aLong187 += local109;
				arg1 -= local109;
			}
			if (arg1 > this.aByteArray83.length) {
				this.aClass98_4.method2226(this.aLong187);
				this.aLong191 = this.aLong187;
				while (arg1 > 0) {
					local109 = this.aClass98_4.method2223(arg1, arg2, arg0);
					if (local109 == -1) {
						break;
					}
					this.aLong187 += local109;
					arg1 -= local109;
					arg2 += local109;
					this.aLong191 += local109;
				}
			} else if (arg1 > 0) {
				this.method4838();
				local109 = arg1;
				if (this.anInt6150 < arg1) {
					local109 = this.anInt6150;
				}
				Static468.method5036(this.aByteArray83, 0, arg0, arg2, local109);
				arg1 -= local109;
				arg2 += local109;
				this.aLong187 += local109;
			}
			if (this.aLong186 != -1L) {
				if (this.aLong187 < this.aLong186 && arg1 > 0) {
					local109 = (int) (this.aLong186 - this.aLong187) + arg2;
					if (local109 > arg1 + arg2) {
						local109 = arg1 + arg2;
					}
					while (arg2 < local109) {
						arg0[arg2++] = 0;
						arg1--;
						this.aLong187++;
					}
				}
				@Pc(305) long local305 = -1L;
				@Pc(307) long local307 = -1L;
				if (local70 <= this.aLong186 && (long) local74 + local70 > this.aLong186) {
					local305 = this.aLong186;
				} else if (this.aLong186 <= local70 && local70 < (long) this.anInt6149 + this.aLong186) {
					local305 = local70;
				}
				if (local70 < (long) this.anInt6149 + this.aLong186 && (long) this.anInt6149 + this.aLong186 <= local70 - -((long) local74)) {
					local307 = (long) this.anInt6149 + this.aLong186;
				} else if (this.aLong186 < local70 + (long) local74 && (long) local74 + local70 <= (long) this.anInt6149 + this.aLong186) {
					local307 = local70 + (long) local74;
				}
				if (local305 > -1L && local305 < local307) {
					@Pc(414) int local414 = (int) (local307 - local305);
					Static468.method5036(this.aByteArray82, (int) (local305 - this.aLong186), arg0, (int) (local305 - local70), local414);
					if (local307 > this.aLong187) {
						arg1 = (int) ((long) arg1 + this.aLong187 - local307);
						this.aLong187 = local307;
					}
				}
			}
		} catch (@Pc(452) IOException local452) {
			this.aLong191 = -1L;
			throw local452;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	private void method4838() throws IOException {
		this.anInt6150 = 0;
		if (this.aLong187 != this.aLong191) {
			this.aClass98_4.method2226(this.aLong187);
			this.aLong191 = this.aLong187;
		}
		this.aLong188 = this.aLong187;
		while (this.anInt6150 < this.aByteArray83.length) {
			@Pc(46) int local46 = this.aByteArray83.length - this.anInt6150;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(63) int local63 = this.aClass98_4.method2223(local46, this.anInt6150, this.aByteArray83);
			if (local63 == -1) {
				break;
			}
			this.aLong191 += local63;
			this.anInt6150 += local63;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)J")
	public long method4841() {
		return this.aLong189;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	private void method4844() throws IOException {
		if (this.aLong186 == -1L) {
			return;
		}
		if (this.aLong191 != this.aLong186) {
			this.aClass98_4.method2226(this.aLong186);
			this.aLong191 = this.aLong186;
		}
		this.aClass98_4.method2221(0, this.anInt6149, this.aByteArray82);
		this.aLong191 += this.anInt6149;
		if (this.aLong190 < this.aLong191) {
			this.aLong190 = this.aLong191;
		}
		@Pc(70) long local70 = -1L;
		@Pc(72) long local72 = -1L;
		if (this.aLong188 <= this.aLong186 && (long) this.anInt6150 + this.aLong188 > this.aLong186) {
			local70 = this.aLong186;
		} else if (this.aLong186 <= this.aLong188 && (long) this.anInt6149 + this.aLong186 > this.aLong188) {
			local70 = this.aLong188;
		}
		if (this.aLong188 < (long) this.anInt6149 + this.aLong186 && this.aLong188 + (long) this.anInt6150 >= this.aLong186 - -((long) this.anInt6149)) {
			local72 = this.aLong186 + (long) this.anInt6149;
		} else if (this.aLong186 < (long) this.anInt6150 + this.aLong188 && (long) this.anInt6150 + this.aLong188 <= (long) this.anInt6149 + this.aLong186) {
			local72 = (long) this.anInt6150 + this.aLong188;
		}
		if (local70 > -1L && local70 < local72) {
			@Pc(214) int local214 = (int) (local72 - local70);
			Static468.method5036(this.aByteArray82, (int) (local70 - this.aLong186), this.aByteArray83, (int) (local70 - this.aLong188), local214);
		}
		this.anInt6149 = 0;
		this.aLong186 = -1L;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[B)V")
	public void method4845(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4837(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method4846() {
		return this.aClass98_4.method2222();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI[BI)V")
	public void method4847(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong189 < this.aLong187 + (long) arg0) {
				this.aLong189 = (long) arg0 + this.aLong187;
			}
			if (this.aLong186 != -1L && (this.aLong186 > this.aLong187 || this.aLong186 + (long) this.anInt6149 < this.aLong187)) {
				this.method4844();
			}
			if (this.aLong186 != -1L && (long) this.aByteArray82.length + this.aLong186 < (long) arg0 + this.aLong187) {
				@Pc(103) int local103 = (int) (this.aLong186 + (long) this.aByteArray82.length - this.aLong187);
				Static468.method5036(arg1, arg2, this.aByteArray82, (int) (this.aLong187 - this.aLong186), local103);
				arg0 -= local103;
				this.aLong187 += local103;
				arg2 += local103;
				this.anInt6149 = this.aByteArray82.length;
				this.method4844();
			}
			if (this.aByteArray82.length < arg0) {
				if (this.aLong191 != this.aLong187) {
					this.aClass98_4.method2226(this.aLong187);
					this.aLong191 = this.aLong187;
				}
				this.aClass98_4.method2221(arg2, arg0, arg1);
				this.aLong191 += arg0;
				if (this.aLong191 > this.aLong190) {
					this.aLong190 = this.aLong191;
				}
				@Pc(194) long local194 = -1L;
				@Pc(196) long local196 = -1L;
				if (this.aLong187 >= this.aLong188 && this.aLong187 < this.aLong188 + (long) this.anInt6150) {
					local194 = this.aLong187;
				} else if (this.aLong188 >= this.aLong187 && this.aLong187 + (long) arg0 > this.aLong188) {
					local194 = this.aLong188;
				}
				if (this.aLong187 + (long) arg0 > this.aLong188 && this.aLong187 + (long) arg0 <= (long) this.anInt6150 + this.aLong188) {
					local196 = this.aLong187 + (long) arg0;
				} else if (this.aLong188 + (long) this.anInt6150 > this.aLong187 && this.aLong188 + (long) this.anInt6150 <= this.aLong187 - -((long) arg0)) {
					local196 = (long) this.anInt6150 + this.aLong188;
				}
				if (local194 > -1L && local194 < local196) {
					@Pc(326) int local326 = (int) (local196 - local194);
					Static468.method5036(arg1, (int) (local194 + (long) arg2 - this.aLong187), this.aByteArray83, (int) (local194 - this.aLong188), local326);
				}
				this.aLong187 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong186 == -1L) {
					this.aLong186 = this.aLong187;
				}
				Static468.method5036(arg1, arg2, this.aByteArray82, (int) (this.aLong187 - this.aLong186), arg0);
				this.aLong187 += arg0;
				if ((long) this.anInt6149 < this.aLong187 - this.aLong186) {
					this.anInt6149 = (int) (this.aLong187 - this.aLong186);
				}
			}
		} catch (@Pc(412) IOException local412) {
			this.aLong191 = -1L;
			throw local412;
		}
	}
}
