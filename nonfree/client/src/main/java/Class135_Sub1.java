import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class135_Sub1 extends Class135 {

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public final int anInt10396;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(ILclient!eha;Lclient!oea;III)V")
	public Class135_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class252 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt10396 = arg5;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)Lclient!hm;")
	@Override
	public Class151 method8831() {
		return Static23.aClass151_2;
	}
}
