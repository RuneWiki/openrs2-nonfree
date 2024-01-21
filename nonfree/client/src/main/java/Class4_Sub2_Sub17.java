import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class4_Sub2_Sub17 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
	public int anInt3177;

	@OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
	public int anInt3178;

	@OriginalMember(owner = "client!wb", name = "nb", descriptor = "I")
	public int anInt3182;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!s;I)V")
	public void method2203(@OriginalArg(0) Class4_Sub16 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1474();
			if (local14 == 0) {
				return;
			}
			this.method2204(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!s;I)V")
	private void method2204(@OriginalArg(1) Class4_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3177 = arg0.method1490();
			this.anInt3182 = arg0.method1474();
			this.anInt3178 = arg0.method1474();
		}
	}
}
