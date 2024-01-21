import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "[Lclient!g;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public int anInt310;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt311;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray120;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method240(@OriginalArg(0) int arg0, @OriginalArg(1) Class36 arg1) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg1.method479((byte) 6, null, "frame_head.dat"), 4);
			@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg1.method479((byte) 6, null, "frame_tran1.dat"), 4);
			@Pc(31) Class1_Sub3_Sub3 local31 = new Class1_Sub3_Sub3(arg1.method479((byte) 6, null, "frame_tran2.dat"), 4);
			@Pc(41) Class1_Sub3_Sub3 local41 = new Class1_Sub3_Sub3(arg1.method479((byte) 6, null, "frame_del.dat"), 4);
			@Pc(45) boolean local45 = false;
			@Pc(48) int local48 = local11.method382();
			@Pc(51) int local51 = local11.method382();
			aClass12Array1 = new Class12[local51 + 1];
			@Pc(59) int[] local59 = new int[500];
			@Pc(62) int[] local62 = new int[500];
			@Pc(65) int[] local65 = new int[500];
			@Pc(68) int[] local68 = new int[500];
			for (@Pc(70) int local70 = 0; local70 < local48; local70++) {
				@Pc(75) int local75 = local11.method382();
				@Pc(83) Class12 local83 = aClass12Array1[local75] = new Class12();
				local83.anInt310 = local41.method380();
				@Pc(90) int local90 = local11.method382();
				@Pc(94) Class10 local94 = Class10.aClass10Array1[local90];
				local83.aClass10_1 = local94;
				@Pc(100) int local100 = local11.method380();
				@Pc(102) int local102 = -1;
				@Pc(104) int local104 = 0;
				@Pc(111) int local111;
				for (@Pc(106) int local106 = 0; local106 < local100; local106++) {
					local111 = local21.method380();
					if (local111 > 0) {
						if (local94.anIntArray115[local106] != 0) {
							for (@Pc(122) int local122 = local106 - 1; local122 > local102; local122--) {
								if (local94.anIntArray115[local122] == 0) {
									local59[local104] = local122;
									local62[local104] = 0;
									local65[local104] = 0;
									local68[local104] = 0;
									local104++;
									break;
								}
							}
						}
						local59[local104] = local106;
						@Pc(158) short local158 = 0;
						if (local94.anIntArray115[local59[local104]] == 3) {
							local158 = 128;
						}
						if ((local111 & 0x1) == 0) {
							local62[local104] = local158;
						} else {
							local62[local104] = local31.method393();
						}
						if ((local111 & 0x2) == 0) {
							local65[local104] = local158;
						} else {
							local65[local104] = local31.method393();
						}
						if ((local111 & 0x4) == 0) {
							local68[local104] = local158;
						} else {
							local68[local104] = local31.method393();
						}
						local102 = local106;
						local104++;
					}
				}
				local83.anInt311 = local104;
				local83.anIntArray117 = new int[local104];
				local83.anIntArray118 = new int[local104];
				local83.anIntArray119 = new int[local104];
				local83.anIntArray120 = new int[local104];
				for (local111 = 0; local111 < local104; local111++) {
					local83.anIntArray117[local111] = local59[local111];
					local83.anIntArray118[local111] = local62[local111];
					local83.anIntArray119[local111] = local65[local111];
					local83.anIntArray120[local111] = local68[local111];
				}
			}
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("6720, " + arg0 + ", " + arg1 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
