import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public final class Class197 {

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "Lclient!uu;")
	public Class239 aClass239_5;

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
	public int anInt5427;

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
	public int anInt5428;

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "Lclient!kw;")
	public Class197 aClass197_1;

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "I")
	public int anInt5431;

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
	public final int anInt5429;

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
	public final int anInt5432;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(II)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5429 = arg0;
		this.anInt5432 = arg1;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IB)Lclient!kw;")
	public Class197 method4970(@OriginalArg(0) int arg0) {
		return new Class197(this.anInt5429, arg0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)Lclient!cha;")
	public Class59 method4971() {
		return Static37.method940(this.anInt5429);
	}
}
