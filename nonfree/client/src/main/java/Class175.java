import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class175 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	public int anInt4951;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "I")
	public int anInt4952;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "I")
	public int anInt4954;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "I")
	public int anInt4953 = 128;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "I")
	public int anInt4955 = 128;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	public int anInt4950;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V")
	public Class175(@OriginalArg(0) int arg0) {
		this.anInt4950 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIII)V")
	private Class175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4953 = arg1;
		this.anInt4950 = arg0;
		this.anInt4955 = arg2;
		this.anInt4954 = arg3;
		this.anInt4951 = arg4;
		this.anInt4952 = arg5;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lclient!od;")
	public Class175 method4022() {
		return new Class175(this.anInt4950, this.anInt4953, this.anInt4955, this.anInt4954, this.anInt4951, this.anInt4952);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!od;I)V")
	public void method4024(@OriginalArg(0) Class175 arg0) {
		this.anInt4955 = arg0.anInt4955;
		this.anInt4950 = arg0.anInt4950;
		this.anInt4951 = arg0.anInt4951;
		this.anInt4953 = arg0.anInt4953;
		this.anInt4954 = arg0.anInt4954;
		this.anInt4952 = arg0.anInt4952;
	}
}
