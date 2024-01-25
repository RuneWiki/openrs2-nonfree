import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class42 {

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "Lclient!ut;")
	private Class1_Sub2 aClass1_Sub2_14;

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "Lclient!ut;")
	private final Class1_Sub2 aClass1_Sub2_13 = new Class1_Sub2();

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
	public Class42() {
		this.aClass1_Sub2_13.aClass1_Sub2_57 = this.aClass1_Sub2_13;
		this.aClass1_Sub2_13.aClass1_Sub2_58 = this.aClass1_Sub2_13;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Lclient!ut;")
	public Class1_Sub2 method1061() {
		@Pc(12) Class1_Sub2 local12 = this.aClass1_Sub2_13.aClass1_Sub2_57;
		if (this.aClass1_Sub2_13 == local12) {
			this.aClass1_Sub2_14 = null;
			return null;
		} else {
			this.aClass1_Sub2_14 = local12.aClass1_Sub2_57;
			return local12;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Lclient!ut;")
	public Class1_Sub2 method1063() {
		@Pc(11) Class1_Sub2 local11 = this.aClass1_Sub2_14;
		if (local11 == this.aClass1_Sub2_13) {
			this.aClass1_Sub2_14 = null;
			return null;
		} else {
			this.aClass1_Sub2_14 = local11.aClass1_Sub2_57;
			return local11;
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
	public int method1064() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class1_Sub2 local16 = this.aClass1_Sub2_13.aClass1_Sub2_57;
		while (this.aClass1_Sub2_13 != local16) {
			local16 = local16.aClass1_Sub2_57;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
	public void method1066() {
		while (true) {
			@Pc(13) Class1_Sub2 local13 = this.aClass1_Sub2_13.aClass1_Sub2_57;
			if (this.aClass1_Sub2_13 == local13) {
				this.aClass1_Sub2_14 = null;
				return;
			}
			local13.method5883();
		}
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)Lclient!ut;")
	public Class1_Sub2 method1067() {
		@Pc(15) Class1_Sub2 local15 = this.aClass1_Sub2_13.aClass1_Sub2_57;
		if (this.aClass1_Sub2_13 == local15) {
			return null;
		} else {
			local15.method5883();
			return local15;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!ut;)V")
	public void method1068(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_58 != null) {
			arg0.method5883();
		}
		arg0.aClass1_Sub2_57 = this.aClass1_Sub2_13;
		arg0.aClass1_Sub2_58 = this.aClass1_Sub2_13.aClass1_Sub2_58;
		arg0.aClass1_Sub2_58.aClass1_Sub2_57 = arg0;
		arg0.aClass1_Sub2_57.aClass1_Sub2_58 = arg0;
	}
}
