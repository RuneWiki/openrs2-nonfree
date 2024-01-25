import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
	private int anInt3204 = 4;

	@OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
	private int anInt3206 = 4;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(25) int local25 = Static391.anInt7118 / this.anInt3206;
			@Pc(30) int local30 = Static299.anInt5583 / this.anInt3204;
			@Pc(48) int[][] local48;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local48 = this.method6061(0, local36 * Static299.anInt5583 / local30);
			} else {
				local48 = this.method6061(0, 0);
			}
			@Pc(60) int[] local60 = local48[0];
			@Pc(64) int[] local64 = local48[1];
			@Pc(68) int[] local68 = local48[2];
			@Pc(72) int[] local72 = local16[0];
			@Pc(76) int[] local76 = local16[1];
			@Pc(80) int[] local80 = local16[2];
			for (@Pc(82) int local82 = 0; local82 < Static391.anInt7118; local82++) {
				@Pc(99) int local99;
				if (local25 > 0) {
					@Pc(93) int local93 = local82 % local25;
					local99 = Static391.anInt7118 * local93 / local25;
				} else {
					local99 = 0;
				}
				local72[local82] = local60[local99];
				local76[local82] = local64[local99];
				local80[local82] = local68[local99];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt3206 = arg1.method5732();
		} else if (arg0 == 1) {
			this.anInt3204 = arg1.method5732();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(25) int local25 = Static391.anInt7118 / this.anInt3206;
			@Pc(30) int local30 = Static299.anInt5583 / this.anInt3204;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local30 <= 0) {
				local41 = this.method6069(0, 0);
			} else {
				local47 = arg0 % local30;
				local41 = this.method6069(0, local47 * Static299.anInt5583 / local30);
			}
			for (local47 = 0; local47 < Static391.anInt7118; local47++) {
				if (local25 > 0) {
					@Pc(67) int local67 = local47 % local25;
					local16[local47] = local41[local67 * Static391.anInt7118 / local25];
				} else {
					local16[local47] = local41[0];
				}
			}
		}
		return local16;
	}
}
