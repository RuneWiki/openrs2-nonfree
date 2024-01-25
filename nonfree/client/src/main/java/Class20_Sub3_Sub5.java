import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public final class Class20_Sub3_Sub5 extends Class20_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!r", name = "G", descriptor = "Lclient!sq;")
	public Class20_Sub3 aClass20_Sub3_2;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IIIIIIIIIILclient!sq;)V")
	public Class20_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static430.method5418(arg1, arg0));
		this.aClass20_Sub3_2 = arg10;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	@Override
	public Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)I")
	@Override
	public int method5097() {
		return 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	@Override
	public void method5123() {
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)I")
	@Override
	public int method5125() {
		return 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5126(@OriginalArg(0) Class128 arg0) {
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return false;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5128() {
		return false;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)I")
	@Override
	public int method5122() {
		return 0;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)I")
	@Override
	public int method5124() {
		return 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5121(@OriginalArg(1) Class128 arg0) {
	}
}
