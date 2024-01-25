import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class108_Sub1 extends Class108 {

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "I")
	private int anInt2582 = 0;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lclient!ae;Lclient!vj;)V")
	public Class108_Sub1(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class47_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8706() {
		@Pc(17) int local17 = super.aClass47_2.aClass7_11.method247(Static365.anInt6242, super.aClass9_19.method8937()) + super.aClass47_2.anInt10344;
		@Pc(39) int local39 = super.aClass47_2.aClass249_14.method6236(Static335.anInt5755, super.aClass9_19.method8930()) + super.aClass47_2.anInt10347;
		super.aClass9_19.method8917((float) (local17 + super.aClass9_19.method8937() / 2), (float) (super.aClass9_19.method8930() / 2 + local39), 4096, this.anInt2582);
		this.anInt2582 += ((Class47_Sub1) super.aClass47_2).anInt10350;
	}
}
