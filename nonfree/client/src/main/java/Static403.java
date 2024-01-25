import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
	public static int anInt6659;

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_53 = new Class220(4);

	@OriginalMember(owner = "client!ui", name = "J", descriptor = "[I")
	public static final int[] anIntArray578 = new int[256];

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)Lclient!km;")
	public static Class48_Sub6 method5489(@OriginalArg(0) int arg0) {
		@Pc(7) Class128[] local7 = Class3_Sub2_Sub1.aClass128Array1;
		synchronized (Class3_Sub2_Sub1.aClass128Array1) {
			@Pc(35) Class48_Sub6 local35;
			if (Class3_Sub2_Sub1.aClass128Array1.length <= arg0 || Class3_Sub2_Sub1.aClass128Array1[arg0].method2836()) {
				local35 = new Class48_Sub6();
				local35.aClass48_Sub7Array1 = new Class48_Sub7[arg0];
				for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
					local35.aClass48_Sub7Array1[local41] = new Class48_Sub7();
				}
			} else {
				local35 = (Class48_Sub6) Class3_Sub2_Sub1.aClass128Array1[arg0].method2837();
				local35.method5436();
				@Pc(74) int local74 = Static384.anIntArray555[arg0]--;
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)I")
	public static int method5490(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII)V")
	public static void method5491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static325.method4617(arg3);
		@Pc(14) int local14 = 0;
		@Pc(19) int local19 = arg3 - arg1;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(25) int local25 = arg3;
		@Pc(28) int local28 = -arg3;
		@Pc(30) int local30 = local19;
		@Pc(33) int local33 = -local19;
		@Pc(35) int local35 = -1;
		@Pc(57) int local57;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(82) int local82;
		if (Static97.anInt1796 <= arg2 && Static85.anInt1636 >= arg2) {
			@Pc(49) int[] local49 = Static347.anIntArrayArray54[arg2];
			local57 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg5 - arg3);
			local65 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg3 + arg5);
			local74 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg5 - local19);
			local82 = Static53.method977(Static99.anInt1808, Static81.anInt1574, local19 + arg5);
			Static73.method1404(local49, local74, arg0, local57);
			Static73.method1404(local49, local82, arg4, local74);
			Static73.method1404(local49, local65, arg0, local82);
		}
		@Pc(102) int local102 = -1;
		while (local14 < local25) {
			local102 += 2;
			local35 += 2;
			local33 += local102;
			local28 += local35;
			if (local33 >= 0 && local30 >= 1) {
				local30--;
				Static242.anIntArray370[local30] = local14;
				local33 -= local30 << 1;
			}
			local14++;
			@Pc(203) int local203;
			@Pc(212) int local212;
			@Pc(219) int[] local219;
			@Pc(153) int local153;
			if (local28 >= 0) {
				local25--;
				local28 -= local25 << 1;
				local153 = arg2 - local25;
				local57 = arg2 + local25;
				if (Static97.anInt1796 <= local57 && Static85.anInt1636 >= local153) {
					if (local25 < local19) {
						local65 = Static242.anIntArray370[local25];
						local74 = Static53.method977(Static99.anInt1808, Static81.anInt1574, local14 + arg5);
						local82 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg5 - local14);
						local203 = Static53.method977(Static99.anInt1808, Static81.anInt1574, local65 + arg5);
						local212 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg5 - local65);
						if (Static85.anInt1636 >= local57) {
							local219 = Static347.anIntArrayArray54[local57];
							Static73.method1404(local219, local212, arg0, local82);
							Static73.method1404(local219, local203, arg4, local212);
							Static73.method1404(local219, local74, arg0, local203);
						}
						if (Static97.anInt1796 <= local153) {
							local219 = Static347.anIntArrayArray54[local153];
							Static73.method1404(local219, local212, arg0, local82);
							Static73.method1404(local219, local203, arg4, local212);
							Static73.method1404(local219, local74, arg0, local203);
						}
					} else {
						local65 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg5 + local14);
						local74 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg5 - local14);
						if (local57 <= Static85.anInt1636) {
							Static73.method1404(Static347.anIntArrayArray54[local57], local65, arg0, local74);
						}
						if (local153 >= Static97.anInt1796) {
							Static73.method1404(Static347.anIntArrayArray54[local153], local65, arg0, local74);
						}
					}
				}
			}
			local153 = arg2 - local14;
			local57 = local14 + arg2;
			if (local57 >= Static97.anInt1796 && Static85.anInt1636 >= local153) {
				local65 = local25 + arg5;
				local74 = arg5 - local25;
				if (local65 >= Static81.anInt1574 && Static99.anInt1808 >= local74) {
					local65 = Static53.method977(Static99.anInt1808, Static81.anInt1574, local65);
					local74 = Static53.method977(Static99.anInt1808, Static81.anInt1574, local74);
					if (local19 > local14) {
						local82 = local30 < local14 ? Static242.anIntArray370[local14] : local30;
						local203 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg5 + local82);
						local212 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg5 - local82);
						if (Static85.anInt1636 >= local57) {
							local219 = Static347.anIntArrayArray54[local57];
							Static73.method1404(local219, local212, arg0, local74);
							Static73.method1404(local219, local203, arg4, local212);
							Static73.method1404(local219, local65, arg0, local203);
						}
						if (local153 >= Static97.anInt1796) {
							local219 = Static347.anIntArrayArray54[local153];
							Static73.method1404(local219, local212, arg0, local74);
							Static73.method1404(local219, local203, arg4, local212);
							Static73.method1404(local219, local65, arg0, local203);
						}
					} else {
						if (Static85.anInt1636 >= local57) {
							Static73.method1404(Static347.anIntArrayArray54[local57], local65, arg0, local74);
						}
						if (Static97.anInt1796 <= local153) {
							Static73.method1404(Static347.anIntArrayArray54[local153], local65, arg0, local74);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V")
	public static void method5492() {
		Static156.aClass146_3.method3339();
		Static412.aClass169_5.method3856();
		Static167.aClass223_1.method5041();
		Static113.aClass127_2.method2823();
		Static336.aClass59_2.method1471();
		Static354.aClass170_2.method3862();
		Static244.aClass174_2.method4012();
		Static93.aClass70_1.method1597();
		Static427.aClass58_1.method1459();
		Static91.aClass43_1.method971();
		Static255.aClass222_1.method5011();
		Static405.aClass190_4.method4317();
		Static171.aClass254_3.method5835();
		Static320.aClass116_1.method2662();
		Static414.aClass258_2.method5883();
		Static187.aClass217_1.method4854();
		Static251.aClass147_1.method3373();
		Static221.aClass72_1.method1668();
		Static187.aClass145_1.method3330();
		Static333.aClass50_3.method1390();
		Static279.method4219();
		Static328.method4697();
		Static402.method5469();
		if (Static194.aClass207_8 != Static449.aClass207_11) {
			for (@Pc(76) int local76 = 0; local76 < Static247.aByteArrayArray25.length; local76++) {
				Static247.aByteArrayArray25[local76] = null;
			}
			Static9.anInt163 = 0;
		}
		Static407.method5568();
		Static174.method2753();
		Static91.method1568();
		Static449.method5972();
		Static41.method818();
		Static308.aClass220_46.method4999();
		Static44.aClass28_14.method3533();
		Static53.aClass149_1.method3401();
		Static171.method1544();
		Static100.aClass158_8.method3689();
		Static367.aClass158_90.method3689();
		Static435.aClass158_94.method3689();
		Static429.aClass158_93.method3689();
		Static144.aClass158_30.method3689();
		Static118.aClass158_26.method3689();
		Static280.aClass158_63.method3689();
		Static223.aClass158_51.method3689();
		Static76.aClass158_17.method3689();
		Static63.aClass158_15.method3689();
		Static207.aClass158_44.method3689();
		Static305.aClass158_67.method3689();
		Static313.aClass158_69.method3689();
		Static241.aClass158_55.method3689();
		Static340.aClass158_71.method3689();
		Static123.aClass158_27.method3689();
		Static312.aClass158_68.method3689();
		Static250.aClass158_58.method3689();
		Static129.aClass158_29.method3689();
		Static85.aClass158_22.method3689();
		Static197.aClass158_42.method3689();
		Static20.aClass158_6.method3689();
		Static337.aClass158_70.method3689();
		Static422.aClass158_88.method3689();
		Static363.aClass158_81.method3689();
		Static382.aClass158_82.method3689();
		Static52.aClass158_13.method3689();
		Static268.aClass158_62.method3689();
		Static360.aClass158_77.method3689();
		Static315.aClass158_56.method3689();
		aClass220_53.method4999();
		Static117.aClass220_14.method4999();
		Static282.aClass220_42.method4999();
		Static210.aClass220_26.method4999();
	}
}
