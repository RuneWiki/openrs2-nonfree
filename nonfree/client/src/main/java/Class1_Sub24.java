import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	public int anInt5428;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!qd;")
	public Class1_Sub24 aClass1_Sub24_7;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Lclient!be;")
	public Class1_Sub5 aClass1_Sub5_5;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Z")
	public volatile boolean aBoolean367 = true;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()Lclient!qd;")
	public abstract Class1_Sub24 method4618();

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	public abstract void method4619(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([III)V")
	protected final void method4620(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean367) {
			this.method4624(arg0, arg1, arg2);
		} else {
			this.method4619(arg2);
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "()I")
	public int method4621() {
		return 255;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "()Lclient!qd;")
	public abstract Class1_Sub24 method4622();

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "()I")
	public abstract int method4623();

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "([III)V")
	public abstract void method4624(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
