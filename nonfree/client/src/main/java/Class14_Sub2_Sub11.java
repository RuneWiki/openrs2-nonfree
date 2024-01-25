import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class14_Sub2_Sub11 extends Class14_Sub2 {

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "[C")
	private static final char[] aCharArray5 = new char[64];

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "Lclient!ffa;")
	public final Class4_Sub3_Sub3_Sub1 aClass4_Sub3_Sub3_Sub1_1;

	static {
		for (@Pc(90) int local90 = 0; local90 < 26; local90++) {
			aCharArray5[local90] = (char) (local90 + 65);
		}
		for (@Pc(104) int local104 = 26; local104 < 52; local104++) {
			aCharArray5[local104] = (char) (local104 + 71);
		}
		for (@Pc(120) int local120 = 52; local120 < 62; local120++) {
			aCharArray5[local120] = (char) (local120 + 48 - 52);
		}
		aCharArray5[63] = '-';
		aCharArray5[62] = '*';
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class14_Sub2_Sub11(@OriginalArg(0) Class4_Sub3_Sub3_Sub1 arg0) {
		this.aClass4_Sub3_Sub3_Sub1_1 = arg0;
	}
}
