import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 implements Interface10 {

	@OriginalMember(owner = "client!mm", name = "N", descriptor = "Lclient!jk;")
	public Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIILclient!jk;)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static100.method403(arg0, arg1));
		this.aClass3_Sub4_1 = arg5;
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)I")
	@Override
	public int method5811() {
		return 0;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	@Override
	public void method5810() {
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!cd;")
	@Override
	public Class39 method5808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)I")
	@Override
	public int method5807() {
		return 0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)I")
	@Override
	public int method4354() {
		return 0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method5813(@OriginalArg(0) Class28 arg0) {
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5806() {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I")
	@Override
	public int method5812() {
		return 0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5809(@OriginalArg(1) Class28 arg0) {
	}
}
