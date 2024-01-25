import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class28_Sub1_Sub4_Sub4 extends Class28_Sub1_Sub4 {

	@OriginalMember(owner = "client!rea", name = "cb", descriptor = "Lclient!nia;")
	private Class28_Sub5 aClass28_Sub5_6;

	@OriginalMember(owner = "client!rea", name = "M", descriptor = "I")
	private int anInt8473 = 0;

	@OriginalMember(owner = "client!rea", name = "hb", descriptor = "Z")
	public boolean aBoolean721 = false;

	@OriginalMember(owner = "client!rea", name = "ib", descriptor = "I")
	private int anInt8490 = 0;

	@OriginalMember(owner = "client!rea", name = "db", descriptor = "I")
	private int anInt8486 = 0;

	@OriginalMember(owner = "client!rea", name = "mb", descriptor = "Z")
	private boolean aBoolean722 = true;

	@OriginalMember(owner = "client!rea", name = "Q", descriptor = "I")
	private int anInt8475 = 0;

	@OriginalMember(owner = "client!rea", name = "W", descriptor = "I")
	private final int anInt8480 = -1;

	@OriginalMember(owner = "client!rea", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!rea", name = "Z", descriptor = "I")
	private final int anInt8483;

	@OriginalMember(owner = "client!rea", name = "jb", descriptor = "I")
	public final int anInt8491;

	@OriginalMember(owner = "client!rea", name = "T", descriptor = "Lclient!jba;")
	private Class175 aClass175_3;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class28_Sub1_Sub4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt8483 = arg0;
		this.anInt8491 = arg1 + arg2;
		this.anInt8473 = arg12;
		@Pc(53) Class338 local53 = Static239.aClass91_1.method2243(this.anInt8483);
		@Pc(56) int local56 = local53.anInt9376;
		if (local56 == -1) {
			this.aBoolean721 = true;
		} else {
			this.aClass175_3 = Static591.aClass66_2.method1768(local56);
			this.aBoolean721 = false;
		}
		if (this.anInt8491 == arg2) {
			Static146.method2653(this.anInt8486, this.aClass175_3, this);
		}
	}

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8965() {
		return this.aBoolean722;
	}

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8973() {
		return false;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!oha;Lclient!ka;ILclient!ha;)V")
	private void method7237(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class153 arg1, @OriginalArg(3) Class65 arg2) {
		arg1.method8589(arg0);
		@Pc(9) Class313[] local9 = arg1.method8575();
		@Pc(12) Class209[] local12 = arg1.method8587();
		if ((this.aClass28_Sub5_6 == null || this.aClass28_Sub5_6.aBoolean608) && (local9 != null || local12 != null)) {
			this.aClass28_Sub5_6 = Static398.method5855(Static26.anInt350, true);
		}
		if (this.aClass28_Sub5_6 != null) {
			this.aClass28_Sub5_6.method5852(arg2, (long) Static26.anInt350, local9, local12);
			this.aClass28_Sub5_6.method5845(super.aByte145, super.aShort124, super.aShort122, super.aShort121, super.aShort123);
		}
	}

	@OriginalMember(owner = "client!rea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub5_6 != null) {
			this.aClass28_Sub5_6.method5858();
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZIBLclient!lq;Lclient!ha;II)V")
	@Override
	public void method8969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
	@Override
	public void method8960() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)V")
	public void method7240(@OriginalArg(0) int arg0) {
		if (this.aBoolean721) {
			return;
		}
		this.anInt8490 += arg0;
		while (this.anInt8490 > this.aClass175_3.anIntArray291[this.anInt8486]) {
			this.anInt8490 -= this.aClass175_3.anIntArray291[this.anInt8486];
			this.anInt8486++;
			if (this.aClass175_3.anIntArray288.length <= this.anInt8486) {
				this.aBoolean721 = true;
				break;
			}
		}
		if (!this.aBoolean721) {
			Static146.method2653(this.anInt8486, this.aClass175_3, this);
		}
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		@Pc(23) Class153 local23 = this.method7243(this.anInt8483, arg0, (this.anInt8473 == 0 ? 0 : 5) | 0x800);
		if (local23 == null) {
			return null;
		}
		if (this.anInt8473 != 0) {
			local23.a(this.anInt8473 * 2048);
		}
		@Pc(42) Class254 local42 = arg0.method6903();
		local42.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
		this.method7237(local42, local23, arg0);
		@Pc(61) Class28_Sub7 local61 = Static375.method5607(false, 1);
		if (Static632.aBoolean877) {
			local23.method8594(local42, local61.aClass28_Sub9Array1[0], Static483.anInt8094, 0);
		} else {
			local23.method8585(local42, local61.aClass28_Sub9Array1[0], 0);
		}
		if (this.aClass28_Sub5_6 != null) {
			@Pc(89) Class392 local89 = this.aClass28_Sub5_6.method5856();
			if (Static632.aBoolean877) {
				arg0.method6897(local89, Static483.anInt8094);
			} else {
				arg0.method6899(local89);
			}
		}
		this.aBoolean722 = local23.F();
		this.anInt8475 = local23.fa();
		this.lb = local23.ma();
		return local61;
	}

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8963() {
		return false;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
	public void method7241() {
		if (this.aClass28_Sub5_6 != null) {
			this.aClass28_Sub5_6.method5858();
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
		@Pc(17) Class153 local17 = this.method7243(this.anInt8483, arg0, 0);
		if (local17 != null) {
			@Pc(22) Class254 local22 = arg0.method6903();
			local22.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
			this.method7237(local22, local17, arg0);
		}
	}

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "(B)I")
	@Override
	public int method8964(@OriginalArg(0) byte arg0) {
		return arg0 >= -85 ? -117 : this.lb;
	}

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "(I)I")
	@Override
	public int method8976() {
		return this.anInt8475;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!ha;II)Lclient!ka;")
	private Class153 method7243(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class338 local13 = Static239.aClass91_1.method2243(arg0);
		@Pc(18) Class109 local18 = Static605.aClass109Array5[super.aByte145];
		@Pc(31) Class109 local31 = super.aByte144 >= 3 ? null : Static605.aClass109Array5[super.aByte144 + 1];
		return this.aBoolean721 ? local13.method7931(local31, Static591.aClass66_2, 0, arg2, super.anInt10781, super.anInt10779, -1, -1, super.anInt10784, local18, arg1) : local13.method7931(local31, Static591.aClass66_2, this.anInt8490, arg2, super.anInt10781, super.anInt10779, this.anInt8480, this.anInt8486, super.anInt10784, local18, arg1);
	}
}
