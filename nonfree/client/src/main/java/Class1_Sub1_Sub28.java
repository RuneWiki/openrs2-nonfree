import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!we", name = "I", descriptor = "I")
	public int anInt4659;

	@OriginalMember(owner = "client!we", name = "M", descriptor = "I")
	public int anInt4662;

	@OriginalMember(owner = "client!we", name = "P", descriptor = "I")
	public int anInt4665;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLclient!nc;I)V")
	private void method3438(@OriginalArg(1) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4659 = arg0.method946();
			this.anInt4662 = arg0.method895();
			this.anInt4665 = arg0.method895();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLclient!nc;)V")
	public void method3441(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method895();
			if (local5 == 0) {
				return;
			}
			this.method3438(arg0, local5);
		}
	}
}
