import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class82 {

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
	public int anInt3315;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public int anInt3316;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	public int anInt3318;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	public int anInt3320;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Z")
	public boolean aBoolean176;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
	public int anInt3322;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	public int anInt3324 = 16777215;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
	public int anInt3327 = 8;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILclient!ql;)V")
	private void method2503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub13 arg2) {
		if (arg0 == 1) {
			this.anInt3327 = arg2.method1764();
		} else if (arg0 == 2) {
			this.aBoolean176 = true;
		} else if (arg0 == 3) {
			this.anInt3316 = arg2.method1798();
			this.anInt3320 = arg2.method1798();
			this.anInt3318 = arg2.method1798();
		} else if (arg0 == 4) {
			this.anInt3322 = arg2.method1772();
		} else if (arg0 == 5) {
			this.anInt3315 = arg2.method1764();
			return;
		} else if (arg0 == 6) {
			this.anInt3324 = arg2.method1773();
			return;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!ql;)V")
	public void method2505(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		while (true) {
			@Pc(18) int local18 = arg1.method1772();
			if (local18 == 0) {
				return;
			}
			this.method2503(local18, arg0, arg1);
		}
	}
}
