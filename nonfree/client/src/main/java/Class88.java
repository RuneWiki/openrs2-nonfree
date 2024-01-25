import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class88 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
	public int anInt2640;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
	public int anInt2641;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
	public int anInt2643;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	public int anInt2650;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
	public int anInt2651;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
	public int anInt2644 = 16777215;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
	public int anInt2645 = 8;

	static {
		new Class158("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method1930(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method1171();
			if (local8 == 0) {
				return;
			}
			this.method1931(local8, arg0);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILclient!ia;)V")
	private void method1931(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt2645 = arg1.method1177();
		} else if (arg0 == 2) {
			this.aBoolean170 = true;
		} else if (arg0 == 3) {
			this.anInt2640 = arg1.method1215();
			this.anInt2643 = arg1.method1215();
			this.anInt2651 = arg1.method1215();
		} else if (arg0 == 4) {
			this.anInt2650 = arg1.method1171();
		} else if (arg0 == 5) {
			this.anInt2641 = arg1.method1177();
		} else if (arg0 == 6) {
			this.anInt2644 = arg1.method1226();
		}
	}
}
