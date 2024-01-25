import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!eba;")
	public Class2_Sub13 aClass2_Sub13_5;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	public int anInt8294;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!ac;")
	public Class2_Sub3 aClass2_Sub3_8;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Z")
	public volatile boolean aBoolean699 = true;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)V")
	public abstract void method6697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()I")
	public int method6698() {
		return 255;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "()I")
	public abstract int method6699();

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public abstract void method6700(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "()Lclient!ac;")
	public abstract Class2_Sub3 method6701();

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "([III)V")
	protected final void method6702(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean699) {
			this.method6697(arg0, arg1, arg2);
		} else {
			this.method6700(arg2);
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "()Lclient!ac;")
	public abstract Class2_Sub3 method6703();
}
