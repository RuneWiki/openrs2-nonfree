import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class3_Sub1_Sub30 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
	private int anInt8509 = 32768;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub30() {
		super(3, false);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		Static535.method7879();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(26) int[] local26 = this.method8362(arg0, 1);
			@Pc(32) int[] local32 = this.method8362(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static131.anInt2935; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt8509 >> 12;
				@Pc(61) int local61 = Static251.anIntArray323[local44] * local53 >> 12;
				@Pc(69) int local69 = Static413.anIntArray500[local44] * local53 >> 12;
				@Pc(77) int local77 = Static251.anInt5425 & (local61 >> 12) + local34;
				@Pc(86) int local86 = Static483.anInt9026 & arg0 + (local69 >> 12);
				@Pc(92) int[] local92 = this.method8362(local86, 0);
				local11[local34] = local92[local77];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(29) int[] local29 = this.method8362(arg0, 1);
			@Pc(35) int[] local35 = this.method8362(arg0, 2);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static131.anInt2935; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt8509 >> 12;
				@Pc(78) int local78 = local70 * Static251.anIntArray323[local61] >> 12;
				@Pc(86) int local86 = Static413.anIntArray500[local61] * local70 >> 12;
				@Pc(94) int local94 = (local78 >> 12) + local49 & Static251.anInt5425;
				@Pc(102) int local102 = Static483.anInt9026 & (local86 >> 12) + arg0;
				@Pc(108) int[][] local108 = this.method8360(0, local102);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt8509 = arg1.method6535() << 4;
		} else if (arg0 == 1) {
			super.aBoolean850 = arg1.method6538() == 1;
		}
	}
}
