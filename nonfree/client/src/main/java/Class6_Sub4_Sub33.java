import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class6_Sub4_Sub33 extends Class6_Sub4 {

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
	private int anInt8232 = 4096;

	@OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
	private int anInt8235 = 0;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(21) int[] local21 = this.method8313(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static6.anInt111; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt8235 && this.anInt8232 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt8235 = arg1.method8571();
		} else if (arg0 == 1) {
			this.anInt8232 = arg1.method8571();
		}
	}
}
