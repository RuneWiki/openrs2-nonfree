import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class1_Sub5_Sub25 extends Class1_Sub5 {

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
	private int anInt5108 = 2048;

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
	private int anInt5109 = 3072;

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
	private int anInt5111 = 1024;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(25) int[] local25 = this.method5802(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static75.anInt1566; local27++) {
				local11[local27] = (local25[local27] * this.anInt5108 >> 12) + this.anInt5111;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		this.anInt5108 = this.anInt5109 - this.anInt5111;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5111 = arg0.method5715();
		} else if (arg1 == 1) {
			this.anInt5109 = arg0.method5715();
		} else if (arg1 == 2) {
			super.aBoolean552 = arg0.method5720() == 1;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(26) int[][] local26 = this.method5807(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static75.anInt1566; local52++) {
				local42[local52] = (this.anInt5108 * local30[local52] >> 12) + this.anInt5111;
				local46[local52] = this.anInt5111 + (this.anInt5108 * local34[local52] >> 12);
				local50[local52] = this.anInt5111 + (this.anInt5108 * local38[local52] >> 12);
			}
		}
		return local16;
	}
}
