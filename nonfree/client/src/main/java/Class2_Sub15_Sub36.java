import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class2_Sub15_Sub36 extends Class2_Sub15 {

	@OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
	private int anInt10716;

	@OriginalMember(owner = "client!ul", name = "H", descriptor = "[I")
	private int[] anIntArray558;

	@OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
	private int anInt10724;

	@OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
	private int anInt10720 = -1;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub36() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(31) int local31 = this.anInt10716 * (Static667.anInt10615 == this.anInt10724 ? arg0 : this.anInt10724 * arg0 / Static667.anInt10615);
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			@Pc(53) int local53;
			@Pc(61) int local61;
			if (Static329.anInt6017 == this.anInt10716) {
				for (local53 = 0; local53 < Static329.anInt6017; local53++) {
					local61 = this.anIntArray558[local31++];
					local43[local53] = (local61 & 0xFF) << 4;
					local39[local53] = local61 >> 4 & 0xFF0;
					local35[local53] = local61 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static329.anInt6017; local53++) {
					local61 = this.anInt10716 * local53 / Static329.anInt6017;
					@Pc(110) int local110 = this.anIntArray558[local31 + local61];
					local43[local53] = (local110 & 0xFF) << 4;
					local39[local53] = local110 >> 4 & 0xFF0;
					local35[local53] = local110 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt10720 = arg1.method5211();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	@Override
	public void method9720() {
		super.method9720();
		this.anIntArray558 = null;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZII)V")
	@Override
	public void method9719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method9719(arg0, arg1);
		if (this.anInt10720 >= 0 && Static414.anInterface3_9 != null) {
			@Pc(27) int local27 = Static414.anInterface3_9.method1941(this.anInt10720).aBoolean333 ? 64 : 128;
			this.anIntArray558 = Static414.anInterface3_9.method1938(false, 1.0F, local27, this.anInt10720, local27);
			this.anInt10724 = local27;
			this.anInt10716 = local27;
		}
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)I")
	@Override
	public int method9728() {
		return this.anInt10720;
	}
}
