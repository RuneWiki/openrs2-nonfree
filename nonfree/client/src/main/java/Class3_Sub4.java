import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public int anInt4296;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	public int anInt4300;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public int anInt4301;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "Z")
	public boolean aBoolean313;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(I)V")
	@Override
	public final void method5144() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public final void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method5135() {
		return false;
	}
}
