import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class5_Sub6_Sub26 extends Class5_Sub6 {

	@OriginalMember(owner = "client!naa", name = "I", descriptor = "I")
	private int anInt6671 = 4096;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6671 = arg0.method3698();
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(25) int[] local25 = this.method8117(arg0 - 1 & Static442.anInt7781, 0);
			@Pc(31) int[] local31 = this.method8117(arg0, 0);
			@Pc(41) int[] local41 = this.method8117(Static442.anInt7781 & arg0 + 1, 0);
			for (@Pc(43) int local43 = 0; local43 < Static421.anInt7443; local43++) {
				@Pc(57) int local57 = this.anInt6671 * (local41[local43] - local25[local43]);
				@Pc(77) int local77 = (local31[Static575.anInt9380 & local43 + 1] - local31[local43 - 1 & Static575.anInt9380]) * this.anInt6671;
				@Pc(81) int local81 = local77 >> 12;
				@Pc(85) int local85 = local57 >> 12;
				@Pc(91) int local91 = local81 * local81 >> 12;
				@Pc(97) int local97 = local85 * local85 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((float) (local97 + local91 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(122) int local122 = local111 == 0 ? 0 : 16777216 / local111;
				local11[local43] = 4096 - local122;
			}
		}
		return local11;
	}
}
