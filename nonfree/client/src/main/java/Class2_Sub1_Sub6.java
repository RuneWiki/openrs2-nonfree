import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
	public int anInt1086 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZLclient!be;)V")
	private void method756(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg0 == 2) {
			this.anInt1086 = arg1.method896();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!be;I)V")
	public void method759(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method933();
			if (local16 == 0) {
				return;
			}
			this.method756(local16, arg0);
		}
	}
}
