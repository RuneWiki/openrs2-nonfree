import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class212 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "Lclient!lp;")
	public Class212 aClass212_1;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Lclient!q;")
	public Class34 aClass34_4;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
	public int anInt5651;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	public int anInt5653;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
	public int anInt5655;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
	public final int anInt5654;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	public final int anInt5656;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(II)V")
	public Class212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5654 = arg0;
		this.anInt5656 = arg1;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)Lclient!lp;")
	public Class212 method4601(@OriginalArg(0) int arg0) {
		return new Class212(this.anInt5654, arg0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Lclient!kba;")
	public Class183 method4603() {
		return Static227.method3386(this.anInt5654);
	}
}
