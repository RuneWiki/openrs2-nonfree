import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class236 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "Lclient!oo;")
	private final Class264 aClass264_43 = new Class264(64);

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "Lclient!wia;")
	private final Class386 aClass386_86;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
	public final int anInt6845;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class236(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_86 = arg2;
		this.anInt6845 = this.aClass386_86.method9210(19);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Lclient!kc;")
	public Class195 method5550(@OriginalArg(0) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_43;
		@Pc(16) Class195 local16;
		synchronized (this.aClass264_43) {
			local16 = (Class195) this.aClass264_43.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_86;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_86) {
			local38 = this.aClass386_86.method9196(arg0, 19);
		}
		local16 = new Class195();
		if (local38 != null) {
			local16.method4370(new Class14_Sub29(local38));
		}
		@Pc(60) Class264 local60 = this.aClass264_43;
		synchronized (this.aClass264_43) {
			this.aClass264_43.method6364((long) arg0, local16);
			return local16;
		}
	}
}
