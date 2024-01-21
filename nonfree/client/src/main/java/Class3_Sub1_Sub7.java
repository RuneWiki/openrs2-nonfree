import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!fd", name = "cb", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!fd", name = "eb", descriptor = "I")
	public int anInt1075;

	@OriginalMember(owner = "client!fd", name = "gb", descriptor = "I")
	public int anInt1077;

	@OriginalMember(owner = "client!fd", name = "hb", descriptor = "[Lclient!he;")
	public Class26[] aClass26Array8;

	@OriginalMember(owner = "client!fd", name = "lb", descriptor = "I")
	public int anInt1079;

	@OriginalMember(owner = "client!fd", name = "fb", descriptor = "I")
	public int anInt1076 = 0;

	@OriginalMember(owner = "client!fd", name = "ib", descriptor = "Lclient!he;")
	public Class26 aClass26_542 = Static65.aClass26_962;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!m;)V")
	private void method648(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1075 = arg1.method981();
		} else if (arg0 == 2) {
			this.anInt1077 = arg1.method981();
		} else if (arg0 == 3) {
			this.aClass26_542 = arg1.method977();
		} else if (arg0 == 4) {
			this.anInt1079 = arg1.method984();
		} else {
			@Pc(44) int local44;
			if (arg0 == 5) {
				this.anInt1076 = arg1.method974();
				this.anIntArray112 = new int[this.anInt1076];
				this.aClass26Array8 = new Class26[this.anInt1076];
				for (local44 = 0; local44 < this.anInt1076; local44++) {
					this.anIntArray112[local44] = arg1.method984();
					this.aClass26Array8[local44] = arg1.method977();
				}
			} else if (arg0 == 6) {
				this.anInt1076 = arg1.method974();
				this.anIntArray112 = new int[this.anInt1076];
				this.anIntArray113 = new int[this.anInt1076];
				for (local44 = 0; local44 < this.anInt1076; local44++) {
					this.anIntArray112[local44] = arg1.method984();
					this.anIntArray113[local44] = arg1.method984();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!m;Z)V")
	public void method650(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method981();
			if (local9 == 0) {
				return;
			}
			this.method648(local9, arg0);
		}
	}
}
