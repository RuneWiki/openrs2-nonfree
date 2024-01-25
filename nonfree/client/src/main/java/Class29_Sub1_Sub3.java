import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class29_Sub1_Sub3 extends Class29_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "Lclient!bg;")
	public Class29_Sub1 aClass29_Sub1_3;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IIIIILclient!bg;)V")
	public Class29_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class29_Sub1 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static290.method4083(arg1, arg0));
		this.aClass29_Sub1_3 = arg5;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)I")
	@Override
	public int method6070() {
		return 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class22 method7557(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7552(@OriginalArg(1) Class121 arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I")
	@Override
	public int method7555() {
		return 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)I")
	@Override
	public int method7553() {
		return 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)I")
	@Override
	public int method7551() {
		return 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		return this.aClass29_Sub1_3.method7539(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7556(@OriginalArg(1) Class121 arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
	@Override
	public void method7554() {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7550() {
		return false;
	}
}
