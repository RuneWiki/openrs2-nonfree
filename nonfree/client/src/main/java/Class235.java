import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class235 {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	public int anInt5623;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	public int anInt5624;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
	public int anInt5626;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
	public int anInt5627;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
	public int anInt5628;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	public int anInt5629;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	public int anInt5632;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "Lclient!mk;")
	public Class235 aClass235_2;

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
	public int anInt5636;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
	public int anInt5637;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	public final int anInt5634;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "B")
	public final byte aByte88;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
	public final int anInt5631;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	public final int anInt5635;

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
	private final int anInt5639;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIIB)V")
	public Class235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt5634 = arg2;
		this.aByte88 = arg4;
		this.anInt5631 = arg3;
		this.anInt5635 = arg1;
		this.anInt5639 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Lclient!at;")
	public Class21 method4945() {
		return Static624.method8380(this.anInt5639);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBII)Lclient!mk;")
	public Class235 method4948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class235(this.anInt5639, arg2, arg0, arg1, this.aByte88);
	}
}
