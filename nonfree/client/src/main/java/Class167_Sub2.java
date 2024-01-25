import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class167_Sub2 extends Class167 implements Interface27 {

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
	private int anInt9557;

	static {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			aRectangleArray2[local10] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!lf;I[BI)V")
	public Class167_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9557 = arg1;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
	@Override
	public int method7794() {
		return 0;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)I")
	@Override
	public int method7796() {
		return this.anInt9557;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)J")
	@Override
	public long method7793() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[BBI)V")
	@Override
	public void method7795(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method7792(arg1, arg0);
		this.anInt9557 = 5123;
	}
}
