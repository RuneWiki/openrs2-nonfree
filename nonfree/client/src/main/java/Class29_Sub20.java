import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class29_Sub20 extends Class29 {

	@OriginalMember(owner = "client!up", name = "i", descriptor = "I")
	private final int anInt10165;

	@OriginalMember(owner = "client!up", name = "m", descriptor = "I")
	private final int anInt10166;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub20(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt10165 = arg0.method2028(-14795);
		this.anInt10166 = arg0.method2036();
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static499.anInt7942 = Static332.anInt5345;
		Static109.anInt2312 = Static600.anInt9097;
		Static526.anInt8219 = Static42.anInt1244;
		Static1.anInt11166 = this.anInt10165 + Static716.anInt11157;
		Static27.anInt1055 = Static716.anInt11157;
		Static336.anInt5402 = Static191.anInt3283;
		Static191.anInt3283 = this.anInt10166 & 0xFF;
		Static600.anInt9097 = this.anInt10166 >>> 24;
		Static332.anInt5345 = this.anInt10166 >>> 8 & 0xFF;
		Static42.anInt1244 = this.anInt10166 >>> 16 & 0xFF;
	}
}
