import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
	public static int anInt4260;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array16;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
	public static int anInt4263;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
	public static int anInt4259 = -1;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "F")
	public static float aFloat44 = 0.0F;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!kr;II)Lclient!em;")
	public static Class64 method3743(@OriginalArg(0) Class67_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class64 local9;
		if (Static15.aClass64_6 == null) {
			local9 = new Class64();
		} else {
			local9 = Static15.aClass64_6;
			Static15.aClass64_6 = Static15.aClass64_6.aClass64_2;
			local9.aClass64_2 = null;
			Static189.anInt625--;
		}
		local9.aClass67_Sub3_1 = arg0;
		local9.anInt1418 = arg1;
		return local9;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
	public static void method3745(@OriginalArg(1) int arg0) {
		Static192.anInt3950 = arg0;
		@Pc(7) Class26 local7 = Static11.aClass26_1;
		synchronized (Static11.aClass26_1) {
			Static11.aClass26_1.method333();
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)[B")
	public static byte[] method3746(@OriginalArg(1) int arg0) {
		@Pc(12) Class11_Sub4_Sub10 local12 = (Class11_Sub4_Sub10) Static59.aClass142_5.method3874((long) arg0);
		if (local12 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(48) int local48 = 0; local48 < 255; local48++) {
				@Pc(55) int local55 = 255 - local48;
				@Pc(60) int local60 = Static331.method5444(local55, local31);
				@Pc(64) byte local64 = local25[local60];
				local25[local60] = local25[local55];
				local25[local55] = local25[511 - local48] = local64;
			}
			local12 = new Class11_Sub4_Sub10(local25);
			Static59.aClass142_5.method3870(local12, (long) arg0);
		}
		return local12.aByteArray58;
	}
}
