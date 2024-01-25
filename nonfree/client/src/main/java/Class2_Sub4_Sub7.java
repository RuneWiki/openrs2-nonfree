import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class2_Sub4_Sub7 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
	private int anInt856 = 4096;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt856 = arg0.method5312();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(25) int[] local25 = this.method5600(Static283.anInt4900 & arg0 - 1, 0);
			@Pc(31) int[] local31 = this.method5600(arg0, 0);
			@Pc(41) int[] local41 = this.method5600(arg0 + 1 & Static283.anInt4900, 0);
			for (@Pc(43) int local43 = 0; local43 < Static76.anInt1458; local43++) {
				@Pc(57) int local57 = (local41[local43] - local25[local43]) * this.anInt856;
				@Pc(77) int local77 = this.anInt856 * (local31[local43 + 1 & Static269.anInt4657] - local31[Static269.anInt4657 & local43 - 1]);
				@Pc(81) int local81 = local77 >> 12;
				@Pc(85) int local85 = local57 >> 12;
				@Pc(91) int local91 = local81 * local81 >> 12;
				@Pc(97) int local97 = local85 * local85 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((float) (local91 + local97 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(122) int local122 = local111 == 0 ? 0 : 16777216 / local111;
				local11[local43] = 4096 - local122;
			}
		}
		return local11;
	}
}
