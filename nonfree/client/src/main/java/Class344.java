import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class344 {

	@OriginalMember(owner = "client!st", name = "b", descriptor = "Lclient!dka;")
	private final Class85 aClass85_59 = new Class85(64);

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Lclient!nca;")
	private final Class254 aClass254_146;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class344(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_146 = arg2;
		if (this.aClass254_146 != null) {
			this.aClass254_146.method6101(35);
		}
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V")
	public void method8183() {
		@Pc(2) Class85 local2 = this.aClass85_59;
		synchronized (this.aClass85_59) {
			this.aClass85_59.method1748();
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)Lclient!ga;")
	public Class131 method8186(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_59;
		@Pc(16) Class131 local16;
		synchronized (this.aClass85_59) {
			local16 = (Class131) this.aClass85_59.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_146;
		@Pc(41) byte[] local41;
		synchronized (this.aClass254_146) {
			local41 = this.aClass254_146.method6087(arg0, 35);
		}
		local16 = new Class131();
		if (local41 != null) {
			local16.method2755(new Class2_Sub20(local41));
		}
		local16.method2754();
		@Pc(68) Class85 local68 = this.aClass85_59;
		synchronized (this.aClass85_59) {
			this.aClass85_59.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IB)V")
	public void method8188() {
		@Pc(6) Class85 local6 = this.aClass85_59;
		synchronized (this.aClass85_59) {
			this.aClass85_59.method1742(5);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	public void method8189() {
		@Pc(6) Class85 local6 = this.aClass85_59;
		synchronized (this.aClass85_59) {
			this.aClass85_59.method1741();
		}
	}
}
