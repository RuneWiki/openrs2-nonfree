import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class284 {

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
	public int anInt7999;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "Z")
	public boolean aBoolean572 = false;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "Lclient!gw;")
	private Class136 aClass136_51 = new Class136(64);

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "Lclient!gw;")
	public final Class136 aClass136_52 = new Class136(500);

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "Lclient!gw;")
	public final Class136 aClass136_53 = new Class136(30);

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!gw;")
	public final Class136 aClass136_54 = new Class136(50);

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "Z")
	public boolean aBoolean571;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!uu;")
	public final Class343 aClass343_218;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "Lclient!uu;")
	private final Class343 aClass343_219;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!gp;IZLclient!uu;Lclient!uu;)V")
	public Class284(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class343 arg3, @OriginalArg(4) Class343 arg4) {
		this.aBoolean571 = arg2;
		this.aClass343_218 = arg4;
		this.aClass343_219 = arg3;
		if (this.aClass343_219 != null) {
			@Pc(47) int local47 = this.aClass343_219.method8144() - 1;
			this.aClass343_219.method8157(local47);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)V")
	public void method6908(@OriginalArg(1) int arg0) {
		this.anInt7999 = arg0;
		@Pc(9) Class136 local9 = this.aClass136_52;
		synchronized (this.aClass136_52) {
			this.aClass136_52.method3142();
		}
		local9 = this.aClass136_53;
		synchronized (this.aClass136_53) {
			this.aClass136_53.method3142();
		}
		local9 = this.aClass136_54;
		synchronized (this.aClass136_54) {
			this.aClass136_54.method3142();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public void method6910() {
		@Pc(6) Class136 local6 = this.aClass136_51;
		synchronized (this.aClass136_51) {
			this.aClass136_51.method3142();
		}
		local6 = this.aClass136_52;
		synchronized (this.aClass136_52) {
			this.aClass136_52.method3142();
		}
		local6 = this.aClass136_53;
		synchronized (this.aClass136_53) {
			this.aClass136_53.method3142();
		}
		local6 = this.aClass136_54;
		synchronized (this.aClass136_54) {
			this.aClass136_54.method3142();
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	public void method6911() {
		@Pc(2) Class136 local2 = this.aClass136_51;
		synchronized (this.aClass136_51) {
			this.aClass136_51.method3138();
		}
		local2 = this.aClass136_52;
		synchronized (this.aClass136_52) {
			this.aClass136_52.method3138();
		}
		local2 = this.aClass136_53;
		synchronized (this.aClass136_53) {
			this.aClass136_53.method3138();
		}
		local2 = this.aClass136_54;
		synchronized (this.aClass136_54) {
			this.aClass136_54.method3138();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V")
	public void method6912(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean572) {
			this.aBoolean572 = arg0;
			this.method6910();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZB)V")
	public void method6913(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean571 != arg0) {
			this.aBoolean571 = arg0;
			this.method6910();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
	public void method6914(@OriginalArg(1) int arg0) {
		this.aClass136_51 = new Class136(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Lclient!ts;")
	public Class330 method6915(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_51;
		@Pc(16) Class330 local16;
		synchronized (this.aClass136_51) {
			local16 = (Class330) this.aClass136_51.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class343 local29 = this.aClass343_219;
		@Pc(42) byte[] local42;
		synchronized (this.aClass343_219) {
			local42 = this.aClass343_219.method8132(Static402.method6296(arg0), Static279.method4562(arg0));
		}
		local16 = new Class330();
		local16.aClass284_4 = this;
		local16.anInt9240 = arg0;
		if (local42 != null) {
			local16.method7885(new Class3_Sub9(local42));
		}
		local16.method7899();
		if (!this.aBoolean571 && local16.aBoolean682) {
			local16.anIntArray577 = null;
			local16.aStringArray74 = null;
		}
		if (local16.aBoolean684) {
			local16.anInt9191 = 0;
			local16.aBoolean680 = false;
		}
		@Pc(100) Class136 local100 = this.aClass136_51;
		synchronized (this.aClass136_51) {
			this.aClass136_51.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(ZI)V")
	public void method6916() {
		@Pc(6) Class136 local6 = this.aClass136_51;
		synchronized (this.aClass136_51) {
			this.aClass136_51.method3132(5);
		}
		local6 = this.aClass136_52;
		synchronized (this.aClass136_52) {
			this.aClass136_52.method3132(5);
		}
		local6 = this.aClass136_53;
		synchronized (this.aClass136_53) {
			this.aClass136_53.method3132(5);
		}
		local6 = this.aClass136_54;
		synchronized (this.aClass136_54) {
			this.aClass136_54.method3132(5);
		}
	}
}
