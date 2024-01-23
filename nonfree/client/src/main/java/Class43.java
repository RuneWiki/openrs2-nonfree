import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class43 {

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "F")
	public float aFloat24 = 1.0F;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "F")
	public float aFloat25 = 0.25F;

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "F")
	public float aFloat26 = 1.0F;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
	public int anInt1336;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
	public int anInt1339;

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
	public int anInt1343;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
	public int anInt1331;

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
	public int anInt1334;

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
	public int anInt1340;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "Lclient!qh;")
	public Class1_Sub5_Sub18 aClass1_Sub5_Sub18_4;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class43() {
		this.anInt1336 = Static65.anInt1348;
		this.anInt1339 = 0;
		this.aFloat29 = 0.69921875F;
		this.anInt1343 = Static65.anInt1351;
		this.aFloat27 = 1.1523438F;
		this.anInt1331 = -50;
		this.aFloat28 = 1.2F;
		this.anInt1334 = -50;
		this.anInt1340 = -60;
		if (Static69.anIntArray120 != null) {
			this.aClass1_Sub5_Sub18_4 = Static227.method3647(Static69.anIntArray120[0], Static69.anIntArray120[1], Static69.anIntArray120[2], Static69.anIntArray120[3], Static69.anIntArray120[4], Static69.anIntArray120[5]);
		}
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class43(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(16) int local16 = arg0.method1853();
		if ((local16 & 0x1) == 0) {
			this.anInt1343 = Static65.anInt1351;
		} else {
			this.anInt1343 = arg0.method1860();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat27 = 1.1523438F;
		} else {
			this.aFloat27 = (float) arg0.method1879() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat29 = 0.69921875F;
		} else {
			this.aFloat29 = (float) arg0.method1879() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat28 = 1.2F;
		} else {
			this.aFloat28 = (float) arg0.method1879() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1340 = -60;
			this.anInt1331 = -50;
			this.anInt1334 = -50;
		} else {
			this.anInt1334 = arg0.method1843();
			this.anInt1340 = arg0.method1843();
			this.anInt1331 = arg0.method1843();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1336 = Static65.anInt1348;
		} else {
			this.anInt1336 = arg0.method1860();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1339 = 0;
		} else {
			this.anInt1339 = arg0.method1879();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass1_Sub5_Sub18_4 = Static227.method3647(arg0.method1879(), arg0.method1879(), arg0.method1879(), arg0.method1879(), arg0.method1879(), arg0.method1879());
		} else if (Static69.anIntArray120 != null) {
			this.aClass1_Sub5_Sub18_4 = Static227.method3647(Static69.anIntArray120[0], Static69.anIntArray120[1], Static69.anIntArray120[2], Static69.anIntArray120[3], Static69.anIntArray120[4], Static69.anIntArray120[5]);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method1133(@OriginalArg(0) Class1_Sub13 arg0) {
		this.aFloat24 = (float) (arg0.method1853() * 8) / 255.0F;
		this.aFloat25 = (float) (arg0.method1853() * 8) / 255.0F;
		this.aFloat26 = (float) (arg0.method1853() * 8) / 255.0F;
	}
}
