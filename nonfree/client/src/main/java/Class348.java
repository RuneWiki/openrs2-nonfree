import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public final class Class348 {

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
	public int anInt9763;

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
	public int anInt9765;

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "Lclient!sw;")
	public Class348 aClass348_2;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
	public int anInt9768;

	@OriginalMember(owner = "client!sw", name = "n", descriptor = "Lclient!iu;")
	public Class181 aClass181_13;

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
	public final int anInt9766;

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
	public final int anInt9772;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(II)V")
	public Class348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9766 = arg1;
		this.anInt9772 = arg0;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)Lclient!sw;")
	public Class348 method8243(@OriginalArg(1) int arg0) {
		return new Class348(this.anInt9772, arg0);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)Lclient!jj;")
	public Class187 method8245() {
		return Static330.method4927(this.anInt9772);
	}
}
