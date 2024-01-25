import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class4_Sub2_Sub11 extends Class4_Sub2 {

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "[Lclient!um;")
	public static final Class248[] aClass248Array1 = new Class248[5];

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "Z")
	public boolean aBoolean282 = true;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
	public int anInt3796 = -1;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
	public int anInt3794 = 0;

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
	public int anInt3802 = 12800;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
	public int anInt3799 = -1;

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
	public int anInt3803 = 0;

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
	public int anInt3804 = 12800;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString32;

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
	public final int anInt3801;

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "Ljava/lang/String;")
	public final String aString33;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
	public final int anInt3793;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "Lclient!ub;")
	public final Class244 aClass244_17;

	static {
		for (@Pc(24) int local24 = 0; local24 < aClass248Array1.length; local24++) {
			aClass248Array1[local24] = new Class248();
		}
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class4_Sub2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString32 = arg2;
		this.anInt3801 = arg3;
		this.anInt3799 = arg4;
		this.aString33 = arg1;
		this.anInt3796 = arg6;
		this.anInt3793 = arg0;
		this.aBoolean282 = arg5;
		if (this.anInt3796 == 255) {
			this.anInt3796 = 0;
		}
		this.aClass244_17 = new Class244();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[IBI)Z")
	public boolean method3006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class4_Sub10 local11 = (Class4_Sub10) this.aClass244_17.method5263(); local11 != null; local11 = (Class4_Sub10) this.aClass244_17.method5271()) {
			if (local11.method1221(arg0, arg1, arg3)) {
				local11.method1220(arg0, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB[II)Z")
	public boolean method3008(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class4_Sub10 local16 = (Class4_Sub10) this.aClass244_17.method5263(); local16 != null; local16 = (Class4_Sub10) this.aClass244_17.method5271()) {
			if (local16.method1222(arg2, arg0)) {
				local16.method1226(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([IIZI)Z")
	public boolean method3009(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class4_Sub10 local11 = (Class4_Sub10) this.aClass244_17.method5263(); local11 != null; local11 = (Class4_Sub10) this.aClass244_17.method5271()) {
			if (local11.method1225(arg1, arg2)) {
				local11.method1220(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
	public boolean method3012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(22) Class4_Sub10 local22 = (Class4_Sub10) this.aClass244_17.method5263(); local22 != null; local22 = (Class4_Sub10) this.aClass244_17.method5271()) {
			if (local22.method1225(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
	public void method3013() {
		this.anInt3802 = 12800;
		this.anInt3804 = 12800;
		this.anInt3803 = 0;
		this.anInt3794 = 0;
		for (@Pc(33) Class4_Sub10 local33 = (Class4_Sub10) this.aClass244_17.method5263(); local33 != null; local33 = (Class4_Sub10) this.aClass244_17.method5271()) {
			if (this.anInt3804 > local33.anInt1492) {
				this.anInt3804 = local33.anInt1492;
			}
			if (local33.anInt1484 < this.anInt3802) {
				this.anInt3802 = local33.anInt1484;
			}
			if (this.anInt3794 < local33.anInt1494) {
				this.anInt3794 = local33.anInt1494;
			}
			if (local33.anInt1485 > this.anInt3803) {
				this.anInt3803 = local33.anInt1485;
			}
		}
	}
}
