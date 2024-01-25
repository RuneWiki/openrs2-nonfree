import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class98 {

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
	public int anInt2137;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
	private int anInt2138;

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
	public int anInt2139;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "Lclient!fl;")
	public Class110 aClass110_2;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method1768(@OriginalArg(0) Class2_Sub7 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4464();
			if (local11 == 0) {
				return;
			}
			this.method1769(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method1769(@OriginalArg(1) Class2_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2138 = arg0.method4518();
		} else if (arg1 == 2) {
			this.anInt2139 = arg0.method4464();
			this.anInt2137 = arg0.method4464();
		}
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)Lclient!ut;")
	public synchronized Class344 method1771() {
		@Pc(13) Class344 local13 = (Class344) this.aClass110_2.aClass21_22.method324((long) this.anInt2138);
		if (local13 != null) {
			return local13;
		}
		local13 = Static603.method7117(this.aClass110_2.aClass229_29, this.anInt2138, 0);
		if (local13 != null) {
			this.aClass110_2.aClass21_22.method317(local13, (long) this.anInt2138);
		}
		return local13;
	}
}
