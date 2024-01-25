import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class20_Sub2_Sub3 extends Class20_Sub2 implements Interface9 {

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "Lclient!sm;")
	public Class20_Sub2 aClass20_Sub2_2;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIILclient!sm;)V")
	public Class20_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub2 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass20_Sub2_2 = arg3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	@Override
	public void method5123() {
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)I")
	@Override
	public int method5125() {
		return 0;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5128() {
		return false;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	@Override
	public int method5122() {
		return 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return false;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)I")
	@Override
	public int method5124() {
		return 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	@Override
	public Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5121(@OriginalArg(1) Class128 arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5126(@OriginalArg(0) Class128 arg0) {
	}
}
