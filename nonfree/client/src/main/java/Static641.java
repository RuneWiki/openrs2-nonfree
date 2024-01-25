import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!in;Ljava/lang/String;ZB)Lclient!tu;")
	public static Class333 method9217(@OriginalArg(0) Class157 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) int local10 = arg0.method4571(arg1);
		if (local10 == -1) {
			return new Class333(0);
		}
		@Pc(31) int[] local31 = arg0.method4550(local10);
		@Pc(37) Class333 local37 = new Class333(local31.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local39 < local37.anInt9955) {
				@Pc(55) Class2_Sub11 local55 = new Class2_Sub11(arg0.method4564(local10, local31[local41++]));
				@Pc(59) int local59 = local55.method8381();
				@Pc(65) int local65 = local55.method8326();
				@Pc(69) int local69 = local55.method8383();
				if (!arg2 && local69 == 1) {
					local37.anInt9955--;
				} else {
					local37.anIntArray646[local39] = local59;
					local37.anIntArray647[local39] = local65;
					local39++;
				}
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BIZ)I")
	public static int method9218(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub24 local14 = Static628.method9105(arg0, false);
		if (local14 == null) {
			return Static133.aClass349_1.method8645(arg0).anInt8172;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray263.length; local26++) {
			if (local14.anIntArray263[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static133.aClass349_1.method8645(arg0).anInt8172 - local14.anIntArray263.length;
	}
}
