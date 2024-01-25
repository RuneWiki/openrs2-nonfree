import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!al", name = "r", descriptor = "I")
	private int anInt492 = 0;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!pl;Lclient!jq;)V")
	public Class18_Sub1(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class178_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7013() {
		@Pc(23) int local23 = super.aClass178_2.aClass62_8.method1173(Static26.anInt651, super.aClass39_2.A()) + super.aClass178_2.anInt4798;
		@Pc(37) int local37 = super.aClass178_2.aClass279_7.method6456(Static554.anInt9119, super.aClass39_2.ca()) + super.aClass178_2.anInt4797;
		super.aClass39_2.method7857((float) (local23 + super.aClass39_2.A() / 2), (float) (super.aClass39_2.ca() / 2 + local37), 4096, this.anInt492);
		this.anInt492 += ((Class178_Sub1) super.aClass178_2).anInt4801;
	}
}
