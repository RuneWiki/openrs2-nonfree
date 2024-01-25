import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class6_Sub4_Sub9 extends Class6_Sub4 {

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
	private int anInt3346 = 4;

	@OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
	private int anInt3349 = 4;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt3346 = arg1.method8604();
		} else if (arg0 == 1) {
			this.anInt3349 = arg1.method8604();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(25) int local25 = Static6.anInt111 / this.anInt3346;
			@Pc(30) int local30 = Static429.anInt7811 / this.anInt3349;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local30 > 0) {
				local39 = arg0 % local30;
				local49 = this.method8313(Static429.anInt7811 * local39 / local30, 0);
			} else {
				local49 = this.method8313(0, 0);
			}
			for (local39 = 0; local39 < Static6.anInt111; local39++) {
				if (local25 > 0) {
					@Pc(67) int local67 = local39 % local25;
					local16[local39] = local49[local67 * Static6.anInt111 / local25];
				} else {
					local16[local39] = local49[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(28) int local28 = Static6.anInt111 / this.anInt3346;
			@Pc(33) int local33 = Static429.anInt7811 / this.anInt3349;
			@Pc(44) int[][] local44;
			if (local33 <= 0) {
				local44 = this.method8319(0, 0);
			} else {
				@Pc(50) int local50 = arg0 % local33;
				local44 = this.method8319(0, local50 * Static429.anInt7811 / local33);
			}
			@Pc(64) int[] local64 = local44[0];
			@Pc(68) int[] local68 = local44[1];
			@Pc(72) int[] local72 = local44[2];
			@Pc(76) int[] local76 = local19[0];
			@Pc(80) int[] local80 = local19[1];
			@Pc(84) int[] local84 = local19[2];
			for (@Pc(86) int local86 = 0; local86 < Static6.anInt111; local86++) {
				@Pc(95) int local95;
				if (local28 <= 0) {
					local95 = 0;
				} else {
					@Pc(101) int local101 = local86 % local28;
					local95 = Static6.anInt111 * local101 / local28;
				}
				local76[local86] = local64[local95];
				local80[local86] = local68[local95];
				local84[local86] = local72[local95];
			}
		}
		return local19;
	}
}
