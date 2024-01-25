import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class191 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
	public int anInt5124;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public int anInt5125;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	public int anInt5126;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
	public int anInt5127;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class191() {
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!kn;)V")
	public Class191(@OriginalArg(0) Class191 arg0) {
		this.anInt5124 = arg0.anInt5124;
		this.anInt5126 = arg0.anInt5126;
		this.anInt5125 = arg0.anInt5125;
		this.anInt5127 = arg0.anInt5127;
	}
}
