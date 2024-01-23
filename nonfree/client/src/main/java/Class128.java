import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class128 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
	public int anInt3869 = 1190717;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public int anInt3868 = 16;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
	public boolean aBoolean261 = false;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Z")
	public boolean aBoolean263 = true;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	public int anInt3873 = 8;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Z")
	public boolean aBoolean264 = true;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	public int anInt3870 = 128;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
	public int anInt3874 = -1;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
	public int anInt3875 = -1;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
	public int anInt3878 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!lf;II)V")
	private void method3232(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3878 = Static87.method1612(arg0.method1352());
		} else if (arg2 == 2) {
			this.anInt3874 = arg0.method1378();
		} else if (arg2 == 3) {
			this.anInt3874 = arg0.method1386();
			if (this.anInt3874 == 65535) {
				this.anInt3874 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean263 = false;
		} else if (arg2 == 7) {
			this.anInt3875 = Static87.method1612(arg0.method1352());
		} else if (arg2 == 8) {
			Static188.anInt3594 = arg1;
		} else if (arg2 == 9) {
			this.anInt3870 = arg0.method1386();
		} else if (arg2 == 10) {
			this.aBoolean264 = false;
		} else if (arg2 == 11) {
			this.anInt3873 = arg0.method1378();
		} else if (arg2 == 12) {
			this.aBoolean261 = true;
		} else if (arg2 == 13) {
			this.anInt3869 = arg0.method1352();
		} else if (arg2 == 14) {
			this.anInt3868 = arg0.method1378();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!lf;IB)V")
	public void method3234(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1378();
			if (local5 == 0) {
				return;
			}
			this.method3232(arg0, arg1, local5);
		}
	}
}
