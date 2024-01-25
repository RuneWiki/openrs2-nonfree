import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bja")
public final class Class2_Sub4_Sub4 extends Class2_Sub4 {

	@OriginalMember(owner = "client!bja", name = "I", descriptor = "I")
	private int anInt1193 = 5;

	@OriginalMember(owner = "client!bja", name = "E", descriptor = "I")
	private int anInt1190 = 1;

	@OriginalMember(owner = "client!bja", name = "G", descriptor = "I")
	private int anInt1191 = 2;

	@OriginalMember(owner = "client!bja", name = "H", descriptor = "I")
	private int anInt1192 = 2048;

	@OriginalMember(owner = "client!bja", name = "L", descriptor = "I")
	private int anInt1196 = 0;

	@OriginalMember(owner = "client!bja", name = "R", descriptor = "[B")
	private byte[] aByteArray7 = new byte[512];

	@OriginalMember(owner = "client!bja", name = "P", descriptor = "[S")
	private short[] aShortArray16 = new short[512];

	@OriginalMember(owner = "client!bja", name = "M", descriptor = "I")
	private int anInt1197 = 5;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)V")
	private void method1172() {
		@Pc(12) Random local12 = new Random((long) this.anInt1196);
		this.aShortArray16 = new short[512];
		if (this.anInt1192 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray16[local27] = (short) Static142.method2572(this.anInt1192, local12);
			}
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1193 = this.anInt1197 = arg0.method2859();
		} else if (arg1 == 1) {
			this.anInt1196 = arg0.method2859();
		} else if (arg1 == 2) {
			this.anInt1192 = arg0.method2825();
		} else if (arg1 == 3) {
			this.anInt1191 = arg0.method2859();
		} else if (arg1 == 4) {
			this.anInt1190 = arg0.method2859();
		} else if (arg1 == 5) {
			this.anInt1193 = arg0.method2859();
		} else if (arg1 == 6) {
			this.anInt1197 = arg0.method2859();
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(30) int local30 = this.anInt1197 * Static415.anIntArray482[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static395.anInt6816; local40++) {
				Static631.anInt10240 = Integer.MAX_VALUE;
				Static49.anInt1295 = Integer.MAX_VALUE;
				Static380.anInt10435 = Integer.MAX_VALUE;
				Static588.anInt9783 = Integer.MAX_VALUE;
				@Pc(60) int local60 = Static20.anIntArray40[local40] * this.anInt1193 + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(153) int local153;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(92) int local92 = this.aByteArray7[(this.anInt1197 > local72 ? local72 : local72 - this.anInt1197) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local64 - 1; local96 <= local68; local96++) {
						@Pc(125) int local125 = (this.aByteArray7[(this.anInt1193 <= local96 ? local96 - this.anInt1193 : local96) + local92 & 0xFF] & 0xFF) * 2;
						@Pc(130) int local130 = local60 - (local96 << 12);
						@Pc(134) int local134 = local125 + 1;
						@Pc(137) int local137 = local130 - this.aShortArray16[local125];
						@Pc(150) int local150 = local30 - this.aShortArray16[local134] - (local72 << 12);
						local153 = this.anInt1190;
						@Pc(184) int local184;
						if (local153 == 1) {
							local184 = local150 * local150 + local137 * local137 >> 12;
						} else if (local153 == 3) {
							local150 = local150 < 0 ? -local150 : local150;
							local137 = local137 >= 0 ? local137 : -local137;
							local184 = local150 < local137 ? local137 : local150;
						} else if (local153 == 4) {
							local137 = (int) (Math.sqrt((double) ((float) (local137 < 0 ? -local137 : local137) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 < 0 ? -local150 : local150) / 4096.0F)) * 4096.0D);
							local184 = local150 + local137;
							local184 = local184 * local184 >> 12;
						} else if (local153 == 5) {
							local150 *= local150;
							local137 *= local137;
							local184 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local150 + local137) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local184 = (local150 < 0 ? -local150 : local150) + (local137 < 0 ? -local137 : local137);
						} else {
							local184 = (int) (Math.sqrt((double) ((float) (local137 * local137 + local150 * local150) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static588.anInt9783 > local184) {
							Static631.anInt10240 = Static49.anInt1295;
							Static49.anInt1295 = Static380.anInt10435;
							Static380.anInt10435 = Static588.anInt9783;
							Static588.anInt9783 = local184;
						} else if (local184 < Static380.anInt10435) {
							Static631.anInt10240 = Static49.anInt1295;
							Static49.anInt1295 = Static380.anInt10435;
							Static380.anInt10435 = local184;
						} else if (local184 < Static49.anInt1295) {
							Static631.anInt10240 = Static49.anInt1295;
							Static49.anInt1295 = local184;
						} else if (Static631.anInt10240 > local184) {
							Static631.anInt10240 = local184;
						}
					}
				}
				local153 = this.anInt1191;
				if (local153 == 0) {
					local16[local40] = Static588.anInt9783;
				} else if (local153 == 1) {
					local16[local40] = Static380.anInt10435;
				} else if (local153 == 3) {
					local16[local40] = Static49.anInt1295;
				} else if (local153 == 4) {
					local16[local40] = Static631.anInt10240;
				} else if (local153 == 2) {
					local16[local40] = Static380.anInt10435 - Static588.anInt9783;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bja", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		this.aByteArray7 = Static415.method6263(this.anInt1196);
		this.method1172();
	}
}
