import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class15_Sub1_Sub2_Sub1 extends Class15_Sub1_Sub2 {

	@OriginalMember(owner = "client!aq", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!aq", name = "hb", descriptor = "Lclient!pd;")
	private Class15_Sub8 aClass15_Sub8_1;

	@OriginalMember(owner = "client!aq", name = "db", descriptor = "Z")
	public boolean aBoolean97 = false;

	@OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
	private final int anInt998 = -1;

	@OriginalMember(owner = "client!aq", name = "qb", descriptor = "I")
	private int anInt1016 = 0;

	@OriginalMember(owner = "client!aq", name = "pb", descriptor = "I")
	private int anInt1015 = 0;

	@OriginalMember(owner = "client!aq", name = "gb", descriptor = "I")
	private int anInt1010 = 0;

	@OriginalMember(owner = "client!aq", name = "nb", descriptor = "Z")
	private boolean aBoolean98 = true;

	@OriginalMember(owner = "client!aq", name = "vb", descriptor = "I")
	private int anInt1021 = 0;

	@OriginalMember(owner = "client!aq", name = "xb", descriptor = "I")
	private int anInt1023 = 0;

	@OriginalMember(owner = "client!aq", name = "W", descriptor = "I")
	public final int anInt1002;

	@OriginalMember(owner = "client!aq", name = "U", descriptor = "I")
	private final int anInt1000;

	@OriginalMember(owner = "client!aq", name = "Z", descriptor = "Lclient!fba;")
	private Class97 aClass97_1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class15_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt1002 = arg2 + arg1;
		this.anInt1000 = arg0;
		this.anInt1016 = arg12;
		@Pc(53) Class73 local53 = Static202.aClass333_2.method7823(this.anInt1000);
		@Pc(56) int local56 = local53.anInt2718;
		if (local56 == -1) {
			this.aBoolean97 = true;
		} else {
			this.aClass97_1 = Static28.aClass220_1.method5670(local56);
			this.aBoolean97 = false;
		}
		if (this.anInt1002 == arg2) {
			Static522.method7447(this, this.aClass97_1, this.anInt1015);
		}
	}

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "(I)V")
	public void method959() {
		if (this.aClass15_Sub8_1 != null) {
			this.aClass15_Sub8_1.method6531();
		}
	}

	@OriginalMember(owner = "client!aq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass15_Sub8_1 != null) {
			this.aClass15_Sub8_1.method6531();
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
	@Override
	public void method8317() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	public void method960(@OriginalArg(0) int arg0) {
		if (this.aBoolean97) {
			return;
		}
		this.anInt1023 += arg0;
		while (this.aClass97_1.anIntArray180[this.anInt1015] < this.anInt1023) {
			this.anInt1023 -= this.aClass97_1.anIntArray180[this.anInt1015];
			this.anInt1015++;
			if (this.aClass97_1.anIntArray182.length <= this.anInt1015) {
				this.aBoolean97 = true;
				break;
			}
		}
		if (!this.aBoolean97) {
			Static522.method7447(this, this.aClass97_1, this.anInt1015);
		}
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)I")
	@Override
	public int method8326() {
		return this.anInt1010;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8320() {
		return false;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	@Override
	public void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ha;Lclient!dfa;Lclient!ka;B)V")
	private void method961(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class83 arg2) {
		arg2.method7999(arg1);
		@Pc(9) Class219[] local9 = arg2.method8010();
		@Pc(12) Class238[] local12 = arg2.method8005();
		if ((this.aClass15_Sub8_1 == null || this.aClass15_Sub8_1.aBoolean568) && (local9 != null || local12 != null)) {
			this.aClass15_Sub8_1 = Static417.method6545(Static435.anInt8192, true);
		}
		if (this.aClass15_Sub8_1 != null) {
			this.aClass15_Sub8_1.method6535(arg0, (long) Static435.anInt8192, local9, local12);
			this.aClass15_Sub8_1.method6544(super.aByte124, super.aShort105, super.aShort104, super.aShort103, super.aShort106);
		}
	}

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8328() {
		return this.aBoolean98;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
		@Pc(19) Class83 local19 = this.method962(arg0, this.anInt1000, 0);
		if (local19 != null) {
			@Pc(24) Class54 local24 = arg0.method6124();
			local24.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
			this.method961(arg0, local24, local19);
		}
	}

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8332() {
		return false;
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "(Z)I")
	@Override
	public int method8333(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8332();
		}
		return this.anInt1021;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ha;III)Lclient!ka;")
	private Class83 method962(@OriginalArg(0) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class73 local15 = Static202.aClass333_2.method7823(arg1);
		@Pc(20) Class86 local20 = Static86.aClass86Array2[super.aByte124];
		@Pc(35) Class86 local35 = super.aByte125 < 3 ? Static86.aClass86Array2[super.aByte125 + 1] : null;
		return this.aBoolean97 ? local15.method2306(local20, local35, arg2, super.anInt10297, -1, super.anInt10298, arg0, 0, super.anInt10301, -1, Static28.aClass220_1) : local15.method2306(local20, local35, arg2, super.anInt10297, this.anInt998, super.anInt10298, arg0, this.anInt1023, super.anInt10301, this.anInt1015, Static28.aClass220_1);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		@Pc(23) Class83 local23 = this.method962(arg0, this.anInt1000, (this.anInt1016 == 0 ? 0 : 5) | 0x800);
		if (local23 == null) {
			return null;
		}
		if (this.anInt1016 != 0) {
			local23.a(this.anInt1016 * 2048);
		}
		@Pc(48) Class54 local48 = arg0.method6124();
		local48.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
		this.method961(arg0, local48, local23);
		@Pc(67) Class15_Sub7 local67 = Static342.method5465(false, 1);
		if (Static183.aBoolean308) {
			local23.method8009(local48, local67.aClass15_Sub6Array1[0], Static115.anInt3009, 0);
		} else {
			local23.method8003(local48, local67.aClass15_Sub6Array1[0], 0);
		}
		if (this.aClass15_Sub8_1 != null) {
			@Pc(95) Class250 local95 = this.aClass15_Sub8_1.method6540();
			if (Static183.aBoolean308) {
				arg0.method6108(local95, Static115.anInt3009);
			} else {
				arg0.method6100(local95);
			}
		}
		this.aBoolean98 = local23.F();
		this.anInt1010 = local23.fa();
		this.anInt1021 = local23.ma();
		return local67;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		return false;
	}
}
