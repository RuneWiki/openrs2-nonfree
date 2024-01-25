import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!dn;")
	public static Class56 aClass56_87;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_56 = new Class5(4);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method5621() {
		if (Static342.aFrame2 != null) {
			return;
		}
		@Pc(17) Container local17;
		if (Static225.aFrame1 == null) {
			local17 = Static295.aClass103_5.anApplet1;
		} else {
			local17 = Static225.aFrame1;
		}
		Static196.anInt3872 = local17.getSize().width;
		Static251.anInt4721 = local17.getSize().height;
		@Pc(36) Insets local36;
		if (Static225.aFrame1 == local17) {
			local36 = Static225.aFrame1.getInsets();
			Static251.anInt4721 -= local36.bottom + local36.top;
			Static196.anInt3872 -= local36.right + local36.left;
		}
		if (Static38.method898() == 1) {
			Static405.anInt7048 = (Static196.anInt3872 - Static124.anInt2689) / 2;
			Static385.anInt6686 = Static124.anInt2689;
			Static370.anInt6575 = 0;
			Static120.anInt2616 = Static245.anInt4639;
		} else if (Static102.anInt619 < 96 && Static347.anInt6318 == 0) {
			@Pc(95) int local95 = Static196.anInt3872 > 1024 ? 1024 : Static196.anInt3872;
			Static405.anInt7048 = (Static196.anInt3872 - local95) / 2;
			@Pc(108) int local108 = Static251.anInt4721 <= 768 ? Static251.anInt4721 : 768;
			Static385.anInt6686 = local95;
			Static370.anInt6575 = 0;
			Static120.anInt2616 = local108;
		} else {
			Static120.anInt2616 = Static251.anInt4721;
			Static370.anInt6575 = 0;
			Static385.anInt6686 = Static196.anInt3872;
			Static405.anInt7048 = 0;
		}
		if (Static356.aClass238_6 != Static411.aClass238_7) {
			@Pc(126) boolean local126;
			if (Static385.anInt6686 < 1024 && Static120.anInt2616 < 768) {
				local126 = true;
			} else {
				local126 = false;
			}
		}
		Static351.aCanvas6.setSize(Static385.anInt6686, Static120.anInt2616);
		if (Static266.aClass75_7 != null) {
			Static266.aClass75_7.method2591(Static351.aCanvas6);
		}
		if (local17 == Static225.aFrame1) {
			local36 = Static225.aFrame1.getInsets();
			Static351.aCanvas6.setLocation(Static405.anInt7048 + local36.left, Static370.anInt6575 + local36.top);
		} else {
			Static351.aCanvas6.setLocation(Static405.anInt7048, Static370.anInt6575);
		}
		if (Static337.anInt6221 != -1) {
			Static300.method4442(true);
		}
		Static5.method103();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!hs;)[Lclient!hk;")
	public static Class98[] method5622(@OriginalArg(1) Class103 arg0) {
		if (!arg0.method2843()) {
			return new Class98[0];
		}
		@Pc(14) Class190 local14 = arg0.method2830();
		while (local14.anInt5799 == 0) {
			Static135.method2458(10L);
		}
		if (local14.anInt5799 == 2) {
			return new Class98[0];
		}
		@Pc(35) int[] local35 = (int[]) local14.anObject7;
		@Pc(46) Class98[] local46 = new Class98[local35.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
			@Pc(53) Class98 local53 = new Class98();
			local46[local48] = local53;
			local53.anInt3341 = local35[local48 << 2];
			local53.anInt3339 = local35[(local48 << 2) + 1];
			local53.anInt3338 = local35[(local48 << 2) + 2];
			local53.anInt3340 = local35[(local48 << 2) + 3];
		}
		return local46;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public static void method5623(@OriginalArg(0) int arg0) {
		Static205.anInt4114 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static177.anInt3621; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static57.anInt1411; local6++) {
				if (Static151.aClass217ArrayArrayArray3[arg0][local3][local6] == null) {
					Static151.aClass217ArrayArrayArray3[arg0][local3][local6] = new Class217(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BC)C")
	public static char method5624(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!hs;I)I")
	public static int method5625(@OriginalArg(1) Class103 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V")
	public static void method5628(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1011) {
			Static272.method4049(Static247.aClass180_5, arg0, arg1);
		} else if (arg2 == 1006) {
			Static272.method4049(Static225.aClass180_4, arg0, arg1);
		} else if (arg2 == 1010) {
			Static272.method4049(Static360.aClass180_9, arg0, arg1);
		} else if (arg2 == 1003) {
			Static272.method4049(Static27.aClass180_2, arg0, arg1);
		} else if (arg2 == 1002) {
			Static272.method4049(Static364.aClass180_10, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method5629(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub3_Sub7 local16 = Static139.method2522(10, arg0);
		local16.method1563();
	}
}
