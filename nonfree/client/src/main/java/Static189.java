import java.awt.Color;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	public static int anInt3601 = 0;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString152 = "Loaded update list";

	@OriginalMember(owner = "client!me", name = "r", descriptor = "I")
	public static int anInt3613 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!mb;IZ)V")
	public static void method3558(@OriginalArg(0) Class132 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt3528 == 0 ? arg0.anInt3507 : arg0.anInt3528;
		@Pc(24) int local24 = arg0.anInt3566 == 0 ? arg0.anInt3503 : arg0.anInt3566;
		Static329.method5492(local15, local24, arg0.anInt3551, arg1, Static81.aClass132ArrayArray1[arg0.anInt3551 >> 16]);
		if (arg0.aClass132Array2 != null) {
			Static329.method5492(local15, local24, arg0.anInt3551, arg1, arg0.aClass132Array2);
		}
		@Pc(57) Class6_Sub30 local57 = (Class6_Sub30) Static197.aClass108_30.method2900((long) arg0.anInt3551);
		if (local57 != null) {
			Static13.method227(local57.anInt4313, arg1, local15, local24);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BII)I")
	public static int method3560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class6_Sub38 local10 = (Class6_Sub38) Static297.aClass108_31.method2900((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray653.length > arg0) {
			return local10.anIntArray653[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI[BI)I")
	public static int method3561(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class6_Sub1_Sub25.anIntArray458[(local7 ^ arg1[local9]) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/Object;Lclient!vj;)V")
	public static void method3562(@OriginalArg(1) Object arg0, @OriginalArg(2) Class206 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static278.method5283(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)Z")
	public static boolean method3563(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static157.anInt2943; local1 < Static131.anInt2392; local1++) {
			@Pc(6) Class187[][] local6 = Static39.aClass187ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static30.anInt573; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static339.anInt6187 + local9;
				@Pc(18) int local18 = Static339.anInt6187 - local9;
				if (local14 >= Static107.anInt1991 || local18 < Static236.anInt2368) {
					for (@Pc(27) int local27 = -Static30.anInt573; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static8.anInt3154 + local27;
						@Pc(36) int local36 = Static8.anInt3154 - local27;
						@Pc(48) Class187 local48;
						if (local14 >= Static107.anInt1991) {
							if (local32 >= Static23.anInt378) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean376) {
									Static116.aBoolean187 = arg0;
									Static59.aClass155_1.method5565(local48);
									Static59.aClass155_1.method5569();
								}
							}
							if (local36 < Static305.anInt5784) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean376) {
									Static116.aBoolean187 = arg0;
									Static59.aClass155_1.method5565(local48);
									Static59.aClass155_1.method5569();
								}
							}
						}
						if (local18 < Static236.anInt2368) {
							if (local32 >= Static23.anInt378) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean376) {
									Static116.aBoolean187 = arg0;
									Static59.aClass155_1.method5565(local48);
									Static59.aClass155_1.method5569();
								}
							}
							if (local36 < Static305.anInt5784) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean376) {
									Static116.aBoolean187 = arg0;
									Static59.aClass155_1.method5565(local48);
									Static59.aClass155_1.method5569();
								}
							}
						}
						if (Static317.anInt5887 == 0) {
							if (Static2.aBoolean8) {
								Static59.aClass155_1.method5570(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
