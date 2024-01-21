import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class3 {

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public int anInt159;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
	public int anInt161;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
	public int anInt162;

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class3() {
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class3(@OriginalArg(0) Class3 arg0) {
		this.anInt159 = arg0.anInt159;
		this.anInt161 = arg0.anInt161;
		this.anInt167 = arg0.anInt167;
		this.anInt162 = arg0.anInt162;
	}
}
