import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
	public int anInt3967 = 0;

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
	public int anInt3975 = 12800;

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
	public int anInt3981 = 0;

	@OriginalMember(owner = "client!nc", name = "Z", descriptor = "Z")
	public boolean aBoolean250 = true;

	@OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
	public int anInt3977 = -1;

	@OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
	public int anInt3984 = 12800;

	@OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
	public int anInt3985 = -1;

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
	public int anInt3974;

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
	public int anInt3969;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "Ljava/lang/String;")
	public String aString267;

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "Ljava/lang/String;")
	public String aString265;

	@OriginalMember(owner = "client!nc", name = "Y", descriptor = "Lclient!ci;")
	public Class26 aClass26_37;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class1_Sub3_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt3974 = arg0;
		this.anInt3969 = arg3;
		this.anInt3977 = arg4;
		this.aString267 = arg1;
		this.aString265 = arg2;
		this.aBoolean250 = arg5;
		this.anInt3985 = arg6;
		if (this.anInt3985 == 255) {
			this.anInt3985 = 0;
		}
		this.aClass26_37 = new Class26();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[III)Z")
	public boolean method2926(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class1_Sub9 local11 = (Class1_Sub9) this.aClass26_37.method666(); local11 != null; local11 = (Class1_Sub9) this.aClass26_37.method672()) {
			if (local11.method1269(arg3, arg0, arg2)) {
				local11.method1268(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B[III)Z")
	public boolean method2927(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class1_Sub9 local11 = (Class1_Sub9) this.aClass26_37.method666(); local11 != null; local11 = (Class1_Sub9) this.aClass26_37.method672()) {
			if (local11.method1265(arg2, arg1)) {
				local11.method1270(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([IIII)Z")
	public boolean method2928(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class1_Sub9 local11 = (Class1_Sub9) this.aClass26_37.method666(); local11 != null; local11 = (Class1_Sub9) this.aClass26_37.method672()) {
			if (local11.method1266(arg1, arg2)) {
				local11.method1268(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)Z")
	public boolean method2929(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class1_Sub9 local16 = (Class1_Sub9) this.aClass26_37.method666(); local16 != null; local16 = (Class1_Sub9) this.aClass26_37.method672()) {
			if (local16.method1266(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
	public void method2930() {
		this.anInt3967 = 0;
		this.anInt3981 = 0;
		this.anInt3975 = 12800;
		this.anInt3984 = 12800;
		for (@Pc(27) Class1_Sub9 local27 = (Class1_Sub9) this.aClass26_37.method666(); local27 != null; local27 = (Class1_Sub9) this.aClass26_37.method672()) {
			if (this.anInt3981 < local27.anInt1693) {
				this.anInt3981 = local27.anInt1693;
			}
			if (this.anInt3967 < local27.anInt1698) {
				this.anInt3967 = local27.anInt1698;
			}
			if (this.anInt3975 > local27.anInt1702) {
				this.anInt3975 = local27.anInt1702;
			}
			if (local27.anInt1695 < this.anInt3984) {
				this.anInt3984 = local27.anInt1695;
			}
		}
	}
}
