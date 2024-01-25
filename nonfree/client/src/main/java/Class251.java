import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class Class251 implements Interface2 {

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
	public final int anInt6883;

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
	public final int anInt6884;

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "Lclient!fn;")
	public final Class103 aClass103_18;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "Lclient!tl;")
	public final Class314 aClass314_12;

	@OriginalMember(owner = "client!tba", name = "h", descriptor = "I")
	public final int anInt6885;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(ILclient!tl;Lclient!fn;II)V")
	public Class251(@OriginalArg(0) int arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6883 = arg3;
		this.anInt6884 = arg4;
		this.aClass103_18 = arg2;
		this.aClass314_12 = arg1;
		this.anInt6885 = arg0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)Lclient!tca;")
	@Override
	public Class307 method7827() {
		return Static40.aClass307_14;
	}
}
