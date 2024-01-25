import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class18_Sub3 extends Class18 {

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
	private final int anInt3545;

	@OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
	private final int anInt3544;

	@OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
	private final int anInt3548;

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
	private final int anInt3546;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(IIIIIII)V")
	public Class18_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3545 = arg0;
		this.anInt3544 = arg3;
		this.anInt3548 = arg1;
		this.anInt3546 = arg2;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3545 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt3546 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt3548 >> 12;
		@Pc(39) int local39 = this.anInt3544 * arg0 >> 12;
		Static32.method456(super.anInt3582, local17, local24, local39, super.anInt3587, local10, super.anInt3585);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
	@Override
	public void method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3545 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3546 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3548 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt3544 >> 12;
		Static67.method1166(local24, local36, super.anInt3587, local10, local17);
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(III)V")
	@Override
	public void method3076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
