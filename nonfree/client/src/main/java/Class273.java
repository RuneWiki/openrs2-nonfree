import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class273 {

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Lclient!qr;")
	private Class293 aClass293_51 = new Class293(128);

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Lclient!qr;")
	public Class293 aClass293_52 = new Class293(64);

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Lclient!wu;")
	public final Class384 aClass384_105;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "Lclient!wu;")
	private final Class384 aClass384_106;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;Lclient!wu;)V")
	public Class273(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2, @OriginalArg(3) Class384 arg3) {
		this.aClass384_105 = arg3;
		this.aClass384_106 = arg2;
		this.aClass384_106.method8862(36);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Lclient!dh;")
	public Class72 method6529(@OriginalArg(1) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_51;
		@Pc(16) Class72 local16;
		synchronized (this.aClass293_51) {
			local16 = (Class72) this.aClass293_51.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class384 local35 = this.aClass384_106;
		@Pc(44) byte[] local44;
		synchronized (this.aClass384_106) {
			local44 = this.aClass384_106.method8885(36, arg0);
		}
		local16 = new Class72();
		local16.aClass273_4 = this;
		local16.anInt1519 = arg0;
		if (local44 != null) {
			local16.method1446(new Class5_Sub12(local44));
		}
		local16.method1441();
		@Pc(75) Class293 local75 = this.aClass293_51;
		synchronized (this.aClass293_51) {
			this.aClass293_51.method6925((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)V")
	public void method6530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass293_51 = new Class293(arg0);
		this.aClass293_52 = new Class293(arg1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	public void method6532() {
		@Pc(2) Class293 local2 = this.aClass293_51;
		synchronized (this.aClass293_51) {
			this.aClass293_51.method6922(5);
		}
		local2 = this.aClass293_52;
		synchronized (this.aClass293_52) {
			this.aClass293_52.method6922(5);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	public void method6533() {
		@Pc(6) Class293 local6 = this.aClass293_51;
		synchronized (this.aClass293_51) {
			this.aClass293_51.method6927();
		}
		local6 = this.aClass293_52;
		synchronized (this.aClass293_52) {
			this.aClass293_52.method6927();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public void method6534() {
		@Pc(2) Class293 local2 = this.aClass293_51;
		synchronized (this.aClass293_51) {
			this.aClass293_51.method6930();
		}
		local2 = this.aClass293_52;
		synchronized (this.aClass293_52) {
			this.aClass293_52.method6930();
		}
	}
}
