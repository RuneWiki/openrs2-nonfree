import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "Z")
	public boolean aBoolean612 = true;

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
	public int anInt7068 = -1;

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
	public int anInt7067 = -1;

	@OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
	public int anInt7072 = 0;

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
	public int anInt7064 = 12800;

	@OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
	public int anInt7069 = 0;

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
	public int anInt7073 = 12800;

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
	public final int anInt7065;

	@OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
	public final int anInt7071;

	@OriginalMember(owner = "client!ng", name = "L", descriptor = "Ljava/lang/String;")
	public final String aString75;

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString74;

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "Lclient!qia;")
	public final Class276 aClass276_45;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7065 = arg3;
		this.anInt7067 = arg4;
		this.anInt7068 = arg6;
		this.anInt7071 = arg0;
		this.aString75 = arg1;
		this.aBoolean612 = arg5;
		this.aString74 = arg2;
		if (this.anInt7068 == 255) {
			this.anInt7068 = 0;
		}
		this.aClass276_45 = new Class276();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)Z")
	public boolean method5922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class3_Sub3 local11 = (Class3_Sub3) this.aClass276_45.method6907(); local11 != null; local11 = (Class3_Sub3) this.aClass276_45.method6912()) {
			if (local11.method275(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[IB)Z")
	public boolean method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(16) Class3_Sub3 local16 = (Class3_Sub3) this.aClass276_45.method6907(); local16 != null; local16 = (Class3_Sub3) this.aClass276_45.method6912()) {
			if (local16.method274(arg0, arg1)) {
				local16.method277(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ[II)Z")
	public boolean method5925(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) Class3_Sub3 local17 = (Class3_Sub3) this.aClass276_45.method6907(); local17 != null; local17 = (Class3_Sub3) this.aClass276_45.method6912()) {
			if (local17.method275(arg0, arg2)) {
				local17.method273(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([IIIII)Z")
	public boolean method5926(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) Class3_Sub3 local11 = (Class3_Sub3) this.aClass276_45.method6907(); local11 != null; local11 = (Class3_Sub3) this.aClass276_45.method6912()) {
			if (local11.method272(arg1, arg2, arg3)) {
				local11.method273(arg2, arg0, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	public void method5928() {
		this.anInt7073 = 12800;
		this.anInt7064 = 12800;
		this.anInt7069 = 0;
		this.anInt7072 = 0;
		for (@Pc(29) Class3_Sub3 local29 = (Class3_Sub3) this.aClass276_45.method6907(); local29 != null; local29 = (Class3_Sub3) this.aClass276_45.method6912()) {
			if (this.anInt7069 < local29.anInt219) {
				this.anInt7069 = local29.anInt219;
			}
			if (local29.anInt221 < this.anInt7064) {
				this.anInt7064 = local29.anInt221;
			}
			if (local29.anInt226 > this.anInt7072) {
				this.anInt7072 = local29.anInt226;
			}
			if (this.anInt7073 > local29.anInt225) {
				this.anInt7073 = local29.anInt225;
			}
		}
	}
}
