import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class200 {

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "Lclient!vs;")
	public Class4_Sub43 aClass4_Sub43_1;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "Lclient!uq;")
	public Class4_Sub35_Sub1 aClass4_Sub35_Sub1_1;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!rb;")
	public Class4_Sub18_Sub2 aClass4_Sub18_Sub2_1;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "Lclient!dw;")
	public Class55 aClass55_1;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
	public final int anInt5831;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
	public final int anInt5826;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	public final int anInt5828;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
	public int anInt5830;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "B")
	public final byte aByte83;

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
	public final int anInt5833;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(BIIIII)V")
	public Class200(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5831 = arg4;
		this.anInt5826 = arg1;
		this.anInt5828 = arg2;
		this.anInt5830 = arg3;
		this.aByte83 = arg0;
		this.anInt5833 = arg5;
	}
}
