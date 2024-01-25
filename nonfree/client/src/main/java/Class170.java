import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class170 {

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
	public int anInt4270;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "Lclient!nh;")
	public Class92 aClass92_3;

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "Lclient!ir;")
	public Class170 aClass170_2;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
	public int anInt4272;

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
	public int anInt4275;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
	public final int anInt4271;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
	public final int anInt4269;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(II)V")
	public Class170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4271 = arg0;
		this.anInt4269 = arg1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)Lclient!ir;")
	public Class170 method3790(@OriginalArg(1) int arg0) {
		return new Class170(this.anInt4271, arg0);
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)Lclient!rq;")
	public Class320 method3791() {
		return Static521.method7027(this.anInt4271);
	}
}
