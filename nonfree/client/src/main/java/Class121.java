import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class121 {

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	private int anInt2543;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "J")
	private long aLong65 = -1L;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "J")
	private long aLong66 = -1L;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	private int anInt2541 = 0;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!sr;")
	private final Class317 aClass317_4;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "[B")
	private final byte[] aByteArray39;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "[B")
	private final byte[] aByteArray40;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!sr;II)V")
	public Class121(@OriginalArg(0) Class317 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass317_4 = arg0;
		this.aLong67 = this.aLong64 = arg0.method6334();
		this.aByteArray39 = new byte[arg2];
		this.aByteArray40 = new byte[arg1];
		this.aLong68 = 0L;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	private void method2178() throws IOException {
		this.anInt2543 = 0;
		if (this.aLong68 != this.aLong69) {
			this.aClass317_4.method6330(this.aLong68);
			this.aLong69 = this.aLong68;
		}
		this.aLong65 = this.aLong68;
		while (this.anInt2543 < this.aByteArray40.length) {
			@Pc(42) int local42 = this.aByteArray40.length - this.anInt2543;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(57) int local57 = this.aClass317_4.method6331(local42, this.aByteArray40, this.anInt2543);
			if (local57 == -1) {
				break;
			}
			this.anInt2543 += local57;
			this.aLong69 += local57;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public void method2179() throws IOException {
		this.method2180();
		this.aClass317_4.method6333();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	private void method2180() throws IOException {
		if (this.aLong66 == -1L) {
			return;
		}
		if (this.aLong66 != this.aLong69) {
			this.aClass317_4.method6330(this.aLong66);
			this.aLong69 = this.aLong66;
		}
		this.aClass317_4.method6335(0, this.anInt2541, this.aByteArray39);
		this.aLong69 += this.anInt2541;
		if (this.aLong64 < this.aLong69) {
			this.aLong64 = this.aLong69;
		}
		@Pc(61) long local61 = -1L;
		@Pc(63) long local63 = -1L;
		if (this.aLong66 >= this.aLong65 && this.aLong66 < this.aLong65 + (long) this.anInt2543) {
			local61 = this.aLong66;
		} else if (this.aLong65 >= this.aLong66 && this.aLong65 < this.aLong66 + (long) this.anInt2541) {
			local61 = this.aLong65;
		}
		if (this.aLong66 + (long) this.anInt2541 > this.aLong65 && this.aLong65 + (long) this.anInt2543 >= (long) this.anInt2541 + this.aLong66) {
			local63 = (long) this.anInt2541 + this.aLong66;
		} else if (this.aLong66 < this.aLong65 + (long) this.anInt2543 && (long) this.anInt2543 + this.aLong65 <= this.aLong66 - -((long) this.anInt2541)) {
			local63 = (long) this.anInt2543 + this.aLong65;
		}
		if (local61 > -1L && local63 > local61) {
			@Pc(204) int local204 = (int) (local63 - local61);
			Static598.method4261(this.aByteArray39, (int) (local61 - this.aLong66), this.aByteArray40, (int) (local61 - this.aLong65), local204);
		}
		this.aLong66 = -1L;
		this.anInt2541 = 0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BB)V")
	public void method2181(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method2184(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)J")
	public long method2182() {
		return this.aLong67;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III[B)V")
	public void method2183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong67 < this.aLong68 + (long) arg0) {
				this.aLong67 = this.aLong68 + (long) arg0;
			}
			if (this.aLong66 != -1L && (this.aLong68 < this.aLong66 || this.aLong68 > this.aLong66 + (long) this.anInt2541)) {
				this.method2180();
			}
			if (this.aLong66 != -1L && this.aLong66 + (long) this.aByteArray39.length < this.aLong68 + (long) arg0) {
				@Pc(98) int local98 = (int) (this.aLong66 + (long) this.aByteArray39.length - this.aLong68);
				Static598.method4261(arg2, arg1, this.aByteArray39, (int) (this.aLong68 - this.aLong66), local98);
				arg0 -= local98;
				this.aLong68 += local98;
				arg1 += local98;
				this.anInt2541 = this.aByteArray39.length;
				this.method2180();
			}
			if (this.aByteArray39.length < arg0) {
				if (this.aLong68 != this.aLong69) {
					this.aClass317_4.method6330(this.aLong68);
					this.aLong69 = this.aLong68;
				}
				this.aClass317_4.method6335(arg1, arg0, arg2);
				this.aLong69 += arg0;
				if (this.aLong64 < this.aLong69) {
					this.aLong64 = this.aLong69;
				}
				@Pc(185) long local185 = -1L;
				if (this.aLong65 <= this.aLong68 && (long) this.anInt2543 + this.aLong65 > this.aLong68) {
					local185 = this.aLong68;
				} else if (this.aLong65 >= this.aLong68 && this.aLong65 < (long) arg0 + this.aLong68) {
					local185 = this.aLong65;
				}
				@Pc(238) long local238 = -1L;
				if (this.aLong65 < this.aLong68 + (long) arg0 && (long) this.anInt2543 + this.aLong65 >= this.aLong68 + (long) arg0) {
					local238 = (long) arg0 + this.aLong68;
				} else if (this.aLong65 + (long) this.anInt2543 > this.aLong68 && this.aLong65 + (long) this.anInt2543 <= (long) arg0 + this.aLong68) {
					local238 = (long) this.anInt2543 + this.aLong65;
				}
				if (local185 > -1L && local238 > local185) {
					@Pc(331) int local331 = (int) (local238 - local185);
					Static598.method4261(arg2, (int) (local185 + (long) arg1 - this.aLong68), this.aByteArray40, (int) (local185 - this.aLong65), local331);
				}
				this.aLong68 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong66 == -1L) {
					this.aLong66 = this.aLong68;
				}
				Static598.method4261(arg2, arg1, this.aByteArray39, (int) (this.aLong68 - this.aLong66), arg0);
				this.aLong68 += arg0;
				if ((long) this.anInt2541 < this.aLong68 - this.aLong66) {
					this.anInt2541 = (int) (this.aLong68 - this.aLong66);
				}
			}
		} catch (@Pc(418) IOException local418) {
			this.aLong69 = -1L;
			throw local418;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIZI)V")
	public void method2184(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong66 != -1L && this.aLong66 <= this.aLong68 && (long) this.anInt2541 + this.aLong66 >= this.aLong68 + (long) arg2) {
				Static598.method4261(this.aByteArray39, (int) (this.aLong68 - this.aLong66), arg0, 0, arg2);
				this.aLong68 += arg2;
				return;
			}
			@Pc(77) long local77 = this.aLong68;
			@Pc(81) int local81 = arg2;
			@Pc(114) int local114;
			if (this.aLong65 <= this.aLong68 && this.aLong65 + (long) this.anInt2543 > this.aLong68) {
				local114 = (int) (this.aLong65 + (long) this.anInt2543 - this.aLong68);
				if (arg2 < local114) {
					local114 = arg2;
				}
				Static598.method4261(this.aByteArray40, (int) (this.aLong68 - this.aLong65), arg0, 0, local114);
				arg1 = local114;
				arg2 -= local114;
				this.aLong68 += local114;
			}
			if (this.aByteArray40.length < arg2) {
				this.aClass317_4.method6330(this.aLong68);
				this.aLong69 = this.aLong68;
				while (arg2 > 0) {
					local114 = this.aClass317_4.method6331(arg2, arg0, arg1);
					if (local114 == -1) {
						break;
					}
					this.aLong69 += local114;
					arg1 += local114;
					arg2 -= local114;
					this.aLong68 += local114;
				}
			} else if (arg2 > 0) {
				this.method2178();
				local114 = arg2;
				if (arg2 > this.anInt2543) {
					local114 = this.anInt2543;
				}
				Static598.method4261(this.aByteArray40, 0, arg0, arg1, local114);
				arg2 -= local114;
				arg1 += local114;
				this.aLong68 += local114;
			}
			if (this.aLong66 != -1L) {
				if (this.aLong68 < this.aLong66 && arg2 > 0) {
					local114 = (int) (this.aLong66 - this.aLong68) + arg1;
					if (arg2 + arg1 < local114) {
						local114 = arg2 + arg1;
					}
					while (local114 > arg1) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong68++;
					}
				}
				@Pc(299) long local299 = -1L;
				@Pc(301) long local301 = -1L;
				if (local77 <= this.aLong66 && this.aLong66 < (long) local81 + local77) {
					local299 = this.aLong66;
				} else if (this.aLong66 <= local77 && local77 < this.aLong66 + (long) this.anInt2541) {
					local299 = local77;
				}
				if (this.aLong66 + (long) this.anInt2541 > local77 && local77 + (long) local81 >= (long) this.anInt2541 + this.aLong66) {
					local301 = this.aLong66 + (long) this.anInt2541;
				} else if (this.aLong66 < (long) local81 + local77 && (long) this.anInt2541 + this.aLong66 >= (long) local81 + local77) {
					local301 = local77 + (long) local81;
				}
				if (local299 > -1L && local299 < local301) {
					@Pc(434) int local434 = (int) (local301 - local299);
					Static598.method4261(this.aByteArray39, (int) (local299 - this.aLong66), arg0, (int) (local299 - local77), local434);
					if (this.aLong68 < local301) {
						arg2 = (int) ((long) arg2 + this.aLong68 - local301);
						this.aLong68 = local301;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong69 = -1L;
			throw local473;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method2185() {
		return this.aClass317_4.method6332();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(JB)V")
	public void method2186(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2185());
		}
		this.aLong68 = arg0;
	}
}
