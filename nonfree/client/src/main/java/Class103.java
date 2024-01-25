import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class Class103 implements Interface3 {

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	public final int anInt8648;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	public final int anInt8646;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
	public final int anInt8650;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	public final int anInt8653;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
	public final int anInt8641;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!ft;")
	public final Class125 aClass125_16;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
	public final int anInt8643;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Lclient!ps;")
	public final Class291 aClass291_14;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public final int anInt8644;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!ps;Lclient!ft;IIIIIII)V")
	public Class103(@OriginalArg(0) Class291 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8648 = arg6;
		this.anInt8646 = arg4;
		this.anInt8650 = arg3;
		this.anInt8653 = arg5;
		this.anInt8641 = arg7;
		this.aClass125_16 = arg1;
		this.anInt8643 = arg2;
		this.aClass291_14 = arg0;
		this.anInt8644 = arg8;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class210 method7539() {
		return null;
	}
}
