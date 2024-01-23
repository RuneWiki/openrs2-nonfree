import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class130 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
	private int anInt4296;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "J")
	private long aLong156;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	private int anInt4300 = 0;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "J")
	private long aLong151 = -1L;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "J")
	private long aLong154 = -1L;

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "Lclient!mc;")
	private Class110 aClass110_4;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "J")
	private long aLong155;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "J")
	private long aLong152;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!mc;II)V")
	public Class130(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass110_4 = arg0;
		this.aLong155 = this.aLong153 = arg0.method3096();
		this.aByteArray48 = new byte[arg1];
		this.aLong152 = 0L;
		this.aByteArray47 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	private void method3490() throws IOException {
		if (this.aLong151 == -1L) {
			return;
		}
		@Pc(17) long local17 = -1L;
		if (this.aLong156 != this.aLong151) {
			this.aClass110_4.method3093(this.aLong151);
			this.aLong156 = this.aLong151;
		}
		@Pc(38) long local38 = -1L;
		this.aClass110_4.method3094(0, this.aByteArray47, this.anInt4300);
		this.aLong156 += this.anInt4300;
		if (this.aLong154 < this.aLong151 + (long) this.anInt4300 && (long) this.anInt4300 + this.aLong151 <= (long) this.anInt4296 + this.aLong154) {
			local38 = (long) this.anInt4300 + this.aLong151;
		} else if ((long) this.anInt4296 + this.aLong154 > this.aLong151 && this.aLong154 + (long) this.anInt4296 <= (long) this.anInt4300 + this.aLong151) {
			local38 = (long) this.anInt4296 + this.aLong154;
		}
		if (this.aLong153 < this.aLong156) {
			this.aLong153 = this.aLong156;
		}
		if (this.aLong151 >= this.aLong154 && (long) this.anInt4296 + this.aLong154 > this.aLong151) {
			local17 = this.aLong151;
		} else if (this.aLong154 >= this.aLong151 && this.aLong151 + (long) this.anInt4300 > this.aLong154) {
			local17 = this.aLong154;
		}
		if (local17 > -1L && local38 > local17) {
			@Pc(209) int local209 = (int) (local38 - local17);
			Static323.method3554(this.aByteArray47, (int) (local17 - this.aLong151), this.aByteArray48, (int) (local17 - this.aLong154), local209);
		}
		this.aLong151 = -1L;
		this.anInt4300 = 0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(JI)V")
	public void method3491(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3494());
		}
		this.aLong152 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[BII)V")
	public void method3493(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong151 != -1L && this.aLong152 >= this.aLong151 && this.aLong152 + (long) arg2 <= (long) this.anInt4300 + this.aLong151) {
				Static323.method3554(this.aByteArray47, (int) (this.aLong152 - this.aLong151), arg0, 0, arg2);
				this.aLong152 += arg2;
				return;
			}
			@Pc(76) long local76 = this.aLong152;
			@Pc(80) int local80 = arg2;
			@Pc(119) int local119;
			if (this.aLong154 <= this.aLong152 && (long) this.anInt4296 + this.aLong154 > this.aLong152) {
				local119 = (int) ((long) this.anInt4296 + this.aLong154 - this.aLong152);
				if (local119 > arg2) {
					local119 = arg2;
				}
				arg2 -= local119;
				Static323.method3554(this.aByteArray48, (int) (this.aLong152 - this.aLong154), arg0, 0, local119);
				this.aLong152 += local119;
				arg1 = local119;
			}
			if (arg2 > this.aByteArray48.length) {
				this.aClass110_4.method3093(this.aLong152);
				this.aLong156 = this.aLong152;
				while (arg2 > 0) {
					local119 = this.aClass110_4.method3097(arg1, arg0, arg2);
					if (local119 == -1) {
						break;
					}
					arg2 -= local119;
					this.aLong156 += local119;
					arg1 += local119;
					this.aLong152 += local119;
				}
			} else if (arg2 > 0) {
				local119 = arg2;
				this.method3499();
				if (this.anInt4296 < arg2) {
					local119 = this.anInt4296;
				}
				arg2 -= local119;
				Static323.method3554(this.aByteArray48, 0, arg0, arg1, local119);
				arg1 += local119;
				this.aLong152 += local119;
			}
			if (this.aLong151 != -1L) {
				if (this.aLong151 > this.aLong152 && arg2 > 0) {
					local119 = (int) (this.aLong151 - this.aLong152) + arg1;
					if (arg1 + arg2 < local119) {
						local119 = arg1 + arg2;
					}
					while (local119 > arg1) {
						arg0[arg1++] = 0;
						this.aLong152++;
						arg2--;
					}
				}
				@Pc(321) long local321 = -1L;
				if (local76 <= this.aLong151 && (long) local80 + local76 > this.aLong151) {
					local321 = this.aLong151;
				} else if (this.aLong151 <= local76 && (long) this.anInt4300 + this.aLong151 > local76) {
					local321 = local76;
				}
				@Pc(366) long local366 = -1L;
				if (this.aLong151 + (long) this.anInt4300 > local76 && this.aLong151 + (long) this.anInt4300 <= local76 - -((long) local80)) {
					local366 = this.aLong151 + (long) this.anInt4300;
				} else if (local76 + (long) local80 > this.aLong151 && (long) local80 + local76 <= this.aLong151 - -((long) this.anInt4300)) {
					local366 = (long) local80 + local76;
				}
				if (local321 > -1L && local321 < local366) {
					@Pc(448) int local448 = (int) (local366 - local321);
					Static323.method3554(this.aByteArray47, (int) (local321 - this.aLong151), arg0, (int) (local321 - local76), local448);
					if (this.aLong152 < local366) {
						arg2 = (int) ((long) arg2 + this.aLong152 - local366);
						this.aLong152 = local366;
					}
				}
			}
		} catch (@Pc(491) IOException local491) {
			this.aLong156 = -1L;
			throw local491;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method3494() {
		return this.aClass110_4.method3095();
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)J")
	public long method3495() {
		return this.aLong155;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I[BII)V")
	public void method3497(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong152 > this.aLong155) {
				this.aLong155 = (long) arg0 + this.aLong152;
			}
			if (this.aLong151 != -1L && (this.aLong151 > this.aLong152 || (long) this.anInt4300 + this.aLong151 < this.aLong152)) {
				this.method3490();
			}
			if (this.aLong151 != -1L && (long) arg0 + this.aLong152 > this.aLong151 + (long) this.aByteArray47.length) {
				@Pc(87) int local87 = (int) ((long) this.aByteArray47.length + this.aLong151 - this.aLong152);
				Static323.method3554(arg1, arg2, this.aByteArray47, (int) (this.aLong152 - this.aLong151), local87);
				arg0 -= local87;
				this.aLong152 += local87;
				arg2 += local87;
				this.anInt4300 = this.aByteArray47.length;
				this.method3490();
			}
			if (this.aByteArray47.length < arg0) {
				@Pc(134) long local134 = -1L;
				@Pc(136) long local136 = -1L;
				if (this.aLong152 != this.aLong156) {
					this.aClass110_4.method3093(this.aLong152);
					this.aLong156 = this.aLong152;
				}
				this.aClass110_4.method3094(arg2, arg1, arg0);
				if (this.aLong152 + (long) arg0 > this.aLong154 && this.aLong152 + (long) arg0 <= this.aLong154 - -((long) this.anInt4296)) {
					local136 = (long) arg0 + this.aLong152;
				} else if (this.aLong152 < this.aLong154 + (long) this.anInt4296 && (long) arg0 + this.aLong152 >= (long) this.anInt4296 + this.aLong154) {
					local136 = (long) this.anInt4296 + this.aLong154;
				}
				if (this.aLong152 >= this.aLong154 && this.aLong152 < (long) this.anInt4296 + this.aLong154) {
					local134 = this.aLong152;
				} else if (this.aLong152 <= this.aLong154 && this.aLong152 + (long) arg0 > this.aLong154) {
					local134 = this.aLong154;
				}
				this.aLong156 += arg0;
				if (this.aLong153 < this.aLong156) {
					this.aLong153 = this.aLong156;
				}
				if (local134 > -1L && local136 > local134) {
					@Pc(316) int local316 = (int) (local136 - local134);
					Static323.method3554(arg1, (int) (local134 + (long) arg2 - this.aLong152), this.aByteArray48, (int) (local134 - this.aLong154), local316);
				}
				this.aLong152 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong151 == -1L) {
					this.aLong151 = this.aLong152;
				}
				Static323.method3554(arg1, arg2, this.aByteArray47, (int) (this.aLong152 - this.aLong151), arg0);
				this.aLong152 += arg0;
				if ((long) this.anInt4300 < this.aLong152 - this.aLong151) {
					this.anInt4300 = (int) (this.aLong152 - this.aLong151);
				}
			}
		} catch (@Pc(400) IOException local400) {
			this.aLong156 = -1L;
			throw local400;
		}
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
	private void method3499() throws IOException {
		this.anInt4296 = 0;
		if (this.aLong156 != this.aLong152) {
			this.aClass110_4.method3093(this.aLong152);
			this.aLong156 = this.aLong152;
		}
		this.aLong154 = this.aLong152;
		while (this.aByteArray48.length > this.anInt4296) {
			@Pc(43) int local43 = this.aByteArray48.length - this.anInt4296;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(61) int local61 = this.aClass110_4.method3097(this.anInt4296, this.aByteArray48, local43);
			if (local61 == -1) {
				break;
			}
			this.aLong156 += local61;
			this.anInt4296 += local61;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[B)V")
	public void method3500(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method3493(arg0, 0, arg0.length);
	}
}
