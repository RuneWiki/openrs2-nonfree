import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class251 {

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
	public int anInt7318;

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "Lclient!ad;")
	private final Class5 aClass5_58 = new Class5(64);

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "Lclient!ad;")
	public final Class5 aClass5_59 = new Class5(50);

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "Lclient!ad;")
	public final Class5 aClass5_60 = new Class5(5);

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "Lclient!dn;")
	public final Class56 aClass56_90;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Z")
	public boolean aBoolean506;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "Lclient!dn;")
	private final Class56 aClass56_89;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!gt;IZLclient!dn;Lclient!dn;)V")
	public Class251(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class56 arg3, @OriginalArg(4) Class56 arg4) {
		this.aClass56_90 = arg4;
		this.aBoolean506 = arg2;
		this.aClass56_89 = arg3;
		if (this.aClass56_89 != null) {
			@Pc(38) int local38 = this.aClass56_89.method1380() - 1;
			this.aClass56_89.method1373(local38);
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public void method5681() {
		@Pc(6) Class5 local6 = this.aClass5_58;
		synchronized (this.aClass5_58) {
			this.aClass5_58.method110();
		}
		local6 = this.aClass5_59;
		synchronized (this.aClass5_59) {
			this.aClass5_59.method110();
		}
		local6 = this.aClass5_60;
		synchronized (this.aClass5_60) {
			this.aClass5_60.method110();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V")
	public void method5683(@OriginalArg(0) int arg0) {
		this.anInt7318 = arg0;
		@Pc(9) Class5 local9 = this.aClass5_59;
		synchronized (this.aClass5_59) {
			this.aClass5_59.method116();
		}
		local9 = this.aClass5_60;
		synchronized (this.aClass5_60) {
			this.aClass5_60.method116();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZ)Lclient!de;")
	public Class47 method5684(@OriginalArg(0) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_58;
		@Pc(16) Class47 local16;
		synchronized (this.aClass5_58) {
			local16 = (Class47) this.aClass5_58.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass56_89.method1384(Static345.method4951(arg0), Static134.method2319(arg0));
		local16 = new Class47();
		local16.anInt1569 = arg0;
		local16.aClass251_1 = this;
		if (local37 != null) {
			local16.method1308(new Class3_Sub2(local37));
		}
		local16.method1300();
		@Pc(62) Class5 local62 = this.aClass5_58;
		synchronized (this.aClass5_58) {
			this.aClass5_58.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	public void method5685() {
		@Pc(7) Class5 local7 = this.aClass5_58;
		synchronized (this.aClass5_58) {
			this.aClass5_58.method116();
		}
		local7 = this.aClass5_59;
		synchronized (this.aClass5_59) {
			this.aClass5_59.method116();
		}
		local7 = this.aClass5_60;
		synchronized (this.aClass5_60) {
			this.aClass5_60.method116();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZI)V")
	public void method5686(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean506 != arg0) {
			this.aBoolean506 = arg0;
			this.method5685();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public void method5687() {
		@Pc(6) Class5 local6 = this.aClass5_59;
		synchronized (this.aClass5_59) {
			this.aClass5_59.method116();
		}
		local6 = this.aClass5_60;
		synchronized (this.aClass5_60) {
			this.aClass5_60.method116();
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)V")
	public void method5688() {
		@Pc(10) Class5 local10 = this.aClass5_58;
		synchronized (this.aClass5_58) {
			this.aClass5_58.method106(5);
		}
		local10 = this.aClass5_59;
		synchronized (this.aClass5_59) {
			this.aClass5_59.method106(5);
		}
		local10 = this.aClass5_60;
		synchronized (this.aClass5_60) {
			this.aClass5_60.method106(5);
		}
	}
}
