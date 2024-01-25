import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
	public static int anInt10340;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	public static int anInt10343;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_99 = new Class344(4, 0);

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Lclient!uea;")
	public static final Class326 aClass326_9 = new Class326("LOCAL", 4);

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Z")
	public static final boolean aBoolean707 = true;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "[I")
	public static final int[] anIntArray579 = new int[4096];

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public static int anInt10344 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!ek;)Lclient!ju;")
	public static Class170 method8072(@OriginalArg(1) Class4_Sub13 arg0) {
		@Pc(12) int local12 = arg0.method7054();
		return new Class170(local12);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
	public static int method8075(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
