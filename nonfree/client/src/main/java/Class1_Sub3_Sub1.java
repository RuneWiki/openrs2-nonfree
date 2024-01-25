import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!af", name = "jb", descriptor = "[Lclient!bv;")
	private static final Class39[] aClass39Array1 = new Class39[32];

	@OriginalMember(owner = "client!af", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!af", name = "M", descriptor = "[I")
	private final int[] anIntArray24 = new int[3];

	@OriginalMember(owner = "client!af", name = "O", descriptor = "I")
	private int anInt273 = 4096;

	@OriginalMember(owner = "client!af", name = "R", descriptor = "I")
	private int anInt275 = 3216;

	@OriginalMember(owner = "client!af", name = "S", descriptor = "I")
	private int anInt276 = 3216;

	static {
		@Pc(89) Class39[] local89 = Static529.method8236();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass39Array1[local89[local91].anInt1272] = local89[local91];
		}
		lb = 0;
		new Class155("", 76);
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
	private void method478() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt275 / 4096.0F));
		this.anIntArray24[0] = (int) (local11 * Math.sin((double) ((float) this.anInt276 / 4096.0F)) * 4096.0D);
		this.anIntArray24[1] = (int) (Math.cos((double) ((float) this.anInt276 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray24[2] = (int) (Math.sin((double) ((float) this.anInt275 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray24[0] * this.anIntArray24[0] >> 12;
		@Pc(81) int local81 = this.anIntArray24[1] * this.anIntArray24[1] >> 12;
		@Pc(93) int local93 = this.anIntArray24[2] * this.anIntArray24[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local69 + local81 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray24[0] = (this.anIntArray24[0] << 12) / local106;
			this.anIntArray24[2] = (this.anIntArray24[2] << 12) / local106;
			this.anIntArray24[1] = (this.anIntArray24[1] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		this.method478();
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(27) int local27 = Static43.anInt6555 * this.anInt273 >> 12;
			@Pc(37) int[] local37 = this.method8201(0, Static109.anInt2298 & arg0 - 1);
			@Pc(43) int[] local43 = this.method8201(0, arg0);
			@Pc(53) int[] local53 = this.method8201(0, Static109.anInt2298 & arg0 + 1);
			for (@Pc(55) int local55 = 0; local55 < Static254.anInt4973; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(91) int local91 = local27 * (local43[local55 - 1 & Static184.anInt3830] - local43[Static184.anInt3830 & local55 + 1]) >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				@Pc(107) int local107 = local70 >> 4;
				if (local107 < 0) {
					local107 = -local107;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local107 > 255) {
					local107 = 255;
				}
				@Pc(141) int local141 = Class20_Sub5_Sub3.aByteArray109[local95 + ((local107 + 1) * local107 >> 1)] & 0xFF;
				@Pc(147) int local147 = local70 * local141 >> 8;
				@Pc(153) int local153 = local141 * local91 >> 8;
				@Pc(159) int local159 = local141 * 4096 >> 8;
				@Pc(168) int local168 = this.anIntArray24[2] * local159 >> 12;
				@Pc(177) int local177 = local153 * this.anIntArray24[0] >> 12;
				@Pc(186) int local186 = local147 * this.anIntArray24[1] >> 12;
				local16[local55] = local177 + local186 + local168;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt273 = arg1.method4494();
		} else if (arg0 == 1) {
			this.anInt276 = arg1.method4494();
		} else if (arg0 == 2) {
			this.anInt275 = arg1.method4494();
		}
	}
}
