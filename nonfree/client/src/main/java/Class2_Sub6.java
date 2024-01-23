import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
	public int anInt4462;

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "Lclient!gb;")
	public Class2_Sub9 aClass2_Sub9_5;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "Lclient!ef;")
	public Class2_Sub6 aClass2_Sub6_8;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "Z")
	public volatile boolean aBoolean276 = true;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([III)V")
	public abstract void method3085(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()Lclient!ef;")
	public abstract Class2_Sub6 method3086();

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "([III)V")
	protected final void method3087(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean276) {
			this.method3085(arg0, arg1, arg2);
		} else {
			this.method3090(arg2);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "()I")
	public int method3088() {
		return 255;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "()I")
	public abstract int method3089();

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public abstract void method3090(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "()Lclient!ef;")
	public abstract Class2_Sub6 method3091();
}
