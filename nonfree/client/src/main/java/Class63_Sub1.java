import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	public final int anInt1118;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(ILclient!lk;Lclient!vea;III)V")
	public Class63_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class368 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1118 = arg5;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lclient!vaa;")
	@Override
	public Class361 method8585() {
		return Static93.aClass361_19;
	}
}
