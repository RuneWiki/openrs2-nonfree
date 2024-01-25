import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class173 {

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Lclient!bh;")
	private final Class32 aClass32_45 = new Class32(64);

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "Lclient!bh;")
	private final Class32 aClass32_46 = new Class32(100);

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!wu;")
	private final Class380 aClass380_66;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;Lclient!wu;Lclient!wu;)V")
	public Class173(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2, @OriginalArg(3) Class380 arg3, @OriginalArg(4) Class380 arg4) {
		this.aClass380_66 = arg2;
		if (this.aClass380_66 != null) {
			@Pc(26) int local26 = this.aClass380_66.method8639() - 1;
			this.aClass380_66.method8631(local26);
		}
		Static219.method3015(arg3, arg4);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
	public void method3789() {
		@Pc(2) Class32 local2 = this.aClass32_45;
		synchronized (this.aClass32_45) {
			this.aClass32_45.method640();
		}
		local2 = this.aClass32_46;
		synchronized (this.aClass32_46) {
			this.aClass32_46.method640();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public void method3790() {
		@Pc(2) Class32 local2 = this.aClass32_45;
		synchronized (this.aClass32_45) {
			this.aClass32_45.method634(5);
		}
		local2 = this.aClass32_46;
		synchronized (this.aClass32_46) {
			this.aClass32_46.method634(5);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)Lclient!ec;")
	public Class81 method3791(@OriginalArg(1) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_45;
		@Pc(18) Class81 local18;
		synchronized (this.aClass32_45) {
			local18 = (Class81) this.aClass32_45.method630((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(37) Class380 local37 = this.aClass380_66;
		@Pc(52) byte[] local52;
		synchronized (this.aClass380_66) {
			local52 = this.aClass380_66.method8620(Static404.method5469(arg0), Static269.method3764(arg0));
		}
		local18 = new Class81();
		local18.aClass173_1 = this;
		local18.anInt2138 = arg0;
		if (local52 != null) {
			local18.method1756(new Class2_Sub22(local52));
		}
		local18.method1748();
		@Pc(85) Class32 local85 = this.aClass32_45;
		synchronized (this.aClass32_45) {
			this.aClass32_45.method629(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)Lclient!nea;")
	public Class2_Sub2_Sub15 method3793(@OriginalArg(1) int arg0) {
		@Pc(14) Class32 local14 = this.aClass32_46;
		synchronized (this.aClass32_46) {
			@Pc(24) Class2_Sub2_Sub15 local24 = (Class2_Sub2_Sub15) this.aClass32_46.method630((long) arg0);
			if (local24 == null) {
				local24 = new Class2_Sub2_Sub15(arg0);
				this.aClass32_46.method629(local24, (long) arg0);
			}
			return local24.method5013() ? local24 : null;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public void method3794() {
		@Pc(14) Class32 local14 = this.aClass32_45;
		synchronized (this.aClass32_45) {
			this.aClass32_45.method632();
		}
		local14 = this.aClass32_46;
		synchronized (this.aClass32_46) {
			this.aClass32_46.method632();
		}
	}
}
