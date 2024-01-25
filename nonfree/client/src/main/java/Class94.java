import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public final class Class94 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
	public int anInt2934;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public int anInt2938;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	public int anInt2939;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	public int anInt2940;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
	public int anInt2943;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "Lclient!gh;")
	public Class94 aClass94_1;

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
	public int anInt2947;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
	public int anInt2949;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
	public int anInt2950;

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
	public int anInt2951;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
	public final int anInt2936;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
	public final int anInt2942;

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
	public final int anInt2952;

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
	private final int anInt2953;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIIIB)V")
	public Class94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt2936 = arg2;
		this.aByte47 = arg4;
		this.anInt2942 = arg3;
		this.anInt2952 = arg1;
		this.anInt2953 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!gh;I)V")
	public Class94(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1) {
		this.aClass94_1 = arg0;
		this.anInt2942 = arg1 + this.aClass94_1.anInt2942;
		this.anInt2953 = this.aClass94_1.anInt2953;
		this.anInt2952 = this.aClass94_1.anInt2952 + arg1;
		this.aByte47 = this.aClass94_1.aByte47;
		this.anInt2936 = arg1 + this.aClass94_1.anInt2936;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)Lclient!gh;")
	public Class94 method2162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class94(this.anInt2953, arg2, arg0, arg1, this.aByte47);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Lclient!vj;")
	public Class257 method2163() {
		return Static58.method1083(this.anInt2953);
	}
}
