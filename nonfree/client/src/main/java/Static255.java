import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
	public static int anInt5461;

	@OriginalMember(owner = "client!jca", name = "k", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "Lclient!oaa;")
	public static final Class234 aClass234_13 = new Class234(12, 0, 1, 0);

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "Z")
	public static boolean aBoolean413 = false;

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_52 = new Class94(44, 3);

	@OriginalMember(owner = "client!jca", name = "m", descriptor = "[I")
	public static int[] anIntArray292 = new int[4];

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_53 = new Class94(48, 11);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLclient!cea;)Lclient!iia;")
	public static Class154 method4692(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(7) Class154 local7 = new Class154();
		local7.anInt5253 = arg0.method8326();
		local7.aClass2_Sub6_Sub19_1 = Static296.aClass13_1.method226(local7.anInt5253);
		return local7;
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)V")
	public static void method4693() {
		for (@Pc(3) int local3 = 0; local3 < Static476.aByteArrayArrayArray5.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static476.aByteArrayArrayArray5[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static476.aByteArrayArrayArray5[0][0].length; local11++) {
					Static476.aByteArrayArrayArray5[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)V")
	public static void method4695() {
		if (Static217.aClass167Array2 == null) {
			Static217.aClass167Array2 = Static265.method4894();
			Static137.aClass167_2 = Static217.aClass167Array2[0];
			Static601.aLong262 = Static277.method5091();
		}
		if (Static251.aClass8_1 == null) {
			Static289.method5237();
		}
		@Pc(23) Class167 local23 = Static137.aClass167_2;
		@Pc(26) int local26 = Static422.method6797();
		if (local23 == Static137.aClass167_2) {
			Static364.aString78 = Static137.aClass167_2.aClass351_1.method8691(Static476.anInt8915);
			if (Static137.aClass167_2.aBoolean438) {
				Static553.anInt9914 = local26 * (Static137.aClass167_2.anInt5651 - Static137.aClass167_2.anInt5653) / 100 + Static137.aClass167_2.anInt5653;
			}
			if (Static137.aClass167_2.aBoolean437) {
				Static364.aString78 = Static364.aString78 + Static553.anInt9914 + "%";
			}
		} else if (Static137.aClass167_2 == Static265.aClass167_23) {
			Static251.aClass8_1 = null;
			Static66.method8375(3);
		} else {
			Static364.aString78 = local23.aClass351_2.method8691(Static476.anInt8915);
			if (Static137.aClass167_2.aBoolean437) {
				Static364.aString78 = Static364.aString78 + local23.anInt5651 + "%";
			}
			Static553.anInt9914 = local23.anInt5651;
			if (Static137.aClass167_2.aBoolean438 || local23.aBoolean438) {
				Static601.aLong262 = Static277.method5091();
			}
		}
		if (Static251.aClass8_1 == null) {
			return;
		}
		Static251.aClass8_1.method169(Static137.aClass167_2, Static364.aString78, Static553.anInt9914, Static601.aLong262);
		if (Static449.anInterface5Array1 == null) {
			return;
		}
		for (@Pc(130) int local130 = Static179.anInt4295 + 1; local130 < Static449.anInterface5Array1.length; local130++) {
			if (Static449.anInterface5Array1[local130].method9014() >= 100 && Static179.anInt4295 == local130 - 1 && Static529.anInt9623 >= 1 && Static251.aClass8_1.method175()) {
				try {
					Static449.anInterface5Array1[local130].method9011();
				} catch (@Pc(162) Exception local162) {
					Static449.anInterface5Array1 = null;
					return;
				}
				Static251.aClass8_1.method174(Static449.anInterface5Array1[local130]);
				Static179.anInt4295++;
				if (Static179.anInt4295 >= Static449.anInterface5Array1.length - 1 && Static449.anInterface5Array1.length > 1) {
					Static179.anInt4295 = Static310.aClass214_1.method6059() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)I")
	public static int method4696(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
