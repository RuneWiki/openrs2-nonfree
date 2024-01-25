import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "[Lclient!tp;")
	public static Class102_Sub6[] aClass102_Sub6Array1;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
	public static int anInt7765 = -1;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "Z")
	public static boolean aBoolean531 = false;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
	public static void method6435() {
		for (@Pc(3) int local3 = 0; local3 < Static353.anInt6225; local3++) {
			@Pc(9) int local9 = Static519.anIntArray669[local3];
			@Pc(17) Class29_Sub2_Sub1_Sub1 local17 = ((Class6_Sub28) Static31.aClass212_1.method5106((long) local9)).aClass29_Sub2_Sub1_Sub1_2;
			@Pc(21) int local21 = Static420.aClass6_Sub14_Sub2_2.method6041();
			if ((local21 & 0x1) != 0) {
				local21 += Static420.aClass6_Sub14_Sub2_2.method6041() << 8;
			}
			if ((local21 & 0x40) != 0) {
				if (local17.aClass257_1.method5944()) {
					Static577.method5078(local17);
				}
				local17.method1594(Static51.aClass202_1.method4897(Static420.aClass6_Sub14_Sub2_2.method5982()));
				local17.method7005(local17.aClass257_1.anInt7167);
				local17.anInt8549 = local17.aClass257_1.anInt7166 << 3;
				if (local17.aClass257_1.method5944()) {
					Static176.method2703(null, local17.aByte103, local17, local17.anIntArray661[0], null, 0, local17.anIntArray660[0]);
				}
			}
			@Pc(102) int local102;
			if ((local21 & 0x200) != 0) {
				local102 = Static420.aClass6_Sub14_Sub2_2.method5996();
				local17.anInt8579 = Static420.aClass6_Sub14_Sub2_2.method6012();
				local17.anInt8554 = Static420.aClass6_Sub14_Sub2_2.method6041();
				local17.aBoolean599 = (local102 & 0x8000) != 0;
				local17.anInt8522 = local102 & 0x7FFF;
				local17.anInt8575 = local17.anInt8579 + local17.anInt8522 + Static358.anInt6263;
			}
			if ((local21 & 0x100) != 0) {
				local102 = Static420.aClass6_Sub14_Sub2_2.method6020();
				@Pc(149) int[] local149 = new int[local102];
				@Pc(152) int[] local152 = new int[local102];
				@Pc(155) int[] local155 = new int[local102];
				for (@Pc(157) int local157 = 0; local157 < local102; local157++) {
					@Pc(163) int local163 = Static420.aClass6_Sub14_Sub2_2.method5982();
					if (local163 == 65535) {
						local163 = -1;
					}
					local149[local157] = local163;
					local152[local157] = Static420.aClass6_Sub14_Sub2_2.method6041();
					local155[local157] = Static420.aClass6_Sub14_Sub2_2.method6032();
				}
				Static328.method5055(local152, local149, local155, local17);
			}
			@Pc(214) int local214;
			if ((local21 & 0x4) != 0) {
				local102 = Static420.aClass6_Sub14_Sub2_2.method5996();
				if (local102 == 65535) {
					local102 = -1;
				}
				local214 = Static420.aClass6_Sub14_Sub2_2.method6012();
				Static41.method568(local102, local17, local214);
			}
			if ((local21 & 0x1000) != 0) {
				local17.anInt8506 = Static420.aClass6_Sub14_Sub2_2.method6025();
				local17.anInt8547 = Static420.aClass6_Sub14_Sub2_2.method5987();
				local17.anInt8570 = Static420.aClass6_Sub14_Sub2_2.method6034();
				local17.anInt8559 = Static420.aClass6_Sub14_Sub2_2.method6025();
				local17.anInt8507 = Static420.aClass6_Sub14_Sub2_2.method6006() + Static358.anInt6263;
				local17.anInt8567 = Static420.aClass6_Sub14_Sub2_2.method6032() + Static358.anInt6263;
				local17.anInt8552 = Static420.aClass6_Sub14_Sub2_2.method6026();
				local17.anInt8547 += local17.anIntArray660[0];
				local17.anInt8583 = 0;
				local17.anInt8559 += local17.anIntArray660[0];
				local17.anInt8570 += local17.anIntArray661[0];
				local17.anInt8506 += local17.anIntArray661[0];
				local17.anInt8582 = 1;
			}
			if ((local21 & 0x8) != 0) {
				local102 = Static420.aClass6_Sub14_Sub2_2.method5998();
				local214 = Static420.aClass6_Sub14_Sub2_2.method6012();
				local17.method6999(local102, local214, Static358.anInt6263);
				local17.anInt8514 = Static358.anInt6263 + 300;
				local17.anInt8564 = Static420.aClass6_Sub14_Sub2_2.method6012();
			}
			if ((local21 & 0x800) != 0) {
				local17.aByte99 = Static420.aClass6_Sub14_Sub2_2.method6025();
				local17.lb = Static420.aClass6_Sub14_Sub2_2.method5987();
				local17.aByte97 = Static420.aClass6_Sub14_Sub2_2.method5983();
				local17.aByte98 = (byte) Static420.aClass6_Sub14_Sub2_2.method6012();
				local17.anInt8565 = Static358.anInt6263 + Static420.aClass6_Sub14_Sub2_2.method6006();
				local17.anInt8578 = Static358.anInt6263 + Static420.aClass6_Sub14_Sub2_2.method6006();
			}
			if ((local21 & 0x20) != 0) {
				local17.anInt8513 = Static420.aClass6_Sub14_Sub2_2.method6032();
				if (local17.anInt8513 == 65535) {
					local17.anInt8513 = -1;
				}
			}
			if ((local21 & 0x400) != 0) {
				local102 = Static420.aClass6_Sub14_Sub2_2.method5998();
				local214 = Static420.aClass6_Sub14_Sub2_2.method6041();
				local17.method6999(local102, local214, Static358.anInt6263);
			}
			@Pc(440) int local440;
			if ((local21 & 0x10) != 0) {
				local102 = Static420.aClass6_Sub14_Sub2_2.method6032();
				local214 = Static420.aClass6_Sub14_Sub2_2.method6013();
				if (local102 == 65535) {
					local102 = -1;
				}
				local440 = Static420.aClass6_Sub14_Sub2_2.method6012();
				local17.method7000(false, local102, local440, local214);
			}
			if ((local21 & 0x2000) != 0) {
				local102 = Static420.aClass6_Sub14_Sub2_2.method6006();
				local214 = Static420.aClass6_Sub14_Sub2_2.method6013();
				if (local102 == 65535) {
					local102 = -1;
				}
				local440 = Static420.aClass6_Sub14_Sub2_2.method6026();
				local17.method7000(true, local102, local440, local214);
			}
			if ((local21 & 0x80) != 0) {
				local17.aString106 = Static420.aClass6_Sub14_Sub2_2.method5991();
				local17.anInt8524 = 100;
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt1820 = Static420.aClass6_Sub14_Sub2_2.method5982();
				local17.anInt1815 = Static420.aClass6_Sub14_Sub2_2.method5982();
			}
		}
	}
}
