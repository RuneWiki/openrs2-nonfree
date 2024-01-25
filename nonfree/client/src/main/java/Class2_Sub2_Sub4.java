import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kj", name = "Z", descriptor = "Lclient!dp;")
	private Class17_Sub3 aClass17_Sub3_4;

	@OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
	private final int anInt3545 = -1;

	@OriginalMember(owner = "client!kj", name = "H", descriptor = "Z")
	public boolean aBoolean294 = false;

	@OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
	private int anInt3549 = 0;

	@OriginalMember(owner = "client!kj", name = "db", descriptor = "I")
	private int anInt3556 = 0;

	@OriginalMember(owner = "client!kj", name = "gb", descriptor = "I")
	private int anInt3559 = -32768;

	@OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
	public final int anInt3550;

	@OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
	private final int anInt3537;

	@OriginalMember(owner = "client!kj", name = "R", descriptor = "Lclient!lb;")
	private Class116 aClass116_2;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt3550 = arg1 + arg2;
		this.anInt3537 = arg0;
		@Pc(40) int local40 = Static244.method4224(this.anInt3537).anInt5127;
		if (local40 == -1) {
			this.aBoolean294 = true;
		} else {
			this.aBoolean294 = false;
			this.aClass116_2 = Static340.method5560(local40);
		}
		if (this.anInt3550 == arg2) {
			Static291.method4975(false, this.aClass116_2, this.anInt3556, super.anInt6465, super.anInt6466);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)V")
	public void method3050(@OriginalArg(1) int arg0) {
		if (this.aBoolean294) {
			return;
		}
		this.anInt3549 += arg0;
		while (this.aClass116_2.anIntArray329[this.anInt3556] < this.anInt3549) {
			this.anInt3549 -= this.aClass116_2.anIntArray329[this.anInt3556];
			this.anInt3556++;
			if (this.aClass116_2.anIntArray330.length <= this.anInt3556) {
				this.aBoolean294 = true;
				break;
			}
		}
		if (!this.aBoolean294) {
			Static291.method4975(false, this.aClass116_2, this.anInt3556, super.anInt6465, super.anInt6466);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!vm;BLclient!jn;)V")
	private void method3051(@OriginalArg(0) Class92 arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(6) Class125[] local6 = arg1.method3989();
		@Pc(9) Class143[] local9 = arg1.method4002();
		if ((this.aClass17_Sub3_4 == null || this.aClass17_Sub3_4.aBoolean97) && (local6 != null || local9 != null)) {
			this.aClass17_Sub3_4 = new Class17_Sub3(Static342.anInt6706);
		}
		if (this.aClass17_Sub3_4 != null) {
			this.aClass17_Sub3_4.method1064(arg0, (long) Static342.anInt6706, local6, local9);
			this.aClass17_Sub3_4.method1068(super.aByte73, super.aShort85, super.aShort83, super.aShort84, super.aShort82);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILclient!vm;)Z")
	@Override
	public boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)I")
	@Override
	public int method5416() {
		return this.anInt3559;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!vm;I)V")
	@Override
	public void method5409(@OriginalArg(0) Class92 arg0) {
		@Pc(9) Class5 local9 = this.method3057(arg0, 0);
		if (local9 != null) {
			this.method3051(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5411() {
		return false;
	}

	@OriginalMember(owner = "client!kj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass17_Sub3_4 != null) {
			this.aClass17_Sub3_4.method1070();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	@Override
	public Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0) {
		@Pc(9) Class5 local9 = this.method3057(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(23) Class23 local23 = arg0.method4466();
		local23.method5091(super.anInt6465, super.anInt6464, super.anInt6466);
		if (this.aClass17_Sub3_4 == null) {
			local9.method4029(local23, null, 0);
		} else {
			@Pc(45) Class88 local45 = this.aClass17_Sub3_4.method1067();
			arg0.method4451(local9, local45, local23, null);
		}
		this.anInt3559 = local9.method4020();
		this.method3051(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
	@Override
	public void method5408() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public void method3056() {
		if (this.aClass17_Sub3_4 != null) {
			this.aClass17_Sub3_4.method1070();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZIIILclient!ai;ILclient!vm;)V")
	@Override
	public void method5406(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!vm;II)Lclient!jn;")
	private Class5 method3057(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class156 local17 = Static244.method4224(this.anInt3537);
		return this.aBoolean294 ? local17.method4236(0, -1, arg0, -1, arg1) : local17.method4236(this.anInt3549, this.anInt3556, arg0, this.anInt3545, arg1);
	}
}
