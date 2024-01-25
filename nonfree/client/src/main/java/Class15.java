import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public abstract class Class15 {

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "I")
	private int anInt9841 = 0;

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "I")
	protected int anInt9843 = 4;

	@OriginalMember(owner = "client!aia", name = "h", descriptor = "I")
	private int anInt9845 = 4;

	@OriginalMember(owner = "client!aia", name = "g", descriptor = "I")
	private int anInt9844 = 4;

	@OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
	private int anInt9846 = 4;

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "[S")
	private final short[] aShortArray123 = new short[512];

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(IIIII)V")
	protected Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9843 = arg1;
		this.anInt9846 = arg4;
		this.anInt9841 = arg0;
		this.anInt9844 = arg3;
		this.anInt9845 = arg2;
		this.method8198();
		this.method8200();
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)V")
	protected abstract void method8196();

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIII)V")
	protected final void method8197() {
		@Pc(10) int[] local10 = new int[128];
		@Pc(13) int[] local13 = new int[128];
		for (@Pc(15) int local15 = 0; local15 < 128; local15++) {
			local10[local15] = (local15 << 12) / 128;
		}
		@Pc(31) int[] local31 = new int[16];
		for (@Pc(33) int local33 = 0; local33 < 128; local33++) {
			local13[local33] = (local33 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local31[local52] = (local52 << 12) / 16;
		}
		this.method8202();
		for (@Pc(70) int local70 = 0; local70 < 16; local70++) {
			for (@Pc(73) int local73 = 0; local73 < 128; local73++) {
				for (@Pc(76) int local76 = 0; local76 < 128; local76++) {
					for (@Pc(79) int local79 = 0; local79 < this.anInt9843; local79++) {
						@Pc(87) int local87 = this.aShortArray122[local79] << 12;
						@Pc(94) int local94 = this.anInt9844 * local87 >> 12;
						@Pc(101) int local101 = this.anInt9845 * local87 >> 12;
						@Pc(109) int local109 = local13[local73] * local87 >> 12;
						@Pc(117) int local117 = local87 * local31[local70] >> 12;
						@Pc(124) int local124 = local87 * this.anInt9846 >> 12;
						@Pc(132) int local132 = local87 * local10[local76] >> 12;
						@Pc(137) int local137 = local117 * this.anInt9846;
						@Pc(142) int local142 = local109 * this.anInt9844;
						@Pc(147) int local147 = local132 * this.anInt9845;
						@Pc(151) int local151 = local147 >> 12;
						@Pc(155) int local155 = local151 + 1;
						@Pc(159) int local159 = local151 & 0xFF;
						@Pc(163) int local163 = local142 >> 12;
						@Pc(167) int local167 = local163 + 1;
						@Pc(171) int local171 = local163 & 0xFF;
						@Pc(175) int local175 = local137 >> 12;
						@Pc(179) int local179 = local175 + 1;
						if (local179 >= local124) {
							local179 = 0;
						} else {
							local179 &= 0xFF;
						}
						local109 = local142 & 0xFFF;
						if (local167 >= local94) {
							local167 = 0;
						} else {
							local167 &= 0xFF;
						}
						local175 &= 0xFF;
						local117 = local137 & 0xFFF;
						local132 = local147 & 0xFFF;
						if (local155 < local101) {
							local155 &= 0xFF;
						} else {
							local155 = 0;
						}
						@Pc(237) int local237 = Class177.anIntArray252[local132];
						@Pc(241) int local241 = local117 - 4096;
						@Pc(245) int local245 = Class177.anIntArray252[local117];
						@Pc(249) int local249 = local109 - 4096;
						@Pc(253) int local253 = local132 - 4096;
						@Pc(257) int local257 = Class177.anIntArray252[local109];
						@Pc(262) short local262 = this.aShortArray123[local179];
						@Pc(267) short local267 = this.aShortArray123[local175];
						@Pc(275) short local275 = this.aShortArray123[local171 + local262];
						@Pc(282) short local282 = this.aShortArray123[local262 + local167];
						@Pc(289) short local289 = this.aShortArray123[local171 + local267];
						@Pc(296) short local296 = this.aShortArray123[local267 + local167];
						@Pc(308) int local308 = Static618.method8281(local132, local117, local109, this.aShortArray123[local289 + local159]);
						@Pc(320) int local320 = Static618.method8281(local253, local117, local109, this.aShortArray123[local289 + local155]);
						@Pc(331) int local331 = ((local320 - local308) * local237 >> 12) + local308;
						@Pc(343) int local343 = Static618.method8281(local132, local117, local249, this.aShortArray123[local296 + local159]);
						@Pc(355) int local355 = Static618.method8281(local253, local117, local249, this.aShortArray123[local296 + local155]);
						@Pc(366) int local366 = local343 + (local237 * (local355 - local343) >> 12);
						@Pc(379) int local379 = Static618.method8281(local132, local241, local109, this.aShortArray123[local159 + local275]);
						@Pc(390) int local390 = (local257 * (local366 - local331) >> 12) + local331;
						@Pc(403) int local403 = Static618.method8281(local253, local241, local109, this.aShortArray123[local155 + local275]);
						@Pc(414) int local414 = (local237 * (local403 - local379) >> 12) + local379;
						@Pc(426) int local426 = Static618.method8281(local132, local241, local249, this.aShortArray123[local159 + local282]);
						@Pc(438) int local438 = Static618.method8281(local253, local241, local249, this.aShortArray123[local282 + local155]);
						@Pc(448) int local448 = ((local438 - local426) * local237 >> 12) + local426;
						@Pc(459) int local459 = ((local448 - local414) * local257 >> 12) + local414;
						this.method8201(local390 + (local245 * (local459 - local390) >> 12), local79);
					}
					this.method8196();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Z)V")
	private void method8198() {
		this.aShortArray122 = new short[this.anInt9843];
		for (@Pc(10) int local10 = 0; local10 < this.anInt9843; local10++) {
			this.aShortArray122[local10] = (short) (int) Math.pow(2.0D, (double) local10);
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
	private void method8200() {
		@Pc(10) Random local10 = new Random((long) this.anInt9841);
		for (@Pc(16) int local16 = 0; local16 < 255; local16++) {
			this.aShortArray123[local16] = (short) local16;
		}
		for (@Pc(31) int local31 = 0; local31 < 255; local31++) {
			@Pc(37) int local37 = 255 - local31;
			@Pc(42) int local42 = Static653.method8578(local37, local10);
			@Pc(47) short local47 = this.aShortArray123[local42];
			this.aShortArray123[local42] = this.aShortArray123[local37];
			this.aShortArray123[local37] = this.aShortArray123[local37 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(III)V")
	protected abstract void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)V")
	protected abstract void method8202();
}
