import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class5_Sub6_Sub22_Sub1 extends Class5_Sub6_Sub22 {

	@OriginalMember(owner = "client!kh", name = "gb", descriptor = "[Lclient!kq;")
	private static final Class208[] aClass208Array1 = new Class208[32];

	static {
		@Pc(79) Class208[] local79 = Static209.method2990();
		for (@Pc(81) int local81 = 0; local81 < local79.length; local81++) {
			aClass208Array1[local79[local81].anInt5598] = local79[local81];
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487 && this.method4149()) {
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			@Pc(41) int local41 = arg0 % super.anInt4735 * super.anInt4735;
			for (@Pc(43) int local43 = 0; local43 < Static421.anInt7443; local43++) {
				@Pc(55) int local55 = super.anIntArray278[local43 % super.anInt4737 + local41];
				local33[local43] = (local55 & 0xFF) << 4;
				local29[local43] = local55 >> 4 & 0xFF0;
				local25[local43] = local55 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
