import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class18_Sub3 extends Class18 {

	@OriginalMember(owner = "client!ifa", name = "s", descriptor = "F")
	private float aFloat95 = 0.0F;

	@OriginalMember(owner = "client!ifa", name = "u", descriptor = "Lclient!jga;")
	private final Class179 aClass179_4;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!gd;Lclient!jga;)V")
	public Class18_Sub3(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) Class179 arg1) {
		super(arg0);
		this.aClass179_4 = arg1;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!sfa;I)V")
	@Override
	public void method9006(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
		super.aClass65_Sub2_23.method4426(arg1);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9000() {
		return this.aClass179_4.method4541();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9011(@OriginalArg(1) boolean arg0) {
		super.aClass65_Sub2_23.method4358(1);
		super.aClass65_Sub2_23.method4432(Static654.aClass178_5, Static138.aClass178_2);
		super.aClass65_Sub2_23.method4388(0, Static536.aClass64_4, true, false);
		super.aClass65_Sub2_23.method4369(0, Static169.aClass64_1);
		super.aClass65_Sub2_23.method4382(0);
		super.aClass65_Sub2_23.method4358(0);
		super.aClass65_Sub2_23.method4455(-16777216);
		super.aClass65_Sub2_23.method4369(0, Static413.aClass64_3);
		this.method9002();
	}

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "(B)V")
	@Override
	public void method9002() {
		if (super.aClass65_Sub2_23.method4396() != 0) {
			return;
		}
		@Pc(16) Class254_Sub2 local16 = super.aClass65_Sub2_23.method4429();
		super.aClass65_Sub2_23.method4358(1);
		@Pc(26) Class254_Sub2 local26 = super.aClass65_Sub2_23.method4439();
		local26.method7356(local16);
		local26.method6240(0.125F, 1.0F, 0.125F);
		local26.method6243(this.aFloat95, 0.0F, 0.0F);
		super.aClass65_Sub2_23.method4411(Static581.aClass198_5);
		super.aClass65_Sub2_23.method4358(0);
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)V")
	@Override
	public void method9003() {
		super.aClass65_Sub2_23.method4358(1);
		super.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static606.aClass178_4);
		super.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
		super.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
		super.aClass65_Sub2_23.method4382(1);
		super.aClass65_Sub2_23.method4426((Interface25) null);
		super.aClass65_Sub2_23.method4358(0);
		super.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9009(@OriginalArg(0) boolean arg0) {
		super.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static138.aClass178_2);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BII)V")
	@Override
	public void method9012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass65_Sub2_23.method4358(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass65_Sub2_23.method4426((Interface25) null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass179_4.aBoolean463) {
				this.aFloat95 = (float) (super.aClass65_Sub2_23.anInt5266 % 4000) / 4000.0F;
				super.aClass65_Sub2_23.method4426(this.aClass179_4.anInterface10_1);
			} else {
				@Pc(36) int local36 = super.aClass65_Sub2_23.anInt5266 % 4000 * 16 / 4000;
				super.aClass65_Sub2_23.method4426(this.aClass179_4.anInterface27Array1[local36]);
			}
		} else if (this.aClass179_4.aBoolean463) {
			super.aClass65_Sub2_23.method4426(this.aClass179_4.anInterface10_1);
		} else {
			super.aClass65_Sub2_23.method4426(this.aClass179_4.anInterface27Array1[0]);
		}
		super.aClass65_Sub2_23.method4358(0);
	}
}
