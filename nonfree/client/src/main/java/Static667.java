import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static667 {

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[Lclient!ut;")
	public static final Class374[] aClass374Array1 = new Class374[6];

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	public static int anInt10369 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!rha;)Lclient!rha;")
	public static Class2_Sub23_Sub5 method9088(@OriginalArg(1) Class2_Sub23_Sub5 arg0) {
		@Pc(21) Class2_Sub23_Sub5 local21 = arg0 == null ? new Class2_Sub23_Sub5() : new Class2_Sub23_Sub5(arg0);
		local21.method7699();
		return local21;
	}
}
