import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class253 {

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "[I")
	public static final int[] anIntArray583 = new int[120];

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "Lclient!sv;")
	public Class2_Sub8_Sub4 aClass2_Sub8_Sub4_4;

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "Lclient!ko;")
	public Class149 aClass149_1;

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "Lclient!lf;")
	public Class2_Sub14_Sub1 aClass2_Sub14_Sub1_2;

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "Lclient!u;")
	public Class2_Sub41 aClass2_Sub41_1;

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
	public int anInt7201;

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "B")
	public final byte aByte90;

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
	public final int anInt7198;

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
	public final int anInt7197;

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
	public final int anInt7199;

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
	public final int anInt7200;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray583[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(BIIIII)V")
	public Class253(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7201 = arg3;
		this.aByte90 = arg0;
		this.anInt7198 = arg5;
		this.anInt7197 = arg1;
		this.anInt7199 = arg2;
		this.anInt7200 = arg4;
	}
}
