import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public static int anInt6141 = 0;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
	public static void method5211(@OriginalArg(1) int arg0) {
		Static6.anInt6087 = arg0;
		@Pc(7) Class198 local7 = Static164.aClass198_57;
		synchronized (Static164.aClass198_57) {
			Static164.aClass198_57.method5236();
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)V")
	public static void method5212() {
		Static10.anInt248 = -1;
		Static196.anInt4046 = 0;
		Static37.aBoolean434 = false;
		Static221.anInt4557 = 1;
		Static58.anInt1258 = -1;
		Static123.aClass100_57 = null;
		Static270.anInt5435 = 2;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([SZ)[S")
	public static short[] method5214(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) short[] local18 = new short[arg0.length];
			Static367.method4033(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([Lclient!sj;ZI)V")
	public static void method5217(@OriginalArg(0) Class181[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class181 local18 = arg0[local12];
			if (local18 != null) {
				if (local18.anInt5715 == 0) {
					if (local18.aClass181Array2 != null) {
						method5217(local18.aClass181Array2, arg1);
					}
					@Pc(39) Class3_Sub32 local39 = (Class3_Sub32) Static188.aClass24_21.method609((long) local18.anInt5761);
					if (local39 != null) {
						Static82.method1278(local39.anInt4348, arg1);
					}
				}
				@Pc(58) Class3_Sub41 local58;
				if (arg1 == 0 && local18.anObjectArray31 != null) {
					local58 = new Class3_Sub41();
					local58.anObjectArray34 = local18.anObjectArray31;
					local58.aClass181_54 = local18;
					Static139.method2275(local58);
				}
				if (arg1 == 1 && local18.anObjectArray6 != null) {
					if (local18.anInt5688 >= 0) {
						@Pc(86) Class181 local86 = Static20.method415(local18.anInt5761);
						if (local86 == null || local86.aClass181Array2 == null || local18.anInt5688 >= local86.aClass181Array2.length || local86.aClass181Array2[local18.anInt5688] != local18) {
							continue;
						}
					}
					local58 = new Class3_Sub41();
					local58.anObjectArray34 = local18.anObjectArray6;
					local58.aClass181_54 = local18;
					Static139.method2275(local58);
				}
			}
		}
	}
}
