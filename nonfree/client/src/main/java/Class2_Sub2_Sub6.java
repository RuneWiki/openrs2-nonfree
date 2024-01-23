import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "Lclient!ob;")
	private Class70 aClass70_2;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
	public int anInt1287;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
	private int anInt1290;

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
	public int anInt1293;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "Lclient!i;")
	private Class41 aClass41_372 = Static81.aClass41_621;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLclient!ea;)V")
	public void method897(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method209();
			if (local13 == 0) {
				return;
			}
			this.method906(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I")
	public int method898(@OriginalArg(1) int arg0) {
		if (this.aClass70_2 == null) {
			return this.anInt1290;
		} else {
			@Pc(22) Class2_Sub23 local22 = (Class2_Sub23) this.aClass70_2.method2205((long) arg0);
			return local22 == null ? this.anInt1290 : local22.anInt3983;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Lclient!i;")
	public Class41 method902(@OriginalArg(0) int arg0) {
		if (this.aClass70_2 == null) {
			return this.aClass41_372;
		} else {
			@Pc(22) Class2_Sub26 local22 = (Class2_Sub26) this.aClass70_2.method2205((long) arg0);
			return local22 == null ? this.aClass41_372 : local22.aClass41_1152;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBLclient!ea;)V")
	private void method906(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt1287 = arg1.method209();
		} else if (arg0 == 2) {
			this.anInt1293 = arg1.method209();
		} else if (arg0 == 3) {
			this.aClass41_372 = arg1.method160();
		} else if (arg0 == 4) {
			this.anInt1290 = arg1.method185();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(50) int local50 = arg1.method163();
			this.aClass70_2 = new Class70(Static163.method2657(local50));
			for (@Pc(60) int local60 = 0; local60 < local50; local60++) {
				@Pc(66) int local66 = arg1.method185();
				@Pc(76) Class2 local76;
				if (arg0 == 5) {
					local76 = new Class2_Sub26(arg1.method160());
				} else {
					local76 = new Class2_Sub23(arg1.method185());
				}
				this.aClass70_2.method2208((long) local66, local76);
			}
		}
	}
}
