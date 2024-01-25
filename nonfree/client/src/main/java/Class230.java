import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class230 {

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "[C")
	private static final char[] aCharArray7 = new char[64];

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "Lclient!ps;")
	public Class8_Sub16_Sub3 aClass8_Sub16_Sub3_3;

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "Lclient!vea;")
	public Class354 aClass354_1;

	@OriginalMember(owner = "client!nu", name = "n", descriptor = "Lclient!cr;")
	public Class8_Sub13 aClass8_Sub13_3;

	@OriginalMember(owner = "client!nu", name = "o", descriptor = "Lclient!cba;")
	public Class8_Sub9_Sub1 aClass8_Sub9_Sub1_3;

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
	public final int anInt7111;

	@OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
	public final int anInt7113;

	@OriginalMember(owner = "client!nu", name = "q", descriptor = "Lclient!rr;")
	public final Class15_Sub1 aClass15_Sub1_15;

	@OriginalMember(owner = "client!nu", name = "p", descriptor = "B")
	public final byte aByte70;

	@OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
	public final int anInt7117;

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
	public int anInt7109;

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
	public final int anInt7116;

	@OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
	public final int anInt7118;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray7[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray7[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray7[local36] = (char) (local36 - 4);
		}
		aCharArray7[63] = '/';
		aCharArray7[62] = '+';
	}

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(BIIIIIILclient!rr;)V")
	public Class230(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class15_Sub1 arg7) {
		this.anInt7111 = arg4;
		this.anInt7113 = arg2;
		this.aClass15_Sub1_15 = arg7;
		this.aByte70 = arg0;
		this.anInt7117 = arg1;
		this.anInt7109 = arg3;
		this.anInt7116 = arg6;
		this.anInt7118 = arg5;
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)Z")
	public boolean method5854() {
		return this.aByte70 == 2 || this.aByte70 == 3;
	}
}
