import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static703 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	public static int anInt10979;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_42 = new Class320(50);

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Z")
	public static boolean aBoolean742 = false;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!br;)[Lclient!jia;")
	public static Class192[] method9306(@OriginalArg(1) Class47 arg0) {
		if (!arg0.method1395()) {
			return new Class192[0];
		}
		@Pc(17) Class338 local17 = arg0.method1396();
		while (local17.anInt8934 == 0) {
			Static550.method7219(10L);
		}
		if (local17.anInt8934 == 2) {
			return new Class192[0];
		}
		@Pc(48) int[] local48 = (int[]) local17.anObject16;
		@Pc(54) Class192[] local54 = new Class192[local48.length >> 2];
		for (@Pc(56) int local56 = 0; local56 < local54.length; local56++) {
			@Pc(62) Class192 local62 = new Class192();
			local54[local56] = local62;
			local62.anInt4995 = local48[local56 << 2];
			local62.anInt4999 = local48[(local56 << 2) + 1];
			local62.anInt4997 = local48[(local56 << 2) + 2];
			local62.anInt4998 = local48[(local56 << 2) + 3];
		}
		return local54;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ika;B)Lclient!io;")
	public static Class104_Sub2_Sub1 method9309(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(15) Class104_Sub2 local15 = Static611.method7809(arg0);
		@Pc(19) int local19 = arg0.method2017();
		return new Class104_Sub2_Sub1(local15.aClass223_11, local15.aClass352_11, local15.anInt8368, local15.anInt8366, local15.anInt8371, local15.anInt8367, local15.anInt8375, local15.anInt8365, local15.anInt8370, local15.anInt4409, local15.anInt4410, local15.anInt4413, local15.anInt4411, local15.anInt4414, local15.anInt4412, local19);
	}
}
