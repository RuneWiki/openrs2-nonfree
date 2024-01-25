import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
	private int anInt4074 = 0;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!om;Lclient!fba;)V")
	public Class50_Sub1(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class91_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7788() {
		@Pc(17) int local17 = super.aClass91_2.aClass300_5.method6502(super.aClass46_8.A(), Static1.anInt7) + super.aClass91_2.anInt2858;
		@Pc(32) int local32 = super.aClass91_2.aClass140_2.method3723(Static283.anInt2480, super.aClass46_8.ca()) + super.aClass91_2.anInt2857;
		super.aClass46_8.method7611((float) (super.aClass46_8.A() / 2 + local17), (float) (local32 + super.aClass46_8.ca() / 2), 4096, this.anInt4074);
		this.anInt4074 += ((Class91_Sub1) super.aClass91_2).anInt2870;
	}
}
