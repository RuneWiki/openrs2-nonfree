import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class80 {

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Lclient!of;")
	private final Class188 aClass188_23 = new Class188(64);

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "Lclient!of;")
	private final Class188 aClass188_24 = new Class188(100);

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Lclient!mn;")
	private final Class171 aClass171_30;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;Lclient!mn;Lclient!mn;)V")
	public Class80(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3, @OriginalArg(4) Class171 arg4) {
		this.aClass171_30 = arg2;
		if (this.aClass171_30 != null) {
			@Pc(26) int local26 = this.aClass171_30.method3677() - 1;
			this.aClass171_30.method3662(local26);
		}
		Static201.method2821(arg3, arg4);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZ)Lclient!nb;")
	public Class2_Sub1_Sub12 method1871(@OriginalArg(0) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_24;
		@Pc(16) Class2_Sub1_Sub12 local16;
		synchronized (this.aClass188_24) {
			local16 = (Class2_Sub1_Sub12) this.aClass188_24.method4158((long) arg0);
			if (local16 == null) {
				local16 = new Class2_Sub1_Sub12(arg0);
				this.aClass188_24.method4155((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method3892() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
	public void method1872() {
		@Pc(2) Class188 local2 = this.aClass188_23;
		synchronized (this.aClass188_23) {
			this.aClass188_23.method4169(5);
		}
		local2 = this.aClass188_24;
		synchronized (this.aClass188_24) {
			this.aClass188_24.method4169(5);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public void method1873() {
		@Pc(2) Class188 local2 = this.aClass188_23;
		synchronized (this.aClass188_23) {
			this.aClass188_23.method4154();
		}
		local2 = this.aClass188_24;
		synchronized (this.aClass188_24) {
			this.aClass188_24.method4154();
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public void method1878() {
		@Pc(2) Class188 local2 = this.aClass188_23;
		synchronized (this.aClass188_23) {
			this.aClass188_23.method4156();
		}
		local2 = this.aClass188_24;
		synchronized (this.aClass188_24) {
			this.aClass188_24.method4156();
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)Lclient!hg;")
	public Class109 method1879(@OriginalArg(0) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_23;
		@Pc(16) Class109 local16;
		synchronized (this.aClass188_23) {
			local16 = (Class109) this.aClass188_23.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) Class171 local41 = this.aClass171_30;
		@Pc(56) byte[] local56;
		synchronized (this.aClass171_30) {
			local56 = this.aClass171_30.method3658(Static366.method5132(arg0), Static112.method1865(arg0));
		}
		local16 = new Class109();
		local16.aClass80_2 = this;
		local16.anInt2780 = arg0;
		if (local56 != null) {
			local16.method2295(new Class2_Sub17(local56));
		}
		local16.method2301();
		@Pc(89) Class188 local89 = this.aClass188_23;
		synchronized (this.aClass188_23) {
			this.aClass188_23.method4155((long) arg0, local16);
			return local16;
		}
	}
}
