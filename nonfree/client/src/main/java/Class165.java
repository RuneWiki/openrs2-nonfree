import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class165 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "[I")
	public int[] anIntArray444;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "[I")
	public int[] anIntArray445;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	public int anInt4734;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "[Lclient!ke;")
	public Class142[] aClass142Array1;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "[I")
	public int[] anIntArray446;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "[I")
	public int[] anIntArray447;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!ke;")
	public Class142 aClass142_1;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "[I")
	public int[] anIntArray448;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	public int anInt4737;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	public int anInt4738;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
	public final int anInt4735;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([BI)V")
	public Class165(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4735 = Static136.method2224(arg0, arg0.length);
		if (this.anInt4735 != arg1) {
			throw new RuntimeException();
		}
		this.method3653(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([BI)V")
	private void method3653(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class1_Sub3 local12 = new Class1_Sub3(Static270.method4028(arg0));
		@Pc(16) int local16 = local12.method1171();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt4734 = local12.method1188();
		} else {
			this.anInt4734 = 0;
		}
		@Pc(49) int local49 = local12.method1171();
		this.anInt4737 = local12.method1177();
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = -1;
		this.anIntArray449 = new int[this.anInt4737];
		for (@Pc(65) int local65 = 0; local65 < this.anInt4737; local65++) {
			this.anIntArray449[local65] = local56 += local12.method1177();
			if (this.anIntArray449[local65] > local58) {
				local58 = this.anIntArray449[local65];
			}
		}
		this.anInt4738 = local58 + 1;
		this.anIntArray447 = new int[this.anInt4738];
		this.anIntArray444 = new int[this.anInt4738];
		this.anIntArray445 = new int[this.anInt4738];
		this.anIntArrayArray38 = new int[this.anInt4738][];
		this.anIntArray446 = new int[this.anInt4738];
		@Pc(139) int local139;
		@Pc(153) int local153;
		if (local49 != 0) {
			this.anIntArray448 = new int[this.anInt4738];
			for (local139 = 0; local139 < this.anInt4738; local139++) {
				this.anIntArray448[local139] = -1;
			}
			for (local153 = 0; local153 < this.anInt4737; local153++) {
				this.anIntArray448[this.anIntArray449[local153]] = local12.method1188();
			}
			this.aClass142_1 = new Class142(this.anIntArray448);
		}
		for (local139 = 0; local139 < this.anInt4737; local139++) {
			this.anIntArray446[this.anIntArray449[local139]] = local12.method1188();
		}
		for (local153 = 0; local153 < this.anInt4737; local153++) {
			this.anIntArray444[this.anIntArray449[local153]] = local12.method1188();
		}
		for (@Pc(229) int local229 = 0; local229 < this.anInt4737; local229++) {
			this.anIntArray447[this.anIntArray449[local229]] = local12.method1177();
		}
		@Pc(255) int local255;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(272) int local272;
		@Pc(289) int local289;
		for (@Pc(248) int local248 = 0; local248 < this.anInt4737; local248++) {
			local255 = this.anIntArray449[local248];
			local260 = this.anIntArray447[local255];
			local56 = 0;
			local264 = -1;
			this.anIntArrayArray38[local255] = new int[local260];
			for (local272 = 0; local272 < local260; local272++) {
				local289 = this.anIntArrayArray38[local255][local272] = local56 += local12.method1177();
				if (local289 > local264) {
					local264 = local289;
				}
			}
			this.anIntArray445[local255] = local264 + 1;
			if (local264 + 1 == local260) {
				this.anIntArrayArray38[local255] = null;
			}
		}
		if (local49 == 0) {
			return;
		}
		this.aClass142Array1 = new Class142[local58 + 1];
		this.anIntArrayArray37 = new int[local58 + 1][];
		for (local255 = 0; local255 < this.anInt4737; local255++) {
			local260 = this.anIntArray449[local255];
			local264 = this.anIntArray447[local260];
			this.anIntArrayArray37[local260] = new int[this.anIntArray445[local260]];
			for (local272 = 0; local272 < this.anIntArray445[local260]; local272++) {
				this.anIntArrayArray37[local260][local272] = -1;
			}
			for (local289 = 0; local289 < local264; local289++) {
				@Pc(397) int local397;
				if (this.anIntArrayArray38[local260] == null) {
					local397 = local289;
				} else {
					local397 = this.anIntArrayArray38[local260][local289];
				}
				this.anIntArrayArray37[local260][local397] = local12.method1188();
			}
			this.aClass142Array1[local260] = new Class142(this.anIntArrayArray37[local260]);
		}
	}
}
