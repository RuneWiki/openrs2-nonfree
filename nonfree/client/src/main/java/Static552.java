import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!su", name = "r", descriptor = "I")
	public static int anInt10277;

	@OriginalMember(owner = "client!su", name = "j", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable37 = new Hashtable();

	@OriginalMember(owner = "client!su", name = "p", descriptor = "I")
	public static int anInt10276 = 0;

	@OriginalMember(owner = "client!su", name = "q", descriptor = "Lclient!pg;")
	public static final Class271 aClass271_34 = new Class271();

	@OriginalMember(owner = "client!su", name = "s", descriptor = "[I")
	public static final int[] anIntArray594 = new int[1000];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!kv;B)V")
	public static void method8571(@OriginalArg(0) Class143_Sub2 arg0) {
		@Pc(21) byte[] local21;
		if (Static242.anObject21 == null) {
			@Pc(14) Class15_Sub1_Sub1 local14 = new Class15_Sub1_Sub1();
			local21 = local14.method2804();
			Static242.anObject21 = Static280.method3887(local21);
		}
		if (Static533.anObject17 == null) {
			@Pc(34) Class15_Sub2_Sub1 local34 = new Class15_Sub2_Sub1();
			local21 = local34.method7564();
			Static533.anObject17 = Static280.method3887(local21);
		}
		@Pc(49) Class151 local49 = arg0.aClass151_1;
		if (local49.method3103() && Static19.anObject1 == null) {
			local21 = Static59.method5267(4.0F, 0.5F, new Class43_Sub1(419684), 0.6F, 16.0F, 4.0F);
			Static19.anObject1 = Static280.method3887(local21);
		}
	}
}
