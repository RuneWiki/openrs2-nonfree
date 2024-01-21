import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
	protected int anInt1743;

	@OriginalMember(owner = "client!sc", name = "lb", descriptor = "[I")
	protected int[] anIntArray303;

	@OriginalMember(owner = "client!sc", name = "tb", descriptor = "I")
	protected int anInt1752;

	@OriginalMember(owner = "client!sc", name = "rb", descriptor = "I")
	private int anInt1750;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)Z")
	protected final boolean method1396() {
		if (this.anIntArray303 != null) {
			return true;
		} else if (this.anInt1750 >= 0) {
			@Pc(22) Class3_Sub2_Sub2_Sub4 local22 = Static100.method2108(this.anInt1750, Static161.aClass7_64);
			local22.method990();
			this.anInt1743 = local22.anInt1171;
			this.anInt1752 = local22.anInt1175;
			this.anIntArray303 = local22.anIntArray222;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1 && this.method1396()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(47) int local47 = this.anInt1752 * (this.anInt1743 == Static104.anInt2685 ? arg0 : arg0 * this.anInt1743 / Static104.anInt2685);
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (Static129.anInt3285 == this.anInt1752) {
				for (local57 = 0; local57 < Static129.anInt3285; local57++) {
					local65 = this.anIntArray303[local47++];
					local31[local57] = (local65 & 0xFF) << 4;
					local27[local57] = local65 >> 4 & 0xFF0;
					local23[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static129.anInt3285; local57++) {
					local65 = local57 * this.anInt1752 / Static129.anInt3285;
					@Pc(113) int local113 = this.anIntArray303[local47 + local65];
					local31[local57] = (local113 & 0xFF) << 4;
					local27[local57] = local113 >> 4 & 0xFF0;
					local23[local57] = local113 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public final void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1750 = arg1.method1510();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
	@Override
	public final int method3119() {
		return this.anInt1750;
	}
}
