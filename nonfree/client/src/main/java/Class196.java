import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class196 {

	@OriginalMember(owner = "client!jha", name = "l", descriptor = "Lclient!dka;")
	private Class85 aClass85_34 = new Class85(128);

	@OriginalMember(owner = "client!jha", name = "d", descriptor = "Lclient!dka;")
	public Class85 aClass85_35 = new Class85(64);

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "Lclient!nca;")
	public final Class254 aClass254_92;

	@OriginalMember(owner = "client!jha", name = "m", descriptor = "Lclient!nca;")
	private final Class254 aClass254_93;

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;Lclient!nca;)V")
	public Class196(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3) {
		this.aClass254_92 = arg3;
		this.aClass254_93 = arg2;
		this.aClass254_93.method6101(36);
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(B)V")
	public void method4187() {
		@Pc(2) Class85 local2 = this.aClass85_34;
		synchronized (this.aClass85_34) {
			this.aClass85_34.method1748();
		}
		local2 = this.aClass85_35;
		synchronized (this.aClass85_35) {
			this.aClass85_35.method1748();
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)V")
	public void method4188() {
		@Pc(11) Class85 local11 = this.aClass85_34;
		synchronized (this.aClass85_34) {
			this.aClass85_34.method1741();
		}
		local11 = this.aClass85_35;
		synchronized (this.aClass85_35) {
			this.aClass85_35.method1741();
		}
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(III)V")
	public void method4191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass85_34 = new Class85(arg0);
		this.aClass85_35 = new Class85(arg1);
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IB)Lclient!nja;")
	public Class259 method4194(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_34;
		@Pc(16) Class259 local16;
		synchronized (this.aClass85_34) {
			local16 = (Class259) this.aClass85_34.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_93;
		@Pc(39) byte[] local39;
		synchronized (this.aClass254_93) {
			local39 = this.aClass254_93.method6087(arg0, 36);
		}
		local16 = new Class259();
		local16.anInt6972 = arg0;
		local16.aClass196_4 = this;
		if (local39 != null) {
			local16.method6252(new Class2_Sub20(local39));
		}
		local16.method6248();
		@Pc(80) Class85 local80 = this.aClass85_34;
		synchronized (this.aClass85_34) {
			this.aClass85_34.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(II)V")
	public void method4196() {
		@Pc(6) Class85 local6 = this.aClass85_34;
		synchronized (this.aClass85_34) {
			this.aClass85_34.method1742(5);
		}
		local6 = this.aClass85_35;
		synchronized (this.aClass85_35) {
			this.aClass85_35.method1742(5);
		}
	}
}
