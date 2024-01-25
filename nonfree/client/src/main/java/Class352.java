import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class352 {

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "Lclient!tm;")
	public Class352 aClass352_2;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
	public int anInt9766;

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
	public int anInt9768;

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
	public int anInt9769;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
	public int anInt9774;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
	public int anInt9775;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	public int anInt9776;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
	public int anInt9777;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
	public int anInt9778;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
	public int anInt9780;

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
	public final int anInt9767;

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "B")
	public final byte aByte118;

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
	public final int anInt9772;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public final int anInt9765;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
	private final int anInt9771;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIB)V")
	public Class352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt9767 = arg1;
		this.aByte118 = arg4;
		this.anInt9772 = arg3;
		this.anInt9765 = arg2;
		this.anInt9771 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)Lclient!waa;")
	public Class385 method8403() {
		return Static194.method2929(this.anInt9771);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)Lclient!tm;")
	public Class352 method8404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class352(this.anInt9771, arg0, arg1, arg2, this.aByte118);
	}
}
