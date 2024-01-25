import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!od", name = "I", descriptor = "Lclient!vn;")
	public static Class347 aClass347_9;

	@OriginalMember(owner = "client!od", name = "J", descriptor = "I")
	public static int anInt7145;

	@OriginalMember(owner = "client!od", name = "G", descriptor = "[S")
	public static short[] aShortArray90 = new short[256];

	@OriginalMember(owner = "client!od", name = "H", descriptor = "Lclient!el;")
	public static final Class95 aClass95_1 = new Class95();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII)I")
	public static int method5562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static405.anInt7854 == -1) {
			return 1;
		}
		if (Static453.anInt8614 != arg1) {
			Static142.method2500(Static223.aClass152_17.method3624(Static142.anInt3088), arg1);
			if (arg1 != Static453.anInt8614) {
				return -1;
			}
		}
		try {
			@Pc(36) Dimension local36 = Static201.aCanvas7.getSize();
			Static490.method7114(Static39.aClass7_2, true, Static478.aClass198_11, Static127.aClass45_1, Static223.aClass152_17.method3624(Static142.anInt3088));
			@Pc(52) Class59 local52 = Static485.method7071(Static383.aClass348_91, Static405.anInt7854);
			@Pc(55) long local55 = Static112.method2047();
			Static39.aClass7_2.JA();
			Static566.aClass81_6.NA(0, Static209.anInt4422, 0);
			Static39.aClass7_2.method7794(Static566.aClass81_6);
			Static39.aClass7_2.la(local36.width / 2, local36.height / 2, 512, 512);
			Static39.aClass7_2.ra(1.0F);
			Static39.aClass7_2.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(96) Class65 local96 = Static39.aClass7_2.method7828(local52, 2048, 64, 64, 768);
			@Pc(98) int local98 = 0;
			label41: for (@Pc(100) int local100 = 0; local100 < 500; local100++) {
				Static39.aClass7_2.ja(0);
				Static39.aClass7_2.ya();
				for (@Pc(109) int local109 = 15; local109 >= 0; local109--) {
					for (@Pc(113) int local113 = 0; local113 <= local109; local113++) {
						Static313.aClass81_5.NA((int) ((float) Static168.anInt3487 * ((float) local113 - (float) local109 / 2.0F)), 0, (local109 + 1) * Static168.anInt3487);
						local96.method7679(Static313.aClass81_5, null, 0);
						local98++;
						if ((long) arg0 <= Static112.method2047() - local55) {
							break label41;
						}
					}
				}
			}
			Static39.aClass7_2.method7849();
			@Pc(181) long local181 = (long) (local98 * 1000) / (Static112.method2047() - local55);
			Static39.aClass7_2.ja(0);
			Static39.aClass7_2.ya();
			return (int) local181;
		} catch (@Pc(190) Throwable local190) {
			local190.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!vo;Lclient!vo;I)V")
	public static void method5563(@OriginalArg(1) Class348 arg0, @OriginalArg(2) Class348 arg1) {
		Static426.aClass348_100 = arg0;
		Static424.aClass348_99 = arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Z")
	public static boolean method5564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static187.method3084(arg0, arg1) & ((arg0 & 0x2000) != 0 | Static571.method8035(arg0, arg1) | Static214.method3480(arg0, arg1));
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!r;IB)Lclient!ql;")
	public static Class279 method5565(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static459.anIntArray457 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static459.anIntArray457.length; local15++) {
				if (arg2 == Static459.anIntArray457[local15]) {
					return Static144.aClass279Array1[local15];
				}
			}
		}
		@Pc(42) Class279 local42 = (Class279) Static158.aClass167_9.method3966((long) arg2);
		if (local42 != null) {
			if (arg0 && local42.aClass198_10 == null) {
				@Pc(54) Class198 local54 = Static165.method2735(Static386.aClass348_93, arg2);
				if (local54 == null) {
					return null;
				}
				local42.aClass198_10 = local54;
			}
			return local42;
		}
		@Pc(67) Class103[] local67 = Static598.method2450(Static1.aClass348_53, arg2);
		if (local67 == null) {
			return null;
		}
		@Pc(81) Class198 local81 = Static165.method2735(Static386.aClass348_93, arg2);
		if (local81 == null) {
			return null;
		}
		if (arg0) {
			local42 = new Class279(arg1.method7837(local81, local67), local81);
		} else {
			local42 = new Class279(arg1.method7837(local81, local67));
		}
		Static158.aClass167_9.method3974((long) arg2, local42);
		return local42;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Canvas;BLclient!fa;)Lclient!r;")
	public static Class7 method5566(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface7 arg1) {
		return new Class7_Sub3(arg0, arg1);
	}
}
