import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
	public static int anInt6516;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
	public static int anInt6518;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "Lclient!di;")
	public static final Class54 aClass54_94 = new Class54(46, -1);

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)Z")
	public static boolean method5145(@OriginalArg(0) int arg0) {
		if (arg0 == 6 || arg0 == 45 || arg0 == 58 || arg0 == 48 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 10 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V")
	public static void method5146() {
		for (@Pc(10) Class2_Sub22 local10 = (Class2_Sub22) Static248.aClass14_35.method309(); local10 != null; local10 = (Class2_Sub22) Static248.aClass14_35.method311()) {
			if (Static328.method4559(local10.anInt3716)) {
				Static370.method5037(local10);
			}
		}
		if (Static373.anInt4900 == 1) {
			Static123.aBoolean212 = false;
			Static444.method5713(Static372.anInt2931, Static296.anInt5305, Static237.anInt4550, Static19.anInt5290);
			return;
		}
		Static444.method5713(Static372.anInt2931, Static296.anInt5305, Static237.anInt4550, Static19.anInt5290);
		@Pc(48) int local48 = Static172.aClass58_5.method1340(Static360.aClass209_156.method4562(Static388.anInt6533));
		for (@Pc(53) Class2_Sub22 local53 = (Class2_Sub22) Static248.aClass14_35.method309(); local53 != null; local53 = (Class2_Sub22) Static248.aClass14_35.method311()) {
			@Pc(59) int local59 = Static286.method4125(local53);
			if (local48 < local59) {
				local48 = local59;
			}
		}
		Static372.anInt2931 = Static373.anInt4900 * 16 + (Static82.aBoolean109 ? 26 : 22);
		Static296.anInt5305 = local48 + 8;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!dr;)[Lclient!jt;")
	public static Class137[] method5148(@OriginalArg(1) Class59 arg0) {
		if (!arg0.method1369()) {
			return new Class137[0];
		}
		@Pc(16) Class138 local16 = arg0.method1367();
		while (local16.anInt3723 == 0) {
			Static81.method1477(10L);
		}
		if (local16.anInt3723 == 2) {
			return new Class137[0];
		}
		@Pc(40) int[] local40 = (int[]) local16.anObject7;
		@Pc(46) Class137[] local46 = new Class137[local40.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
			@Pc(59) Class137 local59 = new Class137();
			local46[local48] = local59;
			local59.anInt3706 = local40[local48 << 2];
			local59.anInt3709 = local40[(local48 << 2) + 1];
			local59.anInt3707 = local40[(local48 << 2) + 2];
			local59.anInt3705 = local40[(local48 << 2) + 3];
		}
		return local46;
	}
}
