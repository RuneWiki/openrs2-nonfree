import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class154 {

	@OriginalMember(owner = "client!js", name = "p", descriptor = "I")
	public int anInt4964;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "Lclient!hp;")
	private final Class125 aClass125_33 = new Class125(64);

	@OriginalMember(owner = "client!js", name = "n", descriptor = "Lclient!hp;")
	public final Class125 aClass125_34 = new Class125(50);

	@OriginalMember(owner = "client!js", name = "o", descriptor = "Lclient!hp;")
	public final Class125 aClass125_35 = new Class125(5);

	@OriginalMember(owner = "client!js", name = "f", descriptor = "Lclient!kea;")
	public final Class161 aClass161_52;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "Z")
	public boolean aBoolean345;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "Lclient!cda;")
	public final Class44 aClass44_3;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "Lclient!kea;")
	private final Class161 aClass161_53;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!cda;IZLclient!kea;Lclient!kea;)V")
	public Class154(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class161 arg3, @OriginalArg(4) Class161 arg4) {
		this.aClass161_52 = arg4;
		this.aBoolean345 = arg2;
		this.aClass44_3 = arg0;
		this.aClass161_53 = arg3;
		if (this.aClass161_53 != null) {
			@Pc(41) int local41 = this.aClass161_53.method4239() - 1;
			this.aClass161_53.method4266(local41);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
	public void method4156() {
		@Pc(2) Class125 local2 = this.aClass125_33;
		synchronized (this.aClass125_33) {
			this.aClass125_33.method3516();
		}
		local2 = this.aClass125_34;
		synchronized (this.aClass125_34) {
			this.aClass125_34.method3516();
		}
		local2 = this.aClass125_35;
		synchronized (this.aClass125_35) {
			this.aClass125_35.method3516();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Lclient!pl;")
	public Class230 method4157(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_33;
		@Pc(16) Class230 local16;
		synchronized (this.aClass125_33) {
			local16 = (Class230) this.aClass125_33.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_53;
		@Pc(50) byte[] local50;
		synchronized (this.aClass161_53) {
			local50 = this.aClass161_53.method4243(Static80.method1630(arg0), Static407.method6159(arg0));
		}
		local16 = new Class230();
		local16.aClass154_2 = this;
		local16.anInt7036 = arg0;
		if (local50 != null) {
			local16.method5896(new Class3_Sub27(local50));
		}
		local16.method5893();
		@Pc(81) Class125 local81 = this.aClass125_33;
		synchronized (this.aClass125_33) {
			this.aClass125_33.method3519((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(II)V")
	public void method4158(@OriginalArg(1) int arg0) {
		this.anInt4964 = arg0;
		@Pc(9) Class125 local9 = this.aClass125_34;
		synchronized (this.aClass125_34) {
			this.aClass125_34.method3521();
		}
		local9 = this.aClass125_35;
		synchronized (this.aClass125_35) {
			this.aClass125_35.method3521();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public void method4159() {
		@Pc(2) Class125 local2 = this.aClass125_33;
		synchronized (this.aClass125_33) {
			this.aClass125_33.method3521();
		}
		local2 = this.aClass125_34;
		synchronized (this.aClass125_34) {
			this.aClass125_34.method3521();
		}
		local2 = this.aClass125_35;
		synchronized (this.aClass125_35) {
			this.aClass125_35.method3521();
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	public void method4160() {
		@Pc(2) Class125 local2 = this.aClass125_34;
		synchronized (this.aClass125_34) {
			this.aClass125_34.method3521();
		}
		local2 = this.aClass125_35;
		synchronized (this.aClass125_35) {
			this.aClass125_35.method3521();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZI)V")
	public void method4161(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean345 != arg0) {
			this.aBoolean345 = arg0;
			this.method4159();
		}
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(II)V")
	public void method4163() {
		@Pc(2) Class125 local2 = this.aClass125_33;
		synchronized (this.aClass125_33) {
			this.aClass125_33.method3522(5);
		}
		local2 = this.aClass125_34;
		synchronized (this.aClass125_34) {
			this.aClass125_34.method3522(5);
		}
		local2 = this.aClass125_35;
		synchronized (this.aClass125_35) {
			this.aClass125_35.method3522(5);
		}
	}
}
