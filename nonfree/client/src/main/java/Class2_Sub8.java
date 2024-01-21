import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
	public int anInt3168;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Lclient!qa;")
	public Class2_Sub8 aClass2_Sub8_8;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "Lclient!pb;")
	public Class2_Sub18 aClass2_Sub18_5;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Z")
	public volatile boolean aBoolean142 = true;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
	public int method2177() {
		return 255;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Lclient!qa;")
	public abstract Class2_Sub8 method2178();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()Lclient!qa;")
	public abstract Class2_Sub8 method2179();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([III)V")
	public abstract void method2180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "([III)V")
	protected final void method2181(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean142) {
			this.method2180(arg0, arg1, arg2);
		} else {
			this.method2182(arg2);
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public abstract void method2182(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
	public abstract int method2183();
}
