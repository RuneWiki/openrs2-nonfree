import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	public final int anInt3832;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(ILclient!gq;Lclient!kfa;III)V")
	public Class102_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3832 = arg5;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)Lclient!qi;")
	@Override
	public Class275 method8059() {
		return Static155.aClass275_2;
	}
}
