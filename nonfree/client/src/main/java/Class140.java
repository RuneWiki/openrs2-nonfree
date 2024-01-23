import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class140 {

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "Lclient!w;")
	private Class1_Sub2 aClass1_Sub2_55;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "Lclient!w;")
	private Class1_Sub2 aClass1_Sub2_54 = new Class1_Sub2();

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class140() {
		this.aClass1_Sub2_54.aClass1_Sub2_68 = this.aClass1_Sub2_54;
		this.aClass1_Sub2_54.aClass1_Sub2_69 = this.aClass1_Sub2_54;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Lclient!w;")
	public Class1_Sub2 method3413() {
		@Pc(15) Class1_Sub2 local15 = this.aClass1_Sub2_54.aClass1_Sub2_68;
		if (this.aClass1_Sub2_54 == local15) {
			this.aClass1_Sub2_55 = null;
			return null;
		} else {
			this.aClass1_Sub2_55 = local15.aClass1_Sub2_68;
			return local15;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZLclient!w;)V")
	public void method3414(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_69 != null) {
			arg0.method4347();
		}
		arg0.aClass1_Sub2_69 = this.aClass1_Sub2_54.aClass1_Sub2_69;
		arg0.aClass1_Sub2_68 = this.aClass1_Sub2_54;
		arg0.aClass1_Sub2_69.aClass1_Sub2_68 = arg0;
		arg0.aClass1_Sub2_68.aClass1_Sub2_69 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lclient!w;")
	public Class1_Sub2 method3415() {
		@Pc(14) Class1_Sub2 local14 = this.aClass1_Sub2_55;
		if (local14 == this.aClass1_Sub2_54) {
			this.aClass1_Sub2_55 = null;
			return null;
		} else {
			this.aClass1_Sub2_55 = local14.aClass1_Sub2_68;
			return local14;
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)Lclient!w;")
	public Class1_Sub2 method3416() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_54.aClass1_Sub2_68;
		if (this.aClass1_Sub2_54 == local7) {
			return null;
		} else {
			local7.method4347();
			return local7;
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public void method3417() {
		while (true) {
			@Pc(10) Class1_Sub2 local10 = this.aClass1_Sub2_54.aClass1_Sub2_68;
			if (this.aClass1_Sub2_54 == local10) {
				this.aClass1_Sub2_55 = null;
				return;
			}
			local10.method4347();
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)I")
	public int method3418() {
		@Pc(3) int local3 = 0;
		@Pc(11) Class1_Sub2 local11 = this.aClass1_Sub2_54.aClass1_Sub2_68;
		while (this.aClass1_Sub2_54 != local11) {
			local11 = local11.aClass1_Sub2_68;
			local3++;
		}
		return local3;
	}
}
