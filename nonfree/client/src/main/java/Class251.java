import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class251 implements Interface19 {

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
	public final int anInt6759;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	public final int anInt6757;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
	public final int anInt6760;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	public final int anInt6758;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!rt;")
	public final Class297 aClass297_9;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Z")
	public final boolean aBoolean502;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Lclient!cp;")
	public final Class58 aClass58_10;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
	public final int anInt6752;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
	public final int anInt6753;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
	public final int anInt6754;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
	public final int anInt6756;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(ILclient!rt;Lclient!cp;IIIIIIIZ)V")
	public Class251(@OriginalArg(0) int arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt6759 = arg7;
		this.anInt6757 = arg9;
		this.anInt6760 = arg0;
		this.anInt6758 = arg6;
		this.aClass297_9 = arg1;
		this.aBoolean502 = arg10;
		this.aClass58_10 = arg2;
		this.anInt6752 = arg5;
		this.anInt6753 = arg8;
		this.anInt6754 = arg4;
		this.anInt6756 = arg3;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)Lclient!os;")
	@Override
	public Class258 method7256() {
		return Static240.aClass258_12;
	}
}
