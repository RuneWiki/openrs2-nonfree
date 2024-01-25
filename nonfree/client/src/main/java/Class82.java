import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class82 {

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "Lclient!ig;")
	private Class6_Sub2 aClass6_Sub2_18;

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "Lclient!ig;")
	public Class6_Sub2 aClass6_Sub2_17 = new Class6_Sub2();

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
	public Class82() {
		this.aClass6_Sub2_17.aClass6_Sub2_66 = this.aClass6_Sub2_17;
		this.aClass6_Sub2_17.aClass6_Sub2_65 = this.aClass6_Sub2_17;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)Lclient!ig;")
	public Class6_Sub2 method2071() {
		@Pc(7) Class6_Sub2 local7 = this.aClass6_Sub2_17.aClass6_Sub2_65;
		if (this.aClass6_Sub2_17 == local7) {
			this.aClass6_Sub2_18 = null;
			return null;
		} else {
			this.aClass6_Sub2_18 = local7.aClass6_Sub2_65;
			return local7;
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)I")
	public int method2074() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class6_Sub2 local11 = this.aClass6_Sub2_17.aClass6_Sub2_65; local11 != this.aClass6_Sub2_17; local11 = local11.aClass6_Sub2_65) {
			local7++;
		}
		if (3003 != 3003) {
			this.aClass6_Sub2_17 = null;
		}
		return local7;
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(B)V")
	public void method2075() {
		while (true) {
			@Pc(17) Class6_Sub2 local17 = this.aClass6_Sub2_17.aClass6_Sub2_65;
			if (this.aClass6_Sub2_17 == local17) {
				this.aClass6_Sub2_18 = null;
				return;
			}
			local17.method8464();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLclient!ig;)V")
	public void method2076(@OriginalArg(1) Class6_Sub2 arg0) {
		if (arg0.aClass6_Sub2_66 != null) {
			arg0.method8464();
		}
		arg0.aClass6_Sub2_65 = this.aClass6_Sub2_17;
		arg0.aClass6_Sub2_66 = this.aClass6_Sub2_17.aClass6_Sub2_66;
		arg0.aClass6_Sub2_66.aClass6_Sub2_65 = arg0;
		arg0.aClass6_Sub2_65.aClass6_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)Lclient!ig;")
	public Class6_Sub2 method2077() {
		@Pc(15) Class6_Sub2 local15 = this.aClass6_Sub2_17.aClass6_Sub2_65;
		if (this.aClass6_Sub2_17 == local15) {
			return null;
		} else {
			local15.method8464();
			return local15;
		}
	}

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "(B)Lclient!ig;")
	public Class6_Sub2 method2078() {
		@Pc(6) Class6_Sub2 local6 = this.aClass6_Sub2_18;
		if (this.aClass6_Sub2_17 == local6) {
			this.aClass6_Sub2_18 = null;
			return null;
		} else {
			this.aClass6_Sub2_18 = local6.aClass6_Sub2_65;
			return local6;
		}
	}
}
