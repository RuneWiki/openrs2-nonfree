import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class76 {

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "Lclient!qi;")
	public Class143 aClass143_1;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	public int anInt2213;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(II)V")
	public Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass143_1 = Static179.method3044(arg0);
		this.anInt2213 = arg1;
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!qi;I)V")
	public Class76(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1) {
		this.anInt2213 = arg1;
		this.aClass143_1 = arg0;
	}
}
