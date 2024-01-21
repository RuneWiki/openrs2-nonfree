import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!ac;")
	public Class4_Sub1 aClass4_Sub1_7;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
	public int anInt2601;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!fa;")
	public Class4_Sub6 aClass4_Sub6_5;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Z")
	public volatile boolean aBoolean114 = true;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()Lclient!ac;")
	public abstract Class4_Sub1 method1811();

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "()I")
	public int method1812() {
		return 255;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)V")
	public abstract void method1813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "()Lclient!ac;")
	public abstract Class4_Sub1 method1814();

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "([III)V")
	protected final void method1815(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean114) {
			this.method1813(arg0, arg1, arg2);
		} else {
			this.method1817(arg2);
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "()I")
	public abstract int method1816();

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	public abstract void method1817(@OriginalArg(0) int arg0);
}
