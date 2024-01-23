import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!og", name = "F", descriptor = "Z")
	private boolean aBoolean345 = true;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "Z")
	private boolean aBoolean346 = true;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(36) int[][] local36 = this.method4456(this.aBoolean345 ? Static202.anInt3956 - arg0 : arg0, 0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local18[0];
			@Pc(56) int[] local56 = local18[1];
			@Pc(60) int[] local60 = local18[2];
			@Pc(65) int local65;
			if (this.aBoolean346) {
				for (local65 = 0; local65 < Static6.anInt4960; local65++) {
					local52[local65] = local40[Static274.anInt5042 - local65];
					local56[local65] = local44[Static274.anInt5042 - local65];
					local60[local65] = local48[Static274.anInt5042 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static6.anInt4960; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(26) int[] local26 = this.method4464(this.aBoolean345 ? Static202.anInt3956 - arg0 : arg0, 0);
			if (this.aBoolean346) {
				for (@Pc(39) int local39 = 0; local39 < Static6.anInt4960; local39++) {
					local7[local39] = local26[Static274.anInt5042 - local39];
				}
			} else {
				Static317.method1046(local26, 0, local7, 0, Static6.anInt4960);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean346 = arg0.method1853() == 1;
		} else if (arg1 == 1) {
			this.aBoolean345 = arg0.method1853() == 1;
		} else if (arg1 == 2) {
			this.aBoolean505 = arg0.method1853() == 1;
		}
	}
}
