import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!v", name = "H", descriptor = "Z")
	protected boolean aBoolean121;

	@OriginalMember(owner = "client!v", name = "I", descriptor = "Lclient!re;")
	protected Class3_Sub9 aClass3_Sub9_3;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
	public abstract void method1047(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()I")
	public int method1048() {
		return 255;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([III)I")
	public abstract int method1049(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
