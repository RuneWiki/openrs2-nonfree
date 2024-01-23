import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class35 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
	public int anInt1066 = -1;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
	public int anInt1069 = -1;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
	public int anInt1072 = 8;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "Z")
	public boolean aBoolean80 = true;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "Z")
	public boolean aBoolean79 = true;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
	public int anInt1071 = 0;

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
	public int anInt1074 = 1190717;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
	public int anInt1077 = 16;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
	public int anInt1068 = 128;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!p;I)V")
	public void method871(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(7) int local7 = arg0.method1874();
			if (local7 == 0) {
				return;
			}
			this.method875(local7, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!p;II)V")
	private void method875(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub17 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt1071 = Static231.method3626(arg1.method1835());
		} else if (arg0 == 2) {
			this.anInt1069 = arg1.method1874();
		} else if (arg0 == 3) {
			this.anInt1069 = arg1.method1837();
			if (this.anInt1069 == 65535) {
				this.anInt1069 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean79 = false;
		} else if (arg0 == 7) {
			this.anInt1066 = Static231.method3626(arg1.method1835());
		} else if (arg0 == 8) {
			Static55.anInt1085 = arg2;
		} else if (arg0 == 9) {
			this.anInt1068 = arg1.method1837();
		} else if (arg0 == 10) {
			this.aBoolean80 = false;
		} else if (arg0 == 11) {
			this.anInt1072 = arg1.method1874();
		} else if (arg0 == 12) {
			this.aBoolean78 = true;
		} else if (arg0 == 13) {
			this.anInt1074 = arg1.method1835();
		} else if (arg0 == 14) {
			this.anInt1077 = arg1.method1874();
		}
	}
}
