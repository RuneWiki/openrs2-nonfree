import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class6_Sub46 extends Class6 {

	@OriginalMember(owner = "client!uea", name = "B", descriptor = "[Lclient!cf;")
	private static final Class46[] aClass46Array1 = new Class46[32];

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "Z")
	public final boolean aBoolean640;

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
	public final int anInt8825;

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
	public final int anInt8823;

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
	public final int anInt8826;

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
	public final int anInt8822;

	@OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
	public final int anInt8827;

	static {
		@Pc(91) Class46[] local91 = Static420.method5999();
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			aClass46Array1[local91[local93].anInt1234] = local91[local93];
		}
	}

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class6_Sub46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean640 = arg5;
		this.anInt8825 = arg1;
		this.anInt8823 = arg3;
		this.anInt8826 = arg2;
		this.anInt8822 = arg0;
		this.anInt8827 = arg4;
	}
}
