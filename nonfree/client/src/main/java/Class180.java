import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public final class Class180 {

	@OriginalMember(owner = "client!jia", name = "e", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Lclient!wia;)V")
	public Class180(@OriginalArg(0) Class386 arg0) {
		@Pc(6) byte[] local6 = arg0.method9192(6);
		this.method4034(new Class14_Sub29(local6));
		if (this.anIntArray390 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "()V")
	private Class180() {
		this.anIntArray390 = new int[0];
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILclient!so;)V")
	private void method4034(@OriginalArg(1) Class14_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5866();
			if (local5 == 0) {
				return;
			}
			if (local5 == 1) {
				@Pc(18) int local18 = arg0.method5866();
				this.anIntArray390 = new int[local18];
				for (@Pc(24) int local24 = 0; local24 < this.anIntArray390.length; local24++) {
					this.anIntArray390[local24] = arg0.method5866();
				}
			}
		}
	}
}
