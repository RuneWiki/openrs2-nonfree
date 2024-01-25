import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class18 {

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Lclient!dc;")
	private final Class44 aClass44_1 = new Class44(64);

	@OriginalMember(owner = "client!b", name = "d", descriptor = "Lclient!he;")
	private final Class100 aClass100_2;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Lclient!he;")
	public final Class100 aClass100_3;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;Lclient!he;)V")
	public Class18(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3) {
		this.aClass100_2 = arg2;
		this.aClass100_3 = arg3;
		this.aClass100_2.method2523(3);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public void method497() {
		@Pc(6) Class44 local6 = this.aClass44_1;
		synchronized (this.aClass44_1) {
			this.aClass44_1.method1351();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Lclient!oo;")
	public Class183 method499(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_1;
		@Pc(16) Class183 local16;
		synchronized (this.aClass44_1) {
			local16 = (Class183) this.aClass44_1.method1353((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass100_2.method2520(arg0, 3);
		local16 = new Class183();
		local16.aClass18_2 = this;
		if (local41 != null) {
			local16.method4367(new Class6_Sub1(local41));
		}
		@Pc(60) Class44 local60 = this.aClass44_1;
		synchronized (this.aClass44_1) {
			this.aClass44_1.method1349(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public void method502() {
		@Pc(10) Class44 local10 = this.aClass44_1;
		synchronized (this.aClass44_1) {
			this.aClass44_1.method1348();
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
	public void method504() {
		@Pc(2) Class44 local2 = this.aClass44_1;
		synchronized (this.aClass44_1) {
			this.aClass44_1.method1352(5);
		}
	}
}
