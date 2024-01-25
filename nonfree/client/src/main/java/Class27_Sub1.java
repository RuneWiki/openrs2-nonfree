import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!baa", name = "w", descriptor = "Z")
	private boolean aBoolean19 = false;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class27_Sub1(@OriginalArg(0) Class133_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8891() {
		return true;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8894(@OriginalArg(0) boolean arg0) {
		@Pc(13) Interface18 local13 = super.aClass133_Sub1_23.method6256();
		if (local13 == null || !arg0) {
			super.aClass133_Sub1_23.method6159(0, Static273.aClass236_3);
			return;
		}
		super.aClass133_Sub1_23.method6271(1);
		super.aClass133_Sub1_23.method6153(local13);
		super.aClass133_Sub1_23.method6218(Static193.aClass286_9);
		super.aClass133_Sub1_23.method6271(1);
		super.aClass133_Sub1_23.method6239(Static132.aClass151_7, Static481.aClass151_8);
		super.aClass133_Sub1_23.method6222(2, Static229.aClass236_2, false, true);
		super.aClass133_Sub1_23.method6159(0, Static273.aClass236_3);
		@Pc(64) Class113_Sub1 local64 = super.aClass133_Sub1_23.method6183();
		local64.method2465(super.aClass133_Sub1_23.method6171());
		super.aClass133_Sub1_23.method6225(Static573.aClass373_2);
		super.aClass133_Sub1_23.method6271(0);
		this.aBoolean19 = true;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IZLclient!iu;)V")
	@Override
	public void method8901(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1) {
		super.aClass133_Sub1_23.method6153(arg1);
		super.aClass133_Sub1_23.method6268(arg0);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8898(@OriginalArg(1) boolean arg0) {
		super.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static481.aClass151_8);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)V")
	@Override
	public void method8895() {
		if (this.aBoolean19) {
			super.aClass133_Sub1_23.method6271(1);
			super.aClass133_Sub1_23.method6218(Static528.aClass286_10);
			super.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static524.aClass151_11);
			super.aClass133_Sub1_23.method6211(Static105.aClass236_1, 2);
			super.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
			super.aClass133_Sub1_23.method6172();
			super.aClass133_Sub1_23.method6153(null);
			super.aClass133_Sub1_23.method6271(0);
			this.aBoolean19 = false;
		} else {
			super.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
		}
		super.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static524.aClass151_11);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)V")
	@Override
	public void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
