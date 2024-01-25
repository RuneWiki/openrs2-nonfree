import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public abstract class Class4_Sub2_Sub3 extends Class4_Sub2 {

	@OriginalMember(owner = "client!fp", name = "C", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4 = new Rectangle[100];

	@OriginalMember(owner = "client!fp", name = "B", descriptor = "S")
	public short aShort113;

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "S")
	public short aShort114;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray4[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class4_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.aByte131 = (byte) arg4;
		super.anInt10231 = arg0;
		super.anInt10228 = arg1;
		super.anInt10229 = arg2;
		this.aShort113 = (short) arg5;
		this.aShort114 = (short) arg6;
		super.aByte132 = (byte) arg3;
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8717() {
		return Static475.aBooleanArrayArray8[(super.anInt10231 >> Static115.anInt2156) + Static51.anInt1064 - Static260.anInt4712][Static51.anInt1064 + (super.anInt10229 >> Static115.anInt2156) - Static598.anInt10044];
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public final void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8722() {
		return false;
	}

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "(I)V")
	@Override
	public final void method8726() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([Lclient!vt;I)I")
	@Override
	public final int method8729(@OriginalArg(0) Class5_Sub11[] arg0) {
		return this.method8731(super.anInt10231 >> Static115.anInt2156, arg0, super.anInt10229 >> Static115.anInt2156);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8714(@OriginalArg(1) Class133 arg0) {
		return Static381.method5595(super.anInt10231 >> Static115.anInt2156, super.aByte131, super.anInt10229 >> Static115.anInt2156, this.method8734());
	}
}
