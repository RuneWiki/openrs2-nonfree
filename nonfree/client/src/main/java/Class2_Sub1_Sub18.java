import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
	private int anInt4101 = 4096;

	@OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
	private int anInt4103 = 4096;

	@OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
	private int anInt4105 = 409;

	@OriginalMember(owner = "client!kp", name = "O", descriptor = "[I")
	private final int[] anIntArray265 = new int[3];

	@OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
	private int anInt4104 = 4096;

	static {
		new Class256("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4105 = arg1.method3711();
		} else if (arg0 == 1) {
			this.anInt4104 = arg1.method3711();
		} else if (arg0 == 2) {
			this.anInt4103 = arg1.method3711();
		} else if (arg0 == 3) {
			this.anInt4101 = arg1.method3711();
		} else if (arg0 == 4) {
			@Pc(60) int local60 = arg1.method3748();
			this.anIntArray265[2] = local60 >> 12 & 0x0;
			this.anIntArray265[0] = (local60 & 0xFF0000) << 4;
			this.anIntArray265[1] = local60 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(26) int[][] local26 = this.method6031(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static131.anInt2581; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray265[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt4105) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(100) int local100 = local34[local52];
					local66 = local100 - this.anIntArray265[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (this.anInt4105 < local66) {
						local42[local52] = local58;
						local46[local52] = local100;
						local50[local52] = local38[local52];
					} else {
						@Pc(136) int local136 = local38[local52];
						local66 = local136 - this.anIntArray265[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt4105 < local66) {
							local42[local52] = local58;
							local46[local52] = local100;
							local50[local52] = local136;
						} else {
							local42[local52] = local58 * this.anInt4101 >> 12;
							local46[local52] = local100 * this.anInt4103 >> 12;
							local50[local52] = this.anInt4104 * local136 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}
}
