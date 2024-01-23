import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
	public int anInt310;

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
	public int anInt311;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
	public int anInt312;

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
	public int anInt313;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IIII)V")
	public Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt310 = arg0;
		this.anInt311 = arg3;
		this.anInt312 = arg2;
		this.anInt313 = arg1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)Z")
	public boolean method325(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt310 <= arg0 && this.anInt312 >= arg0 && arg1 >= this.anInt313 && this.anInt311 >= arg1;
	}
}
