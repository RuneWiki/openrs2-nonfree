import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class123 {

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "Lclient!ad;")
	private Class5 aClass5_34 = new Class5(64);

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Lclient!ad;")
	public Class5 aClass5_35 = new Class5(64);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Lclient!dn;")
	public final Class56 aClass56_48;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "Lclient!dn;")
	private final Class56 aClass56_49;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;Lclient!dn;)V")
	public Class123(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) Class56 arg3) {
		this.aClass56_48 = arg3;
		this.aClass56_49 = arg2;
		this.aClass56_49.method1373(34);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	public void method3176() {
		@Pc(6) Class5 local6 = this.aClass5_34;
		synchronized (this.aClass5_34) {
			this.aClass5_34.method106(5);
		}
		local6 = this.aClass5_35;
		synchronized (this.aClass5_35) {
			this.aClass5_35.method106(5);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBI)V")
	public void method3177(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass5_34 = new Class5(arg1);
		this.aClass5_35 = new Class5(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public void method3178() {
		@Pc(2) Class5 local2 = this.aClass5_34;
		synchronized (this.aClass5_34) {
			this.aClass5_34.method110();
		}
		local2 = this.aClass5_35;
		synchronized (this.aClass5_35) {
			this.aClass5_35.method110();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
	public void method3179() {
		@Pc(6) Class5 local6 = this.aClass5_34;
		synchronized (this.aClass5_34) {
			this.aClass5_34.method116();
		}
		local6 = this.aClass5_35;
		synchronized (this.aClass5_35) {
			this.aClass5_35.method116();
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)Lclient!sl;")
	public Class208 method3180(@OriginalArg(0) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_34;
		@Pc(16) Class208 local16;
		synchronized (this.aClass5_34) {
			local16 = (Class208) this.aClass5_34.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass56_49.method1384(34, arg0);
		local16 = new Class208();
		local16.aClass123_2 = this;
		if (local33 != null) {
			local16.method5143(new Class3_Sub2(local33));
		}
		@Pc(57) Class5 local57 = this.aClass5_34;
		synchronized (this.aClass5_34) {
			this.aClass5_34.method114((long) arg0, local16);
			return local16;
		}
	}
}
