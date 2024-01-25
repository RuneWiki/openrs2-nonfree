import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class97 {

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
	public int anInt3076 = 1;

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
	public int anInt3083 = 2;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
	public int anInt3081 = 64;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
	public int anInt3082 = -1;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
	public int anInt3078 = 64;

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "Z")
	public boolean aBoolean242 = false;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BILclient!eh;I)V")
	private void method2780(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt3082 = arg1.method5982();
			if (this.anInt3082 == 65535) {
				this.anInt3082 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt3081 = arg1.method5982() + 1;
			this.anInt3078 = arg1.method5982() + 1;
		} else if (arg0 == 3) {
			arg1.method6021();
		} else if (arg0 == 4) {
			this.anInt3083 = arg1.method6015();
		} else if (arg0 == 5) {
			this.anInt3076 = arg1.method6015();
		} else if (arg0 == 6) {
			this.aBoolean241 = true;
		} else if (arg0 == 7) {
			this.aBoolean242 = true;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILclient!eh;I)V")
	public void method2781(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method6015();
			if (local14 == 0) {
				return;
			}
			this.method2780(local14, arg1, arg0);
		}
	}
}
