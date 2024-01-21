import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class6 {

	@OriginalMember(owner = "client!b", name = "r", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "J")
	private long aLong10 = -1L;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "I")
	private int anInt195 = 0;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "Lclient!we;")
	private final Class81 aClass81_1;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "[B")
	private final byte[] aByteArray3;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!we;II)V")
	public Class6(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass81_1 = arg0;
		this.aLong15 = this.aLong14 = arg0.method2040();
		this.aByteArray2 = new byte[arg1];
		this.aByteArray3 = new byte[arg2];
		this.aLong13 = 0L;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	private void method107() throws IOException {
		if (this.aLong9 == -1L) {
			return;
		}
		if (this.aLong12 != this.aLong9) {
			this.aClass81_1.method2041(this.aLong9);
			this.aLong12 = this.aLong9;
		}
		this.aClass81_1.method2038(0, this.aByteArray3, this.anInt195);
		@Pc(33) long local33 = -1L;
		this.aLong12 += this.anInt195;
		@Pc(43) long local43 = -1L;
		if (this.aLong10 <= this.aLong9 && (long) this.anInt193 + this.aLong10 > this.aLong9) {
			local33 = this.aLong9;
		} else if (this.aLong9 <= this.aLong10 && this.aLong10 < (long) this.anInt195 + this.aLong9) {
			local33 = this.aLong10;
		}
		if (this.aLong9 + (long) this.anInt195 > this.aLong10 && (long) this.anInt193 + this.aLong10 >= (long) this.anInt195 + this.aLong9) {
			local43 = (long) this.anInt195 + this.aLong9;
		} else if ((long) this.anInt193 + this.aLong10 > this.aLong9 && this.aLong9 + (long) this.anInt195 >= this.aLong10 + (long) this.anInt193) {
			local43 = this.aLong10 + (long) this.anInt193;
		}
		if (this.aLong12 > this.aLong14) {
			this.aLong14 = this.aLong12;
		}
		if (local33 > -1L && local33 < local43) {
			@Pc(184) int local184 = (int) (local43 - local33);
			Static131.method1114(this.aByteArray3, (int) (local33 - this.aLong9), this.aByteArray2, (int) (local33 - this.aLong10), local184);
		}
		this.anInt195 = 0;
		this.aLong9 = -1L;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III[B)V")
	public void method110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong13 > this.aLong15) {
				this.aLong15 = this.aLong13 + (long) arg1;
			}
			if (this.aLong9 != -1L && (this.aLong13 < this.aLong9 || (long) this.anInt195 + this.aLong9 < this.aLong13)) {
				this.method107();
			}
			if (this.aLong9 != -1L && (long) arg1 + this.aLong13 > this.aLong9 + (long) this.aByteArray3.length) {
				@Pc(89) int local89 = (int) (this.aLong9 + (long) this.aByteArray3.length - this.aLong13);
				Static131.method1114(arg2, arg0, this.aByteArray3, (int) (this.aLong13 - this.aLong9), local89);
				arg0 += local89;
				arg1 -= local89;
				this.aLong13 += local89;
				this.anInt195 = this.aByteArray3.length;
				this.method107();
			}
			if (arg1 > this.aByteArray3.length) {
				@Pc(134) long local134 = -1L;
				if (this.aLong12 != this.aLong13) {
					this.aClass81_1.method2041(this.aLong13);
					this.aLong12 = this.aLong13;
				}
				@Pc(152) long local152 = -1L;
				this.aClass81_1.method2038(arg0, arg2, arg1);
				this.aLong12 += arg1;
				if (this.aLong10 <= this.aLong13 && this.aLong13 < (long) this.anInt193 + this.aLong10) {
					local134 = this.aLong13;
				} else if (this.aLong10 >= this.aLong13 && this.aLong10 < (long) arg1 + this.aLong13) {
					local134 = this.aLong10;
				}
				if (this.aLong12 > this.aLong14) {
					this.aLong14 = this.aLong12;
				}
				if (this.aLong13 + (long) arg1 > this.aLong10 && this.aLong10 + (long) this.anInt193 >= (long) arg1 + this.aLong13) {
					local152 = (long) arg1 + this.aLong13;
				} else if (this.aLong13 < this.aLong10 + (long) this.anInt193 && (long) this.anInt193 + this.aLong10 <= this.aLong13 + (long) arg1) {
					local152 = (long) this.anInt193 + this.aLong10;
				}
				if (local134 > -1L && local152 > local134) {
					@Pc(312) int local312 = (int) (local152 - local134);
					Static131.method1114(arg2, (int) ((long) arg0 + local134 - this.aLong13), this.aByteArray2, (int) (local134 - this.aLong10), local312);
				}
				this.aLong13 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong9 == -1L) {
					this.aLong9 = this.aLong13;
				}
				Static131.method1114(arg2, arg0, this.aByteArray3, (int) (this.aLong13 - this.aLong9), arg1);
				this.aLong13 += arg1;
				if (this.aLong13 - this.aLong9 > (long) this.anInt195) {
					this.anInt195 = (int) (this.aLong13 - this.aLong9);
				}
			}
		} catch (@Pc(395) IOException local395) {
			this.aLong12 = -1L;
			throw local395;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II[BI)V")
	public void method111(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong9 != -1L && this.aLong13 >= this.aLong9 && (long) arg2 + this.aLong13 <= this.aLong9 - -((long) this.anInt195)) {
				Static131.method1114(this.aByteArray3, (int) (this.aLong13 - this.aLong9), arg1, 0, arg2);
				this.aLong13 += arg2;
				return;
			}
			@Pc(91) long local91 = this.aLong13;
			@Pc(95) int local95 = arg2;
			@Pc(128) int local128;
			if (this.aLong13 >= this.aLong10 && this.aLong10 + (long) this.anInt193 > this.aLong13) {
				local128 = (int) (this.aLong10 + (long) this.anInt193 - this.aLong13);
				if (local128 > arg2) {
					local128 = arg2;
				}
				arg2 -= local128;
				Static131.method1114(this.aByteArray2, (int) (this.aLong13 - this.aLong10), arg1, 0, local128);
				arg0 = local128;
				this.aLong13 += local128;
			}
			if (this.aByteArray2.length < arg2) {
				this.aClass81_1.method2041(this.aLong13);
				this.aLong12 = this.aLong13;
				while (arg2 > 0) {
					local128 = this.aClass81_1.method2037(arg1, arg0, arg2);
					if (local128 == -1) {
						break;
					}
					this.aLong12 += local128;
					arg2 -= local128;
					this.aLong13 += local128;
					arg0 += local128;
				}
			} else if (arg2 > 0) {
				this.method112();
				local128 = arg2;
				if (this.anInt193 < arg2) {
					local128 = this.anInt193;
				}
				arg2 -= local128;
				Static131.method1114(this.aByteArray2, 0, arg1, arg0, local128);
				arg0 += local128;
				this.aLong13 += local128;
			}
			if (this.aLong9 != -1L) {
				if (this.aLong13 < this.aLong9 && arg2 > 0) {
					local128 = arg0 + (int) (this.aLong9 - this.aLong13);
					if (local128 > arg2 + arg0) {
						local128 = arg2 + arg0;
					}
					while (arg0 < local128) {
						arg1[arg0++] = 0;
						this.aLong13++;
						arg2--;
					}
				}
				@Pc(318) long local318 = -1L;
				if (this.aLong9 >= local91 && this.aLong9 < (long) local95 + local91) {
					local318 = this.aLong9;
				} else if (this.aLong9 <= local91 && (long) this.anInt195 + this.aLong9 > local91) {
					local318 = local91;
				}
				@Pc(366) long local366 = -1L;
				if (this.aLong9 + (long) this.anInt195 > local91 && (long) this.anInt195 + this.aLong9 <= local91 - -((long) local95)) {
					local366 = (long) this.anInt195 + this.aLong9;
				} else if (this.aLong9 < local91 + (long) local95 && (long) this.anInt195 + this.aLong9 >= local91 + (long) local95) {
					local366 = local91 + (long) local95;
				}
				if (local318 > -1L && local318 < local366) {
					@Pc(443) int local443 = (int) (local366 - local318);
					Static131.method1114(this.aByteArray3, (int) (local318 - this.aLong9), arg1, (int) (local318 - local91), local443);
					if (this.aLong13 < local366) {
						arg2 = (int) ((long) arg2 + this.aLong13 - local366);
						this.aLong13 = local366;
					}
				}
			}
		} catch (@Pc(482) IOException local482) {
			this.aLong12 = -1L;
			throw local482;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	private void method112() throws IOException {
		this.anInt193 = 0;
		if (this.aLong13 != this.aLong12) {
			this.aClass81_1.method2041(this.aLong13);
			this.aLong12 = this.aLong13;
		}
		this.aLong10 = this.aLong13;
		while (this.anInt193 < this.aByteArray2.length) {
			@Pc(52) int local52 = this.aClass81_1.method2037(this.aByteArray2, this.anInt193, this.aByteArray2.length - this.anInt193);
			if (local52 == -1) {
				break;
			}
			this.aLong12 += local52;
			this.anInt193 += local52;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(JZ)V")
	public void method114(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong13 = arg0;
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)J")
	public long method116() {
		return this.aLong15;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	public void method117() throws IOException {
		this.method107();
		this.aClass81_1.method2036();
	}
}
