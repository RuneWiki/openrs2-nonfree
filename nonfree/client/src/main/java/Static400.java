import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
	public static int anInt6813 = 0;

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "I")
	public static int anInt6817 = -1;

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "I")
	public static int anInt6818 = 104;

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "[Lclient!nr;")
	public static final Interface16[] anInterface16Array2 = new Interface16[128];

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLclient!om;)I")
	public static int method5832(@OriginalArg(1) Class246 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5667(Static410.anInt6920)) {
			local5++;
		}
		if (arg0.method5667(Static376.anInt6363)) {
			local5++;
		}
		if (arg0.method5667(Static160.anInt3217)) {
			local5++;
		}
		if (arg0.method5667(Static243.anInt4530)) {
			local5++;
		}
		if (arg0.method5667(Static233.anInt4433)) {
			local5++;
		}
		if (arg0.method5667(Static416.anInt6986)) {
			local5++;
		}
		if (arg0.method5667(Static451.anInt7398)) {
			local5++;
		}
		if (arg0.method5667(Static2.anInt17)) {
			local5++;
		}
		if (arg0.method5667(Static225.anInt4392)) {
			local5++;
		}
		if (arg0.method5667(Static193.anInt3726)) {
			local5++;
		}
		if (arg0.method5667(Static536.anInt8406)) {
			local5++;
		}
		if (arg0.method5667(Static597.anInt9434)) {
			local5++;
		}
		if (arg0.method5667(Static569.anInt9141)) {
			local5++;
		}
		if (arg0.method5667(Static409.anInt6458)) {
			local5++;
		}
		if (arg0.method5667(Static193.anInt3724)) {
			local5++;
		}
		if (arg0.method5667(Static462.anInt7556)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z)V")
	public static void method5833() {
		Static488.anIntArray608 = Static243.method4016(0.4F);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!bw;II)Z")
	public static boolean method5835(@OriginalArg(0) Class3_Sub11_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0.method990(2);
		@Pc(33) int local33;
		@Pc(40) int local40;
		@Pc(111) int local111;
		@Pc(115) int local115;
		@Pc(121) int local121;
		if (local10 == 0) {
			if (arg0.method990(1) != 0) {
				method5835(arg0, arg1);
			}
			local33 = arg0.method990(6);
			local40 = arg0.method990(6);
			@Pc(52) boolean local52 = arg0.method990(1) == 1;
			if (local52) {
				Static394.anIntArray542[Static348.anInt6099++] = arg1;
			}
			if (Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(75) Class74 local75 = Static250.aClass74Array1[arg1];
			@Pc(83) Class9_Sub1_Sub1_Sub2_Sub2 local83 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[arg1] = new Class9_Sub1_Sub1_Sub2_Sub2();
			local83.anInt6429 = arg1;
			if (Static375.aClass3_Sub11Array1[arg1] != null) {
				local83.method5589(Static375.aClass3_Sub11Array1[arg1]);
			}
			local83.method5559(local75.anInt2638, true);
			local83.anInt6463 = local75.anInt2641;
			local111 = local75.anInt2639;
			local115 = local111 >> 28;
			local121 = local111 >> 14 & 0xFF;
			@Pc(125) int local125 = local111 & 0xFF;
			@Pc(133) int local133 = local33 + (local121 << 6) - Static529.anInt8344;
			@Pc(143) int local143 = (local125 << 6) + local40 - Static463.anInt7588;
			local83.aBoolean535 = local75.aBoolean213;
			local83.aByteArray84[0] = Static203.aByteArray38[arg1];
			local83.aByte126 = local83.aByte125 = (byte) local115;
			if (Static425.method6053(local133, local143)) {
				local83.aByte125++;
			}
			local83.method5585(local133, local143);
			local83.aBoolean532 = false;
			Static250.aClass74Array1[arg1] = null;
			return true;
		} else if (local10 == 1) {
			local33 = arg0.method990(2);
			local40 = Static250.aClass74Array1[arg1].anInt2639;
			Static250.aClass74Array1[arg1].anInt2639 = (local40 & 0xFFFFFFF) + (((local40 >> 28) + local33 & 0x3) << 28);
			return false;
		} else {
			@Pc(244) int local244;
			@Pc(249) int local249;
			@Pc(257) int local257;
			if (local10 != 2) {
				local33 = arg0.method990(18);
				local40 = local33 >> 16;
				local244 = local33 >> 8 & 0xFF;
				local249 = local33 & 0xFF;
				local257 = Static250.aClass74Array1[arg1].anInt2639;
				local111 = (local257 >> 28) + local40 & 0x3;
				local115 = local244 + (local257 >> 14) & 0xFF;
				local121 = local257 + local249 & 0xFF;
				Static250.aClass74Array1[arg1].anInt2639 = local121 + (local111 << 28) + (local115 << 14);
				return false;
			}
			local33 = arg0.method990(5);
			local40 = local33 >> 3;
			local244 = local33 & 0x7;
			local249 = Static250.aClass74Array1[arg1].anInt2639;
			local257 = (local249 >> 28) + local40 & 0x3;
			local111 = local249 >> 14 & 0xFF;
			local115 = local249 & 0xFF;
			if (local244 == 0) {
				local111--;
				local115--;
			}
			if (local244 == 1) {
				local115--;
			}
			if (local244 == 2) {
				local111++;
				local115--;
			}
			if (local244 == 3) {
				local111--;
			}
			if (local244 == 4) {
				local111++;
			}
			if (local244 == 5) {
				local111--;
				local115++;
			}
			if (local244 == 6) {
				local115++;
			}
			if (local244 == 7) {
				local111++;
				local115++;
			}
			Static250.aClass74Array1[arg1].anInt2639 = local115 + (local257 << 28) + (local111 << 14);
			return false;
		}
	}
}
