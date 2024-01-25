import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class30_Sub1_Sub4 extends Class30_Sub1 {

	@OriginalMember(owner = "client!nr", name = "N", descriptor = "Lclient!jw;")
	private Class7_Sub3 aClass7_Sub3_5;

	@OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
	private int anInt6413 = 0;

	@OriginalMember(owner = "client!nr", name = "K", descriptor = "I")
	private final int anInt6420 = -1;

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
	private int anInt6416 = 0;

	@OriginalMember(owner = "client!nr", name = "U", descriptor = "Z")
	public boolean aBoolean472 = false;

	@OriginalMember(owner = "client!nr", name = "V", descriptor = "I")
	private int anInt6427 = 0;

	@OriginalMember(owner = "client!nr", name = "Y", descriptor = "I")
	private int anInt6430 = -32768;

	@OriginalMember(owner = "client!nr", name = "W", descriptor = "I")
	private final int anInt6428;

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
	public final int anInt6410;

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
	private final int anInt6415;

	@OriginalMember(owner = "client!nr", name = "A", descriptor = "Lclient!dba;")
	private Class64 aClass64_1;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class30_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt6428 = arg0;
		this.anInt6410 = arg1 + arg2;
		this.anInt6427 = arg12;
		this.anInt6415 = arg4;
		@Pc(49) Class50 local49 = Static82.aClass212_2.method5063(this.anInt6428);
		@Pc(52) int local52 = local49.anInt1432;
		if (local52 == -1) {
			this.aBoolean472 = true;
		} else {
			this.aClass64_1 = Static47.aClass41_1.method911(local52);
			this.aBoolean472 = false;
		}
		if (this.anInt6410 == arg2) {
			Static349.method5479(super.anInt9416, super.aByte99, false, this.anInt6413, this.aClass64_1, super.anInt9418);
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		@Pc(23) Class26 local23 = this.method5373((this.anInt6427 == 0 ? 0 : 5) | 0x800, this.anInt6428, arg0);
		if (local23 == null) {
			return null;
		}
		if (this.anInt6427 != 0) {
			local23.OA(this.anInt6427 * 2048);
		}
		@Pc(42) Class91 local42 = arg0.method5847();
		local42.oa(super.anInt9418, super.anInt9422, super.anInt9416);
		if (this.aClass7_Sub3_5 == null) {
			local23.method8003(local42, null, 0);
		} else {
			@Pc(57) Class136 local57 = this.aClass7_Sub3_5.method4202();
			arg0.method5864(local23, local57, local42, null);
		}
		this.anInt6430 = local23.TA();
		this.method5375(arg0, local23);
		return null;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)V")
	public void method5370(@OriginalArg(1) int arg0) {
		if (this.aBoolean472) {
			return;
		}
		this.anInt6416 += arg0;
		while (this.aClass64_1.anIntArray184[this.anInt6413] < this.anInt6416) {
			this.anInt6416 -= this.aClass64_1.anIntArray184[this.anInt6413];
			this.anInt6413++;
			if (this.anInt6413 >= this.aClass64_1.anIntArray185.length) {
				this.aBoolean472 = true;
				break;
			}
		}
		if (!this.aBoolean472) {
			Static349.method5479(super.anInt9416, super.aByte99, false, this.anInt6413, this.aClass64_1, super.anInt9418);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	public void method5372() {
		if (this.aClass7_Sub3_5 != null) {
			this.aClass7_Sub3_5.method4196();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
		@Pc(11) Class26 local11 = this.method5373(0, this.anInt6428, arg0);
		if (local11 != null) {
			this.method5375(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIBLclient!qa;)Lclient!r;")
	private Class26 method5373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(8) Class50 local8 = Static82.aClass212_2.method5063(arg1);
		@Pc(18) Class215 local18 = Static155.aClass215Array5[super.aByte99];
		@Pc(31) Class215 local31 = this.anInt6415 >= 3 ? null : Static155.aClass215Array5[this.anInt6415 + 1];
		return this.aBoolean472 ? local8.method1441(super.anInt9422, super.anInt9416, arg2, -1, 0, arg0, Static47.aClass41_1, local31, super.anInt9418, local18, -1) : local8.method1441(super.anInt9422, super.anInt9416, arg2, this.anInt6413, this.anInt6416, arg0, Static47.aClass41_1, local31, super.anInt9418, local18, this.anInt6420);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)I")
	@Override
	public int method7815() {
		return this.anInt6430;
	}

	@OriginalMember(owner = "client!nr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass7_Sub3_5 != null) {
			this.aClass7_Sub3_5.method4196();
		}
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!qa;ZLclient!r;)V")
	private void method5375(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Class26 arg1) {
		@Pc(6) Class142[] local6 = arg1.method8006();
		@Pc(15) Class265[] local15 = arg1.method7999();
		if ((this.aClass7_Sub3_5 == null || this.aClass7_Sub3_5.aBoolean392) && (local6 != null || local15 != null)) {
			this.aClass7_Sub3_5 = Static244.method4191(Static409.anInt7683);
		}
		if (this.aClass7_Sub3_5 != null) {
			this.aClass7_Sub3_5.method4201(arg0, (long) Static409.anInt7683, local6, local15);
			this.aClass7_Sub3_5.method4193(super.aByte99, super.aShort115, super.aShort113, super.aShort112, super.aShort114);
		}
	}

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)V")
	@Override
	public void method7909() {
		throw new IllegalStateException();
	}
}
