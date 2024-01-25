import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class228 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
	public int anInt7054;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
	public int anInt7056;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
	public int anInt7058;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
	public int anInt7059;

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
	public int anInt7060;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
	public int anInt7062;

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
	public int anInt7066;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
	public int anInt7055 = 128;

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
	public int anInt7063 = 128;

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
	public int anInt7064;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(I)V")
	public Class228(@OriginalArg(0) int arg0) {
		this.anInt7064 = arg0;
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(IIIIII)V")
	private Class228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7064 = arg0;
		this.anInt7059 = arg4;
		this.anInt7060 = arg5;
		this.anInt7054 = arg3;
		this.anInt7063 = arg1;
		this.anInt7055 = arg2;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!pv;B)V")
	public void method5984(@OriginalArg(0) Class228 arg0) {
		this.anInt7059 = arg0.anInt7059;
		this.anInt7060 = arg0.anInt7060;
		this.anInt7064 = arg0.anInt7064;
		this.anInt7055 = arg0.anInt7055;
		this.anInt7063 = arg0.anInt7063;
		this.anInt7054 = arg0.anInt7054;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)Lclient!pv;")
	public Class228 method5985() {
		return new Class228(this.anInt7064, this.anInt7063, this.anInt7055, this.anInt7054, this.anInt7059, this.anInt7060);
	}
}
