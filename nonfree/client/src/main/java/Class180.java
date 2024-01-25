import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class180 {

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "Lclient!fu;")
	private Class6_Sub2 aClass6_Sub2_35;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!fu;")
	private final Class6_Sub2 aClass6_Sub2_34 = new Class6_Sub2();

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class180() {
		this.aClass6_Sub2_34.aClass6_Sub2_62 = this.aClass6_Sub2_34;
		this.aClass6_Sub2_34.aClass6_Sub2_61 = this.aClass6_Sub2_34;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	public void method4465() {
		while (true) {
			@Pc(5) Class6_Sub2 local5 = this.aClass6_Sub2_34.aClass6_Sub2_62;
			if (this.aClass6_Sub2_34 == local5) {
				this.aClass6_Sub2_35 = null;
				return;
			}
			local5.method7405();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)Lclient!fu;")
	public Class6_Sub2 method4466() {
		@Pc(14) Class6_Sub2 local14 = this.aClass6_Sub2_34.aClass6_Sub2_62;
		if (local14 == this.aClass6_Sub2_34) {
			this.aClass6_Sub2_35 = null;
			return null;
		} else {
			this.aClass6_Sub2_35 = local14.aClass6_Sub2_62;
			return local14;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLclient!fu;)V")
	public void method4468(@OriginalArg(1) Class6_Sub2 arg0) {
		if (arg0.aClass6_Sub2_61 != null) {
			arg0.method7405();
		}
		arg0.aClass6_Sub2_62 = this.aClass6_Sub2_34;
		arg0.aClass6_Sub2_61 = this.aClass6_Sub2_34.aClass6_Sub2_61;
		arg0.aClass6_Sub2_61.aClass6_Sub2_62 = arg0;
		arg0.aClass6_Sub2_62.aClass6_Sub2_61 = arg0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)I")
	public int method4469() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class6_Sub2 local17 = this.aClass6_Sub2_34.aClass6_Sub2_62;
		while (local17 != this.aClass6_Sub2_34) {
			local17 = local17.aClass6_Sub2_62;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!fu;)V")
	public void method4470(@OriginalArg(1) Class6_Sub2 arg0) {
		if (arg0.aClass6_Sub2_61 != null) {
			arg0.method7405();
		}
		arg0.aClass6_Sub2_61 = this.aClass6_Sub2_34;
		arg0.aClass6_Sub2_62 = this.aClass6_Sub2_34.aClass6_Sub2_62;
		arg0.aClass6_Sub2_61.aClass6_Sub2_62 = arg0;
		arg0.aClass6_Sub2_62.aClass6_Sub2_61 = arg0;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)Lclient!fu;")
	public Class6_Sub2 method4471() {
		@Pc(14) Class6_Sub2 local14 = this.aClass6_Sub2_34.aClass6_Sub2_62;
		if (local14 == this.aClass6_Sub2_34) {
			return null;
		} else {
			local14.method7405();
			return local14;
		}
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)Lclient!fu;")
	public Class6_Sub2 method4472() {
		@Pc(14) Class6_Sub2 local14 = this.aClass6_Sub2_34.aClass6_Sub2_61;
		if (local14 == this.aClass6_Sub2_34) {
			return null;
		} else {
			local14.method7405();
			return local14;
		}
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(B)Lclient!fu;")
	public Class6_Sub2 method4473() {
		@Pc(14) Class6_Sub2 local14 = this.aClass6_Sub2_35;
		if (this.aClass6_Sub2_34 == local14) {
			this.aClass6_Sub2_35 = null;
			return null;
		} else {
			this.aClass6_Sub2_35 = local14.aClass6_Sub2_62;
			return local14;
		}
	}
}
