import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class363 {

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
	public int anInt9748;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
	public int anInt9750;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
	public int anInt9751;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	public int anInt9755;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	public int anInt9758;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	public int anInt9759;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "Lclient!ui;")
	public Class363 aClass363_2;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
	public int anInt9760;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public int anInt9761;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
	public int anInt9762;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public final int anInt9753;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
	private final int anInt9752;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
	public final int anInt9754;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
	public final int anInt9749;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "B")
	public final byte aByte137;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIB)V")
	public Class363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt9753 = arg3;
		this.anInt9752 = arg0;
		this.anInt9754 = arg2;
		this.anInt9749 = arg1;
		this.aByte137 = arg4;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZI)Lclient!ui;")
	public Class363 method8301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class363(this.anInt9752, arg2, arg1, arg0, this.aByte137);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Lclient!nka;")
	public Class254 method8303() {
		return Static416.method6120(this.anInt9752);
	}
}
