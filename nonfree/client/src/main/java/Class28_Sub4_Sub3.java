import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class28_Sub4_Sub3 extends Class28_Sub4 implements Interface3 {

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "Lclient!wm;")
	public Class28_Sub4 aClass28_Sub4_3;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIILclient!wm;)V")
	public Class28_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class28_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static312.method4798(arg1, arg0));
		this.aClass28_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method5424(@OriginalArg(1) Class155 arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)I")
	@Override
	public int method5419() {
		return 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	@Override
	public Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)I")
	@Override
	public int method5423() {
		return 0;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5427() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	@Override
	public int method5420() {
		return 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!np;I)V")
	@Override
	public void method5426(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		return null;
	}
}
