import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	public static int anInt5458;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	public static int anInt5467;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Lclient!gb;")
	public static Class58_Sub1 method4327() {
		return Static140.anInt3093 >= Static200.aClass58_Sub1Array1.length ? null : Static200.aClass58_Sub1Array1[Static140.anInt3093++];
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "([BI)V")
	public static void method4329(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub16 local10 = new Class2_Sub16(arg0);
		local10.anInt2789 = arg0.length - 2;
		Static236.anInt4770 = local10.method2130();
		Static299.aByteArrayArray18 = new byte[Static236.anInt4770][];
		Static165.aByteArrayArray9 = new byte[Static236.anInt4770][];
		Static275.anIntArray522 = new int[Static236.anInt4770];
		Static299.anIntArray561 = new int[Static236.anInt4770];
		Static68.aBooleanArray4 = new boolean[Static236.anInt4770];
		Static187.anIntArray397 = new int[Static236.anInt4770];
		Static311.anIntArray591 = new int[Static236.anInt4770];
		local10.anInt2789 = arg0.length - Static236.anInt4770 * 8 - 7;
		Static222.anInt4526 = local10.method2130();
		Static2.anInt59 = local10.method2130();
		@Pc(69) int local69 = (local10.method2146() & 0xFF) + 1;
		@Pc(71) int local71;
		for (local71 = 0; local71 < Static236.anInt4770; local71++) {
			Static311.anIntArray591[local71] = local10.method2130();
		}
		for (local71 = 0; local71 < Static236.anInt4770; local71++) {
			Static275.anIntArray522[local71] = local10.method2130();
		}
		for (local71 = 0; local71 < Static236.anInt4770; local71++) {
			Static299.anIntArray561[local71] = local10.method2130();
		}
		for (local71 = 0; local71 < Static236.anInt4770; local71++) {
			Static187.anIntArray397[local71] = local10.method2130();
		}
		local10.anInt2789 = arg0.length + 3 - local69 * 3 - Static236.anInt4770 * 8 - 7;
		Static199.anIntArray438 = new int[local69];
		for (local71 = 1; local71 < local69; local71++) {
			Static199.anIntArray438[local71] = local10.method2166();
			if (Static199.anIntArray438[local71] == 0) {
				Static199.anIntArray438[local71] = 1;
			}
		}
		local10.anInt2789 = 0;
		for (local71 = 0; local71 < Static236.anInt4770; local71++) {
			@Pc(197) int local197 = Static299.anIntArray561[local71];
			@Pc(199) boolean local199 = false;
			@Pc(203) int local203 = Static187.anIntArray397[local71];
			@Pc(207) int local207 = local197 * local203;
			@Pc(210) byte[] local210 = new byte[local207];
			@Pc(213) byte[] local213 = new byte[local207];
			Static165.aByteArrayArray9[local71] = local213;
			Static299.aByteArrayArray18[local71] = local210;
			@Pc(225) int local225 = local10.method2146();
			@Pc(231) int local231;
			if ((local225 & 0x1) == 0) {
				for (local231 = 0; local231 < local207; local231++) {
					local213[local231] = local10.method2170();
				}
				if ((local225 & 0x2) != 0) {
					for (local231 = 0; local231 < local207; local231++) {
						@Pc(268) byte local268 = local210[local231] = local10.method2170();
						local199 |= local268 != -1;
					}
				}
			} else {
				local231 = 0;
				label98: while (true) {
					@Pc(294) int local294;
					if (local197 <= local231) {
						if ((local225 & 0x2) == 0) {
							break;
						}
						local231 = 0;
						while (true) {
							if (local197 <= local231) {
								break label98;
							}
							for (local294 = 0; local294 < local203; local294++) {
								@Pc(342) byte local342 = local210[local231 + local294 * local197] = local10.method2170();
								local199 |= local342 != -1;
							}
							local231++;
						}
					}
					for (local294 = 0; local294 < local203; local294++) {
						local213[local294 * local197 + local231] = local10.method2170();
					}
					local231++;
				}
			}
			Static68.aBooleanArray4[local71] = local199;
		}
	}
}
