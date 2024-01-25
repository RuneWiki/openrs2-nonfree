import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class200 {

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray3 = new Rectangle[100];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public int anInt5559;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	public int anInt5560;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public int anInt5561;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt5562;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt5563;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt5564;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!qc;")
	public Class200 aClass200_2;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	public int anInt5565;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public int anInt5566;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	public int anInt5567;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "B")
	public final byte aByte85;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public final int anInt5570;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	public final int anInt5568;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
	private final int anInt5571;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	public final int anInt5573;

	static {
		for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
			aRectangleArray3[local15] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(IIIIB)V")
	public Class200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte85 = arg4;
		this.anInt5570 = arg3;
		this.anInt5568 = arg2;
		this.anInt5571 = arg0;
		this.anInt5573 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!qc;I)V")
	public Class200(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		this.aClass200_2 = arg0;
		this.anInt5568 = arg1 + this.aClass200_2.anInt5568;
		this.anInt5570 = this.aClass200_2.anInt5570 + arg1;
		this.aByte85 = this.aClass200_2.aByte85;
		this.anInt5571 = this.aClass200_2.anInt5571;
		this.anInt5573 = arg1 + this.aClass200_2.anInt5573;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)Lclient!qc;")
	public Class200 method4490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class200(this.anInt5571, arg0, arg2, arg1, this.aByte85);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Lclient!hc;")
	public Class102 method4493() {
		return Static115.method2050(this.anInt5571);
	}
}
