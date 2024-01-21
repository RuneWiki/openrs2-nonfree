import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!ad;")
	public Class2_Sub2 aClass2_Sub2_8;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Lclient!d;")
	public Class2_Sub5 aClass2_Sub5_5;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
	public int anInt2439;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Z")
	public volatile boolean aBoolean100 = true;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()I")
	public abstract int method1763();

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([III)V")
	public abstract void method1764(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public abstract void method1765(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()Lclient!ad;")
	public abstract Class2_Sub2 method1766();

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "()I")
	public int method1767() {
		return 255;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "([III)V")
	protected final void method1768(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean100) {
			this.method1764(arg0, arg1, arg2);
		} else {
			this.method1765(arg2);
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "()Lclient!ad;")
	public abstract Class2_Sub2 method1769();
}
