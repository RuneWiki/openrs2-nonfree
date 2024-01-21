import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class3_Sub5_Sub34 extends Class3_Sub5 {

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
	private int anInt4050;

	@OriginalMember(owner = "client!ue", name = "sb", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!ue", name = "Wb", descriptor = "I")
	private int anInt4061;

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
	private int anInt4051;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160 && this.method2904()) {
			@Pc(24) int[] local24 = local7[0];
			@Pc(40) int local40 = (this.anInt4061 == Static88.anInt1834 ? arg0 : arg0 * this.anInt4061 / Static88.anInt1834) * this.anInt4050;
			@Pc(44) int[] local44 = local7[2];
			@Pc(48) int[] local48 = local7[1];
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (this.anInt4050 == Static104.anInt2195) {
				for (local58 = 0; local58 < Static104.anInt2195; local58++) {
					local67 = this.anIntArray488[local40++];
					local44[local58] = (local67 & 0xFF) << 4;
					local48[local58] = local67 >> 4 & 0xFF0;
					local24[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static104.anInt2195; local58++) {
					local67 = local58 * this.anInt4050 / Static104.anInt2195;
					@Pc(74) int local74 = this.anIntArray488[local67 + local40];
					local44[local58] = (local74 & 0xFF) << 4;
					local48[local58] = local74 >> 4 & 0xFF0;
					local24[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
	@Override
	public int method3162() {
		return this.anInt4051;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	@Override
	public void method3166() {
		super.method3166();
		this.anIntArray488 = null;
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)Z")
	private boolean method2904() {
		if (this.anIntArray488 != null) {
			return true;
		} else if (this.anInt4051 >= 0) {
			@Pc(20) int local20 = Static104.anInt2195;
			@Pc(22) int local22 = Static88.anInt1834;
			@Pc(32) int local32 = Static54.anInterface1_1.method2648(this.anInt4051) ? 64 : 128;
			this.anIntArray488 = Static54.anInterface1_1.method2649(this.anInt4051);
			this.anInt4050 = local32;
			this.anInt4061 = local32;
			Static172.method2765(local20, local22);
			return this.anIntArray488 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt4051 = arg1.method2111();
		}
	}
}
