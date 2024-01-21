import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
	public int anInt1003 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!qc;B)V")
	public void method599(@OriginalArg(0) Class1_Sub18 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2169();
			if (local14 == 0) {
				return;
			}
			this.method603(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!qc;I)V")
	private void method603(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt1003 = arg0.method2156();
		}
	}
}
