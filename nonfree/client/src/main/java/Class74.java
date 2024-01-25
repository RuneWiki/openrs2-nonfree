import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class74 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	private int anInt2054;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!eo;")
	public Class67 aClass67_1;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public int anInt2057;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public int anInt2061;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!vt;)V")
	public void method1641(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5732();
			if (local9 == 0) {
				return;
			}
			this.method1642(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBLclient!vt;)V")
	private void method1642(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 1) {
			this.anInt2054 = arg1.method5753();
		} else if (arg0 == 2) {
			this.anInt2057 = arg1.method5732();
			this.anInt2061 = arg1.method5732();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Lclient!km;")
	public synchronized Class128 method1643() {
		@Pc(13) Class128 local13 = (Class128) this.aClass67_1.aClass41_21.method823((long) this.anInt2054);
		if (local13 != null) {
			return local13;
		}
		local13 = Static399.method3370(this.aClass67_1.aClass83_39, this.anInt2054, 0);
		if (local13 != null) {
			this.aClass67_1.aClass41_21.method832((long) this.anInt2054, local13);
		}
		return local13;
	}
}
