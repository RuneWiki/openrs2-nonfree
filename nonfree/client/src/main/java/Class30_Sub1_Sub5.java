import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class30_Sub1_Sub5 extends Class30_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!ro", name = "B", descriptor = "Lclient!ol;")
	public Class30_Sub1 aClass30_Sub1_2;

	static {
		new Class158("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(IIIIIIIIIILclient!ol;)V")
	public Class30_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class30_Sub1 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static224.method5333(arg0, arg1));
		this.aClass30_Sub1_2 = arg10;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)I")
	@Override
	public int method5727() {
		return 0;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5728(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5731() {
		return false;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5732(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)I")
	@Override
	public int method5724() {
		return 0;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I")
	@Override
	public int method5729() {
		return 0;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)I")
	@Override
	public int method5730() {
		return 0;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
	@Override
	public void method5734() {
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return false;
	}
}
