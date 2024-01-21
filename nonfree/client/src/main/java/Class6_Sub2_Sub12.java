import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class6_Sub2_Sub12 extends Class6_Sub2 {

	@OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
	public int anInt2649;

	@OriginalMember(owner = "client!se", name = "pb", descriptor = "I")
	public int anInt2651;

	@OriginalMember(owner = "client!se", name = "qb", descriptor = "I")
	public int anInt2652;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!b;B)V")
	private void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt2649 = arg1.method1500();
			this.anInt2652 = arg1.method1495();
			this.anInt2651 = arg1.method1495();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!b;)V")
	public void method1796(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1495();
			if (local14 == 0) {
				return;
			}
			this.method1794(local14, arg0);
		}
	}
}
