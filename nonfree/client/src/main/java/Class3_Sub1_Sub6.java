import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
	public int anInt1220 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!m;I)V")
	private void method819(@OriginalArg(1) Class3_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt1220 = arg0.method1603();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!m;B)V")
	public void method821(@OriginalArg(0) Class3_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1587();
			if (local5 == 0) {
				return;
			}
			this.method819(arg0, local5);
		}
	}
}
