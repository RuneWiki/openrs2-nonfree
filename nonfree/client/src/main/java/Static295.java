import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
	public static int anInt4558;

	@OriginalMember(owner = "client!jfa", name = "w", descriptor = "Lclient!re;")
	public static final Class320 aClass320_3 = new Class320();

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IILclient!nca;I)Lclient!tv;")
	public static Class2_Sub6_Sub21 method4160(@OriginalArg(1) int arg0, @OriginalArg(2) Class254 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2_Sub20 local16 = new Class2_Sub20(arg1.method6087(arg2, arg0));
		@Pc(48) Class2_Sub6_Sub21 local48 = new Class2_Sub6_Sub21(arg2, local16.method8553(), local16.method8553(), local16.method8555(-9372), local16.method8555(-9372), local16.method8581(-17416) == 1, local16.method8581(-17416), local16.method8581(-17416));
		@Pc(52) int local52 = local16.method8581(-17416);
		for (@Pc(54) int local54 = 0; local54 < local52; local54++) {
			local48.aClass60_199.method1233(new Class2_Sub54(local16.method8581(-17416), local16.method8575(), local16.method8575(), local16.method8575(), local16.method8575(), local16.method8575(), local16.method8575(), local16.method8575(), local16.method8575()));
		}
		local48.method8512();
		return local48;
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
	public static void method4162() {
		Static704.anIntArray747 = null;
		Static570.anIntArray655 = null;
		Static620.aBoolean886 = false;
		Static68.anIntArray104 = null;
		Static575.anIntArray661 = null;
		Static331.anIntArray360 = null;
	}
}
