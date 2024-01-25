import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class2_Sub7_Sub13 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
	public int anInt4820 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZLclient!vt;)V")
	public void method4327(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5732();
			if (local9 == 0) {
				return;
			}
			this.method4329(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!vt;I)V")
	private void method4329(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub24 arg1) {
		if (arg0 == 2) {
			this.anInt4820 = arg1.method5753();
		}
	}
}
