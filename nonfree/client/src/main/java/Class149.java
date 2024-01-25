import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class149 implements Interface9 {

	@OriginalMember(owner = "client!io", name = "k", descriptor = "I")
	public final int anInt4674;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	public final int anInt4667;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "I")
	public final int anInt4675;

	@OriginalMember(owner = "client!io", name = "g", descriptor = "I")
	public final int anInt4671;

	@OriginalMember(owner = "client!io", name = "h", descriptor = "I")
	public final int anInt4672;

	@OriginalMember(owner = "client!io", name = "t", descriptor = "I")
	public final int anInt4681;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "Lclient!mea;")
	public final Class201 aClass201_10;

	@OriginalMember(owner = "client!io", name = "d", descriptor = "I")
	public final int anInt4668;

	@OriginalMember(owner = "client!io", name = "u", descriptor = "I")
	public final int anInt4682;

	@OriginalMember(owner = "client!io", name = "p", descriptor = "I")
	public final int anInt4678;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString112;

	@OriginalMember(owner = "client!io", name = "q", descriptor = "Lclient!ja;")
	public final Class154 aClass154_9;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	public final int anInt4665;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!ja;Lclient!mea;IIIIIIIIII)V")
	public Class149(@OriginalArg(0) String arg0, @OriginalArg(1) Class154 arg1, @OriginalArg(2) Class201 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt4674 = arg9;
		this.anInt4667 = arg11;
		this.anInt4675 = arg4;
		this.anInt4671 = arg7;
		this.anInt4672 = arg6;
		this.anInt4681 = arg10;
		this.aClass201_10 = arg2;
		this.anInt4668 = arg5;
		this.anInt4682 = arg8;
		this.anInt4678 = arg3;
		this.aString112 = arg0;
		this.aClass154_9 = arg1;
		this.anInt4665 = arg12;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)Lclient!eu;")
	@Override
	public Class95 method6314() {
		return Static549.aClass95_8;
	}
}
