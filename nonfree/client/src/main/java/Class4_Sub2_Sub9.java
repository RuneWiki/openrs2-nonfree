import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class4_Sub2_Sub9 extends Class4_Sub2 {

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
	public int anInt1819 = -1;

	@OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
	public int anInt1827 = 0;

	@OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
	public int anInt1828 = -1;

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
	public int anInt1830 = 0;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
	public int anInt1821 = 12800;

	@OriginalMember(owner = "client!gg", name = "P", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
	public int anInt1824 = 12800;

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
	public int anInt1820;

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
	public int anInt1817;

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!gg", name = "D", descriptor = "Lclient!an;")
	public Class10 aClass10_18;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class4_Sub2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aString54 = arg1;
		this.anInt1820 = arg0;
		this.aBoolean139 = arg5;
		this.anInt1817 = arg3;
		this.anInt1819 = arg4;
		this.anInt1828 = arg6;
		if (this.anInt1828 == 255) {
			this.anInt1828 = 0;
		}
		this.aString53 = arg2;
		this.aClass10_18 = new Class10();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)[I")
	public int[] method1414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class4_Sub21 local11 = (Class4_Sub21) this.aClass10_18.method190(); local11 != null; local11 = (Class4_Sub21) this.aClass10_18.method191()) {
			if (local11.method2520(arg2, arg1, arg0)) {
				return local11.method2515(arg2, arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)[I")
	public int[] method1415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class4_Sub21 local11 = (Class4_Sub21) this.aClass10_18.method190(); local11 != null; local11 = (Class4_Sub21) this.aClass10_18.method191()) {
			if (local11.method2518(arg0, arg1)) {
				return local11.method2515(arg0, arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V")
	public void method1418() {
		this.anInt1830 = 0;
		this.anInt1824 = 12800;
		this.anInt1821 = 12800;
		this.anInt1827 = 0;
		for (@Pc(23) Class4_Sub21 local23 = (Class4_Sub21) this.aClass10_18.method190(); local23 != null; local23 = (Class4_Sub21) this.aClass10_18.method191()) {
			if (local23.anInt3207 > this.anInt1827) {
				this.anInt1827 = local23.anInt3207;
			}
			if (this.anInt1824 > local23.anInt3209) {
				this.anInt1824 = local23.anInt3209;
			}
			if (local23.anInt3193 > this.anInt1830) {
				this.anInt1830 = local23.anInt3193;
			}
			if (local23.anInt3194 < this.anInt1821) {
				this.anInt1821 = local23.anInt3194;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Z")
	public boolean method1419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class4_Sub21 local11 = (Class4_Sub21) this.aClass10_18.method190(); local11 != null; local11 = (Class4_Sub21) this.aClass10_18.method191()) {
			if (local11.method2518(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BII)[I")
	public int[] method1420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(20) Class4_Sub21 local20 = (Class4_Sub21) this.aClass10_18.method190(); local20 != null; local20 = (Class4_Sub21) this.aClass10_18.method191()) {
			if (local20.method2512(arg0, arg1)) {
				return local20.method2510(arg1, arg0);
			}
		}
		return null;
	}
}
