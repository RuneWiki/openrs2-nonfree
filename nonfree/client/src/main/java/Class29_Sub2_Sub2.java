import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class29_Sub2_Sub2 extends Class29_Sub2 {

	@OriginalMember(owner = "client!mq", name = "H", descriptor = "Lclient!tp;")
	private Class102_Sub6 aClass102_Sub6_5;

	@OriginalMember(owner = "client!mq", name = "F", descriptor = "I")
	private int anInt5735 = 0;

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
	private int anInt5732 = 0;

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
	private int anInt5728 = 0;

	@OriginalMember(owner = "client!mq", name = "M", descriptor = "I")
	private final int anInt5740 = -1;

	@OriginalMember(owner = "client!mq", name = "N", descriptor = "I")
	private int anInt5741 = -32768;

	@OriginalMember(owner = "client!mq", name = "T", descriptor = "Z")
	public boolean aBoolean366 = false;

	@OriginalMember(owner = "client!mq", name = "X", descriptor = "I")
	private final int anInt5748;

	@OriginalMember(owner = "client!mq", name = "E", descriptor = "I")
	public final int anInt5734;

	@OriginalMember(owner = "client!mq", name = "P", descriptor = "I")
	private final int anInt5743;

	@OriginalMember(owner = "client!mq", name = "L", descriptor = "Lclient!fq;")
	private Class108 aClass108_2;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class29_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt5748 = arg0;
		this.anInt5734 = arg2 + arg1;
		this.anInt5743 = arg4;
		this.anInt5728 = arg12;
		@Pc(50) Class237 local50 = Static448.aClass117_2.method2317(this.anInt5748);
		@Pc(53) int local53 = local50.anInt6458;
		if (local53 == -1) {
			this.aBoolean366 = true;
		} else {
			this.aClass108_2 = Static31.aClass345_1.method7798(local53);
			this.aBoolean366 = false;
		}
		if (arg2 == this.anInt5734) {
			Static294.method4111(this.anInt5732, super.anInt9218, false, super.anInt9222, this.aClass108_2, super.aByte103);
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
	@Override
	public void method7537() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
		@Pc(11) Class22 local11 = this.method4925(arg0, this.anInt5748, 0);
		if (local11 != null) {
			@Pc(22) Class34 local22 = arg0.method7096();
			local22.GA(super.anInt9222, super.anInt9223, super.anInt9218);
			this.method4931(local11, local22, arg0);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!oa;II)Lclient!ba;")
	private Class22 method4925(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class237 local8 = Static448.aClass117_2.method2317(arg1);
		@Pc(20) Class60 local20 = Static34.aClass60Array10[super.aByte103];
		@Pc(35) Class60 local35 = this.anInt5743 < 3 ? Static34.aClass60Array10[this.anInt5743 + 1] : null;
		return this.aBoolean366 ? local8.method5499(super.anInt9223, Static31.aClass345_1, arg2, 0, super.anInt9222, local20, super.anInt9218, -1, local35, arg0, -1) : local8.method5499(super.anInt9223, Static31.aClass345_1, arg2, this.anInt5735, super.anInt9222, local20, super.anInt9218, this.anInt5740, local35, arg0, this.anInt5732);
	}

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "(I)I")
	@Override
	public int method7546() {
		return this.anInt5741;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		@Pc(18) Class22 local18 = this.method4925(arg0, this.anInt5748, (this.anInt5728 == 0 ? 0 : 5) | 0x800);
		if (local18 == null) {
			return null;
		}
		if (this.anInt5728 != 0) {
			local18.I(this.anInt5728 * 2048);
		}
		@Pc(34) Class34 local34 = arg0.method7096();
		local34.GA(super.anInt9222, super.anInt9223, super.anInt9218);
		this.method4931(local18, local34, arg0);
		if (this.aClass102_Sub6_5 == null) {
			local18.method4689(local34, null, 0);
		} else {
			@Pc(67) Class222 local67 = this.aClass102_Sub6_5.method6847();
			arg0.method7118(local18, local67, local34, null, 0);
		}
		this.anInt5741 = local18.DA();
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
	public void method4928(@OriginalArg(0) int arg0) {
		if (this.aBoolean366) {
			return;
		}
		this.anInt5735 += arg0;
		while (this.aClass108_2.anIntArray313[this.anInt5732] < this.anInt5735) {
			this.anInt5735 -= this.aClass108_2.anIntArray313[this.anInt5732];
			this.anInt5732++;
			if (this.aClass108_2.anIntArray312.length <= this.anInt5732) {
				this.aBoolean366 = true;
				break;
			}
		}
		if (!this.aBoolean366) {
			Static294.method4111(this.anInt5732, super.anInt9218, false, super.anInt9222, this.aClass108_2, super.aByte103);
		}
	}

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7540() {
		return false;
	}

	@OriginalMember(owner = "client!mq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass102_Sub6_5 != null) {
			this.aClass102_Sub6_5.method6838();
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!ba;Lclient!q;ILclient!oa;)V")
	private void method4931(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) Class121 arg2) {
		arg0.method4701(arg1);
		@Pc(9) Class163[] local9 = arg0.method4708();
		@Pc(12) Class250[] local12 = arg0.method4692();
		if ((this.aClass102_Sub6_5 == null || this.aClass102_Sub6_5.aBoolean567) && (local9 != null || local12 != null)) {
			this.aClass102_Sub6_5 = Static496.method6833(Static358.anInt6263, true);
		}
		if (this.aClass102_Sub6_5 != null) {
			this.aClass102_Sub6_5.method6834(arg2, (long) Static358.anInt6263, local9, local12);
			this.aClass102_Sub6_5.method6844(super.aByte103, super.aShort122, super.aShort124, super.aShort121, super.aShort123);
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
	public void method4932() {
		if (this.aClass102_Sub6_5 != null) {
			this.aClass102_Sub6_5.method6838();
		}
	}
}
