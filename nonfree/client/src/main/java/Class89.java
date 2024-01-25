import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public final class Class89 {

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
	public int anInt2741;

	@OriginalMember(owner = "client!efa", name = "i", descriptor = "Lclient!q;")
	public Class134 aClass134_3;

	@OriginalMember(owner = "client!efa", name = "k", descriptor = "I")
	public int anInt2744;

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "Lclient!efa;")
	public Class89 aClass89_1;

	@OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
	public int anInt2748;

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
	public final int anInt2743;

	@OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
	public final int anInt2746;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(II)V")
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2743 = arg0;
		this.anInt2746 = arg1;
	}

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lclient!efa;I)V")
	public Class89(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		this.aClass89_1 = arg0;
		this.aClass134_3 = this.aClass89_1.aClass134_3;
		this.anInt2746 = this.aClass89_1.anInt2746 + arg1;
		this.anInt2743 = this.aClass89_1.anInt2743;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(Z)Lclient!iv;")
	public Class167 method2424() {
		return Static343.method5092(this.anInt2743);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)Lclient!efa;")
	public Class89 method2425(@OriginalArg(0) int arg0) {
		return new Class89(this.anInt2743, arg0);
	}
}
