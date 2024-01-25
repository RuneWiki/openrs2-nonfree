import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!kea", name = "B", descriptor = "Lclient!fi;")
	public Class2_Sub3 aClass2_Sub3_3;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(IIIIILclient!fi;)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub3 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static595.method8404(arg1, arg0));
		this.aClass2_Sub3_3 = arg5;
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return 0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return false;
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)I")
	@Override
	public int method7700() {
		return 0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return 0;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return 0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return this.aClass2_Sub3_3.method8385(arg0);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
	}
}
