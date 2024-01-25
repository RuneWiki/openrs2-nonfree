import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public final class Class321 {

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
	public int anInt8183;

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
	public int anInt8185;

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
	public int anInt8188;

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
	public int anInt8192;

	@OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
	public int anInt8193;

	@OriginalMember(owner = "client!tea", name = "r", descriptor = "I")
	public int anInt8196;

	@OriginalMember(owner = "client!tea", name = "t", descriptor = "I")
	public int anInt8198;

	@OriginalMember(owner = "client!tea", name = "v", descriptor = "I")
	public int anInt8200;

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
	public int anInt8186 = 128;

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
	public int anInt8184 = 128;

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
	public int anInt8190;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(I)V")
	public Class321(@OriginalArg(0) int arg0) {
		this.anInt8190 = arg0;
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(IIIIII)V")
	private Class321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8184 = arg2;
		this.anInt8190 = arg0;
		this.anInt8186 = arg1;
		this.anInt8198 = arg5;
		this.anInt8185 = arg3;
		this.anInt8200 = arg4;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)Lclient!tea;")
	public Class321 method6793() {
		return new Class321(this.anInt8190, this.anInt8186, this.anInt8184, this.anInt8185, this.anInt8200, this.anInt8198);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!tea;I)V")
	public void method6796(@OriginalArg(0) Class321 arg0) {
		this.anInt8190 = arg0.anInt8190;
		this.anInt8198 = arg0.anInt8198;
		this.anInt8184 = arg0.anInt8184;
		this.anInt8200 = arg0.anInt8200;
		this.anInt8186 = arg0.anInt8186;
		this.anInt8185 = arg0.anInt8185;
	}
}
