import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class25_Sub5_Sub5 extends Class25_Sub5 {

	@OriginalMember(owner = "client!mo", name = "I", descriptor = "Lclient!dl;")
	private Class4_Sub2 aClass4_Sub2_6;

	@OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
	private int anInt4592 = 0;

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
	private int anInt4595 = 0;

	@OriginalMember(owner = "client!mo", name = "db", descriptor = "I")
	private int anInt4609 = -32768;

	@OriginalMember(owner = "client!mo", name = "eb", descriptor = "Z")
	public boolean aBoolean529 = false;

	@OriginalMember(owner = "client!mo", name = "hb", descriptor = "I")
	private int anInt4612 = 0;

	@OriginalMember(owner = "client!mo", name = "ab", descriptor = "I")
	private final int anInt4607 = -1;

	@OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
	public final int anInt4597;

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
	private final int anInt4603;

	@OriginalMember(owner = "client!mo", name = "W", descriptor = "I")
	private final int anInt4604;

	@OriginalMember(owner = "client!mo", name = "bb", descriptor = "Lclient!oj;")
	private Class177 aClass177_2;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class25_Sub5_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt4597 = arg2 + arg1;
		this.anInt4603 = arg0;
		this.anInt4604 = arg4;
		this.anInt4595 = arg12;
		@Pc(49) Class130 local49 = Static88.aClass69_1.method1553(this.anInt4603);
		@Pc(52) int local52 = local49.anInt3576;
		if (local52 == -1) {
			this.aBoolean529 = true;
		} else {
			this.aClass177_2 = Static174.aClass254_1.method5670(local52);
			this.aBoolean529 = false;
		}
		if (arg2 == this.anInt4597) {
			Static70.method1141(this.aClass177_2, super.aByte94, super.anInt5518, super.anInt5514, false, this.anInt4612);
		}
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		@Pc(21) Class57 local21 = this.method3634((this.anInt4595 == 0 ? 0 : 5) | 0x800, this.anInt4603, arg0);
		if (local21 == null) {
			return null;
		}
		if (this.anInt4595 != 0) {
			local21.ma(this.anInt4595 * 2048);
		}
		@Pc(43) Class32 local43 = arg0.method5747();
		local43.U(super.anInt5518, super.anInt5517, super.anInt5514);
		if (this.aClass4_Sub2_6 == null) {
			local21.method5953(local43, null, 0);
		} else {
			@Pc(58) Class71 local58 = this.aClass4_Sub2_6.method1240();
			arg0.method5762(local21, local58, local43, null);
		}
		this.anInt4609 = local21.B();
		this.method3635(arg0, local21);
		return null;
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)I")
	@Override
	public int method4341() {
		return this.anInt4609;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!mo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub2_6 != null) {
			this.aClass4_Sub2_6.method1244();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
	public void method3633(@OriginalArg(0) int arg0) {
		if (this.aBoolean529) {
			return;
		}
		this.anInt4592 += arg0;
		while (this.aClass177_2.anIntArray327[this.anInt4612] < this.anInt4592) {
			this.anInt4592 -= this.aClass177_2.anIntArray327[this.anInt4612];
			this.anInt4612++;
			if (this.aClass177_2.anIntArray326.length <= this.anInt4612) {
				this.aBoolean529 = true;
				break;
			}
		}
		if (!this.aBoolean529) {
			Static70.method1141(this.aClass177_2, super.aByte94, super.anInt5518, super.anInt5514, false, this.anInt4612);
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
		@Pc(16) Class57 local16 = this.method3634(0, this.anInt4603, arg0);
		if (local16 != null) {
			this.method3635(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILclient!za;B)Lclient!e;")
	private Class57 method3634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		@Pc(13) Class130 local13 = Static88.aClass69_1.method1553(arg1);
		@Pc(18) Class157 local18 = Static330.aClass157Array2[super.aByte94];
		@Pc(33) Class157 local33 = this.anInt4604 >= 3 ? null : Static330.aClass157Array2[this.anInt4604 + 1];
		return this.aBoolean529 ? local13.method2908(local18, -1, arg2, super.anInt5517, 0, arg0, Static174.aClass254_1, local33, super.anInt5518, super.anInt5514, -1) : local13.method2908(local18, this.anInt4607, arg2, super.anInt5517, this.anInt4592, arg0, Static174.aClass254_1, local33, super.anInt5518, super.anInt5514, this.anInt4612);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!za;Lclient!e;I)V")
	private void method3635(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(6) Class229[] local6 = arg1.method5958();
		@Pc(9) Class181[] local9 = arg1.method5959();
		if ((this.aClass4_Sub2_6 == null || this.aClass4_Sub2_6.aBoolean162) && (local6 != null || local9 != null)) {
			this.aClass4_Sub2_6 = new Class4_Sub2(Static236.anInt4213);
		}
		if (this.aClass4_Sub2_6 != null) {
			this.aClass4_Sub2_6.method1242(arg0, (long) Static236.anInt4213, local6, local9);
			this.aClass4_Sub2_6.method1236(super.aByte94, super.aShort97, super.aShort96, super.aShort94, super.aShort95);
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public void method3636() {
		if (this.aClass4_Sub2_6 != null) {
			this.aClass4_Sub2_6.method1244();
		}
	}
}
