import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class222 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	private int anInt5759 = 0;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
	private int anInt5765 = 0;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	private int anInt5762 = 0;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "Lclient!sq;")
	private Class65 aClass65_1 = null;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_31;

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "Lclient!pl;")
	private final Class198 aClass198_4;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "[Lclient!tr;")
	private final Class10[] aClass10Array1;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "Lclient!oc;")
	public final Class10_Sub5 aClass10_Sub5_1;

	static {
		new Class15("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class222(@OriginalArg(0) Class135_Sub2 arg0) {
		this.aClass135_Sub2_31 = arg0;
		this.aClass198_4 = new Class198(arg0);
		this.aClass10Array1 = new Class10[10];
		this.aClass10Array1[1] = new Class10_Sub7(arg0);
		this.aClass10Array1[2] = new Class10_Sub3(arg0, this.aClass198_4);
		this.aClass10Array1[4] = new Class10_Sub8(arg0, this.aClass198_4);
		this.aClass10Array1[5] = new Class10_Sub9(arg0, this.aClass198_4);
		this.aClass10Array1[6] = new Class10_Sub4(arg0);
		this.aClass10Array1[7] = new Class10_Sub2(arg0);
		this.aClass10Array1[3] = this.aClass10_Sub5_1 = new Class10_Sub5(arg0);
		this.aClass10Array1[8] = new Class10_Sub6(arg0, this.aClass198_4);
		this.aClass10Array1[9] = new Class10_Sub1(arg0, this.aClass198_4);
		if (!this.aClass10Array1[8].method5733()) {
			this.aClass10Array1[8] = this.aClass10Array1[4];
		}
		if (!this.aClass10Array1[9].method5733()) {
			this.aClass10Array1[9] = this.aClass10Array1[8];
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!sq;I)Z")
	public boolean method4610(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1) {
		if (this.anInt5765 == 0) {
			return false;
		}
		if (this.aClass65_1 != arg1) {
			this.aClass10Array1[Integer.MAX_VALUE & this.anInt5765].method5730(arg1, arg0);
			this.aClass65_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Z")
	public boolean method4611() {
		return this.aClass10Array1[3].method5733();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
	public void method4612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5765 != 0 & (arg1 != this.anInt5759 | this.anInt5762 != arg0)) {
			this.aClass10Array1[Integer.MAX_VALUE & this.anInt5765].method5734(arg0, arg1);
			this.anInt5762 = arg0;
			this.anInt5759 = arg1;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIIZ)V")
	public void method4613(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass135_Sub2_31.method5350();
		if (!local5 && (arg1 == 4 || arg1 == 8)) {
			arg1 = 2;
		}
		if (arg1 != 0 && arg2) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt5765 != arg1) {
			if (this.anInt5765 != 0) {
				this.aClass10Array1[Integer.MAX_VALUE & this.anInt5765].method5729();
			}
			if (arg1 != 0) {
				this.aClass10Array1[arg1 & Integer.MAX_VALUE].method5735(arg2);
				this.aClass10Array1[arg1 & Integer.MAX_VALUE].method5736(arg2);
			}
			this.anInt5765 = arg1;
			this.anInt5762 = Integer.MIN_VALUE;
			this.anInt5759 = Integer.MIN_VALUE;
			this.aClass65_1 = null;
		} else if (this.anInt5765 != 0) {
			this.aClass10Array1[Integer.MAX_VALUE & this.anInt5765].method5736(arg2);
		}
	}
}
