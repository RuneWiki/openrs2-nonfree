import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class3_Sub2_Sub11 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
	public int anInt2806;

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
	public int anInt2808;

	@OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
	public int anInt2812;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!rd;ZI)V")
	private void method2025(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2806 = arg0.method208();
			this.anInt2808 = arg0.method191();
			this.anInt2812 = arg0.method191();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!rd;)V")
	public void method2029(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method191();
			if (local5 == 0) {
				return;
			}
			this.method2025(arg0, local5);
		}
	}
}
