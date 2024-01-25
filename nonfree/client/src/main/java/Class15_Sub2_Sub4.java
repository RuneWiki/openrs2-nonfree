import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class15_Sub2_Sub4 extends Class15_Sub2 implements Interface10 {

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!tv;")
	public Class15_Sub2 aClass15_Sub2_2;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIIIIIIILclient!tv;)V")
	public Class15_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class15_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static24.method3375(arg1, arg0));
		this.aClass15_Sub2_2 = arg10;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return this.aClass15_Sub2_2.method6854(arg0);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6869(@OriginalArg(1) Class62 arg0) {
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
	@Override
	public void method6870() {
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)I")
	@Override
	public int method6864() {
		return 0;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6871() {
		return false;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)I")
	@Override
	public int method6868() {
		return 0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
	@Override
	public int method6867() {
		return 0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)I")
	@Override
	public int method6866() {
		return 0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return false;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method6872(@OriginalArg(1) Class62 arg0) {
	}
}
