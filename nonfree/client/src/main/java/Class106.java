import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class106 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!bh;")
	private final Class32 aClass32_22 = new Class32(64);

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!wu;")
	private final Class380 aClass380_41;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public final int anInt2695;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class106(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_41 = arg2;
		if (this.aClass380_41 == null) {
			this.anInt2695 = 0;
		} else {
			this.anInt2695 = this.aClass380_41.method8631(16);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public void method2245() {
		@Pc(14) Class32 local14 = this.aClass32_22;
		synchronized (this.aClass32_22) {
			this.aClass32_22.method632();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public void method2247() {
		@Pc(2) Class32 local2 = this.aClass32_22;
		synchronized (this.aClass32_22) {
			this.aClass32_22.method634(5);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)Lclient!rc;")
	public Class296 method2248(@OriginalArg(1) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_22;
		@Pc(16) Class296 local16;
		synchronized (this.aClass32_22) {
			local16 = (Class296) this.aClass32_22.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_41;
		@Pc(38) byte[] local38;
		synchronized (this.aClass380_41) {
			local38 = this.aClass380_41.method8620(16, arg0);
		}
		local16 = new Class296();
		if (local38 != null) {
			local16.method6498(new Class2_Sub22(local38));
		}
		@Pc(66) Class32 local66 = this.aClass32_22;
		synchronized (this.aClass32_22) {
			this.aClass32_22.method629(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public void method2249() {
		@Pc(6) Class32 local6 = this.aClass32_22;
		synchronized (this.aClass32_22) {
			this.aClass32_22.method640();
		}
	}
}
