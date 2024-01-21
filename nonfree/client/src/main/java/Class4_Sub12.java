import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	public int anInt2425;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!ld;")
	public Class4_Sub12 aClass4_Sub12_8;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "Lclient!cd;")
	public Class4_Sub6 aClass4_Sub6_5;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "Z")
	public volatile boolean aBoolean142 = true;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()I")
	public abstract int method1691();

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([III)V")
	protected final void method1692(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean142) {
			this.method1697(arg0, arg1, arg2);
		} else {
			this.method1693(arg2);
		}
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
	public abstract void method1693(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "()Lclient!ld;")
	public abstract Class4_Sub12 method1694();

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "()I")
	public int method1695() {
		return 255;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "()Lclient!ld;")
	public abstract Class4_Sub12 method1696();

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "([III)V")
	public abstract void method1697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
