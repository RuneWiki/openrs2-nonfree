import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class Class132 implements Interface4 {

	@OriginalMember(owner = "client!hfa", name = "j", descriptor = "I")
	public final int anInt6610;

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
	public final int anInt6604;

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lclient!ma;")
	public final Class216 aClass216_10;

	@OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
	public final int anInt6606;

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lclient!or;")
	public final Class259 aClass259_9;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(ILclient!or;Lclient!ma;II)V")
	public Class132(@OriginalArg(0) int arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class216 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6610 = arg4;
		this.anInt6604 = arg3;
		this.aClass216_10 = arg2;
		this.anInt6606 = arg0;
		this.aClass259_9 = arg1;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)Lclient!oh;")
	@Override
	public Class252 method6715() {
		return Static40.aClass252_1;
	}
}
