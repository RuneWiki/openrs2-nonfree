import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class162 {

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	public int anInt4676;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	public int anInt4680;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
	public int anInt4684;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
	public int anInt4679 = 128;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	public int anInt4675 = 128;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
	public int anInt4674;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
	public Class162(@OriginalArg(0) int arg0) {
		this.anInt4674 = arg0;
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIII)V")
	private Class162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4679 = arg1;
		this.anInt4675 = arg2;
		this.anInt4684 = arg4;
		this.anInt4676 = arg3;
		this.anInt4674 = arg0;
		this.anInt4680 = arg5;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!ik;)V")
	public void method4100(@OriginalArg(1) Class162 arg0) {
		this.anInt4679 = arg0.anInt4679;
		this.anInt4674 = arg0.anInt4674;
		this.anInt4684 = arg0.anInt4684;
		this.anInt4676 = arg0.anInt4676;
		this.anInt4675 = arg0.anInt4675;
		this.anInt4680 = arg0.anInt4680;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)Lclient!ik;")
	public Class162 method4103() {
		return new Class162(this.anInt4674, this.anInt4679, this.anInt4675, this.anInt4676, this.anInt4684, this.anInt4680);
	}
}
