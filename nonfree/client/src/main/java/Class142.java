import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class142 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	public int anInt4251;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!mv;")
	public Class219 aClass219_2;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	private int anInt4253;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	public int anInt4257;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBLclient!qh;)V")
	private void method3766(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt4253 = arg1.method3109();
		} else if (arg0 == 2) {
			this.anInt4251 = arg1.method3118();
			this.anInt4257 = arg1.method3118();
			return;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Lclient!vw;")
	public synchronized Class355 method3767() {
		@Pc(13) Class355 local13 = (Class355) this.aClass219_2.aClass10_36.method250((long) this.anInt4253);
		if (local13 != null) {
			return local13;
		}
		local13 = Static606.method7590(this.aClass219_2.aClass246_170, this.anInt4253, 0);
		if (local13 != null) {
			this.aClass219_2.aClass10_36.method254(local13, (long) this.anInt4253);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!qh;B)V")
	public void method3768(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3118();
			if (local11 == 0) {
				return;
			}
			this.method3766(local11, arg0);
		}
	}
}
