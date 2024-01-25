import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class258 {

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!sp;")
	private Class1_Sub2 aClass1_Sub2_56;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "[Lclient!sp;")
	private final Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	private final int anInt6878;

	static {
		new Class7("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V")
	public Class258(@OriginalArg(0) int arg0) {
		this.aClass1_Sub2Array1 = new Class1_Sub2[arg0];
		this.anInt6878 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub2 local20 = this.aClass1_Sub2Array1[local10] = new Class1_Sub2();
			local20.aClass1_Sub2_57 = local20;
			local20.aClass1_Sub2_58 = local20;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IJ)Lclient!sp;")
	public Class1_Sub2 method5650(@OriginalArg(1) long arg0) {
		this.aLong207 = arg0;
		@Pc(20) Class1_Sub2 local20 = this.aClass1_Sub2Array1[(int) (arg0 & (long) (this.anInt6878 - 1))];
		for (this.aClass1_Sub2_56 = local20.aClass1_Sub2_57; this.aClass1_Sub2_56 != local20; this.aClass1_Sub2_56 = this.aClass1_Sub2_56.aClass1_Sub2_57) {
			if (this.aClass1_Sub2_56.aLong213 == arg0) {
				@Pc(39) Class1_Sub2 local39 = this.aClass1_Sub2_56;
				this.aClass1_Sub2_56 = this.aClass1_Sub2_56.aClass1_Sub2_57;
				return local39;
			}
		}
		this.aClass1_Sub2_56 = null;
		return null;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)Lclient!sp;")
	public Class1_Sub2 method5653() {
		if (this.aClass1_Sub2_56 == null) {
			return null;
		}
		@Pc(21) Class1_Sub2 local21 = this.aClass1_Sub2Array1[(int) (this.aLong207 & (long) (this.anInt6878 - 1))];
		while (local21 != this.aClass1_Sub2_56) {
			if (this.aLong207 == this.aClass1_Sub2_56.aLong213) {
				@Pc(40) Class1_Sub2 local40 = this.aClass1_Sub2_56;
				this.aClass1_Sub2_56 = this.aClass1_Sub2_56.aClass1_Sub2_57;
				return local40;
			}
			this.aClass1_Sub2_56 = this.aClass1_Sub2_56.aClass1_Sub2_57;
		}
		this.aClass1_Sub2_56 = null;
		return null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!sp;JI)V")
	public void method5654(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass1_Sub2_58 != null) {
			arg0.method5813();
		}
		@Pc(21) Class1_Sub2 local21 = this.aClass1_Sub2Array1[(int) (arg1 & (long) (this.anInt6878 - 1))];
		arg0.aClass1_Sub2_58 = local21.aClass1_Sub2_58;
		arg0.aClass1_Sub2_57 = local21;
		arg0.aClass1_Sub2_58.aClass1_Sub2_57 = arg0;
		arg0.aClass1_Sub2_57.aClass1_Sub2_58 = arg0;
		arg0.aLong213 = arg1;
	}
}
