import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class91 {

	@OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
	public int anInt3227;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "Lclient!ad;")
	private final Class5 aClass5_27 = new Class5(64);

	@OriginalMember(owner = "client!gv", name = "q", descriptor = "Lclient!ad;")
	public final Class5 aClass5_28 = new Class5(30);

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "Lclient!dn;")
	private final Class56 aClass56_38;

	@OriginalMember(owner = "client!gv", name = "o", descriptor = "Lclient!dn;")
	public final Class56 aClass56_37;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;Lclient!dn;)V")
	public Class91(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) Class56 arg3) {
		this.aClass56_38 = arg2;
		this.aClass56_37 = arg3;
		@Pc(26) int local26 = this.aClass56_38.method1380() - 1;
		this.aClass56_38.method1373(local26);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
	public void method2557() {
		@Pc(2) Class5 local2 = this.aClass5_27;
		synchronized (this.aClass5_27) {
			this.aClass5_27.method106(5);
		}
		local2 = this.aClass5_28;
		synchronized (this.aClass5_28) {
			this.aClass5_28.method106(5);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
	public void method2558() {
		@Pc(6) Class5 local6 = this.aClass5_27;
		synchronized (this.aClass5_27) {
			this.aClass5_27.method116();
		}
		local6 = this.aClass5_28;
		synchronized (this.aClass5_28) {
			this.aClass5_28.method116();
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V")
	public void method2559() {
		@Pc(6) Class5 local6 = this.aClass5_27;
		synchronized (this.aClass5_27) {
			this.aClass5_27.method110();
		}
		local6 = this.aClass5_28;
		synchronized (this.aClass5_28) {
			this.aClass5_28.method110();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BI)Lclient!pk;")
	public Class186 method2560(@OriginalArg(1) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_27;
		@Pc(16) Class186 local16;
		synchronized (this.aClass5_27) {
			local16 = (Class186) this.aClass5_27.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass56_38.method1384(Static395.method5319(arg0), Static79.method1407(arg0));
		local16 = new Class186();
		local16.aClass91_3 = this;
		local16.anInt5601 = arg0;
		if (local37 != null) {
			local16.method4523(new Class3_Sub2(local37));
		}
		@Pc(59) Class5 local59 = this.aClass5_27;
		synchronized (this.aClass5_27) {
			this.aClass5_27.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)V")
	public void method2561(@OriginalArg(1) int arg0) {
		this.anInt3227 = arg0;
		@Pc(9) Class5 local9 = this.aClass5_28;
		synchronized (this.aClass5_28) {
			this.aClass5_28.method116();
		}
	}
}
