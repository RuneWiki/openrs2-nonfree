import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class11_Sub4_Sub1 extends Class11_Sub4 implements Interface4 {

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "Lclient!ds;")
	public final Class11_Sub4 aClass11_Sub4_3;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIILclient!ds;)V")
	public Class11_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static232.method4297(arg1, arg0));
		this.aClass11_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	@Override
	public void method5923() {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!fp;Z)V")
	@Override
	public void method5920(@OriginalArg(0) Class63 arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
	@Override
	public int method5922() {
		return 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!fp;I)V")
	@Override
	public void method5926(@OriginalArg(0) Class63 arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)I")
	@Override
	public int method5916() {
		return 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5924() {
		return false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	@Override
	public Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)I")
	@Override
	public int method5925() {
		return 0;
	}
}
