import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!c", name = "J", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_3;

	@OriginalMember(owner = "client!c", name = "R", descriptor = "Lclient!lj;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!c", name = "S", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_4;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "I")
	public static int anInt493 = 0;

	@OriginalMember(owner = "client!c", name = "X", descriptor = "I")
	public static int anInt499 = 0;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)I")
	public static int method362() {
		@Pc(12) int local12 = 3;
		if (Static134.anInt2897 < 310) {
			@Pc(19) int local19 = Static17.anInt438 >> 7;
			@Pc(23) int local23 = Static165.anInt2958 >> 7;
			if ((Static209.aByteArrayArrayArray13[Static180.anInt3841][local19][local23] & 0x4) != 0) {
				local12 = Static180.anInt3841;
			}
			@Pc(43) int local43 = Static84.aClass9_Sub4_Sub1_2.anInt3903 >> 7;
			@Pc(48) int local48 = Static84.aClass9_Sub4_Sub1_2.anInt3925 >> 7;
			@Pc(56) int local56;
			if (local23 >= local43) {
				local56 = local23 - local43;
			} else {
				local56 = local43 - local23;
			}
			@Pc(70) int local70;
			if (local48 <= local19) {
				local70 = local19 - local48;
			} else {
				local70 = local48 - local19;
			}
			@Pc(92) int local92;
			@Pc(86) int local86;
			if (local70 <= local56) {
				local86 = 32768;
				local92 = local70 * 65536 / local56;
				while (local23 != local43) {
					if (local43 > local23) {
						local23++;
					} else if (local23 > local43) {
						local23--;
					}
					local86 += local92;
					if ((Static209.aByteArrayArrayArray13[Static180.anInt3841][local19][local23] & 0x4) != 0) {
						local12 = Static180.anInt3841;
					}
					if (local86 >= 65536) {
						if (local48 > local19) {
							local19++;
						} else if (local48 < local19) {
							local19--;
						}
						local86 -= 65536;
						if ((Static209.aByteArrayArrayArray13[Static180.anInt3841][local19][local23] & 0x4) != 0) {
							local12 = Static180.anInt3841;
						}
					}
				}
			} else {
				local92 = local56 * 65536 / local70;
				local86 = 32768;
				while (local48 != local19) {
					if (local48 > local19) {
						local19++;
					} else if (local19 > local48) {
						local19--;
					}
					if ((Static209.aByteArrayArrayArray13[Static180.anInt3841][local19][local23] & 0x4) != 0) {
						local12 = Static180.anInt3841;
					}
					local86 += local92;
					if (local86 >= 65536) {
						local86 -= 65536;
						if (local23 < local43) {
							local23++;
						} else if (local23 > local43) {
							local23--;
						}
						if ((Static209.aByteArrayArrayArray13[Static180.anInt3841][local19][local23] & 0x4) != 0) {
							local12 = Static180.anInt3841;
						}
					}
				}
			}
		}
		if ((Static209.aByteArrayArrayArray13[Static180.anInt3841][Static84.aClass9_Sub4_Sub1_2.anInt3925 >> 7][Static84.aClass9_Sub4_Sub1_2.anInt3903 >> 7] & 0x4) != 0) {
			local12 = Static180.anInt3841;
		}
		return local12;
	}
}
