import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	private int anInt3659 = 0;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!lb;Lclient!aka;)V")
	public Class132_Sub1(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class14_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8743() {
		@Pc(23) int local23 = super.aClass14_2.aClass304_2.method7463(super.aClass9_8.method8619(), Static347.anInt2639) + super.aClass14_2.anInt357;
		@Pc(38) int local38 = super.aClass14_2.aClass216_2.method5030(Static426.anInt7511, super.aClass9_8.method8613()) + super.aClass14_2.anInt359;
		super.aClass9_8.method8606((float) (local23 + super.aClass9_8.method8619() / 2), (float) (local38 + super.aClass9_8.method8613() / 2), 4096, this.anInt3659);
		this.anInt3659 += ((Class14_Sub1) super.aClass14_2).anInt362;
	}
}
