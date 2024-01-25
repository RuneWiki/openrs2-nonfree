import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class4_Sub5_Sub8 extends Class4_Sub5 {

	@OriginalMember(owner = "client!hw", name = "J", descriptor = "[I")
	public static final int[] anIntArray186 = new int[128];

	@OriginalMember(owner = "client!hw", name = "B", descriptor = "I")
	public int anInt3846 = 0;

	@OriginalMember(owner = "client!hw", name = "A", descriptor = "Z")
	public boolean aBoolean297 = true;

	@OriginalMember(owner = "client!hw", name = "L", descriptor = "I")
	public int anInt3854 = 12800;

	@OriginalMember(owner = "client!hw", name = "G", descriptor = "I")
	public int anInt3851 = -1;

	@OriginalMember(owner = "client!hw", name = "I", descriptor = "I")
	public int anInt3852 = 0;

	@OriginalMember(owner = "client!hw", name = "C", descriptor = "I")
	public int anInt3847 = 12800;

	@OriginalMember(owner = "client!hw", name = "P", descriptor = "I")
	public int anInt3858 = -1;

	@OriginalMember(owner = "client!hw", name = "N", descriptor = "I")
	public final int anInt3856;

	@OriginalMember(owner = "client!hw", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString34;

	@OriginalMember(owner = "client!hw", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString35;

	@OriginalMember(owner = "client!hw", name = "E", descriptor = "I")
	public final int anInt3849;

	@OriginalMember(owner = "client!hw", name = "w", descriptor = "Lclient!oe;")
	public final Class244 aClass244_27;

	static {
		for (@Pc(6) int local6 = 0; local6 < anIntArray186.length; local6++) {
			anIntArray186[local6] = -1;
		}
		for (@Pc(18) int local18 = 65; local18 <= 90; local18++) {
			anIntArray186[local18] = local18 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray186[local33] = local33 + 26 - 97;
		}
		for (@Pc(48) int local48 = 48; local48 <= 57; local48++) {
			anIntArray186[local48] = local48 + 52 - 48;
		}
		anIntArray186[45] = anIntArray186[47] = 63;
		anIntArray186[42] = anIntArray186[43] = 62;
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class4_Sub5_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aBoolean297 = arg5;
		this.anInt3851 = arg4;
		this.anInt3858 = arg6;
		this.anInt3856 = arg0;
		this.aString34 = arg2;
		this.aString35 = arg1;
		this.anInt3849 = arg3;
		if (this.anInt3858 == 255) {
			this.anInt3858 = 0;
		}
		this.aClass244_27 = new Class244();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIII[I)Z")
	public boolean method3437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) Class4_Sub27 local11 = (Class4_Sub27) this.aClass244_27.method5963(); local11 != null; local11 = (Class4_Sub27) this.aClass244_27.method5965()) {
			if (local11.method5156(arg1, arg2, arg0)) {
				local11.method5159(arg0, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "(I)V")
	public void method3438() {
		this.anInt3847 = 12800;
		this.anInt3854 = 12800;
		this.anInt3846 = 0;
		this.anInt3852 = 0;
		for (@Pc(28) Class4_Sub27 local28 = (Class4_Sub27) this.aClass244_27.method5963(); local28 != null; local28 = (Class4_Sub27) this.aClass244_27.method5965()) {
			if (local28.anInt6060 > this.anInt3852) {
				this.anInt3852 = local28.anInt6060;
			}
			if (local28.anInt6059 > this.anInt3846) {
				this.anInt3846 = local28.anInt6059;
			}
			if (local28.anInt6055 < this.anInt3847) {
				this.anInt3847 = local28.anInt6055;
			}
			if (this.anInt3854 > local28.anInt6050) {
				this.anInt3854 = local28.anInt6050;
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BI[II)Z")
	public boolean method3441(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class4_Sub27 local11 = (Class4_Sub27) this.aClass244_27.method5963(); local11 != null; local11 = (Class4_Sub27) this.aClass244_27.method5965()) {
			if (local11.method5160(arg0, arg2)) {
				local11.method5158(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBI)Z")
	public boolean method3442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class4_Sub27 local16 = (Class4_Sub27) this.aClass244_27.method5963(); local16 != null; local16 = (Class4_Sub27) this.aClass244_27.method5965()) {
			if (local16.method5157(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "([IIII)Z")
	public boolean method3444(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) Class4_Sub27 local17 = (Class4_Sub27) this.aClass244_27.method5963(); local17 != null; local17 = (Class4_Sub27) this.aClass244_27.method5965()) {
			if (local17.method5157(arg2, arg1)) {
				local17.method5159(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}
}
