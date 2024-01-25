import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class3_Sub8_Sub12 extends Class3_Sub8 {

	@OriginalMember(owner = "client!im", name = "F", descriptor = "I")
	private int anInt4550;

	@OriginalMember(owner = "client!im", name = "H", descriptor = "I")
	private int anInt4551;

	@OriginalMember(owner = "client!im", name = "K", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!im", name = "M", descriptor = "I")
	private int anInt4554 = -1;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt4554 = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)I")
	@Override
	public int method8775() {
		return this.anInt4554;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	@Override
	public void method8777() {
		super.method8777();
		this.anIntArray267 = null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(41) int local41 = this.anInt4551 * (this.anInt4550 == Static589.anInt9553 ? arg0 : this.anInt4550 * arg0 / Static589.anInt9553);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(59) int local59;
			@Pc(68) int local68;
			if (this.anInt4551 == Static91.anInt1849) {
				for (local59 = 0; local59 < Static91.anInt1849; local59++) {
					local68 = this.anIntArray267[local41++];
					local53[local59] = (local68 & 0xFF) << 4;
					local49[local59] = local68 >> 4 & 0xFF0;
					local45[local59] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static91.anInt1849; local59++) {
					local68 = this.anInt4551 * local59 / Static91.anInt1849;
					@Pc(75) int local75 = this.anIntArray267[local68 + local41];
					local53[local59] = (local75 & 0xFF) << 4;
					local49[local59] = local75 >> 4 & 0xFF0;
					local45[local59] = local75 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method8778(arg0, arg1);
		if (this.anInt4554 >= 0 && Static473.anInterface2_9 != null) {
			@Pc(27) int local27 = Static473.anInterface2_9.method8330(this.anInt4554).aBoolean462 ? 64 : 128;
			this.anIntArray267 = Static473.anInterface2_9.method8329(local27, local27, false, this.anInt4554, 1.0F);
			this.anInt4550 = local27;
			this.anInt4551 = local27;
		}
	}
}
