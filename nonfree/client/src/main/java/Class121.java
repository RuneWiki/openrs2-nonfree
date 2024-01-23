import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class121 {

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "Lclient!je;")
	private Class1_Sub1 aClass1_Sub1_49;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Lclient!je;")
	private Class1_Sub1 aClass1_Sub1_48 = new Class1_Sub1();

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class121() {
		this.aClass1_Sub1_48.aClass1_Sub1_53 = this.aClass1_Sub1_48;
		this.aClass1_Sub1_48.aClass1_Sub1_52 = this.aClass1_Sub1_48;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Lclient!je;")
	public Class1_Sub1 method3373() {
		@Pc(9) Class1_Sub1 local9 = this.aClass1_Sub1_49;
		if (local9 == this.aClass1_Sub1_48) {
			this.aClass1_Sub1_49 = null;
			return null;
		} else {
			this.aClass1_Sub1_49 = local9.aClass1_Sub1_52;
			return local9;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lclient!je;")
	public Class1_Sub1 method3374() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_48.aClass1_Sub1_52;
		if (local3 == this.aClass1_Sub1_48) {
			return null;
		} else {
			local3.method3531();
			return local3;
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public void method3376() {
		while (true) {
			@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_48.aClass1_Sub1_52;
			if (local5 == this.aClass1_Sub1_48) {
				this.aClass1_Sub1_49 = null;
				return;
			}
			local5.method3531();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!je;Z)V")
	public void method3379(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_53 != null) {
			arg0.method3531();
		}
		arg0.aClass1_Sub1_53 = this.aClass1_Sub1_48;
		arg0.aClass1_Sub1_52 = this.aClass1_Sub1_48.aClass1_Sub1_52;
		arg0.aClass1_Sub1_53.aClass1_Sub1_52 = arg0;
		arg0.aClass1_Sub1_52.aClass1_Sub1_53 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Lclient!je;")
	public Class1_Sub1 method3380() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_48.aClass1_Sub1_52;
		if (local3 == this.aClass1_Sub1_48) {
			this.aClass1_Sub1_49 = null;
			return null;
		} else {
			this.aClass1_Sub1_49 = local3.aClass1_Sub1_52;
			return local3;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!je;)V")
	public void method3383(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_53 != null) {
			arg0.method3531();
		}
		arg0.aClass1_Sub1_53 = this.aClass1_Sub1_48.aClass1_Sub1_53;
		arg0.aClass1_Sub1_52 = this.aClass1_Sub1_48;
		arg0.aClass1_Sub1_53.aClass1_Sub1_52 = arg0;
		arg0.aClass1_Sub1_52.aClass1_Sub1_53 = arg0;
	}
}
