import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class55 {

	@OriginalMember(owner = "client!e", name = "c", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!h;")
	public static final Class89 aClass89_58;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_36;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_37;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_57;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "[I")
	public static final int[] anIntArray112;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!hu;")
	private final Class98 aClass98_7 = new Class98(64);

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!r;")
	private final Class197 aClass197_17;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!r;")
	public final Class197 aClass197_16;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray1[local6] = new Rectangle();
		}
		aClass89_58 = new Class89(48, 5);
		aClass79_36 = new Class79("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
		aClass79_37 = new Class79("M", "M", "M", "M");
		aClass145_57 = new Class145(15, -1);
		anIntArray112 = new int[] { 1, 2, 4, 8 };
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V", line = 220)
	public Class55(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) Class197 arg3) {
		this.aClass197_17 = arg2;
		this.aClass197_16 = arg3;
		this.aClass197_17.method5082(3);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 8)
	public void method1783() {
		@Pc(6) Class98 local6 = this.aClass98_7;
		synchronized (this.aClass98_7) {
			this.aClass98_7.method2623();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 21)
	public void method1784() {
		@Pc(6) Class98 local6 = this.aClass98_7;
		synchronized (this.aClass98_7) {
			this.aClass98_7.method2616();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Lclient!ge;", line = 59)
	public Class80 method1786(@OriginalArg(0) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_7;
		@Pc(16) Class80 local16;
		synchronized (this.aClass98_7) {
			local16 = (Class80) this.aClass98_7.method2614((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_17.method5090(arg0, 3);
		local16 = new Class80();
		local16.aClass55_2 = this;
		if (local33 != null) {
			local16.method2273(new Class2_Sub4(local33));
		}
		@Pc(57) Class98 local57 = this.aClass98_7;
		synchronized (this.aClass98_7) {
			this.aClass98_7.method2626((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V", line = 89)
	public void method1787() {
		@Pc(6) Class98 local6 = this.aClass98_7;
		synchronized (this.aClass98_7) {
			this.aClass98_7.method2617(5);
		}
	}
}
