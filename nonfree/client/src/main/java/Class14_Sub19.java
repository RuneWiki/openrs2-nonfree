import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class Class14_Sub19 extends Class14 {

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "Lclient!ed;")
	public Class14_Sub11 aClass14_Sub11_5;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
	public int anInt6160;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "Lclient!kp;")
	public Class14_Sub19 aClass14_Sub19_8;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "Z")
	public volatile boolean aBoolean424 = true;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "([III)V")
	public abstract void method5504(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "([III)V")
	protected final void method5505(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean424) {
			this.method5504(arg0, arg1, arg2);
		} else {
			this.method5507(arg2);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "()Lclient!kp;")
	public abstract Class14_Sub19 method5506();

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V")
	public abstract void method5507(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "()Lclient!kp;")
	public abstract Class14_Sub19 method5508();

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "()I")
	public abstract int method5509();

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "()I")
	public int method5510() {
		return 255;
	}
}
