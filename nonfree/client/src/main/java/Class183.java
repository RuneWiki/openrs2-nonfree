import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public final class Class183 implements Interface13 {

	@OriginalMember(owner = "client!kca", name = "k", descriptor = "Lclient!le;")
	public final Class204 aClass204_8;

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
	public final int anInt4591;

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
	public final int anInt4593;

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "Lclient!qj;")
	public final Class288 aClass288_8;

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
	public final int anInt4592;

	@OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
	public final int anInt4596;

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
	public final int anInt4589;

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
	public final int anInt4588;

	@OriginalMember(owner = "client!kca", name = "n", descriptor = "I")
	public final int anInt4595;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
	public final int anInt4587;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
	public final int anInt4590;

	@OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
	public final int anInt4597;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!le;Lclient!qj;IIIIIIIIII)V")
	public Class183(@OriginalArg(0) String arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) Class288 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aClass204_8 = arg1;
		this.anInt4591 = arg9;
		this.anInt4593 = arg6;
		this.aClass288_8 = arg2;
		this.anInt4592 = arg3;
		this.anInt4596 = arg7;
		this.anInt4589 = arg8;
		this.anInt4588 = arg11;
		this.anInt4595 = arg4;
		this.anInt4587 = arg12;
		this.aString67 = arg0;
		this.anInt4590 = arg5;
		this.anInt4597 = arg10;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)Lclient!mha;")
	@Override
	public Class228 method8022() {
		return Static472.aClass228_8;
	}
}
