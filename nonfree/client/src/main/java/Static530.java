import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!sa", name = "eb", descriptor = "[Lclient!je;")
	public static Class12_Sub2[] aClass12_Sub2Array6;

	@OriginalMember(owner = "client!sa", name = "pb", descriptor = "Lclient!wia;")
	public static Class386 aClass386_112;

	@OriginalMember(owner = "client!sa", name = "rb", descriptor = "Z")
	public static boolean aBoolean649;

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_114 = new Class100(13, 8);

	@OriginalMember(owner = "client!sa", name = "ob", descriptor = "Lclient!lba;")
	public static Class206 aClass206_1 = new Class206(8);

	@OriginalMember(owner = "client!sa", name = "qb", descriptor = "[I")
	public static final int[] anIntArray671 = new int[1024];

	@OriginalMember(owner = "client!sa", name = "sb", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_14 = new Class395(6, -1);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)Z")
	public static boolean method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!vn;Z)V")
	public static void method7613(@OriginalArg(0) Class12_Sub2_Sub2_Sub1 arg0) {
		if (arg0.anIntArray238 == null && arg0.anIntArray233 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray238.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray238 != null) {
				local20 = arg0.anIntArray238[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(79) int local79;
				@Pc(92) int local92;
				@Pc(59) int local59;
				if ((local20 & 0xC0000000) == -1073741824) {
					local59 = local20 & 0xFFFFFFF;
					@Pc(63) int local63 = local59 >> 14;
					@Pc(67) int local67 = local59 & 0x3FFF;
					local79 = arg0.anInt10998 - (local63 - Static329.anInt6225) * 512 - 256;
					local92 = arg0.anInt11002 - (local67 - Static202.anInt3755) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(140) Class14_Sub44 local140 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local20);
					if (local140 == null) {
						arg0.method2413(-1, local16);
						continue;
					}
					@Pc(153) Class12_Sub2_Sub2_Sub1_Sub1 local153 = local140.aClass12_Sub2_Sub2_Sub1_Sub1_2;
					local92 = arg0.anInt11002 - local153.anInt11002;
					local79 = arg0.anInt10998 - local153.anInt10998;
				} else {
					local59 = local20 & 0x7FFF;
					@Pc(109) Class12_Sub2_Sub2_Sub1_Sub2 local109 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local59];
					if (local109 == null) {
						arg0.method2413(-1, local16);
						continue;
					}
					local79 = arg0.anInt10998 - local109.anInt10998;
					local92 = arg0.anInt11002 - local109.anInt11002;
				}
				if (local79 != 0 || local92 != 0) {
					arg0.method2413((int) (Math.atan2((double) local79, (double) local92) * 2607.5945876176133D) & 0x3FFF, local16);
				}
			} else if (!arg0.method2413(-1, local16)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray238 = null;
			arg0.anIntArray233 = null;
		}
	}
}
