import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class15_Sub14 extends Class15 {

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	private final int anInt7644;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	private final int anInt7645;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub14(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt7644 = arg0.method8575();
		this.anInt7645 = arg0.method8555(-9372);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static284.anInt4408 = Static571.anInt8999;
		Static268.anInt4159 = Static205.anInt3336;
		Static601.anInt9345 = Static528.anInt8386;
		Static525.anInt8330 = Static81.anInt1388;
		Static122.anInt2068 = Static528.anInt8386 + this.anInt7644;
		Static46.anInt608 = Static308.anInt4721;
		Static81.anInt1388 = this.anInt7645 >>> 16 & 0xFF;
		Static571.anInt8999 = this.anInt7645 & 0xFF;
		Static205.anInt3336 = this.anInt7645 >>> 24;
		Static308.anInt4721 = this.anInt7645 >>> 8 & 0x900000FF;
	}
}
