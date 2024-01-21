import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!i", name = "F", descriptor = "Z")
	protected boolean aBoolean153;

	@OriginalMember(owner = "client!i", name = "G", descriptor = "Lclient!sc;")
	protected Class3_Sub5 aClass3_Sub5_3;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()I")
	public int method1565() {
		return 255;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
	public abstract void method1566(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([III)I")
	public abstract int method1567(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
