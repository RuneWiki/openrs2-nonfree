import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class34 {

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	private int anInt901 = 0;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!in;")
	private Class31 aClass31_1 = null;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
	private int anInt906 = 0;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
	private int anInt903 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_11;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Lclient!mm;")
	private final Class162 aClass162_2;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "[Lclient!hh;")
	private final Class16[] aClass16Array1;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "Lclient!bf;")
	public final Class16_Sub2 aClass16_Sub2_1;

	static {
		new Class198("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
		new Class198("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class34(@OriginalArg(0) Class200_Sub2 arg0) {
		this.aClass200_Sub2_11 = arg0;
		this.aClass162_2 = new Class162(arg0);
		this.aClass16Array1 = new Class16[10];
		this.aClass16Array1[1] = new Class16_Sub7(arg0);
		this.aClass16Array1[2] = new Class16_Sub8(arg0, this.aClass162_2);
		this.aClass16Array1[4] = new Class16_Sub5(arg0, this.aClass162_2);
		this.aClass16Array1[5] = new Class16_Sub9(arg0, this.aClass162_2);
		this.aClass16Array1[6] = new Class16_Sub4(arg0);
		this.aClass16Array1[7] = new Class16_Sub3(arg0);
		this.aClass16Array1[3] = this.aClass16_Sub2_1 = new Class16_Sub2(arg0);
		this.aClass16Array1[8] = new Class16_Sub1(arg0, this.aClass162_2);
		this.aClass16Array1[9] = new Class16_Sub6(arg0, this.aClass162_2);
		if (!this.aClass16Array1[8].method5154()) {
			this.aClass16Array1[8] = this.aClass16Array1[4];
		}
		if (!this.aClass16Array1[9].method5154()) {
			this.aClass16Array1[9] = this.aClass16Array1[8];
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Z")
	public boolean method796() {
		return this.aClass16Array1[3].method5154();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZIIII)V")
	public void method797(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg0 & this.aClass200_Sub2_11.method5812();
		if (!local5 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg3 = arg4;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt903) {
			if (this.anInt903 != 0) {
				this.aClass16Array1[this.anInt903 & Integer.MAX_VALUE].method5148();
			}
			if (arg2 != 0) {
				this.aClass16Array1[arg2 & Integer.MAX_VALUE].method5149(arg1);
				this.aClass16Array1[Integer.MAX_VALUE & arg2].method5157(arg1);
				this.aClass16Array1[Integer.MAX_VALUE & arg2].method5155(arg3, arg4);
			}
			this.anInt901 = arg3;
			this.anInt906 = arg4;
			this.anInt903 = arg2;
			this.aClass31_1 = null;
		} else if (this.anInt903 != 0) {
			this.aClass16Array1[this.anInt903 & Integer.MAX_VALUE].method5157(arg1);
			if (this.anInt906 != arg4 || arg3 != this.anInt901) {
				this.aClass16Array1[Integer.MAX_VALUE & this.anInt903].method5155(arg3, arg4);
				this.anInt906 = arg4;
				this.anInt901 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILclient!in;)Z")
	public boolean method799(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
		if (this.anInt903 == 0) {
			return false;
		}
		if (arg1 != this.aClass31_1) {
			this.aClass16Array1[this.anInt903 & Integer.MAX_VALUE].method5150(arg0, arg1);
			this.aClass31_1 = arg1;
		}
		return true;
	}
}
