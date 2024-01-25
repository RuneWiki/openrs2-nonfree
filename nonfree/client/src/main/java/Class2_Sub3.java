import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Lclient!ad;")
	public Class2_Sub3 aClass2_Sub3_7;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!ed;")
	public Class2_Sub10 aClass2_Sub10_5;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public int anInt5724;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Z")
	public volatile boolean aBoolean404 = true;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()I")
	public abstract int method4613();

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()I")
	public int method4614() {
		return 255;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "()Lclient!ad;")
	public abstract Class2_Sub3 method4615();

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public abstract void method4616(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([III)V")
	protected final void method4617(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean404) {
			this.method4619(arg0, arg1, arg2);
		} else {
			this.method4616(arg2);
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "()Lclient!ad;")
	public abstract Class2_Sub3 method4618();

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "([III)V")
	public abstract void method4619(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
