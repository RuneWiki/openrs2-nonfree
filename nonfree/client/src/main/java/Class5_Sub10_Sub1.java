import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class5_Sub10_Sub1 extends Class5_Sub10 {

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
	private int anInt634;

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
	private int anInt631 = -1;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ua;I)V")
	@Override
	public void method7530(@OriginalArg(0) Class5_Sub49 arg0) {
		@Pc(9) Class192 local9 = arg0.aClass192Array1[this.anInt631];
		local9.aByte52 = this.aByte6;
		local9.aString42 = this.aString6;
		local9.anInt4514 = this.anInt634;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!rv;)V")
	@Override
	public void method7528(@OriginalArg(1) Class5_Sub15 arg0) {
		this.anInt631 = arg0.method3698();
		this.aByte6 = arg0.method3677();
		this.anInt634 = arg0.method3698();
		arg0.method3634();
		this.aString6 = arg0.method3661();
	}
}
