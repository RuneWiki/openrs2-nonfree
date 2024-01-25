import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class25_Sub3_Sub1 extends Class25_Sub3 {

	@OriginalMember(owner = "client!dv", name = "R", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[16384];

	@OriginalMember(owner = "client!dv", name = "P", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[16384];

	@OriginalMember(owner = "client!dv", name = "H", descriptor = "I")
	public int anInt1541;

	@OriginalMember(owner = "client!dv", name = "J", descriptor = "I")
	public int anInt1542;

	@OriginalMember(owner = "client!dv", name = "L", descriptor = "I")
	public int anInt1543;

	@OriginalMember(owner = "client!dv", name = "Q", descriptor = "I")
	public int anInt1547;

	@OriginalMember(owner = "client!dv", name = "B", descriptor = "I")
	public int anInt1536 = -1;

	@OriginalMember(owner = "client!dv", name = "D", descriptor = "I")
	public int anInt1538 = -1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray6[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray5[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		@Pc(6) Class32 local6 = arg0.method5747();
		local6.U(super.anInt1529, super.anInt1527, super.anInt1534);
		@Pc(25) Class4_Sub7 local25 = Static142.method2157(3);
		@Pc(47) Class57 local47;
		if (this.anInt1538 != -1) {
			local47 = Static342.aClass155_2.method3548(this.anInt1538).method3702(this.anInt1541, 2048, -1, null, 0, 0, arg0, null);
			if (local47 != null) {
				local47.method5953(local6, local25.aClass4_Sub8Array1[2], 0);
			}
		}
		if (this.anInt1536 != -1) {
			local47 = Static342.aClass155_2.method3548(this.anInt1536).method3702(this.anInt1547, 2048, -1, null, 0, 0, arg0, null);
			if (local47 != null) {
				local47.method5953(local6, local25.aClass4_Sub8Array1[1], 0);
			}
		}
		local47 = Static342.aClass155_2.method3548(this.anInt1543).method3702(this.anInt1542, 2048, -1, null, 0, 0, arg0, null);
		if (local47 != null) {
			local47.method5953(local6, local25.aClass4_Sub8Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class32 local6 = arg1.method5747();
		local6.U(super.anInt1529, super.anInt1527, super.anInt1534);
		@Pc(31) Class57 local31 = Static342.aClass155_2.method3548(this.anInt1543).method3702(this.anInt1542, 131072, -1, null, 0, 0, arg1, null);
		if (local31 != null && local31.method5957(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt1536 != -1) {
			local31 = Static342.aClass155_2.method3548(this.anInt1536).method3702(this.anInt1547, 131072, -1, null, 0, 0, arg1, null);
			if (local31 != null && local31.method5957(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt1538 != -1) {
			local31 = Static342.aClass155_2.method3548(this.anInt1538).method3702(this.anInt1541, 131072, -1, null, 0, 0, arg1, null);
			if (local31 != null && local31.method5957(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
