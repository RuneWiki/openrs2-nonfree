import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class20 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	public int anInt1152;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public int anInt1153;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	public int anInt1156;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
	public int anInt1157;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class20() {
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!ed;)V")
	public Class20(@OriginalArg(0) Class20 arg0) {
		this.anInt1156 = arg0.anInt1156;
		this.anInt1153 = arg0.anInt1153;
		this.anInt1157 = arg0.anInt1157;
		this.anInt1152 = arg0.anInt1152;
	}
}
