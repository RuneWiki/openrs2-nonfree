import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class8_Sub3_Sub34 extends Class8_Sub3 {

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
	private int anInt4828;

	@OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
	private int anInt4831;

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
	private int anInt4833 = -1;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub34() {
		super(0, false);
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)I")
	@Override
	public int method4226() {
		return this.anInt4833;
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)Z")
	private boolean method3638() {
		if (this.anIntArray365 != null) {
			return true;
		} else if (this.anInt4833 >= 0) {
			@Pc(14) int local14 = Static86.anInt1852;
			@Pc(16) int local16 = Static239.anInt4789;
			@Pc(27) int local27 = Static172.anInterface3_1.method1235(this.anInt4833).aBoolean3 ? 64 : 128;
			this.anIntArray365 = Static172.anInterface3_1.method1236(local27, this.anInt4833, local27, 1.0F);
			this.anInt4828 = local27;
			this.anInt4831 = local27;
			Static58.method1723(local14, local16);
			return this.anIntArray365 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	@Override
	public void method4219() {
		super.method4219();
		this.anIntArray365 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt4833 = arg1.method2375();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451 && this.method3638()) {
			@Pc(32) int[] local32 = local18[0];
			@Pc(36) int[] local36 = local18[1];
			@Pc(40) int[] local40 = local18[2];
			@Pc(60) int local60 = this.anInt4828 * (Static86.anInt1852 == this.anInt4831 ? arg0 : this.anInt4831 * arg0 / Static86.anInt1852);
			@Pc(70) int local70;
			@Pc(80) int local80;
			if (Static239.anInt4789 == this.anInt4828) {
				for (local70 = 0; local70 < Static239.anInt4789; local70++) {
					local80 = this.anIntArray365[local60++];
					local40[local70] = (local80 & 0xFF) << 4;
					local36[local70] = local80 >> 4 & 0xFF0;
					local32[local70] = local80 >> 12 & 0xFF0;
				}
			} else {
				for (local70 = 0; local70 < Static239.anInt4789; local70++) {
					local80 = this.anInt4828 * local70 / Static239.anInt4789;
					@Pc(87) int local87 = this.anIntArray365[local80 + local60];
					local40[local70] = (local87 & 0xFF) << 4;
					local36[local70] = local87 >> 4 & 0xFF0;
					local32[local70] = local87 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}
}
