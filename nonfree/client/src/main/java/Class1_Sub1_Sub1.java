import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "F", descriptor = "I")
	private int anInt41 = 1024;

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
	private int anInt49 = 3072;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "I")
	private int anInt45 = 2048;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(28) int[] local28 = this.method4464(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static6.anInt4960; local30++) {
				local13[local30] = this.anInt41 + (this.anInt45 * local28[local30] >> 12);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(27) int[][] local27 = this.method4456(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[2];
			@Pc(39) int[] local39 = local27[1];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static6.anInt4960; local53++) {
				local43[local53] = (local31[local53] * this.anInt45 >> 12) + this.anInt41;
				local47[local53] = (this.anInt45 * local39[local53] >> 12) + this.anInt41;
				local51[local53] = this.anInt41 + (local35[local53] * this.anInt45 >> 12);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		this.anInt45 = this.anInt49 - this.anInt41;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt41 = arg0.method1879();
		} else if (arg1 == 1) {
			this.anInt49 = arg0.method1879();
		} else if (arg1 == 2) {
			this.aBoolean505 = arg0.method1853() == 1;
		}
	}
}
