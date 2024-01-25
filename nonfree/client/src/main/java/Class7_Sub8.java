import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class Class7_Sub8 extends Class7 {

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
	public int anInt5850;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Lclient!mi;")
	public Class7_Sub8 aClass7_Sub8_8;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "Lclient!nj;")
	public Class7_Sub20 aClass7_Sub20_5;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "Z")
	public volatile boolean aBoolean427 = true;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()Lclient!mi;")
	public abstract Class7_Sub8 method4930();

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
	public int method4931() {
		return 255;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "()Lclient!mi;")
	public abstract Class7_Sub8 method4932();

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([III)V")
	protected final void method4933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean427) {
			this.method4934(arg0, arg1, arg2);
		} else {
			this.method4936(arg2);
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "([III)V")
	public abstract void method4934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "()I")
	public abstract int method4935();

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	public abstract void method4936(@OriginalArg(0) int arg0);
}
