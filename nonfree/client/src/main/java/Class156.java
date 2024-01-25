import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class Class156 implements Interface19 {

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "Lclient!rt;")
	public final Class297 aClass297_8;

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
	public final int anInt5680;

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
	public final int anInt5679;

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
	public final int anInt5678;

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "Lclient!cp;")
	public final Class58 aClass58_9;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(ILclient!rt;Lclient!cp;II)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass297_8 = arg1;
		this.anInt5680 = arg4;
		this.anInt5679 = arg3;
		this.anInt5678 = arg0;
		this.aClass58_9 = arg2;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)Lclient!os;")
	@Override
	public Class258 method7256() {
		return Static406.aClass258_19;
	}
}
