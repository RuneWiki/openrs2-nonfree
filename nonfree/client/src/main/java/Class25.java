import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class25 {

	@OriginalMember(owner = "client!at", name = "e", descriptor = "Lclient!dka;")
	private final Class85 aClass85_2 = new Class85(16);

	@OriginalMember(owner = "client!at", name = "l", descriptor = "Lclient!nca;")
	private final Class254 aClass254_19;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class25(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_19 = arg2;
		this.aClass254_19.method6101(30);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	public void method432() {
		@Pc(7) Class85 local7 = this.aClass85_2;
		synchronized (this.aClass85_2) {
			this.aClass85_2.method1748();
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(IB)V")
	public void method433() {
		@Pc(2) Class85 local2 = this.aClass85_2;
		synchronized (this.aClass85_2) {
			this.aClass85_2.method1742(5);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)Lclient!uea;")
	public Class366 method435(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_2;
		@Pc(16) Class366 local16;
		synchronized (this.aClass85_2) {
			local16 = (Class366) this.aClass85_2.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_19;
		@Pc(39) byte[] local39;
		synchronized (this.aClass254_19) {
			local39 = this.aClass254_19.method6087(arg0, 30);
		}
		local16 = new Class366();
		if (local39 != null) {
			local16.method8682(new Class2_Sub20(local39));
		}
		@Pc(71) Class85 local71 = this.aClass85_2;
		synchronized (this.aClass85_2) {
			this.aClass85_2.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V")
	public void method438() {
		@Pc(2) Class85 local2 = this.aClass85_2;
		synchronized (this.aClass85_2) {
			this.aClass85_2.method1741();
		}
	}
}
