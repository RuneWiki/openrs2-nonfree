import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class225_Sub1 extends Class225 {

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
	public final int anInt6163;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(ILclient!nv;Lclient!kka;III)V")
	public Class225_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6163 = arg5;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)Lclient!c;")
	@Override
	public Class51 method9393() {
		return Static92.aClass51_35;
	}
}
