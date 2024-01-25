import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class7_Sub1_Sub10 extends Class7_Sub1 {

	@OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
	public int anInt2516 = -1;

	@OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
	public int anInt2517 = 0;

	@OriginalMember(owner = "client!gs", name = "G", descriptor = "I")
	public int anInt2512 = 12800;

	@OriginalMember(owner = "client!gs", name = "R", descriptor = "I")
	public int anInt2519 = 12800;

	@OriginalMember(owner = "client!gs", name = "V", descriptor = "Z")
	public boolean aBoolean173 = true;

	@OriginalMember(owner = "client!gs", name = "U", descriptor = "I")
	public int anInt2521 = 0;

	@OriginalMember(owner = "client!gs", name = "Z", descriptor = "I")
	public int anInt2525 = -1;

	@OriginalMember(owner = "client!gs", name = "J", descriptor = "I")
	public final int anInt2515;

	@OriginalMember(owner = "client!gs", name = "N", descriptor = "Ljava/lang/String;")
	public final String aString173;

	@OriginalMember(owner = "client!gs", name = "O", descriptor = "Ljava/lang/String;")
	public final String aString174;

	@OriginalMember(owner = "client!gs", name = "T", descriptor = "I")
	public final int anInt2520;

	@OriginalMember(owner = "client!gs", name = "M", descriptor = "Lclient!fi;")
	public final Class74 aClass74_10;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class7_Sub1_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt2515 = arg0;
		this.aString173 = arg2;
		this.anInt2525 = arg6;
		this.aString174 = arg1;
		this.anInt2516 = arg4;
		this.aBoolean173 = arg5;
		this.anInt2520 = arg3;
		if (this.anInt2525 == 255) {
			this.anInt2525 = 0;
		}
		this.aClass74_10 = new Class74();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([IIIII)Z")
	public boolean method2128(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) Class7_Sub13 local9 = (Class7_Sub13) this.aClass74_10.method1793(); local9 != null; local9 = (Class7_Sub13) this.aClass74_10.method1798()) {
			if (local9.method2561(arg1, arg3, arg2)) {
				local9.method2566(arg3, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Z")
	public boolean method2129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(9) Class7_Sub13 local9 = (Class7_Sub13) this.aClass74_10.method1793(); local9 != null; local9 = (Class7_Sub13) this.aClass74_10.method1798()) {
			if (local9.method2562(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II[II)Z")
	public boolean method2131(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) Class7_Sub13 local15 = (Class7_Sub13) this.aClass74_10.method1793(); local15 != null; local15 = (Class7_Sub13) this.aClass74_10.method1798()) {
			if (local15.method2562(arg0, arg2)) {
				local15.method2566(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V")
	public void method2133() {
		this.anInt2519 = 12800;
		this.anInt2521 = 0;
		this.anInt2512 = 12800;
		this.anInt2517 = 0;
		for (@Pc(25) Class7_Sub13 local25 = (Class7_Sub13) this.aClass74_10.method1793(); local25 != null; local25 = (Class7_Sub13) this.aClass74_10.method1798()) {
			if (this.anInt2512 > local25.anInt2733) {
				this.anInt2512 = local25.anInt2733;
			}
			if (this.anInt2517 < local25.anInt2743) {
				this.anInt2517 = local25.anInt2743;
			}
			if (this.anInt2519 > local25.anInt2737) {
				this.anInt2519 = local25.anInt2737;
			}
			if (local25.anInt2745 > this.anInt2521) {
				this.anInt2521 = local25.anInt2745;
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([IIIB)Z")
	public boolean method2135(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(17) Class7_Sub13 local17 = (Class7_Sub13) this.aClass74_10.method1793(); local17 != null; local17 = (Class7_Sub13) this.aClass74_10.method1798()) {
			if (local17.method2564(arg1, arg2)) {
				local17.method2563(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
