import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class34_Sub1_Sub1_Sub5 extends Class34_Sub1_Sub1 {

	@OriginalMember(owner = "client!sn", name = "bb", descriptor = "Lclient!ls;")
	private Class34_Sub7 aClass34_Sub7_7;

	@OriginalMember(owner = "client!sn", name = "N", descriptor = "I")
	private int anInt9038 = 0;

	@OriginalMember(owner = "client!sn", name = "db", descriptor = "I")
	private int anInt9052 = 0;

	@OriginalMember(owner = "client!sn", name = "R", descriptor = "I")
	private int anInt9042 = 0;

	@OriginalMember(owner = "client!sn", name = "kb", descriptor = "Z")
	public boolean aBoolean633 = false;

	@OriginalMember(owner = "client!sn", name = "lb", descriptor = "Z")
	private boolean lb = true;

	@OriginalMember(owner = "client!sn", name = "X", descriptor = "I")
	private final int anInt9047 = -1;

	@OriginalMember(owner = "client!sn", name = "Z", descriptor = "I")
	private int anInt9049 = 0;

	@OriginalMember(owner = "client!sn", name = "rb", descriptor = "I")
	private int anInt9062 = 0;

	@OriginalMember(owner = "client!sn", name = "tb", descriptor = "I")
	private final int anInt9063;

	@OriginalMember(owner = "client!sn", name = "Q", descriptor = "I")
	public final int anInt9041;

	@OriginalMember(owner = "client!sn", name = "S", descriptor = "Lclient!mu;")
	private Class239 aClass239_3;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class34_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt9063 = arg0;
		this.anInt9041 = arg1 + arg2;
		this.anInt9042 = arg12;
		@Pc(53) Class106 local53 = Static366.aClass182_2.method4107(this.anInt9063);
		@Pc(56) int local56 = local53.anInt2680;
		if (local56 == -1) {
			this.aBoolean633 = true;
		} else {
			this.aClass239_3 = Static13.aClass213_1.method5008(local56);
			this.aBoolean633 = false;
		}
		if (this.anInt9041 == arg2) {
			Static305.method4420(this, this.aClass239_3, this.anInt9038);
		}
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		@Pc(23) Class149 local23 = this.method7381((this.anInt9042 == 0 ? 0 : 5) | 0x800, arg0, this.anInt9063);
		if (local23 == null) {
			return null;
		}
		if (this.anInt9042 != 0) {
			local23.a(this.anInt9042 * 2048);
		}
		@Pc(39) Class17 local39 = arg0.method8013();
		local39.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
		this.method7379(local23, local39, arg0);
		@Pc(58) Class34_Sub8 local58 = Static327.method4658(1, false);
		if (Static375.aBoolean532) {
			local23.method8869(local39, local58.aClass34_Sub6Array1[0], Static501.anInt7929, 0);
		} else {
			local23.method8857(local39, local58.aClass34_Sub6Array1[0], 0);
		}
		if (this.aClass34_Sub7_7 != null) {
			@Pc(86) Class347 local86 = this.aClass34_Sub7_7.method5100();
			if (Static375.aBoolean532) {
				arg0.method8051(local86, Static501.anInt7929);
			} else {
				arg0.method8057(local86);
			}
		}
		this.lb = local23.F();
		this.anInt9062 = local23.fa();
		this.anInt9049 = local23.ma();
		return local58;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7841() {
		return false;
	}

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7845() {
		return false;
	}

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "(I)V")
	@Override
	public void method7848() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7853() {
		return this.lb;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)I")
	@Override
	public int method7840(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method7842(93, (Class34_Sub1) null, 4, 71, (Class95) null, false);
		}
		return this.anInt9049;
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
		@Pc(11) Class149 local11 = this.method7381(0, arg0, this.anInt9063);
		if (local11 != null) {
			@Pc(16) Class17 local16 = arg0.method8013();
			local16.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
			this.method7379(local11, local16, arg0);
		}
	}

	@OriginalMember(owner = "client!sn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass34_Sub7_7 != null) {
			this.aClass34_Sub7_7.method5094();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!ka;Lclient!al;Lclient!ha;)V")
	private void method7379(@OriginalArg(1) Class149 arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) Class95 arg2) {
		arg0.method8848(arg1);
		@Pc(9) Class373[] local9 = arg0.method8867();
		@Pc(12) Class305[] local12 = arg0.method8861();
		if ((this.aClass34_Sub7_7 == null || this.aClass34_Sub7_7.aBoolean416) && (local9 != null || local12 != null)) {
			this.aClass34_Sub7_7 = Static350.method5095(Static122.anInt2190, true);
		}
		if (this.aClass34_Sub7_7 != null) {
			this.aClass34_Sub7_7.method5088(arg2, (long) Static122.anInt2190, local9, local12);
			this.aClass34_Sub7_7.method5101(super.aByte132, super.aShort98, super.aShort97, super.aShort99, super.aShort96);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public void method7380() {
		if (this.aClass34_Sub7_7 != null) {
			this.aClass34_Sub7_7.method5094();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	@Override
	public void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBLclient!ha;I)Lclient!ka;")
	private Class149 method7381(@OriginalArg(0) int arg0, @OriginalArg(2) Class95 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class106 local8 = Static366.aClass182_2.method4107(arg2);
		@Pc(18) Class35 local18 = Static556.aClass35Array2[super.aByte132];
		@Pc(33) Class35 local33 = super.aByte131 >= 3 ? null : Static556.aClass35Array2[super.aByte131 + 1];
		return this.aBoolean633 ? local8.method2344(arg1, super.anInt9622, Static13.aClass213_1, super.anInt9614, arg0, 0, super.anInt9619, -1, local18, local33, -1) : local8.method2344(arg1, super.anInt9622, Static13.aClass213_1, super.anInt9614, arg0, this.anInt9052, super.anInt9619, this.anInt9038, local18, local33, this.anInt9047);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
	public void method7382(@OriginalArg(0) int arg0) {
		if (this.aBoolean633) {
			return;
		}
		this.anInt9052 += arg0;
		while (this.aClass239_3.anIntArray337[this.anInt9038] < this.anInt9052) {
			this.anInt9052 -= this.aClass239_3.anIntArray337[this.anInt9038];
			this.anInt9038++;
			if (this.anInt9038 >= this.aClass239_3.anIntArray339.length) {
				this.aBoolean633 = true;
				break;
			}
		}
		if (!this.aBoolean633) {
			Static305.method4420(this, this.aClass239_3, this.anInt9038);
		}
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)I")
	@Override
	public int method7847() {
		return this.anInt9062;
	}
}
