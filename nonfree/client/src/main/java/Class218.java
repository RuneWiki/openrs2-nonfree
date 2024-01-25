import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class218 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public int anInt6150;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public int anInt6152;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!oo;")
	public Class207 aClass207_20;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt6153;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Lclient!mb;")
	public Class218 aClass218_2;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	public final int anInt6151;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public final int anInt6154;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V")
	public Class218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6151 = arg1;
		this.anInt6154 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!mb;")
	public Class218 method5203(@OriginalArg(1) int arg0) {
		return new Class218(this.anInt6154, arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Lclient!fa;")
	public Class99 method5204() {
		return Static199.method2914(this.anInt6154);
	}
}
