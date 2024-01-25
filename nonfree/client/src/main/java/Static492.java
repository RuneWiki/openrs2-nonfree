import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
	public static int anInt8645;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_427 = new Class305(25, -2);

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!et;I)V")
	public static void method7558(@OriginalArg(0) Class91 arg0) {
		@Pc(7) Class91 local7 = Static68.method1682(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = Static508.anInt8910;
			local13 = Static70.anInt1753;
		} else {
			local13 = local7.anInt2399;
			local11 = local7.anInt2378;
		}
		Static543.method8256(arg0, local13, false, local11);
		Static28.method799(arg0, local13, local11);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public static void method7559(@OriginalArg(0) int arg0) {
		Static361.method5869();
		@Pc(11) int local11 = Static292.aClass255_1.method6634(arg0).anInt7215;
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static417.aClass10_1.anIntArray29[arg0];
		if (local11 == 6) {
			Static455.anInt7936 = local19;
		}
		if (local11 == 5) {
			Static410.anInt7616 = local19;
		}
	}
}
