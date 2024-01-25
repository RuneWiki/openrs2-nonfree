import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!tw", name = "r", descriptor = "I")
	private int anInt9542 = 0;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!gda;Lclient!eda;)V")
	public Class89_Sub1(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class91_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8562() {
		@Pc(29) int local29 = super.aClass91_2.aClass189_4.method4461(Static592.anInt9548, super.aClass155_31.method7206()) + super.aClass91_2.anInt1884;
		@Pc(43) int local43 = super.aClass91_2.aClass346_3.method7688(super.aClass155_31.method7209(), Static401.anInt6745) + super.aClass91_2.anInt1883;
		super.aClass155_31.method7211((float) (super.aClass155_31.method7206() / 2 + local29), (float) (super.aClass155_31.method7209() / 2 + local43), 4096, this.anInt9542);
		this.anInt9542 += ((Class91_Sub1) super.aClass91_2).anInt1888;
	}
}
