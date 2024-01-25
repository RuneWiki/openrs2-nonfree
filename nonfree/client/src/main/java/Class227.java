import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class227 {

	@OriginalMember(owner = "client!su", name = "h", descriptor = "Lclient!sp;")
	private Class1_Sub2 aClass1_Sub2_51;

	@OriginalMember(owner = "client!su", name = "d", descriptor = "Lclient!sp;")
	private final Class1_Sub2 aClass1_Sub2_50 = new Class1_Sub2();

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	public Class227() {
		this.aClass1_Sub2_50.aClass1_Sub2_58 = this.aClass1_Sub2_50;
		this.aClass1_Sub2_50.aClass1_Sub2_57 = this.aClass1_Sub2_50;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Lclient!sp;")
	public Class1_Sub2 method5104() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_50.aClass1_Sub2_57;
		if (this.aClass1_Sub2_50 == local7) {
			return null;
		} else {
			local7.method5813();
			return local7;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!sp;I)V")
	public void method5106(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_58 != null) {
			arg0.method5813();
		}
		arg0.aClass1_Sub2_58 = this.aClass1_Sub2_50.aClass1_Sub2_58;
		arg0.aClass1_Sub2_57 = this.aClass1_Sub2_50;
		arg0.aClass1_Sub2_58.aClass1_Sub2_57 = arg0;
		arg0.aClass1_Sub2_57.aClass1_Sub2_58 = arg0;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)Lclient!sp;")
	public Class1_Sub2 method5107() {
		@Pc(11) Class1_Sub2 local11 = this.aClass1_Sub2_51;
		if (this.aClass1_Sub2_50 == local11) {
			this.aClass1_Sub2_51 = null;
			return null;
		} else {
			this.aClass1_Sub2_51 = local11.aClass1_Sub2_57;
			return local11;
		}
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(I)I")
	public int method5108() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub2 local11 = this.aClass1_Sub2_50.aClass1_Sub2_57;
		while (local11 != this.aClass1_Sub2_50) {
			local11 = local11.aClass1_Sub2_57;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)Lclient!sp;")
	public Class1_Sub2 method5109() {
		@Pc(14) Class1_Sub2 local14 = this.aClass1_Sub2_50.aClass1_Sub2_57;
		if (this.aClass1_Sub2_50 == local14) {
			this.aClass1_Sub2_51 = null;
			return null;
		} else {
			this.aClass1_Sub2_51 = local14.aClass1_Sub2_57;
			return local14;
		}
	}

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(I)V")
	public void method5111() {
		while (true) {
			@Pc(3) Class1_Sub2 local3 = this.aClass1_Sub2_50.aClass1_Sub2_57;
			if (local3 == this.aClass1_Sub2_50) {
				this.aClass1_Sub2_51 = null;
				return;
			}
			local3.method5813();
		}
	}
}
