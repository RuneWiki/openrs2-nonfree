import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
	private int anInt7884 = 4096;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt7884 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(25) int[] local25 = this.method7882(0, arg0 - 1 & Static561.anInt6003);
			@Pc(31) int[] local31 = this.method7882(0, arg0);
			@Pc(41) int[] local41 = this.method7882(0, arg0 + 1 & Static561.anInt6003);
			for (@Pc(43) int local43 = 0; local43 < Static87.anInt1964; local43++) {
				@Pc(57) int local57 = (local41[local43] - local25[local43]) * this.anInt7884;
				@Pc(77) int local77 = this.anInt7884 * (local31[local43 + 1 & Static451.anInt8721] - local31[local43 - 1 & Static451.anInt8721]);
				@Pc(81) int local81 = local77 >> 12;
				@Pc(85) int local85 = local57 >> 12;
				@Pc(91) int local91 = local81 * local81 >> 12;
				@Pc(97) int local97 = local85 * local85 >> 12;
				@Pc(112) int local112 = (int) (Math.sqrt((double) ((float) (local91 + local97 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(123) int local123 = local112 == 0 ? 0 : 16777216 / local112;
				local11[local43] = 4096 - local123;
			}
		}
		return local11;
	}
}
