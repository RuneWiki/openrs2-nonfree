import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class214 {

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Lclient!gw;")
	private final Class136 aClass136_39 = new Class136(64);

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "Lclient!uu;")
	private final Class343 aClass343_161;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class214(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_161 = arg2;
		if (this.aClass343_161 != null) {
			this.aClass343_161.method8157(11);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Lclient!fia;")
	public Class108 method5419(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_39;
		@Pc(16) Class108 local16;
		synchronized (this.aClass136_39) {
			local16 = (Class108) this.aClass136_39.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class343 local29 = this.aClass343_161;
		@Pc(38) byte[] local38;
		synchronized (this.aClass343_161) {
			local38 = this.aClass343_161.method8132(11, arg0);
		}
		local16 = new Class108();
		if (local38 != null) {
			local16.method2737(new Class3_Sub9(local38));
		}
		@Pc(60) Class136 local60 = this.aClass136_39;
		synchronized (this.aClass136_39) {
			this.aClass136_39.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)V")
	public void method5420() {
		@Pc(2) Class136 local2 = this.aClass136_39;
		synchronized (this.aClass136_39) {
			this.aClass136_39.method3132(5);
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V")
	public void method5421() {
		@Pc(6) Class136 local6 = this.aClass136_39;
		synchronized (this.aClass136_39) {
			this.aClass136_39.method3142();
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
	public void method5423() {
		@Pc(10) Class136 local10 = this.aClass136_39;
		synchronized (this.aClass136_39) {
			this.aClass136_39.method3138();
		}
	}
}
