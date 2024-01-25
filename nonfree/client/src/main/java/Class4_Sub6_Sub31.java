import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class4_Sub6_Sub31 extends Class4_Sub6 {

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
	private int anInt5971 = 1024;

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
	private int anInt5974 = 3072;

	@OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
	private int anInt5975 = 2048;

	static {
		new Class83("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt5971 = arg1.method2536();
		} else if (arg0 == 1) {
			this.anInt5974 = arg1.method2536();
		} else if (arg0 == 2) {
			super.aBoolean665 = arg1.method2490() == 1;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(29) int[][] local29 = this.method5516(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static80.anInt1616; local55++) {
				local45[local55] = this.anInt5971 + (local33[local55] * this.anInt5975 >> 12);
				local49[local55] = (this.anInt5975 * local37[local55] >> 12) + this.anInt5971;
				local53[local55] = this.anInt5971 + (this.anInt5975 * local41[local55] >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(29) int[] local29 = this.method5508(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static80.anInt1616; local31++) {
				local11[local31] = (this.anInt5975 * local29[local31] >> 12) + this.anInt5971;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
		this.anInt5975 = this.anInt5974 - this.anInt5971;
	}
}
