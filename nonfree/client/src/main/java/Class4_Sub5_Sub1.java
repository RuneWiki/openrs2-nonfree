import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class4_Sub5_Sub1 extends Class4_Sub5 {

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	public int anInt7592;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
	public int anInt7596;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
	public int anInt7597;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
	public int anInt7600;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	public int anInt7594 = -1;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
	public int anInt7595 = -1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class102 local6 = arg1.method2223();
		local6.R(super.anInt7586, super.anInt7588, super.anInt7583);
		@Pc(31) Class32 local31 = Static350.aClass149_2.method3483(this.anInt7597).method748(null, -1, null, this.anInt7600, 0, arg1, 131072, 0);
		if (local31 != null && local31.method5671(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt7595 != -1) {
			local31 = Static350.aClass149_2.method3483(this.anInt7595).method748(null, -1, null, this.anInt7592, 0, arg1, 131072, 0);
			if (local31 != null && local31.method5671(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt7594 != -1) {
			local31 = Static350.aClass149_2.method3483(this.anInt7594).method748(null, -1, null, this.anInt7596, 0, arg1, 131072, 0);
			if (local31 != null && local31.method5671(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		@Pc(6) Class102 local6 = arg0.method2223();
		local6.R(super.anInt7586, super.anInt7588, super.anInt7583);
		@Pc(26) Class38_Sub3 local26 = Static313.method4433(3);
		@Pc(50) Class32 local50;
		if (this.anInt7594 != -1) {
			local50 = Static350.aClass149_2.method3483(this.anInt7594).method748(null, -1, null, this.anInt7596, 0, arg0, 2048, 0);
			if (local50 != null) {
				local50.method5675(local6, local26.aClass38_Sub4Array1[2], 0);
			}
		}
		if (this.anInt7595 != -1) {
			local50 = Static350.aClass149_2.method3483(this.anInt7595).method748(null, -1, null, this.anInt7592, 0, arg0, 2048, 0);
			if (local50 != null) {
				local50.method5675(local6, local26.aClass38_Sub4Array1[1], 0);
			}
		}
		local50 = Static350.aClass149_2.method3483(this.anInt7597).method748(null, -1, null, this.anInt7600, 0, arg0, 2048, 0);
		if (local50 != null) {
			local50.method5675(local6, local26.aClass38_Sub4Array1[0], 0);
		}
		return local26;
	}
}
