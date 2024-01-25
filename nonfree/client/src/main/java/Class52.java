import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class52 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!dh;")
	public Class52 aClass52_1;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public int anInt1304;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!c;")
	public Class33 aClass33_4;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	public int anInt1306;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
	public int anInt1307;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
	public final int anInt1309;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	public final int anInt1303;

	static {
		new Class55(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1309 = arg1;
		this.anInt1303 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!dh;I)V")
	public Class52(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1) {
		this.aClass52_1 = arg0;
		this.aClass33_4 = this.aClass52_1.aClass33_4;
		this.anInt1309 = arg1 + this.aClass52_1.anInt1309;
		this.anInt1303 = this.aClass52_1.anInt1303;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Lclient!ki;")
	public Class134 method1136() {
		return Static178.method2597(this.anInt1303);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)Lclient!dh;")
	public Class52 method1138(@OriginalArg(1) int arg0) {
		return new Class52(this.anInt1303, arg0);
	}
}
