import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class12_Sub5_Sub3 extends Class12_Sub5 implements Interface11 {

	@OriginalMember(owner = "client!sh", name = "C", descriptor = "Lclient!of;")
	public Class12_Sub5 aClass12_Sub5_1;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIILclient!of;)V")
	public Class12_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub5 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass12_Sub5_1 = arg3;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return 0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return false;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	@Override
	public Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)I")
	@Override
	public int method5027() {
		return 0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5026() {
		return false;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)I")
	@Override
	public int method5025() {
		return 0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
	@Override
	public void method5022() {
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5028(@OriginalArg(0) Class82 arg0) {
	}
}
