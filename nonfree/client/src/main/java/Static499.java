import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "[Lclient!rj;")
	public static final Class290[] aClass290Array2 = new Class290[14];

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "Lclient!sea;")
	public static final Class304 aClass304_6 = new Class304();

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_118 = new Class218(25, -1);

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "Lclient!us;")
	public static final Class344 aClass344_107 = new Class344(65, 3);

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
	public static int anInt8835 = -2;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!lea;I)I")
	public static int method7288(@OriginalArg(0) Class2_Sub3_Sub1_Sub2_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt6350;
		@Pc(14) Class232 local14 = arg0.method5304();
		if (arg0.anInt6273 == -1 || arg0.aBoolean531) {
			local8 = arg0.anInt6375;
		} else if (local14.anInt7157 == arg0.anInt6273 || arg0.anInt6273 == local14.anInt7185 || local14.anInt7153 == arg0.anInt6273 || local14.anInt7161 == arg0.anInt6273) {
			local8 = arg0.anInt6382;
		} else if (arg0.anInt6273 == local14.anInt7175 || local14.anInt7188 == arg0.anInt6273 || arg0.anInt6273 == local14.anInt7178 || local14.anInt7150 == arg0.anInt6273) {
			local8 = arg0.anInt6348;
		}
		return local8;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!qb;)V")
	public static void method7289(@OriginalArg(1) Class3_Sub38 arg0) {
		if (Static170.aClass106ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface18 local8 = null;
		if (arg0.anInt8086 == 0) {
			local8 = (Interface18) Static639.method8624(arg0.anInt8096, arg0.anInt8095, arg0.anInt8088);
		}
		if (arg0.anInt8086 == 1) {
			local8 = (Interface18) Static359.method7955(arg0.anInt8096, arg0.anInt8095, arg0.anInt8088);
		}
		if (arg0.anInt8086 == 2) {
			local8 = (Interface18) Static17.method258(arg0.anInt8096, arg0.anInt8095, arg0.anInt8088, op.class);
		}
		if (arg0.anInt8086 == 3) {
			local8 = (Interface18) Static439.method6676(arg0.anInt8096, arg0.anInt8095, arg0.anInt8088);
		}
		if (local8 == null) {
			arg0.anInt8098 = 0;
			arg0.anInt8092 = -1;
			arg0.anInt8097 = 0;
		} else {
			arg0.anInt8092 = local8.method8587();
			arg0.anInt8097 = local8.method8588();
			arg0.anInt8098 = local8.method8586();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)I")
	public static int method7290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local7;
	}
}
