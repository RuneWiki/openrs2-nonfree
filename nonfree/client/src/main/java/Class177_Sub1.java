import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class177_Sub1 extends Class177 {

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
	public final int anInt9735;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(ILclient!ida;Lclient!ce;III)V")
	public Class177_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class148 arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9735 = arg5;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Lclient!qv;")
	@Override
	public Class271 method8097() {
		return Static502.aClass271_7;
	}
}
