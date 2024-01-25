import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class264 implements Interface8 {

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "Lclient!oa;")
	private Class9 aClass9_11;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Z")
	private boolean aBoolean577;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Lclient!iu;")
	private final Class159 aClass159_1;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "[Lclient!wu;")
	private final Interface23[] anInterface23Array1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!iu;Lclient!ci;)V")
	public Class264(@OriginalArg(0) Class159 arg0, @OriginalArg(1) Class55 arg1) {
		this.aClass159_1 = arg0;
		this.anInterface23Array1 = new Interface23[this.aClass159_1.anInterface12Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface23Array1.length; local15++) {
			this.anInterface23Array1[local15] = arg1.method1371(this.aClass159_1.anInterface12Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	@Override
	public void method6512() {
		if (Static323.aClass9_8 != this.aClass9_11) {
			this.aClass9_11 = Static323.aClass9_8;
			this.aBoolean577 = true;
		}
		this.aClass9_11.D(0);
		@Pc(28) Interface23[] local28 = this.anInterface23Array1;
		for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
			@Pc(36) Interface23 local36 = local28[local30];
			if (local36 != null) {
				local36.method8048();
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	@Override
	public void method6514() {
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
	@Override
	public int method6515() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface23[] local10 = this.anInterface23Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(24) Interface23 local24 = local10[local12];
			if (local24 == null || local24.method8049()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface23Array1.length;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6516(@OriginalArg(1) boolean arg0) {
		@Pc(14) Interface23[] local14 = this.anInterface23Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Interface23 local22 = local14[local16];
			if (local22 != null) {
				local22.method8047();
			}
		}
		this.aBoolean577 = false;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6513() {
		return Static258.anInt5219 >= this.aClass159_1.anInt4804;
	}
}
