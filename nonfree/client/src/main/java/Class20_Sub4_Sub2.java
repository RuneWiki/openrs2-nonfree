import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class20_Sub4_Sub2 extends Class20_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "Lclient!qn;")
	public Class20_Sub4 aClass20_Sub4_3;

	static {
		new Class45("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIILclient!qn;)V")
	public Class20_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static288.method5068(arg0, arg1));
		this.aClass20_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class97 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)I")
	@Override
	public int method8047() {
		return 0;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return false;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)I")
	@Override
	public int method6522() {
		return 0;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		return this.aClass20_Sub4_3.method8031(arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method8043(@OriginalArg(1) Class4 arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method8045(@OriginalArg(0) Class4 arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	@Override
	public int method8046() {
		return 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I")
	@Override
	public int method8044() {
		return 0;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	@Override
	public void method8050() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}
}
