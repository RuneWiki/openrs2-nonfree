import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class167 {

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "Lclient!jv;")
	public Class166 aClass166_1;

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
	public int anInt5694;

	@OriginalMember(owner = "client!jw", name = "h", descriptor = "I")
	private int anInt5695;

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
	public int anInt5698;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!ig;I)V")
	public void method4641(@OriginalArg(0) Class8_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8525();
			if (local13 == 0) {
				return;
			}
			this.method4642(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BLclient!ig;I)V")
	private void method4642(@OriginalArg(1) Class8_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5695 = arg0.method8578();
		} else if (arg1 == 2) {
			this.anInt5698 = arg0.method8525();
			this.anInt5694 = arg0.method8525();
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)Lclient!g;")
	public synchronized Class111 method4643() {
		@Pc(23) Class111 local23 = (Class111) this.aClass166_1.aClass236_50.method6242((long) this.anInt5695);
		if (local23 != null) {
			return local23;
		}
		local23 = Static647.method3292(this.aClass166_1.aClass237_70, this.anInt5695, 0);
		if (local23 != null) {
			this.aClass166_1.aClass236_50.method6241((long) this.anInt5695, local23);
		}
		return local23;
	}
}
