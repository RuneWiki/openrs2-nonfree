import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class116 {

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "Lclient!ge;")
	private Class83 aClass83_25 = new Class83(128);

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "Lclient!ge;")
	public Class83 aClass83_26 = new Class83(64);

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "Lclient!ci;")
	private final Class38 aClass38_36;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "Lclient!ci;")
	public final Class38 aClass38_35;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;Lclient!ci;)V")
	public Class116(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) Class38 arg3) {
		this.aClass38_36 = arg2;
		this.aClass38_35 = arg3;
		this.aClass38_36.method1032(36);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
	public void method3295() {
		@Pc(6) Class83 local6 = this.aClass83_25;
		synchronized (this.aClass83_25) {
			this.aClass83_25.method2336();
		}
		local6 = this.aClass83_26;
		synchronized (this.aClass83_26) {
			this.aClass83_26.method2336();
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BI)V")
	public void method3297() {
		@Pc(2) Class83 local2 = this.aClass83_25;
		synchronized (this.aClass83_25) {
			this.aClass83_25.method2345(5);
		}
		local2 = this.aClass83_26;
		synchronized (this.aClass83_26) {
			this.aClass83_26.method2345(5);
		}
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V")
	public void method3299() {
		@Pc(6) Class83 local6 = this.aClass83_25;
		synchronized (this.aClass83_25) {
			this.aClass83_25.method2346();
		}
		local6 = this.aClass83_26;
		synchronized (this.aClass83_26) {
			this.aClass83_26.method2346();
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)Lclient!rg;")
	public Class217 method3300(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_25;
		@Pc(18) Class217 local18;
		synchronized (this.aClass83_25) {
			local18 = (Class217) this.aClass83_25.method2338((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class38 local31 = this.aClass38_36;
		@Pc(40) byte[] local40;
		synchronized (this.aClass38_36) {
			local40 = this.aClass38_36.method1039(arg0, 36);
		}
		local18 = new Class217();
		local18.anInt6172 = arg0;
		local18.aClass116_4 = this;
		if (local40 != null) {
			local18.method5085(new Class4_Sub20(local40));
		}
		local18.method5086();
		@Pc(71) Class83 local71 = this.aClass83_25;
		synchronized (this.aClass83_25) {
			this.aClass83_25.method2337(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)V")
	public void method3301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass83_25 = new Class83(arg1);
		this.aClass83_26 = new Class83(arg0);
	}
}
