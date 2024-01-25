import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public class Class8_Sub2_Sub24 extends Class8_Sub2 {

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
	protected int anInt6300;

	@OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
	protected int anInt6301;

	@OriginalMember(owner = "client!ph", name = "R", descriptor = "[I")
	protected int[] anIntArray364;

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
	private int anInt6298 = -1;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub24() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591 && this.method5124()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(47) int local47 = this.anInt6301 * (Static159.anInt8698 == this.anInt6300 ? arg0 : this.anInt6300 * arg0 / Static159.anInt8698);
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (this.anInt6301 == Static538.anInt9297) {
				for (local57 = 0; local57 < Static538.anInt9297; local57++) {
					local65 = this.anIntArray364[local47++];
					local31[local57] = (local65 & 0xFF) << 4;
					local27[local57] = local65 >> 4 & 0xFF0;
					local23[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static538.anInt9297; local57++) {
					local65 = local57 * this.anInt6301 / Static538.anInt9297;
					@Pc(113) int local113 = this.anIntArray364[local65 + local47];
					local31[local57] = (local113 & 0xFF) << 4;
					local27[local57] = local113 >> 4 & 0xFF0;
					local23[local57] = local113 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
	@Override
	public final int method8511() {
		return this.anInt6298;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public final void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6298 = arg1.method8578();
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	@Override
	public final void method8506() {
		super.method8506();
		this.anIntArray364 = null;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)Z")
	protected final boolean method5124() {
		if (this.anIntArray364 != null) {
			return true;
		} else if (this.anInt6298 >= 0) {
			@Pc(32) Class111 local32 = Static504.anInt8867 >= 0 ? Static647.method3292(Static206.aClass237_130, Static504.anInt8867, this.anInt6298) : Static647.method3299(Static206.aClass237_130, this.anInt6298);
			local32.method3289();
			this.anIntArray364 = local32.method3287();
			this.anInt6301 = local32.anInt4054;
			this.anInt6300 = local32.anInt4053;
			return true;
		} else {
			return false;
		}
	}
}
