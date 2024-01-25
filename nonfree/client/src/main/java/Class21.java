import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class21 {

	@OriginalMember(owner = "client!an", name = "m", descriptor = "I")
	public int anInt304;

	@OriginalMember(owner = "client!an", name = "o", descriptor = "I")
	public int anInt305;

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	public int anInt307;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "I")
	public int anInt308;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "I")
	public int anInt309;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public int anInt312;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	public int anInt315;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "I")
	public int anInt318;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "I")
	public int anInt306 = 128;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "I")
	public int anInt316 = 128;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "I")
	public int anInt314;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(I)V")
	public Class21(@OriginalArg(0) int arg0) {
		this.anInt314 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIIII)V")
	private Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt305 = arg3;
		this.anInt315 = arg4;
		this.anInt304 = arg5;
		this.anInt316 = arg2;
		this.anInt306 = arg1;
		this.anInt314 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Lclient!an;")
	public Class21 method310() {
		return new Class21(this.anInt314, this.anInt306, this.anInt316, this.anInt305, this.anInt315, this.anInt304);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLclient!an;)V")
	public void method311(@OriginalArg(1) Class21 arg0) {
		this.anInt304 = arg0.anInt304;
		this.anInt306 = arg0.anInt306;
		this.anInt314 = arg0.anInt314;
		this.anInt315 = arg0.anInt315;
		this.anInt316 = arg0.anInt316;
		this.anInt305 = arg0.anInt305;
	}
}
