import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public final class Class14_Sub2_Sub10 extends Class14_Sub2 {

	@OriginalMember(owner = "client!uha", name = "t", descriptor = "J")
	private long aLong269 = -1L;

	@OriginalMember(owner = "client!uha", name = "r", descriptor = "Ljava/lang/String;")
	private String aString111 = null;

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.method5429(this.aLong269, this.aString111);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		if (arg0.method5866() != 255) {
			arg0.anInt7264--;
			this.aLong269 = arg0.method5907();
		}
		this.aString111 = arg0.method5886();
		if (Static265.aBoolean318) {
			System.out.println("memberhash:" + this.aLong269 + " membername:" + this.aString111);
		}
	}
}
