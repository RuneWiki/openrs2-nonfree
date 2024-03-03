import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class220 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_227 = new Class145(28, 3);

	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	public static int anInt6194 = 0;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	public int anInt6188;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	private int anInt6189;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!mi;")
	public Class150 aClass150_4;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "I")
	public int anInt6191;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Lclient!dk;", line = 7)
	public synchronized Class48 method5659() {
		@Pc(13) Class48 local13 = (Class48) this.aClass150_4.aClass98_33.method2614((long) this.anInt6189);
		if (local13 != null) {
			return local13;
		}
		local13 = Static372.method1684(this.aClass150_4.aClass197_56, this.anInt6189, 0);
		if (local13 != null) {
			this.aClass150_4.aClass98_33.method2626((long) this.anInt6189, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!bt;I)V", line = 103)
	public void method5662(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4816();
			if (local5 == 0) {
				return;
			}
			this.method5664(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!bt;I)V", line = 145)
	private void method5664(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6189 = arg0.method4830();
		} else if (arg1 == 2) {
			this.anInt6191 = arg0.method4816();
			this.anInt6188 = arg0.method4816();
		}
	}
}
