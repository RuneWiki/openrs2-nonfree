import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!lp", name = "H", descriptor = "[Lclient!cs;")
	private Class46[] aClass46Array1;

	static {
		new Class142("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			this.method3487(super.aClass22_41.method314());
		}
		return local14;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass46Array1 = new Class46[arg0.method2915()];
			for (@Pc(15) int local15 = 0; local15 < this.aClass46Array1.length; local15++) {
				@Pc(21) int local21 = arg0.method2915();
				if (local21 == 0) {
					this.aClass46Array1[local15] = Static389.method5002(arg0);
				} else if (local21 == 1) {
					this.aClass46Array1[local15] = Static91.method1070(arg0);
				} else if (local21 == 2) {
					this.aClass46Array1[local15] = Static454.method5846(arg0);
				} else if (local21 == 3) {
					this.aClass46Array1[local15] = Static392.method5092(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean650 = arg0.method2915() == 1;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(22) int local22 = Static218.anInt3990;
			@Pc(24) int local24 = Static54.anInt778;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass99_41.method1770();
			this.method3487(local28);
			for (@Pc(41) int local41 = 0; local41 < Static54.anInt778; local41++) {
				@Pc(47) int[] local47 = local28[local41];
				@Pc(51) int[][] local51 = local33[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static218.anInt3990; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[[I)V")
	private void method3487(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static218.anInt3990;
		@Pc(9) int local9 = Static54.anInt778;
		Static359.method3992(arg0);
		Static214.method3093(Static464.anInt6761, Static147.anInt2302);
		if (this.aClass46Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass46Array1.length; local23++) {
			@Pc(30) Class46 local30 = this.aClass46Array1[local23];
			@Pc(33) int local33 = local30.anInt7292;
			@Pc(36) int local36 = local30.anInt7287;
			if (local33 >= 0) {
				if (local36 < 0) {
					local30.method5893(local9, local7);
				} else {
					local30.method5891(local9, local7);
				}
			} else if (local36 >= 0) {
				local30.method5892(local9, local7);
			}
		}
	}
}
