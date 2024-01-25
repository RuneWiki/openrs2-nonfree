import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class2_Sub4_Sub23 extends Class2_Sub4 {

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
	private int anInt6587 = 32768;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub23() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(27) int[] local27 = this.method7568(arg0, 1);
			@Pc(33) int[] local33 = this.method7568(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static143.anInt7434; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = this.anInt6587 * local33[local35] >> 12;
				@Pc(62) int local62 = local54 * Static135.anIntArray552[local45] >> 12;
				@Pc(70) int local70 = local54 * Static388.anIntArray410[local45] >> 12;
				@Pc(78) int local78 = Static464.anInt7427 & local35 + (local62 >> 12);
				@Pc(87) int local87 = arg0 + (local70 >> 12) & Static407.anInt6676;
				@Pc(93) int[] local93 = this.method7568(local87, 0);
				local17[local35] = local93[local78];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		Static59.method1017();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6587 = arg1.method4518() << 4;
		} else if (arg0 == 1) {
			super.aBoolean789 = arg1.method4464() == 1;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(29) int[] local29 = this.method7568(arg0, 1);
			@Pc(35) int[] local35 = this.method7568(arg0, 2);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static143.anInt7434; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt6587 >> 12;
				@Pc(78) int local78 = Static135.anIntArray552[local61] * local70 >> 12;
				@Pc(86) int local86 = Static388.anIntArray410[local61] * local70 >> 12;
				@Pc(94) int local94 = (local78 >> 12) + local49 & Static464.anInt7427;
				@Pc(102) int local102 = (local86 >> 12) + arg0 & Static407.anInt6676;
				@Pc(108) int[][] local108 = this.method7567(local102, 0);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local19;
	}
}
