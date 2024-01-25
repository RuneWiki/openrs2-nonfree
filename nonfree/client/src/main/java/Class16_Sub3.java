import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
	public int anInt739;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Z")
	public boolean aBoolean73;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
	public int anInt744;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!fi;BZLclient!ya;I)V")
	@Override
	public final void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	@Override
	public final void method5333() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method5338() {
		return false;
	}
}
