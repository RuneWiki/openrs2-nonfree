import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!iha", name = "t", descriptor = "Lclient!us;")
	public static final Class344 aClass344_59 = new Class344(69, 2);

	@OriginalMember(owner = "client!iha", name = "x", descriptor = "I")
	public static int anInt5310 = 0;

	@OriginalMember(owner = "client!iha", name = "B", descriptor = "I")
	public static int anInt5314 = 0;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)V")
	public static void method4498() {
		for (@Pc(15) Class3_Sub24 local15 = (Class3_Sub24) Static493.aClass307_47.method7421(); local15 != null; local15 = (Class3_Sub24) Static493.aClass307_47.method7428()) {
			if (local15.aClass187_Sub1_1.method5765()) {
				Static3.method8622(local15.anInt4636);
			} else {
				local15.aClass187_Sub1_1.method5780();
				try {
					local15.aClass187_Sub1_1.method5769();
				} catch (@Pc(42) Exception local42) {
					Static544.method7724("TV: " + local15.anInt4636, local42);
					Static3.method8622(local15.anInt4636);
				}
				if (!local15.aBoolean395 && !local15.aBoolean396) {
					@Pc(68) Class3_Sub10_Sub4 local68 = local15.aClass187_Sub1_1.method5778();
					if (local68 != null) {
						@Pc(74) Class3_Sub7_Sub2 local74 = local68.method6839();
						if (local74 != null) {
							local74.method1332(local15.anInt4635);
							Static581.aClass3_Sub7_Sub3_2.method2209(local74);
							local15.aBoolean395 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIIBILclient!nga;)Ljava/awt/Frame;")
	public static Frame method4499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class228 arg3) {
		if (!arg3.method5937()) {
			return null;
		}
		@Pc(17) Class288[] local17 = Static444.method6717(arg3);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt8634 == arg0 && local17[local25].anInt8630 == arg2 && (!local23 || arg1 < local17[local25].anInt8633)) {
				local23 = true;
				arg1 = local17[local25].anInt8633;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(87) Class376 local87 = arg3.method5947(arg2, arg0, arg1);
		while (local87.anInt10510 == 0) {
			Static500.method7308(10L);
		}
		@Pc(104) Frame local104 = (Frame) local87.anObject19;
		if (local104 == null) {
			return null;
		} else if (local87.anInt10510 == 2) {
			Static624.method8487(arg3, local104);
			return null;
		} else {
			return local104;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)V")
	public static void method4501(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub1_Sub6 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class274 local8 = Static445.aClass274Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static158.anInt3845; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static642.anInt10523; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static276.anInt5846;
							@Pc(32) int local32 = local12 << Static276.anInt5846;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class274 local41 = Static445.aClass274Array1[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8041(local15, local12) - local41.method8041(local15, local12);
									@Pc(71) int local71 = local8.method8041(local15 + 1, local12) - local41.method8041(local15 + 1, local12);
									@Pc(91) int local91 = local8.method8041(local15 + 1, local12 + 1) - local41.method8041(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method8041(local15, local12 + 1) - local41.method8041(local15, local12 + 1);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZ)V")
	public static void method4503(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static361.aClass3_Sub1_Sub16_2 != null) {
			Static625.anInt10331 = Static361.aClass3_Sub1_Sub16_2.anInt7071;
		} else {
			Static625.anInt10331 = -1;
		}
		Static505.aClass108_10 = null;
		Static529.aClass276_54 = null;
		Static102.anInt9953 = 0;
		Static361.aClass3_Sub1_Sub16_2 = null;
		Static361.method2175();
		Static361.aClass276_14.method6910();
		Static196.aClass5_25 = null;
		Static361.aClass57_2 = null;
		Static483.aClass29_8 = null;
		Static168.aClass29_2 = null;
		Static188.aClass29_4 = null;
		Static274.aClass29_6 = null;
		Static171.aClass29_3 = null;
		Static395.aClass29_7 = null;
		Static219.aClass29_5 = null;
		Static118.anInt3044 = -1;
		Static642.anInt10524 = -1;
		Static130.aClass29_1 = null;
		if (Static361.aClass115_3 != null) {
			Static361.aClass115_3.method3757();
			Static361.aClass115_3.method3755(128, 64);
		}
		if (Static361.aClass204_2 != null) {
			Static361.aClass204_2.method5446(64, 64);
		}
		if (Static361.aClass349_2 != null) {
			Static361.aClass349_2.method8118(64);
		}
		Static390.aClass359_1.method8265(64);
	}
}
