import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class4_Sub3_Sub38 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ws", name = "F", descriptor = "[I")
	private int[] anIntArray627;

	@OriginalMember(owner = "client!ws", name = "K", descriptor = "[I")
	private int[] anIntArray628;

	@OriginalMember(owner = "client!ws", name = "I", descriptor = "I")
	private int anInt7947 = 10;

	@OriginalMember(owner = "client!ws", name = "N", descriptor = "I")
	private int anInt7950 = 2048;

	@OriginalMember(owner = "client!ws", name = "T", descriptor = "I")
	private int anInt7955 = 0;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		this.method6294();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt7947 = arg1.method4614();
		} else if (arg0 == 1) {
			this.anInt7950 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt7955 = arg1.method4614();
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(26) int local26 = Static376.anIntArray531[arg0];
			@Pc(35) int local35;
			if (this.anInt7955 == 0) {
				@Pc(136) short local136 = 0;
				for (local35 = 0; local35 < this.anInt7947; local35++) {
					if (local26 >= this.anIntArray627[local35] && local26 < this.anIntArray627[local35 + 1]) {
						if (this.anIntArray628[local35] > local26) {
							local136 = 4096;
						}
						break;
					}
				}
				Static474.method3330(local11, 0, Static304.anInt5637, local136);
			} else {
				for (@Pc(31) int local31 = 0; local31 < Static304.anInt5637; local31++) {
					local35 = 0;
					@Pc(37) short local37 = 0;
					@Pc(41) int local41 = Static231.anIntArray368[local31];
					@Pc(44) int local44 = this.anInt7955;
					if (local44 == 1) {
						local35 = local41;
					} else if (local44 == 2) {
						local35 = (local41 + local26 - 4096 >> 1) + 2048;
					} else if (local44 == 3) {
						local35 = (local41 - local26 >> 1) + 2048;
					}
					for (local44 = 0; local44 < this.anInt7947; local44++) {
						if (local35 >= this.anIntArray627[local44] && local35 < this.anIntArray627[local44 + 1]) {
							if (this.anIntArray628[local44] > local35) {
								local37 = 4096;
							}
							break;
						}
					}
					local11[local31] = local37;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	private void method6294() {
		@Pc(7) int local7 = 0;
		this.anIntArray628 = new int[this.anInt7947 + 1];
		this.anIntArray627 = new int[this.anInt7947 + 1];
		@Pc(26) int local26 = 4096 / this.anInt7947;
		@Pc(33) int local33 = local26 * this.anInt7950 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt7947; local43++) {
			this.anIntArray627[local43] = local7;
			this.anIntArray628[local43] = local7 + local33;
			local7 += local26;
		}
		this.anIntArray627[this.anInt7947] = 4096;
		this.anIntArray628[this.anInt7947] = this.anIntArray628[0] + 4096;
	}
}
