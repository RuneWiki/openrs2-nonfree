import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class3_Sub1_Sub31 extends Class3_Sub1 {

	@OriginalMember(owner = "client!or", name = "I", descriptor = "I")
	private int anInt4641;

	@OriginalMember(owner = "client!or", name = "L", descriptor = "I")
	private int anInt4644;

	@OriginalMember(owner = "client!or", name = "R", descriptor = "[I")
	private int[] anIntArray514;

	@OriginalMember(owner = "client!or", name = "S", descriptor = "I")
	private int anInt4648 = -1;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub31() {
		super(0, false);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	@Override
	public void method5543() {
		super.method5543();
		this.anIntArray514 = null;
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(B)I")
	@Override
	public int method5542() {
		return this.anInt4648;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(36) int local36 = this.anInt4644 * (this.anInt4641 == Static220.anInt3914 ? arg0 : this.anInt4641 * arg0 / Static220.anInt3914);
			@Pc(40) int[] local40 = local11[0];
			@Pc(44) int[] local44 = local11[1];
			@Pc(48) int[] local48 = local11[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (this.anInt4644 == Static238.anInt4221) {
				for (local58 = 0; local58 < Static238.anInt4221; local58++) {
					local66 = this.anIntArray514[local36++];
					local48[local58] = (local66 & 0xFF) << 4;
					local44[local58] = local66 >> 4 & 0xFF0;
					local40[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static238.anInt4221; local58++) {
					local66 = local58 * this.anInt4644 / Static238.anInt4221;
					@Pc(115) int local115 = this.anIntArray514[local36 + local66];
					local48[local58] = (local115 & 0xFF) << 4;
					local44[local58] = local115 >> 4 & 0xFF0;
					local40[local58] = local115 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4648 = arg0.method2767();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V")
	@Override
	public void method5544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method5544(arg0, arg1);
		if (this.anInt4648 >= 0 && Static221.anInterface10_4 != null) {
			@Pc(24) int local24 = Static221.anInterface10_4.method192(this.anInt4648).aBoolean224 ? 64 : 128;
			this.anIntArray514 = Static221.anInterface10_4.method194(local24, 1.0F, false, local24, this.anInt4648);
			this.anInt4644 = local24;
			this.anInt4641 = local24;
		}
	}
}
