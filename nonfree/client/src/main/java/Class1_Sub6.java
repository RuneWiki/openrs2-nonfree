import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public int anInt458;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt459;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt460;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public int anInt461;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!fc;")
	public Class11 aClass11_2;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public int anInt463;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public int anInt464;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIILclient!fc;II)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt458 = arg1;
		this.anInt459 = arg0;
		this.anInt460 = arg5;
		this.anInt461 = arg6;
		this.anInt462 = arg2;
		this.aClass11_2 = arg4;
		this.anInt463 = -1;
		this.anInt464 = 0;
	}
}
