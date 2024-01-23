import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public class Class4_Sub1_Sub21 extends Class4_Sub1 {

	@OriginalMember(owner = "client!og", name = "T", descriptor = "I")
	protected int anInt5838;

	@OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
	protected int anInt5847;

	@OriginalMember(owner = "client!og", name = "jb", descriptor = "[I")
	protected int[] anIntArray655;

	@OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
	private int anInt5851 = -1;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub21() {
		super(0, false);
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)Z")
	protected final boolean method4739() {
		if (this.anIntArray655 != null) {
			return true;
		} else if (this.anInt5851 >= 0) {
			@Pc(38) Class4_Sub3_Sub14_Sub1 local38 = Static227.anInt4367 < 0 ? Static165.method2692(Static12.aClass58_7, this.anInt5851) : Static164.method2667(Static12.aClass58_7, Static227.anInt4367, this.anInt5851);
			local38.method2177();
			this.anIntArray655 = local38.anIntArray241;
			this.anInt5847 = local38.anInt5610;
			this.anInt5838 = local38.anInt5609;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5851 = arg0.method4653();
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
	@Override
	public final void method4733() {
		super.method4733();
		this.anIntArray655 = null;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)I")
	@Override
	public final int method4725() {
		return this.anInt5851;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230 && this.method4739()) {
			@Pc(32) int[] local32 = local16[0];
			@Pc(36) int[] local36 = local16[1];
			@Pc(40) int[] local40 = local16[2];
			@Pc(60) int local60 = (Static25.anInt379 == this.anInt5838 ? arg0 : arg0 * this.anInt5838 / Static25.anInt379) * this.anInt5847;
			@Pc(70) int local70;
			@Pc(79) int local79;
			if (this.anInt5847 == Static73.anInt1626) {
				for (local70 = 0; local70 < Static73.anInt1626; local70++) {
					local79 = this.anIntArray655[local60++];
					local40[local70] = (local79 & 0xFF) << 4;
					local36[local70] = local79 >> 4 & 0xFF0;
					local32[local70] = local79 >> 12 & 0xFF0;
				}
			} else {
				for (local70 = 0; local70 < Static73.anInt1626; local70++) {
					local79 = this.anInt5847 * local70 / Static73.anInt1626;
					@Pc(127) int local127 = this.anIntArray655[local79 + local60];
					local40[local70] = (local127 & 0xFF) << 4;
					local36[local70] = local127 >> 4 & 0xFF0;
					local32[local70] = local127 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
