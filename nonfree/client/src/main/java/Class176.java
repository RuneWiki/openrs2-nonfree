import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class176 {

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Lclient!jo;")
	private Class126 aClass126_40 = new Class126(64);

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "Lclient!jo;")
	public Class126 aClass126_41 = new Class126(64);

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Lclient!ok;")
	private final Class178 aClass178_85;

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "Lclient!ok;")
	public final Class178 aClass178_84;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;Lclient!ok;)V")
	public Class176(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class178 arg3) {
		this.aClass178_85 = arg2;
		this.aClass178_84 = arg3;
		this.aClass178_85.method3833(34);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBI)V")
	public void method3713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass126_40 = new Class126(arg0);
		this.aClass126_41 = new Class126(arg1);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)V")
	public void method3714() {
		@Pc(8) Class126 local8 = this.aClass126_40;
		synchronized (this.aClass126_40) {
			this.aClass126_40.method2828(5);
		}
		local8 = this.aClass126_41;
		synchronized (this.aClass126_41) {
			this.aClass126_41.method2828(5);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	public void method3715() {
		@Pc(6) Class126 local6 = this.aClass126_40;
		synchronized (this.aClass126_40) {
			this.aClass126_40.method2821();
		}
		local6 = this.aClass126_41;
		synchronized (this.aClass126_41) {
			this.aClass126_41.method2821();
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
	public void method3719() {
		@Pc(10) Class126 local10 = this.aClass126_40;
		synchronized (this.aClass126_40) {
			this.aClass126_40.method2827();
		}
		local10 = this.aClass126_41;
		synchronized (this.aClass126_41) {
			this.aClass126_41.method2827();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)Lclient!jn;")
	public Class125 method3720(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_40;
		@Pc(16) Class125 local16;
		synchronized (this.aClass126_40) {
			local16 = (Class125) this.aClass126_40.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class178 local29 = this.aClass178_85;
		@Pc(47) byte[] local47;
		synchronized (this.aClass178_85) {
			local47 = this.aClass178_85.method3838(arg0, 34);
		}
		local16 = new Class125();
		local16.aClass176_2 = this;
		if (local47 != null) {
			local16.method2814(new Class7_Sub14(local47));
		}
		@Pc(72) Class126 local72 = this.aClass126_40;
		synchronized (this.aClass126_40) {
			this.aClass126_40.method2824((long) arg0, local16);
			return local16;
		}
	}
}
