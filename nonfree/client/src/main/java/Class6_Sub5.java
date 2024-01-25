import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Lclient!cp;")
	public Class6_Sub4 aClass6_Sub4_5;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Lclient!wg;")
	public Class6_Sub5 aClass6_Sub5_8;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	public int anInt7047;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "Z")
	public volatile boolean aBoolean478 = true;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
	public abstract int method5728();

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()Lclient!wg;")
	public abstract Class6_Sub5 method5729();

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	public abstract void method5730(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "()I")
	public int method5731() {
		return 255;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()Lclient!wg;")
	public abstract Class6_Sub5 method5732();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([III)V")
	protected final void method5733(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean478) {
			this.method5734(arg0, arg1, arg2);
		} else {
			this.method5730(arg2);
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "([III)V")
	public abstract void method5734(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
