import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "Lclient!ti;")
	public Class2_Sub16 aClass2_Sub16_5;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
	public int anInt4311;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "Lclient!sg;")
	public Class2_Sub7 aClass2_Sub7_8;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "Z")
	public volatile boolean aBoolean171 = true;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
	public abstract void method3309(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()I")
	public int method3310() {
		return 255;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "()I")
	public abstract int method3311();

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "([III)V")
	public abstract void method3312(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "()Lclient!sg;")
	public abstract Class2_Sub7 method3313();

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "()Lclient!sg;")
	public abstract Class2_Sub7 method3314();

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "([III)V")
	protected final void method3315(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean171) {
			this.method3312(arg0, arg1, arg2);
		} else {
			this.method3309(arg2);
		}
	}
}
