import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class3_Sub8_Sub22 extends Class3_Sub8 {

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
	private int anInt7299 = 2048;

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
	private int anInt7305 = 3072;

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
	private int anInt7308 = 1024;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt7308 = arg1.method7951();
		} else if (arg0 == 1) {
			this.anInt7305 = arg1.method7951();
		} else if (arg0 == 2) {
			super.aBoolean737 = arg1.method7954() == 1;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		this.anInt7299 = this.anInt7305 - this.anInt7308;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(28) int[][] local28 = this.method8779(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static91.anInt1849; local54++) {
				local44[local54] = this.anInt7308 + (this.anInt7299 * local32[local54] >> 12);
				local48[local54] = this.anInt7308 + (this.anInt7299 * local36[local54] >> 12);
				local52[local54] = (local40[local54] * this.anInt7299 >> 12) + this.anInt7308;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(21) int[] local21 = this.method8776(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static91.anInt1849; local23++) {
				local11[local23] = this.anInt7308 + (local21[local23] * this.anInt7299 >> 12);
			}
		}
		return local11;
	}
}
