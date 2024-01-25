import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public abstract class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
	public int anInt4421;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "Lclient!fp;")
	public Class1_Sub19 aClass1_Sub19_7;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "Lclient!jc;")
	public Class1_Sub20 aClass1_Sub20_5;

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "Z")
	public volatile boolean aBoolean302 = true;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "()I")
	public int method3645() {
		return 255;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "()I")
	public abstract int method3646();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([III)V")
	public abstract void method3647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "([III)V")
	protected final void method3648(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean302) {
			this.method3647(arg0, arg1, arg2);
		} else {
			this.method3650(arg2);
		}
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "()Lclient!fp;")
	public abstract Class1_Sub19 method3649();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public abstract void method3650(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "()Lclient!fp;")
	public abstract Class1_Sub19 method3651();
}
