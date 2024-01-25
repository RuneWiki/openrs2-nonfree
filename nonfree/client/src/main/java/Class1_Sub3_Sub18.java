import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
	private int anInt3233;

	@OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
	private int anInt3238;

	@OriginalMember(owner = "client!jr", name = "W", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!jr", name = "Z", descriptor = "I")
	private int anInt3245 = -1;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub18() {
		super(0, false);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(42) int local42 = (this.anInt3233 == Static319.anInt6144 ? arg0 : arg0 * this.anInt3233 / Static319.anInt6144) * this.anInt3238;
			@Pc(46) int[] local46 = local18[0];
			@Pc(50) int[] local50 = local18[1];
			@Pc(54) int[] local54 = local18[2];
			@Pc(64) int local64;
			@Pc(72) int local72;
			if (Static153.anInt3378 == this.anInt3238) {
				for (local64 = 0; local64 < Static153.anInt3378; local64++) {
					local72 = this.anIntArray272[local42++];
					local54[local64] = (local72 & 0xFF) << 4;
					local50[local64] = local72 >> 4 & 0xFF0;
					local46[local64] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static153.anInt3378; local64++) {
					local72 = this.anInt3238 * local64 / Static153.anInt3378;
					@Pc(121) int local121 = this.anIntArray272[local42 + local72];
					local54[local64] = (local121 & 0xFF) << 4;
					local50[local64] = local121 >> 4 & 0xFF0;
					local46[local64] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3245 = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
	@Override
	public void method5536() {
		super.method5536();
		this.anIntArray272 = null;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(III)V")
	@Override
	public void method5531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method5531(arg0, arg1);
		if (this.anInt3245 >= 0 && Static208.anInterface2_8 != null) {
			@Pc(27) int local27 = Static208.anInterface2_8.method4244(this.anInt3245).aBoolean440 ? 64 : 128;
			this.anIntArray272 = Static208.anInterface2_8.method4243(local27, this.anInt3245, 1.0F, local27, false);
			this.anInt3238 = local27;
			this.anInt3233 = local27;
		}
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)I")
	@Override
	public int method5527() {
		return this.anInt3245;
	}
}
