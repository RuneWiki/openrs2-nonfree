import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class158 {

	@OriginalMember(owner = "client!it", name = "g", descriptor = "Lclient!jo;")
	private final Class168 aClass168_58;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "[[I")
	private final int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class158(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_58 = arg2;
		this.aClass168_58.method4443(1);
		@Pc(22) Class6_Sub26 local22 = new Class6_Sub26(this.aClass168_58.method4435(0, 0));
		@Pc(26) int local26 = local22.method4966();
		if (local26 > 1) {
			this.anIntArrayArray33 = new int[0][];
		} else {
			@Pc(33) int local33 = local22.method4966();
			@Pc(36) Class271[] local36 = Static152.method2946();
			@Pc(38) boolean local38 = true;
			@Pc(44) int local44;
			@Pc(50) int local50;
			if (local36.length == local33) {
				for (local44 = 0; local44 < local36.length; local44++) {
					local50 = local22.method4966();
					if (local36[local44].anInt7861 != local50) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local44 = local22.method4966();
				local50 = local22.method4966();
				this.anIntArrayArray33 = new int[local50 + 1][];
				for (@Pc(92) int local92 = 0; local92 < local44; local92++) {
					@Pc(98) int local98 = local22.method4966();
					@Pc(102) int local102 = local22.method4999();
					this.anIntArrayArray33[local98] = new int[local102];
					for (@Pc(110) int local110 = 0; local110 < local102; local110++) {
						this.anIntArrayArray33[local92][local110] = local22.method4999();
					}
				}
			} else {
				this.anIntArrayArray33 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Lclient!iu;")
	public Class159 method4116(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = this.aClass168_58.method4435(arg0, 1);
		@Pc(14) Class159 local14 = new Class159();
		local14.method4123(new Class6_Sub26(local10));
		return local14;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)[I")
	public int[] method4117(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < this.anIntArrayArray33.length ? this.anIntArrayArray33[arg0] : new int[0];
	}
}
