import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class23 {

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "[I")
	public static int[] anIntArray52 = new int[4096];

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public int anInt752;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
	public int anInt755;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Z")
	public boolean aBoolean49;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
	public int anInt760;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public int anInt751 = 16777215;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	public int anInt761 = 8;

	static {
		for (@Pc(42) int local42 = 0; local42 < 4096; local42++) {
			anIntArray52[local42] = Static190.method2979(local42);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!aj;I)V")
	private void method525(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt761 = arg1.method2375();
		} else if (arg2 == 2) {
			this.aBoolean49 = true;
		} else if (arg2 == 3) {
			this.anInt752 = arg1.method2360();
			this.anInt762 = arg1.method2360();
			this.anInt755 = arg1.method2360();
		} else if (arg2 == 4) {
			this.anInt760 = arg1.method2334();
		} else if (arg2 == 5) {
			this.anInt763 = arg1.method2375();
		} else if (arg2 == 6) {
			this.anInt751 = arg1.method2323();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!aj;IB)V")
	public void method529(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method2334();
			if (local17 == 0) {
				return;
			}
			this.method525(arg1, arg0, local17);
		}
	}
}
