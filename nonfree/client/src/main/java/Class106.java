import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class106 {

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
	public int anInt2857;

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_37 = new Class307(64);

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "Lclient!qfa;")
	public final Class307 aClass307_38 = new Class307(60);

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "Lclient!ik;")
	private final Class182 aClass182_43;

	@OriginalMember(owner = "client!faa", name = "k", descriptor = "Lclient!ik;")
	public final Class182 aClass182_42;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;Lclient!ik;)V")
	public Class106(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class182 arg3) {
		this.aClass182_43 = arg2;
		this.aClass182_42 = arg3;
		@Pc(26) int local26 = this.aClass182_43.method3956() - 1;
		this.aClass182_43.method3970(local26);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
	public void method2614() {
		@Pc(7) Class307 local7 = this.aClass307_37;
		synchronized (this.aClass307_37) {
			this.aClass307_37.method7006();
		}
		local7 = this.aClass307_38;
		synchronized (this.aClass307_38) {
			this.aClass307_38.method7006();
		}
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(II)V")
	public void method2615() {
		@Pc(9) Class307 local9 = this.aClass307_37;
		synchronized (this.aClass307_37) {
			this.aClass307_37.method6995(5);
		}
		local9 = this.aClass307_38;
		synchronized (this.aClass307_38) {
			this.aClass307_38.method6995(5);
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(BI)V")
	public void method2616(@OriginalArg(1) int arg0) {
		this.anInt2857 = arg0;
		@Pc(9) Class307 local9 = this.aClass307_38;
		synchronized (this.aClass307_38) {
			this.aClass307_38.method7006();
		}
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(II)Lclient!gi;")
	public Class139 method2618(@OriginalArg(1) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_37;
		@Pc(18) Class139 local18;
		synchronized (this.aClass307_37) {
			local18 = (Class139) this.aClass307_37.method7002((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class182 local32 = this.aClass182_43;
		@Pc(45) byte[] local45;
		synchronized (this.aClass182_43) {
			local45 = this.aClass182_43.method3985(Static432.method5717(arg0), Static354.method4971(arg0));
		}
		local18 = new Class139();
		local18.anInt3456 = arg0;
		local18.aClass106_1 = this;
		if (local45 != null) {
			local18.method3145(new Class3_Sub2(local45));
		}
		@Pc(83) Class307 local83 = this.aClass307_37;
		synchronized (this.aClass307_37) {
			this.aClass307_37.method7000(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V")
	public void method2619() {
		@Pc(11) Class307 local11 = this.aClass307_37;
		synchronized (this.aClass307_37) {
			this.aClass307_37.method6998();
		}
		local11 = this.aClass307_38;
		synchronized (this.aClass307_38) {
			this.aClass307_38.method6998();
		}
	}
}
