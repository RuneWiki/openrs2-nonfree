import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Lclient!kb;")
	public Class2_Sub2 aClass2_Sub2_8;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public int anInt2516;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Lclient!s;")
	public Class2_Sub16 aClass2_Sub16_5;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Z")
	public volatile boolean aBoolean184 = true;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()Lclient!kb;")
	public abstract Class2_Sub2 method1518();

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()I")
	public int method1519() {
		return 255;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	public abstract int method1520();

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()Lclient!kb;")
	public abstract Class2_Sub2 method1521();

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V")
	protected final void method1522(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean184) {
			this.method1524(arg0, arg1, arg2);
		} else {
			this.method1523(arg2);
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public abstract void method1523(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "([III)V")
	public abstract void method1524(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
