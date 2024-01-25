import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class5_Sub10_Sub3 extends Class5_Sub10 {

	@OriginalMember(owner = "client!is", name = "l", descriptor = "B")
	private byte aByte46;

	@OriginalMember(owner = "client!is", name = "n", descriptor = "I")
	private int anInt4108;

	@OriginalMember(owner = "client!is", name = "s", descriptor = "Ljava/lang/String;")
	private String aString36 = null;

	@OriginalMember(owner = "client!is", name = "q", descriptor = "J")
	private long aLong146 = -1L;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!rv;)V")
	@Override
	public void method7528(@OriginalArg(1) Class5_Sub15 arg0) {
		if (arg0.method3642() != 255) {
			arg0.anInt4144--;
			this.aLong146 = arg0.method3634();
		}
		this.aString36 = arg0.method3691();
		this.anInt4108 = arg0.method3698();
		this.aByte46 = arg0.method3677();
		arg0.method3634();
		if (Static516.aBoolean292) {
			System.out.println("memberhash:" + this.aLong146 + " membername:" + this.aString36);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!ua;I)V")
	@Override
	public void method7530(@OriginalArg(0) Class5_Sub49 arg0) {
		@Pc(13) Class192 local13 = new Class192();
		local13.anInt4514 = this.anInt4108;
		local13.aString42 = this.aString36;
		local13.aByte52 = this.aByte46;
		arg0.method7999(local13);
	}
}
