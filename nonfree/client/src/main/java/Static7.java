import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "v", descriptor = "I")
	public static int anInt203;

	@OriginalMember(owner = "client!af", name = "D", descriptor = "I")
	public static int anInt210;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
	public static void method148() {
		Static60.aClass198_16.method5243(5);
		Static4.aClass198_3.method5243(5);
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)V")
	public static void method149() {
		if (Static67.aFrame1 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static176.aFrame4 == null) {
			local12 = Static353.aClass42_5.anApplet1;
		} else {
			local12 = Static176.aFrame4;
		}
		Static56.anInt1236 = local12.getSize().width;
		Static165.anInt3205 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (Static176.aFrame4 == local12) {
			local31 = Static176.aFrame4.getInsets();
			Static56.anInt1236 -= local31.right + local31.left;
			Static165.anInt3205 -= local31.bottom + local31.top;
		}
		if (Static205.method34() == 1) {
			Static264.anInt5293 = 0;
			Static171.anInt3583 = 503;
			Static298.anInt5944 = 765;
			Static34.anInt781 = (Static56.anInt1236 - 765) / 2;
		} else if (Static26.anInt699 < 96 && Static352.anInt6827 == 0) {
			@Pc(92) int local92 = Static56.anInt1236 <= 1024 ? Static56.anInt1236 : 1024;
			Static34.anInt781 = (Static56.anInt1236 - local92) / 2;
			Static298.anInt5944 = local92;
			@Pc(108) int local108 = Static165.anInt3205 > 768 ? 768 : Static165.anInt3205;
			Static264.anInt5293 = 0;
			Static171.anInt3583 = local108;
		} else {
			Static34.anInt781 = 0;
			Static264.anInt5293 = 0;
			Static171.anInt3583 = Static165.anInt3205;
			Static298.anInt5944 = Static56.anInt1236;
		}
		if (Static113.anInt6411 != 0) {
			@Pc(128) boolean local128;
			if (Static298.anInt5944 < 1024 && Static171.anInt3583 < 768) {
				local128 = true;
			} else {
				local128 = false;
			}
		}
		Static295.aCanvas4.setSize(Static298.anInt5944, Static171.anInt3583);
		if (Static212.aClass122_2 != null) {
			Static212.aClass122_2.method4802();
		}
		if (local12 == Static176.aFrame4) {
			local31 = Static176.aFrame4.getInsets();
			Static295.aCanvas4.setLocation(local31.left + Static34.anInt781, Static264.anInt5293 + local31.top);
		} else {
			Static295.aCanvas4.setLocation(Static34.anInt781, Static264.anInt5293);
		}
		if (Static191.anInt3991 != -1) {
			Static30.method596(true);
		}
		Static306.method5130();
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)Lclient!we;")
	public static Class3_Sub43 method150(@OriginalArg(0) int arg0) {
		return (Class3_Sub43) Static24.aClass24_29.method609((long) arg0);
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(II)Lclient!il;")
	public static Class3_Sub7_Sub9 method151(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub7_Sub9 local15 = (Class3_Sub7_Sub9) Static316.aClass188_10.method5061((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(30) byte[] local30;
		if (arg0 >= 32768) {
			local30 = Static36.aClass100_13.method2319(1, arg0 & 0x7FFF);
		} else {
			local30 = Static261.aClass100_105.method2319(1, arg0);
		}
		local15 = new Class3_Sub7_Sub9();
		if (local30 != null) {
			local15.method2253(new Class3_Sub4(local30));
		}
		if (arg0 >= 32768) {
			local15.method2261();
		}
		Static316.aClass188_10.method5063(local15, (long) arg0);
		return local15;
	}
}
