import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public class Class5_Sub1_Sub23 extends Class5_Sub1 {

	@OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
	protected int anInt3718;

	@OriginalMember(owner = "client!nj", name = "Q", descriptor = "[I")
	protected int[] anIntArray381;

	@OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
	protected int anInt3727;

	@OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
	private int anInt3720 = -1;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub23() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public final void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3720 = arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	@Override
	public final void method3189() {
		super.method3189();
		this.anIntArray381 = null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183 && this.method2806()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(59) int local59 = this.anInt3727 * (Static207.anInt4072 == this.anInt3718 ? arg0 : this.anInt3718 * arg0 / Static207.anInt4072);
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (Static174.anInt3489 == this.anInt3727) {
				for (local65 = 0; local65 < Static174.anInt3489; local65++) {
					local73 = this.anIntArray381[local59++];
					local39[local65] = (local73 & 0xFF) << 4;
					local35[local65] = local73 >> 4 & 0xFF0;
					local31[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static174.anInt3489; local65++) {
					local73 = local65 * this.anInt3727 / Static174.anInt3489;
					@Pc(121) int local121 = this.anIntArray381[local73 + local59];
					local39[local65] = (local121 & 0xFF) << 4;
					local35[local65] = local121 >> 4 & 0xFF0;
					local31[local65] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)Z")
	protected final boolean method2806() {
		if (this.anIntArray381 != null) {
			return true;
		} else if (this.anInt3720 >= 0) {
			@Pc(25) Class5_Sub2_Sub10_Sub1 local25 = Static118.method2459(this.anInt3720, Static104.aClass23_41);
			local25.method2426();
			this.anInt3727 = local25.anInt3212;
			this.anInt3718 = local25.anInt3209;
			this.anIntArray381 = local25.anIntArray347;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)I")
	@Override
	public final int method3197() {
		return this.anInt3720;
	}
}
