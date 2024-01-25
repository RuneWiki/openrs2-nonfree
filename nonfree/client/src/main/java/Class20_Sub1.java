import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
	private int anInt6818 = 0;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!nca;Lclient!rf;)V")
	public Class20_Sub1(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class321_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9560() {
		@Pc(17) int local17 = super.aClass321_2.aClass18_15.method282(Static33.anInt443, super.aClass43_24.method9587()) + super.aClass321_2.anInt8626;
		@Pc(32) int local32 = super.aClass321_2.aClass239_17.method5836(Static277.anInt4340, super.aClass43_24.method9600()) + super.aClass321_2.anInt8628;
		super.aClass43_24.method9604((float) (super.aClass43_24.method9587() / 2 + local17), (float) (local32 + super.aClass43_24.method9600() / 2), 4096, this.anInt6818);
		this.anInt6818 += ((Class321_Sub1) super.aClass321_2).anInt8634;
	}
}
