import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "mb", descriptor = "I")
	public int anInt1390 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!dc;BI)V")
	private void method1088(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt1390 = arg0.method651();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLclient!dc;)V")
	public void method1089(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method672();
			if (local5 == 0) {
				return;
			}
			this.method1088(arg0, local5);
		}
	}
}
