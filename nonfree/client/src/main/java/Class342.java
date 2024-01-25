import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class342 {

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
	public int anInt9975 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!fd;I)V")
	private void method8102(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt9975 = arg0.method6535();
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!fd;)V")
	public void method8104(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6538();
			if (local11 == 0) {
				return;
			}
			this.method8102(arg0, local11);
		}
	}
}
