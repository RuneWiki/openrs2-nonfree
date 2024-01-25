import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class244 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
	public int anInt6568;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	public int anInt6570;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	public int anInt6571;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
	public int anInt6574;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
	public int anInt6576;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
	public int anInt6580;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "Lclient!uj;")
	public Class244 aClass244_1;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	public int anInt6582;

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
	public int anInt6584;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
	public int anInt6585;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
	private final int anInt6572;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "B")
	public final byte aByte92;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
	public final int anInt6578;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
	public final int anInt6577;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	public final int anInt6579;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIIIB)V")
	public Class244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt6572 = arg0;
		this.aByte92 = arg4;
		this.anInt6578 = arg2;
		this.anInt6577 = arg1;
		this.anInt6579 = arg3;
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!uj;I)V")
	public Class244(@OriginalArg(0) Class244 arg0, @OriginalArg(1) int arg1) {
		this.aClass244_1 = arg0;
		this.anInt6577 = arg1 + this.aClass244_1.anInt6577;
		this.anInt6578 = this.aClass244_1.anInt6578 + arg1;
		this.anInt6572 = this.aClass244_1.anInt6572;
		this.anInt6579 = this.aClass244_1.anInt6579 + arg1;
		this.aByte92 = this.aClass244_1.aByte92;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBI)Lclient!uj;")
	public Class244 method5472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class244(this.anInt6572, arg2, arg1, arg0, this.aByte92);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lclient!gf;")
	public Class86 method5473() {
		return Static188.method2960(this.anInt6572);
	}
}
