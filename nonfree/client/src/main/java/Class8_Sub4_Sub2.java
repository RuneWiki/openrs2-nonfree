import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class8_Sub4_Sub2 extends Class8_Sub4 implements Interface4 {

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "Lclient!kn;")
	public Class8_Sub4 aClass8_Sub4_2;

	static {
		new Class15("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIILclient!kn;)V")
	public Class8_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub4 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass8_Sub4_2 = arg3;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5605(@OriginalArg(1) Class135 arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
	@Override
	public int method5606() {
		return 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	@Override
	public void method5607() {
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)I")
	@Override
	public int method5603() {
		return 0;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	@Override
	public Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)I")
	@Override
	public int method5600() {
		return 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5602() {
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5601(@OriginalArg(1) Class135 arg0) {
	}
}
