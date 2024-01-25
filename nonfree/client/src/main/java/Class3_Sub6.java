import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "[I")
	public static final int[] anIntArray637 = new int[120];

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "Lclient!lda;")
	public Class3_Sub6 aClass3_Sub6_66;

	@OriginalMember(owner = "client!lda", name = "n", descriptor = "Lclient!lda;")
	public Class3_Sub6 aClass3_Sub6_67;

	@OriginalMember(owner = "client!lda", name = "p", descriptor = "J")
	public long aLong290;

	static {
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 120; local11++) {
			@Pc(16) int local16 = local11 + 1;
			@Pc(29) int local29 = (int) ((double) local16 + Math.pow(2.0D, (double) local16 / 7.0D) * 300.0D);
			local9 += local29;
			anIntArray637[local11] = local9 / 4;
		}
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)Z")
	public final boolean method8339() {
		return this.aClass3_Sub6_66 != null;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
	public final void method8342() {
		if (this.aClass3_Sub6_66 != null) {
			this.aClass3_Sub6_66.aClass3_Sub6_67 = this.aClass3_Sub6_67;
			this.aClass3_Sub6_67.aClass3_Sub6_66 = this.aClass3_Sub6_66;
			this.aClass3_Sub6_67 = null;
			this.aClass3_Sub6_66 = null;
		}
	}
}
