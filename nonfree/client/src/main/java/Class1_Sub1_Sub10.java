import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hb", name = "cb", descriptor = "I")
	public int anInt1309 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!qc;B)V")
	public void method825(@OriginalArg(0) Class1_Sub18 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2169();
			if (local5 == 0) {
				return;
			}
			this.method827(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!qc;I)V")
	private void method827(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1309 = arg0.method2156();
		}
	}
}
