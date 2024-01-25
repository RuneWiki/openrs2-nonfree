import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class6_Sub3_Sub31 extends Class6_Sub3 {

	@OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
	private int anInt8353;

	@OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
	private int anInt8357;

	@OriginalMember(owner = "client!sj", name = "M", descriptor = "[I")
	private int[] anIntArray581;

	@OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
	private int anInt8359 = -1;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub31() {
		super(0, false);
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
	@Override
	public void method7953() {
		super.method7953();
		this.anIntArray581 = null;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I")
	@Override
	public int method7952() {
		return this.anInt8359;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(41) int local41 = this.anInt8357 * (Static170.anInt3133 == this.anInt8353 ? arg0 : arg0 * this.anInt8353 / Static170.anInt3133);
			@Pc(45) int[] local45 = local17[0];
			@Pc(49) int[] local49 = local17[1];
			@Pc(53) int[] local53 = local17[2];
			@Pc(63) int local63;
			@Pc(71) int local71;
			if (Static35.anInt670 == this.anInt8357) {
				for (local63 = 0; local63 < Static35.anInt670; local63++) {
					local71 = this.anIntArray581[local41++];
					local53[local63] = (local71 & 0xFF) << 4;
					local49[local63] = local71 >> 4 & 0xFF0;
					local45[local63] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static35.anInt670; local63++) {
					local71 = local63 * this.anInt8357 / Static35.anInt670;
					@Pc(119) int local119 = this.anIntArray581[local71 + local41];
					local53[local63] = (local119 & 0xFF) << 4;
					local49[local63] = local119 >> 4 & 0xFF0;
					local45[local63] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt8359 = arg1.method6044();
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V")
	@Override
	public void method7956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method7956(arg0, arg1);
		if (this.anInt8359 >= 0 && Static55.anInterface2_1 != null) {
			@Pc(33) int local33 = Static55.anInterface2_1.method3085(this.anInt8359).aBoolean233 ? 64 : 128;
			this.anIntArray581 = Static55.anInterface2_1.method3088(this.anInt8359, local33, 1.0F, local33, false);
			this.anInt8353 = local33;
			this.anInt8357 = local33;
		}
	}
}
