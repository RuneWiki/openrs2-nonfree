import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class25_Sub5_Sub2 extends Class25_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!oq", name = "G", descriptor = "Lclient!mp;")
	public Class25_Sub5 aClass25_Sub5_3;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIIILclient!mp;)V")
	public Class25_Sub5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class25_Sub5 arg5) {
		super(arg2, arg3, arg4, Static19.method206(arg1, arg0));
		this.aClass25_Sub5_3 = arg5;
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return false;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return false;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return 0;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return 0;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return 0;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
	}
}
