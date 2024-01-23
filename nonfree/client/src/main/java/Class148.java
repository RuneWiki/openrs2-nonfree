import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class148 {

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Lclient!qm;")
	private Class1_Sub2 aClass1_Sub2_49 = new Class1_Sub2();

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "Lclient!tg;")
	private Class170 aClass170_10 = new Class170();

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
	private int anInt4253;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
	private int anInt4254;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "Lclient!qb;")
	private Class142 aClass142_21;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I)V")
	public Class148(@OriginalArg(0) int arg0) {
		this.anInt4253 = arg0;
		@Pc(16) int local16 = 1;
		this.anInt4254 = arg0;
		while (arg0 > local16 + local16) {
			local16 += local16;
		}
		this.aClass142_21 = new Class142(local16);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IJ)Lclient!qm;")
	public Class1_Sub2 method3600(@OriginalArg(1) long arg0) {
		@Pc(8) Class1_Sub2 local8 = (Class1_Sub2) this.aClass142_21.method3543(arg0);
		if (local8 != null) {
			this.aClass170_10.method4210(local8);
		}
		return local8;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)Lclient!ba;")
	public Class1 method3601() {
		return this.aClass142_21.method3530();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!qm;BJ)V")
	public void method3602(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4253 == 0) {
			@Pc(10) Class1_Sub2 local10 = this.aClass170_10.method4211();
			local10.method4779();
			local10.method4493();
			if (this.aClass1_Sub2_49 == local10) {
				local10 = this.aClass170_10.method4211();
				local10.method4779();
				local10.method4493();
			}
		} else {
			this.anInt4253--;
		}
		this.aClass142_21.method3537(arg0, arg1);
		this.aClass170_10.method4210(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	public void method3605() {
		this.aClass170_10.method4208();
		this.aClass142_21.method3542();
		this.aClass1_Sub2_49 = new Class1_Sub2();
		this.anInt4253 = this.anInt4254;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Lclient!ba;")
	public Class1 method3609() {
		return this.aClass142_21.method3534();
	}
}
