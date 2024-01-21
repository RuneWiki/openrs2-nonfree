import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
	public int anInt1115;

	@OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
	public int anInt1119;

	@OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
	public int anInt1123;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLclient!qc;)V")
	private void method667(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub18 arg1) {
		if (arg0 == 1) {
			this.anInt1123 = arg1.method2156();
			this.anInt1119 = arg1.method2169();
			this.anInt1115 = arg1.method2169();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLclient!qc;)V")
	public void method670(@OriginalArg(1) Class1_Sub18 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2169();
			if (local7 == 0) {
				return;
			}
			this.method667(local7, arg0);
		}
	}
}
