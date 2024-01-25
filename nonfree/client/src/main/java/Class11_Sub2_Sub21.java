import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class11_Sub2_Sub21 extends Class11_Sub2 {

	@OriginalMember(owner = "client!le", name = "F", descriptor = "I")
	private int anInt3478 = 4;

	@OriginalMember(owner = "client!le", name = "L", descriptor = "I")
	private int anInt3482 = 4;

	static {
		new Class117("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(25) int local25 = Static339.anInt6549 / this.anInt3478;
			@Pc(30) int local30 = Static113.anInt2160 / this.anInt3482;
			@Pc(38) int[] local38;
			@Pc(44) int local44;
			if (local30 <= 0) {
				local38 = this.method5710(0, 0);
			} else {
				local44 = arg0 % local30;
				local38 = this.method5710(0, Static113.anInt2160 * local44 / local30);
			}
			for (local44 = 0; local44 < Static339.anInt6549; local44++) {
				if (local25 <= 0) {
					local11[local44] = local38[0];
				} else {
					@Pc(72) int local72 = local44 % local25;
					local11[local44] = local38[local72 * Static339.anInt6549 / local25];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(25) int local25 = Static339.anInt6549 / this.anInt3478;
			@Pc(30) int local30 = Static113.anInt2160 / this.anInt3482;
			@Pc(41) int[][] local41;
			if (local30 <= 0) {
				local41 = this.method5715(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local30;
				local41 = this.method5715(Static113.anInt2160 * local47 / local30, 0);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local16[0];
			@Pc(77) int[] local77 = local16[1];
			@Pc(81) int[] local81 = local16[2];
			for (@Pc(83) int local83 = 0; local83 < Static339.anInt6549; local83++) {
				@Pc(100) int local100;
				if (local25 > 0) {
					@Pc(94) int local94 = local83 % local25;
					local100 = Static339.anInt6549 * local94 / local25;
				} else {
					local100 = 0;
				}
				local73[local83] = local61[local100];
				local77[local83] = local65[local100];
				local81[local83] = local69[local100];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3478 = arg0.method5185();
		} else if (arg1 == 1) {
			this.anInt3482 = arg0.method5185();
		}
	}
}
