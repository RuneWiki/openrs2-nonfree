import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!m", name = "r", descriptor = "I")
	public static int anInt4687;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "Lclient!jk;")
	public static Class122 aClass122_3;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!so;")
	public static final Class236 aClass236_1 = new Class236();

	@OriginalMember(owner = "client!m", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray88 = new boolean[100];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILclient!iu;)Z")
	public static boolean method3991(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub20_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method3245(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(110) int local110;
		if (local8 == 0) {
			if (arg1.method3245(1) != 0) {
				method3991(arg0, arg1);
			}
			local28 = arg1.method3245(6);
			local33 = arg1.method3245(6);
			@Pc(43) boolean local43 = arg1.method3245(1) == 1;
			if (local43) {
				Static401.anIntArray572[Static239.anInt4701++] = arg0;
			}
			if (Static39.aClass11_Sub5_Sub2_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(66) Class112 local66 = Static228.aClass112Array1[arg0];
			@Pc(74) Class11_Sub5_Sub2_Sub1 local74 = Static39.aClass11_Sub5_Sub2_Sub1Array1[arg0] = new Class11_Sub5_Sub2_Sub1();
			local74.anInt6518 = arg0;
			if (Static116.aClass4_Sub20Array1[arg0] != null) {
				local74.method3619(Static116.aClass4_Sub20Array1[arg0]);
			}
			local74.method5297(local66.anInt3432, true);
			local74.anInt6495 = local66.anInt3433;
			local100 = local66.anInt3431;
			local104 = local100 >> 28;
			local110 = local100 >> 14 & 0xFF;
			@Pc(114) int local114 = local100 & 0xFF;
			local74.aBoolean262 = local66.aBoolean229;
			local74.aByteArray87[0] = Static326.aByteArray82[arg0];
			local74.aByte100 = (byte) local104;
			local74.method3617(local28 + (local110 << 6) - Static426.anInt7325, -Static72.anInt1776 + (local114 << 6) + local33);
			local74.aBoolean263 = false;
			Static228.aClass112Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg1.method3245(2);
			local33 = Static228.aClass112Array1[arg0].anInt3431;
			Static228.aClass112Array1[arg0].anInt3431 = (local33 & 0xFFFFFFF) + ((local28 + (local33 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(215) int local215;
			@Pc(220) int local220;
			@Pc(228) int local228;
			if (local8 != 2) {
				local28 = arg1.method3245(18);
				local33 = local28 >> 16;
				local215 = local28 >> 8 & 0xFF;
				local220 = local28 & 0xFF;
				local228 = Static228.aClass112Array1[arg0].anInt3431;
				local100 = (local228 >> 28) + local33 & 0x3;
				local104 = local215 + (local228 >> 14) & 0xFF;
				local110 = local220 + local228 & 0xFF;
				Static228.aClass112Array1[arg0].anInt3431 = local110 + (local104 << 14) + (local100 << 28);
				return false;
			}
			local28 = arg1.method3245(5);
			local33 = local28 >> 3;
			local215 = local28 & 0x7;
			local220 = Static228.aClass112Array1[arg0].anInt3431;
			local228 = local33 + (local220 >> 28) & 0x3;
			local100 = local220 >> 14 & 0xFF;
			local104 = local220 & 0xFF;
			if (local215 == 0) {
				local100--;
				local104--;
			}
			if (local215 == 1) {
				local104--;
			}
			if (local215 == 2) {
				local100++;
				local104--;
			}
			if (local215 == 3) {
				local100--;
			}
			if (local215 == 4) {
				local100++;
			}
			if (local215 == 5) {
				local104++;
				local100--;
			}
			if (local215 == 6) {
				local104++;
			}
			if (local215 == 7) {
				local104++;
				local100++;
			}
			Static228.aClass112Array1[arg0].anInt3431 = local104 + (local228 << 28) + (local100 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!an;")
	public static Class4_Sub2 method3992(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class4_Sub2_Sub1");
			@Pc(10) Class4_Sub2 local10 = (Class4_Sub2) local6.getDeclaredConstructor().newInstance();
			local10.method4705(arg0);
			return local10;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class4_Sub2_Sub2 local26 = new Class4_Sub2_Sub2();
			local26.method4705(arg0);
			return local26;
		}
	}
}
