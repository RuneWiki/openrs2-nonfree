import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class5_Sub2_Sub31 extends Class5_Sub2 {

	@OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
	private int anInt9369;

	@OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
	private int anInt9370;

	@OriginalMember(owner = "client!tl", name = "R", descriptor = "[I")
	private int[] anIntArray514;

	@OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
	private int anInt9367 = -1;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub31() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	@Override
	public void method8947() {
		super.method8947();
		this.anIntArray514 = null;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)V")
	@Override
	public void method8949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method8949(arg0, arg1);
		if (this.anInt9367 >= 0 && Static476.anInterface4_9 != null) {
			@Pc(24) int local24 = Static476.anInterface4_9.method358(this.anInt9367).aBoolean312 ? 64 : 128;
			this.anIntArray514 = Static476.anInterface4_9.method363(this.anInt9367, local24, 1.0F, false, local24);
			this.anInt9370 = local24;
			this.anInt9369 = local24;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(39) int local39 = (this.anInt9369 == Static195.anInt3756 ? arg0 : arg0 * this.anInt9369 / Static195.anInt3756) * this.anInt9370;
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (Static195.anInt3759 == this.anInt9370) {
				for (local57 = 0; local57 < Static195.anInt3759; local57++) {
					local66 = this.anIntArray514[local39++];
					local51[local57] = (local66 & 0xFF) << 4;
					local47[local57] = local66 >> 4 & 0xFF0;
					local43[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static195.anInt3759; local57++) {
					local66 = this.anInt9370 * local57 / Static195.anInt3759;
					@Pc(74) int local74 = this.anIntArray514[local39 + local66];
					local51[local57] = (local74 & 0xFF) << 4;
					local47[local57] = local74 >> 4 & 0xFF0;
					local43[local57] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)I")
	@Override
	public int method8953() {
		return this.anInt9367;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9367 = arg0.method7860();
		}
	}
}
