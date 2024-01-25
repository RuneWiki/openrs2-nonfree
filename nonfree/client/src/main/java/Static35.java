import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
	public static int anInt773;

	@OriginalMember(owner = "client!bda", name = "z", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!bda", name = "A", descriptor = "I")
	public static int anInt776 = 0;

	@OriginalMember(owner = "client!bda", name = "D", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(II)Z")
	public static boolean method826(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class2_Sub6_Sub3 local14 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8524(); local14 != null; local14 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8519()) {
			if (Static299.method5338(local14.anInt2631) && (long) arg0 == local14.aLong61) {
				return true;
			}
		}
		return false;
	}
}
