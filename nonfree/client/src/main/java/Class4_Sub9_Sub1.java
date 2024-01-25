import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class4_Sub9_Sub1 extends Class4_Sub9 {

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
	private int anInt3635;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "B")
	private byte aByte47;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Ljava/lang/String;")
	private String aString32 = null;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "J")
	private long aLong115 = -1L;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!es;I)V")
	@Override
	public void method7843(@OriginalArg(0) Class4_Sub11 arg0) {
		if (arg0.method8865() != 255) {
			arg0.anInt10466--;
			this.aLong115 = arg0.method8830();
		}
		this.aString32 = arg0.method8852();
		this.anInt3635 = arg0.method8859();
		this.aByte47 = arg0.method8861();
		arg0.method8830();
		if (Static49.aBoolean76) {
			System.out.println("memberhash:" + this.aLong115 + " membername:" + this.aString32);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!wt;I)V")
	@Override
	public void method7845(@OriginalArg(0) Class4_Sub55 arg0) {
		@Pc(13) Class357 local13 = new Class357();
		local13.aString111 = this.aString32;
		local13.aByte136 = this.aByte47;
		local13.anInt9106 = this.anInt3635;
		arg0.method8970(local13);
	}
}
