import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
	public final int anInt2974;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(ILclient!ee;Lclient!haa;III)V")
	public Class72_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2974 = arg5;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)Lclient!hda;")
	@Override
	public Class129 method8540() {
		return Static17.aClass129_2;
	}
}
