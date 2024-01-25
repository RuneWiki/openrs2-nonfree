import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class2_Sub11_Sub6 extends Class2_Sub11 {

	@OriginalMember(owner = "client!gq", name = "Q", descriptor = "I")
	public int anInt2444 = 0;

	@OriginalMember(owner = "client!gq", name = "N", descriptor = "I")
	public int anInt2441 = 12800;

	@OriginalMember(owner = "client!gq", name = "F", descriptor = "Z")
	public boolean aBoolean213 = true;

	@OriginalMember(owner = "client!gq", name = "S", descriptor = "I")
	public int anInt2446 = 12800;

	@OriginalMember(owner = "client!gq", name = "P", descriptor = "I")
	public int anInt2443 = 0;

	@OriginalMember(owner = "client!gq", name = "L", descriptor = "I")
	public int anInt2439 = -1;

	@OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
	public int anInt2435 = -1;

	@OriginalMember(owner = "client!gq", name = "R", descriptor = "I")
	public final int anInt2445;

	@OriginalMember(owner = "client!gq", name = "V", descriptor = "I")
	public final int anInt2448;

	@OriginalMember(owner = "client!gq", name = "T", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString22;

	@OriginalMember(owner = "client!gq", name = "W", descriptor = "Lclient!wq;")
	public final Class216 aClass216_23;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub11_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2445 = arg3;
		this.anInt2439 = arg6;
		this.anInt2435 = arg4;
		this.anInt2448 = arg0;
		this.aString23 = arg1;
		this.aBoolean213 = arg5;
		this.aString22 = arg2;
		if (this.anInt2439 == 255) {
			this.anInt2439 = 0;
		}
		this.aClass216_23 = new Class216();
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
	public void method2385() {
		this.anInt2446 = 12800;
		this.anInt2441 = 12800;
		this.anInt2444 = 0;
		this.anInt2443 = 0;
		for (@Pc(28) Class2_Sub28 local28 = (Class2_Sub28) this.aClass216_23.method5992(); local28 != null; local28 = (Class2_Sub28) this.aClass216_23.method6000()) {
			if (this.anInt2441 > local28.anInt3827) {
				this.anInt2441 = local28.anInt3827;
			}
			if (this.anInt2446 > local28.anInt3839) {
				this.anInt2446 = local28.anInt3839;
			}
			if (local28.anInt3838 > this.anInt2443) {
				this.anInt2443 = local28.anInt3838;
			}
			if (local28.anInt3831 > this.anInt2444) {
				this.anInt2444 = local28.anInt3831;
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(III)Z")
	public boolean method2386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class2_Sub28 local17 = (Class2_Sub28) this.aClass216_23.method5992(); local17 != null; local17 = (Class2_Sub28) this.aClass216_23.method6000()) {
			if (local17.method3525(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIII[I)Z")
	public boolean method2389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) Class2_Sub28 local11 = (Class2_Sub28) this.aClass216_23.method5992(); local11 != null; local11 = (Class2_Sub28) this.aClass216_23.method6000()) {
			if (local11.method3535(arg2, arg1, arg0)) {
				local11.method3526(arg3, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[III)Z")
	public boolean method2390(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class2_Sub28 local16 = (Class2_Sub28) this.aClass216_23.method5992(); local16 != null; local16 = (Class2_Sub28) this.aClass216_23.method6000()) {
			if (local16.method3525(arg0, arg2)) {
				local16.method3526(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI[II)Z")
	public boolean method2392(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub28 local11 = (Class2_Sub28) this.aClass216_23.method5992(); local11 != null; local11 = (Class2_Sub28) this.aClass216_23.method6000()) {
			if (local11.method3530(arg0, arg2)) {
				local11.method3532(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
