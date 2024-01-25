import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class28_Sub2_Sub1 extends Class28_Sub2 implements Interface3 {

	@OriginalMember(owner = "client!c", name = "w", descriptor = "Lclient!sk;")
	public Class28_Sub2 aClass28_Sub2_1;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IIILclient!sk;)V")
	public Class28_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28_Sub2 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass28_Sub2_1 = arg3;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return 0;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5427() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method5424(@OriginalArg(1) Class155 arg0) {
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)I")
	@Override
	public int method5423() {
		return 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!np;I)V")
	@Override
	public void method5426(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	@Override
	public Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)I")
	@Override
	public int method5420() {
		return 0;
	}
}
