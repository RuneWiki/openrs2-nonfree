import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!qo", name = "J", descriptor = "Lclient!sm;")
	public static Class317 aClass317_1;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_3 = new Class291(0, Static76.aClass58_17, Static76.aClass58_17, 0, 1);

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_4 = new Class291(1, Static76.aClass58_17, 2);

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_5 = new Class291(2, Static76.aClass58_17, Static76.aClass58_17, 2, 3);

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_6 = new Class291(3, Static76.aClass58_17, 3);

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_7 = new Class291(4, Static76.aClass58_17, Static76.aClass58_17, 3, 4);

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_8 = new Class291(5, Static76.aClass58_17, 4);

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_9 = new Class291(6, Static76.aClass58_17, 4);

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_10 = new Class291(7, Static76.aClass58_17, Static76.aClass58_17, 4, 5);

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_11 = new Class291(8, Static76.aClass58_17, Static76.aClass58_17, 5, 98, true, true);

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_12 = new Class291(9, Static76.aClass58_17, 99);

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_13 = new Class291(10, Static76.aClass58_17, 100);

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_14 = new Class291(11, Static76.aClass58_18, Static76.aClass58_18, 0, 92, true, true);

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_15 = new Class291(12, Static76.aClass58_18, Static76.aClass58_18, 92, 92);

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "Lclient!qo;")
	private static final Class291 aClass291_16 = new Class291(13, Static76.aClass58_18, Static76.aClass58_18, 92, 93);

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_17 = new Class291(14, Static76.aClass58_18, Static76.aClass58_18, 94, 95);

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_18 = new Class291(15, Static76.aClass58_18, Static76.aClass58_18, 96, 97);

	@OriginalMember(owner = "client!qo", name = "B", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_19 = new Class291(16, Static76.aClass58_18, 97);

	@OriginalMember(owner = "client!qo", name = "C", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_20 = new Class291(17, Static76.aClass58_18, 97);

	@OriginalMember(owner = "client!qo", name = "D", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_21 = new Class291(18, Static76.aClass58_18, 100);

	@OriginalMember(owner = "client!qo", name = "E", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_22 = new Class291(19, Static76.aClass58_18, 100);

	@OriginalMember(owner = "client!qo", name = "F", descriptor = "Lclient!qo;")
	public static final Class291 aClass291_23 = new Class291(20, Static76.aClass58_18, 100);

	@OriginalMember(owner = "client!qo", name = "G", descriptor = "I")
	public static int anInt7920 = 0;

	@OriginalMember(owner = "client!qo", name = "I", descriptor = "Lclient!mha;")
	public static final Class228 aClass228_8 = new Class228(7, 2);

	@OriginalMember(owner = "client!qo", name = "K", descriptor = "Lclient!fa;")
	public static Class5_Sub4_Sub6 aClass5_Sub4_Sub6_1 = null;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)Lclient!vfa;")
	public static Class357 method6903(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static441.aClass357ArrayArray1[local7] == null || Static441.aClass357ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static567.method8019(local7);
			if (!local25) {
				return null;
			}
		}
		return Static441.aClass357ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)[Lclient!qo;")
	public static Class291[] method6906() {
		return new Class291[] { aClass291_3, aClass291_4, aClass291_5, aClass291_6, aClass291_7, aClass291_8, aClass291_9, aClass291_10, aClass291_11, aClass291_12, aClass291_13, aClass291_14, aClass291_15, aClass291_16, aClass291_17, aClass291_18, aClass291_19, aClass291_20, aClass291_21, aClass291_22, aClass291_23 };
	}
}
