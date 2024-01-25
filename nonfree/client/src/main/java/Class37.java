import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class37 {

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
	public int anInt1245;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
	public int anInt1248;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
	public int anInt1249;

	static {
		new Class267("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!ae;)V")
	private void method1029(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt1248 = arg1.method6485();
			this.anInt1245 = arg1.method6433();
			this.anInt1249 = arg1.method6433();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!ae;)V")
	public void method1030(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6433();
			if (local5 == 0) {
				return;
			}
			this.method1029(local5, arg0);
		}
	}
}
