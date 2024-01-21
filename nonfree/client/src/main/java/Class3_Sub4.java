import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "Lclient!pg;")
	public Class3_Sub4 aClass3_Sub4_6;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
	public int anInt2815;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "Lclient!sf;")
	public Class3_Sub19 aClass3_Sub19_5;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "Z")
	public volatile boolean aBoolean112 = true;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()I")
	public abstract int method1970();

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([III)V")
	public abstract void method1971(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "([III)V")
	protected final void method1972(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean112) {
			this.method1971(arg0, arg1, arg2);
		} else {
			this.method1975(arg2);
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "()Lclient!pg;")
	public abstract Class3_Sub4 method1973();

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()I")
	public int method1974() {
		return 255;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public abstract void method1975(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "()Lclient!pg;")
	public abstract Class3_Sub4 method1976();
}
