import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class2_Sub3_Sub38 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
	private int anInt6713 = 4096;

	@OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
	private int anInt6715 = 16;

	@OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
	private int anInt6718 = 0;

	@OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
	private int anInt6719 = 0;

	@OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
	private int anInt6721 = 2000;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(28) int local28 = this.anInt6713 >> 1;
			@Pc(33) int[][] local33 = super.aClass137_41.method3983();
			@Pc(40) Random local40 = new Random((long) this.anInt6719);
			for (@Pc(42) int local42 = 0; local42 < this.anInt6721; local42++) {
				@Pc(65) int local65 = this.anInt6713 <= 0 ? this.anInt6718 : this.anInt6718 + Static172.method3391(this.anInt6713, local40) - local28;
				@Pc(71) int local71 = local65 >> 4 & 0xFF;
				@Pc(76) int local76 = Static172.method3391(Static263.anInt5504, local40);
				@Pc(81) int local81 = Static172.method3391(Static363.anInt6995, local40);
				@Pc(92) int local92 = local76 + (this.anInt6715 * Static45.anIntArray70[local71] >> 12);
				@Pc(103) int local103 = (this.anInt6715 * Static331.anIntArray498[local71] >> 12) + local81;
				@Pc(107) int local107 = local103 - local81;
				@Pc(112) int local112 = local92 - local76;
				if (local112 != 0 || local107 != 0) {
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local112 < 0) {
						local112 = -local112;
					}
					@Pc(142) boolean local142 = local112 < local107;
					@Pc(146) int local146;
					@Pc(150) int local150;
					if (local142) {
						local146 = local76;
						local76 = local81;
						local150 = local92;
						local92 = local103;
						local81 = local146;
						local103 = local150;
					}
					if (local76 > local92) {
						local146 = local76;
						local150 = local81;
						local76 = local92;
						local81 = local103;
						local92 = local146;
						local103 = local150;
					}
					local146 = local81;
					local150 = local92 - local76;
					@Pc(183) int local183 = local103 - local81;
					@Pc(188) int local188 = -local150 / 2;
					@Pc(192) int local192 = 2048 / local150;
					@Pc(201) int local201 = 1024 - (Static172.method3391(4096, local40) >> 2);
					@Pc(208) int local208 = local103 <= local81 ? -1 : 1;
					if (local183 < 0) {
						local183 = -local183;
					}
					for (@Pc(218) int local218 = local76; local218 < local92; local218++) {
						@Pc(231) int local231 = local201 + local192 * (local218 - local76) + 1024;
						@Pc(235) int local235 = local218 & Static171.anInt3863;
						@Pc(239) int local239 = Static241.anInt5135 & local146;
						if (local142) {
							local33[local239][local235] = local231;
						} else {
							local33[local235][local239] = local231;
						}
						local188 += local183;
						if (local188 > 0) {
							local188 += -local150;
							local146 -= -local208;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6719 = arg1.method3124();
		} else if (arg0 == 1) {
			this.anInt6721 = arg1.method3104();
		} else if (arg0 == 2) {
			this.anInt6715 = arg1.method3124();
		} else if (arg0 == 3) {
			this.anInt6718 = arg1.method3104();
		} else if (arg0 == 4) {
			this.anInt6713 = arg1.method3104();
		}
	}

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		Static224.method5493();
	}
}
