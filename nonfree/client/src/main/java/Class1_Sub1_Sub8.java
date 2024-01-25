import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dw", name = "M", descriptor = "I")
	protected int anInt1986;

	@OriginalMember(owner = "client!dw", name = "N", descriptor = "I")
	protected int anInt1987;

	@OriginalMember(owner = "client!dw", name = "U", descriptor = "[I")
	protected int[] anIntArray93;

	@OriginalMember(owner = "client!dw", name = "S", descriptor = "I")
	private int anInt1991 = -1;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(0, false);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221 && this.method1573()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(51) int local51 = this.anInt1986 * (Static452.anInt7412 == this.anInt1987 ? arg0 : arg0 * this.anInt1987 / Static452.anInt7412);
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (Static434.anInt4326 == this.anInt1986) {
				for (local57 = 0; local57 < Static434.anInt4326; local57++) {
					local66 = this.anIntArray93[local51++];
					local31[local57] = (local66 & 0xFF) << 4;
					local27[local57] = local66 >> 4 & 0xFF0;
					local23[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static434.anInt4326; local57++) {
					local66 = local57 * this.anInt1986 / Static434.anInt4326;
					@Pc(73) int local73 = this.anIntArray93[local66 + local51];
					local31[local57] = (local73 & 0xFF) << 4;
					local27[local57] = local73 >> 4 & 0xFF0;
					local23[local57] = local73 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(B)Z")
	protected final boolean method1573() {
		if (this.anIntArray93 != null) {
			return true;
		} else if (this.anInt1991 >= 0) {
			@Pc(32) Class100 local32 = Static395.anInt7176 >= 0 ? Static458.method1922(Static199.aClass113_64, Static395.anInt7176, this.anInt1991) : Static458.method1924(Static199.aClass113_64, this.anInt1991);
			local32.method1920();
			this.anIntArray93 = local32.method1919();
			this.anInt1987 = local32.anInt2454;
			this.anInt1986 = local32.anInt2451;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)V")
	@Override
	public final void method5630() {
		super.method5630();
		this.anIntArray93 = null;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)I")
	@Override
	public final int method5623() {
		return this.anInt1991;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public final void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1991 = arg1.method4485();
		}
	}
}
