import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class2_Sub4_Sub8 extends Class2_Sub4 {

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean789 = arg1.method4464() == 1;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(31) int[][] local31 = this.method7567(arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			for (@Pc(57) int local57 = 0; local57 < Static143.anInt7434; local57++) {
				local47[local57] = 4096 - local35[local57];
				local51[local57] = 4096 - local39[local57];
				local55[local57] = 4096 - local43[local57];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(26) int[] local26 = this.method7568(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static143.anInt7434; local28++) {
				local11[local28] = 4096 - local26[local28];
			}
		}
		return local11;
	}
}
