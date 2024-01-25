import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class215_Sub1 extends Class215 {

	@OriginalMember(owner = "client!li", name = "r", descriptor = "I")
	private int anInt6419 = 0;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!gga;Lclient!lu;)V")
	public Class215_Sub1(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class226_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7669() {
		@Pc(23) int local23 = super.aClass226_2.aClass236_7.method6431(super.aClass71_14.method7709(), Static26.anInt458) + super.aClass226_2.anInt6815;
		@Pc(37) int local37 = super.aClass226_2.aClass103_7.method3186(Static340.anInt6390, super.aClass71_14.method7711()) + super.aClass226_2.anInt6814;
		super.aClass71_14.method7688((float) (super.aClass71_14.method7709() / 2 + local23), (float) (super.aClass71_14.method7711() / 2 + local37), 4096, this.anInt6419);
		this.anInt6419 += ((Class226_Sub1) super.aClass226_2).anInt6819;
	}
}
