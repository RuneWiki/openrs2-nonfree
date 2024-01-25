import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class10_Sub5_Sub3 extends Class10_Sub5 implements Interface17 {

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "Lclient!lw;")
	public Class10_Sub5 aClass10_Sub5_2;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIILclient!lw;)V")
	public Class10_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub5 arg3) {
		super(arg0, arg1, arg2, arg3.aShort125, false, false);
		this.aClass10_Sub5_2 = arg3;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return false;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return this.aClass10_Sub5_2.method7731(arg0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return false;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return 0;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return 0;
	}
}
