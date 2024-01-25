import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class111 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public int anInt2694;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	public int anInt2698;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	private int anInt2701;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!dm;")
	public Class52 aClass52_1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!dh;)V")
	private void method2241(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt2701 = arg1.method4485();
		} else if (arg0 == 2) {
			this.anInt2698 = arg1.method4463();
			this.anInt2694 = arg1.method4463();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Lclient!gu;")
	public synchronized Class100 method2244() {
		@Pc(13) Class100 local13 = (Class100) this.aClass52_1.aClass167_21.method3386((long) this.anInt2701);
		if (local13 != null) {
			return local13;
		}
		local13 = Static458.method1922(this.aClass52_1.aClass113_25, this.anInt2701, 0);
		if (local13 != null) {
			this.aClass52_1.aClass167_21.method3392(local13, (long) this.anInt2701);
		}
		return local13;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!dh;I)V")
	public void method2247(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4463();
			if (local5 == 0) {
				return;
			}
			this.method2241(local5, arg0);
		}
	}
}
