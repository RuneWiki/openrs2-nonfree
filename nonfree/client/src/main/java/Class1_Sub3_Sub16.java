import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!id", name = "E", descriptor = "I")
	private int anInt4006 = 2000;

	@OriginalMember(owner = "client!id", name = "I", descriptor = "I")
	private int anInt4009 = 16;

	@OriginalMember(owner = "client!id", name = "H", descriptor = "I")
	private int anInt4008 = 0;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "I")
	private int anInt4007 = 0;

	@OriginalMember(owner = "client!id", name = "N", descriptor = "I")
	private int anInt4013 = 4096;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(26) int local26 = this.anInt4013 >> 1;
			@Pc(31) int[][] local31 = super.aClass12_41.method505();
			@Pc(38) Random local38 = new Random((long) this.anInt4007);
			for (@Pc(40) int local40 = 0; local40 < this.anInt4006; local40++) {
				@Pc(63) int local63 = this.anInt4013 <= 0 ? this.anInt4008 : this.anInt4008 + Static220.method3801(local38, this.anInt4013) - local26;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static220.method3801(local38, Static452.anInt7734);
				@Pc(79) int local79 = Static220.method3801(local38, Static272.anInt5156);
				@Pc(90) int local90 = local74 + (this.anInt4009 * Static274.anIntArray525[local69] >> 12);
				@Pc(102) int local102 = local79 + (Static90.anIntArray186[local69] * this.anInt4009 >> 12);
				@Pc(107) int local107 = local102 - local79;
				@Pc(111) int local111 = local90 - local74;
				if (local111 != 0 || local107 != 0) {
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local111 < 0) {
						local111 = -local111;
					}
					@Pc(141) boolean local141 = local107 > local111;
					@Pc(145) int local145;
					@Pc(149) int local149;
					if (local141) {
						local145 = local74;
						local74 = local79;
						local149 = local90;
						local90 = local102;
						local79 = local145;
						local102 = local149;
					}
					if (local74 > local90) {
						local145 = local74;
						local74 = local90;
						local149 = local79;
						local79 = local102;
						local90 = local145;
						local102 = local149;
					}
					local145 = local79;
					local149 = local90 - local74;
					@Pc(181) int local181 = local102 - local79;
					@Pc(186) int local186 = -local149 / 2;
					@Pc(190) int local190 = 2048 / local149;
					@Pc(200) int local200 = 1024 - (Static220.method3801(local38, 4096) >> 2);
					@Pc(207) int local207 = local102 <= local79 ? -1 : 1;
					if (local181 < 0) {
						local181 = -local181;
					}
					for (@Pc(214) int local214 = local74; local214 < local90; local214++) {
						@Pc(227) int local227 = (local214 - local74) * local190 + local200 + 1024;
						@Pc(231) int local231 = local214 & Static80.anInt1453;
						@Pc(235) int local235 = Static323.anInt5914 & local145;
						local186 += local181;
						if (local141) {
							local31[local235][local231] = local227;
						} else {
							local31[local231][local235] = local227;
						}
						if (local186 > 0) {
							local145 += local207;
							local186 -= local149;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4007 = arg0.method3922();
		} else if (arg1 == 1) {
			this.anInt4006 = arg0.method3967();
		} else if (arg1 == 2) {
			this.anInt4009 = arg0.method3922();
		} else if (arg1 == 3) {
			this.anInt4008 = arg0.method3967();
		} else if (arg1 == 4) {
			this.anInt4013 = arg0.method3967();
		}
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		Static52.method1027();
	}
}
