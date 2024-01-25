import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
	public static int anInt4042;

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "Lclient!bt;")
	public static final Class48 aClass48_10 = new Class48(3, 4);

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
	public static int anInt4043 = -1;

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
	public static int anInt4046 = -1;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLclient!jha;)V")
	public static void method3440(@OriginalArg(1) Class28_Sub1_Sub4_Sub2_Sub2 arg0) {
		@Pc(16) Class5_Sub52 local16 = (Class5_Sub52) Static520.aClass300_40.method7188((long) arg0.anInt5512);
		if (local16 == null) {
			return;
		}
		if (local16.aClass5_Sub17_Sub2_2 != null) {
			Static245.aClass5_Sub17_Sub4_2.method6184(local16.aClass5_Sub17_Sub2_2);
			local16.aClass5_Sub17_Sub2_2 = null;
		}
		local16.method9052();
	}
}
