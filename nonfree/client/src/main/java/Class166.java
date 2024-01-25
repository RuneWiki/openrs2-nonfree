import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class166 {

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	public int anInt5438 = 0;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public int anInt5437 = 0;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	public int anInt5435 = 2048;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	public int anInt5442 = 2048;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILclient!dg;)V")
	private void method4813(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub10 arg2) {
		if (arg1 == 1) {
			this.anInt5437 = arg2.method4421();
		} else if (arg1 == 2) {
			this.anInt5435 = arg2.method4464();
		} else if (arg1 == 3) {
			this.anInt5442 = arg2.method4464();
		} else if (arg1 == 4) {
			this.anInt5438 = arg2.method4460();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!dg;II)V")
	public void method4817(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method4421();
			if (local17 == 0) {
				return;
			}
			this.method4813(arg1, local17, arg0);
		}
	}
}
