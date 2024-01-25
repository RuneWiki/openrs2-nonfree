import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public final class Class161 {

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "I")
	public int anInt3675;

	@OriginalMember(owner = "client!hja", name = "d", descriptor = "Lclient!qq;")
	public Class203 aClass203_5;

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "I")
	public int anInt3678;

	@OriginalMember(owner = "client!hja", name = "n", descriptor = "I")
	public int anInt3681;

	@OriginalMember(owner = "client!hja", name = "e", descriptor = "Lclient!hja;")
	public Class161 aClass161_1;

	@OriginalMember(owner = "client!hja", name = "c", descriptor = "I")
	public final int anInt3674;

	@OriginalMember(owner = "client!hja", name = "f", descriptor = "I")
	public final int anInt3680;

	@OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(II)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3674 = arg0;
		this.anInt3680 = arg1;
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(B)Lclient!dn;")
	public Class92 method3220() {
		return Static109.method1571(this.anInt3674);
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(IB)Lclient!hja;")
	public Class161 method3221(@OriginalArg(0) int arg0) {
		return new Class161(this.anInt3674, arg0);
	}
}
