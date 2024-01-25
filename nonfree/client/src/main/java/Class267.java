import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class267 {

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	public int anInt7750;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
	public int anInt7754;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	public int anInt7755;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public int anInt7747 = 128;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	public int anInt7753 = 128;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
	public int anInt7749;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray2[local6] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class267(@OriginalArg(0) int arg0) {
		this.anInt7749 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIII)V")
	private Class267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7749 = arg0;
		this.anInt7753 = arg2;
		this.anInt7754 = arg5;
		this.anInt7755 = arg4;
		this.anInt7750 = arg3;
		this.anInt7747 = arg1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lclient!wd;")
	public Class267 method6176() {
		return new Class267(this.anInt7749, this.anInt7747, this.anInt7753, this.anInt7750, this.anInt7755, this.anInt7754);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method6179(@OriginalArg(0) Class267 arg0) {
		this.anInt7749 = arg0.anInt7749;
		this.anInt7753 = arg0.anInt7753;
		this.anInt7755 = arg0.anInt7755;
		this.anInt7747 = arg0.anInt7747;
		this.anInt7750 = arg0.anInt7750;
		this.anInt7754 = arg0.anInt7754;
	}
}
