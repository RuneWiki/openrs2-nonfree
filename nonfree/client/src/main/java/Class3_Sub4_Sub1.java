import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
	public int anInt882;

	@OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
	public int anInt883;

	@OriginalMember(owner = "client!bda", name = "y", descriptor = "I")
	public int anInt884;

	@OriginalMember(owner = "client!bda", name = "z", descriptor = "I")
	public int anInt885;

	@OriginalMember(owner = "client!bda", name = "A", descriptor = "I")
	public int anInt886;

	@OriginalMember(owner = "client!bda", name = "E", descriptor = "Lclient!rea;")
	public final Class280 aClass280_1;

	@OriginalMember(owner = "client!bda", name = "v", descriptor = "Lclient!bg;")
	public final Class29 aClass29_1;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!rea;Lclient!ru;)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) Class280 arg0, @OriginalArg(1) Class55_Sub8 arg1) {
		this.aClass280_1 = arg0;
		this.aClass29_1 = this.aClass280_1.method7008();
		this.method980();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
	public void method980() {
		this.anInt884 = this.aClass280_1.anInt8555;
		this.anInt886 = this.aClass280_1.anInt8552;
		this.anInt885 = this.aClass280_1.anInt8550;
		if (this.aClass280_1.aClass255_7 != null) {
			this.aClass280_1.aClass255_7.R(this.aClass29_1.anInt983, this.aClass29_1.anInt979, this.aClass29_1.anInt994, Static303.anIntArray375);
		}
		this.anInt882 = Static303.anIntArray375[0];
		this.anInt883 = Static303.anIntArray375[2];
	}
}
