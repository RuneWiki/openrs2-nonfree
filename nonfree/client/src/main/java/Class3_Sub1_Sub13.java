import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
	public int anInt2462;

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
	public int anInt2466;

	@OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
	public int anInt2468;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!b;)V")
	public void method1661(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method270();
			if (local14 == 0) {
				return;
			}
			this.method1663(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!b;IB)V")
	private void method1663(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2462 = arg0.method276();
			this.anInt2468 = arg0.method270();
			this.anInt2466 = arg0.method270();
		}
	}
}
