import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class69 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Z")
	public boolean aBoolean141;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
	public int anInt2205;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
	public int anInt2206;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
	public int anInt2207;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
	public int anInt2210;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
	public int anInt2212;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
	public int anInt2214 = 16777215;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
	public int anInt2213 = 8;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!co;I)V")
	public void method2039(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4220();
			if (local11 == 0) {
				return;
			}
			this.method2041(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!co;II)V")
	private void method2041(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2213 = arg0.method4227();
		} else if (arg1 == 2) {
			this.aBoolean141 = true;
		} else if (arg1 == 3) {
			this.anInt2212 = arg0.method4212();
			this.anInt2207 = arg0.method4212();
			this.anInt2205 = arg0.method4212();
		} else if (arg1 == 4) {
			this.anInt2210 = arg0.method4220();
		} else if (arg1 == 5) {
			this.anInt2206 = arg0.method4227();
		} else if (arg1 == 6) {
			this.anInt2214 = arg0.method4182();
		}
	}
}
