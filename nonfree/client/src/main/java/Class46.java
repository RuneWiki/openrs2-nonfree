import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class Class46 implements Interface9 {

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
	public final int anInt1466;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
	public final int anInt1459;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "Lclient!ja;")
	public final Class154 aClass154_7;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public final int anInt1460;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "Lclient!mea;")
	public final Class201 aClass201_5;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILclient!ja;Lclient!mea;II)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) Class154 arg1, @OriginalArg(2) Class201 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1466 = arg0;
		this.anInt1459 = arg3;
		this.aClass154_7 = arg1;
		this.anInt1460 = arg4;
		this.aClass201_5 = arg2;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Lclient!eu;")
	@Override
	public Class95 method6314() {
		return Static6.aClass95_1;
	}
}
