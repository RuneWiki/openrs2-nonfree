import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!tn", name = "B", descriptor = "Lclient!mca;")
	public Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIIIIIILclient!mca;)V")
	public Class2_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class2_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static210.method3689(arg0, arg1));
		this.aClass2_Sub2_2 = arg10;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return 0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return 0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return false;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)I")
	@Override
	public int method7629() {
		return 0;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return false;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return 0;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return this.aClass2_Sub2_2.method8385(arg0);
	}
}
