import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class298 {

	@OriginalMember(owner = "client!up", name = "v", descriptor = "I")
	public int anInt8759;

	@OriginalMember(owner = "client!up", name = "m", descriptor = "Z")
	public boolean aBoolean650 = false;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Lclient!hp;")
	private Class125 aClass125_58 = new Class125(64);

	@OriginalMember(owner = "client!up", name = "s", descriptor = "Lclient!hp;")
	public final Class125 aClass125_59 = new Class125(500);

	@OriginalMember(owner = "client!up", name = "t", descriptor = "Lclient!hp;")
	public final Class125 aClass125_60 = new Class125(30);

	@OriginalMember(owner = "client!up", name = "u", descriptor = "Lclient!hp;")
	public final Class125 aClass125_61 = new Class125(50);

	@OriginalMember(owner = "client!up", name = "d", descriptor = "Lclient!kea;")
	public final Class161 aClass161_111;

	@OriginalMember(owner = "client!up", name = "r", descriptor = "Lclient!kea;")
	private final Class161 aClass161_112;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Z")
	public boolean aBoolean649;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!cda;IZLclient!kea;Lclient!kea;)V")
	public Class298(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class161 arg3, @OriginalArg(4) Class161 arg4) {
		this.aClass161_111 = arg4;
		this.aClass161_112 = arg3;
		this.aBoolean649 = arg2;
		if (this.aClass161_112 != null) {
			@Pc(47) int local47 = this.aClass161_112.method4239() - 1;
			this.aClass161_112.method4266(local47);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IZ)V")
	public void method7182(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean649) {
			this.aBoolean649 = arg0;
			this.method7183();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
	public void method7183() {
		@Pc(2) Class125 local2 = this.aClass125_58;
		synchronized (this.aClass125_58) {
			this.aClass125_58.method3521();
		}
		local2 = this.aClass125_59;
		synchronized (this.aClass125_59) {
			this.aClass125_59.method3521();
		}
		local2 = this.aClass125_60;
		synchronized (this.aClass125_60) {
			this.aClass125_60.method3521();
		}
		local2 = this.aClass125_61;
		synchronized (this.aClass125_61) {
			this.aClass125_61.method3521();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Lclient!qd;")
	public Class242 method7185(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_58;
		@Pc(16) Class242 local16;
		synchronized (this.aClass125_58) {
			local16 = (Class242) this.aClass125_58.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_112;
		@Pc(42) byte[] local42;
		synchronized (this.aClass161_112) {
			local42 = this.aClass161_112.method4243(Static249.method4288(arg0), Static245.method4231(arg0));
		}
		local16 = new Class242();
		local16.lb = this;
		local16.anInt7168 = arg0;
		if (local42 != null) {
			local16.method5978(new Class3_Sub27(local42));
		}
		local16.method5986();
		if (local16.aBoolean484) {
			local16.anInt7176 = 0;
			local16.aBoolean478 = false;
		}
		if (!this.aBoolean649 && local16.aBoolean483) {
			local16.anIntArray636 = null;
			local16.aStringArray43 = null;
		}
		@Pc(100) Class125 local100 = this.aClass125_58;
		synchronized (this.aClass125_58) {
			this.aClass125_58.method3519((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BZ)V")
	public void method7187(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean650) {
			this.aBoolean650 = arg0;
			this.method7183();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)V")
	public void method7188(@OriginalArg(0) int arg0) {
		this.aClass125_58 = new Class125(arg0);
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(II)V")
	public void method7189(@OriginalArg(1) int arg0) {
		this.anInt8759 = arg0;
		@Pc(9) Class125 local9 = this.aClass125_59;
		synchronized (this.aClass125_59) {
			this.aClass125_59.method3521();
		}
		local9 = this.aClass125_60;
		synchronized (this.aClass125_60) {
			this.aClass125_60.method3521();
		}
		local9 = this.aClass125_61;
		synchronized (this.aClass125_61) {
			this.aClass125_61.method3521();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	public void method7190() {
		@Pc(6) Class125 local6 = this.aClass125_58;
		synchronized (this.aClass125_58) {
			this.aClass125_58.method3516();
		}
		local6 = this.aClass125_59;
		synchronized (this.aClass125_59) {
			this.aClass125_59.method3516();
		}
		local6 = this.aClass125_60;
		synchronized (this.aClass125_60) {
			this.aClass125_60.method3516();
		}
		local6 = this.aClass125_61;
		synchronized (this.aClass125_61) {
			this.aClass125_61.method3516();
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(IB)V")
	public void method7191() {
		@Pc(2) Class125 local2 = this.aClass125_58;
		synchronized (this.aClass125_58) {
			this.aClass125_58.method3522(5);
		}
		local2 = this.aClass125_59;
		synchronized (this.aClass125_59) {
			this.aClass125_59.method3522(5);
		}
		local2 = this.aClass125_60;
		synchronized (this.aClass125_60) {
			this.aClass125_60.method3522(5);
		}
		local2 = this.aClass125_61;
		synchronized (this.aClass125_61) {
			this.aClass125_61.method3522(5);
		}
	}
}
