import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public final class Class216 {

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
	public int anInt5653;

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
	public int anInt5654;

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
	public int anInt5655;

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "I")
	public int anInt5656;

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
	public int anInt5657;

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "Lclient!kw;")
	public Class216 aClass216_1;

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "I")
	public int anInt5663;

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
	public int anInt5665;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
	public int anInt5666;

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
	public int anInt5667;

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
	public final int anInt5662;

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
	public final int anInt5658;

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
	private final int anInt5660;

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
	public final int anInt5664;

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "B")
	public final byte aByte86;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(IIIIB)V")
	public Class216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt5662 = arg1;
		this.anInt5658 = arg2;
		this.anInt5660 = arg0;
		this.anInt5664 = arg3;
		this.aByte86 = arg4;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIII)Lclient!kw;")
	public Class216 method5136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class216(this.anInt5660, arg2, arg1, arg0, this.aByte86);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)Lclient!pf;")
	public Class280 method5137() {
		return Static303.method169(this.anInt5660);
	}
}
