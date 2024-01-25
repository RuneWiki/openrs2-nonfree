import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class302 {

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
	public int anInt8741;

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "Z")
	public boolean aBoolean618 = false;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "Lclient!fba;")
	private Class102 aClass102_50 = new Class102(64);

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "Lclient!fba;")
	public final Class102 aClass102_51 = new Class102(500);

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "Lclient!fba;")
	public final Class102 aClass102_52 = new Class102(30);

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "Lclient!fba;")
	public final Class102 aClass102_53 = new Class102(50);

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "Z")
	public boolean aBoolean619;

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "Lclient!la;")
	private final Class196 aClass196_105;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "Lclient!la;")
	public final Class196 aClass196_104;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!mp;IZLclient!la;Lclient!la;)V")
	public Class302(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class196 arg3, @OriginalArg(4) Class196 arg4) {
		this.aBoolean619 = arg2;
		this.aClass196_105 = arg3;
		this.aClass196_104 = arg4;
		if (this.aClass196_105 != null) {
			@Pc(47) int local47 = this.aClass196_105.method5125() - 1;
			this.aClass196_105.method5118(local47);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
	public void method7462() {
		@Pc(8) Class102 local8 = this.aClass102_50;
		synchronized (this.aClass102_50) {
			this.aClass102_50.method2680();
		}
		local8 = this.aClass102_51;
		synchronized (this.aClass102_51) {
			this.aClass102_51.method2680();
		}
		local8 = this.aClass102_52;
		synchronized (this.aClass102_52) {
			this.aClass102_52.method2680();
		}
		local8 = this.aClass102_53;
		synchronized (this.aClass102_53) {
			this.aClass102_53.method2680();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZB)V")
	public void method7463(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean618) {
			this.aBoolean618 = arg0;
			this.method7469();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
	public void method7465() {
		@Pc(2) Class102 local2 = this.aClass102_50;
		synchronized (this.aClass102_50) {
			this.aClass102_50.method2668(5);
		}
		local2 = this.aClass102_51;
		synchronized (this.aClass102_51) {
			this.aClass102_51.method2668(5);
		}
		local2 = this.aClass102_52;
		synchronized (this.aClass102_52) {
			this.aClass102_52.method2668(5);
		}
		local2 = this.aClass102_53;
		synchronized (this.aClass102_53) {
			this.aClass102_53.method2668(5);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)Lclient!rq;")
	public Class299 method7466(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_50;
		@Pc(16) Class299 local16;
		synchronized (this.aClass102_50) {
			local16 = (Class299) this.aClass102_50.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class196 local29 = this.aClass196_105;
		@Pc(42) byte[] local42;
		synchronized (this.aClass196_105) {
			local42 = this.aClass196_105.method5102(Static637.method8710(arg0), Static202.method2894(arg0));
		}
		local16 = new Class299();
		local16.aClass302_4 = this;
		local16.anInt8677 = arg0;
		if (local42 != null) {
			local16.method7403(new Class3_Sub3(local42));
		}
		local16.method7407();
		if (local16.aBoolean611) {
			local16.anInt8637 = 0;
			local16.aBoolean605 = false;
		}
		if (!this.aBoolean619 && local16.aBoolean607) {
			local16.aStringArray32 = null;
			local16.anIntArray537 = null;
		}
		@Pc(94) Class102 local94 = this.aClass102_50;
		synchronized (this.aClass102_50) {
			this.aClass102_50.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V")
	public void method7467(@OriginalArg(1) int arg0) {
		this.aClass102_50 = new Class102(arg0);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)V")
	public void method7468(@OriginalArg(1) int arg0) {
		this.anInt8741 = arg0;
		@Pc(9) Class102 local9 = this.aClass102_51;
		synchronized (this.aClass102_51) {
			this.aClass102_51.method2681();
		}
		local9 = this.aClass102_52;
		synchronized (this.aClass102_52) {
			this.aClass102_52.method2681();
		}
		local9 = this.aClass102_53;
		synchronized (this.aClass102_53) {
			this.aClass102_53.method2681();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	public void method7469() {
		@Pc(6) Class102 local6 = this.aClass102_50;
		synchronized (this.aClass102_50) {
			this.aClass102_50.method2681();
		}
		@Pc(29) Class102 local29 = this.aClass102_51;
		synchronized (this.aClass102_51) {
			this.aClass102_51.method2681();
		}
		local29 = this.aClass102_52;
		synchronized (this.aClass102_52) {
			this.aClass102_52.method2681();
		}
		local29 = this.aClass102_53;
		synchronized (this.aClass102_53) {
			this.aClass102_53.method2681();
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(ZB)V")
	public void method7470(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean619 != arg0) {
			this.aBoolean619 = arg0;
			this.method7469();
		}
	}
}
