import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class4_Sub6_Sub17 extends Class4_Sub6 {

	@OriginalMember(owner = "client!jt", name = "J", descriptor = "I")
	private int anInt3747;

	@OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
	private int anInt3748;

	@OriginalMember(owner = "client!jt", name = "O", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
	private int anInt3750 = -1;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub17() {
		super(0, false);
	}

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V")
	@Override
	public void method5517() {
		super.method5517();
		this.anIntArray254 = null;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt3750 = arg1.method2536();
		}
	}

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)I")
	@Override
	public int method5512() {
		return this.anInt3750;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5513(arg0, arg1);
		if (this.anInt3750 >= 0 && Static331.anInterface7_7 != null) {
			@Pc(27) int local27 = Static331.anInterface7_7.method2396(this.anInt3750).aBoolean637 ? 64 : 128;
			this.anIntArray254 = Static331.anInterface7_7.method2393(false, this.anInt3750, 1.0F, local27, local27);
			this.anInt3748 = local27;
			this.anInt3747 = local27;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(41) int local41 = (Static262.anInt4939 == this.anInt3748 ? arg0 : arg0 * this.anInt3748 / Static262.anInt4939) * this.anInt3747;
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(63) int local63;
			@Pc(71) int local71;
			if (Static80.anInt1616 == this.anInt3747) {
				for (local63 = 0; local63 < Static80.anInt1616; local63++) {
					local71 = this.anIntArray254[local41++];
					local53[local63] = (local71 & 0xFF) << 4;
					local49[local63] = local71 >> 4 & 0xFF0;
					local45[local63] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static80.anInt1616; local63++) {
					local71 = local63 * this.anInt3747 / Static80.anInt1616;
					@Pc(119) int local119 = this.anIntArray254[local71 + local41];
					local53[local63] = (local119 & 0xFF) << 4;
					local49[local63] = local119 >> 4 & 0xFF0;
					local45[local63] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
