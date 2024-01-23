import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
	public int anInt5484;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "Lclient!sm;")
	public Class1_Sub8 aClass1_Sub8_8;

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "Lclient!uc;")
	public Class1_Sub22 aClass1_Sub22_5;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "Z")
	public volatile boolean aBoolean419 = true;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "()I")
	public int method4203() {
		return 255;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "([III)V")
	public abstract void method4204(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "([III)V")
	protected final void method4205(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean419) {
			this.method4204(arg0, arg1, arg2);
		} else {
			this.method4209(arg2);
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "()Lclient!sm;")
	public abstract Class1_Sub8 method4206();

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "()I")
	public abstract int method4207();

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "()Lclient!sm;")
	public abstract Class1_Sub8 method4208();

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
	public abstract void method4209(@OriginalArg(0) int arg0);
}
