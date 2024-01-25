import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public class Class4_Sub4_Sub27 extends Class4_Sub4 {

	@OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
	protected int anInt6156;

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "[I")
	protected int[] anIntArray500;

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
	protected int anInt6166;

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
	private int anInt6162 = -1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub27() {
		super(0, false);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)I")
	@Override
	public final int method5382() {
		return this.anInt6162;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public final void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6162 = arg1.method2404();
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)Z")
	protected final boolean method5165() {
		if (this.anIntArray500 != null) {
			return true;
		} else if (this.anInt6162 >= 0) {
			@Pc(29) Class206 local29 = Static302.anInt6103 >= 0 ? Static367.method5452(Static317.aClass11_142, Static302.anInt6103, this.anInt6162) : Static367.method5446(Static317.aClass11_142, this.anInt6162);
			local29.method5457();
			this.anIntArray500 = local29.method5460();
			this.anInt6166 = local29.anInt6576;
			this.anInt6156 = local29.anInt6577;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
	@Override
	public final void method5390() {
		super.method5390();
		this.anIntArray500 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441 && this.method5165()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(56) int local56 = (Static331.anInt6571 == this.anInt6166 ? arg0 : arg0 * this.anInt6166 / Static331.anInt6571) * this.anInt6156;
			@Pc(66) int local66;
			@Pc(74) int local74;
			if (this.anInt6156 == Static124.anInt3576) {
				for (local66 = 0; local66 < Static124.anInt3576; local66++) {
					local74 = this.anIntArray500[local56++];
					local36[local66] = (local74 & 0xFF) << 4;
					local32[local66] = local74 >> 4 & 0xFF0;
					local28[local66] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static124.anInt3576; local66++) {
					local74 = this.anInt6156 * local66 / Static124.anInt3576;
					@Pc(127) int local127 = this.anIntArray500[local56 + local74];
					local36[local66] = (local127 & 0xFF) << 4;
					local32[local66] = local127 >> 4 & 0xFF0;
					local28[local66] = local127 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
