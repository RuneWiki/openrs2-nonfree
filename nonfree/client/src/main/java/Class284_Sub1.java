import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public final class Class284_Sub1 extends Class284 {

	@OriginalMember(owner = "client!uea", name = "o", descriptor = "I")
	public final int anInt9601;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(ILclient!ffa;Lclient!oca;III)V")
	public Class284_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9601 = arg5;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)Lclient!fl;")
	@Override
	public Class103 method7774() {
		return Static366.aClass103_5;
	}
}
