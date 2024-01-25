import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class Class92 implements Interface2 {

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "Lclient!ti;")
	public final Class339 aClass339_13;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	public final int anInt10905;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Lclient!in;")
	public final Class168 aClass168_13;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
	public final int anInt10908;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public final int anInt10910;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	public final int anInt10902;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
	public final int anInt10907;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public final int anInt10903;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public final int anInt10904;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!in;Lclient!ti;IIIIIII)V")
	public Class92(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass339_13 = arg1;
		this.anInt10905 = arg8;
		this.aClass168_13 = arg0;
		this.anInt10908 = arg2;
		this.anInt10910 = arg7;
		this.anInt10902 = arg3;
		this.anInt10907 = arg5;
		this.anInt10903 = arg4;
		this.anInt10904 = arg6;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Lclient!saa;")
	@Override
	public Class310 method9078() {
		return null;
	}
}
