import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class180 {

	@OriginalMember(owner = "client!om", name = "h", descriptor = "Lclient!hn;")
	private final Class102 aClass102_39 = new Class102(256);

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Lclient!fo;")
	private final Class82 aClass82_71;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class180(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_71 = arg2;
		this.aClass82_71.method1823(26);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public void method3972() {
		@Pc(2) Class102 local2 = this.aClass102_39;
		synchronized (this.aClass102_39) {
			this.aClass102_39.method2262(5);
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Lclient!gr;")
	public Class1_Sub5_Sub7 method3973(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_39;
		@Pc(16) Class1_Sub5_Sub7 local16;
		synchronized (this.aClass102_39) {
			local16 = (Class1_Sub5_Sub7) this.aClass102_39.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class82 local29 = this.aClass82_71;
		@Pc(38) byte[] local38;
		synchronized (this.aClass82_71) {
			local38 = this.aClass82_71.method1817(26, arg0);
		}
		local16 = new Class1_Sub5_Sub7();
		if (local38 != null) {
			local16.method2091(new Class1_Sub28(local38));
		}
		@Pc(60) Class102 local60 = this.aClass102_39;
		synchronized (this.aClass102_39) {
			this.aClass102_39.method2272((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
	public void method3974() {
		@Pc(12) Class102 local12 = this.aClass102_39;
		synchronized (this.aClass102_39) {
			this.aClass102_39.method2260();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public void method3975() {
		@Pc(6) Class102 local6 = this.aClass102_39;
		synchronized (this.aClass102_39) {
			this.aClass102_39.method2271();
		}
	}
}
