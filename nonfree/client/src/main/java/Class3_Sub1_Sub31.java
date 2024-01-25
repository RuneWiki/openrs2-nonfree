import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class3_Sub1_Sub31 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rda", name = "I", descriptor = "I")
	private int anInt8536 = 1024;

	@OriginalMember(owner = "client!rda", name = "N", descriptor = "I")
	private int anInt8541 = 2048;

	@OriginalMember(owner = "client!rda", name = "Q", descriptor = "I")
	private int anInt8544 = 3072;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(21) int[] local21 = this.method8362(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static131.anInt2935; local23++) {
				local11[local23] = (local21[local23] * this.anInt8541 >> 12) + this.anInt8536;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(29) int[][] local29 = this.method8360(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static131.anInt2935; local55++) {
				local45[local55] = (this.anInt8541 * local33[local55] >> 12) + this.anInt8536;
				local49[local55] = this.anInt8536 + (this.anInt8541 * local37[local55] >> 12);
				local53[local55] = this.anInt8536 + (local41[local55] * this.anInt8541 >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		this.anInt8541 = this.anInt8544 - this.anInt8536;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt8536 = arg1.method6535();
		} else if (arg0 == 1) {
			this.anInt8544 = arg1.method6535();
		} else if (arg0 == 2) {
			super.aBoolean850 = arg1.method6538() == 1;
		}
	}
}
