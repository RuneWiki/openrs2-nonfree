import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
	public int anInt3475 = 12800;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	public int anInt3479 = 12800;

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
	public int anInt3474 = -1;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
	public int anInt3486 = 0;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "Z")
	public boolean aBoolean258 = true;

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
	public int anInt3487 = -1;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
	public int anInt3476 = 0;

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "Ljava/lang/String;")
	public String aString118;

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
	public int anInt3485;

	@OriginalMember(owner = "client!oc", name = "db", descriptor = "Ljava/lang/String;")
	public String aString119;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
	public int anInt3483;

	@OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lclient!hh;")
	public Class69 aClass69_21;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class1_Sub2_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aString118 = arg1;
		this.aBoolean258 = arg5;
		this.anInt3487 = arg6;
		this.anInt3485 = arg0;
		this.aString119 = arg2;
		this.anInt3483 = arg3;
		if (this.anInt3487 == 255) {
			this.anInt3487 = 0;
		}
		this.anInt3474 = arg4;
		this.aClass69_21 = new Class69();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BII)[I")
	public int[] method2807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class1_Sub23 local11 = (Class1_Sub23) this.aClass69_21.method1636(); local11 != null; local11 = (Class1_Sub23) this.aClass69_21.method1631()) {
			if (local11.method3143(arg1, arg0)) {
				return local11.method3139(arg0, arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V")
	public void method2809() {
		this.anInt3476 = 0;
		this.anInt3475 = 12800;
		this.anInt3486 = 0;
		this.anInt3479 = 12800;
		for (@Pc(31) Class1_Sub23 local31 = (Class1_Sub23) this.aClass69_21.method1636(); local31 != null; local31 = (Class1_Sub23) this.aClass69_21.method1631()) {
			if (this.anInt3476 < local31.anInt3987) {
				this.anInt3476 = local31.anInt3987;
			}
			if (local31.anInt3983 > this.anInt3486) {
				this.anInt3486 = local31.anInt3983;
			}
			if (this.anInt3475 > local31.anInt3980) {
				this.anInt3475 = local31.anInt3980;
			}
			if (local31.anInt3968 < this.anInt3479) {
				this.anInt3479 = local31.anInt3968;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Z")
	public boolean method2811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(16) Class1_Sub23 local16 = (Class1_Sub23) this.aClass69_21.method1636(); local16 != null; local16 = (Class1_Sub23) this.aClass69_21.method1631()) {
			if (local16.method3143(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(BII)[I")
	public int[] method2812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(19) Class1_Sub23 local19 = (Class1_Sub23) this.aClass69_21.method1636(); local19 != null; local19 = (Class1_Sub23) this.aClass69_21.method1631()) {
			if (local19.method3147(arg1, arg0)) {
				return local19.method3144(arg1, arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBII)[I")
	public int[] method2813(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class1_Sub23 local11 = (Class1_Sub23) this.aClass69_21.method1636(); local11 != null; local11 = (Class1_Sub23) this.aClass69_21.method1631()) {
			if (local11.method3146(arg2, arg1, arg0)) {
				return local11.method3139(arg0, arg2);
			}
		}
		return null;
	}
}
