import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class49_Sub2_Sub3 extends Class49_Sub2 implements Interface18 {

	@OriginalMember(owner = "client!ft", name = "F", descriptor = "Lclient!fu;")
	public Class49_Sub2 aClass49_Sub2_2;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(IIIIIIIIIILclient!fu;)V")
	public Class49_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class49_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static107.method1826(arg0, arg1));
		this.aClass49_Sub2_2 = arg10;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		return this.aClass49_Sub2_2.method7460(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)I")
	@Override
	public int method7467() {
		return 0;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7466(@OriginalArg(1) Class122 arg0) {
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class122 arg0) {
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7471() {
		return false;
	}

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return false;
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)I")
	@Override
	public int method5994() {
		return 0;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)I")
	@Override
	public int method7469() {
		return 0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
	@Override
	public void method7472() {
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	@Override
	public Class145 method7468(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)I")
	@Override
	public int method7465() {
		return 0;
	}
}
