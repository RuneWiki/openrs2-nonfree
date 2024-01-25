import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class172 {

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	public int anInt4676;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public int anInt4678;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	public int anInt4680;

	static {
		new Class7("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!hp;)V")
	private void method3890(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt4678 = arg1.method5362();
			this.anInt4680 = arg1.method5366();
			this.anInt4676 = arg1.method5366();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!hp;)V")
	public void method3891(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5366();
			if (local7 == 0) {
				return;
			}
			this.method3890(local7, arg0);
		}
	}
}
