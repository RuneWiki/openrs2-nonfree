import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
	protected int anInt1390;

	@OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
	protected int anInt1392;

	@OriginalMember(owner = "client!uh", name = "V", descriptor = "[I")
	protected int[] anIntArray145;

	@OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
	private int anInt1395;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public final void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1395 = arg1.method1642();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168 && this.method1116()) {
			@Pc(28) int[] local28 = local7[0];
			@Pc(32) int[] local32 = local7[1];
			@Pc(36) int[] local36 = local7[2];
			@Pc(52) int local52 = this.anInt1390 * (Static30.anInt1097 == this.anInt1392 ? arg0 : this.anInt1392 * arg0 / Static30.anInt1097);
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (Static65.anInt1933 == this.anInt1390) {
				for (local58 = 0; local58 < Static65.anInt1933; local58++) {
					local66 = this.anIntArray145[local52++];
					local36[local58] = (local66 & 0xFF) << 4;
					local32[local58] = local66 >> 4 & 0xFF0;
					local28[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static65.anInt1933; local58++) {
					local66 = local58 * this.anInt1390 / Static65.anInt1933;
					@Pc(114) int local114 = this.anIntArray145[local66 + local52];
					local36[local58] = (local114 & 0xFF) << 4;
					local32[local58] = local114 >> 4 & 0xFF0;
					local28[local58] = local114 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)I")
	@Override
	public final int method3007() {
		return this.anInt1395;
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)Z")
	protected final boolean method1116() {
		if (this.anIntArray145 != null) {
			return true;
		} else if (this.anInt1395 >= 0) {
			@Pc(28) Class1_Sub2_Sub1_Sub3 local28 = Static181.method2987(Static123.aClass4_77, this.anInt1395);
			local28.method418();
			this.anInt1392 = local28.anInt357;
			this.anInt1390 = local28.anInt358;
			this.anIntArray145 = local28.anIntArray45;
			return true;
		} else {
			return false;
		}
	}
}
