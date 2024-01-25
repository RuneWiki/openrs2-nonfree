import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class242 {

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "Lclient!wi;")
	private final Class268 aClass268_56 = new Class268(64);

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "Lclient!uu;")
	private final Class250 aClass250_96;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
	public final int anInt6660;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class242(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_96 = arg2;
		this.anInt6660 = this.aClass250_96.method5815(19);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)Lclient!gb;")
	public Class83 method5517(@OriginalArg(0) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_56;
		@Pc(16) Class83 local16;
		synchronized (this.aClass268_56) {
			local16 = (Class83) this.aClass268_56.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class250 local37 = this.aClass250_96;
		@Pc(48) byte[] local48;
		synchronized (this.aClass250_96) {
			local48 = this.aClass250_96.method5806(19, arg0);
		}
		local16 = new Class83();
		if (local48 != null) {
			local16.method1979(new Class3_Sub25(local48));
		}
		@Pc(70) Class268 local70 = this.aClass268_56;
		synchronized (this.aClass268_56) {
			this.aClass268_56.method6164(local16, (long) arg0);
			return local16;
		}
	}
}
