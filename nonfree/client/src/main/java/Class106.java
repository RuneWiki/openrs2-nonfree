import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class106 {

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	public int anInt3973;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	public int anInt3977;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
	public int anInt3979;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	public int anInt3980;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class106() {
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!ng;)V")
	public Class106(@OriginalArg(0) Class106 arg0) {
		this.anInt3977 = arg0.anInt3977;
		this.anInt3980 = arg0.anInt3980;
		this.anInt3973 = arg0.anInt3973;
		this.anInt3979 = arg0.anInt3979;
	}
}
