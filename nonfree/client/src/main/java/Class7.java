import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class7 {

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!in;")
	public Class110 aClass110_1;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!cv;")
	public Class4_Sub9_Sub1 aClass4_Sub9_Sub1_1;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Lclient!cg;")
	public Class4_Sub7_Sub1 aClass4_Sub7_Sub1_1;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!ql;")
	public Class4_Sub34 aClass4_Sub34_1;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "I")
	public final int anInt61;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public final int anInt59;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public final int anInt62;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public final int anInt64;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	public int anInt63;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "B")
	public final byte aByte1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(BIIIII)V")
	public Class7(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt61 = arg1;
		this.anInt59 = arg2;
		this.anInt62 = arg5;
		this.anInt64 = arg4;
		this.anInt63 = arg3;
		this.aByte1 = arg0;
	}
}
