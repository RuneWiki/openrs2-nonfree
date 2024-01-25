import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public final class Class91_Sub1 extends Class91 {

	@OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
	public final int anInt1888;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(ILclient!jk;Lclient!tda;III)V")
	public Class91_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1888 = arg5;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)Lclient!wh;")
	@Override
	public Class392 method8802() {
		return Static186.aClass392_3;
	}
}
