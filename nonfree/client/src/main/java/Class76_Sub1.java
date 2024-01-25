import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!de", name = "n", descriptor = "I")
	public final int anInt1752;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(ILclient!fda;Lclient!aba;III)V")
	public Class76_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1752 = arg5;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Lclient!ve;")
	@Override
	public Class370 method7954() {
		return Static598.aClass370_9;
	}
}
