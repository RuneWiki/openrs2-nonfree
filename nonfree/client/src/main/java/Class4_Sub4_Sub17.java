import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class4_Sub4_Sub17 extends Class4_Sub4 {

	@OriginalMember(owner = "client!kl", name = "O", descriptor = "Z")
	private boolean aBoolean300 = true;

	@OriginalMember(owner = "client!kl", name = "M", descriptor = "Z")
	private boolean aBoolean299 = true;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.aBoolean299 = arg1.method2380() == 1;
		} else if (arg0 == 1) {
			this.aBoolean300 = arg1.method2380() == 1;
		} else if (arg0 == 2) {
			super.aBoolean563 = arg1.method2380() == 1;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(28) int[][] local28 = this.method5384(0, this.aBoolean300 ? Static59.anInt1278 - arg0 : arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(57) int local57;
			if (this.aBoolean299) {
				for (local57 = 0; local57 < Static124.anInt3576; local57++) {
					local44[local57] = local32[Static350.anInt6802 - local57];
					local48[local57] = local36[Static350.anInt6802 - local57];
					local52[local57] = local40[Static350.anInt6802 - local57];
				}
			} else {
				for (local57 = 0; local57 < Static124.anInt3576; local57++) {
					local44[local57] = local32[local57];
					local48[local57] = local36[local57];
					local52[local57] = local40[local57];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(36) int[] local36 = this.method5386(0, this.aBoolean300 ? Static59.anInt1278 - arg0 : arg0);
			if (this.aBoolean299) {
				for (@Pc(41) int local41 = 0; local41 < Static124.anInt3576; local41++) {
					local11[local41] = local36[Static350.anInt6802 - local41];
				}
			} else {
				Static363.method4762(local36, 0, local11, 0, Static124.anInt3576);
			}
		}
		return local11;
	}
}
