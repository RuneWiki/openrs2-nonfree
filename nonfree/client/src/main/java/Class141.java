import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class141 {

	@OriginalMember(owner = "client!no", name = "c", descriptor = "I")
	public int anInt4852;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "I")
	public int anInt4853;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "I")
	public int anInt4854;

	static {
		new Class102("", 73);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ef;I)V")
	public void method4159(@OriginalArg(0) Class2_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3124();
			if (local9 == 0) {
				return;
			}
			this.method4162(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!ef;I)V")
	private void method4162(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt4854 = arg1.method3104();
			this.anInt4852 = arg1.method3124();
			this.anInt4853 = arg1.method3124();
		}
	}
}
