import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!af", name = "R", descriptor = "I")
	public int anInt357;

	@OriginalMember(owner = "client!af", name = "U", descriptor = "I")
	public int anInt360;

	@OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
	public int anInt367;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!of;I)V")
	public void method213(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2072();
			if (local17 == 0) {
				return;
			}
			this.method215(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!of;I)V")
	private void method215(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		if (arg0 == 1) {
			this.anInt360 = arg1.method2051();
			this.anInt367 = arg1.method2072();
			this.anInt357 = arg1.method2072();
		}
	}
}
