import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_27 = new Class197(9, 0, 4, 1);

	@OriginalMember(owner = "client!uda", name = "i", descriptor = "Lclient!hfa;")
	public static final Class152 aClass152_7 = new Class152(3, 2);

	@OriginalMember(owner = "client!uda", name = "j", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_28 = new Class197(6, 0, 4, 2);

	@OriginalMember(owner = "client!uda", name = "h", descriptor = "[I")
	public static final int[] anIntArray706 = new int[25];

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
	public static void method8671() {
		if (Static650.aClass2_Sub30_29.aClass11_Sub12_1.method2753() == 0 && Static597.anInt9295 != Static684.anInt10516) {
			Static63.method951(Static719.anInt10965, 12, false, Static663.anInt9247);
		} else {
			Static529.method7449(Static396.aClass145_6);
			if (Static607.anInt9429 != Static684.anInt10516) {
				Static21.method280();
			}
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)C")
	public static char method8672(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(45) char local45 = Static456.aCharArray7[local7 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local7 = local45;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)I")
	public static int method8675(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
