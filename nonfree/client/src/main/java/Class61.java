import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class61 {

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "F")
	public float aFloat27 = 0.25F;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "F")
	public float aFloat26 = 1.0F;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "F")
	public float aFloat29 = 1.0F;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	public int anInt1942;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public int anInt1938;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	public int anInt1943;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
	public int anInt1946;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	public int anInt1936;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	public int anInt1939;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!wc;")
	public Class1_Sub3_Sub24 aClass1_Sub3_Sub24_2;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class61() {
		this.anInt1942 = -50;
		this.aFloat28 = 0.69921875F;
		this.aFloat25 = 1.1523438F;
		this.anInt1938 = -50;
		this.anInt1943 = Static180.anInt3946;
		this.anInt1946 = -60;
		this.anInt1936 = Static180.anInt3944;
		this.aFloat24 = 1.2F;
		this.anInt1939 = 0;
		if (Static106.anIntArray236 != null) {
			this.aClass1_Sub3_Sub24_2 = Static306.method4656(Static106.anIntArray236[0], Static106.anIntArray236[1], Static106.anIntArray236[2], Static106.anIntArray236[3], Static106.anIntArray236[4], Static106.anIntArray236[5]);
		}
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!qm;)V")
	public Class61(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(16) int local16 = arg0.method2199();
		if ((local16 & 0x1) == 0) {
			this.anInt1943 = Static180.anInt3946;
		} else {
			this.anInt1943 = arg0.method2194();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat25 = 1.1523438F;
		} else {
			this.aFloat25 = (float) arg0.method2244() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat28 = 0.69921875F;
		} else {
			this.aFloat28 = (float) arg0.method2244() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat24 = 1.2F;
		} else {
			this.aFloat24 = (float) arg0.method2244() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1942 = -50;
			this.anInt1946 = -60;
			this.anInt1938 = -50;
		} else {
			this.anInt1942 = arg0.method2248();
			this.anInt1946 = arg0.method2248();
			this.anInt1938 = arg0.method2248();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1936 = Static180.anInt3944;
		} else {
			this.anInt1936 = arg0.method2194();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1939 = 0;
		} else {
			this.anInt1939 = arg0.method2244();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass1_Sub3_Sub24_2 = Static306.method4656(arg0.method2244(), arg0.method2244(), arg0.method2244(), arg0.method2244(), arg0.method2244(), arg0.method2244());
		} else if (Static106.anIntArray236 != null) {
			this.aClass1_Sub3_Sub24_2 = Static306.method4656(Static106.anIntArray236[0], Static106.anIntArray236[1], Static106.anIntArray236[2], Static106.anIntArray236[3], Static106.anIntArray236[4], Static106.anIntArray236[5]);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLclient!qm;)V")
	public void method1432(@OriginalArg(1) Class1_Sub14 arg0) {
		this.aFloat29 = (float) (arg0.method2199() * 8) / 255.0F;
		this.aFloat27 = (float) (arg0.method2199() * 8) / 255.0F;
		this.aFloat26 = (float) (arg0.method2199() * 8) / 255.0F;
	}
}
