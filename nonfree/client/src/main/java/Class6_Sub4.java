import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public abstract class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!mha", name = "k", descriptor = "Lclient!mha;")
	public Class6_Sub4 aClass6_Sub4_9;

	@OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
	public int anInt10607;

	@OriginalMember(owner = "client!mha", name = "n", descriptor = "Lclient!jo;")
	public Class6_Sub27 aClass6_Sub27_6;

	@OriginalMember(owner = "client!mha", name = "l", descriptor = "Z")
	public volatile boolean aBoolean834 = true;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
	public abstract void method8631(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "()Lclient!mha;")
	public abstract Class6_Sub4 method8632();

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "()I")
	public int method8633() {
		return 255;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "([III)V")
	protected final void method8634(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean834) {
			this.method8635(arg0, arg1, arg2);
		} else {
			this.method8631(arg2);
		}
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "([III)V")
	public abstract void method8635(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "()I")
	public abstract int method8636();

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "()Lclient!mha;")
	public abstract Class6_Sub4 method8637();
}
