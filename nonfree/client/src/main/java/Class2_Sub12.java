import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "Lclient!ft;")
	public Class2_Sub12 aClass2_Sub12_7;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
	public int anInt8578;

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "Lclient!qw;")
	public Class2_Sub31 aClass2_Sub31_5;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "Z")
	public volatile boolean aBoolean617 = true;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "()I")
	public abstract int method7191();

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([III)V")
	public abstract void method7192(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	public abstract void method7193(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "([III)V")
	protected final void method7194(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean617) {
			this.method7192(arg0, arg1, arg2);
		} else {
			this.method7193(arg2);
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "()Lclient!ft;")
	public abstract Class2_Sub12 method7195();

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "()Lclient!ft;")
	public abstract Class2_Sub12 method7196();

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "()I")
	public int method7197() {
		return 255;
	}
}
