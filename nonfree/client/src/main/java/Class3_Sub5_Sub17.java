import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class3_Sub5_Sub17 extends Class3_Sub5 {

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
	public int anInt8294;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
	public int anInt8297;

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
	public int anInt8299;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
	public int anInt8300;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
	public int anInt8302;

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "Lclient!rea;")
	public final Class305 aClass305_2;

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "Lclient!qf;")
	public final Class293 aClass293_1;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!rea;Lclient!ls;)V")
	public Class3_Sub5_Sub17(@OriginalArg(0) Class305 arg0, @OriginalArg(1) Class34_Sub7 arg1) {
		this.aClass305_2 = arg0;
		this.aClass293_1 = this.aClass305_2.method6722();
		this.method6821();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public void method6821() {
		this.anInt8299 = this.aClass305_2.anInt8114;
		this.anInt8302 = this.aClass305_2.anInt8115;
		this.anInt8300 = this.aClass305_2.anInt8120;
		if (this.aClass305_2.aClass17_7 != null) {
			this.aClass305_2.aClass17_7.method6229(this.aClass293_1.anInt7714, this.aClass293_1.anInt7712, this.aClass293_1.anInt7716, Static270.anIntArray272);
		}
		this.anInt8297 = Static270.anIntArray272[2];
		this.anInt8294 = Static270.anIntArray272[0];
	}
}
