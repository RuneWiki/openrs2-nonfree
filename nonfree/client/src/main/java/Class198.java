import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class198 implements Interface27 {

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	public final int anInt5624;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
	public final int anInt5629;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!fe;")
	public final Class103 aClass103_3;

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
	public final int anInt5626;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
	public final int anInt5620;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
	public final int anInt5623;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "Z")
	public final boolean aBoolean424;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	public final int anInt5622;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
	public final int anInt5618;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
	public final int anInt5625;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "Lclient!mp;")
	public final Class236 aClass236_3;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(ILclient!mp;Lclient!fe;IIIIIIIZ)V")
	public Class198(@OriginalArg(0) int arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt5624 = arg9;
		this.anInt5629 = arg4;
		this.aClass103_3 = arg2;
		this.anInt5626 = arg3;
		this.anInt5620 = arg5;
		this.anInt5623 = arg8;
		this.aBoolean424 = arg10;
		this.anInt5622 = arg7;
		this.anInt5618 = arg0;
		this.anInt5625 = arg6;
		this.aClass236_3 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lclient!hl;")
	@Override
	public Class148 method9592() {
		return Static601.aClass148_21;
	}
}
