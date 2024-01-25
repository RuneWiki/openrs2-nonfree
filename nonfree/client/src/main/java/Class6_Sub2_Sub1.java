import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class6_Sub2_Sub1 extends Class6_Sub2 implements Interface15 {

	@OriginalMember(owner = "client!eo", name = "A", descriptor = "Lclient!bw;")
	public Class6_Sub2 aClass6_Sub2_1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(IIIIILclient!bw;)V")
	public Class6_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub2 arg5) {
		super(arg2, arg3, arg4, Static209.method3854(arg1, arg0));
		this.aClass6_Sub2_1 = arg5;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	@Override
	public Class2 method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7757() {
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		return this.aClass6_Sub2_1.method7751(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
	@Override
	public void method7760() {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)I")
	@Override
	public int method7764() {
		return 0;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
	@Override
	public void method7752() {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7743() {
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)I")
	@Override
	public int method7758() {
		return 0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7762(@OriginalArg(1) Class5 arg0) {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7759(@OriginalArg(1) Class5 arg0) {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)I")
	@Override
	public int method7761() {
		return 0;
	}
}
