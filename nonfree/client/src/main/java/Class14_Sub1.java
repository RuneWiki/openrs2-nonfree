import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!aka", name = "n", descriptor = "I")
	public final int anInt362;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(ILclient!qk;Lclient!kr;III)V")
	public Class14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(2) Class216 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt362 = arg5;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)Lclient!wv;")
	@Override
	public Class409 method7832() {
		return Static247.aClass409_8;
	}
}
