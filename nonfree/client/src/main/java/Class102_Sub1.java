import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public final class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
	public final int anInt2639;

	static {
		new Class260("", 73);
	}

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(ILclient!vfa;Lclient!rq;III)V")
	public Class102_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) Class306 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2639 = arg5;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)Lclient!ag;")
	@Override
	public Class8 method8040() {
		return Static67.aClass8_3;
	}
}
