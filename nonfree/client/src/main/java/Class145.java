import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class145 {

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!ge;")
	private Class2_Sub2 aClass2_Sub2_29;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!ge;")
	private final Class2_Sub2 aClass2_Sub2_28 = new Class2_Sub2();

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class145() {
		this.aClass2_Sub2_28.aClass2_Sub2_57 = this.aClass2_Sub2_28;
		this.aClass2_Sub2_28.aClass2_Sub2_58 = this.aClass2_Sub2_28;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Lclient!ge;")
	public Class2_Sub2 method3384() {
		@Pc(6) Class2_Sub2 local6 = this.aClass2_Sub2_29;
		if (local6 == this.aClass2_Sub2_28) {
			this.aClass2_Sub2_29 = null;
			return null;
		} else {
			this.aClass2_Sub2_29 = local6.aClass2_Sub2_58;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method3387(@OriginalArg(0) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_57 != null) {
			arg0.method5934();
		}
		arg0.aClass2_Sub2_57 = this.aClass2_Sub2_28.aClass2_Sub2_57;
		arg0.aClass2_Sub2_58 = this.aClass2_Sub2_28;
		arg0.aClass2_Sub2_57.aClass2_Sub2_58 = arg0;
		arg0.aClass2_Sub2_58.aClass2_Sub2_57 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void method3388() {
		while (true) {
			@Pc(9) Class2_Sub2 local9 = this.aClass2_Sub2_28.aClass2_Sub2_58;
			if (this.aClass2_Sub2_28 == local9) {
				this.aClass2_Sub2_29 = null;
				return;
			}
			local9.method5934();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I")
	public int method3389() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class2_Sub2 local16 = this.aClass2_Sub2_28.aClass2_Sub2_58;
		while (local16 != this.aClass2_Sub2_28) {
			local16 = local16.aClass2_Sub2_58;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)Lclient!ge;")
	public Class2_Sub2 method3390() {
		@Pc(7) Class2_Sub2 local7 = this.aClass2_Sub2_28.aClass2_Sub2_58;
		if (local7 == this.aClass2_Sub2_28) {
			this.aClass2_Sub2_29 = null;
			return null;
		} else {
			this.aClass2_Sub2_29 = local7.aClass2_Sub2_58;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Lclient!ge;")
	public Class2_Sub2 method3391() {
		@Pc(12) Class2_Sub2 local12 = this.aClass2_Sub2_28.aClass2_Sub2_58;
		if (local12 == this.aClass2_Sub2_28) {
			return null;
		} else {
			local12.method5934();
			return local12;
		}
	}
}
