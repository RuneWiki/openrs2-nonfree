import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class8_Sub5_Sub18 extends Class8_Sub5 {

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
	public int anInt9947;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
	public int anInt9948;

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
	public int anInt9949;

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
	public int anInt9951;

	@OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
	public int anInt9952;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "Lclient!oia;")
	public final Class238 aClass238_2;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "Lclient!vba;")
	public final Class351 aClass351_1;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!oia;Lclient!pd;)V")
	public Class8_Sub5_Sub18(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class15_Sub8 arg1) {
		this.aClass238_2 = arg0;
		this.aClass351_1 = this.aClass238_2.method6341();
		this.method8078();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method8078() {
		this.anInt9951 = this.aClass238_2.anInt7656;
		this.anInt9952 = this.aClass238_2.anInt7662;
		this.anInt9947 = this.aClass238_2.anInt7657;
		if (this.aClass238_2.aClass54_8 != null) {
			this.aClass238_2.aClass54_8.method5132(this.aClass351_1.anInt10057, this.aClass351_1.anInt10070, this.aClass351_1.anInt10059, Static623.anIntArray369);
		}
		this.anInt9949 = Static623.anIntArray369[0];
		this.anInt9948 = Static623.anIntArray369[2];
	}
}
