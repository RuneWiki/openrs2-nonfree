import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dv", name = "H", descriptor = "I")
	private int anInt2047 = 4096;

	@OriginalMember(owner = "client!dv", name = "G", descriptor = "I")
	private int anInt2046 = 0;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(21) int[] local21 = this.method7778(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static307.anInt4846; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt2046 <= local29 && local29 <= this.anInt2047 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt2046 = arg1.method7591();
		} else if (arg0 == 1) {
			this.anInt2047 = arg1.method7591();
		}
	}
}
