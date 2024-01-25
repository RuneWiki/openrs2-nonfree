import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
	public final int anInt788;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(ILclient!pf;Lclient!dg;III)V")
	public Class46_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class275 arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt788 = arg5;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)Lclient!gp;")
	@Override
	public Class139 method8810() {
		return Static3.aClass139_1;
	}
}
