import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class32 {

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Lclient!ha;")
	private final Class5_Sub2 aClass5_Sub2_18 = new Class5_Sub2();

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class32() {
		this.aClass5_Sub2_18.aClass5_Sub2_62 = this.aClass5_Sub2_18;
		this.aClass5_Sub2_18.aClass5_Sub2_61 = this.aClass5_Sub2_18;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Lclient!ha;")
	public Class5_Sub2 method918() {
		@Pc(8) Class5_Sub2 local8 = this.aClass5_Sub2_18.aClass5_Sub2_61;
		if (this.aClass5_Sub2_18 == local8) {
			return null;
		} else {
			local8.method3014();
			return local8;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method919(@OriginalArg(0) Class5_Sub2 arg0) {
		if (arg0.aClass5_Sub2_62 != null) {
			arg0.method3014();
		}
		arg0.aClass5_Sub2_62 = this.aClass5_Sub2_18.aClass5_Sub2_62;
		arg0.aClass5_Sub2_61 = this.aClass5_Sub2_18;
		arg0.aClass5_Sub2_62.aClass5_Sub2_61 = arg0;
		arg0.aClass5_Sub2_61.aClass5_Sub2_62 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)Lclient!ha;")
	public Class5_Sub2 method921() {
		@Pc(12) Class5_Sub2 local12 = this.aClass5_Sub2_18.aClass5_Sub2_61;
		return this.aClass5_Sub2_18 == local12 ? null : local12;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!ha;)V")
	public void method922(@OriginalArg(1) Class5_Sub2 arg0) {
		if (arg0.aClass5_Sub2_62 != null) {
			arg0.method3014();
		}
		arg0.aClass5_Sub2_61 = this.aClass5_Sub2_18.aClass5_Sub2_61;
		arg0.aClass5_Sub2_62 = this.aClass5_Sub2_18;
		arg0.aClass5_Sub2_62.aClass5_Sub2_61 = arg0;
		arg0.aClass5_Sub2_61.aClass5_Sub2_62 = arg0;
	}
}
