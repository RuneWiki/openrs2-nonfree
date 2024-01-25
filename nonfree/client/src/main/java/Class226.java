import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class226 {

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "[I")
	public static final int[] anIntArray614 = new int[16384];

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
	public static final int[] anIntArray613 = new int[16384];

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	public int anInt5693 = 1;

	static {
		@Pc(17) double local17 = 3.834951969714103E-4D;
		for (@Pc(19) int local19 = 0; local19 < 16384; local19++) {
			anIntArray614[local19] = (int) (Math.sin((double) local19 * local17) * 32768.0D);
			anIntArray613[local19] = (int) (Math.cos((double) local19 * local17) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILclient!rp;)V")
	private void method5118(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static240.method4859(arg1.method2753());
		} else if (arg0 == 2) {
			this.anInt5693 = 0;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!rp;I)V")
	public void method5119(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2739();
			if (local14 == 0) {
				return;
			}
			this.method5118(local14, arg0);
		}
	}
}
