import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
	public static int anInt3322;

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
	public static int anInt3326;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_33 = new Class286(18, 8);

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "Lclient!wv;")
	public static final Class409 aClass409_4 = new Class409(9, 2);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIBI)V")
	public static void method2869(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		if (Static175.anInt10579 == 2) {
			Static228.anInt9136 = local11;
			Static703.anInt10997 = local7;
			Static212.anInt3807 = 0;
		}
		Static27.aFloat4 = (float) local11;
		Static658.aFloat196 = (float) local7;
		Static212.method3251();
		Static71.aBoolean90 = true;
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(B)I")
	public static int method2870() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static310.aClass47_4.aBoolean97 && !Static310.aClass47_4.aBoolean98) {
			local7 = true;
			if (Static50.aClass3_Sub25_1.anInt4197 < 512 && Static50.aClass3_Sub25_1.anInt4197 != 0) {
				local7 = false;
			}
			if (Static75.aString24.startsWith("win")) {
				local9 = true;
				local11 = true;
			} else {
				local9 = true;
			}
		}
		if (Static244.aBoolean399) {
			local11 = false;
		}
		if (Static576.aBoolean686) {
			local7 = false;
		}
		if (Static206.aBoolean816) {
			local9 = false;
		}
		if (!local7 && !local9 && !local11) {
			return Static664.method8857();
		}
		@Pc(76) int local76 = -1;
		@Pc(78) int local78 = -1;
		if (local7) {
			try {
				local76 = Static111.method1982(2, 1000);
			} catch (@Pc(87) Exception local87) {
			}
		}
		@Pc(90) int local90 = -1;
		if (local11) {
			try {
				local90 = Static111.method1982(3, 1000);
				if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 3) {
					@Pc(108) Class90 local108 = Static488.aClass67_12.method7687();
					@Pc(113) long local113 = local108.aLong101 & 0xFFFFFFFFFFFFL;
					@Pc(116) int local116 = local108.anInt2666;
					if (local116 == 4318) {
						local9 &= local113 >= 64425238954L;
					} else if (local116 == 4098) {
						local9 &= local113 >= 60129613779L;
					}
				}
			} catch (@Pc(158) Exception local158) {
			}
		}
		if (local9) {
			try {
				local78 = Static111.method1982(1, 1000);
			} catch (@Pc(168) Exception local168) {
			}
		}
		if (local76 == -1 && local78 == -1 && local90 == -1) {
			return Static664.method8857();
		}
		local90 = (int) ((float) local90 * 1.1F);
		local78 = (int) ((float) local78 * 1.1F);
		if (local90 < local76 && local76 > local78) {
			return Static34.method514(local76);
		} else if (local78 < local90) {
			return Static19.method319(local90, 3);
		} else {
			return Static19.method319(local78, 1);
		}
	}
}
