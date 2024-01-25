import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
	protected int anInt3849;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
	protected int anInt3852;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
	protected int[] anIntArray285;

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
	private int anInt3846 = -1;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	@Override
	public final void method9574() {
		super.method9574();
		this.anIntArray285 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
	@Override
	public final int method9579() {
		return this.anInt3846;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509 && this.method3479()) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			@Pc(56) int local56 = (this.anInt3852 == Static24.anInt740 ? arg0 : this.anInt3852 * arg0 / Static24.anInt740) * this.anInt3849;
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (Static379.anInt5859 == this.anInt3849) {
				for (local62 = 0; local62 < Static379.anInt5859; local62++) {
					local71 = this.anIntArray285[local56++];
					local35[local62] = (local71 & 0xFF) << 4;
					local31[local62] = local71 >> 4 & 0xFF0;
					local27[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static379.anInt5859; local62++) {
					local71 = local62 * this.anInt3849 / Static379.anInt5859;
					@Pc(78) int local78 = this.anIntArray285[local71 + local56];
					local35[local62] = (local78 & 0xFF) << 4;
					local31[local62] = local78 >> 4 & 0xFF0;
					local27[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public final void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3846 = arg1.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)Z")
	protected final boolean method3479() {
		if (this.anIntArray285 != null) {
			return true;
		} else if (this.anInt3846 >= 0) {
			@Pc(39) Class361 local39 = Static227.anInt3696 < 0 ? Static735.method8272(Static644.aClass182_117, this.anInt3846) : Static735.method8269(Static644.aClass182_117, Static227.anInt3696, this.anInt3846);
			local39.method8276();
			this.anIntArray285 = local39.method8280();
			this.anInt3849 = local39.anInt9706;
			this.anInt3852 = local39.anInt9707;
			return true;
		} else {
			return false;
		}
	}
}
