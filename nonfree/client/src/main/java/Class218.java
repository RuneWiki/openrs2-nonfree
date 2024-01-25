import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class Class218 implements Interface9 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!eaa;")
	public final Class92 aClass92_8;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public final int anInt6023;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public final int anInt6024;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public final int anInt6025;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!cq;")
	public final Class65 aClass65_12;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILclient!eaa;Lclient!cq;II)V")
	public Class218(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass92_8 = arg1;
		this.anInt6023 = arg4;
		this.anInt6024 = arg3;
		this.anInt6025 = arg0;
		this.aClass65_12 = arg2;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Class6 method8749() {
		return Static404.aClass6_25;
	}
}
