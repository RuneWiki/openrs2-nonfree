import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public class Class6_Sub2_Sub4 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
	protected int anInt488;

	@OriginalMember(owner = "client!ev", name = "G", descriptor = "[I")
	protected int[] anIntArray41;

	@OriginalMember(owner = "client!ev", name = "N", descriptor = "I")
	protected int anInt496;

	@OriginalMember(owner = "client!ev", name = "C", descriptor = "I")
	private int anInt490 = -1;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public final void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt490 = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "(I)I")
	@Override
	public final int method5866() {
		return this.anInt490;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230 && this.method404()) {
			@Pc(25) int[] local25 = local13[0];
			@Pc(29) int[] local29 = local13[1];
			@Pc(33) int[] local33 = local13[2];
			@Pc(53) int local53 = this.anInt488 * (Static345.anInt5779 == this.anInt496 ? arg0 : this.anInt496 * arg0 / Static345.anInt5779);
			@Pc(59) int local59;
			@Pc(68) int local68;
			if (this.anInt488 == Static185.anInt4925) {
				for (local59 = 0; local59 < Static185.anInt4925; local59++) {
					local68 = this.anIntArray41[local53++];
					local33[local59] = (local68 & 0xFF) << 4;
					local29[local59] = local68 >> 4 & 0xFF0;
					local25[local59] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static185.anInt4925; local59++) {
					local68 = this.anInt488 * local59 / Static185.anInt4925;
					@Pc(76) int local76 = this.anIntArray41[local53 + local68];
					local33[local59] = (local76 & 0xFF) << 4;
					local29[local59] = local76 >> 4 & 0xFF0;
					local25[local59] = local76 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)V")
	@Override
	public final void method5864() {
		super.method5864();
		this.anIntArray41 = null;
	}

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "(I)Z")
	protected final boolean method404() {
		if (this.anIntArray41 != null) {
			return true;
		} else if (this.anInt490 >= 0) {
			@Pc(35) Class77 local35 = Static287.anInt4825 < 0 ? Static455.method1716(Static221.aClass158_50, this.anInt490) : Static455.method1703(Static221.aClass158_50, Static287.anInt4825, this.anInt490);
			local35.method1707();
			this.anIntArray41 = local35.method1706();
			this.anInt488 = local35.anInt1842;
			this.anInt496 = local35.anInt1844;
			return true;
		} else {
			return false;
		}
	}
}
