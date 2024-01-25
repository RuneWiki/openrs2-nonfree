import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class264 {

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
	private int anInt7230 = 0;

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
	private int anInt7233 = 0;

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
	private int anInt7235 = 0;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "Lclient!ce;")
	private Class40 aClass40_1 = null;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_43;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "Lclient!mt;")
	private final Class171 aClass171_6;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "[Lclient!tb;")
	private final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "Lclient!wk;")
	public final Class5_Sub9 aClass5_Sub9_1;

	static {
		new Class231("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
		new Class231("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class264(@OriginalArg(0) Class28_Sub1 arg0) {
		this.aClass28_Sub1_43 = arg0;
		this.aClass171_6 = new Class171(arg0);
		this.aClass5Array1 = new Class5[10];
		this.aClass5Array1[1] = new Class5_Sub3(arg0);
		this.aClass5Array1[2] = new Class5_Sub6(arg0, this.aClass171_6);
		this.aClass5Array1[4] = new Class5_Sub5(arg0, this.aClass171_6);
		this.aClass5Array1[5] = new Class5_Sub4(arg0, this.aClass171_6);
		this.aClass5Array1[6] = new Class5_Sub1(arg0);
		this.aClass5Array1[7] = new Class5_Sub8(arg0);
		this.aClass5Array1[3] = this.aClass5_Sub9_1 = new Class5_Sub9(arg0);
		this.aClass5Array1[8] = new Class5_Sub2(arg0, this.aClass171_6);
		this.aClass5Array1[9] = new Class5_Sub7(arg0, this.aClass171_6);
		if (!this.aClass5Array1[8].method5928()) {
			this.aClass5Array1[8] = this.aClass5Array1[4];
		}
		if (!this.aClass5Array1[9].method5928()) {
			this.aClass5Array1[9] = this.aClass5Array1[8];
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)V")
	public void method5948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7235 != 0 & (arg1 != this.anInt7230 | this.anInt7233 != arg0)) {
			this.aClass5Array1[this.anInt7235 & Integer.MAX_VALUE].method5923(arg1, arg0);
			this.anInt7233 = arg0;
			this.anInt7230 = arg1;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZZZI)V")
	public void method5949(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(9) boolean local9 = arg0 & this.aClass28_Sub1_43.method3530();
		if (!local9 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt7235 != arg2) {
			if (this.anInt7235 != 0) {
				this.aClass5Array1[Integer.MAX_VALUE & this.anInt7235].method5922();
			}
			if (arg2 != 0) {
				this.aClass5Array1[arg2 & Integer.MAX_VALUE].method5925(arg1);
				this.aClass5Array1[Integer.MAX_VALUE & arg2].method5926(arg1);
			}
			this.aClass40_1 = null;
			this.anInt7235 = arg2;
			this.anInt7233 = Integer.MIN_VALUE;
			this.anInt7230 = Integer.MIN_VALUE;
		} else if (this.anInt7235 != 0) {
			this.aClass5Array1[this.anInt7235 & Integer.MAX_VALUE].method5926(arg1);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BI)Z")
	public boolean method5951() {
		return this.aClass5Array1[3].method5928();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILclient!ce;)Z")
	public boolean method5954(@OriginalArg(0) int arg0, @OriginalArg(2) Class40 arg1) {
		if (this.anInt7235 == 0) {
			return false;
		}
		if (arg1 != this.aClass40_1) {
			this.aClass5Array1[Integer.MAX_VALUE & this.anInt7235].method5927(arg1, arg0);
			this.aClass40_1 = arg1;
		}
		return true;
	}
}
