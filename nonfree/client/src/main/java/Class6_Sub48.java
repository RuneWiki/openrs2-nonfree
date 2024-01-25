import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class Class6_Sub48 extends Class6 {

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "Z")
	protected boolean aBoolean675;

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "Z")
	public boolean aBoolean678;

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "Z")
	protected boolean aBoolean683;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	public int anInt8988 = 2;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
	public int anInt8991 = 127;

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
	protected int anInt8994 = 0;

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "Z")
	public boolean aBoolean676 = false;

	@OriginalMember(owner = "client!vm", name = "w", descriptor = "Z")
	public boolean aBoolean677 = true;

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
	public int anInt8997 = 127;

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
	public int anInt9002 = 0;

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
	public int anInt8993 = 127;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
	public int anInt8995 = 3;

	@OriginalMember(owner = "client!vm", name = "D", descriptor = "Z")
	public boolean aBoolean680 = true;

	@OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
	public int anInt9001 = 0;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	public int anInt8989 = 0;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "Z")
	public boolean aBoolean674 = true;

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
	public int anInt8996 = 2;

	@OriginalMember(owner = "client!vm", name = "H", descriptor = "Z")
	public boolean aBoolean682 = false;

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "I")
	public int anInt9005 = 127;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
	protected int anInt8992 = 0;

	@OriginalMember(owner = "client!vm", name = "N", descriptor = "Z")
	public boolean aBoolean684 = true;

	@OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
	public int anInt9006 = 0;

	@OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
	public int anInt9008 = 0;

	@OriginalMember(owner = "client!vm", name = "Q", descriptor = "Z")
	public boolean aBoolean685 = true;

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
	public int anInt9003 = 2;

	@OriginalMember(owner = "client!vm", name = "E", descriptor = "Z")
	public boolean aBoolean681 = true;

	@OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
	protected int anInt9007 = 2;

	@OriginalMember(owner = "client!vm", name = "R", descriptor = "Z")
	public boolean aBoolean686 = false;

	@OriginalMember(owner = "client!vm", name = "V", descriptor = "Z")
	public boolean aBoolean690 = true;

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
	public int anInt8998 = 0;

	@OriginalMember(owner = "client!vm", name = "U", descriptor = "Z")
	public boolean aBoolean689 = true;

	@OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
	public int anInt9004 = 127;

	@OriginalMember(owner = "client!vm", name = "W", descriptor = "I")
	public int anInt9010 = 1;

	@OriginalMember(owner = "client!vm", name = "ab", descriptor = "Z")
	public boolean aBoolean691 = true;

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "Z")
	public boolean aBoolean679 = true;

	@OriginalMember(owner = "client!vm", name = "Z", descriptor = "I")
	public int anInt9013 = 0;

	@OriginalMember(owner = "client!vm", name = "S", descriptor = "Z")
	public boolean aBoolean687 = true;

	@OriginalMember(owner = "client!vm", name = "bb", descriptor = "Z")
	protected boolean aBoolean692 = true;

	@OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
	public int anInt9009 = 3;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	protected Class6_Sub48() {
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)Z")
	public final boolean method7369(@OriginalArg(0) int arg0) {
		return Static17.method409(arg0) ? this.aBoolean675 : this.aBoolean683;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V")
	public final void method7370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static17.method409(arg1)) {
			this.anInt9007 = arg0;
		} else {
			this.anInt8994 = arg0;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!ji;B)V")
	public final void method7372(@OriginalArg(0) Class6_Sub21 arg0) {
		arg0.method6062(22);
		arg0.method6062(this.anInt9009);
		arg0.method6062(this.aBoolean692 ? 1 : 0);
		arg0.method6062(this.aBoolean689 ? 1 : 0);
		arg0.method6062(this.aBoolean674 ? 1 : 0);
		arg0.method6062(this.aBoolean691 ? 1 : 0);
		arg0.method6062(0);
		arg0.method6062(this.aBoolean680 ? 1 : 0);
		arg0.method6062(this.aBoolean684 ? 1 : 0);
		arg0.method6062(this.aBoolean685 ? 1 : 0);
		arg0.method6062(this.anInt9007);
		arg0.method6062(this.anInt8994);
		arg0.method6062(this.aBoolean675 ? 1 : 0);
		arg0.method6062(this.aBoolean683 ? 1 : 0);
		arg0.method6062(this.aBoolean679 ? 1 : 0);
		arg0.method6062(this.aBoolean681 ? 1 : 0);
		arg0.method6062(this.anInt8989);
		arg0.method6062(this.aBoolean687 ? 1 : 0);
		arg0.method6062(this.anInt8997);
		arg0.method6062(this.anInt8991);
		arg0.method6062(this.anInt8993);
		arg0.method6062(this.anInt9004);
		arg0.method6062(this.anInt9005);
		arg0.method6052(this.anInt9006);
		arg0.method6052(this.anInt8998);
		arg0.method6062(Static435.method6206());
		arg0.method6033(this.anInt9008);
		arg0.method6062(this.anInt9003);
		arg0.method6062(this.aBoolean686 ? 1 : 0);
		arg0.method6062(this.aBoolean678 ? 1 : 0);
		arg0.method6062(this.anInt9002);
		arg0.method6062(this.aBoolean682 ? 1 : 0);
		arg0.method6062(this.aBoolean677 ? 1 : 0);
		arg0.method6062(this.anInt9010);
		arg0.method6062(this.aBoolean690 ? 1 : 0);
		arg0.method6062(this.anInt8996);
		arg0.method6062(this.anInt8988);
		arg0.method6062(this.aBoolean676 ? 1 : 0);
		arg0.method6062(this.anInt8995);
		arg0.method6062(this.anInt8992);
		arg0.method6062(this.anInt9001);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZZ)V")
	public final void method7373(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static17.method409(arg0)) {
			this.aBoolean675 = arg1;
		} else {
			this.aBoolean683 = arg1;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)I")
	public final int method7374(@OriginalArg(1) int arg0) {
		return Static17.method409(arg0) ? this.anInt9007 : this.anInt8994;
	}
}
