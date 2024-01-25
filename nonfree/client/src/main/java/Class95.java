import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class95 {

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
	public int anInt3018;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
	public int anInt3022;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
	private int anInt3025;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!at;BI)V")
	private void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3025 = arg1.method2161();
		} else if (arg2 == 2) {
			this.anInt3022 = arg1.method2132();
			this.anInt3018 = arg1.method2132();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)Lclient!tr;")
	public Class201 method2822() {
		@Pc(11) Class201 local11 = (Class201) Static239.aClass21_128.method854((long) this.anInt3025);
		if (local11 != null) {
			return local11;
		}
		local11 = Static382.method5432(Static30.aClass30_6, this.anInt3025, 0);
		if (local11 != null) {
			Static239.aClass21_128.method843(local11, (long) this.anInt3025);
		}
		return local11;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!at;I)V")
	public void method2824(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method2132();
			if (local5 == 0) {
				return;
			}
			this.method2821(arg0, arg1, local5);
		}
	}
}
