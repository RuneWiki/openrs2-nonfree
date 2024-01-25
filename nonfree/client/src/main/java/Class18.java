import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class18 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public int anInt155;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	public int anInt156;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "I")
	public int anInt157;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	public Class18() {
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!am;)V")
	public Class18(@OriginalArg(0) Class18 arg0) {
		this.anInt156 = arg0.anInt156;
		this.anInt155 = arg0.anInt155;
		this.anInt157 = arg0.anInt157;
		this.anInt154 = arg0.anInt154;
	}
}
