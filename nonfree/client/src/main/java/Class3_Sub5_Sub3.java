import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class3_Sub5_Sub3 extends Class3_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!vo", name = "N", descriptor = "Lclient!si;")
	public Class3_Sub5 aClass3_Sub5_2;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(IIILclient!si;)V")
	public Class3_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub5 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass3_Sub5_2 = arg3;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5806() {
		return false;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
	@Override
	public void method5810() {
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5791() {
		return false;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!cd;")
	@Override
	public Class39 method5808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)V")
	@Override
	public void method5798() {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)I")
	@Override
	public int method5807() {
		return 0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method5813(@OriginalArg(0) Class28 arg0) {
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)I")
	@Override
	public int method5811() {
		return 0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)I")
	@Override
	public int method5812() {
		return 0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5809(@OriginalArg(1) Class28 arg0) {
	}
}
