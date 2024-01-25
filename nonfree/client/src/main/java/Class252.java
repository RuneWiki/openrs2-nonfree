import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class252 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
	public int anInt7331;

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
	public int anInt7333;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	public int anInt7335;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
	public int anInt7336;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public int anInt7337;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
	public int anInt7340;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "Lclient!vj;")
	public Class252 aClass252_2;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
	public int anInt7342;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
	public int anInt7343;

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
	public int anInt7344;

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
	public final int anInt7338;

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
	public final int anInt7345;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
	public final int anInt7339;

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	private final int anInt7334;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIB)V")
	public Class252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt7338 = arg2;
		this.anInt7345 = arg3;
		this.anInt7339 = arg1;
		this.aByte101 = arg4;
		this.anInt7334 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!vj;I)V")
	public Class252(@OriginalArg(0) Class252 arg0, @OriginalArg(1) int arg1) {
		this.aClass252_2 = arg0;
		this.anInt7338 = this.aClass252_2.anInt7338 + arg1;
		this.anInt7334 = this.aClass252_2.anInt7334;
		this.anInt7345 = arg1 + this.aClass252_2.anInt7345;
		this.aByte101 = this.aClass252_2.aByte101;
		this.anInt7339 = arg1 + this.aClass252_2.anInt7339;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)Lclient!tg;")
	public Class223 method5685() {
		return Static298.method4255(this.anInt7334);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)Lclient!vj;")
	public Class252 method5686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class252(this.anInt7334, arg1, arg2, arg0, this.aByte101);
	}
}
