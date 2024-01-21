import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!be", name = "G", descriptor = "Lclient!be;")
	public Class3_Sub3 aClass3_Sub3_8;

	@OriginalMember(owner = "client!be", name = "H", descriptor = "I")
	public int anInt3229;

	@OriginalMember(owner = "client!be", name = "I", descriptor = "Lclient!da;")
	public Class3_Sub4 aClass3_Sub4_5;

	@OriginalMember(owner = "client!be", name = "J", descriptor = "Z")
	public volatile boolean aBoolean171 = true;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public abstract void method2057(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!be", name = "a", descriptor = "()I")
	public int method2058() {
		return 255;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "()Lclient!be;")
	public abstract Class3_Sub3 method2059();

	@OriginalMember(owner = "client!be", name = "c", descriptor = "()Lclient!be;")
	public abstract Class3_Sub3 method2060();

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([III)V")
	protected final void method2061(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean171) {
			this.method2062(arg0, arg1, arg2);
		} else {
			this.method2057(arg2);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "([III)V")
	public abstract void method2062(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!be", name = "d", descriptor = "()I")
	public abstract int method2063();
}
