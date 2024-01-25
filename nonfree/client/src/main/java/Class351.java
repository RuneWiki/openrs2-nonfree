import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class351 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Lclient!hw;")
	public Class2_Sub10_Sub4 aClass2_Sub10_Sub4_4;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Lclient!go;")
	public Class2_Sub20 aClass2_Sub20_3;

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "Lclient!oaa;")
	public Class2_Sub7_Sub1 aClass2_Sub7_Sub1_4;

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "Lclient!uea;")
	public Class331 aClass331_1;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
	public final int anInt9301;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
	public final int anInt9297;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
	public final int anInt9298;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
	public int anInt9300;

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
	public final int anInt9303;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "B")
	public final byte aByte122;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(BIIIII)V")
	public Class351(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9301 = arg1;
		this.anInt9297 = arg5;
		this.anInt9298 = arg2;
		this.anInt9300 = arg3;
		this.anInt9303 = arg4;
		this.aByte122 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z")
	public boolean method7717() {
		return this.aByte122 == 2 || this.aByte122 == 3;
	}
}
