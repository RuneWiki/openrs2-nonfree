import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class254 {

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "Lclient!hn;")
	private final Class102 aClass102_57 = new Class102(64);

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "Lclient!hn;")
	private final Class102 aClass102_58 = new Class102(100);

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "Lclient!fo;")
	private final Class82 aClass82_97;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;Lclient!fo;Lclient!fo;)V")
	public Class254(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) Class82 arg3, @OriginalArg(4) Class82 arg4) {
		this.aClass82_97 = arg2;
		if (this.aClass82_97 != null) {
			@Pc(26) int local26 = this.aClass82_97.method1825() - 1;
			this.aClass82_97.method1823(local26);
		}
		Static265.method3749(arg4, arg3);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public void method5669() {
		@Pc(2) Class102 local2 = this.aClass102_57;
		synchronized (this.aClass102_57) {
			this.aClass102_57.method2271();
		}
		local2 = this.aClass102_58;
		synchronized (this.aClass102_58) {
			this.aClass102_58.method2271();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)Lclient!oj;")
	public Class177 method5670(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_57;
		@Pc(16) Class177 local16;
		synchronized (this.aClass102_57) {
			local16 = (Class177) this.aClass102_57.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class82 local29 = this.aClass82_97;
		@Pc(42) byte[] local42;
		synchronized (this.aClass82_97) {
			local42 = this.aClass82_97.method1817(Static349.method4737(arg0), Static35.method512(arg0));
		}
		local16 = new Class177();
		local16.anInt5032 = arg0;
		local16.aClass254_2 = this;
		if (local42 != null) {
			local16.method3957(new Class1_Sub28(local42));
		}
		local16.method3960();
		@Pc(79) Class102 local79 = this.aClass102_57;
		synchronized (this.aClass102_57) {
			this.aClass102_57.method2272((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)Lclient!cc;")
	public Class1_Sub5_Sub2 method5672(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_58;
		@Pc(16) Class1_Sub5_Sub2 local16;
		synchronized (this.aClass102_58) {
			local16 = (Class1_Sub5_Sub2) this.aClass102_58.method2258((long) arg0);
			if (local16 == null) {
				local16 = new Class1_Sub5_Sub2(arg0);
				this.aClass102_58.method2272((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method631() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public void method5673() {
		@Pc(10) Class102 local10 = this.aClass102_57;
		synchronized (this.aClass102_57) {
			this.aClass102_57.method2260();
		}
		local10 = this.aClass102_58;
		synchronized (this.aClass102_58) {
			this.aClass102_58.method2260();
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(ZI)V")
	public void method5674() {
		@Pc(2) Class102 local2 = this.aClass102_57;
		synchronized (this.aClass102_57) {
			this.aClass102_57.method2262(5);
		}
		local2 = this.aClass102_58;
		synchronized (this.aClass102_58) {
			this.aClass102_58.method2262(5);
		}
	}
}
