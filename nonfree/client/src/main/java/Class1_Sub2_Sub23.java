import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	public int anInt5260;

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
	public int anInt5262;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
	public int anInt5264;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	public int anInt5265;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
	public int anInt5267;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
	public int anInt5268;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	public int anInt5269;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	public int anInt5271;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "Lclient!ud;")
	public Class176 aClass176_1;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!ud;Lclient!lg;)V")
	public Class1_Sub2_Sub23(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class87_Sub2 arg1) {
		this.aClass176_1 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
	public void method4476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anInt5268 = arg2;
		this.anInt5264 = arg1;
		this.anInt5267 = arg0;
	}
}
