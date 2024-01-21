import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!g", name = "O", descriptor = "I")
	public int anInt1068;

	@OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
	public int anInt1076;

	@OriginalMember(owner = "client!g", name = "jb", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!dc;I)V")
	private void method875(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1068 = arg0.method651();
			this.anInt1076 = arg0.method672();
			this.anInt1080 = arg0.method672();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!dc;)V")
	public void method876(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method672();
			if (local5 == 0) {
				return;
			}
			this.method875(arg0, local5);
		}
	}
}
