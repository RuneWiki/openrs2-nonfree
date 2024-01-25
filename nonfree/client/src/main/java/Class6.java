import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class6 {

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
	public int anInt166;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	public int anInt168;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILclient!lk;)V")
	private void method191(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt166 = arg1.method4245();
			this.anInt168 = arg1.method4240();
			this.anInt167 = arg1.method4240();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!lk;I)V")
	public void method194(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4240();
			if (local5 == 0) {
				return;
			}
			this.method191(local5, arg0);
		}
	}
}
