import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class163 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public int anInt4722;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
	public int anInt4723;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	public int anInt4726;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	public int anInt4727;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	public int anInt4728;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	public int anInt4734;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
	public int anInt4735;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public int anInt4724 = 128;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public int anInt4733 = 128;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public int anInt4729;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V")
	public Class163(@OriginalArg(0) int arg0) {
		this.anInt4729 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIII)V")
	private Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4735 = arg3;
		this.anInt4724 = arg2;
		this.anInt4727 = arg5;
		this.anInt4733 = arg1;
		this.anInt4729 = arg0;
		this.anInt4726 = arg4;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Lclient!kf;")
	public Class163 method4351() {
		return new Class163(this.anInt4729, this.anInt4733, this.anInt4724, this.anInt4735, this.anInt4726, this.anInt4727);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!kf;)V")
	public void method4355(@OriginalArg(1) Class163 arg0) {
		this.anInt4724 = arg0.anInt4724;
		this.anInt4729 = arg0.anInt4729;
		this.anInt4726 = arg0.anInt4726;
		this.anInt4727 = arg0.anInt4727;
		this.anInt4735 = arg0.anInt4735;
		this.anInt4733 = arg0.anInt4733;
	}
}
