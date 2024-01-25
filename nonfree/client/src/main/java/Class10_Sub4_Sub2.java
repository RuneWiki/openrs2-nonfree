import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class10_Sub4_Sub2 extends Class10_Sub4 implements Interface17 {

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "Lclient!l;")
	public Class10_Sub4 aClass10_Sub4_3;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IIIIILclient!l;)V")
	public Class10_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class10_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static168.method3260(arg0, arg1));
		this.aClass10_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return false;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return 0;
	}

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "(B)I")
	@Override
	public int method7188() {
		return 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return this.aClass10_Sub4_3.method7731(arg0);
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		return null;
	}
}
