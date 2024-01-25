import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public abstract class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!po", name = "p", descriptor = "Lclient!js;")
	public Class4_Sub9 aClass4_Sub9_5;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "Lclient!po;")
	public Class4_Sub7 aClass4_Sub7_7;

	@OriginalMember(owner = "client!po", name = "r", descriptor = "I")
	public int anInt6774;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "Z")
	public volatile boolean aBoolean490 = true;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([III)V")
	public abstract void method5463(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!po", name = "a", descriptor = "()I")
	public abstract int method5464();

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public abstract void method5465(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!po", name = "b", descriptor = "()Lclient!po;")
	public abstract Class4_Sub7 method5466();

	@OriginalMember(owner = "client!po", name = "b", descriptor = "([III)V")
	protected final void method5467(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean490) {
			this.method5463(arg0, arg1, arg2);
		} else {
			this.method5465(arg2);
		}
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "()Lclient!po;")
	public abstract Class4_Sub7 method5468();

	@OriginalMember(owner = "client!po", name = "d", descriptor = "()I")
	public int method5469() {
		return 255;
	}
}
