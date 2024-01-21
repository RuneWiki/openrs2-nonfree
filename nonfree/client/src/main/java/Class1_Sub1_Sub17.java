import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
	public int anInt4340 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!hc;)V")
	private void method2949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 2) {
			this.anInt4340 = arg1.method546();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!hc;Z)V")
	public void method2950(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method544();
			if (local9 == 0) {
				return;
			}
			this.method2949(local9, arg0);
		}
	}
}
