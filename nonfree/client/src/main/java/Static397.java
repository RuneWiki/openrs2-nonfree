import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
	public static int anInt7048;

	@OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
	public static int anInt7052;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_144 = new Class359(20, -1);

	@OriginalMember(owner = "client!ni", name = "E", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_145 = new Class359(5, 2);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILclient!wu;)Lclient!fba;")
	public static Class5_Sub3_Sub3 method5838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class394 arg2) {
		@Pc(10) int local10 = arg2.anInt10866 | arg0 << 10;
		@Pc(19) Class5_Sub3_Sub3 local19 = (Class5_Sub3_Sub3) Static69.aClass97_5.method2405((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static98.aClass390_19.method8923(Static98.aClass390_19.method8911(local10));
		if (local31 == null) {
			local10 = arg1 + 65536 << 10 | arg2.anInt10866;
			local19 = (Class5_Sub3_Sub3) Static69.aClass97_5.method2405((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static98.aClass390_19.method8923(Static98.aClass390_19.method8911(local10));
			if (local31 == null) {
				local10 = arg2.anInt10866 | 0x3FFFC00;
				local19 = (Class5_Sub3_Sub3) Static69.aClass97_5.method2405((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static98.aClass390_19.method8923(Static98.aClass390_19.method8911(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static89.method1862(local31);
					} catch (@Pc(192) Exception local192) {
						throw new RuntimeException(local192.getMessage() + " S: " + local10);
					}
					local19.aClass394_43 = arg2;
					Static69.aClass97_5.method2400(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static89.method1862(local31);
				} catch (@Pc(124) Exception local124) {
					throw new RuntimeException(local124.getMessage() + " S: " + local10);
				}
				local19.aClass394_43 = arg2;
				Static69.aClass97_5.method2400(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static89.method1862(local31);
			} catch (@Pc(45) Exception local45) {
				throw new RuntimeException(local45.getMessage() + " S: " + local10);
			}
			local19.aClass394_43 = arg2;
			Static69.aClass97_5.method2400(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)V")
	public static void method5840(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(9, (long) arg0);
		local9.method7288();
	}
}
