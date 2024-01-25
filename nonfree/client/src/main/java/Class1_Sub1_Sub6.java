import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!rca", name = "u", descriptor = "Lclient!lba;")
	public Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(IIIIIIIIIILclient!lba;)V")
	public Class1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class1_Sub1 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static405.method6386(arg1, arg0));
		this.aClass1_Sub1_2 = arg10;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V")
	@Override
	public void method7683() {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return this.aClass1_Sub1_2.method7676(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7682(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "(I)I")
	@Override
	public int method6432() {
		return 0;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7684() {
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)I")
	@Override
	public int method7687() {
		return 0;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)I")
	@Override
	public int method7685() {
		return 0;
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)I")
	@Override
	public int method7688() {
		return 0;
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7686(@OriginalArg(0) Class39 arg0) {
	}
}
