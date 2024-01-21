import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
	public int anInt2053 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!m;I)V")
	public void method1331(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method981();
			if (local14 == 0) {
				return;
			}
			this.method1332(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!m;I)V")
	private void method1332(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt2053 = arg0.method974();
		}
	}
}
