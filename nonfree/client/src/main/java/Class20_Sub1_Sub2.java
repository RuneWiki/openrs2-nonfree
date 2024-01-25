import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class20_Sub1_Sub2 extends Class20_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "[Lclient!st;")
	public static final Class227[] aClass227Array1 = new Class227[5];

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "Lclient!lh;")
	public Class20_Sub1 aClass20_Sub1_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass227Array1.length; local4++) {
			aClass227Array1[local4] = new Class227();
		}
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(IIIIILclient!lh;)V")
	public Class20_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20_Sub1 arg5) {
		super(arg2, arg3, arg4, Static323.method4128(arg1, arg0));
		this.aClass20_Sub1_1 = arg5;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	@Override
	public void method5123() {
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)I")
	@Override
	public int method5125() {
		return 0;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	@Override
	public Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I")
	@Override
	public int method5124() {
		return 0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I")
	@Override
	public int method5122() {
		return 0;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5128() {
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5126(@OriginalArg(0) Class128 arg0) {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5121(@OriginalArg(1) Class128 arg0) {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
	}
}
