import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class33 {

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!rn;")
	private Class18 aClass18_2;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	private int anInt828 = -1;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
	private final int anInt830;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "[Lclient!jp;")
	private final Class126[] aClass126Array2;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	private final int anInt821;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	private final int anInt823;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
	private final int anInt820;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "[Lclient!jp;")
	private final Class126[] aClass126Array1;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "Lclient!jp;")
	private final Class126 aClass126_1;

	static {
		new Class32(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I[Lclient!jp;IIII)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) Class126[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt830 = arg0;
		this.aClass126Array2 = arg1;
		this.anInt821 = arg4;
		this.anInt823 = arg5;
		this.anInt820 = arg3;
		if (arg1 == null) {
			this.aClass126Array1 = null;
			this.aClass126_1 = null;
		} else {
			this.aClass126Array1 = new Class126[arg1.length];
			this.aClass126_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!vc;IIIIIIII)V")
	public void method706(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg5 + arg6 & 0x3FFF;
		if (this.anInt830 == -1) {
			arg1.method1982(arg7, arg4, arg8, arg2, arg3, 0);
		} else {
			@Pc(31) Class132 local31 = Static371.anInterface9_7.method139(this.anInt830);
			if (this.aClass18_2 == null && Static371.anInterface9_7.method142(this.anInt830)) {
				@Pc(73) int[] local73 = local31.aBoolean252 ? Static371.anInterface9_7.method143(this.anInt830, this.anInt824, this.anInt824, false, 0.7F) : Static371.anInterface9_7.method141(this.anInt824, 0.7F, this.anInt824, this.anInt830);
				this.aClass18_2 = arg1.method2029(local73, this.anInt824, this.anInt824, this.anInt824);
			}
			if (!local31.aBoolean252) {
				arg1.method1982(arg7, arg4, arg8, arg2, arg3, 0);
			}
			if (this.aClass18_2 != null) {
				@Pc(106) int local106 = local31.aBoolean252 ? 0 : 1;
				@Pc(112) int local112 = arg0 * arg2 / -4096;
				@Pc(124) int local124;
				for (local124 = (arg8 - arg2) / 2 + arg2 * local11 / 4096; local124 > arg2; local124 -= arg2) {
				}
				while (local124 < 0) {
					local124 += arg2;
				}
				while (arg2 < local112) {
					local112 -= arg2;
				}
				while (local112 < 0) {
					local112 += arg2;
				}
				for (@Pc(172) int local172 = local124 - arg2; local172 < arg8; local172 += arg2) {
					for (@Pc(179) int local179 = local112 - arg2; local179 < arg2; local179 += arg2) {
						this.aClass18_2.method4569(local172 + arg7, arg4 + local179, arg2, arg2, 0, 0, local106);
					}
				}
			}
		}
		for (@Pc(219) int local219 = this.anInt825 - 1; local219 >= 0; local219--) {
			this.aClass126Array1[local219].method2936(arg1, arg7, arg4, arg8, arg2, arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public void method707() {
		if (this.aClass126Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass126Array2.length; local6++) {
				this.aClass126Array2[local6].method2935();
			}
		}
		this.aClass18_2 = null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!vc;IB)Z")
	public boolean method709(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		@Pc(47) int local47;
		if (arg1 != this.anInt828) {
			this.anInt828 = arg1;
			@Pc(12) int local12 = Static6.method148(arg1);
			if (arg1 < local12) {
				local12 = Static259.method4011(arg1);
			}
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 != this.anInt824) {
				this.aClass18_2 = null;
				this.anInt824 = local12;
			}
			if (this.aClass126Array2 != null) {
				this.anInt825 = 0;
				@Pc(45) int[] local45 = new int[this.aClass126Array2.length];
				for (local47 = 0; local47 < this.aClass126Array2.length; local47++) {
					@Pc(54) Class126 local54 = this.aClass126Array2[local47];
					if (local54.method2929(this.anInt820, this.anInt821, this.anInt823, this.anInt828)) {
						local45[this.anInt825] = local54.anInt3183;
						this.aClass126Array1[this.anInt825++] = local54;
					}
				}
				Static214.method3575(this.anInt825 - 1, 0, this.aClass126Array1, local45);
			}
			this.aBoolean61 = true;
		}
		@Pc(119) boolean local119 = false;
		if (this.aBoolean61) {
			this.aBoolean61 = false;
			for (local47 = this.anInt825 - 1; local47 >= 0; local47--) {
				@Pc(141) boolean local141 = this.aClass126Array1[local47].method2933(arg0, this.aClass126_1);
				this.aBoolean61 |= !local141;
				local119 |= local141;
			}
		}
		return local119;
	}
}
