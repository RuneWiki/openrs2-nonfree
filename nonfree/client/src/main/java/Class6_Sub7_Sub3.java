import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public final class Class6_Sub7_Sub3 extends Class6_Sub7 {

	@OriginalMember(owner = "client!nja", name = "s", descriptor = "Ljava/lang/String;")
	private String aString83;

	@OriginalMember(owner = "client!nja", name = "q", descriptor = "B")
	private byte aByte98;

	@OriginalMember(owner = "client!nja", name = "o", descriptor = "B")
	private byte aByte99;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8201(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aString83 = arg0.method2986();
		if (this.aString83 != null) {
			arg0.method3030();
			this.aByte99 = arg0.method3027();
			this.aByte98 = arg0.method3027();
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lclient!kj;I)V")
	@Override
	public void method8200(@OriginalArg(0) Class6_Sub29 arg0) {
		if (this.aString83 != null) {
			arg0.aByte82 = this.aByte99;
			arg0.aByte81 = this.aByte98;
		}
		arg0.aString61 = this.aString83;
	}
}
