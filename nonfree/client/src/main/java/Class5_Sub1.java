import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	public final int anInt3097;

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
	public int anInt3089;

	@OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
	public int anInt3103;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
	public final int anInt3092;

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
	public int anInt3099;

	@OriginalMember(owner = "client!lq", name = "v", descriptor = "I")
	public int anInt3101;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
	protected final int anInt3095;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3097 = arg6;
		this.anInt3089 = arg0;
		this.anInt3103 = arg2;
		this.anInt3092 = arg3;
		this.anInt3099 = arg5;
		this.anInt3101 = arg4;
		this.anInt3095 = arg1;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	@Override
	public final void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)I")
	public abstract int method2536();

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method5327() {
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V")
	@Override
	public final void method5328() {
		throw new IllegalStateException();
	}
}
