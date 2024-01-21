import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class4_Sub1_Sub1_Sub2 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
	private final int anInt807;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
	private final int anInt799;

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
	private final int anInt802;

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
	private final int anInt801;

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
	private final int anInt809;

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
	private final int anInt806;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!ca;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_1;

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
	private int anInt805;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIIIZLclient!tg;)V")
	public Class4_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class4_Sub1_Sub1 arg8) {
		this.anInt807 = arg2;
		this.anInt799 = arg5;
		this.anInt802 = arg1;
		this.anInt801 = arg3;
		this.anInt809 = arg4;
		this.anInt806 = arg0;
		if (arg6 != -1) {
			this.aClass4_Sub1_Sub4_1 = Static137.method2394(arg6);
			this.anInt810 = Static142.anInt3325 - 1;
			this.anInt805 = 0;
			if (this.aClass4_Sub1_Sub4_1.anInt542 == 0 && arg8 != null && arg8 instanceof Class4_Sub1_Sub1_Sub2) {
				@Pc(51) Class4_Sub1_Sub1_Sub2 local51 = (Class4_Sub1_Sub1_Sub2) arg8;
				if (local51.aClass4_Sub1_Sub4_1 == this.aClass4_Sub1_Sub4_1) {
					this.anInt805 = local51.anInt805;
					this.anInt810 = local51.anInt810;
					return;
				}
			}
			if (arg7 && this.aClass4_Sub1_Sub4_1.anInt547 != -1) {
				this.anInt805 = (int) ((double) this.aClass4_Sub1_Sub4_1.anIntArray52.length * Math.random());
				this.anInt810 -= (int) (Math.random() * (double) this.aClass4_Sub1_Sub4_1.anIntArray50[this.anInt805]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)Lclient!dg;")
	@Override
	protected Class4_Sub1_Sub1_Sub4 method2820() {
		if (this.aClass4_Sub1_Sub4_1 != null) {
			@Pc(10) int local10 = Static142.anInt3325 - this.anInt810;
			if (local10 > 100 && this.aClass4_Sub1_Sub4_1.anInt547 > 0) {
				local10 = 100;
			}
			label46: {
				do {
					do {
						if (local10 <= this.aClass4_Sub1_Sub4_1.anIntArray50[this.anInt805]) {
							break label46;
						}
						local10 -= this.aClass4_Sub1_Sub4_1.anIntArray50[this.anInt805];
						this.anInt805++;
					} while (this.aClass4_Sub1_Sub4_1.anIntArray52.length > this.anInt805);
					this.anInt805 -= this.aClass4_Sub1_Sub4_1.anInt547;
				} while (this.anInt805 >= 0 && this.aClass4_Sub1_Sub4_1.anIntArray52.length > this.anInt805);
				this.aClass4_Sub1_Sub4_1 = null;
			}
			this.anInt810 = Static142.anInt3325 - local10;
		}
		@Pc(101) Class4_Sub1_Sub19 local101 = Static113.method2090(this.anInt806);
		if (local101.anIntArray442 != null) {
			local101 = local101.method3185();
		}
		if (local101 == null) {
			return null;
		}
		@Pc(128) int local128;
		@Pc(125) int local125;
		if (this.anInt807 == 1 || this.anInt807 == 3) {
			local125 = local101.anInt4191;
			local128 = local101.anInt4187;
		} else {
			local125 = local101.anInt4187;
			local128 = local101.anInt4191;
		}
		@Pc(144) int local144 = this.anInt809 + (local128 >> 1);
		@Pc(151) int local151 = (local125 >> 1) + this.anInt799;
		@Pc(160) int local160 = (local125 + 1 >> 1) + this.anInt799;
		@Pc(165) int[][] local165 = Static112.anIntArrayArrayArray42[this.anInt801];
		@Pc(175) int local175 = (this.anInt809 << 7) + (local128 << 6);
		@Pc(184) int local184 = (local128 + 1 >> 1) + this.anInt809;
		@Pc(193) int local193 = (this.anInt799 << 7) + (local125 << 6);
		@Pc(224) int local224 = local165[local184][local160] + local165[local144][local160] + local165[local184][local151] + local165[local144][local151] >> 2;
		return local101.method3189(this.anInt802, local224, this.anInt807, local175, this.aClass4_Sub1_Sub4_1, local193, this.anInt805, local165);
	}
}
