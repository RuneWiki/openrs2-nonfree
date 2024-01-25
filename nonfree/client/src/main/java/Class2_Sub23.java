import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "Lclient!aj;")
	public Class2_Sub4 aClass2_Sub4_6;

	@OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
	public int anInt8655;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "Lclient!gm;")
	public Class2_Sub23 aClass2_Sub23_8;

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "Z")
	public volatile boolean aBoolean739 = true;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public abstract void method7671(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()I")
	public int method7672() {
		return 255;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "([III)V")
	protected final void method7673(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean739) {
			this.method7675(arg0, arg1, arg2);
		} else {
			this.method7671(arg2);
		}
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "()I")
	public abstract int method7674();

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "([III)V")
	public abstract void method7675(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "()Lclient!gm;")
	public abstract Class2_Sub23 method7676();

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "()Lclient!gm;")
	public abstract Class2_Sub23 method7677();
}
