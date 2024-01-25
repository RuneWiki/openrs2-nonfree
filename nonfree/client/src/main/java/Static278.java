import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
	public static int anInt4645;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_119 = new Class211(14, 6);

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
	public static int anInt4646 = 0;

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_166 = new Class48(2, 3);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
	public static void method4110(@OriginalArg(0) int arg0) {
		Static88.method1343();
		@Pc(11) int local11 = Static158.aClass229_3.method4882(arg0).anInt5428;
		if (local11 == 0) {
			return;
		}
		@Pc(26) int local26 = Static230.aClass72_3.anIntArray213[arg0];
		if (local11 == 6) {
			Static229.anInt3858 = local26;
		}
		if (local11 == 5) {
			Static205.anInt3599 = local26;
		}
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)I")
	public static int method4116() {
		return 16;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)I")
	public static int method4117() {
		@Pc(13) Class227 local13 = Static109.aClass227_16;
		synchronized (Static109.aClass227_16) {
			return Static109.aClass227_16.method4857();
		}
	}
}
