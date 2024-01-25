import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "J", descriptor = "I")
	private int anInt39 = 2048;

	@OriginalMember(owner = "client!a", name = "N", descriptor = "I")
	private int anInt42 = 3072;

	@OriginalMember(owner = "client!a", name = "R", descriptor = "I")
	private int anInt46 = 1024;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt46 = arg1.method4485();
		} else if (arg0 == 1) {
			this.anInt42 = arg1.method4485();
		} else if (arg0 == 2) {
			super.aBoolean612 = arg1.method4463() == 1;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		this.anInt39 = this.anInt42 - this.anInt46;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(31) int[][] local31 = this.method5624(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			for (@Pc(57) int local57 = 0; local57 < Static434.anInt4326; local57++) {
				local47[local57] = this.anInt46 + (this.anInt39 * local35[local57] >> 12);
				local51[local57] = this.anInt46 + (local39[local57] * this.anInt39 >> 12);
				local55[local57] = (local43[local57] * this.anInt39 >> 12) + this.anInt46;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(27) int[] local27 = this.method5620(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static434.anInt4326; local29++) {
				local17[local29] = this.anInt46 + (this.anInt39 * local27[local29] >> 12);
			}
		}
		return local17;
	}
}
