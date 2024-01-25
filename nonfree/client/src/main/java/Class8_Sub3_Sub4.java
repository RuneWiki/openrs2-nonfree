import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class8_Sub3_Sub4 extends Class8_Sub3 {

	@OriginalMember(owner = "client!qm", name = "H", descriptor = "Lclient!hk;")
	private Class20_Sub3 aClass20_Sub3_3;

	@OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
	private final int anInt5353 = -1;

	@OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
	private int anInt5354 = -32768;

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
	private int anInt5351 = 0;

	@OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
	private int anInt5361 = 0;

	@OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
	private int anInt5356 = 0;

	@OriginalMember(owner = "client!qm", name = "V", descriptor = "Z")
	public boolean aBoolean381 = false;

	@OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
	private final int anInt5364;

	@OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
	private final int anInt5357;

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
	public final int anInt5348;

	@OriginalMember(owner = "client!qm", name = "O", descriptor = "Lclient!id;")
	private Class119 aClass119_1;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class8_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt5364 = arg4;
		this.anInt5357 = arg0;
		this.anInt5361 = arg12;
		this.anInt5348 = arg2 + arg1;
		@Pc(49) Class172 local49 = Static452.aClass246_2.method5323(this.anInt5357);
		@Pc(52) int local52 = local49.anInt4088;
		if (local52 == -1) {
			this.aBoolean381 = true;
		} else {
			this.aClass119_1 = Static170.aClass125_3.method2389(local52);
			this.aBoolean381 = false;
		}
		if (this.anInt5348 == arg2) {
			Static334.method4419(super.anInt7339, this.aClass119_1, super.aByte99, false, this.anInt5356, super.anInt7343);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!t;Lclient!ya;)V")
	private void method4344(@OriginalArg(1) Class116 arg0, @OriginalArg(2) Class135 arg1) {
		@Pc(6) Class76[] local6 = arg0.method3111();
		@Pc(9) Class88[] local9 = arg0.method3115();
		if ((this.aClass20_Sub3_3 == null || this.aClass20_Sub3_3.aBoolean199) && (local6 != null || local9 != null)) {
			this.aClass20_Sub3_3 = new Class20_Sub3(Static265.anInt4371);
		}
		if (this.aClass20_Sub3_3 != null) {
			this.aClass20_Sub3_3.method2125(arg1, (long) Static265.anInt4371, local6, local9);
			this.aClass20_Sub3_3.method2136(super.aByte99, super.aShort100, super.aShort101, super.aShort99, super.aShort98);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
		@Pc(15) Class116 local15 = this.method4348(0, arg0, this.anInt5357);
		if (local15 != null) {
			this.method4344(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return false;
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)V")
	public void method4346() {
		if (this.aClass20_Sub3_3 != null) {
			this.aClass20_Sub3_3.method2127();
		}
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)I")
	@Override
	public int method5882() {
		return this.anInt5354;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		@Pc(18) Class116 local18 = this.method4348((this.anInt5361 == 0 ? 0 : 5) | 0x800, arg0, this.anInt5357);
		if (local18 == null) {
			return null;
		}
		if (this.anInt5361 != 0) {
			local18.Q(this.anInt5361 * 2048);
		}
		@Pc(42) Class35 local42 = arg0.method5398();
		local42.j(super.anInt7339, super.anInt7341, super.anInt7343);
		if (this.aClass20_Sub3_3 == null) {
			local18.method3117(local42, null, 0);
		} else {
			@Pc(64) Class83 local64 = this.aClass20_Sub3_3.method2129();
			arg0.method5396(local18, local64, local42, null);
		}
		this.anInt5354 = local18.MA();
		this.method4344(local18, arg0);
		return null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(IB)V")
	public void method4347(@OriginalArg(0) int arg0) {
		if (this.aBoolean381) {
			return;
		}
		this.anInt5351 += arg0;
		while (this.anInt5351 > this.aClass119_1.anIntArray242[this.anInt5356]) {
			this.anInt5351 -= this.aClass119_1.anIntArray242[this.anInt5356];
			this.anInt5356++;
			if (this.aClass119_1.anIntArray244.length <= this.anInt5356) {
				this.aBoolean381 = true;
				break;
			}
		}
		if (!this.aBoolean381) {
			Static334.method4419(super.anInt7339, this.aClass119_1, super.aByte99, false, this.anInt5356, super.anInt7343);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ya;IZ)Lclient!t;")
	private Class116 method4348(@OriginalArg(0) int arg0, @OriginalArg(1) Class135 arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class172 local8 = Static452.aClass246_2.method5323(arg2);
		@Pc(13) Class41 local13 = Static228.aClass41Array2[super.aByte99];
		@Pc(33) Class41 local33 = this.anInt5364 < 3 ? Static228.aClass41Array2[this.anInt5364 + 1] : null;
		return this.aBoolean381 ? local8.method3247(arg1, super.anInt7339, local13, Static170.aClass125_3, arg0, local33, -1, -1, 0, super.anInt7341, super.anInt7343) : local8.method3247(arg1, super.anInt7339, local13, Static170.aClass125_3, arg0, local33, this.anInt5356, this.anInt5353, this.anInt5351, super.anInt7341, super.anInt7343);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub3_3 != null) {
			this.aClass20_Sub3_3.method2127();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}
}
