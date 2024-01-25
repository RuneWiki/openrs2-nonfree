import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class4_Sub9_Sub2 extends Class4_Sub9 {

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
	private int anInt5369;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "B")
	private byte aByte84;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	private int anInt5370 = -1;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!es;I)V")
	@Override
	public void method7843(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt5370 = arg0.method8859();
		this.aByte84 = arg0.method8861();
		this.anInt5369 = arg0.method8859();
		arg0.method8830();
		this.aString70 = arg0.method8853();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!wt;I)V")
	@Override
	public void method7845(@OriginalArg(0) Class4_Sub55 arg0) {
		@Pc(12) Class357 local12 = arg0.aClass357Array1[this.anInt5370];
		local12.anInt9106 = this.anInt5369;
		local12.aString111 = this.aString70;
		local12.aByte136 = this.aByte84;
	}
}
