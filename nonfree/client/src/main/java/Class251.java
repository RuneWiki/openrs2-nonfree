import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public final class Class251 {

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
	public int anInt6721;

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
	public int anInt6726;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
	public int anInt6727;

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
	public int anInt6720 = 128;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
	public int anInt6722 = 128;

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
	public int anInt6724;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(I)V")
	public Class251(@OriginalArg(0) int arg0) {
		this.anInt6724 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(IIIIII)V")
	private Class251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6721 = arg3;
		this.anInt6720 = arg2;
		this.anInt6724 = arg0;
		this.anInt6727 = arg5;
		this.anInt6726 = arg4;
		this.anInt6722 = arg1;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)Lclient!ov;")
	public Class251 method5748() {
		return new Class251(this.anInt6724, this.anInt6722, this.anInt6720, this.anInt6721, this.anInt6726, this.anInt6727);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!ov;I)V")
	public void method5751(@OriginalArg(0) Class251 arg0) {
		this.anInt6720 = arg0.anInt6720;
		this.anInt6722 = arg0.anInt6722;
		this.anInt6724 = arg0.anInt6724;
		this.anInt6721 = arg0.anInt6721;
		this.anInt6727 = arg0.anInt6727;
		this.anInt6726 = arg0.anInt6726;
	}
}
