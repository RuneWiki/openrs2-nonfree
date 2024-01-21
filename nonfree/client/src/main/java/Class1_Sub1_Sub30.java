import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qh", name = "ob", descriptor = "Z")
	private boolean aBoolean143 = true;

	@OriginalMember(owner = "client!qh", name = "rb", descriptor = "Z")
	private boolean aBoolean144 = true;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(34) int[] local34 = this.method3303(this.aBoolean143 ? Static134.anInt3338 - arg0 : arg0, 0);
			if (this.aBoolean144) {
				for (@Pc(39) int local39 = 0; local39 < Static176.anInt3921; local39++) {
					local12[local39] = local34[Static70.anInt1730 - local39];
				}
			} else {
				Static217.method2362(local34, 0, local12, 0, Static176.anInt3921);
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.aBoolean144 = arg1.method1738() == 1;
		} else if (arg0 == 1) {
			this.aBoolean143 = arg1.method1738() == 1;
		} else if (arg0 == 2) {
			super.aBoolean185 = arg1.method1738() == 1;
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(28) int[][] local28 = this.method3307(0, this.aBoolean143 ? Static134.anInt3338 - arg0 : arg0);
			@Pc(32) int[] local32 = local28[1];
			@Pc(36) int[] local36 = local28[0];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[2];
			@Pc(48) int[] local48 = local11[0];
			@Pc(52) int[] local52 = local11[1];
			@Pc(57) int local57;
			if (this.aBoolean144) {
				for (local57 = 0; local57 < Static176.anInt3921; local57++) {
					local48[local57] = local36[Static70.anInt1730 - local57];
					local52[local57] = local32[Static70.anInt1730 - local57];
					local44[local57] = local40[Static70.anInt1730 - local57];
				}
			} else {
				for (local57 = 0; local57 < Static176.anInt3921; local57++) {
					local48[local57] = local36[local57];
					local52[local57] = local32[local57];
					local44[local57] = local40[local57];
				}
			}
		}
		return local11;
	}
}
