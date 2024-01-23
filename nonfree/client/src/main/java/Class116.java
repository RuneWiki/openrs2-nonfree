import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class116 {

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!lh;")
	private Class1_Sub2 aClass1_Sub2_52;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!lh;")
	private Class1_Sub2 aClass1_Sub2_51 = new Class1_Sub2();

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class116() {
		this.aClass1_Sub2_51.aClass1_Sub2_50 = this.aClass1_Sub2_51;
		this.aClass1_Sub2_51.aClass1_Sub2_49 = this.aClass1_Sub2_51;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Lclient!lh;")
	public Class1_Sub2 method3453() {
		@Pc(12) Class1_Sub2 local12 = this.aClass1_Sub2_51.aClass1_Sub2_50;
		if (this.aClass1_Sub2_51 == local12) {
			this.aClass1_Sub2_52 = null;
			return null;
		} else {
			this.aClass1_Sub2_52 = local12.aClass1_Sub2_50;
			return local12;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!lh;B)V")
	public void method3454(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_49 != null) {
			arg0.method3318();
		}
		arg0.aClass1_Sub2_49 = this.aClass1_Sub2_51.aClass1_Sub2_49;
		arg0.aClass1_Sub2_50 = this.aClass1_Sub2_51;
		arg0.aClass1_Sub2_49.aClass1_Sub2_50 = arg0;
		arg0.aClass1_Sub2_50.aClass1_Sub2_49 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
	public void method3458() {
		while (true) {
			@Pc(13) Class1_Sub2 local13 = this.aClass1_Sub2_51.aClass1_Sub2_50;
			if (this.aClass1_Sub2_51 == local13) {
				this.aClass1_Sub2_52 = null;
				return;
			}
			local13.method3318();
		}
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)Lclient!lh;")
	public Class1_Sub2 method3460() {
		@Pc(2) Class1_Sub2 local2 = this.aClass1_Sub2_52;
		if (local2 == this.aClass1_Sub2_51) {
			this.aClass1_Sub2_52 = null;
			return null;
		} else {
			this.aClass1_Sub2_52 = local2.aClass1_Sub2_50;
			return local2;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!lh;ZLclient!lh;)V")
	public void method3462(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (arg0.aClass1_Sub2_49 != null) {
			arg0.method3318();
		}
		arg0.aClass1_Sub2_50 = arg1.aClass1_Sub2_50;
		arg0.aClass1_Sub2_49 = arg1;
		arg0.aClass1_Sub2_49.aClass1_Sub2_50 = arg0;
		arg0.aClass1_Sub2_50.aClass1_Sub2_49 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLclient!lh;)V")
	public void method3463(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_49 != null) {
			arg0.method3318();
		}
		arg0.aClass1_Sub2_49 = this.aClass1_Sub2_51;
		arg0.aClass1_Sub2_50 = this.aClass1_Sub2_51.aClass1_Sub2_50;
		arg0.aClass1_Sub2_49.aClass1_Sub2_50 = arg0;
		arg0.aClass1_Sub2_50.aClass1_Sub2_49 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)Lclient!lh;")
	public Class1_Sub2 method3464() {
		@Pc(14) Class1_Sub2 local14 = this.aClass1_Sub2_51.aClass1_Sub2_50;
		if (this.aClass1_Sub2_51 == local14) {
			return null;
		} else {
			local14.method3318();
			return local14;
		}
	}
}
