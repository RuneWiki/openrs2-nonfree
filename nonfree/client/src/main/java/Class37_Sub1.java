import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dha")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!dha", name = "o", descriptor = "I")
	private int anInt1727 = 0;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lclient!la;Lclient!cf;)V")
	public Class37_Sub1(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class63_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8946() {
		@Pc(26) int local26 = super.aClass63_2.aClass219_4.method5206(super.aClass134_8.method9231(), Static264.anInt4559) + super.aClass63_2.anInt1113;
		@Pc(41) int local41 = super.aClass63_2.aClass368_4.method8776(super.aClass134_8.method9232(), Static47.anInt794) + super.aClass63_2.anInt1110;
		super.aClass134_8.method9221((float) (super.aClass134_8.method9231() / 2 + local26), (float) (super.aClass134_8.method9232() / 2 + local41), 4096, this.anInt1727);
		this.anInt1727 += ((Class63_Sub1) super.aClass63_2).anInt1118;
	}
}
