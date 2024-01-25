import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class282 implements Interface5 {

	@OriginalMember(owner = "client!qba", name = "r", descriptor = "Lclient!tba;")
	private Class323 aClass323_27 = new Class323(128);

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "[I")
	public final int[] anIntArray508 = new int[Static47.aClass364_1.anInt10060];

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "[I")
	private final int[] anIntArray506 = new int[Static47.aClass364_1.anInt10060];

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZB)I")
	public int method6474(@OriginalArg(0) boolean arg0) {
		@Pc(6) long local6 = Static48.method1203();
		for (@Pc(29) Class2_Sub15 local29 = arg0 ? (Class2_Sub15) this.aClass323_27.method7480() : (Class2_Sub15) this.aClass323_27.method7482(); local29 != null; local29 = (Class2_Sub15) this.aClass323_27.method7482()) {
			if (local6 > (local29.aLong64 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local29.aLong64 & 0x4000000000000000L) != 0L) {
					@Pc(54) int local54 = (int) local29.aLong278;
					this.anIntArray508[local54] = this.anIntArray506[local54];
					local29.method8920();
					return local54;
				}
				local29.method8920();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIB)V")
	public void method6475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class38 local8 = Static502.aClass199_2.method4578(arg0);
		@Pc(11) int local11 = local8.anInt1207;
		@Pc(14) int local14 = local8.anInt1205;
		@Pc(17) int local17 = local8.anInt1204;
		@Pc(30) int local30 = Class15.anIntArray34[local17 - local14];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local14;
		this.method6477(~local30 & this.anIntArray506[local11] | arg1 << local14 & local30, local11);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V")
	public void method6477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray506[arg1] = arg0;
		@Pc(20) Class2_Sub15 local20 = (Class2_Sub15) this.aClass323_27.method7484((long) arg1);
		if (local20 == null) {
			local20 = new Class2_Sub15(4611686018427387905L);
			this.aClass323_27.method7477(local20, (long) arg1);
		} else if (local20.aLong64 != 4611686018427387905L) {
			local20.aLong64 = Static48.method1203() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(IIB)V")
	public void method6478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray508[arg0] = arg1;
		@Pc(24) Class2_Sub15 local24 = (Class2_Sub15) this.aClass323_27.method7484((long) arg0);
		if (local24 == null) {
			local24 = new Class2_Sub15(Static48.method1203() + 500L);
			this.aClass323_27.method7477(local24, (long) arg0);
		} else {
			local24.aLong64 = Static48.method1203() + 500L;
		}
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(III)V")
	public void method6479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class38 local8 = Static502.aClass199_2.method4578(arg1);
		@Pc(11) int local11 = local8.anInt1207;
		@Pc(14) int local14 = local8.anInt1205;
		@Pc(17) int local17 = local8.anInt1204;
		@Pc(23) int local23 = Class15.anIntArray34[local17 - local14];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local14;
		this.method6478(local11, ~local23 & this.anIntArray508[local11] | local23 & arg0 << local14);
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
	public void method6480() {
		for (@Pc(9) int local9 = 0; local9 < Static47.aClass364_1.anInt10060; local9++) {
			@Pc(15) Class186 local15 = Static47.aClass364_1.method8544(local9);
			if (local15 != null && local15.anInt5082 == 0) {
				this.anIntArray506[local9] = 0;
				this.anIntArray508[local9] = 0;
			}
		}
		this.aClass323_27 = new Class323(128);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZI)I")
	@Override
	public int method6473(@OriginalArg(1) int arg0) {
		return this.anIntArray508[arg0];
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)I")
	@Override
	public int method6472(@OriginalArg(1) int arg0) {
		@Pc(8) Class38 local8 = Static502.aClass199_2.method4578(arg0);
		@Pc(15) int local15 = local8.anInt1207;
		@Pc(18) int local18 = local8.anInt1205;
		@Pc(21) int local21 = local8.anInt1204;
		@Pc(28) int local28 = Class15.anIntArray34[local21 - local18];
		return local28 & this.anIntArray508[local15] >> local18;
	}
}
