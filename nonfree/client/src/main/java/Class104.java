import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class104 {

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!na;")
	private Class1_Sub2 aClass1_Sub2_50;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!na;")
	private Class1_Sub2 aClass1_Sub2_49 = new Class1_Sub2();

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class104() {
		this.aClass1_Sub2_49.aClass1_Sub2_68 = this.aClass1_Sub2_49;
		this.aClass1_Sub2_49.aClass1_Sub2_69 = this.aClass1_Sub2_49;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!na;B)V")
	public void method3145(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_69 != null) {
			arg0.method4661();
		}
		arg0.aClass1_Sub2_68 = this.aClass1_Sub2_49;
		arg0.aClass1_Sub2_69 = this.aClass1_Sub2_49.aClass1_Sub2_69;
		arg0.aClass1_Sub2_69.aClass1_Sub2_68 = arg0;
		arg0.aClass1_Sub2_68.aClass1_Sub2_69 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public void method3147() {
		while (true) {
			@Pc(9) Class1_Sub2 local9 = this.aClass1_Sub2_49.aClass1_Sub2_68;
			if (local9 == this.aClass1_Sub2_49) {
				this.aClass1_Sub2_50 = null;
				return;
			}
			local9.method4661();
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)Lclient!na;")
	public Class1_Sub2 method3149() {
		@Pc(3) Class1_Sub2 local3 = this.aClass1_Sub2_49.aClass1_Sub2_68;
		if (local3 == this.aClass1_Sub2_49) {
			return null;
		} else {
			local3.method4661();
			return local3;
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)I")
	public int method3150() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class1_Sub2 local16 = this.aClass1_Sub2_49.aClass1_Sub2_68;
		while (this.aClass1_Sub2_49 != local16) {
			local16 = local16.aClass1_Sub2_68;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Lclient!na;")
	public Class1_Sub2 method3151() {
		@Pc(2) Class1_Sub2 local2 = this.aClass1_Sub2_50;
		if (local2 == this.aClass1_Sub2_49) {
			this.aClass1_Sub2_50 = null;
			return null;
		} else {
			this.aClass1_Sub2_50 = local2.aClass1_Sub2_68;
			return local2;
		}
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)Lclient!na;")
	public Class1_Sub2 method3152() {
		@Pc(13) Class1_Sub2 local13 = this.aClass1_Sub2_49.aClass1_Sub2_68;
		if (this.aClass1_Sub2_49 == local13) {
			this.aClass1_Sub2_50 = null;
			return null;
		} else {
			this.aClass1_Sub2_50 = local13.aClass1_Sub2_68;
			return local13;
		}
	}
}
