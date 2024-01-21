import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
	private int anInt1369;

	@OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
	private int anInt1371;

	@OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
	private int anInt1375;

	@OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
	private int anInt1374;

	@OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
	private int anInt1379;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(26) int local26 = this.anInt1374 >> 1;
			@Pc(31) int[][] local31 = super.aClass22_39.method847();
			@Pc(38) Random local38 = new Random((long) this.anInt1371);
			for (@Pc(40) int local40 = 0; local40 < this.anInt1375; local40++) {
				@Pc(63) int local63 = this.anInt1374 <= 0 ? this.anInt1369 : this.anInt1369 + Static42.method1009(this.anInt1374, local38) - local26;
				@Pc(68) int local68 = Static42.method1009(Static129.anInt3285, local38);
				@Pc(73) int local73 = Static42.method1009(Static104.anInt2685, local38);
				@Pc(79) int local79 = local63 >> 4 & 0xFF;
				@Pc(91) int local91 = local68 + (this.anInt1379 * Static61.anIntArray316[local79] >> 12);
				@Pc(102) int local102 = local73 + (Static167.anIntArray680[local79] * this.anInt1379 >> 12);
				@Pc(107) int local107 = local102 - local73;
				@Pc(112) int local112 = local91 - local68;
				if (local112 != 0 || local107 != 0) {
					if (local112 < 0) {
						local112 = -local112;
					}
					if (local107 < 0) {
						local107 = -local107;
					}
					@Pc(136) boolean local136 = local107 > local112;
					@Pc(146) int local146;
					@Pc(140) int local140;
					if (local136) {
						local140 = local91;
						local91 = local102;
						local102 = local140;
						local146 = local68;
						local68 = local73;
						local73 = local146;
					}
					if (local68 > local91) {
						local146 = local68;
						local68 = local91;
						local91 = local146;
						local140 = local73;
						local73 = local102;
						local102 = local140;
					}
					local140 = local91 - local68;
					local146 = local73;
					@Pc(181) int local181 = -local140 / 2;
					@Pc(186) int local186 = local102 - local73;
					@Pc(190) int local190 = 2048 / local140;
					@Pc(200) int local200 = 1024 - (Static42.method1009(4096, local38) >> 2);
					@Pc(211) int local211 = local102 > local73 ? 1 : -1;
					if (local186 < 0) {
						local186 = -local186;
					}
					for (@Pc(218) int local218 = local68; local218 < local91; local218++) {
						@Pc(231) int local231 = (local218 - local68) * local190 + local200 + 1024;
						local181 += local186;
						@Pc(239) int local239 = Static105.anInt2733 & local218;
						@Pc(243) int local243 = Static106.anInt2755 & local146;
						if (local181 > 0) {
							local181 += -local140;
							local146 += local211;
						}
						if (local136) {
							local31[local243][local239] = local231;
						} else {
							local31[local239][local243] = local231;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		Static160.method2981();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1371 = arg1.method1545();
		} else if (arg0 == 1) {
			this.anInt1375 = arg1.method1510();
		} else if (arg0 == 2) {
			this.anInt1379 = arg1.method1545();
		} else if (arg0 == 3) {
			this.anInt1369 = arg1.method1510();
		} else if (arg0 == 4) {
			this.anInt1374 = arg1.method1510();
		}
	}
}
