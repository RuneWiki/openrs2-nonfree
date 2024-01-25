import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class218 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public int anInt6275;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	public int anInt6277;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
	public int anInt6278;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "Lclient!tn;")
	public Class218 aClass218_2;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
	public int anInt6280;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	public int anInt6284;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
	public int anInt6286;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
	public int anInt6287;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
	public int anInt6288;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
	public int anInt6289;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
	public final int anInt6293;

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
	public final int anInt6292;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
	public final int anInt6281;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "B")
	public final byte aByte67;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
	public final int anInt6291;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIB)V")
	public Class218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt6293 = arg3;
		this.anInt6292 = arg1;
		this.anInt6281 = arg2;
		this.aByte67 = arg4;
		this.anInt6291 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!tn;I)V")
	public Class218(@OriginalArg(0) Class218 arg0, @OriginalArg(1) int arg1) {
		this.aClass218_2 = arg0;
		this.anInt6291 = this.aClass218_2.anInt6291;
		this.anInt6293 = this.aClass218_2.anInt6293 + arg1;
		this.aByte67 = this.aClass218_2.aByte67;
		this.anInt6281 = this.aClass218_2.anInt6281 + arg1;
		this.anInt6292 = this.aClass218_2.anInt6292 + arg1;
	}
}
