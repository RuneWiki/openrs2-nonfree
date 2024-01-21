import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
	public int anInt2547 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLclient!m;I)V")
	private void method1682(@OriginalArg(1) Class3_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2547 = arg0.method1603();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!m;B)V")
	public void method1684(@OriginalArg(0) Class3_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1587();
			if (local9 == 0) {
				return;
			}
			this.method1682(arg0, local9);
		}
	}
}
