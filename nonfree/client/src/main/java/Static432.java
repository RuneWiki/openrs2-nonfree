import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
	public static int anInt7908;

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "Lclient!afa;")
	public static final Class12 aClass12_4 = new Class12("WIP", 2);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BII)V")
	public static void method6658(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(0, 15);
		local8.method5179();
		local8.anInt6195 = arg1;
		local8.anInt6198 = arg0;
	}
}
