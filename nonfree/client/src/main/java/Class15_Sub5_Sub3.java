import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class15_Sub5_Sub3 extends Class15_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "Lclient!kd;")
	public Class15_Sub5 aClass15_Sub5_2;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IIILclient!kd;)V")
	public Class15_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub5 arg3) {
		super(arg0, arg1, arg2, arg3.aShort107, false, false);
		this.aClass15_Sub5_2 = arg3;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)I")
	@Override
	public int method6866() {
		return 0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6869(@OriginalArg(1) Class62 arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method6872(@OriginalArg(1) Class62 arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return this.aClass15_Sub5_2.method6854(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	@Override
	public void method6870() {
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I")
	@Override
	public int method6867() {
		return 0;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6871() {
		return false;
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)I")
	@Override
	public int method6868() {
		return 0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return false;
	}
}
