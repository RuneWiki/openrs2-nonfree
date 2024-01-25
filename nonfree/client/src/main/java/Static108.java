import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "Lclient!nk;")
	public static final Class174 aClass174_2 = new Class174("LOCAL", 4);

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	public static int anInt2094 = 0;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	public static int anInt2095 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZZILjava/lang/String;IIJLjava/lang/String;IIZ)V")
	public static void method1711(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) long arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class1_Sub14 local28 = new Class1_Sub14(128);
		local28.method4553(10);
		local28.method4504((arg9 ? 2 : 0) | (arg1 ? 1 : 0) | (arg0 ? 4 : 0));
		local28.method4502(arg5);
		local28.method4522(local8[0]);
		local28.method4512(arg6);
		local28.method4522(local8[1]);
		local28.method4504(Static311.anInt6534);
		local28.method4553(arg7);
		local28.method4553(arg4);
		local28.method4522(local8[2]);
		local28.method4504(arg2);
		local28.method4504(arg8);
		local28.method4522(local8[3]);
		local28.method4543(Static233.aBigInteger1, Static321.aBigInteger2);
		@Pc(118) Class1_Sub14 local118 = new Class1_Sub14(350);
		local118.method4512(arg3);
		@Pc(134) int local134 = 8 - Static388.method5637(arg3) % 8;
		for (@Pc(136) int local136 = 0; local136 < local134; local136++) {
			local118.method4553((int) (Math.random() * 255.0D));
		}
		local118.method4542(local8);
		Static201.aClass1_Sub14_Sub2_2.anInt5695 = 0;
		Static201.aClass1_Sub14_Sub2_2.method4553(Static121.aClass44_8.anInt793);
		Static201.aClass1_Sub14_Sub2_2.method4504(local118.anInt5695 + local28.anInt5695 + 2);
		Static201.aClass1_Sub14_Sub2_2.method4504(588);
		Static201.aClass1_Sub14_Sub2_2.method4506(local28.aByteArray65, local28.anInt5695);
		Static201.aClass1_Sub14_Sub2_2.method4506(local118.aByteArray65, local118.anInt5695);
		Static230.anInt4025 = -3;
		Static312.anInt5262 = 1;
		Static305.anInt5156 = 0;
		Static382.anInt5721 = 0;
	}
}
