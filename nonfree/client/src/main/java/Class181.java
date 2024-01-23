import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class181 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Z")
	public boolean aBoolean353 = true;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public int anInt5427;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public int anInt5425;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	public int anInt5430;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	public int anInt5429;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	public int anInt5426;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public int anInt5424;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt5427 = arg3;
		this.anInt5425 = arg5;
		this.anInt5430 = arg2;
		this.anInt5429 = arg0;
		this.anInt5426 = arg4;
		this.aBoolean353 = arg6;
		this.anInt5424 = arg1;
	}
}
