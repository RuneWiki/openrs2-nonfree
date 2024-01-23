import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ek", name = "G", descriptor = "Z")
	public boolean aBoolean57 = true;

	@OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
	public int anInt1125 = -1;

	@OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
	public int anInt1126 = 0;

	@OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
	public int anInt1122 = 0;

	@OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
	public int anInt1115 = 12800;

	@OriginalMember(owner = "client!ek", name = "cb", descriptor = "I")
	public int anInt1133 = 12800;

	@OriginalMember(owner = "client!ek", name = "W", descriptor = "Lclient!hh;")
	public Class50 aClass50_396;

	@OriginalMember(owner = "client!ek", name = "Z", descriptor = "Lclient!hh;")
	public Class50 aClass50_397;

	@OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
	public int anInt1123;

	@OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
	public int anInt1118;

	@OriginalMember(owner = "client!ek", name = "S", descriptor = "Lclient!mi;")
	public Class75 aClass75_6;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!hh;Lclient!hh;IIIZ)V")
	public Class1_Sub1_Sub6(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass50_396 = arg0;
		this.aClass50_397 = arg1;
		this.anInt1123 = arg3;
		this.anInt1118 = arg2;
		this.anInt1125 = arg4;
		this.aBoolean57 = arg5;
		this.aClass75_6 = new Class75();
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)Z")
	public boolean method835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1115 > arg0 || arg0 > this.anInt1122 || arg1 < this.anInt1133 || this.anInt1126 < arg1) {
			return false;
		}
		for (@Pc(36) Class1_Sub22 local36 = (Class1_Sub22) this.aClass75_6.method2239(); local36 != null; local36 = (Class1_Sub22) this.aClass75_6.method2238()) {
			if (local36.method2720(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
	public void method838() {
		this.anInt1126 = 0;
		this.anInt1115 = 12800;
		this.anInt1122 = 0;
		this.anInt1133 = 12800;
		for (@Pc(23) Class1_Sub22 local23 = (Class1_Sub22) this.aClass75_6.method2239(); local23 != null; local23 = (Class1_Sub22) this.aClass75_6.method2238()) {
			if (local23.anInt3373 < this.anInt1115) {
				this.anInt1115 = local23.anInt3373;
			}
			if (this.anInt1126 < local23.anInt3381) {
				this.anInt1126 = local23.anInt3381;
			}
			if (local23.anInt3372 > this.anInt1122) {
				this.anInt1122 = local23.anInt3372;
			}
			if (local23.anInt3379 < this.anInt1133) {
				this.anInt1133 = local23.anInt3379;
			}
		}
	}
}
