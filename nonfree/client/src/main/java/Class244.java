import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class244 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
	public int anInt6196;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	public int anInt6201;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	public int anInt6203;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Z")
	public boolean aBoolean574;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public int anInt6206;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	public int anInt6211;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public int anInt6208 = 8;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	public int anInt6209 = 16777215;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!re;)V")
	public void method5418(@OriginalArg(1) Class1_Sub33 arg0) {
		while (true) {
			@Pc(23) int local23 = arg0.method5174();
			if (local23 == 0) {
				return;
			}
			this.method5424(local23, arg0);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!re;Z)V")
	private void method5424(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub33 arg1) {
		if (arg0 == 1) {
			this.anInt6208 = arg1.method5177();
		} else if (arg0 == 2) {
			this.aBoolean574 = true;
		} else if (arg0 == 3) {
			this.anInt6211 = arg1.method5180();
			this.anInt6201 = arg1.method5180();
			this.anInt6203 = arg1.method5180();
		} else if (arg0 == 4) {
			this.anInt6206 = arg1.method5174();
		} else if (arg0 == 5) {
			this.anInt6196 = arg1.method5177();
		} else if (arg0 == 6) {
			this.anInt6209 = arg1.method5159();
		}
	}
}
