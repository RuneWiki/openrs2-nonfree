import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class5_Sub2_Sub18 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "I")
	public int anInt7670 = 12800;

	@OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
	public int anInt7671 = 12800;

	@OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
	public int anInt7672 = -1;

	@OriginalMember(owner = "client!ot", name = "J", descriptor = "Z")
	public boolean aBoolean563 = true;

	@OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
	public int anInt7669 = 0;

	@OriginalMember(owner = "client!ot", name = "N", descriptor = "I")
	public int anInt7678 = 0;

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
	public int anInt7667 = -1;

	@OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
	public final int anInt7675;

	@OriginalMember(owner = "client!ot", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "client!ot", name = "G", descriptor = "I")
	public final int anInt7674;

	@OriginalMember(owner = "client!ot", name = "C", descriptor = "Ljava/lang/String;")
	public final String aString75;

	@OriginalMember(owner = "client!ot", name = "B", descriptor = "Lclient!ga;")
	public final Class124 aClass124_81;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class5_Sub2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7675 = arg3;
		this.anInt7672 = arg6;
		this.anInt7667 = arg4;
		this.aString76 = arg2;
		this.aBoolean563 = arg5;
		this.anInt7674 = arg0;
		this.aString75 = arg1;
		if (this.anInt7672 == 255) {
			this.anInt7672 = 0;
		}
		this.aClass124_81 = new Class124();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)Z")
	public boolean method6511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(9) Class5_Sub22 local9 = (Class5_Sub22) this.aClass124_81.method2572(); local9 != null; local9 = (Class5_Sub22) this.aClass124_81.method2569()) {
			if (local9.method2383(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([IIII)Z")
	public boolean method6512(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class5_Sub22 local9 = (Class5_Sub22) this.aClass124_81.method2572(); local9 != null; local9 = (Class5_Sub22) this.aClass124_81.method2569()) {
			if (local9.method2381(arg1, arg2)) {
				local9.method2385(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II[IIZ)Z")
	public boolean method6514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(15) Class5_Sub22 local15 = (Class5_Sub22) this.aClass124_81.method2572(); local15 != null; local15 = (Class5_Sub22) this.aClass124_81.method2569()) {
			if (local15.method2382(arg3, arg1, arg0)) {
				local15.method2386(arg3, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(B)V")
	public void method6515() {
		this.anInt7670 = 12800;
		this.anInt7671 = 12800;
		this.anInt7678 = 0;
		this.anInt7669 = 0;
		for (@Pc(27) Class5_Sub22 local27 = (Class5_Sub22) this.aClass124_81.method2572(); local27 != null; local27 = (Class5_Sub22) this.aClass124_81.method2569()) {
			if (local27.anInt2656 < this.anInt7671) {
				this.anInt7671 = local27.anInt2656;
			}
			if (this.anInt7670 > local27.anInt2657) {
				this.anInt7670 = local27.anInt2657;
			}
			if (this.anInt7678 < local27.anInt2654) {
				this.anInt7678 = local27.anInt2654;
			}
			if (local27.anInt2658 > this.anInt7669) {
				this.anInt7669 = local27.anInt2658;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BII[I)Z")
	public boolean method6516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(14) Class5_Sub22 local14 = (Class5_Sub22) this.aClass124_81.method2572(); local14 != null; local14 = (Class5_Sub22) this.aClass124_81.method2569()) {
			if (local14.method2383(arg1, arg0)) {
				local14.method2386(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}
}
