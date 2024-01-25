import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class11_Sub3_Sub3 extends Class11_Sub3 implements Interface17 {

	@OriginalMember(owner = "client!sk", name = "H", descriptor = "Lclient!fj;")
	public Class11_Sub3 aClass11_Sub3_3;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIILclient!fj;)V")
	public Class11_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub3 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static557.method7937(arg1, arg0));
		this.aClass11_Sub3_3 = arg5;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)I")
	@Override
	public int method8119() {
		return 0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class23 method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	@Override
	public void method8115() {
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		return this.aClass11_Sub3_3.method8106(arg0);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8120(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)I")
	@Override
	public int method7208() {
		return 0;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8116() {
		return false;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I")
	@Override
	public int method8114() {
		return 0;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)I")
	@Override
	public int method8121() {
		return 0;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method8118(@OriginalArg(0) Class9 arg0) {
	}
}
