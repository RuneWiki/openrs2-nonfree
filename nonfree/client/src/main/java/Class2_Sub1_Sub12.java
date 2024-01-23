import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
	private int anInt1821 = 4096;

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
	private int anInt1818 = 0;

	@OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
	private int anInt1822 = 16;

	@OriginalMember(owner = "client!hb", name = "db", descriptor = "I")
	private int anInt1826 = 2000;

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
	private int anInt1819 = 0;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1819 = arg0.method209();
		} else if (arg1 == 1) {
			this.anInt1826 = arg0.method163();
		} else if (arg1 == 2) {
			this.anInt1822 = arg0.method209();
		} else if (arg1 == 3) {
			this.anInt1818 = arg0.method163();
		} else if (arg1 == 4) {
			this.anInt1821 = arg0.method163();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		Static94.method1641();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(27) int local27 = this.anInt1821 >> 1;
			@Pc(32) int[][] local32 = super.aClass73_41.method2246();
			@Pc(39) Random local39 = new Random((long) this.anInt1819);
			for (@Pc(41) int local41 = 0; local41 < this.anInt1826; local41++) {
				@Pc(64) int local64 = this.anInt1821 > 0 ? this.anInt1818 + Static105.method1788(this.anInt1821, local39) - local27 : this.anInt1818;
				@Pc(70) int local70 = local64 >> 4 & 0xFF;
				@Pc(75) int local75 = Static105.method1788(Static62.anInt1675, local39);
				@Pc(80) int local80 = Static105.method1788(Static25.anInt4767, local39);
				@Pc(91) int local91 = local80 + (this.anInt1822 * Static80.anIntArray203[local70] >> 12);
				@Pc(102) int local102 = (Static135.anIntArray331[local70] * this.anInt1822 >> 12) + local75;
				@Pc(107) int local107 = local102 - local75;
				@Pc(112) int local112 = local91 - local80;
				if (local107 != 0 || local112 != 0) {
					if (local112 < 0) {
						local112 = -local112;
					}
					if (local107 < 0) {
						local107 = -local107;
					}
					@Pc(146) boolean local146 = local112 > local107;
					@Pc(152) int local152;
					@Pc(150) int local150;
					if (local146) {
						local150 = local102;
						local152 = local75;
						local102 = local91;
						local75 = local80;
						local91 = local150;
						local80 = local152;
					}
					if (local102 < local75) {
						local152 = local75;
						local150 = local80;
						local75 = local102;
						local80 = local91;
						local91 = local150;
						local102 = local152;
					}
					local152 = local80;
					local150 = local102 - local75;
					@Pc(191) int local191 = local91 - local80;
					@Pc(195) int local195 = 2048 / local150;
					@Pc(200) int local200 = -local150 / 2;
					@Pc(211) int local211 = local91 <= local80 ? -1 : 1;
					if (local191 < 0) {
						local191 = -local191;
					}
					@Pc(226) int local226 = 1024 - (Static105.method1788(4096, local39) >> 2);
					for (@Pc(228) int local228 = local75; local228 < local102; local228++) {
						@Pc(234) int local234 = Static41.anInt1259 & local228;
						local200 += local191;
						@Pc(249) int local249 = local226 + local195 * (local228 - local75) + 1024;
						@Pc(253) int local253 = local152 & Static195.anInt4423;
						if (local200 > 0) {
							local200 += -local150;
							local152 += local211;
						}
						if (local146) {
							local32[local253][local234] = local249;
						} else {
							local32[local234][local253] = local249;
						}
					}
				}
			}
		}
		return local18;
	}
}
