import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class87 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	public int anInt2723;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	public int anInt2725;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public int anInt2729;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
	public int anInt2730;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
	public int anInt2731;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	public int anInt2724 = 16777215;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	public int anInt2728 = 8;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!qm;ZI)V")
	public void method2054(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2199();
			if (local5 == 0) {
				return;
			}
			this.method2056(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!qm;IIB)V")
	private void method2056(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt2728 = arg0.method2244();
		} else if (arg1 == 2) {
			this.aBoolean170 = true;
		} else if (arg1 == 3) {
			this.anInt2729 = arg0.method2248();
			this.anInt2730 = arg0.method2248();
			this.anInt2723 = arg0.method2248();
		} else if (arg1 == 4) {
			this.anInt2731 = arg0.method2199();
		} else if (arg1 == 5) {
			this.anInt2725 = arg0.method2244();
		} else if (arg1 == 6) {
			this.anInt2724 = arg0.method2215();
		}
	}
}
