import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class324 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!qr;")
	private final Class293 aClass293_61 = new Class293(64);

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!wu;")
	private final Class384 aClass384_119;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class324(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_119 = arg2;
		this.aClass384_119.method8862(5);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lclient!ci;")
	public Class5_Sub4_Sub3 method7725(@OriginalArg(0) int arg0) {
		@Pc(11) Class293 local11 = this.aClass293_61;
		@Pc(23) Class5_Sub4_Sub3 local23;
		synchronized (this.aClass293_61) {
			local23 = (Class5_Sub4_Sub3) this.aClass293_61.method6921((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class384 local36 = this.aClass384_119;
		@Pc(45) byte[] local45;
		synchronized (this.aClass384_119) {
			local45 = this.aClass384_119.method8885(5, arg0);
		}
		local23 = new Class5_Sub4_Sub3();
		if (local45 != null) {
			local23.method1135(new Class5_Sub12(local45));
		}
		@Pc(67) Class293 local67 = this.aClass293_61;
		synchronized (this.aClass293_61) {
			this.aClass293_61.method6925((long) arg0, local23);
			return local23;
		}
	}
}
