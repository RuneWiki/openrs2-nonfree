import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class14 {

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
	public int anInt303;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "Lclient!aa;")
	public Class2 aClass2_1;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
	public int anInt313;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "Z")
	public boolean aBoolean23 = false;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILclient!nn;)V")
	private void method242(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt303 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anInt313 = arg1.method2507();
		} else if (arg0 == 3) {
			this.aBoolean23 = true;
		} else if (arg0 == 4) {
			this.anInt303 = -1;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLclient!nn;)V")
	public void method246(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(20) int local20 = arg0.method2502();
			if (local20 == 0) {
				return;
			}
			this.method242(local20, arg0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BIZLclient!za;)Lclient!o;")
	public Class80 method247(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class50 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt7375 << 19 | (arg1 ? 262144 : 0) | this.anInt303 | arg0 << 16);
		@Pc(32) Class80 local32 = (Class80) this.aClass2_1.aClass267_2.method6014(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass2_1.aClass187_2.method4282(this.anInt303)) {
			@Pc(54) Class66 local54 = Static463.method1657(this.aClass2_1.aClass187_2, this.anInt303, 0);
			if (local54 != null) {
				local54.anInt1866 = local54.anInt1865 = local54.anInt1863 = local54.anInt1864 = 0;
				if (arg1) {
					local54.method1663();
				}
				for (@Pc(74) int local74 = 0; local74 < arg0; local74++) {
					local54.method1665();
				}
			}
			local32 = arg2.method5861(local54);
			if (local32 != null) {
				this.aClass2_1.aClass267_2.method6008(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)Z")
	public boolean method249() {
		return this.aClass2_1.aClass187_2.method4282(this.anInt303);
	}
}
