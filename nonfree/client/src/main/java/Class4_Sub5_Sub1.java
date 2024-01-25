import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class4_Sub5_Sub1 extends Class4_Sub5 implements Interface18 {

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Lclient!qt;")
	private Class277 aClass277_5;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "Lclient!as;")
	public final Class16 aClass16_3;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "Z")
	private final boolean aBoolean394;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!oa;Lclient!pg;IIIIIZIII)V")
	public Class4_Sub5_Sub1(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static534.method7252(arg9, arg8));
		this.aClass16_3 = new Class16(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt7597, super.anInt7599, arg7, arg10);
		this.aBoolean394 = arg1.anInt6889 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
		this.aClass16_3.method729(arg0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return this.aClass16_3.anInt672;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
		@Pc(16) Class20 local16 = this.aClass16_3.method730(262144, arg0, super.anInt7599, true, super.anInt7597, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt7597 >> 9;
		@Pc(28) int local28 = super.anInt7599 >> 9;
		@Pc(31) Class54 local31 = arg0.method6851();
		local31.GA(super.anInt7597, super.anInt7596, super.anInt7599);
		this.aClass16_3.method735(local31, false, local23, local16, local23, arg0, local28, local28);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
		this.aClass16_3.method732(arg0);
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return this.aClass16_3.method730(arg1, arg0, 0, false, 0, false);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class20 local16 = this.aClass16_3.method730(131072, arg1, super.anInt7599, false, super.anInt7597, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class54 local31 = arg1.method6851();
			local31.GA(super.anInt7597, super.anInt7596, super.anInt7599);
			return local16.method7266(arg2, arg0, local31, false);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return this.aClass16_3.anInt687;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		@Pc(18) Class20 local18 = this.aClass16_3.method730(2048, arg0, super.anInt7599, false, super.anInt7597, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class54 local25 = arg0.method6851();
		local25.GA(super.anInt7597, super.anInt7596, super.anInt7599);
		@Pc(41) Class98_Sub8 local41 = null;
		if (this.aBoolean394) {
			local41 = Static348.method5326(1);
		}
		@Pc(53) int local53 = super.anInt7597 >> 9;
		@Pc(58) int local58 = super.anInt7599 >> 9;
		this.aClass16_3.method735(local25, true, local53, local18, local53, arg0, local58, local58);
		if (this.aClass16_3.aClass98_Sub3_3 == null) {
			local18.method7256(local25, local41 == null ? null : local41.aClass98_Sub5Array1[0], 0);
		} else {
			@Pc(79) Class144 local79 = this.aClass16_3.aClass98_Sub3_3.method4532();
			arg0.method6856(local18, local79, local25, local41 == null ? null : local41.aClass98_Sub5Array1[0], 0);
		}
		if (this.aClass277_5 == null) {
			this.aClass277_5 = Static323.method5117(local18, super.anInt7599, super.anInt7596, super.anInt7597);
		} else {
			Static490.method6709(local18, super.anInt7599, super.anInt7596, this.aClass277_5, super.anInt7597);
		}
		return local41;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return this.aClass16_3.anInt682;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return this.aClass277_5;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return this.aClass16_3.method738();
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
		throw new IllegalStateException();
	}
}
