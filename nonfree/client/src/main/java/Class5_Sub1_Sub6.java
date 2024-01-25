import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class5_Sub1_Sub6 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
	public int anInt1933 = -1;

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
	public int anInt1944 = 0;

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
	public int anInt1946 = 12800;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
	public int anInt1938 = -1;

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
	public int anInt1945 = 0;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
	public int anInt1931 = 12800;

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "Z")
	public boolean aBoolean143 = true;

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
	public final int anInt1935;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	public final int anInt1947;

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "Ljava/lang/String;")
	public final String aString12;

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "Lclient!jm;")
	public final Class103 aClass103_49;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class5_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aBoolean143 = arg5;
		this.anInt1938 = arg6;
		this.anInt1935 = arg3;
		this.aString11 = arg2;
		this.anInt1933 = arg4;
		this.anInt1947 = arg0;
		this.aString12 = arg1;
		if (this.anInt1938 == 255) {
			this.anInt1938 = 0;
		}
		this.aClass103_49 = new Class103();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
	public boolean method1826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) Class5_Sub35 local9 = (Class5_Sub35) this.aClass103_49.method2756(); local9 != null; local9 = (Class5_Sub35) this.aClass103_49.method2748()) {
			if (local9.method4874(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[IB)Z")
	public boolean method1829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(9) Class5_Sub35 local9 = (Class5_Sub35) this.aClass103_49.method2756(); local9 != null; local9 = (Class5_Sub35) this.aClass103_49.method2748()) {
			if (local9.method4876(arg2, arg0, arg1)) {
				local9.method4878(arg2, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIZI)Z")
	public boolean method1830(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class5_Sub35 local9 = (Class5_Sub35) this.aClass103_49.method2756(); local9 != null; local9 = (Class5_Sub35) this.aClass103_49.method2748()) {
			if (local9.method4871(arg1, arg2)) {
				local9.method4873(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
	public void method1831() {
		this.anInt1946 = 12800;
		this.anInt1944 = 0;
		this.anInt1945 = 0;
		this.anInt1931 = 12800;
		for (@Pc(31) Class5_Sub35 local31 = (Class5_Sub35) this.aClass103_49.method2756(); local31 != null; local31 = (Class5_Sub35) this.aClass103_49.method2748()) {
			if (local31.anInt5507 < this.anInt1931) {
				this.anInt1931 = local31.anInt5507;
			}
			if (local31.anInt5525 < this.anInt1946) {
				this.anInt1946 = local31.anInt5525;
			}
			if (local31.anInt5522 > this.anInt1945) {
				this.anInt1945 = local31.anInt5522;
			}
			if (local31.anInt5505 > this.anInt1944) {
				this.anInt1944 = local31.anInt5505;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI[II)Z")
	public boolean method1835(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class5_Sub35 local9 = (Class5_Sub35) this.aClass103_49.method2756(); local9 != null; local9 = (Class5_Sub35) this.aClass103_49.method2748()) {
			if (local9.method4874(arg2, arg0)) {
				local9.method4878(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}
}
