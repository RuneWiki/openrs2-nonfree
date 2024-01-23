import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class170 {

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Lclient!qm;")
	private Class1_Sub2 aClass1_Sub2_65;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!qm;")
	public Class1_Sub2 aClass1_Sub2_64 = new Class1_Sub2();

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class170() {
		this.aClass1_Sub2_64.aClass1_Sub2_75 = this.aClass1_Sub2_64;
		this.aClass1_Sub2_64.aClass1_Sub2_74 = this.aClass1_Sub2_64;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Lclient!qm;")
	public Class1_Sub2 method4207() {
		@Pc(8) Class1_Sub2 local8 = this.aClass1_Sub2_65;
		if (this.aClass1_Sub2_64 == local8) {
			this.aClass1_Sub2_65 = null;
			return null;
		} else {
			this.aClass1_Sub2_65 = local8.aClass1_Sub2_75;
			return local8;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public void method4208() {
		while (true) {
			@Pc(5) Class1_Sub2 local5 = this.aClass1_Sub2_64.aClass1_Sub2_75;
			if (this.aClass1_Sub2_64 == local5) {
				this.aClass1_Sub2_65 = null;
				return;
			}
			local5.method4493();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!qm;)V")
	public void method4210(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_74 != null) {
			arg0.method4493();
		}
		arg0.aClass1_Sub2_75 = this.aClass1_Sub2_64;
		arg0.aClass1_Sub2_74 = this.aClass1_Sub2_64.aClass1_Sub2_74;
		arg0.aClass1_Sub2_74.aClass1_Sub2_75 = arg0;
		arg0.aClass1_Sub2_75.aClass1_Sub2_74 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Lclient!qm;")
	public Class1_Sub2 method4211() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_64.aClass1_Sub2_75;
		if (local7 == this.aClass1_Sub2_64) {
			return null;
		} else {
			local7.method4493();
			return local7;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)Lclient!qm;")
	public Class1_Sub2 method4212() {
		@Pc(3) Class1_Sub2 local3 = this.aClass1_Sub2_64.aClass1_Sub2_75;
		if (local3 == this.aClass1_Sub2_64) {
			this.aClass1_Sub2_65 = null;
			return null;
		} else {
			this.aClass1_Sub2_65 = local3.aClass1_Sub2_75;
			return local3;
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)I")
	public int method4214() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class1_Sub2 local11 = this.aClass1_Sub2_64.aClass1_Sub2_75; local11 != this.aClass1_Sub2_64; local11 = local11.aClass1_Sub2_75) {
			local7++;
		}
		return local7;
	}
}
