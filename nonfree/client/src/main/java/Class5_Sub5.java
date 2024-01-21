import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "Lclient!ra;")
	public Class5_Sub21 aClass5_Sub21_5;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "Lclient!sd;")
	public Class5_Sub5 aClass5_Sub5_8;

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
	public int anInt2356;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "Z")
	public volatile boolean aBoolean82 = true;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public abstract void method1556(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
	public abstract int method1557();

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()Lclient!sd;")
	public abstract Class5_Sub5 method1558();

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()I")
	public int method1559() {
		return 255;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "()Lclient!sd;")
	public abstract Class5_Sub5 method1560();

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([III)V")
	public abstract void method1561(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "([III)V")
	protected final void method1562(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean82) {
			this.method1561(arg0, arg1, arg2);
		} else {
			this.method1556(arg2);
		}
	}
}
