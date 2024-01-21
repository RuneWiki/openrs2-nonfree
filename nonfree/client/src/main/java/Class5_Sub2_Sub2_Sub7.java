import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class5_Sub2_Sub2_Sub7 extends Class5_Sub2_Sub2 {

	@OriginalMember(owner = "client!wd", name = "lb", descriptor = "I")
	private final int anInt3369;

	@OriginalMember(owner = "client!wd", name = "ib", descriptor = "I")
	private final int anInt3366;

	@OriginalMember(owner = "client!wd", name = "nb", descriptor = "I")
	private final int anInt3371;

	@OriginalMember(owner = "client!wd", name = "kb", descriptor = "I")
	private final int anInt3368;

	@OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
	private final int anInt3363;

	@OriginalMember(owner = "client!wd", name = "jb", descriptor = "I")
	private final int anInt3367;

	@OriginalMember(owner = "client!wd", name = "fb", descriptor = "Lclient!w;")
	private Class5_Sub2_Sub17 aClass5_Sub2_Sub17_3;

	@OriginalMember(owner = "client!wd", name = "hb", descriptor = "I")
	private int anInt3365;

	@OriginalMember(owner = "client!wd", name = "xb", descriptor = "I")
	private int anInt3376;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIIIIZLclient!mf;)V")
	public Class5_Sub2_Sub2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class5_Sub2_Sub2 arg8) {
		this.anInt3369 = arg4;
		this.anInt3366 = arg5;
		this.anInt3371 = arg2;
		this.anInt3368 = arg1;
		this.anInt3363 = arg0;
		this.anInt3367 = arg3;
		if (arg6 != -1) {
			this.aClass5_Sub2_Sub17_3 = Static106.method1769(arg6);
			this.anInt3365 = 0;
			this.anInt3376 = Static58.anInt1422 - 1;
			if (this.aClass5_Sub2_Sub17_3.anInt3243 == 0 && arg8 != null && arg8 instanceof Class5_Sub2_Sub2_Sub7) {
				@Pc(51) Class5_Sub2_Sub2_Sub7 local51 = (Class5_Sub2_Sub2_Sub7) arg8;
				if (local51.aClass5_Sub2_Sub17_3 == this.aClass5_Sub2_Sub17_3) {
					this.anInt3365 = local51.anInt3365;
					this.anInt3376 = local51.anInt3376;
					return;
				}
			}
			if (arg7 && this.aClass5_Sub2_Sub17_3.anInt3228 != -1) {
				this.anInt3365 = (int) ((double) this.aClass5_Sub2_Sub17_3.anIntArray391.length * Math.random());
				this.anInt3376 -= (int) ((double) this.aClass5_Sub2_Sub17_3.anIntArray396[this.anInt3365] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)Lclient!wb;")
	@Override
	public Class5_Sub2_Sub2_Sub6 method2178() {
		if (this.aClass5_Sub2_Sub17_3 != null) {
			@Pc(10) int local10 = Static58.anInt1422 - this.anInt3376;
			if (local10 > 100 && this.aClass5_Sub2_Sub17_3.anInt3228 > 0) {
				local10 = 100;
			}
			label46: {
				do {
					do {
						if (local10 <= this.aClass5_Sub2_Sub17_3.anIntArray396[this.anInt3365]) {
							break label46;
						}
						local10 -= this.aClass5_Sub2_Sub17_3.anIntArray396[this.anInt3365];
						this.anInt3365++;
					} while (this.anInt3365 < this.aClass5_Sub2_Sub17_3.anIntArray391.length);
					this.anInt3365 -= this.aClass5_Sub2_Sub17_3.anInt3228;
				} while (this.anInt3365 >= 0 && this.aClass5_Sub2_Sub17_3.anIntArray391.length > this.anInt3365);
				this.aClass5_Sub2_Sub17_3 = null;
			}
			this.anInt3376 = Static58.anInt1422 - local10;
		}
		@Pc(105) Class5_Sub2_Sub16 local105 = Static43.method767(this.anInt3363);
		if (local105.anIntArray377 != null) {
			local105 = local105.method1966();
		}
		if (local105 == null) {
			return null;
		}
		@Pc(136) int local136;
		@Pc(133) int local133;
		if (this.anInt3371 == 1 || this.anInt3371 == 3) {
			local133 = local105.anInt3120;
			local136 = local105.anInt3126;
		} else {
			local133 = local105.anInt3126;
			local136 = local105.anInt3120;
		}
		@Pc(151) int local151 = this.anInt3369 + (local136 >> 1);
		@Pc(160) int local160 = (local133 + 1 >> 1) + this.anInt3366;
		@Pc(169) int local169 = this.anInt3369 + (local136 + 1 >> 1);
		@Pc(177) int local177 = this.anInt3366 + (local133 >> 1);
		@Pc(182) int[][] local182 = Static65.anIntArrayArrayArray3[this.anInt3367];
		@Pc(191) int local191 = (this.anInt3366 << 7) + (local133 << 6);
		@Pc(218) int local218 = local182[local151][local177] + local182[local169][local177] + local182[local151][local160] + local182[local169][local160] >> 2;
		@Pc(234) int local234 = (this.anInt3369 << 7) + (local136 << 6);
		return local105.method1960(local234, local182, local218, this.anInt3365, local191, this.aClass5_Sub2_Sub17_3, this.anInt3371, this.anInt3368);
	}
}
