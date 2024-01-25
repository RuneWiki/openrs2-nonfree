import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class2_Sub11_Sub24 extends Class2_Sub11 {

	@OriginalMember(owner = "client!rea", name = "K", descriptor = "I")
	private int anInt8616 = 4096;

	@OriginalMember(owner = "client!rea", name = "J", descriptor = "I")
	private int anInt8618 = 4096;

	@OriginalMember(owner = "client!rea", name = "I", descriptor = "I")
	private int anInt8617 = 4096;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt8618 = arg1.method8575();
		} else if (arg0 == 1) {
			this.anInt8617 = arg1.method8575();
		} else if (arg0 == 2) {
			this.anInt8616 = arg1.method8575();
		}
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(28) int[][] local28 = this.method9538(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static301.anInt10214; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local40[local54];
				@Pc(68) int local68 = local36[local54];
				if (local64 == local60 && local64 == local68) {
					local44[local54] = this.anInt8618 * local60 >> 12;
					local48[local54] = local64 * this.anInt8617 >> 12;
					local52[local54] = local68 * this.anInt8616 >> 12;
				} else {
					local44[local54] = this.anInt8618;
					local48[local54] = this.anInt8617;
					local52[local54] = this.anInt8616;
				}
			}
		}
		return local18;
	}
}
