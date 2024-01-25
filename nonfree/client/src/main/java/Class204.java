import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class204 {

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "J")
	private long aLong156;

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
	private int anInt5571;

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "J")
	private long aLong157 = -1L;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "J")
	private long aLong154 = -1L;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	private int anInt5564 = 0;

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "Lclient!oaa;")
	private final Class235 aClass235_1;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "J")
	private long aLong155;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "[B")
	private final byte[] aByteArray63;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "J")
	private long aLong152;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "[B")
	private final byte[] aByteArray64;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!oaa;II)V")
	public Class204(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass235_1 = arg0;
		this.aLong153 = this.aLong155 = arg0.method5483();
		this.aByteArray63 = new byte[arg2];
		this.aLong152 = 0L;
		this.aByteArray64 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	private void method4809() throws IOException {
		if (this.aLong157 == -1L) {
			return;
		}
		if (this.aLong157 != this.aLong156) {
			this.aClass235_1.method5482(this.aLong157);
			this.aLong156 = this.aLong157;
		}
		this.aClass235_1.method5486(this.aByteArray63, this.anInt5564, 0);
		this.aLong156 += this.anInt5564;
		if (this.aLong155 < this.aLong156) {
			this.aLong155 = this.aLong156;
		}
		@Pc(65) long local65 = -1L;
		if (this.aLong154 <= this.aLong157 && (long) this.anInt5571 + this.aLong154 > this.aLong157) {
			local65 = this.aLong157;
		} else if (this.aLong154 >= this.aLong157 && this.aLong154 < this.aLong157 + (long) this.anInt5564) {
			local65 = this.aLong154;
		}
		@Pc(111) long local111 = -1L;
		if (this.aLong157 + (long) this.anInt5564 > this.aLong154 && (long) this.anInt5571 + this.aLong154 >= (long) this.anInt5564 + this.aLong157) {
			local111 = this.aLong157 + (long) this.anInt5564;
		} else if (this.aLong154 + (long) this.anInt5571 > this.aLong157 && this.aLong154 + (long) this.anInt5571 <= this.aLong157 + (long) this.anInt5564) {
			local111 = (long) this.anInt5571 + this.aLong154;
		}
		if (local65 > -1L && local65 < local111) {
			@Pc(203) int local203 = (int) (local111 - local65);
			Static604.method5910(this.aByteArray63, (int) (local65 - this.aLong157), this.aByteArray64, (int) (local65 - this.aLong154), local203);
		}
		this.aLong157 = -1L;
		this.anInt5564 = 0;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	private void method4810() throws IOException {
		this.anInt5571 = 0;
		if (this.aLong152 != this.aLong156) {
			this.aClass235_1.method5482(this.aLong152);
			this.aLong156 = this.aLong152;
		}
		this.aLong154 = this.aLong152;
		while (this.anInt5571 < this.aByteArray64.length) {
			@Pc(44) int local44 = this.aByteArray64.length - this.anInt5571;
			if (local44 > 200000000) {
				local44 = 200000000;
			}
			@Pc(61) int local61 = this.aClass235_1.method5490(this.aByteArray64, this.anInt5571, local44);
			if (local61 == -1) {
				break;
			}
			this.aLong156 += local61;
			this.anInt5571 += local61;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[BII)V")
	public void method4811(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if ((long) -1 != this.aLong157 && this.aLong152 >= this.aLong157 && (long) arg1 + this.aLong152 <= (long) this.anInt5564 + this.aLong157) {
				Static604.method5910(this.aByteArray63, (int) (this.aLong152 - this.aLong157), arg0, 0, arg1);
				this.aLong152 += arg1;
				return;
			}
			@Pc(83) long local83 = this.aLong152;
			@Pc(87) int local87 = arg1;
			@Pc(115) int local115;
			if (this.aLong154 <= this.aLong152 && this.aLong152 < this.aLong154 + (long) this.anInt5571) {
				local115 = (int) (this.aLong154 + (long) this.anInt5571 - this.aLong152);
				if (arg1 < local115) {
					local115 = arg1;
				}
				Static604.method5910(this.aByteArray64, (int) (this.aLong152 - this.aLong154), arg0, 0, local115);
				arg2 = local115;
				arg1 -= local115;
				this.aLong152 += local115;
			}
			if (arg1 > this.aByteArray64.length) {
				this.aClass235_1.method5482(this.aLong152);
				this.aLong156 = this.aLong152;
				while (arg1 > 0) {
					local115 = this.aClass235_1.method5490(arg0, arg2, arg1);
					if (local115 == -1) {
						break;
					}
					arg1 -= local115;
					arg2 += local115;
					this.aLong152 += local115;
					this.aLong156 += local115;
				}
			} else if (arg1 > 0) {
				this.method4810();
				local115 = arg1;
				if (arg1 > this.anInt5571) {
					local115 = this.anInt5571;
				}
				Static604.method5910(this.aByteArray64, 0, arg0, arg2, local115);
				arg1 -= local115;
				this.aLong152 += local115;
				arg2 += local115;
			}
			if (this.aLong157 != -1L) {
				if (this.aLong157 > this.aLong152 && arg1 > 0) {
					local115 = arg2 + (int) (this.aLong157 - this.aLong152);
					if (arg1 + arg2 < local115) {
						local115 = arg1 + arg2;
					}
					while (arg2 < local115) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong152++;
					}
				}
				@Pc(312) long local312 = -1L;
				if (this.aLong157 >= local83 && local83 + (long) local87 > this.aLong157) {
					local312 = this.aLong157;
				} else if (local83 >= this.aLong157 && local83 < (long) this.anInt5564 + this.aLong157) {
					local312 = local83;
				}
				@Pc(357) long local357 = -1L;
				if (local83 < (long) this.anInt5564 + this.aLong157 && (long) local87 + local83 >= this.aLong157 - -((long) this.anInt5564)) {
					local357 = this.aLong157 + (long) this.anInt5564;
				} else if (this.aLong157 < local83 + (long) local87 && this.aLong157 + (long) this.anInt5564 >= (long) local87 + local83) {
					local357 = local83 + (long) local87;
				}
				if (local312 > -1L && local312 < local357) {
					@Pc(442) int local442 = (int) (local357 - local312);
					Static604.method5910(this.aByteArray63, (int) (local312 - this.aLong157), arg0, (int) (local312 - local83), local442);
					if (this.aLong152 < local357) {
						arg1 = (int) ((long) arg1 + this.aLong152 - local357);
						this.aLong152 = local357;
					}
				}
			}
		} catch (@Pc(478) IOException local478) {
			this.aLong156 = -1L;
			throw local478;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method4812() {
		return this.aClass235_1.method5485();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([BIIZ)V")
	public void method4813(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong152 + (long) arg2 > this.aLong153) {
				this.aLong153 = (long) arg2 + this.aLong152;
			}
			if (this.aLong157 != -1L && (this.aLong157 > this.aLong152 || this.aLong157 + (long) this.anInt5564 < this.aLong152)) {
				this.method4809();
			}
			if (this.aLong157 != -1L && (long) arg2 + this.aLong152 > (long) this.aByteArray63.length + this.aLong157) {
				@Pc(95) int local95 = (int) ((long) this.aByteArray63.length + this.aLong157 - this.aLong152);
				Static604.method5910(arg0, arg1, this.aByteArray63, (int) (this.aLong152 - this.aLong157), local95);
				this.aLong152 += local95;
				arg2 -= local95;
				arg1 += local95;
				this.anInt5564 = this.aByteArray63.length;
				this.method4809();
			}
			if (this.aByteArray63.length < arg2) {
				if (this.aLong152 != this.aLong156) {
					this.aClass235_1.method5482(this.aLong152);
					this.aLong156 = this.aLong152;
				}
				this.aClass235_1.method5486(arg0, arg2, arg1);
				this.aLong156 += arg2;
				if (this.aLong155 < this.aLong156) {
					this.aLong155 = this.aLong156;
				}
				@Pc(177) long local177 = -1L;
				@Pc(179) long local179 = -1L;
				if (this.aLong152 >= this.aLong154 && this.aLong154 + (long) this.anInt5571 > this.aLong152) {
					local177 = this.aLong152;
				} else if (this.aLong152 <= this.aLong154 && this.aLong154 < this.aLong152 + (long) arg2) {
					local177 = this.aLong154;
				}
				if (this.aLong154 < this.aLong152 + (long) arg2 && (long) this.anInt5571 + this.aLong154 >= this.aLong152 + (long) arg2) {
					local179 = this.aLong152 + (long) arg2;
				} else if ((long) this.anInt5571 + this.aLong154 > this.aLong152 && this.aLong152 + (long) arg2 >= this.aLong154 - -((long) this.anInt5571)) {
					local179 = (long) this.anInt5571 + this.aLong154;
				}
				if (local177 > -1L && local177 < local179) {
					@Pc(313) int local313 = (int) (local179 - local177);
					Static604.method5910(arg0, (int) (local177 + (long) arg1 - this.aLong152), this.aByteArray64, (int) (local177 - this.aLong154), local313);
				}
				this.aLong152 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong157 == -1L) {
					this.aLong157 = this.aLong152;
				}
				Static604.method5910(arg0, arg1, this.aByteArray63, (int) (this.aLong152 - this.aLong157), arg2);
				this.aLong152 += arg2;
				if ((long) this.anInt5564 < this.aLong152 - this.aLong157) {
					this.anInt5564 = (int) (this.aLong152 - this.aLong157);
				}
			}
		} catch (@Pc(401) IOException local401) {
			this.aLong156 = -1L;
			throw local401;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BJ)V")
	public void method4814(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4812());
		}
		this.aLong152 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)J")
	public long method4815() {
		return this.aLong153;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([BI)V")
	public void method4816(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4811(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
	public void method4817() throws IOException {
		this.method4809();
		this.aClass235_1.method5488();
	}
}
