import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
	public int anInt1160;

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
	public int anInt1161;

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
	public int anInt1164;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!fj;)V")
	public void method838(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method2771();
			if (local8 == 0) {
				return;
			}
			this.method844(arg0, local8);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!fj;BI)V")
	private void method844(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1161 = arg0.method2765();
			this.anInt1160 = arg0.method2771();
			this.anInt1164 = arg0.method2771();
		}
	}
}
