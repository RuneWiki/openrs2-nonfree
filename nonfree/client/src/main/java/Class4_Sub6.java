import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "Lclient!mj;")
	public Class4_Sub6 aClass4_Sub6_7;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
	public int anInt4782;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "Lclient!bd;")
	public Class4_Sub5 aClass4_Sub5_5;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "Z")
	public volatile boolean aBoolean298 = true;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
	public int method3722() {
		return 255;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([III)V")
	public abstract void method3723(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "()I")
	public abstract int method3724();

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "()Lclient!mj;")
	public abstract Class4_Sub6 method3725();

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "([III)V")
	protected final void method3726(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean298) {
			this.method3723(arg0, arg1, arg2);
		} else {
			this.method3728(arg2);
		}
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "()Lclient!mj;")
	public abstract Class4_Sub6 method3727();

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
	public abstract void method3728(@OriginalArg(0) int arg0);
}
