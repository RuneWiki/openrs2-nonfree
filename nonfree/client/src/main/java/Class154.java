import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class154 {

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
	public int anInt3663 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZLclient!es;)V")
	private void method3349(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 5) {
			this.anInt3663 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!es;Z)V")
	public void method3351(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8865();
			if (local13 == 0) {
				return;
			}
			this.method3349(local13, arg0);
		}
	}
}
