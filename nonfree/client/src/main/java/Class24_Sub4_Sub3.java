import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public final class Class24_Sub4_Sub3 extends Class24_Sub4 implements Interface10 {

	@OriginalMember(owner = "client!qu", name = "B", descriptor = "Lclient!lv;")
	public Class24_Sub4 aClass24_Sub4_2;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(IIILclient!lv;)V")
	public Class24_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24_Sub4 arg3) {
		super(arg0, arg1, arg2, arg3.aShort78, false, false);
		this.aClass24_Sub4_2 = arg3;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!za;Z)V")
	@Override
	public void method5699(@OriginalArg(0) Class50 arg0) {
	}

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)I")
	@Override
	public int method5706() {
		return 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class63 method5703(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	@Override
	public void method5700() {
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class50 arg0) {
	}

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "(I)V")
	@Override
	public void method5690() {
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5692() {
		return false;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5701() {
		return false;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)I")
	@Override
	public int method5702() {
		return 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)I")
	@Override
	public int method5705() {
		return 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
	}
}
