import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ju", name = "L", descriptor = "I")
	private int anInt4560 = 2048;

	@OriginalMember(owner = "client!ju", name = "U", descriptor = "I")
	private int anInt4566 = 1024;

	@OriginalMember(owner = "client!ju", name = "V", descriptor = "I")
	private int anInt4567 = 3072;

	static {
		new Class45("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(31) int[][] local31 = this.method8199(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			for (@Pc(57) int local57 = 0; local57 < Static254.anInt4973; local57++) {
				local47[local57] = (local35[local57] * this.anInt4560 >> 12) + this.anInt4566;
				local51[local57] = (this.anInt4560 * local39[local57] >> 12) + this.anInt4566;
				local55[local57] = (this.anInt4560 * local43[local57] >> 12) + this.anInt4566;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(26) int[] local26 = this.method8201(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static254.anInt4973; local28++) {
				local16[local28] = this.anInt4566 + (this.anInt4560 * local26[local28] >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		this.anInt4560 = this.anInt4567 - this.anInt4566;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt4566 = arg1.method4494();
		} else if (arg0 == 1) {
			this.anInt4567 = arg1.method4494();
		} else if (arg0 == 2) {
			super.aBoolean708 = arg1.method4487() == 1;
		}
	}
}
