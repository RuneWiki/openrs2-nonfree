import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class15 {

	@OriginalMember(owner = "client!au", name = "g", descriptor = "Lclient!wi;")
	private final Class268 aClass268_3 = new Class268(64);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "Lclient!uu;")
	private final Class250 aClass250_9;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class15(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_9 = arg2;
		if (this.aClass250_9 != null) {
			this.aClass250_9.method5815(11);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Lclient!ce;")
	public Class32 method323(@OriginalArg(0) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_3;
		@Pc(16) Class32 local16;
		synchronized (this.aClass268_3) {
			local16 = (Class32) this.aClass268_3.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class250 local38 = this.aClass250_9;
		@Pc(49) byte[] local49;
		synchronized (this.aClass250_9) {
			local49 = this.aClass250_9.method5806(11, arg0);
		}
		local16 = new Class32();
		if (local49 != null) {
			local16.method880(new Class3_Sub25(local49));
		}
		@Pc(73) Class268 local73 = this.aClass268_3;
		synchronized (this.aClass268_3) {
			this.aClass268_3.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(II)V")
	public void method324() {
		@Pc(9) Class268 local9 = this.aClass268_3;
		synchronized (this.aClass268_3) {
			this.aClass268_3.method6173(5);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	public void method326() {
		@Pc(2) Class268 local2 = this.aClass268_3;
		synchronized (this.aClass268_3) {
			this.aClass268_3.method6168();
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
	public void method327() {
		@Pc(2) Class268 local2 = this.aClass268_3;
		synchronized (this.aClass268_3) {
			this.aClass268_3.method6160();
		}
	}
}
