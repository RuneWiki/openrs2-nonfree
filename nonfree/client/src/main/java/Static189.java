import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLclient!ad;)V")
	public static void method5076(@OriginalArg(1) Class2_Sub3 arg0) {
		arg0.aBoolean404 = false;
		if (arg0.aClass2_Sub10_5 != null) {
			arg0.aClass2_Sub10_5.anInt847 = 0;
		}
		for (@Pc(22) Class2_Sub3 local22 = arg0.method4615(); local22 != null; local22 = arg0.method4618()) {
			method5076(local22);
		}
	}
}
