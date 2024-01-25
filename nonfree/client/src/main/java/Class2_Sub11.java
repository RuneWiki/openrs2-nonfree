import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "Z")
	private boolean aBoolean716 = false;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class2_Sub11(@OriginalArg(0) Class78_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7894(@OriginalArg(0) boolean arg0) {
		super.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static569.aClass118_4);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!rga;I)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) Interface20 arg1) {
		super.aClass78_Sub1_23.method6931(arg1);
		super.aClass78_Sub1_23.method6943(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7901(@OriginalArg(0) boolean arg0) {
		@Pc(13) Interface11 local13 = super.aClass78_Sub1_23.method6861();
		if (local13 == null || !arg0) {
			super.aClass78_Sub1_23.method6903(0, Static155.aClass148_2);
			return;
		}
		super.aClass78_Sub1_23.method6867(1);
		super.aClass78_Sub1_23.method6931(local13);
		super.aClass78_Sub1_23.method6887(Static228.aClass260_2);
		super.aClass78_Sub1_23.method6867(1);
		super.aClass78_Sub1_23.method6864(Static585.aClass118_5, Static569.aClass118_4);
		super.aClass78_Sub1_23.method6959(false, 2, true, Static226.aClass148_3);
		super.aClass78_Sub1_23.method6903(0, Static155.aClass148_2);
		@Pc(64) Class34_Sub1 local64 = super.aClass78_Sub1_23.method6922();
		local64.method908(super.aClass78_Sub1_23.method6971());
		super.aClass78_Sub1_23.method6909(Static34.aClass316_2);
		super.aClass78_Sub1_23.method6867(0);
		this.aBoolean716 = true;
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V")
	@Override
	public void method7899() {
		if (this.aBoolean716) {
			super.aClass78_Sub1_23.method6867(1);
			super.aClass78_Sub1_23.method6887(Static440.aClass260_4);
			super.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static31.aClass118_1);
			super.aClass78_Sub1_23.method6975(Static276.aClass148_4, 2);
			super.aClass78_Sub1_23.method6903(0, Static47.aClass148_1);
			super.aClass78_Sub1_23.method6920();
			super.aClass78_Sub1_23.method6931(null);
			super.aClass78_Sub1_23.method6867(0);
			this.aBoolean716 = false;
		} else {
			super.aClass78_Sub1_23.method6903(0, Static47.aClass148_1);
		}
		super.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static31.aClass118_1);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7902() {
		return true;
	}
}
