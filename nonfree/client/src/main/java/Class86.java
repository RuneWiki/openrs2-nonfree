import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class86 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!lf;")
	public Class98 aClass98_1;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	public int anInt2719;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(II)V")
	public Class86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass98_1 = Static85.method1464(arg0);
		this.anInt2719 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!lf;I)V")
	public Class86(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1) {
		this.anInt2719 = arg1;
		this.aClass98_1 = arg0;
	}
}
