import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class62 {

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
	public int anInt1979 = -1;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public int anInt1984 = 128;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public int anInt1981 = 16;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
	public boolean aBoolean136 = false;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
	public int anInt1989 = 8;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Z")
	public boolean aBoolean135 = true;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	public int anInt1986 = 1190717;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public int anInt1980 = 0;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	public int anInt1983 = -1;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "Z")
	public boolean aBoolean137 = true;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILclient!qm;)V")
	private void method1465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub14 arg2) {
		if (arg0 == 1) {
			this.anInt1980 = Static121.method1974(arg2.method2215());
		} else if (arg0 == 2) {
			this.anInt1983 = arg2.method2199();
		} else if (arg0 == 3) {
			this.anInt1983 = arg2.method2244();
			if (this.anInt1983 == 65535) {
				this.anInt1983 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean137 = false;
		} else if (arg0 == 7) {
			this.anInt1979 = Static121.method1974(arg2.method2215());
		} else if (arg0 == 8) {
			Static39.anInt965 = arg1;
		} else if (arg0 == 9) {
			this.anInt1984 = arg2.method2244();
		} else if (arg0 == 10) {
			this.aBoolean135 = false;
		} else if (arg0 == 11) {
			this.anInt1989 = arg2.method2199();
		} else if (arg0 == 12) {
			this.aBoolean136 = true;
		} else if (arg0 == 13) {
			this.anInt1986 = arg2.method2215();
		} else if (arg0 == 14) {
			this.anInt1981 = arg2.method2199();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!qm;I)V")
	public void method1468(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method2199();
			if (local13 == 0) {
				return;
			}
			this.method1465(local13, arg1, arg0);
		}
	}
}
