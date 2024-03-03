import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class11_Sub5_Sub3 extends Class11_Sub5 {

	@OriginalMember(owner = "client!om", name = "A", descriptor = "I")
	public static int anInt4707;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "I")
	public static final int anInt4711 = anInt4707;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "[I")
	public static final int[] anIntArray321 = new int[50];

	@OriginalMember(owner = "client!om", name = "nb", descriptor = "I")
	public static final int anInt4734 = anInt4707 >> 2;

	@OriginalMember(owner = "client!om", name = "fb", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_102 = new Class79("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!om", name = "w", descriptor = "Lclient!oh;")
	private Class12_Sub5 aClass12_Sub5_4;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!om", name = "H", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!om", name = "L", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!om", name = "M", descriptor = "I")
	private int anInt4715;

	@OriginalMember(owner = "client!om", name = "O", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!om", name = "R", descriptor = "I")
	private int anInt4718;

	@OriginalMember(owner = "client!om", name = "T", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!om", name = "Y", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!om", name = "db", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!om", name = "D", descriptor = "I")
	private int anInt4709 = -1;

	@OriginalMember(owner = "client!om", name = "ab", descriptor = "Z")
	private boolean aBoolean326 = false;

	@OriginalMember(owner = "client!om", name = "hb", descriptor = "I")
	private int anInt4729 = -32768;

	@OriginalMember(owner = "client!om", name = "S", descriptor = "I")
	private int anInt4719 = 0;

	@OriginalMember(owner = "client!om", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!om", name = "x", descriptor = "I")
	public final int anInt4705;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "I")
	public final int anInt4713;

	@OriginalMember(owner = "client!om", name = "kb", descriptor = "I")
	private final int anInt4732;

	@OriginalMember(owner = "client!om", name = "X", descriptor = "I")
	private final int anInt4723;

	@OriginalMember(owner = "client!om", name = "eb", descriptor = "I")
	public final int anInt4727;

	@OriginalMember(owner = "client!om", name = "cb", descriptor = "I")
	private final int anInt4726;

	@OriginalMember(owner = "client!om", name = "P", descriptor = "I")
	public final int anInt4716;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "Lclient!nb;")
	private final Class157 aClass157_1;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 312)
	public Class11_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt4705 = arg9;
		this.anInt4713 = arg6;
		this.anInt4732 = arg7;
		this.anInt4723 = arg0;
		this.anInt4727 = arg10;
		this.anInt4726 = arg8;
		this.anInt4716 = arg5;
		this.aBoolean326 = false;
		@Pc(65) int local65 = Static299.aClass211_2.method5408(this.anInt4723).anInt2445;
		if (local65 == -1) {
			this.aClass157_1 = null;
		} else {
			this.aClass157_1 = Static37.aClass85_1.method2373(local65);
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 3)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		@Pc(21) Class31 local21 = this.method4397(1024, arg0);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class14 local28 = arg0.method2810();
		local28.method3934(this.anInt4718);
		local28.method3927(this.anInt4715);
		local28.method3937((int) this.aDouble3, (int) this.aDouble9, (int) this.aDouble8);
		if (this.aClass12_Sub5_4 == null) {
			local21.method3836(local28, null, 0);
		} else {
			@Pc(54) Class224 local54 = this.aClass12_Sub5_4.method4359();
			arg0.method2826(local21, local54, local28, null);
		}
		this.anInt4729 = local21.method3803();
		this.method4394(arg0, local21);
		return null;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V", line = 35)
	public void method4392() {
		if (this.aClass12_Sub5_4 != null) {
			this.aClass12_Sub5_4.method4355();
		}
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V", line = 51)
	@Override
	public void method6070() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V", line = 72)
	public void method4393(@OriginalArg(0) int arg0) {
		this.aDouble3 += this.aDouble4 * (double) arg0;
		this.aDouble8 += (double) arg0 * this.aDouble6;
		this.aBoolean326 = true;
		if (this.anInt4732 == -1) {
			this.aDouble9 += this.aDouble7 * (double) arg0;
		} else {
			this.aDouble9 += (double) arg0 * this.aDouble7 + this.aDouble5 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble5 * (double) arg0;
		}
		this.anInt4715 = (int) (Math.atan2(this.aDouble4, this.aDouble6) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4718 = (int) (Math.atan2(this.aDouble7, this.aDouble2) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass157_1 == null) {
			return;
		}
		this.lb += arg0;
		while (true) {
			do {
				do {
					if (this.lb <= this.aClass157_1.anIntArray261[this.anInt4719]) {
						return;
					}
					this.lb -= this.aClass157_1.anIntArray261[this.anInt4719];
					this.anInt4719++;
					if (this.anInt4719 >= this.aClass157_1.anIntArray262.length) {
						this.anInt4719 -= this.aClass157_1.anInt4027;
						if (this.anInt4719 < 0 || this.aClass157_1.anIntArray262.length <= this.anInt4719) {
							this.anInt4719 = 0;
						}
					}
					this.anInt4709 = this.anInt4719 + 1;
				} while (this.aClass157_1.anIntArray262.length > this.anInt4709);
				this.anInt4709 -= this.aClass157_1.anInt4027;
			} while (this.anInt4709 >= 0 && this.anInt4709 < this.aClass157_1.anIntArray262.length);
			this.anInt4709 = -1;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLclient!wm;Lclient!gn;)V", line = 126)
	private void method4394(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Class31 arg1) {
		@Pc(12) Class114[] local12 = arg1.method3809();
		@Pc(15) Class163[] local15 = arg1.method3841();
		if ((this.aClass12_Sub5_4 == null || this.aClass12_Sub5_4.aBoolean322) && (local12 != null || local15 != null)) {
			this.aClass12_Sub5_4 = new Class12_Sub5(Class83.anInt2345);
		}
		if (this.aClass12_Sub5_4 != null) {
			this.aClass12_Sub5_4.method4358(arg0, (long) Class83.anInt2345, local12, local15);
			this.aClass12_Sub5_4.method4362(super.aByte78, super.aShort103, super.aShort104, super.aShort101, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 156)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 171)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!om", name = "h", descriptor = "(I)I", line = 197)
	@Override
	public int method6081() {
		return this.anInt4729;
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(I)Z", line = 337)
	@Override
	public boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBLclient!wm;)Lclient!gn;", line = 351)
	private Class31 method4397(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(17) Class91 local17 = Static299.aClass211_2.method5408(this.anInt4723);
		return local17.method2435(this.anInt4709, this.lb, arg1, arg0, Static37.aClass85_1, this.anInt4719);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!wm;B)V", line = 366)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
		@Pc(9) Class31 local9 = this.method4397(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class14 local15 = arg0.method2810();
		local15.method3934(this.anInt4718);
		local15.method3927(this.anInt4715);
		local15.method3937((int) this.aDouble3, (int) this.aDouble9, (int) this.aDouble8);
		this.anInt4729 = local9.method3803();
		this.method4394(arg0, local9);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 395)
	@Override
	public void method6079() {
		super.aShort103 = super.aShort104 = (short) (this.aDouble3 / 128.0D);
		super.aShort101 = super.aShort102 = (short) (this.aDouble8 / 128.0D);
	}

	@OriginalMember(owner = "client!om", name = "finalize", descriptor = "()V", line = 407)
	@Override
	public void finalize() {
		if (this.aClass12_Sub5_4 != null) {
			this.aClass12_Sub5_4.method4355();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIZI)V", line = 422)
	public void method4398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean326) {
			local9 = arg1 - super.anInt6768;
			@Pc(16) double local16 = (double) (arg3 - super.anInt6770);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble8 = (double) super.anInt6770 + local16 * (double) this.anInt4726 / local25;
			this.aDouble3 = (double) super.anInt6768 + (double) this.anInt4726 * local9 / local25;
			this.aDouble9 = super.anInt6769;
		}
		local9 = this.anInt4713 + 1 - arg2;
		this.aDouble4 = ((double) arg1 - this.aDouble3) / local9;
		this.aDouble6 = ((double) arg3 - this.aDouble8) / local9;
		this.aDouble2 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble6 * this.aDouble6);
		if (this.anInt4732 == -1) {
			this.aDouble7 = ((double) arg0 - this.aDouble9) / local9;
		} else {
			if (!this.aBoolean326) {
				this.aDouble7 = -this.aDouble2 * Math.tan((double) this.anInt4732 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg0 - this.aDouble7 * local9 - this.aDouble9) * 2.0D / (local9 * local9);
		}
	}
}
