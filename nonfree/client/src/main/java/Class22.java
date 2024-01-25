import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class22 {

	@OriginalMember(owner = "client!av", name = "g", descriptor = "Lclient!gw;")
	private final Class136 aClass136_4 = new Class136(64);

	@OriginalMember(owner = "client!av", name = "e", descriptor = "Lclient!uu;")
	private final Class343 aClass343_22;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "Lclient!uu;")
	public final Class343 aClass343_21;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;Lclient!uu;)V")
	public Class22(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Class343 arg3) {
		this.aClass343_22 = arg2;
		this.aClass343_21 = arg3;
		this.aClass343_22.method8157(3);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Lclient!rw;")
	public Class300 method376(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_4;
		@Pc(16) Class300 local16;
		synchronized (this.aClass136_4) {
			local16 = (Class300) this.aClass136_4.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class343 local29 = this.aClass343_22;
		@Pc(38) byte[] local38;
		synchronized (this.aClass343_22) {
			local38 = this.aClass343_22.method8132(3, arg0);
		}
		local16 = new Class300();
		local16.aClass22_2 = this;
		if (local38 != null) {
			local16.method7364(new Class3_Sub9(local38));
		}
		@Pc(71) Class136 local71 = this.aClass136_4;
		synchronized (this.aClass136_4) {
			this.aClass136_4.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(II)V")
	public void method377() {
		@Pc(6) Class136 local6 = this.aClass136_4;
		synchronized (this.aClass136_4) {
			this.aClass136_4.method3132(5);
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
	public void method381() {
		@Pc(2) Class136 local2 = this.aClass136_4;
		synchronized (this.aClass136_4) {
			this.aClass136_4.method3138();
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
	public void method382() {
		@Pc(6) Class136 local6 = this.aClass136_4;
		synchronized (this.aClass136_4) {
			this.aClass136_4.method3142();
		}
	}
}
