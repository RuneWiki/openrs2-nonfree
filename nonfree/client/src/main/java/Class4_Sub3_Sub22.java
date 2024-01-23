import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class4_Sub3_Sub22 extends Class4_Sub3 {

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	public int anInt5995 = 12800;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
	public int anInt6000 = 12800;

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "Z")
	public boolean aBoolean421 = true;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
	public int anInt6011 = 0;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
	public int anInt6006 = 0;

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
	public int anInt5999 = -1;

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
	public int anInt6010 = -1;

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "Ljava/lang/String;")
	public String aString366;

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "Ljava/lang/String;")
	public String aString365;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
	public int anInt5996;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
	public int anInt5997;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "Lclient!ll;")
	public Class114 aClass114_31;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class4_Sub3_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aString366 = arg2;
		this.aBoolean421 = arg5;
		this.aString365 = arg1;
		this.anInt5996 = arg3;
		this.anInt5997 = arg0;
		this.anInt5999 = arg4;
		this.anInt6010 = arg6;
		if (this.anInt6010 == 255) {
			this.anInt6010 = 0;
		}
		this.aClass114_31 = new Class114();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III[II)Z")
	public boolean method4790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class4_Sub7 local16 = (Class4_Sub7) this.aClass114_31.method2623(); local16 != null; local16 = (Class4_Sub7) this.aClass114_31.method2629()) {
			if (local16.method978(arg3, arg0, arg1)) {
				local16.method981(arg0, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
	public boolean method4791(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class4_Sub7 local11 = (Class4_Sub7) this.aClass114_31.method2623(); local11 != null; local11 = (Class4_Sub7) this.aClass114_31.method2629()) {
			if (local11.method980(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([IIBI)Z")
	public boolean method4792(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class4_Sub7 local19 = (Class4_Sub7) this.aClass114_31.method2623(); local19 != null; local19 = (Class4_Sub7) this.aClass114_31.method2629()) {
			if (local19.method980(arg1, arg2)) {
				local19.method981(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB[I)Z")
	public boolean method4795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class4_Sub7 local11 = (Class4_Sub7) this.aClass114_31.method2623(); local11 != null; local11 = (Class4_Sub7) this.aClass114_31.method2629()) {
			if (local11.method979(arg0, arg1)) {
				local11.method983(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	public void method4796() {
		this.anInt6000 = 12800;
		this.anInt6011 = 0;
		this.anInt6006 = 0;
		this.anInt5995 = 12800;
		for (@Pc(23) Class4_Sub7 local23 = (Class4_Sub7) this.aClass114_31.method2623(); local23 != null; local23 = (Class4_Sub7) this.aClass114_31.method2629()) {
			if (this.anInt6006 < local23.anInt1178) {
				this.anInt6006 = local23.anInt1178;
			}
			if (this.anInt5995 > local23.anInt1186) {
				this.anInt5995 = local23.anInt1186;
			}
			if (local23.anInt1176 < this.anInt6000) {
				this.anInt6000 = local23.anInt1176;
			}
			if (this.anInt6011 < local23.anInt1179) {
				this.anInt6011 = local23.anInt1179;
			}
		}
	}
}
