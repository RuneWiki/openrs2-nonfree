import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class330 {

	@OriginalMember(owner = "client!tca", name = "j", descriptor = "Lclient!bh;")
	private Class32 aClass32_77 = new Class32(64);

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "Lclient!wu;")
	private final Class380 aClass380_122;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class330(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_122 = arg2;
		if (this.aClass380_122 != null) {
			@Pc(20) int local20 = this.aClass380_122.method8639() - 1;
			this.aClass380_122.method8631(local20);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
	public void method7449() {
		@Pc(6) Class32 local6 = this.aClass32_77;
		synchronized (this.aClass32_77) {
			this.aClass32_77.method632();
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZ)V")
	public void method7450(@OriginalArg(0) int arg0) {
		@Pc(2) Class32 local2 = this.aClass32_77;
		synchronized (this.aClass32_77) {
			this.aClass32_77.method640();
			this.aClass32_77 = new Class32(arg0);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(II)V")
	public void method7451() {
		@Pc(10) Class32 local10 = this.aClass32_77;
		synchronized (this.aClass32_77) {
			this.aClass32_77.method634(5);
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(II)Lclient!iga;")
	public Class151 method7452(@OriginalArg(0) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_77;
		@Pc(16) Class151 local16;
		synchronized (this.aClass32_77) {
			local16 = (Class151) this.aClass32_77.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_122;
		@Pc(44) byte[] local44;
		synchronized (this.aClass380_122) {
			local44 = this.aClass380_122.method8620(Static197.method2822(arg0), Static594.method8050(arg0));
		}
		local16 = new Class151();
		if (local44 != null) {
			local16.method3203(new Class2_Sub22(local44));
		}
		@Pc(66) Class32 local66 = this.aClass32_77;
		synchronized (this.aClass32_77) {
			this.aClass32_77.method629(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V")
	public void method7454() {
		@Pc(2) Class32 local2 = this.aClass32_77;
		synchronized (this.aClass32_77) {
			this.aClass32_77.method640();
		}
	}
}
