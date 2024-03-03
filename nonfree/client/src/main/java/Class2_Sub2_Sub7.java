import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gg", name = "B", descriptor = "[I")
	public static final int[] anIntArray145 = new int[256];

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!gg", name = "C", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_86 = new Class145(63, 8);

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "Lclient!h;")
	public static final Class89 aClass89_91 = new Class89(41, 3);

	@OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
	public static int anInt2291;

	@OriginalMember(owner = "client!gg", name = "P", descriptor = "Z")
	public static boolean aBoolean173;

	@OriginalMember(owner = "client!gg", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18;

	@OriginalMember(owner = "client!gg", name = "D", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
	public int anInt2281;

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
	public int anInt2286;

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
	public int anInt2287;

	static {
		new Class79("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
		anInt2291 = 0;
		aBoolean173 = false;
		aStringArray18 = new String[100];
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(II)V", line = 87)
	public Class2_Sub2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong232 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I", line = 4)
	public int method2309() {
		return (int) (super.aLong232 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)J", line = 16)
	public long method2310() {
		return super.aLong215 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)I", line = 28)
	public int method2311() {
		return (int) super.aLong232;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V", line = 61)
	public void method2313() {
		super.aLong215 |= Long.MIN_VALUE;
		if (this.method2310() == 0L) {
			Class2_Sub3_Sub36.aClass246_10.method6342(this);
		}
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V", line = 76)
	public void method2314() {
		super.aLong215 = Static190.method3686() + 500L | super.aLong215 & Long.MIN_VALUE;
		Class146.aClass246_4.method6342(this);
	}
}
