import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class110 {

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
	public int anInt2874;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	public int anInt2875;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "Z")
	public boolean aBoolean208;

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
	public int anInt2880;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
	public int anInt2881;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
	public int anInt2883;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
	public int anInt2876 = 16777215;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
	public int anInt2873 = 8;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BILclient!tl;)V")
	private void method2251(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 1) {
			this.anInt2873 = arg1.method4877();
		} else if (arg0 == 2) {
			this.aBoolean208 = true;
		} else if (arg0 == 3) {
			this.anInt2880 = arg1.method4889();
			this.anInt2883 = arg1.method4889();
			this.anInt2881 = arg1.method4889();
		} else if (arg0 == 4) {
			this.anInt2874 = arg1.method4864();
		} else if (arg0 == 5) {
			this.anInt2875 = arg1.method4877();
		} else if (arg0 == 6) {
			this.anInt2876 = arg1.method4887();
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!tl;B)V")
	public void method2253(@OriginalArg(0) Class4_Sub30 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4864();
			if (local11 == 0) {
				return;
			}
			this.method2251(local11, arg0);
		}
	}
}
