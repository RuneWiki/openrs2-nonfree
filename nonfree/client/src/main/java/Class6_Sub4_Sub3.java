import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class6_Sub4_Sub3 extends Class6_Sub4 {

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "J")
	private long aLong57 = -1L;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Ljava/lang/String;")
	private String aString14 = null;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		if (arg0.method3030() != 255) {
			arg0.anInt3174--;
			this.aLong57 = arg0.method3049();
		}
		this.aString14 = arg0.method2986();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.method8898(this.aString14, this.aLong57);
	}
}
