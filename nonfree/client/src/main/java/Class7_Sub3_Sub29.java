import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class7_Sub3_Sub29 extends Class7_Sub3 {

	@OriginalMember(owner = "client!si", name = "G", descriptor = "I")
	private int anInt5844 = 0;

	@OriginalMember(owner = "client!si", name = "P", descriptor = "I")
	private int anInt5851 = 16;

	@OriginalMember(owner = "client!si", name = "I", descriptor = "I")
	private int anInt5846 = 2000;

	@OriginalMember(owner = "client!si", name = "O", descriptor = "I")
	private int anInt5850 = 0;

	@OriginalMember(owner = "client!si", name = "R", descriptor = "I")
	private int anInt5852 = 4096;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		Static371.method4759();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(28) int local28 = this.anInt5852 >> 1;
			@Pc(33) int[][] local33 = super.aClass113_41.method2457();
			@Pc(40) Random local40 = new Random((long) this.anInt5850);
			for (@Pc(42) int local42 = 0; local42 < this.anInt5846; local42++) {
				@Pc(62) int local62 = this.anInt5852 > 0 ? this.anInt5844 + Static304.method4043(this.anInt5852, local40) - local28 : this.anInt5844;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static304.method4043(Static58.anInt1052, local40);
				@Pc(78) int local78 = Static304.method4043(Static383.anInt6175, local40);
				@Pc(89) int local89 = local73 + (Static54.anIntArray80[local68] * this.anInt5851 >> 12);
				@Pc(100) int local100 = local78 + (this.anInt5851 * Static114.anIntArray163[local68] >> 12);
				@Pc(104) int local104 = local100 - local78;
				@Pc(108) int local108 = local89 - local73;
				if (local108 != 0 || local104 != 0) {
					if (local108 < 0) {
						local108 = -local108;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(136) boolean local136 = local108 < local104;
					@Pc(140) int local140;
					@Pc(144) int local144;
					if (local136) {
						local140 = local73;
						local73 = local78;
						local144 = local89;
						local89 = local100;
						local78 = local140;
						local100 = local144;
					}
					if (local89 < local73) {
						local140 = local73;
						local144 = local78;
						local73 = local89;
						local89 = local140;
						local78 = local100;
						local100 = local144;
					}
					local140 = local78;
					local144 = local89 - local73;
					@Pc(181) int local181 = local100 - local78;
					@Pc(186) int local186 = -local144 / 2;
					@Pc(190) int local190 = 2048 / local144;
					@Pc(200) int local200 = 1024 - (Static304.method4043(4096, local40) >> 2);
					@Pc(211) int local211 = local78 < local100 ? 1 : -1;
					if (local181 < 0) {
						local181 = -local181;
					}
					for (@Pc(221) int local221 = local73; local221 < local89; local221++) {
						@Pc(234) int local234 = (local221 - local73) * local190 + local200 + 1024;
						@Pc(238) int local238 = Static410.anInt6497 & local221;
						@Pc(242) int local242 = Static25.anInt366 & local140;
						if (local136) {
							local33[local242][local238] = local234;
						} else {
							local33[local238][local242] = local234;
						}
						local186 += local181;
						if (local186 > 0) {
							local186 -= local144;
							local140 -= -local211;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt5850 = arg1.method3981();
		} else if (arg0 == 1) {
			this.anInt5846 = arg1.method3943();
		} else if (arg0 == 2) {
			this.anInt5851 = arg1.method3981();
		} else if (arg0 == 3) {
			this.anInt5844 = arg1.method3943();
		} else if (arg0 == 4) {
			this.anInt5852 = arg1.method3943();
		}
	}
}
