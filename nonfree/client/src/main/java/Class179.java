import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class179 {

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	private int anInt4820;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "J")
	private long aLong149 = -1L;

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
	private int anInt4824 = 0;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "J")
	private long aLong152 = -1L;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "Lclient!qia;")
	private final Class285 aClass285_1;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "J")
	private long aLong148;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "[B")
	private final byte[] aByteArray61;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "[B")
	private final byte[] aByteArray62;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!qia;II)V")
	public Class179(@OriginalArg(0) Class285 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass285_1 = arg0;
		this.aLong147 = this.aLong148 = arg0.method7147();
		this.aLong151 = 0L;
		this.aByteArray61 = new byte[arg1];
		this.aByteArray62 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([BB)V")
	public void method4022(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4030(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method4023() {
		return this.aClass285_1.method7145();
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	public void method4025() throws IOException {
		this.method4027();
		this.aClass285_1.method7142();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BJ)V")
	public void method4026(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4023());
		}
		this.aLong151 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
	private void method4027() throws IOException {
		if (this.aLong152 == -1L) {
			return;
		}
		if (this.aLong152 != this.aLong150) {
			this.aClass285_1.method7146(this.aLong152);
			this.aLong150 = this.aLong152;
		}
		this.aClass285_1.method7148(this.anInt4824, 0, this.aByteArray62);
		this.aLong150 += (long) this.anInt4824;
		if (this.aLong150 > this.aLong148) {
			this.aLong148 = this.aLong150;
		}
		@Pc(59) long local59 = -1L;
		@Pc(61) long local61 = -1L;
		if (this.aLong152 >= this.aLong149 && (long) this.anInt4820 + this.aLong149 > this.aLong152) {
			local59 = this.aLong152;
		} else if (this.aLong149 >= this.aLong152 && this.aLong149 < this.aLong152 + (long) this.anInt4824) {
			local59 = this.aLong149;
		}
		if (this.aLong152 + (long) this.anInt4824 > this.aLong149 && (long) this.anInt4820 + this.aLong149 >= (long) this.anInt4824 + this.aLong152) {
			local61 = this.aLong152 + (long) this.anInt4824;
		} else if (this.aLong152 < (long) this.anInt4820 + this.aLong149 && (long) this.anInt4820 + this.aLong149 <= (long) this.anInt4824 + this.aLong152) {
			local61 = (long) this.anInt4820 + this.aLong149;
		}
		if (local59 > -1L && local61 > local59) {
			@Pc(212) int local212 = (int) (local61 - local59);
			Static681.method2476(this.aByteArray62, (int) (local59 - this.aLong152), this.aByteArray61, (int) (local59 - this.aLong149), local212);
		}
		this.aLong152 = -1L;
		this.anInt4824 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[BII)V")
	public void method4029(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong151 + (long) arg0 > this.aLong147) {
				this.aLong147 = (long) arg0 + this.aLong151;
			}
			if (this.aLong152 != -1L && (this.aLong151 < this.aLong152 || this.aLong151 > this.aLong152 + (long) this.anInt4824)) {
				this.method4027();
			}
			if (this.aLong152 != -1L && this.aLong152 + (long) this.aByteArray62.length < (long) arg0 + this.aLong151) {
				@Pc(87) int local87 = (int) ((long) this.aByteArray62.length + this.aLong152 - this.aLong151);
				Static681.method2476(arg1, arg2, this.aByteArray62, (int) (this.aLong151 - this.aLong152), local87);
				this.aLong151 += (long) local87;
				arg0 -= local87;
				arg2 += local87;
				this.anInt4824 = this.aByteArray62.length;
				this.method4027();
			}
			if (this.aByteArray62.length < arg0) {
				if (this.aLong151 != this.aLong150) {
					this.aClass285_1.method7146(this.aLong151);
					this.aLong150 = this.aLong151;
				}
				this.aClass285_1.method7148(arg0, arg2, arg1);
				this.aLong150 += (long) arg0;
				if (this.aLong150 > this.aLong148) {
					this.aLong148 = this.aLong150;
				}
				@Pc(184) long local184 = -1L;
				if (this.aLong151 >= this.aLong149 && this.aLong149 + (long) this.anInt4820 > this.aLong151) {
					local184 = this.aLong151;
				} else if (this.aLong149 >= this.aLong151 && this.aLong151 + (long) arg0 > this.aLong149) {
					local184 = this.aLong149;
				}
				@Pc(233) long local233 = -1L;
				if (this.aLong149 < this.aLong151 + (long) arg0 && this.aLong149 + (long) this.anInt4820 >= (long) arg0 + this.aLong151) {
					local233 = (long) arg0 + this.aLong151;
				} else if (this.aLong151 < this.aLong149 + (long) this.anInt4820 && this.aLong151 + (long) arg0 >= (long) this.anInt4820 + this.aLong149) {
					local233 = (long) this.anInt4820 + this.aLong149;
				}
				if (local184 > -1L && local184 < local233) {
					@Pc(324) int local324 = (int) (local233 - local184);
					Static681.method2476(arg1, (int) ((long) arg2 + local184 - this.aLong151), this.aByteArray61, (int) (local184 - this.aLong149), local324);
				}
				this.aLong151 += (long) arg0;
			} else if (arg0 > 0) {
				if (this.aLong152 == -1L) {
					this.aLong152 = this.aLong151;
				}
				Static681.method2476(arg1, arg2, this.aByteArray62, (int) (this.aLong151 - this.aLong152), arg0);
				this.aLong151 += (long) arg0;
				if (this.aLong151 - this.aLong152 > (long) this.anInt4824) {
					this.anInt4824 = (int) (this.aLong151 - this.aLong152);
				}
			}
		} catch (@Pc(412) IOException local412) {
			this.aLong150 = -1L;
			throw local412;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III[B)V")
	public void method4030(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg0 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong152 != -1L && this.aLong151 >= this.aLong152 && (long) arg0 + this.aLong151 <= this.aLong152 + (long) this.anInt4824) {
				Static681.method2476(this.aByteArray62, (int) (this.aLong151 - this.aLong152), arg2, 0, arg0);
				this.aLong151 += (long) arg0;
				return;
			}
			@Pc(73) long local73 = this.aLong151;
			@Pc(82) int local82 = arg0;
			@Pc(111) int local111;
			if (this.aLong151 >= this.aLong149 && this.aLong149 + (long) this.anInt4820 > this.aLong151) {
				local111 = (int) (this.aLong149 + (long) this.anInt4820 - this.aLong151);
				if (arg0 < local111) {
					local111 = arg0;
				}
				Static681.method2476(this.aByteArray61, (int) (this.aLong151 - this.aLong149), arg2, 0, local111);
				this.aLong151 += (long) local111;
				arg0 -= local111;
				arg1 = local111;
			}
			if (arg0 > this.aByteArray61.length) {
				this.aClass285_1.method7146(this.aLong151);
				this.aLong150 = this.aLong151;
				while (arg0 > 0) {
					local111 = this.aClass285_1.method7141(arg2, arg0, arg1);
					if (local111 == -1) {
						break;
					}
					this.aLong151 += (long) local111;
					this.aLong150 += (long) local111;
					arg1 += local111;
					arg0 -= local111;
				}
			} else if (arg0 > 0) {
				this.method4033();
				local111 = arg0;
				if (this.anInt4820 < arg0) {
					local111 = this.anInt4820;
				}
				Static681.method2476(this.aByteArray61, 0, arg2, arg1, local111);
				arg0 -= local111;
				arg1 += local111;
				this.aLong151 += (long) local111;
			}
			if (this.aLong152 != -1L) {
				if (this.aLong151 < this.aLong152 && arg0 > 0) {
					local111 = (int) (this.aLong152 - this.aLong151) + arg1;
					if (local111 > arg0 + arg1) {
						local111 = arg1 + arg0;
					}
					while (arg1 < local111) {
						arg2[arg1++] = 0;
						arg0--;
						this.aLong151++;
					}
				}
				@Pc(291) long local291 = -1L;
				if (this.aLong152 >= local73 && this.aLong152 < (long) local82 + local73) {
					local291 = this.aLong152;
				} else if (this.aLong152 <= local73 && local73 < this.aLong152 + (long) this.anInt4824) {
					local291 = local73;
				}
				@Pc(336) long local336 = -1L;
				if (local73 < (long) this.anInt4824 + this.aLong152 && this.aLong152 + (long) this.anInt4824 <= (long) local82 + local73) {
					local336 = this.aLong152 + (long) this.anInt4824;
				} else if (this.aLong152 < (long) local82 + local73 && (long) this.anInt4824 + this.aLong152 >= (long) local82 + local73) {
					local336 = local73 + (long) local82;
				}
				if (local291 > -1L && local291 < local336) {
					@Pc(416) int local416 = (int) (local336 - local291);
					Static681.method2476(this.aByteArray62, (int) (local291 - this.aLong152), arg2, (int) (local291 - local73), local416);
					if (local336 > this.aLong151) {
						arg0 = (int) ((long) arg0 + this.aLong151 - local336);
						this.aLong151 = local336;
					}
				}
			}
		} catch (@Pc(454) IOException local454) {
			this.aLong150 = -1L;
			throw local454;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)J")
	public long method4031() {
		return this.aLong147;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
	private void method4033() throws IOException {
		this.anInt4820 = 0;
		if (this.aLong151 != this.aLong150) {
			this.aClass285_1.method7146(this.aLong151);
			this.aLong150 = this.aLong151;
		}
		this.aLong149 = this.aLong151;
		while (this.aByteArray61.length > this.anInt4820) {
			@Pc(46) int local46 = this.aByteArray61.length - this.anInt4820;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(63) int local63 = this.aClass285_1.method7141(this.aByteArray61, local46, this.anInt4820);
			if (local63 == -1) {
				break;
			}
			this.anInt4820 += local63;
			this.aLong150 += (long) local63;
		}
	}
}
