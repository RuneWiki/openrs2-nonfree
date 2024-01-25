import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class260 {

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Lclient!mt;")
	private Class1_Sub3 aClass1_Sub3_58;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!mt;")
	private final Class1_Sub3 aClass1_Sub3_57 = new Class1_Sub3();

	static {
		new Class151("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class260() {
		this.aClass1_Sub3_57.aClass1_Sub3_56 = this.aClass1_Sub3_57;
		this.aClass1_Sub3_57.aClass1_Sub3_55 = this.aClass1_Sub3_57;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Lclient!mt;")
	public Class1_Sub3 method5550() {
		@Pc(7) Class1_Sub3 local7 = this.aClass1_Sub3_57.aClass1_Sub3_56;
		if (this.aClass1_Sub3_57 == local7) {
			return null;
		} else {
			local7.method5312();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public void method5551() {
		while (true) {
			@Pc(5) Class1_Sub3 local5 = this.aClass1_Sub3_57.aClass1_Sub3_56;
			if (this.aClass1_Sub3_57 == local5) {
				this.aClass1_Sub3_58 = null;
				return;
			}
			local5.method5312();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Lclient!mt;")
	public Class1_Sub3 method5553() {
		@Pc(7) Class1_Sub3 local7 = this.aClass1_Sub3_57.aClass1_Sub3_56;
		if (this.aClass1_Sub3_57 == local7) {
			this.aClass1_Sub3_58 = null;
			return null;
		} else {
			this.aClass1_Sub3_58 = local7.aClass1_Sub3_56;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)I")
	public int method5554() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub3 local11 = this.aClass1_Sub3_57.aClass1_Sub3_56;
		while (local11 != this.aClass1_Sub3_57) {
			local11 = local11.aClass1_Sub3_56;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)Lclient!mt;")
	public Class1_Sub3 method5556() {
		@Pc(6) Class1_Sub3 local6 = this.aClass1_Sub3_58;
		if (this.aClass1_Sub3_57 == local6) {
			this.aClass1_Sub3_58 = null;
			return null;
		} else {
			this.aClass1_Sub3_58 = local6.aClass1_Sub3_56;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!mt;)V")
	public void method5557(@OriginalArg(1) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_55 != null) {
			arg0.method5312();
		}
		arg0.aClass1_Sub3_55 = this.aClass1_Sub3_57.aClass1_Sub3_55;
		arg0.aClass1_Sub3_56 = this.aClass1_Sub3_57;
		arg0.aClass1_Sub3_55.aClass1_Sub3_56 = arg0;
		arg0.aClass1_Sub3_56.aClass1_Sub3_55 = arg0;
	}
}
