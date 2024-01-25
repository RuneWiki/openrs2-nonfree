import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class232 {

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "Lclient!lk;")
	public Class232 aClass232_1;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
	public int anInt5879;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	public int anInt5884;

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
	public int anInt5886;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "Lclient!cl;")
	public Class58 aClass58_4;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public final int anInt5882;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	public final int anInt5881;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(II)V")
	public Class232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5882 = arg0;
		this.anInt5881 = arg1;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)Lclient!lk;")
	public Class232 method5126(@OriginalArg(1) int arg0) {
		return new Class232(this.anInt5882, arg0);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)Lclient!em;")
	public Class100 method5129() {
		return Static500.method6841(this.anInt5882);
	}
}
