import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 {

	@OriginalMember(owner = "client!aka", name = "q", descriptor = "J")
	private long aLong26 = -1L;

	@OriginalMember(owner = "client!aka", name = "r", descriptor = "Ljava/lang/String;")
	private String aString3 = null;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.method5418(this.aString3, this.aLong26);
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		if (arg0.method3642() != 255) {
			arg0.anInt4144--;
			this.aLong26 = arg0.method3634();
		}
		this.aString3 = arg0.method3691();
		if (Static478.aBoolean592) {
			System.out.println("memberhash:" + this.aLong26 + " membername:" + this.aString3);
		}
	}
}
