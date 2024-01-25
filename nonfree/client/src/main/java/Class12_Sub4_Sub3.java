import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class12_Sub4_Sub3 extends Class12_Sub4 implements Interface11 {

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "Lclient!we;")
	public Class12_Sub4 aClass12_Sub4_1;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIILclient!we;)V")
	public Class12_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static15.method440(arg1, arg0));
		this.aClass12_Sub4_1 = arg5;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)I")
	@Override
	public int method5027() {
		return 0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5026() {
		return false;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(Z)I")
	@Override
	public int method5025() {
		return 0;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return 0;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5028(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)I")
	@Override
	public int method5019() {
		return 0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	@Override
	public void method5022() {
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	@Override
	public Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		return null;
	}
}
