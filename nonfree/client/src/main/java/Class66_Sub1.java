import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "[Lclient!hca;")
	public static final Class139[] aClass139Array1 = new Class139[5];

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
	public final int anInt8341;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass139Array1.length; local4++) {
			aClass139Array1[local4] = new Class139();
		}
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(ILclient!rg;Lclient!al;III)V")
	public Class66_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class293 arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8341 = arg5;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Lclient!ww;")
	@Override
	public Class384 method8182() {
		return Static548.aClass384_70;
	}
}
