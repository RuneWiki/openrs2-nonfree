import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!an", name = "m", descriptor = "Lclient!sh;")
	public Class1_Sub10 aClass1_Sub10_5;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "I")
	public int anInt5510;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "Lclient!an;")
	public Class1_Sub5 aClass1_Sub5_8;

	@OriginalMember(owner = "client!an", name = "o", descriptor = "Z")
	public volatile boolean aBoolean433 = true;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([III)V")
	protected final void method4369(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean433) {
			this.method4374(arg0, arg1, arg2);
		} else {
			this.method4372(arg2);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "()Lclient!an;")
	public abstract Class1_Sub5 method4370();

	@OriginalMember(owner = "client!an", name = "b", descriptor = "()I")
	public int method4371() {
		return 255;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public abstract void method4372(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!an", name = "c", descriptor = "()I")
	public abstract int method4373();

	@OriginalMember(owner = "client!an", name = "b", descriptor = "([III)V")
	public abstract void method4374(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!an", name = "d", descriptor = "()Lclient!an;")
	public abstract Class1_Sub5 method4375();
}
