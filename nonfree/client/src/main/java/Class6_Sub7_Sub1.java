import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class6_Sub7_Sub1 extends Class6_Sub7 {

	@OriginalMember(owner = "client!bea", name = "n", descriptor = "B")
	private byte aByte8;

	@OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
	private int anInt495;

	@OriginalMember(owner = "client!bea", name = "r", descriptor = "J")
	private long aLong27 = -1L;

	@OriginalMember(owner = "client!bea", name = "w", descriptor = "Ljava/lang/String;")
	private String aString9 = null;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!kj;I)V")
	@Override
	public void method8200(@OriginalArg(0) Class6_Sub29 arg0) {
		@Pc(7) Class200 local7 = new Class200();
		local7.aByte80 = this.aByte8;
		local7.anInt5266 = this.anInt495;
		local7.aString58 = this.aString9;
		arg0.method4980(local7);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8201(@OriginalArg(0) Class6_Sub15 arg0) {
		if (arg0.method3030() != 255) {
			arg0.anInt3174--;
			this.aLong27 = arg0.method3049();
		}
		this.aString9 = arg0.method2986();
		this.anInt495 = arg0.method3018();
		this.aByte8 = arg0.method3027();
		arg0.method3049();
		if (Static679.aBoolean450) {
			System.out.println("memberhash:" + this.aLong27 + " membername:" + this.aString9);
		}
	}
}
