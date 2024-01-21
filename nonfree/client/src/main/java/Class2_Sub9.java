import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "Lclient!fh;")
	public Class2_Sub6 aClass2_Sub6_5;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "Lclient!dh;")
	public Class2_Sub9 aClass2_Sub9_8;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
	public int anInt3239;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Z")
	public volatile boolean aBoolean153 = true;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "()Lclient!dh;")
	public abstract Class2_Sub9 method2468();

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "()I")
	public int method2469() {
		return 255;
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "()Lclient!dh;")
	public abstract Class2_Sub9 method2470();

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([III)V")
	public abstract void method2471(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "()I")
	public abstract int method2472();

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	public abstract void method2473(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "([III)V")
	protected final void method2474(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean153) {
			this.method2471(arg0, arg1, arg2);
		} else {
			this.method2473(arg2);
		}
	}
}
