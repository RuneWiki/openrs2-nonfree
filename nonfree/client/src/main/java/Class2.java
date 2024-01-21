import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AJVAEYAN")
public final class Class2 {

	@OriginalMember(owner = "client!AJVAEYAN", name = "f", descriptor = "Z")
	public boolean aBoolean1 = true;

	@OriginalMember(owner = "client!AJVAEYAN", name = "a", descriptor = "I")
	public int anInt7;

	@OriginalMember(owner = "client!AJVAEYAN", name = "b", descriptor = "I")
	public int anInt8;

	@OriginalMember(owner = "client!AJVAEYAN", name = "c", descriptor = "I")
	public int anInt9;

	@OriginalMember(owner = "client!AJVAEYAN", name = "d", descriptor = "I")
	public int anInt10;

	@OriginalMember(owner = "client!AJVAEYAN", name = "e", descriptor = "I")
	public int anInt11;

	@OriginalMember(owner = "client!AJVAEYAN", name = "g", descriptor = "I")
	public int anInt12;

	@OriginalMember(owner = "client!AJVAEYAN", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt7 = arg0;
		this.anInt8 = arg1;
		this.anInt9 = arg2;
		this.anInt10 = arg3;
		this.anInt11 = arg4;
		this.anInt12 = arg5;
		this.aBoolean1 = arg6;
	}
}
