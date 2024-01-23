import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class17 {

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "Lclient!vg;")
	private Class1_Sub2 aClass1_Sub2_14;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "Lclient!vg;")
	private Class1_Sub2 aClass1_Sub2_13 = new Class1_Sub2();

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public Class17() {
		this.aClass1_Sub2_13.aClass1_Sub2_68 = this.aClass1_Sub2_13;
		this.aClass1_Sub2_13.aClass1_Sub2_69 = this.aClass1_Sub2_13;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!vg;B)V")
	public void method462(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_69 != null) {
			arg0.method4509();
		}
		arg0.aClass1_Sub2_68 = this.aClass1_Sub2_13;
		arg0.aClass1_Sub2_69 = this.aClass1_Sub2_13.aClass1_Sub2_69;
		arg0.aClass1_Sub2_69.aClass1_Sub2_68 = arg0;
		arg0.aClass1_Sub2_68.aClass1_Sub2_69 = arg0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Lclient!vg;")
	public Class1_Sub2 method463() {
		@Pc(3) Class1_Sub2 local3 = this.aClass1_Sub2_13.aClass1_Sub2_68;
		if (this.aClass1_Sub2_13 == local3) {
			return null;
		} else {
			local3.method4509();
			return local3;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Lclient!vg;")
	public Class1_Sub2 method466() {
		@Pc(6) Class1_Sub2 local6 = this.aClass1_Sub2_14;
		if (local6 == this.aClass1_Sub2_13) {
			this.aClass1_Sub2_14 = null;
			return null;
		} else {
			this.aClass1_Sub2_14 = local6.aClass1_Sub2_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I")
	public int method467() {
		@Pc(9) Class1_Sub2 local9 = this.aClass1_Sub2_13.aClass1_Sub2_68;
		@Pc(17) int local17 = 0;
		while (local9 != this.aClass1_Sub2_13) {
			local9 = local9.aClass1_Sub2_68;
			local17++;
		}
		return local17;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
	public void method468() {
		while (true) {
			@Pc(5) Class1_Sub2 local5 = this.aClass1_Sub2_13.aClass1_Sub2_68;
			if (this.aClass1_Sub2_13 == local5) {
				this.aClass1_Sub2_14 = null;
				return;
			}
			local5.method4509();
		}
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)Lclient!vg;")
	public Class1_Sub2 method469() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_13.aClass1_Sub2_68;
		if (local7 == this.aClass1_Sub2_13) {
			this.aClass1_Sub2_14 = null;
			return null;
		} else {
			this.aClass1_Sub2_14 = local7.aClass1_Sub2_68;
			return local7;
		}
	}
}
