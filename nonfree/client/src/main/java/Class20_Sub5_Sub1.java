import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public final class Class20_Sub5_Sub1 extends Class20_Sub5 implements Interface7 {

	@OriginalMember(owner = "client!lca", name = "F", descriptor = "Lclient!wv;")
	public Class20_Sub5 aClass20_Sub5_2;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIILclient!wv;)V")
	public Class20_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub5 arg3) {
		super(arg0, arg1, arg2, arg3.aShort112, false, false);
		this.aClass20_Sub5_2 = arg3;
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8038() {
		return false;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)I")
	@Override
	public int method8047() {
		return 0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method8045(@OriginalArg(0) Class4 arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class97 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(B)V")
	@Override
	public void method8036() {
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V")
	@Override
	public void method8050() {
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return false;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)I")
	@Override
	public int method8046() {
		return 0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method8043(@OriginalArg(1) Class4 arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)I")
	@Override
	public int method8044() {
		return 0;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		return this.aClass20_Sub5_2.method8031(arg0);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
	}
}
