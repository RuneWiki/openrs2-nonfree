import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public abstract class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
	public int anInt4342;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "Lclient!ro;")
	public Class1_Sub7 aClass1_Sub7_8;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "Lclient!sn;")
	public Class1_Sub23 aClass1_Sub23_5;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "Z")
	public volatile boolean aBoolean393 = true;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "()Lclient!ro;")
	public abstract Class1_Sub7 method3722();

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "()I")
	public int method3723() {
		return 255;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "()Lclient!ro;")
	public abstract Class1_Sub7 method3724();

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([III)V")
	public abstract void method3725(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V")
	public abstract void method3726(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "([III)V")
	protected final void method3727(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean393) {
			this.method3725(arg0, arg1, arg2);
		} else {
			this.method3726(arg2);
		}
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "()I")
	public abstract int method3728();
}
