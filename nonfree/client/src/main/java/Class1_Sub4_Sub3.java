import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!v", name = "x", descriptor = "Lclient!o;")
	public final Class1_Sub4 aClass1_Sub4_2;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIILclient!o;)V")
	public Class1_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub4 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass1_Sub4_2 = arg3;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5500(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5759() {
		return false;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)I")
	@Override
	public int method5502() {
		return 0;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!dr;)V")
	@Override
	public void method5498(@OriginalArg(1) Class37 arg0) {
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
	@Override
	public void method5504() {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I")
	@Override
	public int method5501() {
		return 0;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)I")
	@Override
	public int method5503() {
		return 0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	@Override
	public Class49 method5499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5497() {
		return false;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	@Override
	public void method5761() {
	}
}
