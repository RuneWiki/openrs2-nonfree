import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class2_Sub7_Sub3 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
	public int anInt2687 = -1;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
	public int anInt2682 = 12800;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
	public int anInt2692 = 0;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "Z")
	public boolean aBoolean216 = true;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
	public int anInt2693 = 0;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
	public int anInt2694 = -1;

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
	public int anInt2695 = 12800;

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
	public final int anInt2683;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
	public final int anInt2691;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString25;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString26;

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "Lclient!fh;")
	public final Class114 aClass114_15;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub7_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2683 = arg3;
		this.anInt2694 = arg6;
		this.anInt2691 = arg0;
		this.anInt2687 = arg4;
		this.aString25 = arg2;
		this.aString26 = arg1;
		this.aBoolean216 = arg5;
		if (this.anInt2694 == 255) {
			this.anInt2694 = 0;
		}
		this.aClass114_15 = new Class114();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B[III)Z")
	public boolean method2284(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) Class2_Sub6 local15 = (Class2_Sub6) this.aClass114_15.method2772(); local15 != null; local15 = (Class2_Sub6) this.aClass114_15.method2762()) {
			if (local15.method895(arg1, arg2)) {
				local15.method899(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)Z")
	public boolean method2285(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class2_Sub6 local17 = (Class2_Sub6) this.aClass114_15.method2772(); local17 != null; local17 = (Class2_Sub6) this.aClass114_15.method2762()) {
			if (local17.method896(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([IBIII)Z")
	public boolean method2287(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) Class2_Sub6 local9 = (Class2_Sub6) this.aClass114_15.method2772(); local9 != null; local9 = (Class2_Sub6) this.aClass114_15.method2762()) {
			if (local9.method898(arg2, arg3, arg1)) {
				local9.method897(arg0, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([IIIB)Z")
	public boolean method2288(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class2_Sub6 local11 = (Class2_Sub6) this.aClass114_15.method2772(); local11 != null; local11 = (Class2_Sub6) this.aClass114_15.method2762()) {
			if (local11.method896(arg1, arg2)) {
				local11.method897(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	public void method2289() {
		this.anInt2693 = 0;
		this.anInt2695 = 12800;
		this.anInt2692 = 0;
		this.anInt2682 = 12800;
		for (@Pc(21) Class2_Sub6 local21 = (Class2_Sub6) this.aClass114_15.method2772(); local21 != null; local21 = (Class2_Sub6) this.aClass114_15.method2762()) {
			if (this.anInt2692 < local21.anInt817) {
				this.anInt2692 = local21.anInt817;
			}
			if (this.anInt2693 < local21.anInt827) {
				this.anInt2693 = local21.anInt827;
			}
			if (local21.anInt824 < this.anInt2682) {
				this.anInt2682 = local21.anInt824;
			}
			if (local21.anInt818 < this.anInt2695) {
				this.anInt2695 = local21.anInt818;
			}
		}
	}
}
