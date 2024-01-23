import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class34 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Z")
	public boolean aBoolean67 = true;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	public int anInt1202 = -1;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public int anInt1200 = 16;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
	public int anInt1198 = -1;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Z")
	public boolean aBoolean70 = false;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Z")
	public boolean aBoolean69 = true;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	public int anInt1194 = 0;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
	public int anInt1197 = 1190717;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	public int anInt1204 = 8;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
	public int anInt1205 = 128;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIILclient!pi;)V")
	private void method1026(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub24 arg2) {
		if (arg0 == 1) {
			this.anInt1194 = Static267.method4228(arg2.method3063());
		} else if (arg0 == 2) {
			this.anInt1198 = arg2.method3110();
		} else if (arg0 == 3) {
			this.anInt1198 = arg2.method3085();
			if (this.anInt1198 == 65535) {
				this.anInt1198 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean69 = false;
		} else if (arg0 == 7) {
			this.anInt1202 = Static267.method4228(arg2.method3063());
		} else if (arg0 == 8) {
			Static132.anInt2620 = arg1;
		} else if (arg0 == 9) {
			this.anInt1205 = arg2.method3085();
		} else if (arg0 == 10) {
			this.aBoolean67 = false;
		} else if (arg0 == 11) {
			this.anInt1204 = arg2.method3110();
		} else if (arg0 == 12) {
			this.aBoolean70 = true;
		} else if (arg0 == 13) {
			this.anInt1197 = arg2.method3063();
		} else if (arg0 == 14) {
			this.anInt1200 = arg2.method3110();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!pi;II)V")
	public void method1031(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(11) int local11 = arg0.method3110();
			if (local11 == 0) {
				return;
			}
			this.method1026(local11, arg1, arg0);
		}
	}
}
