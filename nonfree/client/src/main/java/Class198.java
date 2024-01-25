import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class198 {

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
	public int anInt6034 = 64;

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
	public int anInt6036 = 1;

	@OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
	public int anInt6037 = 2;

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
	public int anInt6035 = -1;

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "Z")
	public boolean aBoolean514 = false;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "Z")
	public boolean aBoolean513 = false;

	@OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
	public int anInt6039 = 64;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!fd;II)V")
	public void method4994(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(7) int local7 = arg0.method6538();
			if (local7 == 0) {
				return;
			}
			this.method4997(arg1, local7, arg0);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BIILclient!fd;)V")
	private void method4997(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub7 arg2) {
		if (arg1 == 1) {
			this.anInt6035 = arg2.method6535();
			if (this.anInt6035 == 65535) {
				this.anInt6035 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt6034 = arg2.method6535() + 1;
			this.anInt6039 = arg2.method6535() + 1;
		} else if (arg1 == 3) {
			arg2.method6529();
		} else if (arg1 == 4) {
			this.anInt6037 = arg2.method6538();
		} else if (arg1 == 5) {
			this.anInt6036 = arg2.method6538();
			return;
		} else if (arg1 == 6) {
			this.aBoolean513 = true;
			return;
		} else if (arg1 == 7) {
			this.aBoolean514 = true;
			return;
		}
	}
}
