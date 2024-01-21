import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AYYYSATX")
public final class Class3 {

	@OriginalMember(owner = "client!AYYYSATX", name = "f", descriptor = "Z")
	public boolean aBoolean4 = true;

	@OriginalMember(owner = "client!AYYYSATX", name = "a", descriptor = "I")
	public int anInt31;

	@OriginalMember(owner = "client!AYYYSATX", name = "b", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!AYYYSATX", name = "c", descriptor = "I")
	public int anInt33;

	@OriginalMember(owner = "client!AYYYSATX", name = "d", descriptor = "I")
	public int anInt34;

	@OriginalMember(owner = "client!AYYYSATX", name = "e", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!AYYYSATX", name = "g", descriptor = "I")
	public int anInt36;

	@OriginalMember(owner = "client!AYYYSATX", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt31 = arg0;
		this.anInt32 = arg1;
		this.anInt33 = arg2;
		this.anInt34 = arg3;
		this.anInt35 = arg4;
		this.anInt36 = arg5;
		this.aBoolean4 = arg6;
	}
}
