import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class2_Sub3_Sub9 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ru", name = "L", descriptor = "[Lclient!uo;")
	private static final Class361[] aClass361Array1 = new Class361[32];

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
	private int anInt9293;

	@OriginalMember(owner = "client!ru", name = "v", descriptor = "J")
	private long aLong256;

	static {
		@Pc(96) Class361[] local96 = Static600.method9008();
		for (@Pc(98) int local98 = 0; local98 < local96.length; local98++) {
			aClass361Array1[local96[local98].anInt10749] = local96[local98];
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.method6010(this.aLong256, this.anInt9293);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		this.anInt9293 = arg0.method5172();
		this.aLong256 = arg0.method5213();
	}
}
