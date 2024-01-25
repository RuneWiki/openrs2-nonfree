import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class117 {

	@OriginalMember(owner = "client!gfa", name = "q", descriptor = "Lclient!uq;")
	private Class1_Sub3 aClass1_Sub3_27;

	@OriginalMember(owner = "client!gfa", name = "i", descriptor = "Lclient!uq;")
	private final Class1_Sub3 aClass1_Sub3_26 = new Class1_Sub3();

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "()V")
	public Class117() {
		this.aClass1_Sub3_26.aClass1_Sub3_61 = this.aClass1_Sub3_26;
		this.aClass1_Sub3_26.aClass1_Sub3_62 = this.aClass1_Sub3_26;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)Lclient!uq;")
	public Class1_Sub3 method2547() {
		@Pc(7) Class1_Sub3 local7 = this.aClass1_Sub3_26.aClass1_Sub3_61;
		if (this.aClass1_Sub3_26 == local7) {
			return null;
		} else {
			local7.method7811();
			return local7;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lclient!uq;I)V")
	public void method2548(@OriginalArg(0) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_61 != null) {
			arg0.method7811();
		}
		arg0.aClass1_Sub3_62 = this.aClass1_Sub3_26.aClass1_Sub3_62;
		arg0.aClass1_Sub3_61 = this.aClass1_Sub3_26;
		arg0.aClass1_Sub3_61.aClass1_Sub3_62 = arg0;
		arg0.aClass1_Sub3_62.aClass1_Sub3_61 = arg0;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)Lclient!uq;")
	public Class1_Sub3 method2549() {
		@Pc(7) Class1_Sub3 local7 = this.aClass1_Sub3_26.aClass1_Sub3_62;
		if (this.aClass1_Sub3_26 == local7) {
			this.aClass1_Sub3_27 = null;
			return null;
		} else {
			this.aClass1_Sub3_27 = local7.aClass1_Sub3_62;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BLclient!uq;)V")
	public void method2550(@OriginalArg(1) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_61 != null) {
			arg0.method7811();
		}
		arg0.aClass1_Sub3_61 = this.aClass1_Sub3_26.aClass1_Sub3_61;
		arg0.aClass1_Sub3_62 = this.aClass1_Sub3_26;
		arg0.aClass1_Sub3_61.aClass1_Sub3_62 = arg0;
		arg0.aClass1_Sub3_62.aClass1_Sub3_61 = arg0;
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)Lclient!uq;")
	public Class1_Sub3 method2551() {
		@Pc(6) Class1_Sub3 local6 = this.aClass1_Sub3_27;
		if (this.aClass1_Sub3_26 == local6) {
			this.aClass1_Sub3_27 = null;
			return null;
		} else {
			this.aClass1_Sub3_27 = local6.aClass1_Sub3_62;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "(I)V")
	public void method2555() {
		while (true) {
			@Pc(9) Class1_Sub3 local9 = this.aClass1_Sub3_26.aClass1_Sub3_62;
			if (this.aClass1_Sub3_26 == local9) {
				this.aClass1_Sub3_27 = null;
				return;
			}
			local9.method7811();
		}
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(B)Lclient!uq;")
	public Class1_Sub3 method2556() {
		@Pc(14) Class1_Sub3 local14 = this.aClass1_Sub3_26.aClass1_Sub3_62;
		if (local14 == this.aClass1_Sub3_26) {
			return null;
		} else {
			local14.method7811();
			return local14;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "(I)I")
	public int method2557() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class1_Sub3 local11 = this.aClass1_Sub3_26.aClass1_Sub3_62; local11 != this.aClass1_Sub3_26; local11 = local11.aClass1_Sub3_62) {
			local7++;
		}
		return local7;
	}
}
