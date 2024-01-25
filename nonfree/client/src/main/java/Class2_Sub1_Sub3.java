import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 implements Interface22 {

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "Lclient!pga;")
	public Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(IIILclient!pga;)V")
	public Class2_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1 arg3) {
		super(arg0, arg1, arg2, arg3.aShort128, false, false);
		this.aClass2_Sub1_2 = arg3;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return 0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return false;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return false;
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return this.aClass2_Sub1_2.method8385(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return 0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return 0;
	}
}
