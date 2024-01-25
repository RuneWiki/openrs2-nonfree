import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class6_Sub5_Sub16 extends Class6_Sub5 {

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
	private int anInt2974;

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
	private int anInt2977;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
	private int anInt2978;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
	private Class6_Sub5_Sub16(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2486(arg0);
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub16() {
		this(0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.method2486(arg1.method6435());
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static240.anInt4386; local34++) {
				local24[local34] = this.anInt2977;
				local28[local34] = this.anInt2974;
				local32[local34] = this.anInt2978;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)V")
	private void method2486(@OriginalArg(0) int arg0) {
		this.anInt2974 = arg0 >> 4 & 0xFF0;
		this.anInt2978 = (arg0 & 0xFF) << 4;
		this.anInt2977 = arg0 >> 12 & 0xFF0;
	}
}
