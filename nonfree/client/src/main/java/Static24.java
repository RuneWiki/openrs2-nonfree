import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!au", name = "C", descriptor = "[Lclient!raa;")
	public static Class250[] aClass250Array3;

	@OriginalMember(owner = "client!au", name = "D", descriptor = "Lclient!ha;")
	public static Class25 aClass25_9;

	@OriginalMember(owner = "client!au", name = "v", descriptor = "Lclient!dg;")
	public static final Class63 aClass63_4 = new Class63();

	@OriginalMember(owner = "client!au", name = "y", descriptor = "Lclient!fea;")
	public static final Class99 aClass99_25 = new Class99();

	@OriginalMember(owner = "client!au", name = "A", descriptor = "Lclient!oh;")
	public static Class220 aClass220_9 = null;

	@OriginalMember(owner = "client!au", name = "B", descriptor = "Lclient!ep;")
	public static final Class89 aClass89_3 = new Class89();

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILclient!gm;)V")
	public static void method3372(@OriginalArg(1) Class5_Sub22 arg0) {
		if (Static152.aClass37ArrayArrayArray1 == null) {
			return;
		}
		@Pc(16) Interface10 local16 = null;
		if (arg0.anInt3294 == 0) {
			local16 = (Interface10) Static490.method6780(arg0.anInt3301, arg0.anInt3297, arg0.anInt3296);
		}
		if (arg0.anInt3294 == 1) {
			local16 = (Interface10) Static475.method6634(arg0.anInt3301, arg0.anInt3297, arg0.anInt3296);
		}
		if (arg0.anInt3294 == 2) {
			local16 = (Interface10) Static188.method3173(arg0.anInt3301, arg0.anInt3297, arg0.anInt3296, p.class);
		}
		if (arg0.anInt3294 == 3) {
			local16 = (Interface10) Static469.method6581(arg0.anInt3301, arg0.anInt3297, arg0.anInt3296);
		}
		if (local16 == null) {
			arg0.anInt3299 = 0;
			arg0.anInt3304 = 0;
			arg0.anInt3307 = -1;
		} else {
			arg0.anInt3307 = local16.method6868();
			arg0.anInt3304 = local16.method6867();
			arg0.anInt3299 = local16.method6866();
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IBI)B")
	public static byte method3375(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
