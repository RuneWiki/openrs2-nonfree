import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class14 {

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!o;")
	public static Class40 aClass40_115 = Static12.method257("Unknown");

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_113 = Static12.method257("Enter name of player to add to list");

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_116 = Static12.method257("(Z");

	@OriginalMember(owner = "client!d", name = "y", descriptor = "Lclient!o;")
	public static Class40 aClass40_119 = Static12.method257("@yel@ days of*6nmember credit remaining)3");

	@OriginalMember(owner = "client!d", name = "B", descriptor = "[Lclient!o;")
	public static Class40[] aClass40Array7 = new Class40[100];

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!o;")
	public static Class40 aClass40_117 = Static12.method257("Invalid username or password)3");

	@OriginalMember(owner = "client!d", name = "w", descriptor = "Lclient!o;")
	public static Class40 aClass40_118 = Static12.method257("Password: ");

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!o;")
	public static Class40 aClass40_114 = Static12.method257("Loaded gamescreen");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_112 = null;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "[I")
	public static int[] anIntArray82 = new int[] { 0, 0, 0, -1, 0, 0, 0, 8, 0, 0, 0, 5, 0, 0, 0, 8, 0, 0, 0, 0, 0, 14, 0, 0, 8, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 6, 0, 2, 0, 0, 0, 0, 0, 0, -2, 7, 0, 0, 0, 0, 0, 0, -2, -2, 0, 5, 0, 10, 0, 0, 0, 5, 7, 0, 0, 1, 0, 0, 15, 2, -1, 0, 0, 1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, -1, 0, 0, 0, 0, 6, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 4, 0, 2, 0, -2, 0, 0, 0, -2, 0, -2, 4, 0, 0, 6, 6, 0, 6, 4, 0, 0, 0, 0, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 23, 0, 10, 0, -2, 0, 0, 0, 0, 6, 4, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 6, 1, 0, 0, 0, 0, 3, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 4, 0, 0, 0, 0, 2, 5, 0, 3, 0, 0, 4 };

	@OriginalMember(owner = "client!d", name = "H", descriptor = "Lclient!o;")
	public static Class40 aClass40_120 = Static12.method257("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!d", name = "F", descriptor = "I")
	public static int anInt426 = -1;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	private int anInt414 = 0;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "J")
	private long aLong26 = -1L;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "J")
	private long aLong27 = -1L;

	@OriginalMember(owner = "client!d", name = "I", descriptor = "Lclient!dc;")
	private final Class16 aClass16_4;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "[B")
	private final byte[] aByteArray4;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(JI)V", line = 36)
	public void method346(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong25 = arg0;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BIII)V", line = 120)
	public void method348(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong29 < this.aLong25 + (long) arg1) {
				this.aLong29 = (long) arg1 + this.aLong25;
			}
			if (this.aLong26 != -1L && (this.aLong26 > this.aLong25 || this.aLong25 > this.aLong26 + (long) this.anInt414)) {
				this.method352();
			}
			if (this.aLong26 != -1L && this.aLong25 + (long) arg1 > (long) this.aByteArray5.length + this.aLong26) {
				@Pc(92) int local92 = (int) (this.aLong26 + (long) this.aByteArray5.length - this.aLong25);
				arg1 -= local92;
				Static107.method993(arg0, arg2, this.aByteArray5, (int) (this.aLong25 - this.aLong26), local92);
				arg2 += local92;
				this.aLong25 += local92;
				this.anInt414 = this.aByteArray5.length;
				this.method352();
			}
			if (arg1 > this.aByteArray5.length) {
				if (this.aLong28 != this.aLong25) {
					this.aClass16_4.method367(this.aLong25);
					this.aLong28 = this.aLong25;
				}
				@Pc(155) long local155 = -1L;
				this.aClass16_4.method363(arg2, arg1, arg0);
				@Pc(164) long local164 = -1L;
				if (this.aLong27 <= this.aLong25 && (long) this.anInt417 + this.aLong27 > this.aLong25) {
					local164 = this.aLong25;
				} else if (this.aLong27 >= this.aLong25 && this.aLong25 + (long) arg1 > this.aLong27) {
					local164 = this.aLong27;
				}
				this.aLong28 += arg1;
				if (this.aLong27 < this.aLong25 + (long) arg1 && (long) this.anInt417 + this.aLong27 >= this.aLong25 + (long) arg1) {
					local155 = this.aLong25 + (long) arg1;
				} else if (this.aLong25 < this.aLong27 + (long) this.anInt417 && this.aLong27 + (long) this.anInt417 <= this.aLong25 - -((long) arg1)) {
					local155 = (long) this.anInt417 + this.aLong27;
				}
				if (this.aLong28 > this.aLong30) {
					this.aLong30 = this.aLong28;
				}
				if (local164 > -1L && local164 < local155) {
					@Pc(325) int local325 = (int) (local155 - local164);
					Static107.method993(arg0, (int) (local164 + (long) arg2 - this.aLong25), this.aByteArray4, (int) (local164 - this.aLong27), local325);
				}
				this.aLong25 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong26 == -1L) {
					this.aLong26 = this.aLong25;
				}
				Static107.method993(arg0, arg2, this.aByteArray5, (int) (this.aLong25 - this.aLong26), arg1);
				this.aLong25 += arg1;
				if (this.aLong25 - this.aLong26 > (long) this.anInt414) {
					this.anInt414 = (int) (this.aLong25 - this.aLong26);
				}
			}
		} catch (@Pc(410) IOException local410) {
			this.aLong28 = -1L;
			throw local410;
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V", line = 246)
	private void method349() throws IOException {
		this.anInt417 = 0;
		if (this.aLong25 != this.aLong28) {
			this.aClass16_4.method367(this.aLong25);
			this.aLong28 = this.aLong25;
		}
		this.aLong27 = this.aLong25;
		while (this.anInt417 < this.aByteArray4.length) {
			@Pc(53) int local53 = this.aClass16_4.method364(this.aByteArray4, this.aByteArray4.length - this.anInt417, this.anInt417);
			if (local53 == -1) {
				break;
			}
			this.aLong28 += local53;
			this.anInt417 += local53;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III[B)V", line = 314)
	public void method350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong26 != -1L && this.aLong25 >= this.aLong26 && (long) arg1 + this.aLong25 <= (long) this.anInt414 + this.aLong26) {
				Static107.method993(this.aByteArray5, (int) (this.aLong25 - this.aLong26), arg2, 0, arg1);
				this.aLong25 += arg1;
				return;
			}
			@Pc(86) long local86 = this.aLong25;
			@Pc(88) int local88 = arg1;
			@Pc(124) int local124;
			if (this.aLong25 >= this.aLong27 && this.aLong25 < (long) this.anInt417 + this.aLong27) {
				local124 = (int) ((long) this.anInt417 + this.aLong27 - this.aLong25);
				if (arg1 < local124) {
					local124 = arg1;
				}
				arg1 -= local124;
				Static107.method993(this.aByteArray4, (int) (this.aLong25 - this.aLong27), arg2, 0, local124);
				this.aLong25 += local124;
				arg0 = local124;
			}
			if (this.aByteArray4.length < arg1) {
				this.aClass16_4.method367(this.aLong25);
				this.aLong28 = this.aLong25;
				while (arg1 > 0) {
					local124 = this.aClass16_4.method364(arg2, arg1, arg0);
					if (local124 == -1) {
						break;
					}
					this.aLong25 += local124;
					arg1 -= local124;
					this.aLong28 += local124;
					arg0 += local124;
				}
			} else if (arg1 > 0) {
				this.method349();
				local124 = arg1;
				if (arg1 > this.anInt417) {
					local124 = this.anInt417;
				}
				arg1 -= local124;
				Static107.method993(this.aByteArray4, 0, arg2, arg0, local124);
				this.aLong25 += local124;
				arg0 += local124;
			}
			if (this.aLong26 != -1L) {
				if (this.aLong26 > this.aLong25 && arg1 > 0) {
					local124 = arg0 + (int) (this.aLong26 - this.aLong25);
					if (local124 > arg0 + arg1) {
						local124 = arg1 + arg0;
					}
					while (arg0 < local124) {
						arg2[arg0++] = 0;
						arg1--;
						this.aLong25++;
					}
				}
				@Pc(312) long local312 = -1L;
				@Pc(314) long local314 = -1L;
				if (this.aLong26 >= local86 && (long) local88 + local86 > this.aLong26) {
					local312 = this.aLong26;
				} else if (local86 >= this.aLong26 && local86 < this.aLong26 + (long) this.anInt414) {
					local312 = local86;
				}
				if (local86 < this.aLong26 + (long) this.anInt414 && local86 + (long) local88 >= this.aLong26 - -((long) this.anInt414)) {
					local314 = this.aLong26 + (long) this.anInt414;
				} else if (this.aLong26 < (long) local88 + local86 && (long) local88 + local86 <= (long) this.anInt414 + this.aLong26) {
					local314 = (long) local88 + local86;
				}
				if (local312 > -1L && local312 < local314) {
					@Pc(435) int local435 = (int) (local314 - local312);
					Static107.method993(this.aByteArray5, (int) (local312 - this.aLong26), arg2, (int) (local312 - local86), local435);
					if (local314 > this.aLong25) {
						arg1 = (int) ((long) arg1 + this.aLong25 - local314);
						this.aLong25 = local314;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong28 = -1L;
			throw local473;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)J", line = 500)
	public long method351() {
		return this.aLong29;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 535)
	private void method352() throws IOException {
		if (this.aLong26 == -1L) {
			return;
		}
		if (this.aLong28 != this.aLong26) {
			this.aClass16_4.method367(this.aLong26);
			this.aLong28 = this.aLong26;
		}
		this.aClass16_4.method363(0, this.anInt414, this.aByteArray5);
		this.aLong28 += this.anInt414;
		@Pc(47) long local47 = -1L;
		@Pc(49) long local49 = -1L;
		if (this.aLong28 > this.aLong30) {
			this.aLong30 = this.aLong28;
		}
		if (this.aLong27 < (long) this.anInt414 + this.aLong26 && (long) this.anInt414 + this.aLong26 <= (long) this.anInt417 + this.aLong27) {
			local47 = this.aLong26 + (long) this.anInt414;
		} else if (this.aLong26 < this.aLong27 + (long) this.anInt417 && this.aLong26 + (long) this.anInt414 >= (long) this.anInt417 + this.aLong27) {
			local47 = this.aLong27 + (long) this.anInt417;
		}
		if (this.aLong27 <= this.aLong26 && (long) this.anInt417 + this.aLong27 > this.aLong26) {
			local49 = this.aLong26;
		} else if (this.aLong27 >= this.aLong26 && this.aLong27 < (long) this.anInt414 + this.aLong26) {
			local49 = this.aLong27;
		}
		if (local49 > -1L && local47 > local49) {
			@Pc(195) int local195 = (int) (local47 - local49);
			Static107.method993(this.aByteArray5, (int) (local49 - this.aLong26), this.aByteArray4, (int) (local49 - this.aLong27), local195);
		}
		this.anInt414 = 0;
		this.aLong26 = -1L;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 611)
	public void method353() throws IOException {
		this.method352();
		this.aClass16_4.method362();
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!dc;II)V", line = 641)
	public Class14(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass16_4 = arg0;
		this.aLong29 = this.aLong30 = arg0.method365();
		this.aLong25 = 0L;
		this.aByteArray5 = new byte[arg2];
		this.aByteArray4 = new byte[arg1];
	}
}
