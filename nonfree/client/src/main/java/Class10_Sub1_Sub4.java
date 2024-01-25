import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class10_Sub1_Sub4 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "Lclient!hv;")
	private Class26_Sub3 aClass26_Sub3_5;

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
	private int anInt6773 = 0;

	@OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
	private int anInt6785 = -32768;

	@OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
	private int anInt6787 = 0;

	@OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
	private final int anInt6794 = -1;

	@OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
	private int anInt6793 = 0;

	@OriginalMember(owner = "client!ok", name = "U", descriptor = "Z")
	public boolean aBoolean504 = false;

	@OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
	private final int anInt6780;

	@OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
	private final int anInt6791;

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
	public final int anInt6770;

	@OriginalMember(owner = "client!ok", name = "A", descriptor = "Lclient!dv;")
	private Class77 aClass77_2;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class10_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt6787 = arg12;
		this.anInt6780 = arg0;
		this.anInt6791 = arg4;
		this.anInt6770 = arg2 + arg1;
		@Pc(49) Class318 local49 = Static206.aClass275_1.method6050(this.anInt6780);
		@Pc(52) int local52 = local49.anInt8788;
		if (local52 == -1) {
			this.aBoolean504 = true;
		} else {
			this.aClass77_2 = Static168.aClass327_2.method7326(local52);
			this.aBoolean504 = false;
		}
		if (this.anInt6770 == arg2) {
			Static240.method4084(super.aByte101, super.anInt8934, super.anInt8929, this.anInt6793, this.aClass77_2, false);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
		@Pc(18) Class9 local18 = this.method5683(arg0, 0, this.anInt6780);
		if (local18 != null) {
			@Pc(23) Class134 local23 = arg0.method6842();
			local23.GA(super.anInt8934, super.anInt8931, super.anInt8929);
			this.method5678(arg0, local23, local18);
		}
	}

	@OriginalMember(owner = "client!ok", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass26_Sub3_5 != null) {
			this.aClass26_Sub3_5.method3661();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return false;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!oa;Lclient!q;ILclient!ba;)V")
	private void method5678(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(3) Class9 arg2) {
		arg2.method4011(arg1);
		@Pc(14) Class181[] local14 = arg2.method4019();
		@Pc(17) Class89[] local17 = arg2.method4015();
		if ((this.aClass26_Sub3_5 == null || this.aClass26_Sub3_5.aBoolean320) && (local14 != null || local17 != null)) {
			this.aClass26_Sub3_5 = Static207.method3660(Static237.anInt7561, true);
		}
		if (this.aClass26_Sub3_5 != null) {
			this.aClass26_Sub3_5.method3659(arg0, (long) Static237.anInt7561, local14, local17);
			this.aClass26_Sub3_5.method3653(super.aByte101, super.aShort116, super.aShort118, super.aShort117, super.aShort115);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)V")
	public void method5680(@OriginalArg(1) int arg0) {
		if (this.aBoolean504) {
			return;
		}
		this.anInt6773 += arg0;
		while (this.aClass77_2.anIntArray240[this.anInt6793] < this.anInt6773) {
			this.anInt6773 -= this.aClass77_2.anIntArray240[this.anInt6793];
			this.anInt6793++;
			if (this.aClass77_2.anIntArray238.length <= this.anInt6793) {
				this.aBoolean504 = true;
				break;
			}
		}
		if (!this.aBoolean504) {
			Static240.method4084(super.aByte101, super.anInt8934, super.anInt8929, this.anInt6793, this.aClass77_2, false);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public void method5681() {
		if (this.aClass26_Sub3_5 != null) {
			this.aClass26_Sub3_5.method3661();
		}
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(Z)I")
	@Override
	public int method7342() {
		return this.anInt6785;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		@Pc(26) Class9 local26 = this.method5683(arg0, (this.anInt6787 == 0 ? 0 : 5) | 0x800, this.anInt6780);
		if (local26 == null) {
			return null;
		}
		if (this.anInt6787 != 0) {
			local26.I(this.anInt6787 * 2048);
		}
		@Pc(42) Class134 local42 = arg0.method6842();
		local42.GA(super.anInt8934, super.anInt8931, super.anInt8929);
		this.method5678(arg0, local42, local26);
		if (this.aClass26_Sub3_5 == null) {
			local26.method4023(local42, null, 0);
		} else {
			@Pc(70) Class42 local70 = this.aClass26_Sub3_5.method3658();
			arg0.method6807(local26, local70, local42, null, 0);
		}
		this.anInt6785 = local26.DA();
		return null;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!oa;III)Lclient!ba;")
	private Class9 method5683(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class318 local14 = Static206.aClass275_1.method6050(arg2);
		@Pc(19) Class16 local19 = Static45.aClass16Array1[super.aByte101];
		@Pc(32) Class16 local32 = this.anInt6791 >= 3 ? null : Static45.aClass16Array1[this.anInt6791 + 1];
		return this.aBoolean504 ? local14.method7215(arg0, local19, arg1, super.anInt8929, local32, -1, Static168.aClass327_2, -1, super.anInt8934, super.anInt8931, 0) : local14.method7215(arg0, local19, arg1, super.anInt8929, local32, this.anInt6793, Static168.aClass327_2, this.anInt6794, super.anInt8934, super.anInt8931, this.anInt6773);
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
