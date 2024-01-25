import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class192 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Lclient!mm;")
	public Class192 aClass192_1;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
	public int anInt5531;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	public int anInt5533;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
	public int anInt5534;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
	public int anInt5535;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
	public int anInt5537;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
	public int anInt5538;

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
	public int anInt5542;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
	public int anInt5544;

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
	public int anInt5545;

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "B")
	public final byte aByte80;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
	public final int anInt5532;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
	public final int anInt5543;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
	public final int anInt5539;

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
	private final int anInt5540;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIB)V")
	public Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte80 = arg4;
		this.anInt5532 = arg1;
		this.anInt5543 = arg3;
		this.anInt5539 = arg2;
		this.anInt5540 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!mm;I)V")
	public Class192(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1) {
		this.aClass192_1 = arg0;
		this.anInt5539 = this.aClass192_1.anInt5539 + arg1;
		this.anInt5532 = arg1 + this.aClass192_1.anInt5532;
		this.aByte80 = this.aClass192_1.aByte80;
		this.anInt5540 = this.aClass192_1.anInt5540;
		this.anInt5543 = this.aClass192_1.anInt5543 + arg1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Lclient!cr;")
	public Class44 method4747() {
		return Static328.method5246(this.anInt5540);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)Lclient!mm;")
	public Class192 method4748(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class192(this.anInt5540, arg1, arg0, arg2, this.aByte80);
	}
}
