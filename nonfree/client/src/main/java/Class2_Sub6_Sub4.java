import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class2_Sub6_Sub4 extends Class2_Sub6 {

	@OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
	public int anInt2715 = -1;

	@OriginalMember(owner = "client!dfa", name = "N", descriptor = "Z")
	public boolean aBoolean222 = true;

	@OriginalMember(owner = "client!dfa", name = "B", descriptor = "I")
	public int anInt2710 = 0;

	@OriginalMember(owner = "client!dfa", name = "F", descriptor = "I")
	public int anInt2713 = -1;

	@OriginalMember(owner = "client!dfa", name = "S", descriptor = "I")
	public int anInt2722 = 12800;

	@OriginalMember(owner = "client!dfa", name = "J", descriptor = "I")
	public int anInt2716 = 0;

	@OriginalMember(owner = "client!dfa", name = "T", descriptor = "I")
	public int anInt2723 = 12800;

	@OriginalMember(owner = "client!dfa", name = "O", descriptor = "I")
	public final int anInt2720;

	@OriginalMember(owner = "client!dfa", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString22;

	@OriginalMember(owner = "client!dfa", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!dfa", name = "C", descriptor = "I")
	public final int anInt2711;

	@OriginalMember(owner = "client!dfa", name = "D", descriptor = "Lclient!uh;")
	public final Class341 aClass341_27;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub6_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2713 = arg6;
		this.anInt2720 = arg3;
		this.aString22 = arg1;
		this.aString23 = arg2;
		this.anInt2715 = arg4;
		this.anInt2711 = arg0;
		this.aBoolean222 = arg5;
		if (this.anInt2713 == 255) {
			this.anInt2713 = 0;
		}
		this.aClass341_27 = new Class341();
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "([IIIIB)Z")
	public boolean method2556(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) Class2_Sub28 local11 = (Class2_Sub28) this.aClass341_27.method8524(); local11 != null; local11 = (Class2_Sub28) this.aClass341_27.method8519()) {
			if (local11.method4781(arg2, arg1, arg3)) {
				local11.method4786(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BII)Z")
	public boolean method2558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(19) Class2_Sub28 local19 = (Class2_Sub28) this.aClass341_27.method8524(); local19 != null; local19 = (Class2_Sub28) this.aClass341_27.method8519()) {
			if (local19.method4780(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZII[I)Z")
	public boolean method2559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(20) Class2_Sub28 local20 = (Class2_Sub28) this.aClass341_27.method8524(); local20 != null; local20 = (Class2_Sub28) this.aClass341_27.method8519()) {
			if (local20.method4785(arg1, arg0)) {
				local20.method4783(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "(B)V")
	public void method2560() {
		this.anInt2722 = 12800;
		this.anInt2723 = 12800;
		this.anInt2710 = 0;
		this.anInt2716 = 0;
		for (@Pc(32) Class2_Sub28 local32 = (Class2_Sub28) this.aClass341_27.method8524(); local32 != null; local32 = (Class2_Sub28) this.aClass341_27.method8519()) {
			if (local32.anInt5562 < this.anInt2722) {
				this.anInt2722 = local32.anInt5562;
			}
			if (this.anInt2710 < local32.anInt5563) {
				this.anInt2710 = local32.anInt5563;
			}
			if (this.anInt2716 < local32.anInt5568) {
				this.anInt2716 = local32.anInt5568;
			}
			if (this.anInt2723 > local32.anInt5559) {
				this.anInt2723 = local32.anInt5559;
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "([IIII)Z")
	public boolean method2562(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub28 local11 = (Class2_Sub28) this.aClass341_27.method8524(); local11 != null; local11 = (Class2_Sub28) this.aClass341_27.method8519()) {
			if (local11.method4780(arg2, arg1)) {
				local11.method4786(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}
}
