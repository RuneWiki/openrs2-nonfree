import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "Lclient!at;")
	public Class2_Sub4 aClass2_Sub4_5;

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
	public int anInt5511;

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "Lclient!gh;")
	public Class2_Sub2 aClass2_Sub2_8;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Z")
	public volatile boolean aBoolean431 = true;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([III)V")
	public abstract void method4828(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "()I")
	public int method4829() {
		return 255;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "()Lclient!gh;")
	public abstract Class2_Sub2 method4830();

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "([III)V")
	protected final void method4831(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean431) {
			this.method4828(arg0, arg1, arg2);
		} else {
			this.method4833(arg2);
		}
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "()Lclient!gh;")
	public abstract Class2_Sub2 method4832();

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
	public abstract void method4833(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "()I")
	public abstract int method4834();
}
