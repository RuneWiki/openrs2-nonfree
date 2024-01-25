import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class4_Sub1_Sub11 extends Class4_Sub1 {

	@OriginalMember(owner = "client!in", name = "E", descriptor = "I")
	public int anInt3047 = 0;

	@OriginalMember(owner = "client!in", name = "F", descriptor = "Z")
	public boolean aBoolean257 = true;

	@OriginalMember(owner = "client!in", name = "J", descriptor = "I")
	public int anInt3051 = 12800;

	@OriginalMember(owner = "client!in", name = "G", descriptor = "I")
	public int anInt3048 = 12800;

	@OriginalMember(owner = "client!in", name = "y", descriptor = "I")
	public int anInt3043 = -1;

	@OriginalMember(owner = "client!in", name = "L", descriptor = "I")
	public int anInt3053 = 0;

	@OriginalMember(owner = "client!in", name = "R", descriptor = "I")
	public int anInt3057 = -1;

	@OriginalMember(owner = "client!in", name = "K", descriptor = "I")
	public final int anInt3052;

	@OriginalMember(owner = "client!in", name = "C", descriptor = "Ljava/lang/String;")
	public final String aString102;

	@OriginalMember(owner = "client!in", name = "A", descriptor = "I")
	public final int anInt3045;

	@OriginalMember(owner = "client!in", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString101;

	@OriginalMember(owner = "client!in", name = "D", descriptor = "Lclient!mk;")
	public final Class130 aClass130_62;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class4_Sub1_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt3052 = arg0;
		this.aBoolean257 = arg5;
		this.aString102 = arg1;
		this.anInt3043 = arg6;
		this.anInt3045 = arg3;
		this.aString101 = arg2;
		this.anInt3057 = arg4;
		if (this.anInt3043 == 255) {
			this.anInt3043 = 0;
		}
		this.aClass130_62 = new Class130();
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
	public void method2688() {
		this.anInt3051 = 12800;
		this.anInt3047 = 0;
		this.anInt3048 = 12800;
		this.anInt3053 = 0;
		for (@Pc(23) Class4_Sub27 local23 = (Class4_Sub27) this.aClass130_62.method3499(); local23 != null; local23 = (Class4_Sub27) this.aClass130_62.method3512()) {
			if (local23.anInt4043 > this.anInt3053) {
				this.anInt3053 = local23.anInt4043;
			}
			if (local23.anInt4035 > this.anInt3047) {
				this.anInt3047 = local23.anInt4035;
			}
			if (this.anInt3051 > local23.anInt4029) {
				this.anInt3051 = local23.anInt4029;
			}
			if (local23.anInt4028 < this.anInt3048) {
				this.anInt3048 = local23.anInt4028;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III[I)Z")
	public boolean method2689(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(17) Class4_Sub27 local17 = (Class4_Sub27) this.aClass130_62.method3499(); local17 != null; local17 = (Class4_Sub27) this.aClass130_62.method3512()) {
			if (local17.method3406(arg1, arg0)) {
				local17.method3405(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "([IIZII)Z")
	public boolean method2691(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class4_Sub27 local11 = (Class4_Sub27) this.aClass130_62.method3499(); local11 != null; local11 = (Class4_Sub27) this.aClass130_62.method3512()) {
			if (local11.method3403(arg3, arg2, arg1)) {
				local11.method3409(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "([IIIZ)Z")
	public boolean method2692(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(21) Class4_Sub27 local21 = (Class4_Sub27) this.aClass130_62.method3499(); local21 != null; local21 = (Class4_Sub27) this.aClass130_62.method3512()) {
			if (local21.method3404(arg2, arg1)) {
				local21.method3409(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Z")
	public boolean method2693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class4_Sub27 local11 = (Class4_Sub27) this.aClass130_62.method3499(); local11 != null; local11 = (Class4_Sub27) this.aClass130_62.method3512()) {
			if (local11.method3404(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}
}
