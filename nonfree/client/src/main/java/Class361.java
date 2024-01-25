import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class361 {

	@OriginalMember(owner = "client!wfa", name = "w", descriptor = "I")
	public int anInt9500;

	@OriginalMember(owner = "client!wfa", name = "s", descriptor = "Lclient!au;")
	private final Class21 aClass21_99 = new Class21(64);

	@OriginalMember(owner = "client!wfa", name = "t", descriptor = "Lclient!au;")
	public final Class21 aClass21_100 = new Class21(50);

	@OriginalMember(owner = "client!wfa", name = "v", descriptor = "Lclient!au;")
	public final Class21 aClass21_101 = new Class21(5);

	@OriginalMember(owner = "client!wfa", name = "q", descriptor = "Lclient!mv;")
	private final Class229 aClass229_132;

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "Lclient!mv;")
	public final Class229 aClass229_131;

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "Z")
	public boolean aBoolean790;

	@OriginalMember(owner = "client!wfa", name = "r", descriptor = "Lclient!sea;")
	public final Class308 aClass308_11;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lclient!sea;IZLclient!mv;Lclient!mv;)V")
	public Class361(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class229 arg3, @OriginalArg(4) Class229 arg4) {
		this.aClass229_132 = arg3;
		this.aClass229_131 = arg4;
		this.aBoolean790 = arg2;
		this.aClass308_11 = arg0;
		if (this.aClass229_132 != null) {
			@Pc(41) int local41 = this.aClass229_132.method4952() - 1;
			this.aClass229_132.method4981(local41);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Z)V")
	public void method7580() {
		@Pc(8) Class21 local8 = this.aClass21_99;
		synchronized (this.aClass21_99) {
			this.aClass21_99.method314();
		}
		local8 = this.aClass21_100;
		synchronized (this.aClass21_100) {
			this.aClass21_100.method314();
		}
		local8 = this.aClass21_101;
		synchronized (this.aClass21_101) {
			this.aClass21_101.method314();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZ)Lclient!rda;")
	public Class295 method7581(@OriginalArg(0) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_99;
		@Pc(16) Class295 local16;
		synchronized (this.aClass21_99) {
			local16 = (Class295) this.aClass21_99.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class229 local29 = this.aClass229_132;
		@Pc(42) byte[] local42;
		synchronized (this.aClass229_132) {
			local42 = this.aClass229_132.method4980(Static14.method240(arg0), Static111.method1643(arg0));
		}
		local16 = new Class295();
		local16.aClass361_2 = this;
		local16.anInt7325 = arg0;
		if (local42 != null) {
			local16.method5937(new Class2_Sub7(local42));
		}
		local16.method5936();
		@Pc(79) Class21 local79 = this.aClass21_99;
		synchronized (this.aClass21_99) {
			this.aClass21_99.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V")
	public void method7582() {
		@Pc(12) Class21 local12 = this.aClass21_99;
		synchronized (this.aClass21_99) {
			this.aClass21_99.method313();
		}
		local12 = this.aClass21_100;
		synchronized (this.aClass21_100) {
			this.aClass21_100.method313();
		}
		local12 = this.aClass21_101;
		synchronized (this.aClass21_101) {
			this.aClass21_101.method313();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V")
	public void method7583() {
		@Pc(6) Class21 local6 = this.aClass21_100;
		synchronized (this.aClass21_100) {
			this.aClass21_100.method313();
		}
		local6 = this.aClass21_101;
		synchronized (this.aClass21_101) {
			this.aClass21_101.method313();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)V")
	public void method7584() {
		@Pc(6) Class21 local6 = this.aClass21_99;
		synchronized (this.aClass21_99) {
			this.aClass21_99.method323(5);
		}
		local6 = this.aClass21_100;
		synchronized (this.aClass21_100) {
			this.aClass21_100.method323(5);
		}
		local6 = this.aClass21_101;
		synchronized (this.aClass21_101) {
			this.aClass21_101.method323(5);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)V")
	public void method7585(@OriginalArg(0) int arg0) {
		this.anInt9500 = arg0;
		@Pc(13) Class21 local13 = this.aClass21_100;
		synchronized (this.aClass21_100) {
			this.aClass21_100.method313();
		}
		local13 = this.aClass21_101;
		synchronized (this.aClass21_101) {
			this.aClass21_101.method313();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZZ)V")
	public void method7587(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean790) {
			this.aBoolean790 = arg0;
			this.method7582();
		}
	}
}
