import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class20_Sub4_Sub2 extends Class20_Sub4 implements Interface9 {

	@OriginalMember(owner = "client!jm", name = "H", descriptor = "Lclient!wo;")
	public Class20_Sub4 aClass20_Sub4_3;

	static {
		new Class151("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(IIIIILclient!wo;)V")
	public Class20_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static133.method1796(arg0, arg1));
		this.aClass20_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5128() {
		return false;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	@Override
	public Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)I")
	@Override
	public int method5122() {
		return 0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
	@Override
	public void method5123() {
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5126(@OriginalArg(0) Class128 arg0) {
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)I")
	@Override
	public int method5124() {
		return 0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5121(@OriginalArg(1) Class128 arg0) {
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)I")
	@Override
	public int method5125() {
		return 0;
	}

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "(B)I")
	@Override
	public int method5118() {
		return 0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
	}
}
