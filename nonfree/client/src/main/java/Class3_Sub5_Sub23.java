import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class3_Sub5_Sub23 extends Class3_Sub5 {

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "[I")
	private int[] anIntArray407;

	@OriginalMember(owner = "client!qd", name = "W", descriptor = "[I")
	private int[] anIntArray409;

	@OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
	private int anInt3144;

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
	private int anInt3143;

	@OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
	private int anInt3146;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		this.method2298();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(27) int local27 = Static94.anIntArray277[arg0];
			@Pc(37) int local37;
			if (this.anInt3143 == 0) {
				@Pc(35) short local35 = 0;
				for (local37 = 0; local37 < this.anInt3146; local37++) {
					if (this.anIntArray407[local37] <= local27 && local27 < this.anIntArray407[local37 + 1]) {
						if (this.anIntArray409[local37] > local27) {
							local35 = 4096;
						}
						break;
					}
				}
				Static200.method1180(local19, 0, Static104.anInt2195, local35);
			} else {
				for (@Pc(81) int local81 = 0; local81 < Static104.anInt2195; local81++) {
					local37 = 0;
					@Pc(87) short local87 = 0;
					@Pc(91) int local91 = Static124.anIntArray355[local81];
					@Pc(94) int local94 = this.anInt3143;
					if (local94 == 1) {
						local37 = local91;
					} else if (local94 == 2) {
						local37 = (local91 + local27 - 4096 >> 1) + 2048;
					} else if (local94 == 3) {
						local37 = (local91 - local27 >> 1) + 2048;
					}
					for (local94 = 0; local94 < this.anInt3146; local94++) {
						if (local37 >= this.anIntArray407[local94] && this.anIntArray407[local94 + 1] > local37) {
							if (this.anIntArray409[local94] > local37) {
								local87 = 4096;
							}
							break;
						}
					}
					local19[local81] = local87;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3146 = arg1.method2107();
		} else if (arg0 == 1) {
			this.anInt3144 = arg1.method2111();
		} else if (arg0 == 2) {
			this.anInt3143 = arg1.method2107();
		}
	}

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)V")
	private void method2298() {
		this.anIntArray407 = new int[this.anInt3146 + 1];
		this.anIntArray409 = new int[this.anInt3146 + 1];
		@Pc(17) int local17 = 0;
		@Pc(22) int local22 = 4096 / this.anInt3146;
		@Pc(41) int local41 = this.anInt3144 * local22 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt3146; local43++) {
			this.anIntArray407[local43] = local17;
			this.anIntArray409[local43] = local41 + local17;
			local17 += local22;
		}
		this.anIntArray407[this.anInt3146] = 4096;
		this.anIntArray409[this.anInt3146] = this.anIntArray409[0] + 4096;
	}
}
