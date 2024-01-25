import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class2_Sub4_Sub7 extends Class2_Sub4 {

	@OriginalMember(owner = "client!fu", name = "H", descriptor = "I")
	private int anInt2482 = 3072;

	@OriginalMember(owner = "client!fu", name = "C", descriptor = "I")
	private int anInt2478 = 2048;

	@OriginalMember(owner = "client!fu", name = "I", descriptor = "I")
	private int anInt2483 = 1024;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt2483 = arg1.method4518();
		} else if (arg0 == 1) {
			this.anInt2482 = arg1.method4518();
		} else if (arg0 == 2) {
			super.aBoolean789 = arg1.method4464() == 1;
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(26) int[] local26 = this.method7568(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static143.anInt7434; local28++) {
				local11[local28] = this.anInt2483 + (local26[local28] * this.anInt2478 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(27) int[][] local27 = this.method7567(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static143.anInt7434; local53++) {
				local43[local53] = (local31[local53] * this.anInt2478 >> 12) + this.anInt2483;
				local47[local53] = (local35[local53] * this.anInt2478 >> 12) + this.anInt2483;
				local51[local53] = this.anInt2483 + (local39[local53] * this.anInt2478 >> 12);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		this.anInt2478 = this.anInt2482 - this.anInt2483;
	}
}
