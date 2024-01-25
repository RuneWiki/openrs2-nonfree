import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class3_Sub1_Sub34 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
	private int anInt8173 = 4096;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(33) int[] local33 = this.method7778(0, arg0 - 1 & Static485.anInt8693);
			@Pc(39) int[] local39 = this.method7778(0, arg0);
			@Pc(49) int[] local49 = this.method7778(0, Static485.anInt8693 & arg0 + 1);
			for (@Pc(51) int local51 = 0; local51 < Static307.anInt4846; local51++) {
				@Pc(64) int local64 = (local49[local51] - local33[local51]) * this.anInt8173;
				@Pc(83) int local83 = this.anInt8173 * (local39[Static324.anInt6207 & local51 + 1] - local39[local51 - 1 & Static324.anInt6207]);
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local64 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(129) int local129 = local118 == 0 ? 0 : 16777216 / local118;
				local11[local51] = 4096 - local129;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt8173 = arg1.method7591();
		}
	}
}
