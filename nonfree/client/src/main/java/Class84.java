import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class Class84 implements Interface9 {

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
	public final int anInt10349;

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "Lclient!cq;")
	public final Class65 aClass65_17;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
	public final int anInt10343;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
	public final int anInt10344;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
	public final int anInt10346;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
	public final int anInt10345;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
	public final int anInt10347;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public final int anInt10342;

	@OriginalMember(owner = "client!dl", name = "o", descriptor = "Lclient!eaa;")
	public final Class92 aClass92_13;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!eaa;Lclient!cq;IIIIIII)V")
	public Class84(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt10349 = arg8;
		this.aClass65_17 = arg1;
		this.anInt10343 = arg4;
		this.anInt10344 = arg6;
		this.anInt10346 = arg7;
		this.anInt10345 = arg3;
		this.anInt10347 = arg2;
		this.anInt10342 = arg5;
		this.aClass92_13 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Class6 method8749() {
		return null;
	}
}
