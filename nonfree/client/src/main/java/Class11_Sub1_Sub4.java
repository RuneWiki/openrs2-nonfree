import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class11_Sub1_Sub4 extends Class11_Sub1 implements Interface17 {

	@OriginalMember(owner = "client!ji", name = "O", descriptor = "Lclient!fu;")
	public Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIIIIIIILclient!fu;)V")
	public Class11_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class11_Sub1 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static118.method2355(arg1, arg0));
		this.aClass11_Sub1_1 = arg10;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8116() {
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	@Override
	public void method8115() {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)I")
	@Override
	public int method8114() {
		return 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method8118(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8120(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
	@Override
	public void method8107() {
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I")
	@Override
	public int method8119() {
		return 0;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class23 method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8105() {
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)I")
	@Override
	public int method6199() {
		return 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		return this.aClass11_Sub1_1.method8106(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)I")
	@Override
	public int method8121() {
		return 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		return null;
	}
}
