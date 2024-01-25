import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class131 {

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!ig;")
	private Class6_Sub2 aClass6_Sub2_28;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!dp;")
	private Class82 aClass82_4;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	private Class131() {
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!dp;)V")
	public Class131(@OriginalArg(0) Class82 arg0) {
		this.aClass82_4 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Lclient!ig;")
	public Class6_Sub2 method3483() {
		@Pc(6) Class6_Sub2 local6 = this.aClass6_Sub2_28;
		if (this.aClass82_4.aClass6_Sub2_17 == local6) {
			this.aClass6_Sub2_28 = null;
			return null;
		} else {
			this.aClass6_Sub2_28 = local6.aClass6_Sub2_65;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Lclient!ig;")
	public Class6_Sub2 method3484() {
		@Pc(16) Class6_Sub2 local16 = this.aClass82_4.aClass6_Sub2_17.aClass6_Sub2_65;
		if (local16 == this.aClass82_4.aClass6_Sub2_17) {
			this.aClass6_Sub2_28 = null;
			return null;
		} else {
			this.aClass6_Sub2_28 = local16.aClass6_Sub2_65;
			return local16;
		}
	}
}
