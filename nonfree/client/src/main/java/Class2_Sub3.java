import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "Lclient!mh;")
	public Class2_Sub3 aClass2_Sub3_8;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "Lclient!wn;")
	public Class2_Sub19 aClass2_Sub19_5;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
	public int anInt5944;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "Z")
	public volatile boolean aBoolean395 = true;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()Lclient!mh;")
	public abstract Class2_Sub3 method4649();

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
	public abstract void method4650(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "()I")
	public abstract int method4651();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([III)V")
	protected final void method4652(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean395) {
			this.method4653(arg0, arg1, arg2);
		} else {
			this.method4650(arg2);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "([III)V")
	public abstract void method4653(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "()Lclient!mh;")
	public abstract Class2_Sub3 method4654();

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "()I")
	public int method4655() {
		return 255;
	}
}
