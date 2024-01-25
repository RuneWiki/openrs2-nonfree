import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class375 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
	public int anInt10160;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
	public int anInt10161;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	public int anInt10162;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
	public int anInt10163;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class375() {
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!wp;)V")
	public Class375(@OriginalArg(0) Class375 arg0) {
		this.anInt10160 = arg0.anInt10160;
		this.anInt10163 = arg0.anInt10163;
		this.anInt10161 = arg0.anInt10161;
		this.anInt10162 = arg0.anInt10162;
	}
}
