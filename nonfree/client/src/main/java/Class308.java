import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class308 {

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "[C")
	public static final char[] aCharArray8;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "F")
	public float aFloat178 = 1.0F;

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "F")
	public float aFloat182 = 1.0F;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "F")
	public float aFloat180 = 0.25F;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
	public final int anInt8704;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "F")
	public final float aFloat177;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "F")
	public final float aFloat181;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
	public final int anInt8707;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
	public final int anInt8708;

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
	public final int anInt8705;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "F")
	public final float aFloat179;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
	public final int anInt8699;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	public final int anInt8701;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "Lclient!qba;")
	public final Class25 aClass25_5;

	static {
		new Class114("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
		aCharArray8 = new char[64];
		for (@Pc(20) int local20 = 0; local20 < 26; local20++) {
			aCharArray8[local20] = (char) (local20 + 65);
		}
		for (@Pc(34) int local34 = 26; local34 < 52; local34++) {
			aCharArray8[local34] = (char) (local34 + 97 - 26);
		}
		for (@Pc(50) int local50 = 52; local50 < 62; local50++) {
			aCharArray8[local50] = (char) (local50 + 48 - 52);
		}
		aCharArray8[62] = '+';
		aCharArray8[63] = '/';
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class308() {
		this.anInt8704 = -50;
		this.aFloat177 = 1.2F;
		this.aFloat181 = 1.1523438F;
		this.anInt8707 = -60;
		this.anInt8708 = 0;
		this.anInt8705 = Static425.anInt7380;
		this.aFloat179 = 0.69921875F;
		this.anInt8699 = -50;
		this.anInt8701 = Static79.anInt2106;
		this.aClass25_5 = Static384.aClass25_4;
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!gw;)V")
	public Class308(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(14) int local14 = arg0.method3043();
		if (Static89.aClass1_Sub28_Sub1_1.method4260(Static526.anInt8926) && Static397.aClass9_6.method7582() > 0) {
			if ((local14 & 0x1) == 0) {
				this.anInt8705 = Static425.anInt7380;
			} else {
				this.anInt8705 = arg0.method3037();
			}
			if ((local14 & 0x2) == 0) {
				this.aFloat181 = 1.1523438F;
			} else {
				this.aFloat181 = (float) arg0.method3056() / 256.0F;
			}
			if ((local14 & 0x4) == 0) {
				this.aFloat179 = 0.69921875F;
			} else {
				this.aFloat179 = (float) arg0.method3056() / 256.0F;
			}
			if ((local14 & 0x8) == 0) {
				this.aFloat177 = 1.2F;
			} else {
				this.aFloat177 = (float) arg0.method3056() / 256.0F;
			}
		} else {
			if ((local14 & 0x1) != 0) {
				arg0.method3037();
			}
			if ((local14 & 0x2) != 0) {
				arg0.method3056();
			}
			if ((local14 & 0x4) != 0) {
				arg0.method3056();
			}
			if ((local14 & 0x8) != 0) {
				arg0.method3056();
			}
			this.anInt8705 = Static425.anInt7380;
			this.aFloat177 = 1.2F;
			this.aFloat179 = 0.69921875F;
			this.aFloat181 = 1.1523438F;
		}
		if ((local14 & 0x10) == 0) {
			this.anInt8704 = -50;
			this.anInt8699 = -50;
			this.anInt8707 = -60;
		} else {
			this.anInt8704 = arg0.method3058();
			this.anInt8707 = arg0.method3058();
			this.anInt8699 = arg0.method3058();
		}
		if ((local14 & 0x20) == 0) {
			this.anInt8701 = Static79.anInt2106;
		} else {
			this.anInt8701 = arg0.method3037();
		}
		if ((local14 & 0x40) == 0) {
			this.anInt8708 = 0;
		} else {
			this.anInt8708 = arg0.method3056();
		}
		if ((local14 & 0x80) == 0) {
			this.aClass25_5 = Static384.aClass25_4;
		} else {
			@Pc(210) int local210 = arg0.method3056();
			@Pc(214) int local214 = arg0.method3056();
			@Pc(218) int local218 = arg0.method3056();
			@Pc(222) int local222 = arg0.method3056();
			@Pc(226) int local226 = arg0.method3056();
			@Pc(230) int local230 = arg0.method3056();
			this.aClass25_5 = Static242.method1906(local218, local230, local222, local210, local214, local226);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!gw;B)V")
	public void method7361(@OriginalArg(0) Class1_Sub13 arg0) {
		this.aFloat178 = (float) (arg0.method3043() * 8) / 255.0F;
		this.aFloat180 = (float) (arg0.method3043() * 8) / 255.0F;
		this.aFloat182 = (float) (arg0.method3043() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLclient!vn;)Z")
	public boolean method7364(@OriginalArg(1) Class308 arg0) {
		return arg0.anInt8705 == this.anInt8705 && arg0.aFloat181 == this.aFloat181 && this.aFloat179 == arg0.aFloat179 && arg0.aFloat177 == this.aFloat177 && arg0.aFloat180 == this.aFloat180 && this.aFloat178 == arg0.aFloat178 && arg0.aFloat182 == this.aFloat182 && arg0.anInt8701 == this.anInt8701 && this.anInt8708 == arg0.anInt8708 && this.aClass25_5 == arg0.aClass25_5;
	}
}
