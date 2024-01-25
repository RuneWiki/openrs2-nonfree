import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class Class53 implements Interface2 {

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "Lclient!ti;")
	public final Class339 aClass339_2;

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
	public final int anInt1560;

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
	public final int anInt1556;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
	public final int anInt1559;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "Lclient!in;")
	public final Class168 aClass168_3;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(ILclient!in;Lclient!ti;II)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class339 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass339_2 = arg2;
		this.anInt1560 = arg4;
		this.anInt1556 = arg3;
		this.anInt1559 = arg0;
		this.aClass168_3 = arg1;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Lclient!saa;")
	@Override
	public Class310 method9078() {
		return Static45.aClass310_1;
	}
}
