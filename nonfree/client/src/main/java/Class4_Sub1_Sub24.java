import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class4_Sub1_Sub24 extends Class4_Sub1 {

	@OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
	private int anInt7008;

	@OriginalMember(owner = "client!nu", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
	private int anInt7011;

	@OriginalMember(owner = "client!nu", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!nu", name = "Q", descriptor = "I")
	private int anInt7018;

	@OriginalMember(owner = "client!nu", name = "W", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
	private int anInt7007 = 4;

	@OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
	private int anInt7010 = 1024;

	@OriginalMember(owner = "client!nu", name = "P", descriptor = "I")
	private int anInt7017 = 204;

	@OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
	private int anInt7016 = 8;

	@OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
	private int anInt7014 = 81;

	@OriginalMember(owner = "client!nu", name = "X", descriptor = "I")
	private int anInt7023 = 0;

	@OriginalMember(owner = "client!nu", name = "V", descriptor = "I")
	private int anInt7022 = 1024;

	@OriginalMember(owner = "client!nu", name = "T", descriptor = "I")
	private int anInt7020 = 409;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)V")
	private void method5834() {
		@Pc(12) Random local12 = new Random((long) this.anInt7016);
		this.anInt7011 = 4096 / this.anInt7016;
		this.anInt7018 = 4096 / this.anInt7007;
		this.anInt7008 = this.anInt7014 / 2;
		@Pc(35) int local35 = this.anInt7018 / 2;
		this.anIntArrayArray40 = new int[this.anInt7016][this.anInt7007];
		this.anIntArray363 = new int[this.anInt7016 + 1];
		@Pc(54) int local54 = this.anInt7011 / 2;
		this.anIntArrayArray39 = new int[this.anInt7016][this.anInt7007 + 1];
		this.anIntArray363[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt7016; local70++) {
			@Pc(77) int local77;
			@Pc(89) int local89;
			if (local70 > 0) {
				local77 = this.anInt7011;
				local89 = (Static406.method6391(local12, 4096) - 2048) * this.anInt7017 >> 12;
				@Pc(97) int local97 = local77 + (local54 * local89 >> 12);
				this.anIntArray363[local70] = this.anIntArray363[local70 - 1] + local97;
			}
			this.anIntArrayArray39[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt7007; local77++) {
				if (local77 > 0) {
					local89 = this.anInt7018;
					@Pc(137) int local137 = (Static406.method6391(local12, 4096) - 2048) * this.anInt7020 >> 12;
					local89 += local35 * local137 >> 12;
					this.anIntArrayArray39[local70][local77] = this.anIntArrayArray39[local70][local77 - 1] + local89;
				}
				this.anIntArrayArray40[local70][local77] = this.anInt7022 > 0 ? 4096 - Static406.method6391(local12, this.anInt7022) : 4096;
			}
			this.anIntArrayArray39[local70][this.anInt7007] = 4096;
		}
		this.anIntArray363[this.anInt7016] = 4096;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt7007 = arg1.method4905();
		} else if (arg0 == 1) {
			this.anInt7016 = arg1.method4905();
		} else if (arg0 == 2) {
			this.anInt7020 = arg1.method4936();
		} else if (arg0 == 3) {
			this.anInt7017 = arg1.method4936();
		} else if (arg0 == 4) {
			this.anInt7010 = arg1.method4936();
		} else if (arg0 == 5) {
			this.anInt7023 = arg1.method4936();
		} else if (arg0 == 6) {
			this.anInt7014 = arg1.method4936();
		} else if (arg0 == 7) {
			this.anInt7022 = arg1.method4936();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		this.method5834();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(25) int local25 = 0;
			@Pc(33) int local33;
			for (local33 = Static442.anIntArray449[arg0] + this.anInt7023; local33 < 0; local33 += 4096) {
			}
			while (local33 > 4096) {
				local33 -= 4096;
			}
			while (this.anInt7016 > local25 && this.anIntArray363[local25] <= local33) {
				local25++;
			}
			@Pc(70) int local70 = local25 - 1;
			@Pc(81) boolean local81 = (local25 & 0x1) == 0;
			@Pc(86) int local86 = this.anIntArray363[local25];
			@Pc(93) int local93 = this.anIntArray363[local25 - 1];
			if (local93 + this.anInt7008 < local33 && local33 < local86 - this.anInt7008) {
				for (@Pc(119) int local119 = 0; local119 < Static376.anInt7260; local119++) {
					@Pc(130) int local130 = local81 ? this.anInt7010 : -this.anInt7010;
					@Pc(132) int local132 = 0;
					@Pc(143) int local143;
					for (local143 = Static292.anIntArray394[local119] + (this.anInt7018 * local130 >> 12); local143 < 0; local143 += 4096) {
					}
					while (local143 > 4096) {
						local143 -= 4096;
					}
					while (local132 < this.anInt7007 && local143 >= this.anIntArrayArray39[local70][local132]) {
						local132++;
					}
					@Pc(179) int local179 = local132 - 1;
					@Pc(186) int local186 = this.anIntArrayArray39[local70][local179];
					@Pc(193) int local193 = this.anIntArrayArray39[local70][local132];
					if (local143 > local186 + this.anInt7008 && local193 - this.anInt7008 > local143) {
						local19[local119] = this.anIntArrayArray40[local70][local179];
					} else {
						local19[local119] = 0;
					}
				}
			} else {
				Static597.method3724(local19, 0, Static376.anInt7260, 0);
			}
		}
		return local19;
	}
}
