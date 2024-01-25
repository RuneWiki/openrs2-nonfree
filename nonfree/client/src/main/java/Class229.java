import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class229 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "I")
	public int anInt6340;

	@OriginalMember(owner = "client!su", name = "b", descriptor = "Lclient!su;")
	public Class229 aClass229_2;

	@OriginalMember(owner = "client!su", name = "c", descriptor = "I")
	public int anInt6341;

	@OriginalMember(owner = "client!su", name = "d", descriptor = "I")
	public int anInt6342;

	@OriginalMember(owner = "client!su", name = "e", descriptor = "I")
	public int anInt6343;

	@OriginalMember(owner = "client!su", name = "h", descriptor = "I")
	public int anInt6345;

	@OriginalMember(owner = "client!su", name = "k", descriptor = "I")
	public int anInt6348;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "I")
	public int anInt6350;

	@OriginalMember(owner = "client!su", name = "r", descriptor = "I")
	public int anInt6355;

	@OriginalMember(owner = "client!su", name = "u", descriptor = "I")
	public int anInt6357;

	@OriginalMember(owner = "client!su", name = "q", descriptor = "I")
	private final int anInt6354;

	@OriginalMember(owner = "client!su", name = "o", descriptor = "I")
	public final int anInt6352;

	@OriginalMember(owner = "client!su", name = "s", descriptor = "B")
	public final byte aByte99;

	@OriginalMember(owner = "client!su", name = "j", descriptor = "I")
	public final int anInt6347;

	@OriginalMember(owner = "client!su", name = "p", descriptor = "I")
	public final int anInt6353;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(IIIIB)V")
	public Class229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt6354 = arg0;
		this.anInt6352 = arg2;
		this.aByte99 = arg4;
		this.anInt6347 = arg3;
		this.anInt6353 = arg1;
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!su;I)V")
	public Class229(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1) {
		this.aClass229_2 = arg0;
		this.anInt6353 = this.aClass229_2.anInt6353 + arg1;
		this.anInt6347 = this.aClass229_2.anInt6347 + arg1;
		this.anInt6352 = this.aClass229_2.anInt6352 + arg1;
		this.anInt6354 = this.aClass229_2.anInt6354;
		this.aByte99 = this.aClass229_2.aByte99;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIBI)Lclient!su;")
	public Class229 method4987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class229(this.anInt6354, arg2, arg1, arg0, this.aByte99);
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)Lclient!ew;")
	public Class73 method4989() {
		return Static452.method5910(this.anInt6354);
	}
}
