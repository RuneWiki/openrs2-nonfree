import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cu", name = "D", descriptor = "I")
	public int anInt1084 = -1;

	@OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
	public int anInt1085 = -1;

	@OriginalMember(owner = "client!cu", name = "O", descriptor = "I")
	public int anInt1093 = 12800;

	@OriginalMember(owner = "client!cu", name = "B", descriptor = "Z")
	public boolean aBoolean94 = true;

	@OriginalMember(owner = "client!cu", name = "M", descriptor = "I")
	public int anInt1091 = 0;

	@OriginalMember(owner = "client!cu", name = "L", descriptor = "I")
	public int anInt1090 = 0;

	@OriginalMember(owner = "client!cu", name = "N", descriptor = "I")
	public int anInt1092 = 12800;

	@OriginalMember(owner = "client!cu", name = "I", descriptor = "Ljava/lang/String;")
	public final String aString22;

	@OriginalMember(owner = "client!cu", name = "S", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
	public final int anInt1087;

	@OriginalMember(owner = "client!cu", name = "A", descriptor = "I")
	public final int anInt1082;

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "Lclient!ko;")
	public final Class142 aClass142_10;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString22 = arg1;
		this.aString23 = arg2;
		this.anInt1087 = arg0;
		this.anInt1085 = arg6;
		this.anInt1084 = arg4;
		this.aBoolean94 = arg5;
		this.anInt1082 = arg3;
		if (this.anInt1085 == 255) {
			this.anInt1085 = 0;
		}
		this.aClass142_10 = new Class142();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZII)Z")
	public boolean method913(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class1_Sub11 local17 = (Class1_Sub11) this.aClass142_10.method3199(); local17 != null; local17 = (Class1_Sub11) this.aClass142_10.method3198()) {
			if (local17.method1021(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIZI[I)Z")
	public boolean method914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(17) Class1_Sub11 local17 = (Class1_Sub11) this.aClass142_10.method3199(); local17 != null; local17 = (Class1_Sub11) this.aClass142_10.method3198()) {
			if (local17.method1022(arg2, arg1, arg0)) {
				local17.method1023(arg1, arg3, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II[II)Z")
	public boolean method915(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class1_Sub11 local16 = (Class1_Sub11) this.aClass142_10.method3199(); local16 != null; local16 = (Class1_Sub11) this.aClass142_10.method3198()) {
			if (local16.method1021(arg2, arg0)) {
				local16.method1023(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "(I)V")
	public void method916() {
		this.anInt1093 = 12800;
		this.anInt1091 = 0;
		this.anInt1092 = 12800;
		this.anInt1090 = 0;
		for (@Pc(31) Class1_Sub11 local31 = (Class1_Sub11) this.aClass142_10.method3199(); local31 != null; local31 = (Class1_Sub11) this.aClass142_10.method3198()) {
			if (this.anInt1090 < local31.anInt1278) {
				this.anInt1090 = local31.anInt1278;
			}
			if (this.anInt1092 > local31.anInt1275) {
				this.anInt1092 = local31.anInt1275;
			}
			if (this.anInt1093 > local31.anInt1272) {
				this.anInt1093 = local31.anInt1272;
			}
			if (this.anInt1091 < local31.anInt1273) {
				this.anInt1091 = local31.anInt1273;
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[III)Z")
	public boolean method918(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(16) Class1_Sub11 local16 = (Class1_Sub11) this.aClass142_10.method3199(); local16 != null; local16 = (Class1_Sub11) this.aClass142_10.method3198()) {
			if (local16.method1020(arg0, arg2)) {
				local16.method1019(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
