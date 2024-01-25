import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class116 {

	@OriginalMember(owner = "client!it", name = "w", descriptor = "I")
	public int anInt3258;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "Lclient!kh;")
	private final Class134 aClass134_25 = new Class134(64);

	@OriginalMember(owner = "client!it", name = "u", descriptor = "Lclient!kh;")
	public final Class134 aClass134_26 = new Class134(50);

	@OriginalMember(owner = "client!it", name = "v", descriptor = "Lclient!kh;")
	public final Class134 aClass134_27 = new Class134(5);

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Lclient!ul;")
	public final Class246 aClass246_104;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "Lclient!ee;")
	public final Class61 aClass61_6;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "Lclient!ul;")
	private final Class246 aClass246_105;

	@OriginalMember(owner = "client!it", name = "k", descriptor = "Z")
	public boolean aBoolean197;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!ee;IZLclient!ul;Lclient!ul;)V")
	public Class116(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class246 arg3, @OriginalArg(4) Class246 arg4) {
		this.aClass246_104 = arg4;
		this.aClass61_6 = arg0;
		this.aClass246_105 = arg3;
		this.aBoolean197 = arg2;
		if (this.aClass246_105 != null) {
			@Pc(41) int local41 = this.aClass246_105.method5502() - 1;
			this.aClass246_105.method5492(local41);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V")
	public void method2818(@OriginalArg(1) int arg0) {
		this.anInt3258 = arg0;
		@Pc(9) Class134 local9 = this.aClass134_26;
		synchronized (this.aClass134_26) {
			this.aClass134_26.method3272();
		}
		local9 = this.aClass134_27;
		synchronized (this.aClass134_27) {
			this.aClass134_27.method3272();
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V")
	public void method2819() {
		@Pc(2) Class134 local2 = this.aClass134_25;
		synchronized (this.aClass134_25) {
			this.aClass134_25.method3270(5);
		}
		@Pc(30) Class134 local30 = this.aClass134_26;
		synchronized (this.aClass134_26) {
			this.aClass134_26.method3270(5);
		}
		local30 = this.aClass134_27;
		synchronized (this.aClass134_27) {
			this.aClass134_27.method3270(5);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZB)V")
	public void method2821(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean197 != arg0) {
			this.aBoolean197 = arg0;
			this.method2823();
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)Lclient!dm;")
	public Class53 method2822(@OriginalArg(0) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_25;
		@Pc(16) Class53 local16;
		synchronized (this.aClass134_25) {
			local16 = (Class53) this.aClass134_25.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_105;
		@Pc(42) byte[] local42;
		synchronized (this.aClass246_105) {
			local42 = this.aClass246_105.method5477(Static258.method2702(arg0), Static140.method2347(arg0));
		}
		local16 = new Class53();
		local16.aClass116_1 = this;
		local16.lb = arg0;
		if (local42 != null) {
			local16.method1506(new Class1_Sub5(local42));
		}
		local16.method1510();
		@Pc(84) Class134 local84 = this.aClass134_25;
		synchronized (this.aClass134_25) {
			this.aClass134_25.method3263((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	public void method2823() {
		@Pc(2) Class134 local2 = this.aClass134_25;
		synchronized (this.aClass134_25) {
			this.aClass134_25.method3272();
		}
		local2 = this.aClass134_26;
		synchronized (this.aClass134_26) {
			this.aClass134_26.method3272();
		}
		local2 = this.aClass134_27;
		synchronized (this.aClass134_27) {
			this.aClass134_27.method3272();
		}
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
	public void method2824() {
		@Pc(6) Class134 local6 = this.aClass134_25;
		synchronized (this.aClass134_25) {
			this.aClass134_25.method3267();
		}
		local6 = this.aClass134_26;
		synchronized (this.aClass134_26) {
			this.aClass134_26.method3267();
		}
		local6 = this.aClass134_27;
		synchronized (this.aClass134_27) {
			this.aClass134_27.method3267();
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
	public void method2826() {
		@Pc(6) Class134 local6 = this.aClass134_26;
		synchronized (this.aClass134_26) {
			this.aClass134_26.method3272();
		}
		local6 = this.aClass134_27;
		synchronized (this.aClass134_27) {
			this.aClass134_27.method3272();
		}
	}
}
