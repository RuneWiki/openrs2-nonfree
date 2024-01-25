import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class153 {

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
	public int anInt3787;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!tl;")
	private Class227 aClass227_24 = new Class227(64);

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!tl;")
	public final Class227 aClass227_25 = new Class227(500);

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Lclient!tl;")
	public final Class227 aClass227_26 = new Class227(30);

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "Lclient!tl;")
	public final Class227 aClass227_27 = new Class227(50);

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Lclient!ui;")
	public final Class230 aClass230_55;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Z")
	public boolean aBoolean368;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Lclient!ui;")
	private final Class230 aClass230_54;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!gp;IZLclient!ui;Lclient!ui;)V")
	public Class153(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class230 arg3, @OriginalArg(4) Class230 arg4) {
		this.aClass230_55 = arg4;
		this.aBoolean368 = arg2;
		this.aClass230_54 = arg3;
		if (this.aClass230_54 != null) {
			@Pc(47) int local47 = this.aClass230_54.method4969() - 1;
			this.aClass230_54.method4956(local47);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public void method3079() {
		@Pc(2) Class227 local2 = this.aClass227_24;
		synchronized (this.aClass227_24) {
			this.aClass227_24.method4858();
		}
		local2 = this.aClass227_25;
		synchronized (this.aClass227_25) {
			this.aClass227_25.method4858();
		}
		local2 = this.aClass227_26;
		synchronized (this.aClass227_26) {
			this.aClass227_26.method4858();
		}
		local2 = this.aClass227_27;
		synchronized (this.aClass227_27) {
			this.aClass227_27.method4858();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public void method3080(@OriginalArg(0) int arg0) {
		this.anInt3787 = arg0;
		@Pc(17) Class227 local17 = this.aClass227_25;
		synchronized (this.aClass227_25) {
			this.aClass227_25.method4871();
		}
		local17 = this.aClass227_26;
		synchronized (this.aClass227_26) {
			this.aClass227_26.method4871();
		}
		local17 = this.aClass227_27;
		synchronized (this.aClass227_27) {
			this.aClass227_27.method4871();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Lclient!vc;")
	public Class236 method3081(@OriginalArg(1) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_24;
		@Pc(16) Class236 local16;
		synchronized (this.aClass227_24) {
			local16 = (Class236) this.aClass227_24.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass230_54.method4985(Static133.method1957(arg0), Static285.method4333(arg0));
		local16 = new Class236();
		local16.anInt5911 = arg0;
		local16.aClass153_4 = this;
		if (local37 != null) {
			local16.method5083(new Class1_Sub33(local37));
		}
		local16.method5073();
		if (local16.aBoolean545) {
			local16.aBoolean540 = false;
			local16.anInt5925 = 0;
		}
		if (!this.aBoolean368 && local16.aBoolean551) {
			local16.aStringArray81 = null;
			local16.anIntArray707 = null;
		}
		@Pc(88) Class227 local88 = this.aClass227_24;
		synchronized (this.aClass227_24) {
			this.aClass227_24.method4865(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
	public void method3082(@OriginalArg(1) int arg0) {
		this.aClass227_24 = new Class227(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V")
	public void method3084() {
		@Pc(6) Class227 local6 = this.aClass227_24;
		synchronized (this.aClass227_24) {
			this.aClass227_24.method4859(5);
		}
		local6 = this.aClass227_25;
		synchronized (this.aClass227_25) {
			this.aClass227_25.method4859(5);
		}
		local6 = this.aClass227_26;
		synchronized (this.aClass227_26) {
			this.aClass227_26.method4859(5);
		}
		local6 = this.aClass227_27;
		synchronized (this.aClass227_27) {
			this.aClass227_27.method4859(5);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZB)V")
	public void method3086(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean368) {
			this.aBoolean368 = arg0;
			this.method3088();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZ)V")
	public void method3087(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean369 != arg0) {
			this.aBoolean369 = arg0;
			this.method3088();
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public void method3088() {
		@Pc(6) Class227 local6 = this.aClass227_24;
		synchronized (this.aClass227_24) {
			this.aClass227_24.method4871();
		}
		local6 = this.aClass227_25;
		synchronized (this.aClass227_25) {
			this.aClass227_25.method4871();
		}
		local6 = this.aClass227_26;
		synchronized (this.aClass227_26) {
			this.aClass227_26.method4871();
		}
		local6 = this.aClass227_27;
		synchronized (this.aClass227_27) {
			this.aClass227_27.method4871();
		}
	}
}
