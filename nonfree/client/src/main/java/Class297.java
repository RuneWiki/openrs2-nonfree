import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class297 {

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public int anInt8868;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
	public int anInt8869;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
	public int anInt8870;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!tn;)V")
	public void method7315(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8401();
			if (local5 == 0) {
				return;
			}
			this.method7316(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!tn;I)V")
	private void method7316(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt8869 = arg1.method8414();
			this.anInt8870 = arg1.method8401();
			this.anInt8868 = arg1.method8401();
		}
	}
}
