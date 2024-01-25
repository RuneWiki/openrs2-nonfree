import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class156 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
	public int anInt4160;

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "Lclient!pda;")
	public Class51 aClass51_4;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
	public int anInt4165;

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
	public int anInt4166;

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "Lclient!hv;")
	public Class156 aClass156_1;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
	public final int anInt4163;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
	public final int anInt4161;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(II)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4163 = arg1;
		this.anInt4161 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)Lclient!hv;")
	public Class156 method3620(@OriginalArg(0) int arg0) {
		return new Class156(this.anInt4161, arg0);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)Lclient!kt;")
	public Class206 method3622() {
		return Static456.method6482(this.anInt4161);
	}
}
