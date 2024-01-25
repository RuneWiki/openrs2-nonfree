import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class186 {

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
	public int anInt5358;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "Lclient!ge;")
	private final Class83 aClass83_35 = new Class83(64);

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "Lclient!ge;")
	public final Class83 aClass83_36 = new Class83(30);

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "Lclient!ci;")
	public final Class38 aClass38_58;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Lclient!ci;")
	private final Class38 aClass38_57;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;Lclient!ci;)V")
	public Class186(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) Class38 arg3) {
		this.aClass38_58 = arg3;
		this.aClass38_57 = arg2;
		@Pc(26) int local26 = this.aClass38_57.method1035() - 1;
		this.aClass38_57.method1032(local26);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	public void method4457() {
		@Pc(6) Class83 local6 = this.aClass83_35;
		synchronized (this.aClass83_35) {
			this.aClass83_35.method2346();
		}
		local6 = this.aClass83_36;
		synchronized (this.aClass83_36) {
			this.aClass83_36.method2346();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)V")
	public void method4460() {
		@Pc(2) Class83 local2 = this.aClass83_35;
		synchronized (this.aClass83_35) {
			this.aClass83_35.method2345(5);
		}
		local2 = this.aClass83_36;
		synchronized (this.aClass83_36) {
			this.aClass83_36.method2345(5);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)Lclient!lq;")
	public Class149 method4462(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_35;
		@Pc(16) Class149 local16;
		synchronized (this.aClass83_35) {
			local16 = (Class149) this.aClass83_35.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class38 local34 = this.aClass38_57;
		@Pc(47) byte[] local47;
		synchronized (this.aClass38_57) {
			local47 = this.aClass38_57.method1039(Static268.method4313(arg0), Static95.method1841(arg0));
		}
		local16 = new Class149();
		local16.aClass186_2 = this;
		local16.anInt4583 = arg0;
		if (local47 != null) {
			local16.method3920(new Class4_Sub20(local47));
		}
		@Pc(75) Class83 local75 = this.aClass83_35;
		synchronized (this.aClass83_35) {
			this.aClass83_35.method2337(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V")
	public void method4464(@OriginalArg(1) int arg0) {
		this.anInt5358 = arg0;
		@Pc(15) Class83 local15 = this.aClass83_36;
		synchronized (this.aClass83_36) {
			this.aClass83_36.method2346();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	public void method4465() {
		@Pc(2) Class83 local2 = this.aClass83_35;
		synchronized (this.aClass83_35) {
			this.aClass83_35.method2336();
		}
		local2 = this.aClass83_36;
		synchronized (this.aClass83_36) {
			this.aClass83_36.method2336();
		}
	}
}
