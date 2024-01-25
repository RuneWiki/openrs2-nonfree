import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class141 implements Interface24 {

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "Z")
	public final boolean aBoolean309;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "Lclient!og;")
	public final Class238 aClass238_6;

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
	public final int anInt4354;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
	public final int anInt4356;

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
	public final int anInt4358;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
	public final int anInt4355;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
	public final int anInt4353;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "Lclient!ega;")
	public final Class79 aClass79_9;

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
	public final int anInt4361;

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
	public final int anInt4357;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
	public final int anInt4360;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(ILclient!og;Lclient!ega;IIIIIIIZ)V")
	public Class141(@OriginalArg(0) int arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aBoolean309 = arg10;
		this.aClass238_6 = arg1;
		this.anInt4354 = arg9;
		this.anInt4356 = arg5;
		this.anInt4358 = arg0;
		this.anInt4355 = arg3;
		this.anInt4353 = arg7;
		this.aClass79_9 = arg2;
		this.anInt4361 = arg8;
		this.anInt4357 = arg6;
		this.anInt4360 = arg4;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)Lclient!io;")
	@Override
	public Class152 method5661() {
		return Static59.aClass152_2;
	}
}
