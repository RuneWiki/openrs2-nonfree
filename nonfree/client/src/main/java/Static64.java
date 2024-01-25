import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	public static int anInt995;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
	public static int anInt996;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!et;I)I")
	public static int method872(@OriginalArg(0) Class11_Sub1_Sub3_Sub1 arg0) {
		@Pc(8) Class272 local8 = arg0.aClass272_1;
		if (local8.anIntArray543 != null) {
			local8 = local8.method5900(Static32.aClass4_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt7335;
		@Pc(27) Class164 local27 = arg0.method2640();
		if (arg0.aBoolean322) {
			local23 = local8.anInt7332;
		} else if (local27.anInt4636 == arg0.anInt3317 || arg0.anInt3317 == local27.anInt4598 || local27.anInt4599 == arg0.anInt3317 || local27.anInt4609 == arg0.anInt3317) {
			local23 = local8.anInt7327;
		} else if (local27.anInt4611 == arg0.anInt3317 || arg0.anInt3317 == local27.anInt4595 || arg0.anInt3317 == local27.anInt4620 || arg0.anInt3317 == local27.anInt4610) {
			local23 = local8.anInt7328;
		}
		return local23;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method873(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static445.anInt7015 > 0) {
			local16 = Static358.aByteArrayArray130[--Static445.anInt7015];
			Static358.aByteArrayArray130[Static445.anInt7015] = null;
			return local16;
		} else if (arg0 == 5000 && Static347.anInt5590 > 0) {
			local16 = Static424.aByteArrayArray137[--Static347.anInt5590];
			Static424.aByteArrayArray137[Static347.anInt5590] = null;
			return local16;
		} else if (arg0 == 30000 && Static44.anInt640 > 0) {
			local16 = Static459.aByteArrayArray149[--Static44.anInt640];
			Static459.aByteArrayArray149[Static44.anInt640] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}
}
