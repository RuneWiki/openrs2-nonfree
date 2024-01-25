import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
	public int anInt4373;

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "Lclient!vs;")
	public Class1_Sub39 aClass1_Sub39_5;

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "Lclient!ar;")
	public Class1_Sub6 aClass1_Sub6_8;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "Z")
	public volatile boolean aBoolean325 = true;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)V")
	public abstract void method4051(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([III)V")
	protected final void method4052(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean325) {
			this.method4055(arg0, arg1, arg2);
		} else {
			this.method4051(arg2);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "()I")
	public int method4053() {
		return 255;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "()Lclient!ar;")
	public abstract Class1_Sub6 method4054();

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "([III)V")
	public abstract void method4055(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "()Lclient!ar;")
	public abstract Class1_Sub6 method4056();

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "()I")
	public abstract int method4057();
}
