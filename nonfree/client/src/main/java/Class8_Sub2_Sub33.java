import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class8_Sub2_Sub33 extends Class8_Sub2 {

	@OriginalMember(owner = "client!tq", name = "Q", descriptor = "I")
	private int anInt9612 = 2048;

	@OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
	private int anInt9611 = 1;

	@OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
	private int anInt9609 = 2;

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "[S")
	private short[] aShortArray118 = new short[512];

	@OriginalMember(owner = "client!tq", name = "Y", descriptor = "I")
	private int anInt9619 = 5;

	@OriginalMember(owner = "client!tq", name = "R", descriptor = "[B")
	private byte[] aByteArray88 = new byte[512];

	@OriginalMember(owner = "client!tq", name = "U", descriptor = "I")
	private int anInt9615 = 0;

	@OriginalMember(owner = "client!tq", name = "T", descriptor = "I")
	private int anInt9614 = 5;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)V")
	private void method7772() {
		@Pc(12) Random local12 = new Random((long) this.anInt9615);
		this.aShortArray118 = new short[512];
		if (this.anInt9612 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray118[local28] = (short) Static221.method4149(this.anInt9612, local12);
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt9619 = this.anInt9614 = arg1.method8525();
		} else if (arg0 == 1) {
			this.anInt9615 = arg1.method8525();
		} else if (arg0 == 2) {
			this.anInt9612 = arg1.method8578();
		} else if (arg0 == 3) {
			this.anInt9609 = arg1.method8525();
		} else if (arg0 == 4) {
			this.anInt9611 = arg1.method8525();
		} else if (arg0 == 5) {
			this.anInt9619 = arg1.method8525();
		} else if (arg0 == 6) {
			this.anInt9614 = arg1.method8525();
		}
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		this.aByteArray88 = Static405.method6420(this.anInt9615);
		this.method7772();
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(30) int local30 = Static426.anIntArray424[arg0] * this.anInt9614 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static538.anInt9297; local40++) {
				Static468.anInt10549 = Integer.MAX_VALUE;
				Static369.anInt7015 = Integer.MAX_VALUE;
				Static383.anInt7459 = Integer.MAX_VALUE;
				Static450.anInt8291 = Integer.MAX_VALUE;
				@Pc(60) int local60 = this.anInt9619 * Static93.anIntArray111[local40] + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(153) int local153;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(96) int local96 = this.aByteArray88[(local72 < this.anInt9614 ? local72 : local72 - this.anInt9614) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local64 - 1; local100 <= local68; local100++) {
						@Pc(125) int local125 = (this.aByteArray88[(this.anInt9619 > local100 ? local100 : local100 - this.anInt9619) + local96 & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = -(local100 << 12);
						@Pc(133) int local133 = local125 + 1;
						@Pc(138) int local138 = local129 + local60 - this.aShortArray118[local125];
						@Pc(150) int local150 = local30 - this.aShortArray118[local133] - (local72 << 12);
						local153 = this.anInt9611;
						@Pc(186) int local186;
						if (local153 == 1) {
							local186 = local150 * local150 + local138 * local138 >> 12;
						} else if (local153 == 3) {
							local138 = local138 < 0 ? -local138 : local138;
							local150 = local150 < 0 ? -local150 : local150;
							local186 = local150 >= local138 ? local150 : local138;
						} else if (local153 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 >= 0 ? local138 : -local138) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 < 0 ? -local150 : local150) / 4096.0F)) * 4096.0D);
							local186 = local138 + local150;
							local186 = local186 * local186 >> 12;
						} else if (local153 == 5) {
							local150 *= local150;
							local138 *= local138;
							local186 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local138 + local150) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local186 = (local150 < 0 ? -local150 : local150) + (local138 >= 0 ? local138 : -local138);
						} else {
							local186 = (int) (Math.sqrt((double) ((float) (local138 * local138 + local150 * local150) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static450.anInt8291 > local186) {
							Static468.anInt10549 = Static369.anInt7015;
							Static369.anInt7015 = Static383.anInt7459;
							Static383.anInt7459 = Static450.anInt8291;
							Static450.anInt8291 = local186;
						} else if (local186 < Static383.anInt7459) {
							Static468.anInt10549 = Static369.anInt7015;
							Static369.anInt7015 = Static383.anInt7459;
							Static383.anInt7459 = local186;
						} else if (local186 < Static369.anInt7015) {
							Static468.anInt10549 = Static369.anInt7015;
							Static369.anInt7015 = local186;
						} else if (Static468.anInt10549 > local186) {
							Static468.anInt10549 = local186;
						}
					}
				}
				local153 = this.anInt9609;
				if (local153 == 0) {
					local11[local40] = Static450.anInt8291;
				} else if (local153 == 1) {
					local11[local40] = Static383.anInt7459;
				} else if (local153 == 3) {
					local11[local40] = Static369.anInt7015;
				} else if (local153 == 4) {
					local11[local40] = Static468.anInt10549;
				} else if (local153 == 2) {
					local11[local40] = Static383.anInt7459 - Static450.anInt8291;
				}
			}
		}
		return local11;
	}
}
