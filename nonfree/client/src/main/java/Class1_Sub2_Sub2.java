import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!en", name = "B", descriptor = "Lclient!bs;")
	public final Class1_Sub2 aClass1_Sub2_2;

	static {
		new Class140("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IIIIIIIIIILclient!bs;)V")
	public Class1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class1_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static183.method3480(arg0, arg1));
		this.aClass1_Sub2_2 = arg10;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I")
	@Override
	public int method5502() {
		return 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	@Override
	public Class49 method5499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
	@Override
	public void method5761() {
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)I")
	@Override
	public int method5503() {
		return 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5497() {
		return false;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)I")
	@Override
	public int method5501() {
		return 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5500(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
	@Override
	public void method5504() {
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)I")
	@Override
	public int method5766() {
		return 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BLclient!dr;)V")
	@Override
	public void method5498(@OriginalArg(1) Class37 arg0) {
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5759() {
		return false;
	}
}
