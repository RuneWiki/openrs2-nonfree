import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
	public static int anInt8698;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "Z")
	public static boolean aBoolean573 = false;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILclient!dq;II)V")
	public static void method7490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class87 arg3, @OriginalArg(4) int arg4) {
		@Pc(19) Class5_Sub50 local19 = null;
		for (@Pc(24) Class5_Sub50 local24 = (Class5_Sub50) Static227.aClass20_61.method378(); local24 != null; local24 = (Class5_Sub50) Static227.aClass20_61.method366()) {
			if (local24.anInt8725 == arg2 && local24.anInt8721 == arg4 && arg1 == local24.anInt8723 && arg0 == local24.anInt8717) {
				local19 = local24;
				break;
			}
		}
		if (local19 == null) {
			local19 = new Class5_Sub50();
			local19.anInt8725 = arg2;
			local19.anInt8717 = arg0;
			local19.anInt8721 = arg4;
			local19.anInt8723 = arg1;
			Static227.aClass20_61.method370(local19);
		}
		local19.aClass87_2 = arg3;
		local19.aBoolean576 = true;
		local19.aBoolean575 = false;
	}
}
