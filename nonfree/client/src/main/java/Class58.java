import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class58 {

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "Lclient!nr;")
	private Class2 aClass2_43;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
	private int anInt1180 = 0;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Lclient!cm;")
	private final Class41 aClass41_7;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray2[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!cm;)V")
	public Class58(@OriginalArg(0) Class41 arg0) {
		this.aClass41_7 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Lclient!nr;")
	public Class2 method1361() {
		this.anInt1180 = 0;
		return this.method1364();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)Lclient!nr;")
	public Class2 method1364() {
		@Pc(22) Class2 local22;
		if (this.anInt1180 > 0 && this.aClass2_43 != this.aClass41_7.aClass2Array1[this.anInt1180 - 1]) {
			local22 = this.aClass2_43;
			this.aClass2_43 = local22.aClass2_251;
			return local22;
		}
		while (this.aClass41_7.anInt766 > this.anInt1180) {
			local22 = this.aClass41_7.aClass2Array1[this.anInt1180++].aClass2_251;
			if (local22 != this.aClass41_7.aClass2Array1[this.anInt1180 - 1]) {
				this.aClass2_43 = local22.aClass2_251;
				return local22;
			}
		}
		return null;
	}
}
