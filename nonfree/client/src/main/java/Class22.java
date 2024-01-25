import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class22 {

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public int anInt728;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
	public int anInt729;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "Z")
	public boolean aBoolean69;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
	public int anInt730;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
	public int anInt727 = 8;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
	public int anInt732 = 16777215;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!fca;I)V")
	public void method772(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4888();
			if (local9 == 0) {
				return;
			}
			this.method775(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILclient!fca;)V")
	private void method775(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt727 = arg1.method4858();
		} else if (arg0 == 2) {
			this.aBoolean69 = true;
		} else if (arg0 == 3) {
			this.anInt729 = arg1.method4869();
			this.anInt731 = arg1.method4869();
			this.anInt728 = arg1.method4869();
		} else if (arg0 == 4) {
			this.anInt734 = arg1.method4888();
		} else if (arg0 == 5) {
			this.anInt730 = arg1.method4858();
		} else if (arg0 == 6) {
			this.anInt732 = arg1.method4862();
		}
	}
}
