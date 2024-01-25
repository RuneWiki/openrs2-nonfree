import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class130 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	private int anInt3253 = -1;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
	private int anInt3258 = 0;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "Lclient!ft;")
	private Class88 aClass88_29 = new Class88();

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "Z")
	public boolean aBoolean230 = false;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
	private final int anInt3259;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
	private final int anInt3254;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "[Lclient!um;")
	private Class6_Sub41[] aClass6_Sub41Array1;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	static {
		new Class231("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(III)V")
	public Class130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3259 = arg1;
		this.anInt3254 = arg0;
		this.aClass6_Sub41Array1 = new Class6_Sub41[this.anInt3259];
		this.anIntArrayArrayArray4 = new int[this.anInt3254][3][arg2];
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[[I")
	public int[][] method2911(@OriginalArg(0) int arg0) {
		if (this.anInt3259 == this.anInt3254) {
			this.aBoolean230 = this.aClass6_Sub41Array1[arg0] == null;
			this.aClass6_Sub41Array1[arg0] = Static160.aClass6_Sub41_1;
			return this.anIntArrayArrayArray4[arg0];
		} else if (this.anInt3254 == 1) {
			this.aBoolean230 = this.anInt3253 != arg0;
			this.anInt3253 = arg0;
			return this.anIntArrayArrayArray4[0];
		} else {
			@Pc(44) Class6_Sub41 local44 = this.aClass6_Sub41Array1[arg0];
			if (local44 == null) {
				this.aBoolean230 = true;
				if (this.anInt3254 <= this.anInt3258) {
					@Pc(69) Class6_Sub41 local69 = (Class6_Sub41) this.aClass88_29.method1883();
					local44 = new Class6_Sub41(arg0, local69.anInt6820);
					this.aClass6_Sub41Array1[local69.anInt6819] = null;
					local69.method5977();
				} else {
					local44 = new Class6_Sub41(arg0, this.anInt3258);
					this.anInt3258++;
				}
				this.aClass6_Sub41Array1[arg0] = local44;
			} else {
				this.aBoolean230 = false;
			}
			this.aClass88_29.method1885(local44);
			return this.anIntArrayArrayArray4[local44.anInt6820];
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method2912() {
		if (this.anInt3254 != this.anInt3259) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt3254; local17++) {
			this.aClass6_Sub41Array1[local17] = Static160.aClass6_Sub41_1;
		}
		return this.anIntArrayArrayArray4;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
	public void method2913() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3254; local3++) {
			this.anIntArrayArrayArray4[local3][0] = null;
			this.anIntArrayArrayArray4[local3][1] = null;
			this.anIntArrayArrayArray4[local3][2] = null;
			this.anIntArrayArrayArray4[local3] = null;
		}
		this.anIntArrayArrayArray4 = null;
		this.aClass6_Sub41Array1 = null;
		this.aClass88_29.method1887();
		this.aClass88_29 = null;
	}
}
