import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class Class5_Sub17 extends Class5 {

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	public int anInt7858;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "Lclient!tfa;")
	public Class5_Sub42 aClass5_Sub42_6;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "Lclient!km;")
	public Class5_Sub17 aClass5_Sub17_7;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "Z")
	public volatile boolean aBoolean675 = true;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()I")
	public abstract int method6646();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([III)V")
	public abstract void method6647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!km", name = "b", descriptor = "([III)V")
	protected final void method6648(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean675) {
			this.method6647(arg0, arg1, arg2);
		} else {
			this.method6650(arg2);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "()Lclient!km;")
	public abstract Class5_Sub17 method6649();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public abstract void method6650(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!km", name = "c", descriptor = "()I")
	public int method6651() {
		return 255;
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "()Lclient!km;")
	public abstract Class5_Sub17 method6652();
}
