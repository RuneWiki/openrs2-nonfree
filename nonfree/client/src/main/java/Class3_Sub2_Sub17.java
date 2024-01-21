import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class3_Sub2_Sub17 extends Class3_Sub2 {

	@OriginalMember(owner = "client!we", name = "O", descriptor = "I")
	public int anInt3952 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!rd;B)V")
	public void method2872(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method191();
			if (local5 == 0) {
				return;
			}
			this.method2880(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!rd;I)V")
	private void method2880(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 5) {
			this.anInt3952 = arg1.method208();
		}
	}
}
