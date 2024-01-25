import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "[Lclient!wba;")
	public static Class386[] aClass386Array1;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
	public static int anInt991 = 0;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
	public static final int[] anIntArray63 = new int[8];

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Z")
	public static final boolean aBoolean69 = false;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_26 = new Class160(24, 16);

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!o;")
	public static final Class260 aClass260_3 = new Class260(1);

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	public static int anInt998 = -1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Z")
	public static boolean method1026(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method1029() {
		@Pc(1) Class317 local1 = Static111.aClass317_12;
		synchronized (Static111.aClass317_12) {
			Static111.aClass317_12.method7873();
		}
		local1 = Static306.aClass317_31;
		synchronized (Static306.aClass317_31) {
			Static306.aClass317_31.method7873();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)[Lclient!maa;")
	public static Class229[] method1031() {
		return new Class229[] { Static660.aClass229_5, Static449.aClass229_6, Static312.aClass229_4 };
	}
}
