import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class196_Sub1 extends Class196 {

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
	public final int anInt9136;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(ILclient!kda;Lclient!cu;III)V")
	public Class196_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class173 arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9136 = arg5;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class138 method8348() {
		return Static619.aClass138_8;
	}
}
