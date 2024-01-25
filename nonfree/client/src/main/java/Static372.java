import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!si", name = "H", descriptor = "Lclient!sc;")
	public static Class223 aClass223_7;

	@OriginalMember(owner = "client!si", name = "E", descriptor = "Lclient!of;")
	public static final Class188 aClass188_49 = new Class188(64);

	@OriginalMember(owner = "client!si", name = "J", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_18 = new Class163(3, 5);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!wh;ILclient!wh;)V")
	public static void method5181(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_267 != null) {
			arg1.method6260();
		}
		arg1.aClass2_268 = arg0;
		arg1.aClass2_267 = arg0.aClass2_267;
		arg1.aClass2_267.aClass2_268 = arg1;
		arg1.aClass2_268.aClass2_267 = arg1;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
	public static void method5183() {
		if (Static50.aFrame1 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static393.aFrame2 == null) {
			local13 = Static138.aClass194_2.anApplet1;
		} else {
			local13 = Static393.aFrame2;
		}
		Static119.anInt2042 = local13.getSize().width;
		Static268.anInt4657 = local13.getSize().height;
		@Pc(31) Insets local31;
		if (Static393.aFrame2 == local13) {
			local31 = Static393.aFrame2.getInsets();
			Static119.anInt2042 -= local31.right + local31.left;
			Static268.anInt4657 -= local31.top + local31.bottom;
		}
		if (Static235.method3217() == 1) {
			Static124.anInt2074 = (Static119.anInt2042 - Static132.anInt2509) / 2;
			Static344.anInt6105 = Static163.anInt2922;
			Static226.anInt3803 = 0;
			Static49.anInt789 = Static132.anInt2509;
		} else if (Static170.anInt3068 < 96 && Static404.anInt2752 == 0) {
			@Pc(78) int local78 = Static119.anInt2042 <= 1024 ? Static119.anInt2042 : 1024;
			Static124.anInt2074 = (Static119.anInt2042 - local78) / 2;
			Static49.anInt789 = local78;
			@Pc(94) int local94 = Static268.anInt4657 <= 768 ? Static268.anInt4657 : 768;
			Static344.anInt6105 = local94;
			Static226.anInt3803 = 0;
		} else {
			Static124.anInt2074 = 0;
			Static226.anInt3803 = 0;
			Static49.anInt789 = Static119.anInt2042;
			Static344.anInt6105 = Static268.anInt4657;
		}
		if (Static429.aClass129_8 != Static112.aClass129_4) {
			@Pc(125) boolean local125;
			if (Static49.anInt789 < 1024 && Static344.anInt6105 < 768) {
				local125 = true;
			} else {
				local125 = false;
			}
		}
		Static291.aCanvas6.setSize(Static49.anInt789, Static344.anInt6105);
		if (Static257.aClass75_8 != null) {
			Static257.aClass75_8.method6012(Static291.aCanvas6);
		}
		if (local13 == Static393.aFrame2) {
			local31 = Static393.aFrame2.getInsets();
			Static291.aCanvas6.setLocation(Static124.anInt2074 + local31.left, Static226.anInt3803 + local31.top);
		} else {
			Static291.aCanvas6.setLocation(Static124.anInt2074, Static226.anInt3803);
		}
		if (Static103.anInt5365 != -1) {
			Static92.method1399(true);
		}
		Static298.method4275();
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)Z")
	public static boolean method5184(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class2_Sub35 local15 = (Class2_Sub35) Static93.aClass181_7.method3972(); local15 != null; local15 = (Class2_Sub35) Static93.aClass181_7.method3975()) {
			if (Static188.method5359(local15.anInt5875) && local15.aLong299 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
