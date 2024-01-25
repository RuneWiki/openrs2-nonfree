import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class291 {

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	public int anInt8314;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!vh;")
	private final Class330 aClass330_57 = new Class330(64);

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "Lclient!vh;")
	public final Class330 aClass330_58 = new Class330(30);

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!pj;")
	private final Class248 aClass248_90;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "Lclient!pj;")
	public final Class248 aClass248_91;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;Lclient!pj;)V")
	public Class291(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2, @OriginalArg(3) Class248 arg3) {
		this.aClass248_90 = arg2;
		this.aClass248_91 = arg3;
		@Pc(26) int local26 = this.aClass248_90.method5774() - 1;
		this.aClass248_90.method5793(local26);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public void method6547() {
		@Pc(6) Class330 local6 = this.aClass330_57;
		synchronized (this.aClass330_57) {
			this.aClass330_57.method7678();
		}
		local6 = this.aClass330_58;
		synchronized (this.aClass330_58) {
			this.aClass330_58.method7678();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lclient!or;")
	public Class239 method6548(@OriginalArg(0) int arg0) {
		@Pc(12) Class330 local12 = this.aClass330_57;
		@Pc(22) Class239 local22;
		synchronized (this.aClass330_57) {
			local22 = (Class239) this.aClass330_57.method7677((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class248 local35 = this.aClass248_90;
		@Pc(50) byte[] local50;
		synchronized (this.aClass248_90) {
			local50 = this.aClass248_90.method5797(Static209.method3410(arg0), Static119.method5768(arg0));
		}
		local22 = new Class239();
		local22.anInt6964 = arg0;
		local22.aClass291_1 = this;
		if (local50 != null) {
			local22.method5572(new Class6_Sub12(local50));
		}
		@Pc(78) Class330 local78 = this.aClass330_57;
		synchronized (this.aClass330_57) {
			this.aClass330_57.method7676(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
	public void method6549(@OriginalArg(0) int arg0) {
		this.anInt8314 = arg0;
		@Pc(9) Class330 local9 = this.aClass330_58;
		synchronized (this.aClass330_58) {
			this.aClass330_58.method7688();
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V")
	public void method6550() {
		@Pc(2) Class330 local2 = this.aClass330_57;
		synchronized (this.aClass330_57) {
			this.aClass330_57.method7680(5);
		}
		local2 = this.aClass330_58;
		synchronized (this.aClass330_58) {
			this.aClass330_58.method7680(5);
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	public void method6551() {
		@Pc(6) Class330 local6 = this.aClass330_57;
		synchronized (this.aClass330_57) {
			this.aClass330_57.method7688();
		}
		local6 = this.aClass330_58;
		synchronized (this.aClass330_58) {
			this.aClass330_58.method7688();
		}
	}
}
