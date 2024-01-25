import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
	public static int anInt3883;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZLclient!oj;)V")
	public static void method3497(@OriginalArg(1) Class5_Sub5_Sub15 arg0) {
		if (Static142.aBoolean190) {
			return;
		}
		arg0.method9047();
		Static491.anInt8293--;
		if (!arg0.aBoolean473) {
			@Pc(86) long local86 = arg0.aLong173;
			@Pc(92) Class5_Sub5_Sub4 local92;
			for (local92 = (Class5_Sub5_Sub4) Static594.aClass273_45.method6581(local86); local92 != null && !local92.aString26.equals(arg0.aString75); local92 = (Class5_Sub5_Sub4) Static594.aClass273_45.method6582()) {
			}
			if (local92 != null && local92.method1896(arg0)) {
				Static157.method2274(local92);
			}
			return;
		}
		for (@Pc(31) Class5_Sub5_Sub4 local31 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8702(); local31 != null; local31 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8710()) {
			if (local31.aString26.equals(arg0.aString75)) {
				@Pc(41) boolean local41 = false;
				for (@Pc(47) Class5_Sub5_Sub15 local47 = (Class5_Sub5_Sub15) local31.aClass368_2.method8702(); local47 != null; local47 = (Class5_Sub5_Sub15) local31.aClass368_2.method8710()) {
					if (arg0 == local47) {
						if (local31.method1896(arg0)) {
							Static157.method2274(local31);
						}
						local41 = true;
						break;
					}
				}
				if (local41) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "([SII)[S")
	public static short[] method3498(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static652.method4547(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
	public static void method3499() {
		if (Static600.aClass133_15 != null) {
			Static600.aClass133_15.method7295();
			Static368.aClass55_11 = null;
			Static600.aClass133_15 = null;
		}
	}
}
