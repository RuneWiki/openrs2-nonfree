import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class107 {

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	public int anInt3166;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Lclient!wm;")
	private final Class267 aClass267_28 = new Class267(64);

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "Lclient!wm;")
	public final Class267 aClass267_29 = new Class267(30);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Lclient!ph;")
	private final Class187 aClass187_61;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "Lclient!ph;")
	public final Class187 aClass187_62;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;Lclient!ph;)V")
	public Class107(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2, @OriginalArg(3) Class187 arg3) {
		this.aClass187_61 = arg2;
		this.aClass187_62 = arg3;
		@Pc(26) int local26 = this.aClass187_61.method4302() - 1;
		this.aClass187_61.method4306(local26);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
	public void method2637() {
		@Pc(12) Class267 local12 = this.aClass267_28;
		synchronized (this.aClass267_28) {
			this.aClass267_28.method6007(5);
		}
		local12 = this.aClass267_29;
		synchronized (this.aClass267_29) {
			this.aClass267_29.method6007(5);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
	public void method2638() {
		@Pc(10) Class267 local10 = this.aClass267_28;
		synchronized (this.aClass267_28) {
			this.aClass267_28.method6013();
		}
		local10 = this.aClass267_29;
		synchronized (this.aClass267_29) {
			this.aClass267_29.method6013();
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)Lclient!lo;")
	public Class156 method2639(@OriginalArg(1) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_28;
		@Pc(16) Class156 local16;
		synchronized (this.aClass267_28) {
			local16 = (Class156) this.aClass267_28.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class187 local29 = this.aClass187_61;
		@Pc(51) byte[] local51;
		synchronized (this.aClass187_61) {
			local51 = this.aClass187_61.method4300(Static84.method1604(arg0), Static245.method3580(arg0));
		}
		local16 = new Class156();
		local16.aClass107_2 = this;
		local16.anInt4314 = arg0;
		if (local51 != null) {
			local16.method3470(new Class10_Sub8(local51));
		}
		@Pc(81) Class267 local81 = this.aClass267_28;
		synchronized (this.aClass267_28) {
			this.aClass267_28.method6008(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
	public void method2641(@OriginalArg(1) int arg0) {
		this.anInt3166 = arg0;
		@Pc(14) Class267 local14 = this.aClass267_29;
		synchronized (this.aClass267_29) {
			this.aClass267_29.method6011();
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
	public void method2642() {
		@Pc(6) Class267 local6 = this.aClass267_28;
		synchronized (this.aClass267_28) {
			this.aClass267_28.method6011();
		}
		local6 = this.aClass267_29;
		synchronized (this.aClass267_29) {
			this.aClass267_29.method6011();
		}
	}
}
