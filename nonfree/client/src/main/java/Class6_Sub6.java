import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "Lclient!lb;")
	public Class6_Sub11 aClass6_Sub11_5;

	@OriginalMember(owner = "client!kf", name = "H", descriptor = "Lclient!kf;")
	public Class6_Sub6 aClass6_Sub6_8;

	@OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
	public int anInt2915;

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "Z")
	public volatile boolean aBoolean157 = true;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "()Lclient!kf;")
	public abstract Class6_Sub6 method1913();

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([III)V")
	protected final void method1914(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean157) {
			this.method1915(arg0, arg1, arg2);
		} else {
			this.method1917(arg2);
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "([III)V")
	public abstract void method1915(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "()I")
	public int method1916() {
		return 255;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
	public abstract void method1917(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "()Lclient!kf;")
	public abstract Class6_Sub6 method1918();

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "()I")
	public abstract int method1919();
}
