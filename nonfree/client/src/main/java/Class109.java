import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class109 {

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
	private int anInt2954 = 0;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	private int anInt2955 = 0;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "Lclient!nk;")
	private Class65 aClass65_1 = null;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
	private int anInt2956 = 0;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_17;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "Lclient!ri;")
	private final Class212 aClass212_2;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "[Lclient!gr;")
	private final Class36[] aClass36Array1;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "Lclient!we;")
	public final Class36_Sub8 aClass36_Sub8_1;

	static {
		new Class256("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class109(@OriginalArg(0) Class26_Sub1 arg0) {
		this.aClass26_Sub1_17 = arg0;
		this.aClass212_2 = new Class212(arg0);
		this.aClass36Array1 = new Class36[10];
		this.aClass36Array1[1] = new Class36_Sub4(arg0);
		this.aClass36Array1[2] = new Class36_Sub9(arg0, this.aClass212_2);
		this.aClass36Array1[4] = new Class36_Sub7(arg0, this.aClass212_2);
		this.aClass36Array1[5] = new Class36_Sub3(arg0, this.aClass212_2);
		this.aClass36Array1[6] = new Class36_Sub6(arg0);
		this.aClass36Array1[7] = new Class36_Sub2(arg0);
		this.aClass36Array1[3] = this.aClass36_Sub8_1 = new Class36_Sub8(arg0);
		this.aClass36Array1[8] = new Class36_Sub5(arg0, this.aClass212_2);
		this.aClass36Array1[9] = new Class36_Sub1(arg0, this.aClass212_2);
		if (!this.aClass36Array1[8].method6010()) {
			this.aClass36Array1[8] = this.aClass36Array1[4];
		}
		if (!this.aClass36Array1[9].method6010()) {
			this.aClass36Array1[9] = this.aClass36Array1[8];
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)Z")
	public boolean method2346() {
		return this.aClass36Array1[3].method6010();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILclient!nk;B)Z")
	public boolean method2347(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1) {
		if (this.anInt2955 == 0) {
			return false;
		}
		if (this.aClass65_1 != arg1) {
			this.aClass36Array1[Integer.MAX_VALUE & this.anInt2955].method6008(arg1, arg0);
			this.aClass65_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
	public void method2348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 != this.anInt2956 | arg0 != this.anInt2954) & this.anInt2955 != 0) {
			this.aClass36Array1[Integer.MAX_VALUE & this.anInt2955].method6007(arg1, arg0);
			this.anInt2956 = arg1;
			this.anInt2954 = arg0;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZZI)V")
	public void method2349(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(9) boolean local9 = arg0 & this.aClass26_Sub1_17.method2224();
		if (!local9 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt2955) {
			if (this.anInt2955 != 0) {
				this.aClass36Array1[Integer.MAX_VALUE & this.anInt2955].method6012();
			}
			if (arg2 != 0) {
				this.aClass36Array1[arg2 & Integer.MAX_VALUE].method6011(arg1);
				this.aClass36Array1[Integer.MAX_VALUE & arg2].method6015(arg1);
			}
			this.aClass65_1 = null;
			this.anInt2955 = arg2;
			this.anInt2956 = Integer.MIN_VALUE;
			this.anInt2954 = Integer.MIN_VALUE;
		} else if (this.anInt2955 != 0) {
			this.aClass36Array1[this.anInt2955 & Integer.MAX_VALUE].method6015(arg1);
			return;
		}
	}
}
