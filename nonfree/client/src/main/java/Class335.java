import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class335 {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "Lclient!q;")
	public Class93 aClass93_9;

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "Lclient!vp;")
	public Class335 aClass335_2;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
	public int anInt9655;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
	public int anInt9657;

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
	public int anInt9658;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
	public final int anInt9661;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
	public final int anInt9662;

	static {
		new Class195("", 76);
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(II)V")
	public Class335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9661 = arg0;
		this.anInt9662 = arg1;
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!vp;I)V")
	public Class335(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1) {
		this.aClass335_2 = arg0;
		this.aClass93_9 = this.aClass335_2.aClass93_9;
		this.anInt9661 = this.aClass335_2.anInt9661;
		this.anInt9662 = arg1 + this.aClass335_2.anInt9662;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI)Lclient!vp;")
	public Class335 method7727(@OriginalArg(1) int arg0) {
		return new Class335(this.anInt9661, arg0);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Lclient!rp;")
	public Class282 method7729() {
		return Static259.method3985(this.anInt9661);
	}
}
