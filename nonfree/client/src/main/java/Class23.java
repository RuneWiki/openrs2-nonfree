import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class23 {

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "Lclient!fba;")
	private final Class102 aClass102_2 = new Class102(64);

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "Lclient!la;")
	private final Class196 aClass196_10;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
	public final int anInt1036;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class23(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_10 = arg2;
		if (this.aClass196_10 == null) {
			this.anInt1036 = 0;
		} else {
			this.anInt1036 = this.aClass196_10.method5118(16);
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
	public void method1114() {
		@Pc(2) Class102 local2 = this.aClass102_2;
		synchronized (this.aClass102_2) {
			this.aClass102_2.method2680();
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)Lclient!vba;")
	public Class350 method1115(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_2;
		@Pc(16) Class350 local16;
		synchronized (this.aClass102_2) {
			local16 = (Class350) this.aClass102_2.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class196 local29 = this.aClass196_10;
		@Pc(38) byte[] local38;
		synchronized (this.aClass196_10) {
			local38 = this.aClass196_10.method5102(16, arg0);
		}
		local16 = new Class350();
		if (local38 != null) {
			local16.method8302(new Class3_Sub3(local38));
		}
		@Pc(60) Class102 local60 = this.aClass102_2;
		synchronized (this.aClass102_2) {
			this.aClass102_2.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
	public void method1116() {
		@Pc(6) Class102 local6 = this.aClass102_2;
		synchronized (this.aClass102_2) {
			this.aClass102_2.method2681();
		}
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(II)V")
	public void method1117() {
		@Pc(2) Class102 local2 = this.aClass102_2;
		synchronized (this.aClass102_2) {
			this.aClass102_2.method2668(5);
		}
	}
}
