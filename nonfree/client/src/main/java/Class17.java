import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class17 {

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!df", name = "x", descriptor = "J")
	private long aLong48 = -1L;

	@OriginalMember(owner = "client!df", name = "K", descriptor = "J")
	private long aLong51 = -1L;

	@OriginalMember(owner = "client!df", name = "F", descriptor = "I")
	private int anInt847 = 0;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!ab;")
	private final Class3 aClass3_3;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!df", name = "E", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!df", name = "N", descriptor = "[B")
	private final byte[] aByteArray11;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!df", name = "H", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!ab;II)V")
	public Class17(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass3_3 = arg0;
		this.aLong49 = this.aLong46 = arg0.method104();
		this.aByteArray11 = new byte[arg2];
		this.aByteArray10 = new byte[arg1];
		this.aLong50 = 0L;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	private void method499() throws IOException {
		this.anInt833 = 0;
		if (this.aLong47 != this.aLong50) {
			this.aClass3_3.method102(this.aLong50);
			this.aLong47 = this.aLong50;
		}
		this.aLong48 = this.aLong50;
		while (this.aByteArray10.length > this.anInt833) {
			@Pc(57) int local57 = this.aClass3_3.method105(this.aByteArray10, this.anInt833, this.aByteArray10.length - this.anInt833);
			if (local57 == -1) {
				break;
			}
			this.aLong47 += local57;
			this.anInt833 += local57;
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)J")
	public long method501() {
		return this.aLong49;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
	private void method502() throws IOException {
		if (this.aLong51 == -1L) {
			return;
		}
		if (this.aLong47 != this.aLong51) {
			this.aClass3_3.method102(this.aLong51);
			this.aLong47 = this.aLong51;
		}
		this.aClass3_3.method101(this.anInt847, this.aByteArray11, 0);
		this.aLong47 += this.anInt847;
		@Pc(45) long local45 = -1L;
		if (this.aLong47 > this.aLong46) {
			this.aLong46 = this.aLong47;
		}
		if (this.aLong48 <= this.aLong51 && this.aLong51 < (long) this.anInt833 + this.aLong48) {
			local45 = this.aLong51;
		} else if (this.aLong51 <= this.aLong48 && this.aLong51 + (long) this.anInt847 > this.aLong48) {
			local45 = this.aLong48;
		}
		@Pc(109) long local109 = -1L;
		if ((long) this.anInt847 + this.aLong51 > this.aLong48 && this.aLong51 + (long) this.anInt847 <= (long) this.anInt833 + this.aLong48) {
			local109 = this.aLong51 + (long) this.anInt847;
		} else if (this.aLong48 + (long) this.anInt833 > this.aLong51 && (long) this.anInt833 + this.aLong48 <= this.aLong51 - -((long) this.anInt847)) {
			local109 = this.aLong48 + (long) this.anInt833;
		}
		if (local45 > -1L && local109 > local45) {
			@Pc(201) int local201 = (int) (local109 - local45);
			Static140.method1970(this.aByteArray11, (int) (local45 - this.aLong51), this.aByteArray10, (int) (local45 - this.aLong48), local201);
		}
		this.aLong51 = -1L;
		this.anInt847 = 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([BIIB)V")
	public void method504(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong51 != -1L && this.aLong51 <= this.aLong50 && this.aLong51 + (long) this.anInt847 >= this.aLong50 + (long) arg2) {
				Static140.method1970(this.aByteArray11, (int) (this.aLong50 - this.aLong51), arg0, 0, arg2);
				this.aLong50 += arg2;
				return;
			}
			@Pc(74) long local74 = this.aLong50;
			@Pc(78) int local78 = arg2;
			@Pc(110) int local110;
			if (this.aLong50 >= this.aLong48 && (long) this.anInt833 + this.aLong48 > this.aLong50) {
				local110 = (int) (this.aLong48 + (long) this.anInt833 - this.aLong50);
				if (local110 > arg2) {
					local110 = arg2;
				}
				arg2 -= local110;
				Static140.method1970(this.aByteArray10, (int) (this.aLong50 - this.aLong48), arg0, 0, local110);
				this.aLong50 += local110;
				arg1 = local110;
			}
			if (arg2 > this.aByteArray10.length) {
				this.aClass3_3.method102(this.aLong50);
				this.aLong47 = this.aLong50;
				while (arg2 > 0) {
					local110 = this.aClass3_3.method105(arg0, arg1, arg2);
					if (local110 == -1) {
						break;
					}
					arg2 -= local110;
					this.aLong50 += local110;
					this.aLong47 += local110;
					arg1 += local110;
				}
			} else if (arg2 > 0) {
				local110 = arg2;
				this.method499();
				if (this.anInt833 < arg2) {
					local110 = this.anInt833;
				}
				arg2 -= local110;
				Static140.method1970(this.aByteArray10, 0, arg0, arg1, local110);
				this.aLong50 += local110;
				arg1 += local110;
			}
			if (this.aLong51 != -1L) {
				if (this.aLong51 > this.aLong50 && arg2 > 0) {
					local110 = arg1 + (int) (this.aLong51 - this.aLong50);
					if (arg2 + arg1 < local110) {
						local110 = arg1 + arg2;
					}
					while (local110 > arg1) {
						arg0[arg1++] = 0;
						this.aLong50++;
						arg2--;
					}
				}
				@Pc(302) long local302 = -1L;
				if (local74 <= this.aLong51 && this.aLong51 < (long) local78 + local74) {
					local302 = this.aLong51;
				} else if (this.aLong51 <= local74 && local74 < (long) this.anInt847 + this.aLong51) {
					local302 = local74;
				}
				@Pc(350) long local350 = -1L;
				if (local74 < (long) this.anInt847 + this.aLong51 && local74 + (long) local78 >= (long) this.anInt847 + this.aLong51) {
					local350 = (long) this.anInt847 + this.aLong51;
				} else if ((long) local78 + local74 > this.aLong51 && this.aLong51 + (long) this.anInt847 >= local74 + (long) local78) {
					local350 = (long) local78 + local74;
				}
				if (local302 > -1L && local302 < local350) {
					@Pc(430) int local430 = (int) (local350 - local302);
					Static140.method1970(this.aByteArray11, (int) (local302 - this.aLong51), arg0, (int) (local302 - local74), local430);
					if (this.aLong50 < local350) {
						arg2 = (int) ((long) arg2 + this.aLong50 - local350);
						this.aLong50 = local350;
					}
				}
			}
		} catch (@Pc(467) IOException local467) {
			this.aLong47 = -1L;
			throw local467;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III[B)V")
	public void method506(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong50 > this.aLong49) {
				this.aLong49 = this.aLong50 + (long) arg0;
			}
			if (this.aLong51 != -1L && (this.aLong51 > this.aLong50 || this.aLong50 > this.aLong51 + (long) this.anInt847)) {
				this.method502();
			}
			if (this.aLong51 != -1L && (long) this.aByteArray11.length + this.aLong51 < this.aLong50 + (long) arg0) {
				@Pc(95) int local95 = (int) (this.aLong51 + (long) this.aByteArray11.length - this.aLong50);
				arg0 -= local95;
				Static140.method1970(arg2, arg1, this.aByteArray11, (int) (this.aLong50 - this.aLong51), local95);
				arg1 += local95;
				this.aLong50 += local95;
				this.anInt847 = this.aByteArray11.length;
				this.method502();
			}
			if (this.aByteArray11.length < arg0) {
				if (this.aLong47 != this.aLong50) {
					this.aClass3_3.method102(this.aLong50);
					this.aLong47 = this.aLong50;
				}
				this.aClass3_3.method101(arg0, arg2, arg1);
				this.aLong47 += arg0;
				@Pc(173) long local173 = -1L;
				@Pc(175) long local175 = -1L;
				if (this.aLong47 > this.aLong46) {
					this.aLong46 = this.aLong47;
				}
				if (this.aLong50 >= this.aLong48 && (long) this.anInt833 + this.aLong48 > this.aLong50) {
					local175 = this.aLong50;
				} else if (this.aLong50 <= this.aLong48 && this.aLong48 < this.aLong50 + (long) arg0) {
					local175 = this.aLong48;
				}
				if (this.aLong50 + (long) arg0 > this.aLong48 && (long) arg0 + this.aLong50 <= this.aLong48 + (long) this.anInt833) {
					local173 = this.aLong50 + (long) arg0;
				} else if ((long) this.anInt833 + this.aLong48 > this.aLong50 && this.aLong50 + (long) arg0 >= this.aLong48 + (long) this.anInt833) {
					local173 = this.aLong48 + (long) this.anInt833;
				}
				if (local175 > -1L && local173 > local175) {
					@Pc(325) int local325 = (int) (local173 - local175);
					Static140.method1970(arg2, (int) (local175 + (long) arg1 - this.aLong50), this.aByteArray10, (int) (local175 - this.aLong48), local325);
				}
				this.aLong50 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong51 == -1L) {
					this.aLong51 = this.aLong50;
				}
				Static140.method1970(arg2, arg1, this.aByteArray11, (int) (this.aLong50 - this.aLong51), arg0);
				this.aLong50 += arg0;
				if (this.aLong50 - this.aLong51 > (long) this.anInt847) {
					this.anInt847 = (int) (this.aLong50 - this.aLong51);
				}
			}
		} catch (@Pc(413) IOException local413) {
			this.aLong47 = -1L;
			throw local413;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public void method507() throws IOException {
		this.method502();
		this.aClass3_3.method100();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BJ)V")
	public void method508(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong50 = arg0;
		}
	}
}
