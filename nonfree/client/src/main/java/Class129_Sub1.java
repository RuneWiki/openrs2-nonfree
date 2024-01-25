import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public final class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
	public final int anInt3277;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(ILclient!le;Lclient!qj;III)V")
	public Class129_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) Class288 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3277 = arg5;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Lclient!mha;")
	@Override
	public Class228 method8022() {
		return Static599.aClass228_11;
	}
}
