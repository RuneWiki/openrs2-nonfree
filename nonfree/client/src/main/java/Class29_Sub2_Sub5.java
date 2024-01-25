import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class29_Sub2_Sub5 extends Class29_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!tl", name = "E", descriptor = "Lclient!hc;")
	public Class29_Sub2 aClass29_Sub2_2;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IIIIIIIIIILclient!hc;)V")
	public Class29_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class29_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static190.method3485(arg1, arg0));
		this.aClass29_Sub2_2 = arg10;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7550() {
		return false;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		return this.aClass29_Sub2_2.method7539(arg0);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I")
	@Override
	public int method7553() {
		return 0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
	@Override
	public void method7537() {
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)I")
	@Override
	public int method7551() {
		return 0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)I")
	@Override
	public int method7546() {
		return 0;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V")
	@Override
	public void method7554() {
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7556(@OriginalArg(1) Class121 arg0) {
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class22 method7557(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7540() {
		return false;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7552(@OriginalArg(1) Class121 arg0) {
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
	@Override
	public int method7555() {
		return 0;
	}
}
