import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class176 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public int anInt4994;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public int anInt4995;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	public int anInt4998;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
	public int anInt5000;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	public int anInt5004;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
	public int anInt5006;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
	public int anInt5007;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public int anInt5005 = 128;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	public int anInt4999 = 128;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public int anInt4997;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V")
	public Class176(@OriginalArg(0) int arg0) {
		this.anInt4997 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIII)V")
	private Class176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4999 = arg1;
		this.anInt4994 = arg5;
		this.anInt5006 = arg4;
		this.anInt5004 = arg3;
		this.anInt4997 = arg0;
		this.anInt5005 = arg2;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!oa;Z)V")
	public void method4200(@OriginalArg(0) Class176 arg0) {
		this.anInt5004 = arg0.anInt5004;
		this.anInt4999 = arg0.anInt4999;
		this.anInt5005 = arg0.anInt5005;
		this.anInt4994 = arg0.anInt4994;
		this.anInt5006 = arg0.anInt5006;
		this.anInt4997 = arg0.anInt4997;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)Lclient!oa;")
	public Class176 method4201() {
		return new Class176(this.anInt4997, this.anInt4999, this.anInt5005, this.anInt5004, this.anInt5006, this.anInt4994);
	}
}
