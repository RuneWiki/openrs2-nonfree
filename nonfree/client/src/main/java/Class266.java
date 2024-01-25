import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class266 {

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Lclient!dka;")
	private final Class85 aClass85_46 = new Class85(64);

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "Lclient!nca;")
	private final Class254 aClass254_118;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class266(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_118 = arg2;
		this.aClass254_118.method6101(31);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IB)V")
	public void method6365() {
		@Pc(12) Class85 local12 = this.aClass85_46;
		synchronized (this.aClass85_46) {
			this.aClass85_46.method1742(5);
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
	public void method6366() {
		@Pc(10) Class85 local10 = this.aClass85_46;
		synchronized (this.aClass85_46) {
			this.aClass85_46.method1741();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
	public void method6367() {
		@Pc(6) Class85 local6 = this.aClass85_46;
		synchronized (this.aClass85_46) {
			this.aClass85_46.method1748();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BI)Lclient!aha;")
	public Class12 method6368(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_46;
		@Pc(18) Class12 local18;
		synchronized (this.aClass85_46) {
			local18 = (Class12) this.aClass85_46.method1737((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class254 local32 = this.aClass254_118;
		@Pc(41) byte[] local41;
		synchronized (this.aClass254_118) {
			local41 = this.aClass254_118.method6087(arg0, 31);
		}
		local18 = new Class12();
		if (local41 != null) {
			local18.method241(new Class2_Sub20(local41));
		}
		@Pc(71) Class85 local71 = this.aClass85_46;
		synchronized (this.aClass85_46) {
			this.aClass85_46.method1745((long) arg0, 16383, local18);
			return local18;
		}
	}
}
