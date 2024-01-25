import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class25_Sub1_Sub5 extends Class25_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "Lclient!ug;")
	public Class25_Sub1 aClass25_Sub1_2;

	static {
		new Class169("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIIIIIILclient!ug;)V")
	public Class25_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class25_Sub1 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static247.method3681(arg0, arg1));
		this.aClass25_Sub1_2 = arg10;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return 0;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)I")
	@Override
	public int method5239() {
		return 0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return 0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return 0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
	}
}
