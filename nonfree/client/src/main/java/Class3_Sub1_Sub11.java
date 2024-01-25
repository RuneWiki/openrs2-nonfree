import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!haa", name = "N", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!haa", name = "O", descriptor = "I")
	private int anInt3589;

	@OriginalMember(owner = "client!haa", name = "U", descriptor = "I")
	private int anInt3594;

	@OriginalMember(owner = "client!haa", name = "W", descriptor = "I")
	private int anInt3596 = -1;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub11() {
		super(0, false);
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(39) int local39 = (Static245.anInt4535 == this.anInt3589 ? arg0 : this.anInt3589 * arg0 / Static245.anInt4535) * this.anInt3594;
			@Pc(43) int[] local43 = local19[0];
			@Pc(47) int[] local47 = local19[1];
			@Pc(51) int[] local51 = local19[2];
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (this.anInt3594 == Static206.anInt4182) {
				for (local57 = 0; local57 < Static206.anInt4182; local57++) {
					local65 = this.anIntArray308[local39++];
					local51[local57] = (local65 & 0xFF) << 4;
					local47[local57] = local65 >> 4 & 0xFF0;
					local43[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static206.anInt4182; local57++) {
					local65 = this.anInt3594 * local57 / Static206.anInt4182;
					@Pc(113) int local113 = this.anIntArray308[local65 + local39];
					local51[local57] = (local113 & 0xFF) << 4;
					local47[local57] = local113 >> 4 & 0xFF0;
					local43[local57] = local113 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method7771(arg0, arg1);
		if (this.anInt3596 >= 0 && Static381.anInterface8_11 != null) {
			@Pc(32) int local32 = Static381.anInterface8_11.method6560(this.anInt3596).aBoolean490 ? 64 : 128;
			this.anIntArray308 = Static381.anInterface8_11.method6555(this.anInt3596, false, 1.0F, local32, local32);
			this.anInt3594 = local32;
			this.anInt3589 = local32;
		}
	}

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)V")
	@Override
	public void method7764() {
		super.method7764();
		this.anIntArray308 = null;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3596 = arg0.method3109();
		}
	}

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "(I)I")
	@Override
	public int method7770() {
		return this.anInt3596;
	}
}
