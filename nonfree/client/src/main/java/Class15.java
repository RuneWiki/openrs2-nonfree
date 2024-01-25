import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public final class Class15 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "I")
	public int anInt334;

	@OriginalMember(owner = "client!at", name = "b", descriptor = "Lclient!ia;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!at", name = "d", descriptor = "I")
	public int anInt336;

	@OriginalMember(owner = "client!at", name = "g", descriptor = "Lclient!at;")
	public Class15 aClass15_1;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "I")
	public int anInt340;

	@OriginalMember(owner = "client!at", name = "e", descriptor = "I")
	public final int anInt337;

	@OriginalMember(owner = "client!at", name = "h", descriptor = "I")
	public final int anInt338;

	static {
		new Class151("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(II)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt337 = arg1;
		this.anInt338 = arg0;
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!at;I)V")
	public Class15(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		this.aClass15_1 = arg0;
		this.anInt337 = arg1 + this.aClass15_1.anInt337;
		this.aClass40_1 = this.aClass15_1.aClass40_1;
		this.anInt338 = this.aClass15_1.anInt338;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)Lclient!rp;")
	public Class216 method278() {
		return Static2.method2553(this.anInt338);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Lclient!at;")
	public Class15 method280(@OriginalArg(0) int arg0) {
		return new Class15(this.anInt338, arg0);
	}
}
