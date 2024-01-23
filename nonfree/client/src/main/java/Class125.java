import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class125 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Lclient!ag;")
	private Class8_Sub1 aClass8_Sub1_39 = new Class8_Sub1();

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "Lclient!uc;")
	private Class164 aClass164_6 = new Class164();

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
	private int anInt3791;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	private int anInt3790;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "Lclient!pd;")
	private Class129 aClass129_21;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V")
	public Class125(@OriginalArg(0) int arg0) {
		this.anInt3791 = arg0;
		this.anInt3790 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass129_21 = new Class129(local19);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public void method2950() {
		this.aClass164_6.method3994();
		this.aClass129_21.method3047();
		this.aClass8_Sub1_39 = new Class8_Sub1();
		this.anInt3791 = this.anInt3790;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Lclient!vb;")
	public Class8 method2954() {
		return this.aClass129_21.method3035();
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)Lclient!vb;")
	public Class8 method2955() {
		return this.aClass129_21.method3048();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BJLclient!ag;)V")
	public void method2956(@OriginalArg(1) long arg0, @OriginalArg(2) Class8_Sub1 arg1) {
		if (this.anInt3791 == 0) {
			@Pc(18) Class8_Sub1 local18 = this.aClass164_6.method3992();
			local18.method4273();
			local18.method4277();
			if (this.aClass8_Sub1_39 == local18) {
				local18 = this.aClass164_6.method3992();
				local18.method4273();
				local18.method4277();
			}
		} else {
			this.anInt3791--;
		}
		this.aClass129_21.method3039(arg1, arg0);
		this.aClass164_6.method3993(arg1);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(JB)Lclient!ag;")
	public Class8_Sub1 method2957(@OriginalArg(0) long arg0) {
		@Pc(12) Class8_Sub1 local12 = (Class8_Sub1) this.aClass129_21.method3043(arg0);
		if (local12 != null) {
			this.aClass164_6.method3993(local12);
		}
		return local12;
	}
}
