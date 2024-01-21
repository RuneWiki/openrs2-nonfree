import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
	public int anInt198;

	@OriginalMember(owner = "client!ag", name = "G", descriptor = "Lclient!nc;")
	private Class63 aClass63_1;

	@OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
	public int anInt199;

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "Lclient!qe;")
	private Class83 aClass83_50 = Static57.aClass83_455;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)I")
	public int method120(@OriginalArg(0) int arg0) {
		if (this.aClass63_1 == null) {
			return this.anInt200;
		} else {
			@Pc(25) Class2_Sub10 local25 = (Class2_Sub10) this.aClass63_1.method2110((long) arg0);
			return local25 == null ? this.anInt200 : local25.anInt974;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBLclient!ra;)V")
	private void method121(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt199 = arg1.method260();
		} else if (arg0 == 2) {
			this.anInt198 = arg1.method260();
		} else if (arg0 == 3) {
			this.aClass83_50 = arg1.method259();
		} else if (arg0 == 4) {
			this.anInt200 = arg1.method248();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(48) int local48 = arg1.method269();
			this.aClass63_1 = new Class63(Static108.method1872(local48));
			for (@Pc(60) int local60 = 0; local60 < local48; local60++) {
				@Pc(66) int local66 = arg1.method248();
				@Pc(76) Class2 local76;
				if (arg0 == 5) {
					local76 = new Class2_Sub16(arg1.method259());
				} else {
					local76 = new Class2_Sub10(arg1.method248());
				}
				this.aClass63_1.method2115((long) local66, local76);
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!ra;)V")
	public void method122(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method260();
			if (local13 == 0) {
				return;
			}
			this.method121(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)Lclient!qe;")
	public Class83 method125(@OriginalArg(0) int arg0) {
		if (this.aClass63_1 == null) {
			return this.aClass83_50;
		} else {
			@Pc(17) Class2_Sub16 local17 = (Class2_Sub16) this.aClass63_1.method2110((long) arg0);
			return local17 == null ? this.aClass83_50 : local17.aClass83_709;
		}
	}
}
