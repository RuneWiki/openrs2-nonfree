import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class2_Sub1_Sub37 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
	private int anInt7400;

	@OriginalMember(owner = "client!vk", name = "P", descriptor = "[I")
	private int[] anIntArray497;

	@OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
	private int anInt7407;

	@OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
	private int anInt7408 = -1;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub37() {
		super(0, false);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method6030(arg0, arg1);
		if (this.anInt7408 >= 0 && Static204.anInterface8_7 != null) {
			@Pc(27) int local27 = Static204.anInterface8_7.method3836(this.anInt7408).aBoolean432 ? 64 : 128;
			this.anIntArray497 = Static204.anInterface8_7.method3832(1.0F, this.anInt7408, false, local27, local27);
			this.anInt7407 = local27;
			this.anInt7400 = local27;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt7408 = arg1.method3711();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(36) int local36 = this.anInt7407 * (this.anInt7400 == Static266.anInt4930 ? arg0 : this.anInt7400 * arg0 / Static266.anInt4930);
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local16[1];
			@Pc(48) int[] local48 = local16[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (this.anInt7407 == Static131.anInt2581) {
				for (local58 = 0; local58 < Static131.anInt2581; local58++) {
					local66 = this.anIntArray497[local36++];
					local48[local58] = (local66 & 0xFF) << 4;
					local44[local58] = local66 >> 4 & 0xFF0;
					local40[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static131.anInt2581; local58++) {
					local66 = this.anInt7407 * local58 / Static131.anInt2581;
					@Pc(119) int local119 = this.anIntArray497[local36 + local66];
					local48[local58] = (local119 & 0xFF) << 4;
					local44[local58] = local119 >> 4 & 0xFF0;
					local40[local58] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V")
	@Override
	public void method6038() {
		super.method6038();
		this.anIntArray497 = null;
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)I")
	@Override
	public int method6029() {
		return this.anInt7408;
	}
}
