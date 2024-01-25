import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fma")
public abstract class Class93 implements Interface10 {

	@OriginalMember(owner = "client!fma", name = "j", descriptor = "J")
	private long aLong350;

	@OriginalMember(owner = "client!fma", name = "l", descriptor = "I")
	private int anInt10961;

	@OriginalMember(owner = "client!fma", name = "p", descriptor = "Lclient!da;")
	private Class68 aClass68_14;

	@OriginalMember(owner = "client!fma", name = "d", descriptor = "Lclient!nca;")
	protected final Class254 aClass254_171;

	@OriginalMember(owner = "client!fma", name = "n", descriptor = "Lclient!nca;")
	private final Class254 aClass254_172;

	@OriginalMember(owner = "client!fma", name = "f", descriptor = "Lclient!nc;")
	protected final Class33 aClass33_5;

	@OriginalMember(owner = "client!fma", name = "<init>", descriptor = "(Lclient!nca;Lclient!nca;Lclient!nc;)V")
	protected Class93(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class33 arg2) {
		this.aClass254_171 = arg0;
		this.aClass254_172 = arg1;
		this.aClass33_5 = arg2;
	}

	@OriginalMember(owner = "client!fma", name = "b", descriptor = "(I)I")
	protected final int method9563() {
		@Pc(15) int local15 = Static591.aClass337_3.method8102();
		@Pc(19) int local19 = local15 * 100;
		if (this.anInt10961 == local15 && local15 != 0) {
			@Pc(35) int local35 = Static591.aClass337_3.method8095();
			if (local15 < local35) {
				@Pc(45) long local45 = this.aLong350 - Static591.aClass337_3.method8097();
				if (local45 > 0L) {
					@Pc(64) long local64 = local45 * 10000L / (long) local15 * (long) (local35 - local15);
					@Pc(73) long local73 = (Static567.method7863() - this.aLong350) * 10000L;
					if (local64 > local73) {
						local19 = (int) ((long) (local35 - local15) * local73 * 100L / local64 + (long) (local15 * 100));
					} else {
						local19 = local35 * 100;
					}
				}
			}
		} else {
			this.anInt10961 = local15;
			this.aLong350 = Static567.method7863();
		}
		return local19;
	}

	@OriginalMember(owner = "client!fma", name = "a", descriptor = "(B)V")
	@Override
	public void method9561() {
		@Pc(21) Class289 local21 = Static597.method8191(this.aClass254_172, this.aClass33_5.anInt7250);
		this.aClass68_14 = Static396.aClass145_6.method9707(local21, Static737.method8361(this.aClass254_171, this.aClass33_5.anInt7250), true);
	}

	@OriginalMember(owner = "client!fma", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9562() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass254_171.method6072(this.aClass33_5.anInt7250)) {
			local11 = false;
		}
		if (!this.aClass254_172.method6072(this.aClass33_5.anInt7250)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!fma", name = "a", descriptor = "(IZII)V")
	protected abstract void method9565(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!fma", name = "a", descriptor = "(ZB)V")
	@Override
	public final void method9560() {
		@Pc(26) int local26 = this.aClass33_5.aClass18_12.method282(Static33.anInt443, this.aClass33_5.anInt7246) + this.aClass33_5.anInt7247;
		@Pc(41) int local41 = this.aClass33_5.aClass239_13.method5836(Static277.anInt4340, this.aClass33_5.anInt7251) + this.aClass33_5.anInt7249;
		this.method9565(local41, local26);
		this.method9568(local26, local41);
		@Pc(57) String local57 = Static591.aClass337_3.method8101();
		if (Static567.method7863() - this.aLong350 > 10000L) {
			local57 = local57 + " (" + Static591.aClass337_3.method8099().method9624() + ")";
		}
		this.aClass68_14.method7888(local57, this.aClass33_5.anInt7246 / 2 + local26, -1, this.aClass33_5.anInt7252 + 4 + (local41 - -(this.aClass33_5.anInt7251 / 2)), this.aClass33_5.anInt7245);
	}

	@OriginalMember(owner = "client!fma", name = "b", descriptor = "(IZII)V")
	protected abstract void method9568(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);
}
