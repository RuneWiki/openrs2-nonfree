import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class78 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	public int anInt2860 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!vf;)V")
	public void method2193(@OriginalArg(1) Class1_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2945();
			if (local5 == 0) {
				return;
			}
			this.method2194(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IILclient!vf;)V")
	private void method2194(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub26 arg1) {
		if (arg0 == 5) {
			this.anInt2860 = arg1.method2964();
		}
	}
}
