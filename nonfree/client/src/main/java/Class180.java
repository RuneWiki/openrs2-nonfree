import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class180 {

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	public int anInt4722;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	public int anInt4723;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
	public int anInt4724;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
	public int anInt4721 = 128;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
	public int anInt4728 = 128;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
	public int anInt4726;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V")
	public Class180(@OriginalArg(0) int arg0) {
		this.anInt4726 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIIII)V")
	private Class180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4723 = arg4;
		this.anInt4724 = arg3;
		this.anInt4722 = arg5;
		this.anInt4726 = arg0;
		this.anInt4721 = arg2;
		this.anInt4728 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)Lclient!jk;")
	public Class180 method4265() {
		return new Class180(this.anInt4726, this.anInt4728, this.anInt4721, this.anInt4724, this.anInt4723, this.anInt4722);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!jk;)V")
	public void method4266(@OriginalArg(1) Class180 arg0) {
		this.anInt4721 = arg0.anInt4721;
		this.anInt4724 = arg0.anInt4724;
		this.anInt4728 = arg0.anInt4728;
		this.anInt4722 = arg0.anInt4722;
		this.anInt4723 = arg0.anInt4723;
		this.anInt4726 = arg0.anInt4726;
	}
}
