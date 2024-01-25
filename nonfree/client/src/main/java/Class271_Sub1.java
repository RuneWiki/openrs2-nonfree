import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class271_Sub1 extends Class271 {

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
	private int anInt7719 = 0;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!wm;Lclient!bo;)V")
	public Class271_Sub1(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class46_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7886() {
		@Pc(25) int local25 = super.aClass46_2.aClass275_5.method6449(Static613.anInt10005, super.aClass50_30.method6003()) + super.aClass46_2.anInt784;
		@Pc(40) int local40 = super.aClass46_2.aClass81_3.method2034(Static10.anInt152, super.aClass50_30.method6010()) + super.aClass46_2.anInt783;
		super.aClass50_30.method5988((float) (local25 + super.aClass50_30.method6003() / 2), (float) (super.aClass50_30.method6010() / 2 + local40), 4096, this.anInt7719);
		this.anInt7719 += ((Class46_Sub1) super.aClass46_2).anInt788;
	}
}
