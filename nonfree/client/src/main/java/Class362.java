import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class362 {

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "Lclient!gw;")
	private final Class136 aClass136_69 = new Class136(64);

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "Lclient!uu;")
	private final Class343 aClass343_264;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class362(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_264 = arg2;
		this.aClass343_264.method8157(31);
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)V")
	public void method8371() {
		@Pc(2) Class136 local2 = this.aClass136_69;
		synchronized (this.aClass136_69) {
			this.aClass136_69.method3132(5);
		}
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(II)Lclient!rfa;")
	public Class292 method8372(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_69;
		@Pc(16) Class292 local16;
		synchronized (this.aClass136_69) {
			local16 = (Class292) this.aClass136_69.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class343 local29 = this.aClass343_264;
		@Pc(38) byte[] local38;
		synchronized (this.aClass343_264) {
			local38 = this.aClass343_264.method8132(31, arg0);
		}
		local16 = new Class292();
		if (local38 != null) {
			local16.method7206(new Class3_Sub9(local38));
		}
		@Pc(60) Class136 local60 = this.aClass136_69;
		synchronized (this.aClass136_69) {
			this.aClass136_69.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
	public void method8374() {
		@Pc(6) Class136 local6 = this.aClass136_69;
		synchronized (this.aClass136_69) {
			this.aClass136_69.method3142();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)V")
	public void method8377() {
		@Pc(12) Class136 local12 = this.aClass136_69;
		synchronized (this.aClass136_69) {
			this.aClass136_69.method3138();
		}
	}
}
