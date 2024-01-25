import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
	public final int anInt4469;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILclient!dba;Lclient!pa;III)V")
	public Class9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class249 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4469 = arg5;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Lclient!ib;")
	@Override
	public Class140 method7197() {
		return Static41.aClass140_6;
	}
}
