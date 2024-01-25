import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "Z")
	private boolean aBoolean367 = true;

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
	private int anInt4249 = 4096;

	static {
		new Class189("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(32) int[] local32 = this.method5894(0, arg0 - 1 & Static350.anInt3654);
			@Pc(40) int[] local40 = this.method5894(0, arg0);
			@Pc(52) int[] local52 = this.method5894(0, arg0 + 1 & Static350.anInt3654);
			@Pc(56) int[] local56 = local11[0];
			@Pc(60) int[] local60 = local11[1];
			@Pc(64) int[] local64 = local11[2];
			for (@Pc(66) int local66 = 0; local66 < Static406.anInt6694; local66++) {
				@Pc(80) int local80 = this.anInt4249 * (local52[local66] - local32[local66]);
				@Pc(100) int local100 = (local40[Static5.anInt72 & local66 + 1] - local40[local66 - 1 & Static5.anInt72]) * this.anInt4249;
				@Pc(104) int local104 = local100 >> 12;
				@Pc(108) int local108 = local80 >> 12;
				@Pc(114) int local114 = local104 * local104 >> 12;
				@Pc(120) int local120 = local108 * local108 >> 12;
				@Pc(134) int local134 = (int) (Math.sqrt((double) ((float) (local120 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(141) int local141;
				@Pc(145) int local145;
				@Pc(143) int local143;
				if (local134 == 0) {
					local141 = 0;
					local143 = 0;
					local145 = 0;
				} else {
					local143 = 16777216 / local134;
					local145 = local80 / local134;
					local141 = local100 / local134;
				}
				if (this.aBoolean367) {
					local145 = (local145 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
				}
				local56[local66] = local141;
				local60[local66] = local145;
				local64[local66] = local143;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4249 = arg0.method2588();
		} else if (arg1 == 1) {
			this.aBoolean367 = arg0.method2582() == 1;
		}
	}
}
