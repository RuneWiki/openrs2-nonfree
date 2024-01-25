import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
	public int anInt7066 = 0;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILclient!io;)V")
	private void method5820(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		if (arg0 == 2) {
			this.anInt7066 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!io;I)V")
	public void method5822(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4393();
			if (local14 == 0) {
				return;
			}
			this.method5820(local14, arg0);
		}
	}
}
