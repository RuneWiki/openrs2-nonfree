import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class54 {

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
	public int anInt2011;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
	public int anInt2013;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	public int anInt2015;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	public int anInt2016;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class54() {
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!fn;)V")
	public Class54(@OriginalArg(0) Class54 arg0) {
		this.anInt2013 = arg0.anInt2013;
		this.anInt2015 = arg0.anInt2015;
		this.anInt2016 = arg0.anInt2016;
		this.anInt2011 = arg0.anInt2011;
	}
}
