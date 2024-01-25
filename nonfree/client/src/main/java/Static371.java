import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!oda", name = "s", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_94 = new Class173(55, 7);

	@OriginalMember(owner = "client!oda", name = "v", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!oda", name = "A", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_155 = new Class362(16, 4);

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!un;I)Lclient!vaa;")
	public static Class108_Sub3 method5956(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(7) Class108 local7 = Static555.method8026(arg0);
		@Pc(11) int local11 = arg0.method4931();
		@Pc(15) int local15 = arg0.method4931();
		return new Class108_Sub3(local7.aClass258_13, local7.aClass250_13, local7.anInt10009, local7.anInt10011, local7.anInt10015, local7.anInt10007, local7.anInt10008, local7.anInt10013, local7.anInt10014, local11, local15);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!r;II)V")
	public static void method5957(@OriginalArg(0) Class44 arg0, @OriginalArg(2) int arg1) {
		if (!Static368.aBoolean505) {
			Static518.anInt9302 = 0;
			return;
		}
		if (Static269.aBoolean385) {
			Static35.aLong24 = Static141.aClass65_1.method5484();
		}
		Static110.anInt2623 = 0;
		Static561.anInt5883 = 0;
		Static105.anInt2400 = 0;
		@Pc(31) int[] local31 = arg0.v();
		Static375.anInt7258 = (int) ((float) local31[2] / 3.0F);
		Static445.anInt8291 = (int) ((float) local31[3] / 3.0F);
		arg0.method5011(Static454.anIntArray455);
		if ((int) ((float) Static454.anIntArray455[0] / 3.0F) != Static47.anInt645 || (int) ((float) Static454.anIntArray455[1] / 3.0F) != Static582.anInt10109) {
			Static47.anInt645 = (int) ((float) Static454.anIntArray455[0] / 3.0F);
			Static582.anInt10109 = (int) ((float) Static454.anIntArray455[1] / 3.0F);
			Static308.anInt6172 = Static582.anInt10109 >> 1;
			Static297.anInt6004 = Static47.anInt645 >> 1;
			Static5.anIntArray5 = new int[Static582.anInt10109 * Static47.anInt645];
		}
		Static215.aClass8_2 = arg0.method5020();
		Static518.anInt9302 = 0;
		for (@Pc(108) int local108 = 0; local108 < Static343.anInt6653; local108++) {
			Static51.method670(arg0, Static8.aClass314Array1[local108], arg1);
		}
		for (@Pc(127) int local127 = 0; local127 < Static180.anInt3623; local127++) {
			Static51.method670(arg0, Static485.aClass314Array4[local127], arg1);
		}
		for (@Pc(142) int local142 = 0; local142 < Static195.anInt3778; local142++) {
			Static51.method670(arg0, Static430.aClass314Array3[local142], arg1);
		}
		Static192.anInt3745 = 0;
		if (Static518.anInt9302 > 0) {
			@Pc(162) int local162 = Static5.anIntArray5.length;
			@Pc(168) int local168 = local162 - local162 & 0x7;
			@Pc(170) int local170 = 0;
			while (local168 > local170) {
				Static5.anIntArray5[local170++] = Integer.MAX_VALUE;
				Static5.anIntArray5[local170++] = Integer.MAX_VALUE;
				Static5.anIntArray5[local170++] = Integer.MAX_VALUE;
				Static5.anIntArray5[local170++] = Integer.MAX_VALUE;
				Static5.anIntArray5[local170++] = Integer.MAX_VALUE;
				Static5.anIntArray5[local170++] = Integer.MAX_VALUE;
				Static5.anIntArray5[local170++] = Integer.MAX_VALUE;
				Static5.anIntArray5[local170++] = Integer.MAX_VALUE;
			}
			while (local162 > local170) {
				Static5.anIntArray5[local170++] = Integer.MAX_VALUE;
			}
			Static84.anInt1542 = 1;
			for (@Pc(229) int local229 = 0; local229 < Static518.anInt9302; local229++) {
				@Pc(235) Class314 local235 = Static70.aClass314Array2[local229];
				Static52.method680(local235.aShortArray121[1], local235.aShortArray120[3], local235.aShortArray122[1], local235.aShortArray120[0], local235.aShortArray120[1], local235.aShortArray121[0], local235.aShortArray122[3], local235.aShortArray122[0], local235.aShortArray121[3]);
				Static52.method680(local235.aShortArray121[2], local235.aShortArray120[3], local235.aShortArray122[2], local235.aShortArray120[1], local235.aShortArray120[2], local235.aShortArray121[1], local235.aShortArray122[3], local235.aShortArray122[1], local235.aShortArray121[3]);
			}
			Static84.anInt1542 = 2;
		}
		if (Static269.aBoolean385) {
			Static438.aLong214 = Static141.aClass65_1.method5484() - Static35.aLong24;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)V")
	public static void method5959(@OriginalArg(1) int arg0) {
		if (Static115.anIntArray123 == null || arg0 > Static115.anIntArray123.length) {
			Static115.anIntArray123 = new int[arg0];
		}
	}
}
