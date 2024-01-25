import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class265 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "I")
	private int anInt7740;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "I")
	private int anInt7738 = 0;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "J")
	private long aLong217 = -1L;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "J")
	private long aLong216 = -1L;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!ob;")
	private final Class208 aClass208_4;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "J")
	private long aLong213;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "[B")
	private final byte[] aByteArray105;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "[B")
	private final byte[] aByteArray106;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "J")
	private long aLong218;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!ob;II)V")
	public Class265(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass208_4 = arg0;
		this.aLong214 = this.aLong213 = arg0.method5702();
		this.aByteArray105 = new byte[arg2];
		this.aByteArray106 = new byte[arg1];
		this.aLong218 = 0L;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z[B)V")
	public void method6859(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method6861(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IBI[B)V")
	public void method6861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg0 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong217 != -1L && this.aLong218 >= this.aLong217 && (long) this.anInt7738 + this.aLong217 >= this.aLong218 - -((long) arg0)) {
				Static556.method7044(this.aByteArray105, (int) (this.aLong218 - this.aLong217), arg2, 0, arg0);
				this.aLong218 += arg0;
				return;
			}
			@Pc(92) long local92 = this.aLong218;
			@Pc(96) int local96 = arg0;
			@Pc(127) int local127;
			if (this.aLong218 >= this.aLong216 && this.aLong218 < this.aLong216 + (long) this.anInt7740) {
				local127 = (int) (this.aLong216 + (long) this.anInt7740 - this.aLong218);
				if (arg0 < local127) {
					local127 = arg0;
				}
				Static556.method7044(this.aByteArray106, (int) (this.aLong218 - this.aLong216), arg2, 0, local127);
				arg1 = local127;
				arg0 -= local127;
				this.aLong218 += local127;
			}
			if (this.aByteArray106.length < arg0) {
				this.aClass208_4.method5703(this.aLong218);
				this.aLong215 = this.aLong218;
				while (arg0 > 0) {
					local127 = this.aClass208_4.method5705(arg2, arg1, arg0);
					if (local127 == -1) {
						break;
					}
					this.aLong215 += local127;
					arg0 -= local127;
					arg1 += local127;
					this.aLong218 += local127;
				}
			} else if (arg0 > 0) {
				this.method6863();
				local127 = arg0;
				if (this.anInt7740 < arg0) {
					local127 = this.anInt7740;
				}
				Static556.method7044(this.aByteArray106, 0, arg2, arg1, local127);
				arg0 -= local127;
				this.aLong218 += local127;
				arg1 += local127;
			}
			if (this.aLong217 != -1L) {
				if (this.aLong218 < this.aLong217 && arg0 > 0) {
					local127 = (int) (this.aLong217 - this.aLong218) + arg1;
					if (local127 > arg1 + arg0) {
						local127 = arg1 + arg0;
					}
					while (local127 > arg1) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong218++;
					}
				}
				@Pc(323) long local323 = -1L;
				@Pc(325) long local325 = -1L;
				if (this.aLong217 >= local92 && (long) local96 + local92 > this.aLong217) {
					local323 = this.aLong217;
				} else if (this.aLong217 <= local92 && this.aLong217 + (long) this.anInt7738 > local92) {
					local323 = local92;
				}
				if ((long) this.anInt7738 + this.aLong217 > local92 && local92 + (long) local96 >= this.aLong217 - -((long) this.anInt7738)) {
					local325 = (long) this.anInt7738 + this.aLong217;
				} else if (this.aLong217 < local92 + (long) local96 && (long) this.anInt7738 + this.aLong217 >= local92 - -((long) local96)) {
					local325 = local92 + (long) local96;
				}
				if (local323 > -1L && local325 > local323) {
					@Pc(447) int local447 = (int) (local325 - local323);
					Static556.method7044(this.aByteArray105, (int) (local323 - this.aLong217), arg2, (int) (local323 - local92), local447);
					if (this.aLong218 < local325) {
						arg0 = (int) ((long) arg0 + this.aLong218 - local325);
						this.aLong218 = local325;
					}
				}
			}
		} catch (@Pc(484) IOException local484) {
			this.aLong215 = -1L;
			throw local484;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(JI)V")
	public void method6862(@OriginalArg(0) long arg0) throws IOException {
		if ((long) 0 > arg0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method6866());
		}
		this.aLong218 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	private void method6863() throws IOException {
		this.anInt7740 = 0;
		if (this.aLong218 != this.aLong215) {
			this.aClass208_4.method5703(this.aLong218);
			this.aLong215 = this.aLong218;
		}
		this.aLong216 = this.aLong218;
		while (this.anInt7740 < this.aByteArray106.length) {
			@Pc(50) int local50 = this.aByteArray106.length - this.anInt7740;
			if (local50 > 200000000) {
				local50 = 200000000;
			}
			@Pc(65) int local65 = this.aClass208_4.method5705(this.aByteArray106, this.anInt7740, local50);
			if (local65 == -1) {
				break;
			}
			this.anInt7740 += local65;
			this.aLong215 += local65;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	private void method6865() throws IOException {
		if (this.aLong217 == -1L) {
			return;
		}
		if (this.aLong217 != this.aLong215) {
			this.aClass208_4.method5703(this.aLong217);
			this.aLong215 = this.aLong217;
		}
		this.aClass208_4.method5701(0, this.aByteArray105, this.anInt7738);
		this.aLong215 += this.anInt7738;
		if (this.aLong215 > this.aLong213) {
			this.aLong213 = this.aLong215;
		}
		@Pc(57) long local57 = -1L;
		if (this.aLong216 <= this.aLong217 && this.aLong216 + (long) this.anInt7740 > this.aLong217) {
			local57 = this.aLong217;
		} else if (this.aLong216 >= this.aLong217 && (long) this.anInt7738 + this.aLong217 > this.aLong216) {
			local57 = this.aLong216;
		}
		@Pc(103) long local103 = -1L;
		if ((long) this.anInt7738 + this.aLong217 > this.aLong216 && this.aLong216 + (long) this.anInt7740 >= (long) this.anInt7738 + this.aLong217) {
			local103 = (long) this.anInt7738 + this.aLong217;
		} else if (this.aLong216 + (long) this.anInt7740 > this.aLong217 && this.aLong217 + (long) this.anInt7738 >= (long) this.anInt7740 + this.aLong216) {
			local103 = this.aLong216 + (long) this.anInt7740;
		}
		if (local57 > -1L && local103 > local57) {
			@Pc(197) int local197 = (int) (local103 - local57);
			Static556.method7044(this.aByteArray105, (int) (local57 - this.aLong217), this.aByteArray106, (int) (local57 - this.aLong216), local197);
		}
		this.anInt7738 = 0;
		this.aLong217 = -1L;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method6866() {
		return this.aClass208_4.method5700();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([BIBI)V")
	public void method6867(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong214 < (long) arg1 + this.aLong218) {
				this.aLong214 = (long) arg1 + this.aLong218;
			}
			if (this.aLong217 != -1L && (this.aLong217 > this.aLong218 || this.aLong217 + (long) this.anInt7738 < this.aLong218)) {
				this.method6865();
			}
			if (this.aLong217 != -1L && (long) this.aByteArray105.length + this.aLong217 < this.aLong218 - -((long) arg1)) {
				@Pc(88) int local88 = (int) ((long) this.aByteArray105.length + this.aLong217 - this.aLong218);
				Static556.method7044(arg0, arg2, this.aByteArray105, (int) (this.aLong218 - this.aLong217), local88);
				arg2 += local88;
				this.aLong218 += local88;
				arg1 -= local88;
				this.anInt7738 = this.aByteArray105.length;
				this.method6865();
			}
			if (this.aByteArray105.length < arg1) {
				if (this.aLong218 != this.aLong215) {
					this.aClass208_4.method5703(this.aLong218);
					this.aLong215 = this.aLong218;
				}
				this.aClass208_4.method5701(arg2, arg0, arg1);
				this.aLong215 += arg1;
				if (this.aLong215 > this.aLong213) {
					this.aLong213 = this.aLong215;
				}
				@Pc(171) long local171 = -1L;
				if (this.aLong216 <= this.aLong218 && (long) this.anInt7740 + this.aLong216 > this.aLong218) {
					local171 = this.aLong218;
				} else if (this.aLong216 >= this.aLong218 && this.aLong216 < this.aLong218 + (long) arg1) {
					local171 = this.aLong216;
				}
				@Pc(224) long local224 = -1L;
				if (this.aLong216 < (long) arg1 + this.aLong218 && this.aLong218 + (long) arg1 <= this.aLong216 - -((long) this.anInt7740)) {
					local224 = (long) arg1 + this.aLong218;
				} else if ((long) this.anInt7740 + this.aLong216 > this.aLong218 && (long) arg1 + this.aLong218 >= (long) this.anInt7740 + this.aLong216) {
					local224 = (long) this.anInt7740 + this.aLong216;
				}
				if (local171 > -1L && local171 < local224) {
					@Pc(308) int local308 = (int) (local224 - local171);
					Static556.method7044(arg0, (int) ((long) arg2 + local171 - this.aLong218), this.aByteArray106, (int) (local171 - this.aLong216), local308);
				}
				this.aLong218 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong217 == -1L) {
					this.aLong217 = this.aLong218;
				}
				Static556.method7044(arg0, arg2, this.aByteArray105, (int) (this.aLong218 - this.aLong217), arg1);
				this.aLong218 += arg1;
				if (this.aLong218 - this.aLong217 > (long) this.anInt7738) {
					this.anInt7738 = (int) (this.aLong218 - this.aLong217);
				}
			}
		} catch (@Pc(395) IOException local395) {
			this.aLong215 = -1L;
			throw local395;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)J")
	public long method6868() {
		return this.aLong214;
	}
}
