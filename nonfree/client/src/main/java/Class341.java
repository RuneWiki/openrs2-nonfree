import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class341 {

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
	public int anInt9154;

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "Z")
	public boolean aBoolean633;

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
	public int anInt9157;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
	public int anInt9158;

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
	public int anInt9159;

	@OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
	public int anInt9160;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
	public int anInt9151 = 8;

	@OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
	public int anInt9161 = 16777215;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZLclient!eh;)V")
	public void method7530(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6015();
			if (local5 == 0) {
				return;
			}
			this.method7531(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZLclient!eh;I)V")
	private void method7531(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9151 = arg0.method5982();
		} else if (arg1 == 2) {
			this.aBoolean633 = true;
		} else if (arg1 == 3) {
			this.anInt9154 = arg0.method6003();
			this.anInt9158 = arg0.method6003();
			this.anInt9157 = arg0.method6003();
		} else if (arg1 == 4) {
			this.anInt9159 = arg0.method6015();
		} else if (arg1 == 5) {
			this.anInt9160 = arg0.method5982();
		} else if (arg1 == 6) {
			this.anInt9161 = arg0.method6023();
			return;
		}
	}
}
