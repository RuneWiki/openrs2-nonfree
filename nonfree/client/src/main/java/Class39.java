import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class39 {

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "Lclient!dc;")
	private final Class44 aClass44_5 = new Class44(64);

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "Lclient!he;")
	private final Class100 aClass100_10;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class39(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_10 = arg2;
		this.aClass100_10.method2523(31);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)Lclient!ta;")
	public Class228 method1268(@OriginalArg(1) int arg0) {
		@Pc(16) Class44 local16 = this.aClass44_5;
		@Pc(26) Class228 local26;
		synchronized (this.aClass44_5) {
			local26 = (Class228) this.aClass44_5.method1353((long) arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(43) byte[] local43 = this.aClass100_10.method2520(arg0, 31);
		local26 = new Class228();
		if (local43 != null) {
			local26.method5587(new Class6_Sub1(local43));
		}
		@Pc(59) Class44 local59 = this.aClass44_5;
		synchronized (this.aClass44_5) {
			this.aClass44_5.method1349(local26, (long) arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
	public void method1271() {
		@Pc(2) Class44 local2 = this.aClass44_5;
		synchronized (this.aClass44_5) {
			this.aClass44_5.method1351();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BI)V")
	public void method1275() {
		@Pc(6) Class44 local6 = this.aClass44_5;
		synchronized (this.aClass44_5) {
			this.aClass44_5.method1352(5);
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
	public void method1276() {
		@Pc(8) Class44 local8 = this.aClass44_5;
		synchronized (this.aClass44_5) {
			this.aClass44_5.method1348();
		}
	}
}
