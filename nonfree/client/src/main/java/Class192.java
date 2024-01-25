import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class192 implements Interface1 {

	@OriginalMember(owner = "client!la", name = "f", descriptor = "I")
	public final int anInt6135;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	public final int anInt6136;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public final int anInt6139;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "I")
	public final int anInt6140;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "I")
	public final int anInt6143;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "I")
	public final int anInt6142;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public final int anInt6138;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!kfa;")
	public final Class178 aClass178_9;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!gq;")
	public final Class117 aClass117_10;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	public final int anInt6133;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public final int anInt6132;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "I")
	public final int anInt6141;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!gq;Lclient!kfa;IIIIIIIIII)V")
	public Class192(@OriginalArg(0) String arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt6135 = arg11;
		this.anInt6136 = arg7;
		this.aString65 = arg0;
		this.anInt6139 = arg5;
		this.anInt6140 = arg10;
		this.anInt6143 = arg4;
		this.anInt6142 = arg12;
		this.anInt6138 = arg6;
		this.aClass178_9 = arg2;
		this.aClass117_10 = arg1;
		this.anInt6133 = arg8;
		this.anInt6132 = arg9;
		this.anInt6141 = arg3;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)Lclient!qi;")
	@Override
	public Class275 method8059() {
		return Static441.aClass275_6;
	}
}
