import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Lclient!ei;")
	public Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIILclient!ei;)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass3_Sub1_1 = arg3;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)I")
	@Override
	public int method5155() {
		return 0;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)I")
	@Override
	public int method5153() {
		return 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)I")
	@Override
	public int method5149() {
		return 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5151(@OriginalArg(1) Class49 arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5156(@OriginalArg(1) Class49 arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5152() {
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!ya;I)Lclient!t;")
	@Override
	public Class91 method5154(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	@Override
	public void method5150() {
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5135() {
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)V")
	@Override
	public void method5144() {
	}
}
