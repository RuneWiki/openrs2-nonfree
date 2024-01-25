import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class2_Sub4_Sub26 extends Class2_Sub4 {

	@OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
	private int anInt4876;

	@OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
	private int anInt4878;

	@OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
	private int anInt4881;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub26() {
		this(0);
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I)V")
	private Class2_Sub4_Sub26(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4298(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static76.anInt1458; local34++) {
				local24[local34] = this.anInt4881;
				local28[local34] = this.anInt4876;
				local32[local34] = this.anInt4878;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
	private void method4298(@OriginalArg(0) int arg0) {
		this.anInt4876 = arg0 >> 4 & 0xFF0;
		this.anInt4878 = (arg0 & 0xFF) << 4;
		this.anInt4881 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method4298(arg0.method5356());
		}
	}
}
