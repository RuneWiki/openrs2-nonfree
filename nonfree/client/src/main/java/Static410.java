import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_138 = new Class119("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "Z")
	public static boolean aBoolean670 = true;

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_149 = new Class12(21, -2);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[F)[F")
	public static float[] method4612(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static468.method5041(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBILclient!ni;)V")
	public static void method4613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub32 arg3) {
		@Pc(16) long local16 = (long) (arg0 << 28 | arg1 << 14 | arg2);
		@Pc(30) Class1_Sub2 local30 = (Class1_Sub2) Static425.aClass199_179.method4387(local16);
		if (local30 == null) {
			local30 = new Class1_Sub2();
			Static425.aClass199_179.method4383(local16, local30);
			local30.aClass227_3.method4972(arg3);
			return;
		}
		@Pc(53) Class162 local53 = Static342.aClass155_2.method3548(arg3.anInt4852);
		@Pc(56) int local56 = local53.anInt4744;
		if (local53.anInt4715 == 1) {
			local56 *= arg3.anInt4854 + 1;
		}
		for (@Pc(73) Class1_Sub32 local73 = (Class1_Sub32) local30.aClass227_3.method4967(); local73 != null; local73 = (Class1_Sub32) local30.aClass227_3.method4973()) {
			local53 = Static342.aClass155_2.method3548(local73.anInt4852);
			@Pc(84) int local84 = local53.anInt4744;
			if (local53.anInt4715 == 1) {
				local84 *= local73.anInt4854 + 1;
			}
			if (local84 < local56) {
				Static237.method3398(local73, arg3);
				return;
			}
		}
		local30.aClass227_3.method4972(arg3);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIB)B")
	public static byte method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
