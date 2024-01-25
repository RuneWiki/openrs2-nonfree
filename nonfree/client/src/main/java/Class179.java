import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class179 implements Interface19 {

	@OriginalMember(owner = "client!js", name = "g", descriptor = "I")
	public final int anInt4822;

	@OriginalMember(owner = "client!js", name = "r", descriptor = "I")
	public final int anInt4828;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "I")
	public final int anInt4817;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "Z")
	public final boolean aBoolean386;

	@OriginalMember(owner = "client!js", name = "i", descriptor = "Lclient!rc;")
	public final Class279 aClass279_8;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "I")
	public final int anInt4819;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "I")
	public final int anInt4820;

	@OriginalMember(owner = "client!js", name = "f", descriptor = "I")
	public final int anInt4821;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "I")
	public final int anInt4825;

	@OriginalMember(owner = "client!js", name = "l", descriptor = "Lclient!ct;")
	public final Class62 aClass62_9;

	@OriginalMember(owner = "client!js", name = "q", descriptor = "I")
	public final int anInt4827;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(ILclient!ct;Lclient!rc;IIIIIIIZ)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class279 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt4822 = arg9;
		this.anInt4828 = arg5;
		this.anInt4817 = arg3;
		this.aBoolean386 = arg10;
		this.aClass279_8 = arg2;
		this.anInt4819 = arg0;
		this.anInt4820 = arg6;
		this.anInt4821 = arg7;
		this.anInt4825 = arg4;
		this.aClass62_9 = arg1;
		this.anInt4827 = arg8;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Lclient!wea;")
	@Override
	public Class357 method7127() {
		return Static259.aClass357_7;
	}
}
