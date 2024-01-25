import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class3_Sub4_Sub22 extends Class3_Sub4 {

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
	private int anInt3980;

	@OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
	private int anInt3985;

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
	private int anInt3988;

	@OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
	private int anInt3991;

	@OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
	private int anInt3992;

	@OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
	private int anInt3994;

	@OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
	private int anInt3989 = 0;

	@OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
	private int anInt3982 = 0;

	@OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
	private int anInt3995 = 0;

	static {
		new Class174("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(29) int[][] local29 = this.method6138(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static148.anInt2687; local55++) {
				this.method3408(local41[local55], local37[local55], local33[local55]);
				this.anInt3994 += this.anInt3995;
				this.anInt3985 += this.anInt3989;
				this.anInt3988 += this.anInt3982;
				while (this.anInt3994 < 0) {
					this.anInt3994 += 4096;
				}
				while (this.anInt3994 > 4096) {
					this.anInt3994 -= 4096;
				}
				if (this.anInt3985 < 0) {
					this.anInt3985 = 0;
				}
				if (this.anInt3985 > 4096) {
					this.anInt3985 = 4096;
				}
				if (this.anInt3988 < 0) {
					this.anInt3988 = 0;
				}
				if (this.anInt3988 > 4096) {
					this.anInt3988 = 4096;
				}
				this.method3406(this.anInt3994, this.anInt3988, this.anInt3985);
				local45[local55] = this.anInt3980;
				local49[local55] = this.anInt3991;
				local53[local55] = this.anInt3992;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BIII)V")
	private void method3406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) int local32 = arg1 > 2048 ? arg1 + arg2 - (arg2 * arg1 >> 12) : (4096 - -arg2) * arg1 >> 12;
		if (local32 <= 0) {
			this.anInt3980 = this.anInt3991 = this.anInt3992 = arg1;
			return;
		}
		@Pc(48) int local48 = arg0 * 6;
		@Pc(55) int local55 = arg1 + arg1 - local32;
		@Pc(63) int local63 = (local32 - local55 << 12) / local32;
		@Pc(67) int local67 = local48 >> 12;
		@Pc(74) int local74 = local48 - (local67 << 12);
		@Pc(82) int local82 = local32 * local63 >> 12;
		@Pc(88) int local88 = local74 * local82 >> 12;
		@Pc(92) int local92 = local88 + local55;
		@Pc(96) int local96 = local32 - local88;
		if (local67 == 0) {
			this.anInt3980 = local32;
			this.anInt3991 = local92;
			this.anInt3992 = local55;
		} else if (local67 == 1) {
			this.anInt3980 = local96;
			this.anInt3991 = local32;
			this.anInt3992 = local55;
		} else if (local67 == 2) {
			this.anInt3991 = local32;
			this.anInt3992 = local92;
			this.anInt3980 = local55;
		} else if (local67 == 3) {
			this.anInt3992 = local32;
			this.anInt3991 = local96;
			this.anInt3980 = local55;
		} else if (local67 == 4) {
			this.anInt3991 = local55;
			this.anInt3980 = local92;
			this.anInt3992 = local32;
		} else if (local67 == 5) {
			this.anInt3980 = local32;
			this.anInt3991 = local55;
			this.anInt3992 = local96;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V")
	private void method3408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 > arg1 ? arg2 : arg1;
		@Pc(27) int local27 = local16 >= arg0 ? local16 : arg0;
		@Pc(34) int local34 = arg1 > arg2 ? arg2 : arg1;
		@Pc(41) int local41 = local34 > arg0 ? arg0 : local34;
		this.anInt3988 = (local27 + local41) / 2;
		@Pc(53) int local53 = local27 - local41;
		if (local53 <= 0) {
			this.anInt3994 = 0;
		} else {
			@Pc(69) int local69 = (local27 - arg2 << 12) / local53;
			@Pc(78) int local78 = (local27 - arg1 << 12) / local53;
			@Pc(87) int local87 = (local27 - arg0 << 12) / local53;
			if (local27 == arg2) {
				this.anInt3994 = local41 == arg1 ? local87 + 20480 : -local78 + 4096;
			} else if (arg1 == local27) {
				this.anInt3994 = arg0 == local41 ? local69 + 4096 : -local87 + 12288;
			} else {
				this.anInt3994 = arg2 == local41 ? local78 + 12288 : 20480 - local69;
			}
			this.anInt3994 /= 6;
		}
		if (this.anInt3988 > 0 && this.anInt3988 < 4096) {
			this.anInt3985 = (local53 << 12) / (this.anInt3988 <= 2048 ? this.anInt3988 * 2 : 8192 - (this.anInt3988 * 2));
		} else {
			this.anInt3985 = 0;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3995 = arg0.method4065();
		} else if (arg1 == 1) {
			this.anInt3989 = (arg0.method4097() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3982 = (arg0.method4097() << 12) / 100;
		}
	}
}
