import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class156_Sub1 extends Class156 {

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
	private int anInt7131 = 0;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!uq;Lclient!ea;)V")
	public Class156_Sub1(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class89_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8282() {
		@Pc(17) int local17 = super.aClass89_2.aClass266_10.method5919(Static95.anInt9415, super.aClass6_25.method5130()) + super.aClass89_2.anInt2186;
		@Pc(39) int local39 = super.aClass89_2.aClass131_13.method3034(super.aClass6_25.method5134(), Static195.anInt3525) + super.aClass89_2.anInt2184;
		super.aClass6_25.method5126((float) (local17 + super.aClass6_25.method5130() / 2), (float) (super.aClass6_25.method5134() / 2 + local39), 4096, this.anInt7131);
		this.anInt7131 += ((Class89_Sub1) super.aClass89_2).anInt2192;
	}
}
