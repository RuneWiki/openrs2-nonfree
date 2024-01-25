import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class234 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
	public static final int[] anIntArray474 = new int[120];

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!hp;")
	private final Class134_Sub1_Sub1 aClass134_Sub1_Sub1_8;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "J")
	public final long aLong192;

	static {
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 120; local11++) {
			@Pc(16) int local16 = local11 + 1;
			@Pc(29) int local29 = (int) ((double) local16 + Math.pow(2.0D, (double) local16 / 7.0D) * 300.0D);
			local9 += local29;
			anIntArray474[local11] = local9 / 4;
		}
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!hp;JI)V")
	public Class234(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass134_Sub1_Sub1_8 = arg0;
		this.aLong192 = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass134_Sub1_Sub1_8.method3208(this.aLong192);
		super.finalize();
	}
}
