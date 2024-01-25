import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public final class Class324 implements Interface15 {

	@OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
	public final int anInt8859;

	@OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
	public final int anInt8865;

	@OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
	public final int anInt8869;

	@OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
	public final int anInt8861;

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "Lclient!mq;")
	public final Class238 aClass238_10;

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
	public final int anInt8868;

	@OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
	public final int anInt8857;

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
	public final int anInt8863;

	@OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
	public final int anInt8858;

	@OriginalMember(owner = "client!sca", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString106;

	@OriginalMember(owner = "client!sca", name = "t", descriptor = "Lclient!rj;")
	public final Class318 aClass318_18;

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
	public final int anInt8864;

	@OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
	public final int anInt8866;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!rj;Lclient!mq;IIIIIIIIII)V")
	public Class324(@OriginalArg(0) String arg0, @OriginalArg(1) Class318 arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt8859 = arg5;
		this.anInt8865 = arg7;
		this.anInt8869 = arg9;
		this.anInt8861 = arg6;
		this.aClass238_10 = arg2;
		this.anInt8868 = arg8;
		this.anInt8857 = arg10;
		this.anInt8863 = arg4;
		this.anInt8858 = arg3;
		this.aString106 = arg0;
		this.aClass318_18 = arg1;
		this.anInt8864 = arg12;
		this.anInt8866 = arg11;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)Lclient!uu;")
	@Override
	public Class369 method8734() {
		return Static158.aClass369_6;
	}
}
